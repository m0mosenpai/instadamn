package com.facebook.messenger.notification.engine;

import X.LAW;
import X.LDB;
import com.facebook.simplejni.NativeHolder;
import java.util.Map;

/* loaded from: classes8.dex */
public abstract class MSGNotificationEngine {
    public static final LAW Companion = new Object();

    /* loaded from: classes8.dex */
    public class MSGNotificationEngineOpenPathIntegratorCallback {
        public void onNotification(MSGOpenPathRenderedNotification mSGOpenPathRenderedNotification) {
        }
    }

    public static final native NativeHolder initNativeHolder(MSGNotificationEngineValueProvider mSGNotificationEngineValueProvider);

    public final native void processOpenPathNotification(Map map, MSGNotificationEngineOpenPathIntegratorCallback mSGNotificationEngineOpenPathIntegratorCallback);

    /* JADX WARN: Type inference failed for: r0v0, types: [X.LAW, java.lang.Object] */
    static {
        LDB.A00();
    }
}
