package com.facebook.messenger.mcp.mcpdynamic;

import X.C09170dP;
import android.util.Pair;

/* loaded from: classes3.dex */
public class MCPPluginsRegistryDynamicLoader {
    public static boolean _isLoaded;

    public static native long[] nativeGetLookupFunctions();

    public static synchronized Pair getLookupFunctions() {
        boolean z;
        Pair pair;
        synchronized (MCPPluginsRegistryDynamicLoader.class) {
            if (!_isLoaded) {
                C09170dP.A0C("mcpdynamic-mcpdynamic");
                z = true;
                _isLoaded = true;
            } else {
                z = false;
            }
            long[] nativeGetLookupFunctions = nativeGetLookupFunctions();
            pair = new Pair(new Long[]{new Long(nativeGetLookupFunctions[0]), new Long(nativeGetLookupFunctions[1])}, Boolean.valueOf(z));
        }
        return pair;
    }
}
