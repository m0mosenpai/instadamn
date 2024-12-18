package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Irr, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42512Irr implements XAr {
    public boolean A00;
    public final UserSession A01;
    public final C38176Gqh A02;
    public final InterfaceC16660sJ A03;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, X.97e] */
    @Override // X.XAr
    public final void DBA(int i) {
        C38176Gqh c38176Gqh = this.A02;
        if (i <= c38176Gqh.A00 && !this.A00) {
            this.A00 = true;
            IC3 ic3 = new IC3(this);
            InterfaceC43545JLf interfaceC43545JLf = c38176Gqh.A04;
            EnumC37328GcW enumC37328GcW = EnumC37328GcW.A05;
            interfaceC43545JLf.B6V(new Object(), new C37803GkI(0, c38176Gqh, ic3), enumC37328GcW);
        }
    }

    public /* synthetic */ C42512Irr(InterfaceC16660sJ interfaceC16660sJ, UserSession userSession) {
        C38176Gqh A00 = AbstractC38123Gpq.A00(userSession);
        AbstractC167017dG.A1Q(userSession, A00);
        this.A01 = userSession;
        this.A03 = interfaceC16660sJ;
        this.A02 = A00;
    }
}
