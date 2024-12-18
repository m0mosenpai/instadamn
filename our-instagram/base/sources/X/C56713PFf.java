package X;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.PFf, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56713PFf implements InterfaceC71958XCk {
    public final int A00;
    public final Object A01;

    public C56713PFf(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.InterfaceC71958XCk
    public final void D3E() {
    }

    @Override // X.InterfaceC71958XCk
    public final void Djl(Integer num) {
        InterfaceC57804PkW c55861OrB;
        String str;
        C51675Ms6 c51675Ms6;
        if (this.A00 != 0) {
            C51047Mgz c51047Mgz = (C51047Mgz) ((N8F) this.A01).A05.getValue();
            if (num == C05F.A01) {
                Iterator A16 = AbstractC166997dE.A16(c51047Mgz.A08);
                while (true) {
                    str = null;
                    if (!A16.hasNext()) {
                        break;
                    }
                    Object next = A16.next();
                    Map map = c51047Mgz.A09;
                    if (map.containsKey(next)) {
                        if (next != null && (c51675Ms6 = (C51675Ms6) map.get(next)) != null) {
                            str = c51675Ms6.A05;
                        }
                    }
                }
                c55861OrB = new C55857Or7(str);
            } else {
                c55861OrB = new C55861OrB(new C55856Or6(c51047Mgz), c51047Mgz.A07, AbstractC001800i.A0U(c51047Mgz.A08.values()));
            }
            C51047Mgz.A03(c51047Mgz, c55861OrB);
            return;
        }
        N8G n8g = (N8G) this.A01;
        C55855Or5 c55855Or5 = new C55855Or5(n8g);
        C52179N7o c52179N7o = new C52179N7o();
        List list = n8g.A06;
        List list2 = n8g.A04;
        String str2 = n8g.A03;
        AbstractC167027dH.A13(list, list2, str2);
        c52179N7o.A00 = c55855Or5;
        c52179N7o.A03 = list;
        c52179N7o.A02 = list2;
        c52179N7o.A01 = str2;
        AbstractC31177DnL.A16(c52179N7o, n8g.requireActivity(), AbstractC166987dD.A0r(((AbstractC52114N4m) n8g).A09));
    }
}
