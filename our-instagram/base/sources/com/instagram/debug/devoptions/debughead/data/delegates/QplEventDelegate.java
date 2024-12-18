package com.instagram.debug.devoptions.debughead.data.delegates;

import X.C0XX;
import java.util.Map;

/* loaded from: classes8.dex */
public interface QplEventDelegate {
    void initializeFromCache(Map map);

    void onLoomTriggerMarkerEnd();

    void onLoomTriggerMarkerStart();

    void reportQplEventForDebug(C0XX c0xx);

    void reportQplMarkerPointForDebug(int i, String str, String str2, long j);
}
