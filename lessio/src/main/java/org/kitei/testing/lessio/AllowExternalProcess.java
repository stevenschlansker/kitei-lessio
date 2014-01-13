/*
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
package org.kitei.testing.lessio;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * Under the regime of {@link LessIOSecurityManager}, only classes annotated
 * with this annotation may spawn processes.
 *
 * Annotating a class with this annotation, implies the AllowLocalFileAccess
 * permission for any file descriptor I/O, since file descriptors are essential
 * for process-to-process communication.
 */
@Retention(RUNTIME)
@Target(TYPE)
public @interface AllowExternalProcess
{
}
