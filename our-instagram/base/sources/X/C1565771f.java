package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.71f, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1565771f {
    public InterfaceC19630xq A00;
    public final UserSession A01;

    public final void A01(User user) {
        InterfaceC19630xq interfaceC19630xq = this.A00;
        if (interfaceC19630xq.getBoolean(user.getId(), false)) {
            InterfaceC19610xo ARD = interfaceC19630xq.ARD();
            ARD.E77(user.getId(), false);
            ARD.EEj(AnonymousClass001.A0R(user.getId(), "_report_reason"));
            ARD.apply();
            user.A0c(this.A01);
        }
    }

    public static C1565771f A00(final UserSession userSession) {
        return (C1565771f) userSession.A01(C1565771f.class, new InterfaceC16820sZ() { // from class: X.71g
            @Override // X.InterfaceC16820sZ
            public final Object invoke() {
                return new C1565771f(UserSession.this);
            }
        });
    }

    public final void A02(User user, int i) {
        if (user != null) {
            InterfaceC19610xo ARD = this.A00.ARD();
            ARD.E77(user.getId(), true);
            ARD.E7D(AnonymousClass001.A0R(user.getId(), "_report_reason"), i);
            ARD.apply();
            user.A0c(this.A01);
        }
    }

    public C1565771f(UserSession userSession) {
        this.A01 = userSession;
        this.A00 = C1AT.A01(userSession).A03(C1AV.A2k);
    }
}
