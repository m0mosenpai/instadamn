package com.facebook.rsys.cowatch.gen;

import X.C00O;
import java.util.Map;

/* loaded from: classes12.dex */
public abstract class CowatchSuggestedContentQueueStore {
    public abstract void fetchSuggestedContentQueue(String str, String str2, String str3, String str4, String str5, String str6, Map map, CowatchFetchSuggestedContentQueueSuccessCallback cowatchFetchSuggestedContentQueueSuccessCallback, CowatchFetchSuggestedContentQueueFailureCallback cowatchFetchSuggestedContentQueueFailureCallback);

    public abstract void fetchSuggestedReelsQueueDEPRECATED(String str, String str2, CowatchFetchSuggestedContentQueueSuccessCallback cowatchFetchSuggestedContentQueueSuccessCallback, CowatchFetchSuggestedContentQueueFailureCallback cowatchFetchSuggestedContentQueueFailureCallback);

    public CowatchSuggestedContentQueueStore() {
        throw C00O.createAndThrow();
    }
}
