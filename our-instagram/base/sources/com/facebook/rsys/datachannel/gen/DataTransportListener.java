package com.facebook.rsys.datachannel.gen;

import X.C00O;

/* loaded from: classes12.dex */
public abstract class DataTransportListener {
    public abstract void onMessage(byte[] bArr, String str, Long l);

    public abstract void onReady();

    public DataTransportListener() {
        throw C00O.createAndThrow();
    }
}
