/*
 * Copyright 2012 Michael Roberts
 * All rights reserved.
 *
 *
 * This file is part of xutil.
 *
 * xutil is free software: you can redistribute it and/or modify it 
 * under the terms of the GNU Lesser General Public License as published by the 
 * Free Software Foundation, either version 3 of the License, or (at your 
 * option) any later version.
 *
 * xutil is distributed in the hope that it will be useful, but 
 * WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY 
 * or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU Lesser General Public 
 * License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License 
 * along with xutil.  If not, see <http://www.gnu.org/licenses/>.
 *
 */
package com.xtructure.xutil.opt;

/**
 * IntegerXOption is an {@link XOption} for {@link Integer} data.
 * 
 * @author Luis Guimbarda
 * 
 */
public class IntegerXOption extends XOption<Integer> {
	/**
	 * Creates a new {@link IntegerXOption}
	 * 
	 * @param name
	 * @param opt
	 * @param longOpt
	 * @param description
	 */
	public IntegerXOption(String name, String opt, String longOpt, String description) {
		super(name, opt, longOpt, true, description);
	}

	/** {@inheritDoc} */
	@Override
	public Integer processValue() {
		return Integer.parseInt(getValue());
	}
}
