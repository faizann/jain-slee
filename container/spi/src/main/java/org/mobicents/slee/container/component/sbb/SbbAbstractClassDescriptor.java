/*
 * JBoss, Home of Professional Open Source
 * Copyright 2011, Red Hat, Inc. and individual contributors
 * by the @authors tag. See the copyright.txt in the distribution for a
 * full listing of individual contributors.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */

/**
 * 
 */
package org.mobicents.slee.container.component.sbb;

import java.util.List;
import java.util.Map;

/**
 * @author martins
 * 
 */
public interface SbbAbstractClassDescriptor {

	/**
	 * Retrieves the Map between child relation method names and
	 * {@link MGetChildRelationMethod}s
	 * 
	 * @return
	 */
	public Map<String, GetChildRelationMethodDescriptor> getChildRelationMethods();

	/**
	 * 
	 * @return
	 */
	public List<CMPFieldDescriptor> getCmpFields();

	/**
	 * Retrieves the map between profile CMP method names and
	 * {@link MGetProfileCMPMethod}s
	 * 
	 * @return
	 */
	public Map<String, GetProfileCMPMethodDescriptor> getProfileCMPMethods();

	/**
	 * 
	 * @return
	 */
	public String getSbbAbstractClassName();

	/**
	 * 
	 * @return
	 */
	public boolean isReentrant();
}
