package X;

import com.facebook.messenger.notification.engine.MSGNotificationEngineContext;
import com.facebook.messenger.notification.engine.MSGNotificationEngineValueProvider;
import com.facebook.messenger.notification.engine.NotificationEngineValueProviderGetterCompletionCallback;
import com.instagram.common.session.UserSession;

/* renamed from: X.LTe, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48155LTe implements MSGNotificationEngineValueProvider.ProviderGetterCallback {
    public final UserSession A00;

    public C48155LTe(UserSession userSession) {
        this.A00 = userSession;
    }

    @Override // com.facebook.messenger.notification.engine.MSGNotificationEngineValueProvider.ProviderGetterCallback
    public final void getValueForKey(MSGNotificationEngineContext mSGNotificationEngineContext, String str, NotificationEngineValueProviderGetterCompletionCallback notificationEngineValueProviderGetterCompletionCallback) {
        AbstractC167017dG.A1O(mSGNotificationEngineContext, notificationEngineValueProviderGetterCompletionCallback);
        notificationEngineValueProviderGetterCompletionCallback.success(mSGNotificationEngineContext, AbstractC166997dE.A0c(C06090Tz.A06, this.A00, 36314841841273704L));
    }
}
