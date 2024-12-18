package X;

import java.util.List;

/* renamed from: X.TwC, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C65906TwC implements InterfaceC43071ya {
    public final C65936Twh A00;
    public final C6FG A01;
    public final C65935Twg A02;

    @Override // X.InterfaceC43071ya
    public final void ATP(C59062n7 c59062n7, InterfaceC57162jr interfaceC57162jr) {
        C65935Twg c65935Twg = this.A02;
        java.util.Set<C102884kP> set = (java.util.Set) c65935Twg.A01.A01.get(c65935Twg.A00);
        if (set != null) {
            for (C102884kP c102884kP : set) {
                C14360o3.A0B(c102884kP, 0);
                String str = "";
                String A0L = c102884kP.A0L(38);
                if (A0L != null) {
                    str = A0L;
                }
                List list = c102884kP.A0A;
                if (c102884kP.A0S(51, true) && list != null && !list.isEmpty()) {
                    String A00 = C6AS.A00(C05F.A01, list);
                    C14360o3.A07(A00);
                    str = C6AS.A01(str, A00);
                    C14360o3.A0A(str);
                }
                C65936Twh c65936Twh = this.A00;
                C14360o3.A0B(str, 0);
                C62792tI c62792tI = c65936Twh.A00;
                C1BX c1bx = c62792tI.A00;
                C126765oG c126765oG = new C126765oG(c59062n7, interfaceC57162jr, Long.valueOf(c1bx.A04(str, -2147483648L)), c1bx.A0F(str));
                InterfaceC103384lE A0B = c102884kP.A0B(35);
                if (interfaceC57162jr.CFq(c59062n7) == C05F.A00) {
                    c62792tI.A02(str);
                    if (A0B != null) {
                        C6FX c6fx = new C6FX();
                        c6fx.A03(c126765oG, 0);
                        C6FG c6fg = this.A01;
                        c6fx.A03(c6fg, 1);
                        C6FP.A03(c6fg, c102884kP, c6fx.A00(), A0B);
                    }
                }
                InterfaceC103384lE A0B2 = c102884kP.A0B(36);
                if (A0B2 != null && interfaceC57162jr.CFq(c59062n7) == C05F.A0C) {
                    C6FX c6fx2 = new C6FX();
                    c6fx2.A03(c126765oG, 0);
                    C6FG c6fg2 = this.A01;
                    c6fx2.A03(c6fg2, 1);
                    C6FP.A03(c6fg2, c102884kP, c6fx2.A00(), A0B2);
                }
                InterfaceC103384lE A0B3 = c102884kP.A0B(40);
                if (A0B3 != null && interfaceC57162jr.CFq(c59062n7) == C05F.A01) {
                    C6FX c6fx3 = new C6FX();
                    c6fx3.A03(c126765oG, 0);
                    C6FG c6fg3 = this.A01;
                    c6fx3.A03(c6fg3, 1);
                    C6FP.A03(c6fg3, c102884kP, c6fx3.A00(), A0B3);
                }
            }
        }
    }

    public C65906TwC(C65935Twg c65935Twg, C65936Twh c65936Twh, C6FG c6fg) {
        this.A01 = c6fg;
        this.A00 = c65936Twh;
        this.A02 = c65935Twg;
    }
}
