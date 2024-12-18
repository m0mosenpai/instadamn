package org.chromium.support_lib_boundary;

import java.lang.reflect.InvocationHandler;
import java.util.List;

/* loaded from: classes10.dex */
public interface ProfileStoreBoundaryInterface {
    boolean deleteProfile(String str);

    List getAllProfileNames();

    InvocationHandler getOrCreateProfile(String str);

    InvocationHandler getProfile(String str);
}
