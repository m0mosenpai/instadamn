package X;

import java.util.List;
import java.util.Map;

/* renamed from: X.Izx, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC43007Izx implements InterfaceC671531g, InterfaceC43071ya {
    public C38687GzS A00;
    public boolean A01;
    public final InterfaceC671131c A02;
    public final C1PO A03;
    public final C1PC A04;
    public final InterfaceC62242sP A05;
    public final /* synthetic */ InterfaceC671531g A06 = new C672731s();

    @Override // X.InterfaceC671531g
    public final void A7z(InterfaceC673031v interfaceC673031v) {
        this.A06.A7z(interfaceC673031v);
    }

    @Override // X.InterfaceC671531g
    public final C1PZ AGn(List list) {
        C14360o3.A0B(list, 0);
        return this.A06.AGn(list);
    }

    @Override // X.InterfaceC671531g
    public final InterfaceC673231x AMN() {
        return new J01(this, 0);
    }

    @Override // X.InterfaceC671531g
    public final C51G AND() {
        return this.A06.AND();
    }

    /* JADX WARN: Code restructure failed: missing block: B:126:0x01b5, code lost:
    
        if (r8 == null) goto L98;
     */
    @Override // X.InterfaceC43071ya
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void ATP(X.C59062n7 r28, X.InterfaceC57162jr r29) {
        /*
            Method dump skipped, instructions count: 540
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC43007Izx.ATP(X.2n7, X.2jr):void");
    }

    @Override // X.InterfaceC669630n
    public final String B5L() {
        return this.A06.B5L();
    }

    @Override // X.InterfaceC669630n
    public final java.util.Set Bts() {
        return this.A06.Bts();
    }

    @Override // X.InterfaceC671531g
    public final void COx() {
        this.A06.COx();
    }

    @Override // X.InterfaceC671531g
    public final void Ct4(int i) {
        this.A06.Ct4(i);
    }

    @Override // X.InterfaceC671531g
    public final void CtD(int i) {
        this.A06.CtD(i);
    }

    @Override // X.InterfaceC671531g
    public final void DrD() {
        this.A01 = false;
        C38687GzS c38687GzS = this.A00;
        if (c38687GzS != null) {
            this.A03.DrE(c38687GzS);
        }
    }

    @Override // X.InterfaceC671531g
    public final void DrF(String str) {
        IML iml;
        C14360o3.A0B(str, 0);
        C38687GzS c38687GzS = this.A00;
        if (c38687GzS != null && this.A01) {
            this.A03.Dxv(c38687GzS);
        }
        C1PO c1po = this.A03;
        C1PC c1pc = this.A04;
        List ANb = this.A02.ANb();
        boolean z = this.A01;
        C1PN c1pn = (C1PN) c1po;
        C38687GzS c38687GzS2 = new C38687GzS(c1pc, str);
        IML iml2 = new IML(c38687GzS2, AbstractC166987dD.A1F(ANb));
        Map map = c1pn.A02;
        map.put(c38687GzS2, iml2);
        c1pn.A01.add(iml2);
        if (z && (iml = (IML) map.get(c38687GzS2)) != null) {
            iml.A02 = true;
            iml.A00 = System.currentTimeMillis();
        }
        this.A00 = c38687GzS2;
    }

    @Override // X.InterfaceC671531g
    public final void DrJ() {
        IML iml;
        this.A01 = true;
        C38687GzS c38687GzS = this.A00;
        if (c38687GzS != null && (iml = (IML) ((C1PN) this.A03).A02.get(c38687GzS)) != null) {
            iml.A02 = true;
            iml.A00 = System.currentTimeMillis();
        }
    }

    @Override // X.InterfaceC671531g
    public final void ECx() {
        this.A06.ECx();
    }

    @Override // X.InterfaceC671531g
    public final void EF6(InterfaceC673031v interfaceC673031v) {
        C14360o3.A0B(interfaceC673031v, 0);
        this.A06.EF6(interfaceC673031v);
    }

    @Override // X.InterfaceC671531g
    public final void EKX() {
        this.A06.EKX();
    }

    @Override // X.InterfaceC671531g
    public final void EKY(C1PZ c1pz) {
        C14360o3.A0B(c1pz, 0);
        this.A06.EKY(c1pz);
    }

    @Override // X.InterfaceC671531g
    public final void EPQ(InterfaceC671731i interfaceC671731i) {
        C14360o3.A0B(interfaceC671731i, 0);
        this.A06.EPQ(interfaceC671731i);
    }

    @Override // X.InterfaceC671531g
    public final void DrA() {
        C38687GzS c38687GzS = this.A00;
        if (c38687GzS != null) {
            this.A03.Dxv(c38687GzS);
        }
    }

    public AbstractC43007Izx(InterfaceC671131c interfaceC671131c, C1PO c1po, C1PC c1pc, InterfaceC62242sP interfaceC62242sP) {
        this.A03 = c1po;
        this.A05 = interfaceC62242sP;
        this.A04 = c1pc;
        this.A02 = interfaceC671131c;
    }

    @Override // X.InterfaceC669630n
    public final void CKM(C206209Bd c206209Bd, List list) {
        AbstractC167017dG.A1N(c206209Bd, list);
        this.A06.CKM(c206209Bd, list);
    }
}
