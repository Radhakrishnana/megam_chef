/* 
 ** Copyright [2012] [Megam Systems]
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
 * @author ram
 * 
 */
public class Constants {
	
	/**
	 * The version that gets printed in the log after booting.
	 */
	public static final String VERSION = "0.1";
	/**
	 * The build date of the the jar. This might get tweaked by pulling the date
	 * when maven jars the file.
	 */
	public static final String BUILD_DATE = "20130418";

	/**
	 * The root directory from where the code runs
	 */
	public static final String MEGAM_CHEF_ROOT = "";

	/**
	 * The location of the app yaml configuration file, relative to MEGAM_CHEF_ROOT
	 */
	public static final String MEGAM_CHEF_APP_YAML = MEGAM_CHEF_ROOT + "conf" + java.io.File.separator + "app.yaml";
	
	/**
	 * The location of the log file
	 */
	public static final String MEGAM_CHEF_LOG = MEGAM_CHEF_ROOT+ "logs" + java.io.File.separator + "megam_chef.log";
}