/***
 * Copyright (c) 2008, Mariano Rodriguez-Muro. All rights reserved.
 * 
 * The OBDA-API is licensed under the terms of the Lesser General Public License
 * v.3 (see OBDAAPI_LICENSE.txt for details). The components of this work
 * include:
 * 
 * a) The OBDA-API developed by the author and licensed under the LGPL; and, b)
 * third-party components licensed under terms that may be different from those
 * of the LGPL. Information about such licenses can be found in the file named
 * OBDAAPI_3DPARTY-LICENSES.txt.
 */
package it.unibz.krdb.obda.model.impl;

import it.unibz.krdb.obda.model.OBDADataSource;

import java.net.URI;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;
import java.util.StringTokenizer;

//TODO make this an entity too?
public class DataSourceImpl implements OBDADataSource {
	// private String uri = ""
	private boolean		enabled		= true;
	private boolean		registred	= false;
	private URI			id = null;

	private Properties	parameters	= null;

	/***************************************************************************
	 * Creates a new DataSource object
	 * 
	 * @param uri
	 *            The URI of the data source
	 * @param name
	 *            A generic name for this data source
	 */
	protected DataSourceImpl(URI id) {
		this.id = id;
		parameters = new Properties();
	}


	/* (non-Javadoc)
	 * @see inf.unibz.it.obda.model.DataSource#setParameter(java.lang.String, java.lang.String)
	 */
	@Override
	public void setParameter(String parameter_uri, String value) {
		this.parameters.setProperty(parameter_uri, value);
	}


	/* (non-Javadoc)
	 * @see inf.unibz.it.obda.model.DataSource#getSourceID()
	 */
	@Override
	public URI getSourceID(){
		return id;
	}
	
	/* (non-Javadoc)
	 * @see inf.unibz.it.obda.model.DataSource#setNewID(java.net.URI)
	 */
	@Override
	public void setNewID(URI newid){
		this.id = newid;
	}
	
	/* (non-Javadoc)
	 * @see inf.unibz.it.obda.model.DataSource#getParameter(java.lang.String)
	 */
	@Override
	public String getParameter(String parameter_uri) {
		return parameters.getProperty(parameter_uri);
	}

	/* (non-Javadoc)
	 * @see inf.unibz.it.obda.model.DataSource#getParameters()
	 */
	@Override
	public Set<Object> getParameters() {
		return parameters.keySet();
	}

	public String toString() {
		StringBuffer buff = new StringBuffer();
		buff.append("DatasourceURI=" +  id.toString() + "\n");
		Enumeration<Object> keys = parameters.keys();
		while (keys.hasMoreElements()) {
			String key = (String) keys.nextElement();
			buff.append("\n" + key + "=" + parameters.getProperty(key));
		}
		return buff.toString();
	}

	/***************************************************************************
	 * This method is unsafe and has been deprecated. Use a DatasourceXMLCodec
	 * instead.
	 * 
	 * Builds a DataSource object from a string that encodes a data source. The
	 * format of the string must be the same as the one produced by the
	 * DataSource.toString() method.
	 * 
	 * Format is:
	 * 
	 * DatasourceURI=uri_value\nparameterkey=parametervalue\n . . .
	 * 
	 * where uri_value, parameterkey and parametervalue must be replaced with
	 * the appropiate strings. Do not use characters "\n", "=" or "|" for these
	 * values.
	 * 
	 * @param enc_datasource
	 * @return
	 */
	@Deprecated
	public static DataSourceImpl getFromString(String enc_datasource) {
		StringTokenizer tokenizer = new StringTokenizer(enc_datasource, "\n");

		if (tokenizer.countTokens() < 1)
			throw new IllegalArgumentException("Badly formed string");

		DataSourceImpl new_src = null;

		try {
			String name = tokenizer.nextToken().substring(15);
			URI id = URI.create(name);
			new_src = new DataSourceImpl(id);

			// TODO remove this and modify all my current OBDA FILES
			/***
			 * This if is only done because before, URI and name were used
			 * interchangable. Since now URI stands for the ontology URI we
			 * check if they are the same, if the are, it means its an old file
			 * and the URI is set to the current ontlogy's URI
			 */
//			if (!name.equals(ontouri)) {
//				new_src.setOntoUri(URI.create(ontouri));
//			} else {
//				throw new IllegalArgumentException("ERROR: data source name = URI. Fix the URI value to point to the ontology URI to which this data sources is associated");
////				APIController controller = APIController.getController();
////				URI currentOntologyURI = controller.getCurrentOntologyURI();
////				new_src.setUri(currentOntologyURI.toString());
//			}
			while (tokenizer.hasMoreTokens()) {
				StringTokenizer tok2 = new StringTokenizer(tokenizer.nextToken(), "=");
				new_src.setParameter(tok2.nextToken(), tok2.nextToken());
			}
		} catch (Exception e) {
			throw new IllegalArgumentException("Badly formed data source string", e);
		}
		return new_src;
	}


	public static String encodeDataSources(HashMap<String, DataSourceImpl> datasources) {
		StringBuffer encoded = new StringBuffer();
		if ((datasources == null) || datasources.isEmpty()) {
			return "";
		}

		Iterator<String> keys = datasources.keySet().iterator();

		encoded.append(datasources.get(keys.next()).toString());

		while (keys.hasNext()) {
			encoded.append("|" + datasources.get(keys.next()).toString());
		}
		return encoded.toString();
	}

	public static HashMap<URI, DataSourceImpl> decodeDataSources(String enc_srcs) {
		if ((enc_srcs == null) || (enc_srcs.equals("")))
			return null;
		StringTokenizer tokenizer = new StringTokenizer(enc_srcs, "|");
		HashMap<URI, DataSourceImpl> sources = null;
		if (tokenizer.hasMoreElements()) {
			sources = new HashMap<URI, DataSourceImpl>();
			while (tokenizer.hasMoreElements()) {
				DataSourceImpl newsource = DataSourceImpl.getFromString(tokenizer.nextToken());
				sources.put(newsource.getSourceID(), newsource);
			}
		}
		return sources;
	}

	/* (non-Javadoc)
	 * @see inf.unibz.it.obda.model.DataSource#setEnabled(boolean)
	 */
	@Override
	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	/* (non-Javadoc)
	 * @see inf.unibz.it.obda.model.DataSource#isEnabled()
	 */
	@Override
	public boolean isEnabled() {
		return enabled;
	}

	/* (non-Javadoc)
	 * @see inf.unibz.it.obda.model.DataSource#setRegistred(boolean)
	 */
	@Override
	public void setRegistred(boolean registred) {
		this.registred = registred;
	}

	/* (non-Javadoc)
	 * @see inf.unibz.it.obda.model.DataSource#isRegistred()
	 */
	@Override
	public boolean isRegistred() {
		return registred;
	}
}