package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.armadilloexpress.transportpayload.AddMessageContent;
import com.instagram.direct.armadilloexpress.transportpayload.Like;
import com.instagram.model.direct.DirectThreadKey;

/* renamed from: X.L6x, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C47753L6x {
    public final UserSession A00;
    public final C47977LIp A01;

    public C47753L6x(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
        this.A01 = AbstractC46925Kp6.A00(userSession);
    }

    public final void A00(InterfaceC37261GbE interfaceC37261GbE, C29631be c29631be) {
        C45376K6j A00 = AddMessageContent.A00();
        JQ1.A0B(A00, Like.DEFAULT_INSTANCE.A0I()).addMessageContentCase_ = 2;
        this.A01.A02(LGK.A00.A01(this.A00, (AddMessageContent) AbstractC43592JPx.A0L(A00), null, null, c29631be), interfaceC37261GbE, c29631be, (DirectThreadKey) JQ1.A0H(c29631be), 0);
    }
}
