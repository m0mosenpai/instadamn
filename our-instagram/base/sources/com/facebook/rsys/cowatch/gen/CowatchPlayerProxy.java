package com.facebook.rsys.cowatch.gen;

import X.C00O;

/* loaded from: classes12.dex */
public abstract class CowatchPlayerProxy {
    public abstract CowatchPlayerApi getApi();

    public abstract boolean isE2eeCowatchEnabled();

    public abstract void setApi(CowatchPlayerApi cowatchPlayerApi);

    public abstract boolean shouldSubscribeBeforeConnect();

    public CowatchPlayerProxy() {
        throw C00O.createAndThrow();
    }
}
