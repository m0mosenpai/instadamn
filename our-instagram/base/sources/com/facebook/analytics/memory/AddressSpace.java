package com.facebook.analytics.memory;

import X.C09170dP;
import X.C0K8;

/* loaded from: classes.dex */
public final class AddressSpace {
    public static final AddressSpace INSTANCE = new Object();
    public static volatile boolean initialized;

    public static final native int nativeGetLargestAddressSpaceChunkKb();

    public static final int getLargestChunkKb() {
        try {
        } catch (UnsatisfiedLinkError e) {
            C0K8.A0F("AddressSpace", "Error querying address space", e);
        }
        if (initialized) {
            return nativeGetLargestAddressSpaceChunkKb();
        }
        if (C09170dP.A0A()) {
            C09170dP.A0C("addressspace");
            initialized = true;
            return nativeGetLargestAddressSpaceChunkKb();
        }
        return -1;
    }
}
