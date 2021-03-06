/* ========================================================================
 * RemoteJVM : Simply distribute Java applications over several nodes
 * ========================================================================
 *
 * (C) Copyright 2015-2016, Arnaud Roques
 *
 * Project Info:  https://github.com/plantuml/cloudjvm
 * 
 * This file is part of RemoteJVM.
 *
 * RemoteJVM is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * RemoteJVM distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY
 * or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public
 * License for more details.
 *
 * You should have received a copy of the GNU General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301,
 * USA.
 *
 * Original Author:  Arnaud Roques
 *
 */
package com.remotejvm;

import java.io.Serializable;

class MethodResult implements Serializable {

	private final Serializable result;
	private final Exception e;

	private static final long serialVersionUID = 1L;

	public MethodResult(Serializable result, Exception e) {
		this.result = result;
		this.e = e;
	}

	public static MethodResult ok(Serializable result) {
		return new MethodResult(result, null);
	}

	public static MethodResult error(Exception e) {
		return new MethodResult(null, e);
	}

	public Serializable getResult() {
		return result;
	}

	public Exception getException() {
		return e;
	}

}
