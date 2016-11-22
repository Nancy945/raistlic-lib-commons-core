/*
 * Copyright 2015 Lei CHEN (raistlic@gmail.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.raistlic.common.taskqueue;

import org.raistlic.common.util.ExceptionHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Lei Chen (2015-11-24)
 */
enum DefaultTaskQueueExceptionHandler implements ExceptionHandler {

  INSTANCE;

  private final Logger logger = LoggerFactory.getLogger(DefaultTaskQueueExceptionHandler.class);

  @Override
  public void exceptionOccur(Thread thread, Throwable ex) {

    logger.error(ex.getMessage(), ex);
  }
}