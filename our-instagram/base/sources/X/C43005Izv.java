package X;

import java.util.Iterator;
import java.util.List;

/* renamed from: X.Izv, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C43005Izv implements InterfaceC671531g {
    public final List A01;
    public final List A00 = AbstractC166987dD.A1E();
    public final java.util.Set A02 = AbstractC31171DnF.A0l();

    @Override // X.InterfaceC671531g
    public final C1PZ AGn(List list) {
        C14360o3.A0B(list, 0);
        List list2 = this.A01;
        if (list2.isEmpty()) {
            return C1PZ.A0K;
        }
        Integer num = C05F.A0N;
        C1PZ c1pz = new C1PZ(num);
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            C1PZ AGn = ((InterfaceC671531g) it.next()).AGn(list);
            if (AGn.A0C == num) {
                boolean z = true;
                if (c1pz.A00().isEmpty() && AbstractC166987dD.A1b(AGn.A00())) {
                    Iterator it2 = AGn.A00().iterator();
                    while (it2.hasNext()) {
                        String A1B = AbstractC166987dD.A1B(it2);
                        if (!c1pz.A00().contains(A1B)) {
                            c1pz.A01(A1B);
                        }
                    }
                }
                double d = c1pz.A01;
                int i = AGn.A01;
                if (I9P.A00(d, i)) {
                    c1pz.A01 = i;
                }
                double d2 = c1pz.A04;
                int i2 = AGn.A04;
                if (I9P.A00(d2, i2)) {
                    c1pz.A04 = i2;
                }
                double d3 = c1pz.A02;
                int i3 = AGn.A02;
                if (I9P.A00(d3, i3)) {
                    c1pz.A02 = i3;
                }
                double d4 = c1pz.A00;
                double d5 = AGn.A00;
                if (I9P.A00(d4, d5)) {
                    c1pz.A00 = d5;
                }
                double d6 = c1pz.A03;
                int i4 = AGn.A03;
                if (I9P.A00(d6, i4)) {
                    c1pz.A03 = i4;
                }
                double d7 = c1pz.A09;
                int i5 = AGn.A09;
                if (I9P.A00(d7, i5)) {
                    c1pz.A09 = i5;
                }
                double d8 = c1pz.A0A;
                int i6 = AGn.A0A;
                if (I9P.A00(d8, i6)) {
                    c1pz.A0A = i6;
                }
                String str = c1pz.A0D;
                String str2 = AGn.A0D;
                if (str.length() == 0 && str2.length() != 0) {
                    c1pz.A0D = str2;
                }
                if (!c1pz.A0G && !AGn.A0G) {
                    z = false;
                }
                c1pz.A0G = z;
            }
        }
        return c1pz;
    }

    @Override // X.InterfaceC671531g
    public final InterfaceC673231x AMN() {
        return new J01(this, 1);
    }

    @Override // X.InterfaceC671531g
    public final C51G AND() {
        return new C43001Izr(this, 0);
    }

    @Override // X.InterfaceC43071ya
    public final void ATP(C59062n7 c59062n7, InterfaceC57162jr interfaceC57162jr) {
    }

    @Override // X.InterfaceC669630n
    public final String B5L() {
        return "";
    }

    @Override // X.InterfaceC669630n
    public final void CKM(C206209Bd c206209Bd, List list) {
    }

    @Override // X.InterfaceC671531g
    public final void DrF(String str) {
        C14360o3.A0B(str, 0);
        Iterator it = this.A01.iterator();
        while (it.hasNext()) {
            ((InterfaceC671531g) it.next()).DrF(str);
        }
    }

    @Override // X.InterfaceC671531g
    public final void EF6(InterfaceC673031v interfaceC673031v) {
        C14360o3.A0B(interfaceC673031v, 0);
        this.A02.remove(interfaceC673031v);
    }

    @Override // X.InterfaceC671531g
    public final void EKY(C1PZ c1pz) {
    }

    @Override // X.InterfaceC671531g
    public final void EPQ(InterfaceC671731i interfaceC671731i) {
        C14360o3.A0B(interfaceC671731i, 0);
        Iterator it = this.A01.iterator();
        while (it.hasNext()) {
            ((InterfaceC671531g) it.next()).EPQ(interfaceC671731i);
        }
    }

    @Override // X.InterfaceC671531g
    public final void A7z(InterfaceC673031v interfaceC673031v) {
        if (interfaceC673031v != null) {
            this.A02.add(interfaceC673031v);
        }
    }

    @Override // X.InterfaceC671531g
    public final void COx() {
        Iterator it = this.A01.iterator();
        while (it.hasNext()) {
            ((InterfaceC671531g) it.next()).COx();
        }
    }

    @Override // X.InterfaceC671531g
    public final void Ct4(int i) {
        Iterator it = this.A01.iterator();
        while (it.hasNext()) {
            ((InterfaceC671531g) it.next()).Ct4(i);
        }
    }

    @Override // X.InterfaceC671531g
    public final void CtD(int i) {
        Iterator it = this.A01.iterator();
        while (it.hasNext()) {
            ((InterfaceC671531g) it.next()).CtD(i);
        }
    }

    @Override // X.InterfaceC671531g
    public final void DrA() {
        Iterator it = this.A01.iterator();
        while (it.hasNext()) {
            ((InterfaceC671531g) it.next()).DrA();
        }
    }

    @Override // X.InterfaceC671531g
    public final void DrD() {
        Iterator it = this.A01.iterator();
        while (it.hasNext()) {
            ((InterfaceC671531g) it.next()).DrD();
        }
    }

    @Override // X.InterfaceC671531g
    public final void DrJ() {
        Iterator it = this.A01.iterator();
        while (it.hasNext()) {
            ((InterfaceC671531g) it.next()).DrJ();
        }
    }

    @Override // X.InterfaceC671531g
    public final void ECx() {
        Iterator it = this.A01.iterator();
        while (it.hasNext()) {
            ((InterfaceC671531g) it.next()).ECx();
        }
    }

    @Override // X.InterfaceC671531g
    public final void EKX() {
        Iterator it = this.A01.iterator();
        while (it.hasNext()) {
            ((InterfaceC671531g) it.next()).EKX();
        }
    }

    public C43005Izv(List list) {
        this.A01 = list;
        C43004Izu c43004Izu = new C43004Izu(this);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            InterfaceC671531g interfaceC671531g = (InterfaceC671531g) it.next();
            this.A00.add(interfaceC671531g.AMN());
            interfaceC671531g.A7z(c43004Izu);
        }
    }

    @Override // X.InterfaceC669630n
    public final java.util.Set Bts() {
        return AbstractC166987dD.A1H();
    }
}
