package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.AUk, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23299AUk implements BCJ {
    public final UserSession A00;
    public final InterfaceC09390do A01;
    public final /* synthetic */ C1Z9 A02;

    public C23299AUk(C1Z9 c1z9, UserSession userSession) {
        this.A02 = c1z9;
        this.A00 = userSession;
        this.A01 = AbstractC09440dt.A01(new C29897DGl(46, c1z9, this));
    }

    @Override // X.BCJ
    public final BBK E6S() {
        return (BBK) this.A01.getValue();
    }

    @Override // X.BCJ
    public final AbstractC131215w9 E6V() {
        C1Z9 c1z9 = this.A02;
        UserSession userSession = this.A00;
        C211339Wh c211339Wh = c1z9.A01;
        if (c211339Wh == null) {
            C211339Wh c211339Wh2 = new C211339Wh(new C35777FrF(userSession));
            c1z9.A01 = c211339Wh2;
            return c211339Wh2;
        }
        return c211339Wh;
    }
}
