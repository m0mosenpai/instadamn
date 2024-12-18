package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes12.dex */
public final class XOa implements InterfaceC09250da, InterfaceC16820sZ {
    public final int A00;
    public final Object A01;

    public XOa(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.InterfaceC16820sZ
    public final Object invoke() {
        switch (this.A00) {
            case 0:
                return C5KW.A00((C0CA) this.A01).get("extra");
            case 1:
                C9NA c9na = (C9NA) this.A01;
                return new XOI(c9na.A01, c9na.A00);
            case 2:
                UserSession userSession = (UserSession) this.A01;
                return new C72741XmD(C26661Qv.A00(userSession), userSession);
            case 3:
                return new C72693XlM(C26661Qv.A00((AbstractC12990ll) this.A01));
            case 4:
                return new C72742XmE((AbstractC12990ll) this.A01);
            case 5:
                return new O6M((UserSession) this.A01);
            default:
                return new C72696XlP((AbstractC12990ll) this.A01);
        }
    }
}
