package com.facebook.messenger.msystrace.metadataprovider;

import X.C105394p4;
import java.util.Map;

/* loaded from: classes2.dex */
public class MsysQPLMetadataProvider {
    public static native Map generateAnnotationMap(MsysQPLMetadataSnapshot msysQPLMetadataSnapshot, MsysQPLMetadataSnapshot msysQPLMetadataSnapshot2);

    public static native MsysQPLMetadataSnapshot snapshot(long j, int i, int i2);

    public static MsysQPLMetadataSnapshot snapshot(boolean z, int i, int i2) {
        return snapshot(0L, i, i2);
    }

    static {
        C105394p4.A00();
    }
}
