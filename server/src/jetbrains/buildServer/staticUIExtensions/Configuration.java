/*
 * Copyright 2000-2011 JetBrains s.r.o.
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

package jetbrains.buildServer.staticUIExtensions;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.io.File;

/**
 * @author Eugene Petrenko (eugene.petrenko@gmail.com)
 *         Date: 16.11.11 19:47
 */
public interface Configuration {
  /**
   * @return path to plugin configuration file
   */
  @NotNull
  File getConfigurationXml();

  /**
   * Maps relative file path from configuration to FileSystem path
   *
   * @param path path to map
   * @return mapped path of null
   */
  @Nullable
  File mapIncludeFilePath(@NotNull final String path);

  /**
   * @return access token for resource controller
   */
  @NotNull
  String getAccessToken();

  @NotNull
  File getIncludeFilesBase();
}
