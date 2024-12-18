package com.facebook.messenger.notification.engine;

import X.C46561Kj0;
import X.LDB;
import com.facebook.simplejni.NativeHolder;
import java.util.Map;

/* loaded from: classes8.dex */
public final class MSGNotificationEngineContext {
    public static final C46561Kj0 Companion = new Object();
    public NativeHolder mNativeHolder;

    public final native Map getNotificationContextDict();

    /* JADX WARN: Type inference failed for: r0v0, types: [X.Kj0, java.lang.Object] */
    static {
        LDB.A00();
    }

    public MSGNotificationEngineContext(NativeHolder nativeHolder) {
        this.mNativeHolder = nativeHolder;
    }
}
