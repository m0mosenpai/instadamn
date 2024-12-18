package X;

import java.util.Iterator;
import java.util.List;

/* renamed from: X.Gla, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37880Gla {
    public final java.util.Set A01 = AbstractC31171DnF.A0l();
    public final java.util.Set A00 = AbstractC31171DnF.A0l();
    public final java.util.Set A02 = AbstractC31171DnF.A0l();

    public final void A02(InterfaceC124295jj interfaceC124295jj, List list, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        boolean A1Y = AbstractC25229BEm.A1Y(list);
        java.util.Set set = this.A01;
        if (AbstractC31171DnF.A1b(set)) {
            C37818GkY c37818GkY = new C37818GkY(interfaceC124295jj, null, null, interfaceC124295jj.Bb1(), interfaceC124295jj.Boh(), null, interfaceC124295jj.Ahz(), list, null, i, z, z2, z3, z4, z5, z6, z7, A1Y);
            Iterator it = set.iterator();
            while (it.hasNext()) {
                ((InterfaceC116905Qw) it.next()).D5H(c37818GkY);
            }
        }
    }

    public final void A03(AbstractC115105If abstractC115105If, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        C14360o3.A0B(abstractC115105If, 0);
        java.util.Set set = this.A01;
        if (AbstractC31171DnF.A1b(set)) {
            C38971HDz c38971HDz = new C38971HDz(abstractC115105If, i, z, z2, z3, z4, z5);
            Iterator it = set.iterator();
            while (it.hasNext()) {
                ((InterfaceC116905Qw) it.next()).D5E(c38971HDz);
            }
        }
    }

    public final void A04(Integer num, boolean z, boolean z2, boolean z3, boolean z4) {
        C14360o3.A0B(num, 0);
        java.util.Set set = this.A01;
        if (AbstractC31171DnF.A1b(set)) {
            C37752GjR c37752GjR = new C37752GjR(num, z, z2, z3, z4);
            Iterator it = set.iterator();
            while (it.hasNext()) {
                ((InterfaceC116905Qw) it.next()).D5G(c37752GjR);
            }
        }
    }

    public final void A00() {
        Iterator it = this.A01.iterator();
        while (it.hasNext()) {
            ((InterfaceC116905Qw) it.next()).D5F();
        }
    }

    public final void A01() {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            ((C37540Gfw) it.next()).A0F();
        }
    }
}
