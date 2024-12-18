package com.facebook.cameracore.ardelivery.xplatcache;

/* loaded from: classes6.dex */
public enum ARDFileInMemoryStatus {
    IN_CACHE,
    NOT_IN_CACHE,
    MAYBE;

    public static ARDFileInMemoryStatus fromOrdinal(int i) {
        if (i != 0) {
            if (i != 1 && i == 2) {
                return MAYBE;
            }
            return NOT_IN_CACHE;
        }
        return IN_CACHE;
    }
}
