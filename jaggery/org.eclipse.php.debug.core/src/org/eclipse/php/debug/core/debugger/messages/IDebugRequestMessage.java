/*******************************************************************************
 * Copyright (c) 2009 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *     Zend Technologies
 *******************************************************************************/
package org.eclipse.php.debug.core.debugger.messages;

public interface IDebugRequestMessage extends IDebugMessage {

	/**
	 * Set the request id.
	 */
	public void setID(int id);

	/**
	 * Return the request id.
	 */
	public int getID();
}
