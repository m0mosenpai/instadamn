package X;

import com.instagram.api.schemas.AdFormatType;
import com.instagram.common.session.UserSession;

/* renamed from: X.J2d, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C43063J2d implements InterfaceC31012DkB {
    public final C120985dq A00;
    public final UserSession A01;
    public final InterfaceC60442pS A02;

    public C43063J2d(C120985dq c120985dq, UserSession userSession, InterfaceC60442pS interfaceC60442pS) {
        C14360o3.A0B(interfaceC60442pS, 3);
        this.A00 = c120985dq;
        this.A01 = userSession;
        this.A02 = interfaceC60442pS;
    }

    @Override // X.InterfaceC31012DkB
    public final void Cm1(Integer num, int i, int i2) {
        String str;
        String str2;
        C14360o3.A0B(num, 2);
        UserSession userSession = this.A01;
        InterfaceC60442pS interfaceC60442pS = this.A02;
        C18920wW A01 = AbstractC12220kQ.A01(interfaceC60442pS, userSession);
        C38321qM c38321qM = this.A00.A02;
        if (c38321qM != null) {
            C82713mZ A0F = AbstractC37301Gc2.A0F(userSession, c38321qM, interfaceC60442pS, "gesture");
            if (num.intValue() != 0) {
                str = "user_swipe";
            } else {
                str = "auto_advance";
            }
            A0F.A74 = str;
            A0F.A08(i2);
            if (i < i2) {
                str2 = "swipe_left";
            } else {
                str2 = "swipe_right";
            }
            A0F.A7T = str2;
            XN2.A00(A01, A0F, interfaceC60442pS);
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // X.InterfaceC31012DkB
    public final void Cm7(AdFormatType adFormatType) {
    }
}
