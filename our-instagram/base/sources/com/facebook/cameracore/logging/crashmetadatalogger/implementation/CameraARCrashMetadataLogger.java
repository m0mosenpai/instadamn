package com.facebook.cameracore.logging.crashmetadatalogger.implementation;

import X.C14360o3;
import com.facebook.breakpad.BreakpadManager;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class CameraARCrashMetadataLogger {
    public HashSet loggedKeys = new HashSet();

    public final synchronized void cleanupBreakpadData() {
        Iterator it = this.loggedKeys.iterator();
        C14360o3.A07(it);
        while (it.hasNext()) {
            Object next = it.next();
            C14360o3.A07(next);
            BreakpadManager.removeCustomData((String) next);
        }
        this.loggedKeys.clear();
    }

    public final synchronized void setBreakpadData(String str, String str2) {
        C14360o3.A0B(str, 0);
        C14360o3.A0B(str2, 1);
        BreakpadManager.setCustomData(str, str2, new Object[0]);
        this.loggedKeys.add(str);
    }

    public final void setLoggedKeys(HashSet hashSet) {
        C14360o3.A0B(hashSet, 0);
        this.loggedKeys = hashSet;
    }

    public final HashSet getLoggedKeys() {
        return this.loggedKeys;
    }
}
