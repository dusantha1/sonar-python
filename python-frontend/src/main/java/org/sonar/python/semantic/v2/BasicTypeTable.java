/*
 * SonarQube Python Plugin
 * Copyright (C) 2011-2024 SonarSource SA
 * mailto:info AT sonarsource DOT com
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
 */
package org.sonar.python.semantic.v2;

import java.util.List;
import org.sonar.python.types.v2.PythonType;
import org.sonar.python.types.v2.UnknownType;

public class BasicTypeTable implements TypeTable {
  @Override
  public PythonType getBuiltinsModule() {
    return new UnknownType.UnresolvedImportType("");
  }

  @Override
  public PythonType getType(String typeFqn) {
    return new UnknownType.UnresolvedImportType(typeFqn);
  }

  @Override
  public PythonType getType(String... typeFqnParts) {
    return new UnknownType.UnresolvedImportType(String.join(".", typeFqnParts));
  }

  @Override
  public PythonType getType(List<String> typeFqnParts) {
    return new UnknownType.UnresolvedImportType(String.join(".", typeFqnParts));
  }

  @Override
  public PythonType getModuleType(List<String> typeFqnParts) {
    return new UnknownType.UnresolvedImportType(String.join(".", typeFqnParts));
  }
}
