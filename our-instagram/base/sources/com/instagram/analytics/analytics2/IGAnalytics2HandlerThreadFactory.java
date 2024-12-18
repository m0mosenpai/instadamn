package com.instagram.analytics.analytics2;

import X.AbstractC09770fa;
import X.C14360o3;
import X.InterfaceC37781pG;
import android.content.Context;
import android.os.HandlerThread;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class IGAnalytics2HandlerThreadFactory implements InterfaceC37781pG {
    public final Map A00 = new HashMap();

    public static final synchronized HandlerThread A00(IGAnalytics2HandlerThreadFactory iGAnalytics2HandlerThreadFactory, String str) {
        HandlerThread handlerThread;
        synchronized (iGAnalytics2HandlerThreadFactory) {
            Map map = iGAnalytics2HandlerThreadFactory.A00;
            handlerThread = (HandlerThread) map.get(str);
            if (handlerThread == null) {
                handlerThread = new HandlerThread(str);
                AbstractC09770fa.A00(handlerThread);
                handlerThread.start();
                map.put(str, handlerThread);
            }
        }
        return handlerThread;
    }

    @Override // X.InterfaceC37781pG
    public final HandlerThread ALb(String str, int i) {
        C14360o3.A0B(str, 0);
        return A00(this, str);
    }

    @Override // X.InterfaceC37781pG
    public final boolean E7g() {
        return false;
    }

    public IGAnalytics2HandlerThreadFactory(Context context) {
    }
}
