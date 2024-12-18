package com.facebook.messenger.notification.engine;

import X.C46562Kj1;
import X.LDB;
import com.facebook.simplejni.NativeHolder;

/* loaded from: classes8.dex */
public final class MSGNotificationEngineValueProvider {
    public static final C46562Kj1 Companion = new Object();
    public final NativeHolder mNativeHolder = initNativeHolder();

    /* loaded from: classes8.dex */
    public interface ProviderGetterCallback {
        void getValueForKey(MSGNotificationEngineContext mSGNotificationEngineContext, String str, NotificationEngineValueProviderGetterCompletionCallback notificationEngineValueProviderGetterCompletionCallback);
    }

    /* loaded from: classes8.dex */
    public interface ProviderSetterCallback {
        void setValueForKey(MSGNotificationEngineContext mSGNotificationEngineContext, String str, Object obj, NotificationEngineValueProviderSetterCompletionCallback notificationEngineValueProviderSetterCompletionCallback);
    }

    private final native NativeHolder initNativeHolder();

    public final native void registerGetter(String str, NotificationEngineValueType notificationEngineValueType, ProviderGetterCallback providerGetterCallback);

    public final native void registerSetter(String str, NotificationEngineValueType notificationEngineValueType, ProviderSetterCallback providerSetterCallback);

    /* JADX WARN: Type inference failed for: r0v0, types: [X.Kj1, java.lang.Object] */
    static {
        LDB.A00();
    }
}
