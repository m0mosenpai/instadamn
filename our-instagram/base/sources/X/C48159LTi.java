package X;

import com.facebook.messenger.notification.engine.MSGNotificationEngineContext;
import com.facebook.messenger.notification.engine.MSGNotificationEngineValueProvider;
import com.facebook.messenger.notification.engine.NotificationEngineValueProviderGetterCompletionCallback;

/* renamed from: X.LTi, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48159LTi implements MSGNotificationEngineValueProvider.ProviderGetterCallback {
    public static final C48159LTi A00 = new C48159LTi();

    @Override // com.facebook.messenger.notification.engine.MSGNotificationEngineValueProvider.ProviderGetterCallback
    public final void getValueForKey(MSGNotificationEngineContext mSGNotificationEngineContext, String str, NotificationEngineValueProviderGetterCompletionCallback notificationEngineValueProviderGetterCompletionCallback) {
        notificationEngineValueProviderGetterCompletionCallback.success(mSGNotificationEngineContext, Integer.valueOf(AbstractC167007dF.A06(0, mSGNotificationEngineContext, notificationEngineValueProviderGetterCompletionCallback)));
    }
}
