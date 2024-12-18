package com.facebook.rsys.cowatch.gen;

import X.C00O;

/* loaded from: classes12.dex */
public abstract class CowatchMediaInfoStore {
    public abstract void fetchMedia(String str, String str2, CowatchFetchMediaSuccessCallback cowatchFetchMediaSuccessCallback, CowatchFetchMediaFailureCallback cowatchFetchMediaFailureCallback);

    public abstract void updateMediaLikedState(String str, String str2, boolean z);

    public CowatchMediaInfoStore() {
        throw C00O.createAndThrow();
    }
}
