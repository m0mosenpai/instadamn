package X;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* renamed from: X.31r, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C672631r implements InterfaceC671531g {
    public boolean A01;
    public boolean A02;
    public final InterfaceC62242sP A03;
    public final InterfaceC671231d A04;
    public final AbstractC672431p A05;
    public final C1PY A07;
    public final java.util.Set A06 = new LinkedHashSet();
    public C1PZ A00 = C1PZ.A0K;

    @Override // X.InterfaceC669630n
    public final String B5L() {
        return "";
    }

    @Override // X.InterfaceC669630n
    public final void CKM(C206209Bd c206209Bd, List list) {
    }

    @Override // X.InterfaceC671531g
    public final void Ct4(int i) {
    }

    @Override // X.InterfaceC671531g
    public final void CtD(int i) {
    }

    @Override // X.InterfaceC671531g
    public final /* synthetic */ void DrA() {
    }

    @Override // X.InterfaceC671531g
    public final /* synthetic */ void DrD() {
    }

    @Override // X.InterfaceC671531g
    public final /* synthetic */ void DrF(String str) {
    }

    @Override // X.InterfaceC671531g
    public final /* synthetic */ void DrJ() {
    }

    @Override // X.InterfaceC671531g
    public final void A7z(InterfaceC673031v interfaceC673031v) {
        if (interfaceC673031v != null) {
            this.A06.add(interfaceC673031v);
        }
    }

    @Override // X.InterfaceC671531g
    public final C1PZ AGn(List list) {
        int i;
        AbstractC672431p abstractC672431p = this.A05;
        C1PZ A08 = abstractC672431p.A08(list);
        C1PZ c1pz = this.A00;
        if (c1pz != C1PZ.A0K && (i = c1pz.A05) != -1) {
            boolean z = abstractC672431p.A06;
            int i2 = A08.A05;
            if (z) {
                i2 += i;
            }
            A08.A05 = i2;
        }
        return A08;
    }

    @Override // X.InterfaceC671531g
    public final InterfaceC673231x AMN() {
        return new InterfaceC673231x() { // from class: X.31y
            @Override // X.InterfaceC673231x
            public final void ABh(C59072n8 c59072n8) {
                c59072n8.A00(C672631r.this);
            }

            @Override // X.InterfaceC673231x
            public final void ABj(C59072n8 c59072n8) {
                c59072n8.A00(C672631r.this);
            }

            @Override // X.InterfaceC673231x
            public final void ABm(C59072n8 c59072n8) {
                c59072n8.A00(C672631r.this);
            }
        };
    }

    @Override // X.InterfaceC671531g
    public final C51G AND() {
        return new C43000Izq();
    }

    @Override // X.InterfaceC669630n
    public final java.util.Set Bts() {
        return new HashSet();
    }

    @Override // X.InterfaceC671531g
    public final void COx() {
        this.A05.A0B();
    }

    @Override // X.InterfaceC671531g
    public final void ECx() {
        this.A05.A0C();
    }

    @Override // X.InterfaceC671531g
    public final void EF6(InterfaceC673031v interfaceC673031v) {
        this.A06.remove(interfaceC673031v);
    }

    @Override // X.InterfaceC671531g
    public final void EKX() {
        this.A05.A06 = true;
    }

    @Override // X.InterfaceC671531g
    public final void EPQ(InterfaceC671731i interfaceC671731i) {
        this.A05.A05 = interfaceC671731i;
    }

    public C672631r(InterfaceC62242sP interfaceC62242sP, InterfaceC671231d interfaceC671231d, C1PY c1py, AbstractC672431p abstractC672431p, boolean z, boolean z2) {
        this.A07 = c1py;
        this.A04 = interfaceC671231d;
        this.A05 = abstractC672431p;
        this.A03 = interfaceC62242sP;
        this.A02 = z;
        this.A01 = z2;
    }

    @Override // X.InterfaceC43071ya
    public final void ATP(C59062n7 c59062n7, InterfaceC57162jr interfaceC57162jr) {
        Object BUM;
        if (interfaceC57162jr.CFq(c59062n7) == C05F.A0C) {
            AbstractC672431p abstractC672431p = this.A05;
            if (abstractC672431p instanceof AbstractC672331o) {
                AbstractC672331o abstractC672331o = (AbstractC672331o) abstractC672431p;
                if (abstractC672331o instanceof C672231n) {
                    C672231n c672231n = (C672231n) abstractC672331o;
                    if (c672231n.A0C) {
                        C31H c31h = c672231n.A0A;
                        long j = c672231n.A01;
                        C9B3 c9b3 = c672231n.A02;
                        c31h.Cky(c9b3, "feed_tbi", j, 0L, ((AbstractC672331o) c672231n).A00);
                        ((AbstractC672331o) c672231n).A00 = 0;
                        c672231n.A01 = 0;
                        c9b3.A04 = 0;
                        c9b3.A01 = 0;
                        c9b3.A03 = 0;
                        c9b3.A02 = 0;
                        c9b3.A06 = 0;
                        c9b3.A05 = 0;
                        c9b3.A00 = 0;
                        return;
                    }
                    return;
                }
                return;
            }
        } else {
            AbstractC672431p abstractC672431p2 = this.A05;
            InterfaceC62242sP interfaceC62242sP = this.A03;
            abstractC672431p2.A04 = interfaceC62242sP;
            abstractC672431p2.ATP(c59062n7, interfaceC57162jr);
            if (this.A01 && this.A07.A02.isEmpty()) {
                if (!this.A02) {
                    return;
                }
                int A04 = abstractC672431p2.A04(c59062n7.A04);
                InterfaceC671231d interfaceC671231d = this.A04;
                List BZU = interfaceC671231d.BZU();
                InterfaceC42381xS Cpq = interfaceC671231d.Cpq();
                if (Cpq == null || (BUM = Cpq.BUM()) == null || !abstractC672431p2.A0J(interfaceC57162jr, BUM, BZU, A04)) {
                    return;
                }
                C5Ho.A00(interfaceC62242sP, BUM, this.A06);
                return;
            }
            if (abstractC672431p2.A06) {
                C1PZ A07 = abstractC672431p2.A07(c59062n7, interfaceC57162jr);
                if (this.A02) {
                    Object BUM2 = this.A07.A00().BUM();
                    if (A07.A0C == C05F.A01) {
                        C5Ho.A00(interfaceC62242sP, BUM2, this.A06);
                    }
                }
                Iterator it = this.A06.iterator();
                while (it.hasNext()) {
                    ((InterfaceC673031v) it.next()).DMA(A07);
                }
                return;
            }
            if (abstractC672431p2 instanceof AbstractC672331o) {
                ((AbstractC672331o) abstractC672431p2).A00++;
                return;
            }
        }
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC671531g
    public final void EKY(C1PZ c1pz) {
        this.A00 = c1pz;
    }
}
