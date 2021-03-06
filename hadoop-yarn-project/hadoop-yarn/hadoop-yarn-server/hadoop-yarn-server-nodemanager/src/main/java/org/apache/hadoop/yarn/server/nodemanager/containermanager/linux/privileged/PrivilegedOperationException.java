/*
 * *
 *  Licensed to the Apache Software Foundation (ASF) under one
 *  or more contributor license agreements. See the NOTICE file
 *  distributed with this work for additional information
 *  regarding copyright ownership. The ASF licenses this file
 *  to you under the Apache License, Version 2.0 (the
 *  "License"); you may not use this file except in compliance
 *  with the License. You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 * /
 */

package org.apache.hadoop.yarn.server.nodemanager.containermanager.linux.privileged;

import org.apache.hadoop.yarn.exceptions.YarnException;

public class PrivilegedOperationException extends YarnException {
  private static final long serialVersionUID = 1L;
  private Integer exitCode;
  private String output;
  private String errorOutput;

  public PrivilegedOperationException() {
    super();
  }

  public PrivilegedOperationException(String message) {
    super(message);
  }

  public PrivilegedOperationException(String message, Integer exitCode,
      String output, String errorOutput) {
    super(message);
    this.exitCode = exitCode;
    this.output = output;
    this.errorOutput = errorOutput;
  }

  public PrivilegedOperationException(Throwable cause) {
    super(cause);
  }

  public PrivilegedOperationException(Throwable cause, Integer exitCode, String
      output, String errorOutput) {
    super(cause);
    this.exitCode = exitCode;
    this.output = output;
    this.errorOutput = errorOutput;
  }
  public PrivilegedOperationException(String message, Throwable cause) {
    super(message, cause);
  }

  public Integer getExitCode() {
    return exitCode;
  }

  public String getOutput() {
    return output;
  }

  public String getErrorOutput() { return errorOutput; }
}