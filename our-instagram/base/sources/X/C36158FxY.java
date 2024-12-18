package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.notifications.impl.activity.DirectPushNotificationActivity;

/* renamed from: X.FxY, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36158FxY implements InterfaceC12870lZ {
    public final /* synthetic */ DirectPushNotificationActivity A00;

    public C36158FxY(DirectPushNotificationActivity directPushNotificationActivity) {
        this.A00 = directPushNotificationActivity;
    }

    @Override // X.InterfaceC12870lZ
    public final void onAppBackgrounded() {
        int i;
        UserSession userSession;
        int A03 = C0f9.A03(188755714);
        AbstractC18680vv session = this.A00.getSession();
        if ((session instanceof UserSession) && (userSession = (UserSession) session) != null) {
            AbstractC28761aE.A00(userSession).ELj();
            i = -258320904;
        } else {
            i = -1125736759;
        }
        C0f9.A0A(i, A03);
    }

    @Override // X.InterfaceC12870lZ
    public final void onAppForegrounded() {
        C0f9.A0A(704467947, C0f9.A03(-1335985677));
    }
}
