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
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.megam.chef.BootStrapChef;
import org.megam.chef.parser.CommandJson;

import com.google.gson.Gson;

import static org.megam.chef.Constants.MEGAM_LOG_DIR;
/**
 * 
 * @author rajthilak
 * 
 */
public class Command {

	private File rdo;
	private File rder;
	private List<String> cmdList = new ArrayList<String>();
	private String name;
	private String node;
	private String inputCmd;
	private Logger logger = LoggerFactory.getLogger(Command.class);
	
	
	

	/**
	 * 
	 * @param s
	 */
	public Command(String[] shellArray) {
		
		this.name = shellArray[0].toLowerCase();
		this.node = shellArray[1];
	    this.inputCmd = shellArray[2];
		StringTokenizer st = new StringTokenizer(inputCmd);
		while (st.hasMoreTokens()) {
			cmdList.add(st.nextToken());
		}
		
		setRedirectOutput("out"+"_"+node);
		setRedirectError("err"+"_"+node);
	}

	/**
	 * 
	 * @param trdo
	 */
	public void setRedirectOutput(String trdo) {
		File dir =  new File(MEGAM_LOG_DIR+ name);
		dir.mkdirs();
		this.rdo = new File(dir, trdo);
	}

	/**
	 * 
	 * @return redirect output file
	 */
	public File getRedirectOutputFile() {
		return rdo;
	}

	/**
	 * 
	 * @return raw command string
	 */
	public String getRawCommandString() {
		return inputCmd;
	}

	/**
	 * 
	 * @return command list
	 */
	public List<String> getCommandList() {
		return cmdList;
	}

	/**
	 * 
	 * @param trde
	 */
	public void setRedirectError(String trde) {
		File dir =  new File(MEGAM_LOG_DIR+ name );
		dir.mkdirs();
		this.rder = new File(dir,trde);
	}

	/**
	 * 
	 * @return redirect error file
	 */
	public File getRedirectErrorFile() {
		
		return rder;
	}

	public String toString() {
		return "(" + getCommandList() + ")";
	}
}
