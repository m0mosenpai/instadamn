package X;

import com.facebook.messenger.notification.engine.MSGNotificationEngineContext;
import com.facebook.messenger.notification.engine.MSGNotificationEngineValueProvider;
import com.facebook.messenger.notification.engine.NotificationEngineValueProviderGetterCompletionCallback;

/* renamed from: X.LTf, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48156LTf implements MSGNotificationEngineValueProvider.ProviderGetterCallback {
    public final /* synthetic */ L7H A00;

    public C48156LTf(L7H l7h) {
        this.A00 = l7h;
    }

    @Override // com.facebook.messenger.notification.engine.MSGNotificationEngineValueProvider.ProviderGetterCallback
    public final void getValueForKey(MSGNotificationEngineContext mSGNotificationEngineContext, String str, NotificationEngineValueProviderGetterCompletionCallback notificationEngineValueProviderGetterCompletionCallback) {
        AbstractC167017dG.A1O(mSGNotificationEngineContext, notificationEngineValueProviderGetterCompletionCallback);
        boolean z = true;
        if (C0BQ.A00(this.A00.A00).BOe().size() <= 1) {
            z = false;
        }
        notificationEngineValueProviderGetterCompletionCallback.success(mSGNotificationEngineContext, Boolean.valueOf(z));
    }
}
