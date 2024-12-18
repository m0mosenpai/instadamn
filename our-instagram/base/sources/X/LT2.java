package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public final class LT2 implements InterfaceC48192Ji {
    public final /* synthetic */ InterfaceC50470MPy A00;
    public final /* synthetic */ L6Q A01;

    public LT2(InterfaceC50470MPy interfaceC50470MPy, L6Q l6q) {
        this.A01 = l6q;
        this.A00 = interfaceC50470MPy;
    }

    @Override // X.InterfaceC48192Ji
    public final void invoke(AnonymousClass436 anonymousClass436) {
        C2JS A0k;
        C2JS A03;
        C2JS A01;
        if (anonymousClass436 != null && (A0k = AbstractC25225BEi.A0k(anonymousClass436)) != null && (A03 = A0k.A03(QlQ.class, AbstractC111324zv.A00(2949), -1121181168)) != null && (A01 = A03.A01(C59807Qnv.class, -223507593)) != null) {
            L6Q l6q = this.A01;
            InterfaceC50470MPy interfaceC50470MPy = this.A00;
            C6JT c6jt = C6JS.A05;
            UserSession userSession = l6q.A00;
            C91P A012 = c6jt.A00(userSession).A01();
            if (A012 != null) {
                C41761wQ A0S = AbstractC31174DnI.A0S();
                LFg lFg = new LFg(A012);
                boolean A06 = C18U.A06(C06090Tz.A05, userSession, 36327447569906255L);
                C42221xC A00 = LFg.A00(lFg);
                int i = 40;
                if (A06) {
                    i = 39;
                }
                A0S.A02(A00.A0L(new C48345LaL(new C50363MLp(i, A01, lFg))), new C44109JeZ(13, interfaceC50470MPy, A0S));
            }
            interfaceC50470MPy.onSuccess();
        }
    }
}
