package it.unibz.krdb.obda.model.impl;

import it.unibz.krdb.obda.model.Function;
import it.unibz.krdb.obda.model.NewLiteral;
import it.unibz.krdb.obda.model.Predicate;
import it.unibz.krdb.obda.model.Variable;
import it.unibz.krdb.obda.utils.EventGeneratingLinkedList;
import it.unibz.krdb.obda.utils.ListListener;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class FunctionalTermImpl implements Function, ListListener {

	/**
	 * 
	 */
	protected static final long serialVersionUID = 2832481815465364535L;
	protected Predicate functor = null;
	protected List<NewLiteral> terms = null;
	protected int identifier = -1;

	// true when the list of terms has been modified
	protected boolean rehash = true;

	// null when the list of terms has been modified
	protected String string = null;

	/**
	 * The default constructor.
	 * 
	 * @param functor
	 *            the function symbol name. It is defined the same as a
	 *            predicate.
	 * @param terms
	 *            the list of arguments.
	 */
	protected FunctionalTermImpl(Predicate functor, List<NewLiteral> terms) {
		this.functor = functor;

		EventGeneratingLinkedList<NewLiteral> eventlist = new EventGeneratingLinkedList<NewLiteral>();
		eventlist.addAll(terms);

		this.terms = eventlist;

		eventlist.addListener(this);
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null || !(obj instanceof FunctionalTermImpl))
			return false;

		FunctionalTermImpl functor2 = (FunctionalTermImpl) obj;
		return this.hashCode() == functor2.hashCode();
	}

	@Override
	public int hashCode() {
		if (rehash) {
			identifier = toString().hashCode();
			rehash = false;
		}
		return identifier;
	}

	
	
	@Override
	public void setPredicate(Predicate predicate) {
		this.functor = predicate;
		listChanged();
	}

	@Override
	public Set<Variable> getVariables() {
		HashSet<Variable> variables = new LinkedHashSet<Variable>();
		for (NewLiteral t : terms) {
			for (Variable v : t.getReferencedVariables())
				variables.add(v);
		}
		return variables;
	}
	
	@Override
	public Predicate getPredicate() {
		return getFunctionSymbol();
	}
	
	@Override
	public Predicate getFunctionSymbol() {
		return functor;
	}

	@Override
	public List<NewLiteral> getTerms() {
		return terms;
	}

	@Override
	public int getArity() {
		return getTerms().size();
	}

	@Override
	public FunctionalTermImpl clone() {
		List<NewLiteral> copyTerms = new ArrayList<NewLiteral>(terms.size() + 10);
		Iterator<NewLiteral> it = terms.iterator();
		while (it.hasNext()) {
			copyTerms.add(it.next().clone());
		}
		FunctionalTermImpl clone = new FunctionalTermImpl(functor, copyTerms);
		clone.identifier = identifier;
		clone.string = string;
		clone.rehash = rehash;
		return clone;
	}

	@Override
	public String toString() {
		if (string != null && !rehash)
			return string;

		StringBuffer sb_t = new StringBuffer();

		for (int i = 0; i < terms.size(); i++) {
			if (sb_t.length() > 0) {
				sb_t.append(",");
			}
			NewLiteral t = terms.get(i);
			if (t == null)
				System.out.println("Null");
			sb_t.append(t.toString());
		}
		StringBuffer sb_name = new StringBuffer();

		if (functor == OBDAVocabulary.EQ) {
			sb_name.append("EQ");
		} else if (functor == OBDAVocabulary.NEQ) {
			sb_name.append("NEQ");
		} else if (functor == OBDAVocabulary.GT) {
			sb_name.append("GT");
		} else if (functor == OBDAVocabulary.GTE) {
			sb_name.append("GTE");
		} else if (functor == OBDAVocabulary.LT) {
			sb_name.append("LT");
		} else if (functor == OBDAVocabulary.LTE) {
			sb_name.append("LTE");
		} else if (functor == OBDAVocabulary.NOT) {
			sb_name.append("NOT");
		} else if (functor == OBDAVocabulary.AND) {
			sb_name.append("AND");
		} else if (functor == OBDAVocabulary.OR) {
			sb_name.append("OR");
		} else {
			sb_name.append(this.functor.getName());
		}

		sb_name.append("(");
		sb_name.append(sb_t);
		sb_name.append(")");

		string = sb_name.toString();
		return string;
	}

	/**
	 * Check whether the function contains a particular term argument or not.
	 * 
	 * @param t
	 *            the term in question.
	 * @return true if the function contains the term, or false otherwise.
	 */
	public boolean containsTerm(NewLiteral t) {
		for (int i = 0; i < terms.size(); i++) {
			NewLiteral t2 = terms.get(i);
			if (t2.equals(t))
				return true;
		}
		return false;
	}

	@Override
	public int getFirstOcurrance(NewLiteral t, int i) {
		int size = terms.size();
		for (int j = 0; j < size; j++) {
			NewLiteral t2 = terms.get(j);
			if (t2 instanceof FunctionalTermImpl) {
				FunctionalTermImpl f = (FunctionalTermImpl) t2;
				int newindex = f.getFirstOcurrance(t, 0);
				if (newindex != -1)
					return j;
			} else {
				if (t2.equals(t))
					return j;
			}
		}
		return -1;
	}

	@Override
	public void listChanged() {
		rehash = true;
		string = null;
	}

	@Override
	public Set<Variable> getReferencedVariables() {
		Set<Variable> vars = new LinkedHashSet<Variable>();
		for (NewLiteral t : terms) {
			for (Variable v : t.getReferencedVariables())
				vars.add(v);
		}
		return vars;
	}

	@Override
	public Map<Variable, Integer> getVariableCount() {
		Map<Variable, Integer> currentcount = new HashMap<Variable, Integer>();
		for (NewLiteral t : terms) {
			Map<Variable, Integer> atomCount = t.getVariableCount();
			for (Variable var: atomCount.keySet()) {
				Integer count = currentcount.get(var);
				if (count != null) {
					currentcount.put(var, count + atomCount.get(var));
				} else {
					currentcount.put(var, new Integer(atomCount.get(var)));
				}
			}
		}
		return currentcount;		
	}
	


	@Override
	public NewLiteral getTerm(int index) {
		return terms.get(index);
	}

	
	@Override
	public void setTerm(int index, NewLiteral newTerm) {
		listChanged();
		terms.set(index, newTerm);
	}

	
	public void updateTerms(List<NewLiteral> newterms) {

		for (NewLiteral term : terms) {
			if (term instanceof FunctionalTermImpl) {
				FunctionalTermImpl function = (FunctionalTermImpl) term;
				EventGeneratingLinkedList<NewLiteral> innertermlist = (EventGeneratingLinkedList<NewLiteral>) function.getTerms();
				innertermlist.removeListener(this);
			}
		}

		terms.clear();
		terms.addAll(newterms);

		for (NewLiteral term : terms) {
			if (term instanceof FunctionalTermImpl) {
				FunctionalTermImpl function = (FunctionalTermImpl) term;
				EventGeneratingLinkedList<NewLiteral> innertermlist = (EventGeneratingLinkedList<NewLiteral>) function.getTerms();
				innertermlist.addListener(this);
			}
		}
		listChanged();
	}
	
	
}