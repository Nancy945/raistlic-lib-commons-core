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

package org.raistlic.common.event;

import java.util.Collection;
import java.util.function.Supplier;

/**
 * The interface defines an event dispatcher, which is capable of registering listeners and
 * multi-casting events to specific channels.
 *
 * @author Lei CHEN (2014-11-12)
 * @since 1.0
 */
public interface EventDispatcher {

  void post(Event event, String... channels);

  void register(Object listener);

  void register(Collection<?> listeners);

  void unregister(Object listener);

  void unregister(Collection<?> listeners);

  void unregisterAll();

  interface Builder extends Supplier<EventDispatcher> {

    Builder withConfig(EventDispatcherConfig config);
  }
}
