/* 
** Copyright [2012-2013] [Megam Systems]
**
** Licensed under the Apache License, Version 2.0 (the "License");
** you may not use this file except in compliance with the License.
** You may obtain a copy of the License at
**
** http://www.apache.org/licenses/LICENSE-2.0
**
** Unless required by applicable law or agreed to in writing, software
** distributed under the License is distributed on an "AS IS" BASIS,
** WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
** See the License for the specific language governing permissions and
** limitations under the License.
*/
package org.megam.chef;

/**
 * @author rajthilak
 *
 */
public class DropIn {
	
	private String idString;
	
	public DropIn(String tempIdString) {
		this.idString = tempIdString;
	}

	public String getId() {
		return idString;
	}
	
	public String toString() {
		return "ID =>" + getId();
	}
}
