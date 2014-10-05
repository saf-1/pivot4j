/*
 * This software is subject to the terms of the Common Public License
 * Agreement, available at the following URL:
 *   http://www.opensource.org/licenses/cpl.html .
 * You must accept the terms of that agreement to use this software.
 * ====================================================================
 */
package org.pivot4j.service.datasource;

import java.util.List;

import org.olap4j.OlapDataSource;

public interface DataSourceManager {

	List<CatalogInfo> getCatalogs();

	/**
	 * @param catalogName
	 * @return
	 */
	List<CubeInfo> getCubes(String catalogName);

	/**
	 * Create an OLAP datasource from the specified connection information. Note
	 * that the returned OlapDataSource should be able to serve multiple
	 * connections, so returning a SingleConnectionDataSource instance would
	 * cause an error for certain operations.
	 * 
	 * @param connectionInfo
	 * @return
	 */
	OlapDataSource getDataSource(ConnectionInfo connectionInfo);
}