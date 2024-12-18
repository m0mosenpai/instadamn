package X;

import com.facebook.messenger.notification.engine.MSGNotificationEngineValueProvider;
import com.facebook.messenger.notification.engine.NotificationEngineValueType;
import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public final class L7H {
    public final UserSession A00;
    public final C48155LTe A01;
    public final C48157LTg A02;

    public final void A00(MSGNotificationEngineValueProvider mSGNotificationEngineValueProvider) {
        C14360o3.A0B(mSGNotificationEngineValueProvider, 0);
        mSGNotificationEngineValueProvider.registerGetter("context.os", NotificationEngineValueType.NOTIFICATION_ENGINE_VALUE_TYPE_STRING, C48158LTh.A00);
        mSGNotificationEngineValueProvider.registerGetter("context.app", NotificationEngineValueType.NOTIFICATION_ENGINE_VALUE_TYPE_NUMBER, C48159LTi.A00);
        mSGNotificationEngineValueProvider.registerGetter("getUnreadMessages", NotificationEngineValueType.NOTIFICATION_ENGINE_VALUE_TYPE_ARRAY, this.A02);
        mSGNotificationEngineValueProvider.registerGetter("areMultipleUsersLoggedIn", NotificationEngineValueType.NOTIFICATION_ENGINE_VALUE_TYPE_BOOLEAN, new C48156LTf(this));
        mSGNotificationEngineValueProvider.registerGetter("isMessagingStyleEnabled", NotificationEngineValueType.NOTIFICATION_ENGINE_VALUE_TYPE_BOOLEAN, this.A01);
    }

    public L7H(UserSession userSession, C48155LTe c48155LTe, C48157LTg c48157LTg) {
        this.A00 = userSession;
        this.A02 = c48157LTg;
        this.A01 = c48155LTe;
    }
}
