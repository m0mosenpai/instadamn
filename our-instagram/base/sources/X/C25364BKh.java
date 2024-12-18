package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.BKh, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25364BKh extends AbstractC51572Yf {
    public final EnumC129395t1 A00;
    public final AbstractC50812Vc A01;
    public final UserSession A02;

    public C25364BKh(AbstractC50812Vc abstractC50812Vc, EnumC129395t1 enumC129395t1, UserSession userSession) {
        C14360o3.A0B(enumC129395t1, 2);
        C14360o3.A0B(userSession, 3);
        this.A01 = abstractC50812Vc;
        this.A00 = enumC129395t1;
        this.A02 = userSession;
    }

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        C14360o3.A0B(c76223bS, 0);
        C51762Yz A00 = AbstractC77073ct.A00(c76223bS, C25365BKi.A00);
        C77783e3 c77783e3 = new C77783e3(null, new C65075Td4(C30170DRa.A00(this, A00, 26), 20));
        C2Y5 c2y5 = c76223bS.A05.A05;
        c2y5.getClass();
        c2y5.A01 = c77783e3;
        if (A00.A03 != null) {
            return new AbstractC51572Yf();
        }
        return this.A01;
    }
}
