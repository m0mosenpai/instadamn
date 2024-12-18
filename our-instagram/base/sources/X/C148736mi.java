package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.6mi, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C148736mi implements InterfaceC147946lQ {
    public final List A00;
    public final C3G2 A01;
    public final InterfaceC147266kB A02;
    public final InterfaceC1119053c A03;
    public final InterfaceC147516kc A04;

    public C148736mi(C3G2 c3g2, InterfaceC147266kB interfaceC147266kB, InterfaceC1119053c interfaceC1119053c, InterfaceC147516kc interfaceC147516kc) {
        C14360o3.A0B(interfaceC147266kB, 1);
        C14360o3.A0B(interfaceC147516kc, 2);
        C14360o3.A0B(c3g2, 3);
        this.A02 = interfaceC147266kB;
        this.A04 = interfaceC147516kc;
        this.A01 = c3g2;
        this.A03 = interfaceC1119053c;
        this.A00 = new CopyOnWriteArrayList();
    }

    @Override // X.InterfaceC147946lQ
    public final boolean CoF(C41181vS c41181vS, C41551w4 c41551w4, C141596ac c141596ac, float f) {
        C14360o3.A0B(c41551w4, 0);
        C14360o3.A0B(c41181vS, 1);
        C14360o3.A0B(c141596ac, 2);
        if (!c41181vS.CdW() || !this.A01.A01()) {
            return false;
        }
        List list = this.A00;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((InterfaceC147946lQ) it.next()).CoF(c41181vS, c41551w4, c141596ac, f)) {
                    break;
                }
            }
        }
        int currentPositionMs = this.A04.getCurrentPositionMs();
        if (AbstractC130925vf.A0k(c41181vS, c41551w4) && !AbstractC130925vf.A0q(c41551w4, c141596ac)) {
            C38321qM c38321qM = c41181vS.A0b;
            c38321qM.getClass();
            f = (currentPositionMs * 1.0f) / ((float) (AbstractC130925vf.A00(c38321qM) * 1000.0d));
        }
        c141596ac.A02(f);
        boolean Ca0 = this.A02.Ca0();
        C38321qM c38321qM2 = c41181vS.A0b;
        if (c41181vS.CdW() && !Ca0 && c38321qM2 != null && AbstractC130925vf.A0k(c41181vS, c41551w4) && !AbstractC130925vf.A0q(c41551w4, c141596ac) && c141596ac.A0B >= 1.0f) {
            this.A03.Dbs(c41181vS);
        }
        return true;
    }

    @Override // X.InterfaceC147946lQ
    public final void Dc1(C41181vS c41181vS, C41551w4 c41551w4, C141596ac c141596ac, float f) {
    }
}
