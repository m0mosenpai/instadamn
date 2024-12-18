package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Gq7, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38140Gq7 implements InterfaceC43071ya {
    public final UserSession A00;
    public final C38176Gqh A01;

    @Override // X.InterfaceC43071ya
    public final void ATP(C59062n7 c59062n7, InterfaceC57162jr interfaceC57162jr) {
        C14360o3.A0B(c59062n7, 0);
        C14360o3.A0B(interfaceC57162jr, 1);
        InterfaceC127955qO interfaceC127955qO = (AbstractC127945qN) c59062n7.A03;
        if (interfaceC127955qO != null && (interfaceC127955qO instanceof InterfaceC127975qQ) && interfaceC57162jr.CFq(c59062n7) == C05F.A00) {
            EnumC104514nH enumC104514nH = EnumC104514nH.A07;
            InterfaceC127975qQ interfaceC127975qQ = (InterfaceC127975qQ) interfaceC127955qO;
            String id = interfaceC127975qQ.BQN().getId();
            if (id != null) {
                C104734nd c104734nd = new C104734nd(enumC104514nH, id);
                UserSession userSession = this.A00;
                AbstractC104474nD.A00(userSession).A01(c104734nd);
                if (C18U.A06(C06090Tz.A05, AbstractC38123Gpq.A00(userSession).A02, 36313055134484172L)) {
                    C38176Gqh c38176Gqh = this.A01;
                    C38321qM BQN = interfaceC127975qQ.BQN();
                    C14360o3.A0B(BQN, 0);
                    c38176Gqh.A04.EFk(BQN, EnumC37328GcW.A05);
                    return;
                }
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
    }

    public C38140Gq7(UserSession userSession) {
        this.A00 = userSession;
        this.A01 = AbstractC38123Gpq.A00(userSession);
    }
}
