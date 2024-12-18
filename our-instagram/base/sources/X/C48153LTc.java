package X;

import com.facebook.messenger.notification.engine.MSGNotificationEngineContext;
import com.facebook.messenger.notification.engine.MSGNotificationEngineValueProvider;
import com.facebook.messenger.notification.engine.NotificationEngineValueProviderGetterCompletionCallback;

/* renamed from: X.LTc, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48153LTc implements MSGNotificationEngineValueProvider.ProviderGetterCallback {
    public final /* synthetic */ C47659L2s A00;

    public C48153LTc(C47659L2s c47659L2s) {
        this.A00 = c47659L2s;
    }

    @Override // com.facebook.messenger.notification.engine.MSGNotificationEngineValueProvider.ProviderGetterCallback
    public final void getValueForKey(MSGNotificationEngineContext mSGNotificationEngineContext, String str, NotificationEngineValueProviderGetterCompletionCallback notificationEngineValueProviderGetterCompletionCallback) {
        AbstractC167017dG.A1O(mSGNotificationEngineContext, notificationEngineValueProviderGetterCompletionCallback);
        notificationEngineValueProviderGetterCompletionCallback.success(mSGNotificationEngineContext, this.A00.A01.A00());
    }
}
