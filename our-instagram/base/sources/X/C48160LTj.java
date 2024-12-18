package X;

import com.facebook.messenger.notification.engine.MSGNotificationEngineContext;
import com.facebook.messenger.notification.engine.MSGNotificationEngineValueProvider;
import com.facebook.messenger.notification.engine.NotificationEngineValueProviderSetterCompletionCallback;
import com.instagram.common.session.UserSession;
import java.util.Map;

/* renamed from: X.LTj, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48160LTj implements MSGNotificationEngineValueProvider.ProviderSetterCallback {
    public final UserSession A00;
    public final C132575yg A01;
    public final L8n A02;

    @Override // com.facebook.messenger.notification.engine.MSGNotificationEngineValueProvider.ProviderSetterCallback
    public final void setValueForKey(MSGNotificationEngineContext mSGNotificationEngineContext, String str, Object obj, NotificationEngineValueProviderSetterCompletionCallback notificationEngineValueProviderSetterCompletionCallback) {
        C09530e4 A1L;
        RuntimeException A18;
        C09530e4 A1L2;
        AbstractC25233BEq.A0v(0, mSGNotificationEngineContext, obj, notificationEngineValueProviderSetterCompletionCallback);
        if (obj.toString() == null) {
            A18 = AbstractC166987dD.A18("Notif Id not received from Notification Engine");
        } else {
            StringBuilder A1C = AbstractC166987dD.A1C();
            A1C.append(obj);
            String A0x = AbstractC166997dE.A0x("_unsend", A1C);
            Map notificationContextDict = mSGNotificationEngineContext.getNotificationContextDict();
            UserSession userSession = this.A00;
            if (userSession.userId == null) {
                A18 = AbstractC166987dD.A18("User Id not received from Notification Engine");
            } else {
                C14360o3.A0B(notificationContextDict, 0);
                Object obj2 = notificationContextDict.get("notification.messagePk");
                if ((obj2 instanceof Long) && obj2 != null) {
                    A1L = AbstractC166987dD.A1L(obj2, null);
                } else {
                    A1L = AbstractC166987dD.A1L(null, "notification.messagePk not found, or isn't a Long");
                }
                Long l = (Long) A1L.A00;
                String str2 = (String) A1L.A01;
                if (str2 == null && l != null) {
                    Object obj3 = notificationContextDict.get("notification.threadPk");
                    if ((obj3 instanceof Long) && obj3 != null) {
                        A1L2 = AbstractC166987dD.A1L(obj3, null);
                    } else {
                        A1L2 = AbstractC166987dD.A1L(null, "notification.threadPk not found, or isn't a Long");
                    }
                    Number number = (Number) A1L2.A00;
                    String str3 = (String) A1L2.A01;
                    if (str3 == null && number != null) {
                        LIY.A02.A00().A00(this.A02.A01(A0x, l.toString(), this.A01.A01(l, null, AbstractC43592JPx.A0y(number), 2, true, false)), userSession);
                        notificationEngineValueProviderSetterCompletionCallback.success(mSGNotificationEngineContext);
                        return;
                    }
                    A18 = AbstractC166987dD.A18(str3);
                } else {
                    A18 = AbstractC166987dD.A18(str2);
                }
            }
        }
        notificationEngineValueProviderSetterCompletionCallback.failure(mSGNotificationEngineContext, A18);
    }

    public /* synthetic */ C48160LTj(UserSession userSession) {
        C132575yg c132575yg = new C132575yg(AbstractC12290kX.A00);
        L8n l8n = new L8n(userSession);
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
        this.A01 = c132575yg;
        this.A02 = l8n;
    }
}
