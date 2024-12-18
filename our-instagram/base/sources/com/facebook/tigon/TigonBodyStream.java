package com.facebook.tigon;

/* loaded from: classes.dex */
public interface TigonBodyStream {
    void reportBodyLength(int i);

    void reportError(TigonError tigonError);

    int transferBytes(byte[] bArr, int i);

    void writeEOM();
}
