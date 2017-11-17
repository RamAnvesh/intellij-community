// Copyright 2000-2017 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
package org.jetbrains.plugins.groovy.lang.resolve;

import com.intellij.openapi.util.Key;

public interface AnnotationHint {

  Key<AnnotationHint> HINT_KEY = Key.create("groovy.annotation.resolve");

  boolean isAnnotationResolve();
}
