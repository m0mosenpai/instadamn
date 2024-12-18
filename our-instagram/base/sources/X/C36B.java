package X;

import java.util.Map;

/* renamed from: X.36B, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C36B extends AnonymousClass346 {
    public final InterfaceC43071ya A00;

    public C36B(final ViewOnKeyListenerC677333n viewOnKeyListenerC677333n) {
        this.A00 = new InterfaceC43071ya(viewOnKeyListenerC677333n) { // from class: X.36C
            public final ViewOnKeyListenerC677333n A00;

            @Override // X.InterfaceC43071ya
            public final void ATP(C59062n7 c59062n7, InterfaceC57162jr interfaceC57162jr) {
                Integer num;
                C14360o3.A0B(c59062n7, 0);
                C14360o3.A0B(interfaceC57162jr, 1);
                Object obj = c59062n7.A03;
                C14360o3.A06(obj);
                C38321qM c38321qM = (C38321qM) obj;
                Object obj2 = c59062n7.A04;
                C14360o3.A06(obj2);
                C75113Zb c75113Zb = (C75113Zb) obj2;
                float CGk = interfaceC57162jr.CGk(c59062n7);
                int intValue = interfaceC57162jr.CFq(c59062n7).intValue();
                if (intValue != 1) {
                    if (intValue != 0) {
                        if (intValue == 2) {
                            ViewOnKeyListenerC677333n viewOnKeyListenerC677333n2 = this.A00;
                            C14360o3.A0B(c38321qM, 0);
                            viewOnKeyListenerC677333n2.A09.remove(c38321qM);
                            if (c38321qM.equals(viewOnKeyListenerC677333n2.A00)) {
                                ViewOnKeyListenerC677333n.A06(viewOnKeyListenerC677333n2);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    ViewOnKeyListenerC677333n viewOnKeyListenerC677333n3 = this.A00;
                    C14360o3.A0B(c38321qM, 0);
                    C14360o3.A0B(c75113Zb, 1);
                    Map map = viewOnKeyListenerC677333n3.A09;
                    if (AbstractC76643c9.A0H(viewOnKeyListenerC677333n3.A06, c38321qM)) {
                        num = C05F.A0C;
                    } else if (c38321qM.equals(viewOnKeyListenerC677333n3.A00) && viewOnKeyListenerC677333n3.A08.isPlaying()) {
                        num = C05F.A00;
                    } else {
                        num = C05F.A01;
                    }
                    map.put(c38321qM, new C4TE(c75113Zb, num, CGk));
                    ViewOnKeyListenerC677333n.A02(c38321qM, c75113Zb, viewOnKeyListenerC677333n3, CGk);
                    return;
                }
                ViewOnKeyListenerC677333n viewOnKeyListenerC677333n4 = this.A00;
                C14360o3.A0B(c38321qM, 0);
                C4TE c4te = (C4TE) viewOnKeyListenerC677333n4.A09.get(c38321qM);
                if (c4te == null) {
                    return;
                }
                float f = c4te.A00;
                if (CGk < f && CGk < viewOnKeyListenerC677333n4.A07.A01) {
                    if (c38321qM.equals(viewOnKeyListenerC677333n4.A00) && viewOnKeyListenerC677333n4.A08.isPlaying()) {
                        ViewOnKeyListenerC677333n.A06(viewOnKeyListenerC677333n4);
                    } else {
                        ViewOnKeyListenerC677333n.A01(c38321qM, c4te.A03, viewOnKeyListenerC677333n4);
                    }
                } else if (CGk >= f) {
                    ViewOnKeyListenerC677333n.A02(c38321qM, c4te.A03, viewOnKeyListenerC677333n4, CGk);
                }
                c4te.A00 = CGk;
            }

            {
                this.A00 = viewOnKeyListenerC677333n;
            }
        };
    }
}
