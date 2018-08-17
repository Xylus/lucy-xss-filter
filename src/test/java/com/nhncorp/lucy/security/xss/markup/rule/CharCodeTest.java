/*
 *	Copyright 2014 Naver Corp.
 *
 *	Licensed under the Apache License, Version 2.0 (the "License");
 *	you may not use this file except in compliance with the License.
 *	You may obtain a copy of the License at
 *
 *		http://www.apache.org/licenses/LICENSE-2.0
 *
 *	Unless required by applicable law or agreed to in writing, software
 *	distributed under the License is distributed on an "AS IS" BASIS,
 *	WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *	See the License for the specific language governing permissions and
 *	limitations under the License.
 */
package com.nhncorp.lucy.security.xss.markup.rule;

import static org.junit.Assert.*;

import org.junit.Test;

public class CharCodeTest {
	@Test
	public void testNotMatched() {
		CharCode code = new CharCode(' ');
		assertEquals(-1, code.matchPos(new CharArraySegment("123")));
	}

	@Test
	public void testMatched() {
		CharCode code = new CharCode('3');
		assertEquals(2, code.matchPos(new CharArraySegment("123")));
	}
}