/*
 * (C) Copyright 2015 Boni Garcia (http://bonigarcia.github.io/)
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Lesser General Public License
 * (LGPL) version 2.1 which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/lgpl-2.1.html
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 */
package io.github.bonigarcia.wdm.test;

import io.github.bonigarcia.wdm.EdgeDriverManager;

import org.apache.commons.lang3.SystemUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.edge.EdgeDriver;

/**
 * Test with Microsoft Edge.
 *
 * @author Boni Garcia (boni.gg@gmail.com)
 * @since 1.3.0
 */
public class EdgeTest extends ManagerTest {

	@BeforeClass
	public static void setupClass() {
		if (SystemUtils.IS_OS_WINDOWS) {
			EdgeDriverManager.getInstance().setup();
		}
	}

	@Before
	public void setupTest() {
		if (SystemUtils.IS_OS_WINDOWS) {
			driver = new EdgeDriver();
		}
	}

	@After
	public void teardown() {
		if (driver != null) {
			driver.quit();
		}
	}

	@Test
	public void testEdge() {
		if (SystemUtils.IS_OS_WINDOWS) {
			browseWikipedia();
		}
	}

}
