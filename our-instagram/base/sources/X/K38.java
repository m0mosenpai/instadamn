package X;

import com.facebook.messenger.notification.engine.MSGNotificationEngineIntegrator;
import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public final class K38 extends MSGNotificationEngineIntegrator.MSGNotificationEngineIntegratorCallback {
    public final UserSession A00;
    public final L8n A01;

    /* JADX WARN: Removed duplicated region for block: B:41:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ad  */
    @Override // com.facebook.messenger.notification.engine.MSGNotificationEngineIntegrator.MSGNotificationEngineIntegratorCallback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onNotification(com.facebook.messenger.notification.engine.MSGRenderedNotification r26) {
        /*
            Method dump skipped, instructions count: 312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.K38.onNotification(com.facebook.messenger.notification.engine.MSGRenderedNotification):void");
    }

    public /* synthetic */ K38(UserSession userSession) {
        L8n l8n = new L8n(userSession);
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
        this.A01 = l8n;
    }
}
