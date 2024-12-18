package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.4pf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C105684pf implements InterfaceC43071ya {
    public final /* synthetic */ UserSession A00;

    public C105684pf(UserSession userSession) {
        this.A00 = userSession;
    }

    @Override // X.InterfaceC43071ya
    public final void ATP(C59062n7 c59062n7, InterfaceC57162jr interfaceC57162jr) {
        C64092vU c64092vU = C4q7.A00;
        if (c64092vU == null) {
            c64092vU = new C64092vU(AbstractC11060iN.A00(this.A00), false);
            C4q7.A00 = c64092vU;
        }
        String str = c59062n7.A05;
        C82383m1 A00 = c64092vU.A00(str);
        int intValue = interfaceC57162jr.CFq(c59062n7).intValue();
        if (intValue != 0 && intValue != 1) {
            long BmE = interfaceC57162jr.BmE();
            long j = A00.A03;
            if (j > 0) {
                A00.A02 = BmE - j;
                A00.A03 = -1L;
            }
            C82383m1.A00(A00, BmE);
            C4q7.A01.put(str, Long.valueOf(A00.A05));
            A00.A02();
        } else {
            A00.A03(c59062n7, interfaceC57162jr);
            C4q7.A01.put(str, Long.valueOf(A00.A01(interfaceC57162jr)));
        }
        C75113Zb c75113Zb = (C75113Zb) c59062n7.A04;
        if (c75113Zb.A0p()) {
            C4q7.A02.put(str, Integer.valueOf(c75113Zb.getPosition()));
        }
    }
}
