package X;

import com.facebook.messenger.notification.engine.MSGNotificationEngineContext;
import com.facebook.messenger.notification.engine.MSGNotificationEngineValueProvider;
import com.facebook.messenger.notification.engine.NotificationEngineValueProviderSetterCompletionCallback;

/* renamed from: X.LTk, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48161LTk implements MSGNotificationEngineValueProvider.ProviderSetterCallback {
    public static final C48161LTk A00 = new C48161LTk();

    @Override // com.facebook.messenger.notification.engine.MSGNotificationEngineValueProvider.ProviderSetterCallback
    public final void setValueForKey(MSGNotificationEngineContext mSGNotificationEngineContext, String str, Object obj, NotificationEngineValueProviderSetterCompletionCallback notificationEngineValueProviderSetterCompletionCallback) {
        AbstractC167007dF.A1E(mSGNotificationEngineContext, 0, notificationEngineValueProviderSetterCompletionCallback);
        notificationEngineValueProviderSetterCompletionCallback.success(mSGNotificationEngineContext);
    }
}
