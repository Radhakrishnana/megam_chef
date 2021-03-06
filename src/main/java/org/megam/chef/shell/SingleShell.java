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
package org.megam.chef.shell;

import java.io.File;
import java.lang.ProcessBuilder.Redirect;
import java.util.concurrent.RecursiveAction;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 
 * @author rajthilak
 * 
 */
public class SingleShell extends RecursiveAction {

	private Command cmd;
	private Logger logger = LoggerFactory.getLogger(SingleShell.class);

	/**
	 * 
	 * @param tempcmd
	 */
	public SingleShell(Command tempcmd) {
		this.cmd = tempcmd;
	}

	/**
	 * Processed the command using ProcessBuilder class Print the output's are
	 * wrote in the some file
	 */

	public void compute() {
		try {
			ProcessBuilder p = new ProcessBuilder(cmd.getCommandList());			
			p.redirectOutput(Redirect.appendTo(cmd.getRedirectOutputFile()));
			p.redirectError(Redirect.to(cmd.getRedirectErrorFile()));
			p.start();
			logger.debug("-------> After Process Start =>");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
