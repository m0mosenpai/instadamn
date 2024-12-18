package X;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Deprecated;

@Deprecated(message = "Keep in sync with AggregatingRulesEnforcerKt which is the Kotlin equivalent of this class, which is being AB tested. If adding a usage of this class, you should also use AggregatingRulesEnforcerKt depending on A/B test state.")
/* renamed from: X.31t, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C672831t implements InterfaceC671531g {
    public final List A01;
    public final java.util.Set A02 = new LinkedHashSet();
    public final List A00 = new ArrayList();

    public static boolean A00(double d, double d2) {
        return d == -1.0d && d2 != -1.0d;
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
    public final void EKY(C1PZ c1pz) {
    }

    @Override // X.InterfaceC671531g
    public final void A7z(InterfaceC673031v interfaceC673031v) {
        if (interfaceC673031v != null) {
            this.A02.add(interfaceC673031v);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x00db, code lost:
    
        if (r5.A0G != false) goto L51;
     */
    @Override // X.InterfaceC671531g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C1PZ AGn(java.util.List r10) {
        /*
            r9 = this;
            java.util.List r1 = r9.A01
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto Lb
            X.1PZ r4 = X.C1PZ.A0K
        La:
            return r4
        Lb:
            java.lang.Integer r6 = X.C05F.A0N
            X.1PZ r4 = new X.1PZ
            r4.<init>(r6)
            java.util.Iterator r8 = r1.iterator()
        L16:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto La
            java.lang.Object r0 = r8.next()
            X.31g r0 = (X.InterfaceC671531g) r0
            X.1PZ r5 = r0.AGn(r10)
            java.lang.Integer r0 = r5.A0C
            if (r0 != r6) goto L16
            java.util.List r0 = r4.A00()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L60
            java.util.List r0 = r5.A00()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L60
            java.util.List r0 = r5.A00()
            java.util.Iterator r2 = r0.iterator()
        L46:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L60
            java.lang.Object r1 = r2.next()
            java.lang.String r1 = (java.lang.String) r1
            java.util.List r0 = r4.A00()
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L46
            r4.A01(r1)
            goto L46
        L60:
            int r0 = r4.A01
            double r2 = (double) r0
            int r7 = r5.A01
            double r0 = (double) r7
            boolean r0 = A00(r2, r0)
            if (r0 == 0) goto L6e
            r4.A01 = r7
        L6e:
            int r0 = r4.A04
            double r2 = (double) r0
            int r7 = r5.A04
            double r0 = (double) r7
            boolean r0 = A00(r2, r0)
            if (r0 == 0) goto L7c
            r4.A04 = r7
        L7c:
            int r0 = r4.A02
            double r2 = (double) r0
            int r7 = r5.A02
            double r0 = (double) r7
            boolean r0 = A00(r2, r0)
            if (r0 == 0) goto L8a
            r4.A02 = r7
        L8a:
            double r2 = r4.A00
            double r0 = r5.A00
            boolean r2 = A00(r2, r0)
            if (r2 == 0) goto L96
            r4.A00 = r0
        L96:
            int r0 = r4.A03
            double r2 = (double) r0
            int r7 = r5.A03
            double r0 = (double) r7
            boolean r0 = A00(r2, r0)
            if (r0 == 0) goto La4
            r4.A03 = r7
        La4:
            int r0 = r4.A09
            double r2 = (double) r0
            int r7 = r5.A09
            double r0 = (double) r7
            boolean r0 = A00(r2, r0)
            if (r0 == 0) goto Lb2
            r4.A09 = r7
        Lb2:
            int r0 = r4.A0A
            double r2 = (double) r0
            int r7 = r5.A0A
            double r0 = (double) r7
            boolean r0 = A00(r2, r0)
            if (r0 == 0) goto Lc0
            r4.A0A = r7
        Lc0:
            java.lang.String r0 = r4.A0D
            java.lang.String r1 = r5.A0D
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto Ld4
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto Ld4
            java.lang.String r0 = r5.A0D
            r4.A0D = r0
        Ld4:
            boolean r0 = r4.A0G
            if (r0 != 0) goto Ldd
            boolean r1 = r5.A0G
            r0 = 0
            if (r1 == 0) goto Lde
        Ldd:
            r0 = 1
        Lde:
            r4.A0G = r0
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C672831t.AGn(java.util.List):X.1PZ");
    }

    @Override // X.InterfaceC671531g
    public final InterfaceC673231x AMN() {
        return new InterfaceC673231x() { // from class: X.32a
            @Override // X.InterfaceC673231x
            public final void ABh(C59072n8 c59072n8) {
                Iterator it = C672831t.this.A00.iterator();
                while (it.hasNext()) {
                    ((InterfaceC673231x) it.next()).ABh(c59072n8);
                }
            }

            @Override // X.InterfaceC673231x
            public final void ABj(C59072n8 c59072n8) {
                Iterator it = C672831t.this.A00.iterator();
                while (it.hasNext()) {
                    ((InterfaceC673231x) it.next()).ABj(c59072n8);
                }
            }

            @Override // X.InterfaceC673231x
            public final void ABm(C59072n8 c59072n8) {
                Iterator it = C672831t.this.A00.iterator();
                while (it.hasNext()) {
                    ((InterfaceC673231x) it.next()).ABm(c59072n8);
                }
            }
        };
    }

    @Override // X.InterfaceC671531g
    public final C51G AND() {
        return new C51G() { // from class: X.51F
            @Override // X.C51G
            public final void EDk(C3HZ c3hz) {
                Iterator it = C672831t.this.A01.iterator();
                while (it.hasNext()) {
                    c3hz.A00((InterfaceC669630n) it.next());
                }
            }

            @Override // X.C51G
            public final void F9i(C3HZ c3hz) {
                Iterator it = C672831t.this.A01.iterator();
                while (it.hasNext()) {
                    c3hz.A01((InterfaceC669630n) it.next());
                }
            }
        };
    }

    @Override // X.InterfaceC669630n
    public final java.util.Set Bts() {
        return new HashSet();
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
    public final void DrF(String str) {
        Iterator it = this.A01.iterator();
        while (it.hasNext()) {
            ((InterfaceC671531g) it.next()).DrF(str);
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
    public final void EF6(InterfaceC673031v interfaceC673031v) {
        this.A02.remove(interfaceC673031v);
    }

    @Override // X.InterfaceC671531g
    public final void EKX() {
        Iterator it = this.A01.iterator();
        while (it.hasNext()) {
            ((InterfaceC671531g) it.next()).EKX();
        }
    }

    @Override // X.InterfaceC671531g
    public final void EPQ(InterfaceC671731i interfaceC671731i) {
        Iterator it = this.A01.iterator();
        while (it.hasNext()) {
            ((InterfaceC671531g) it.next()).EPQ(interfaceC671731i);
        }
    }

    public C672831t(List list) {
        this.A01 = list;
        InterfaceC673031v interfaceC673031v = new InterfaceC673031v() { // from class: X.31u
            @Override // X.InterfaceC673031v
            public final void D7f(Object obj) {
                Iterator it = C672831t.this.A02.iterator();
                while (it.hasNext()) {
                    ((InterfaceC673031v) it.next()).D7f(obj);
                }
            }

            @Override // X.InterfaceC673031v
            public final void DKk(C1PZ c1pz) {
                Iterator it = C672831t.this.A02.iterator();
                while (it.hasNext()) {
                    ((InterfaceC673031v) it.next()).DKk(c1pz);
                }
            }

            @Override // X.InterfaceC673031v
            public final void DM9(Integer num) {
                Iterator it = C672831t.this.A02.iterator();
                while (it.hasNext()) {
                    ((InterfaceC673031v) it.next()).DM9(num);
                }
            }

            @Override // X.InterfaceC673031v
            public final boolean DMA(C1PZ c1pz) {
                if (c1pz.A0C == C05F.A01) {
                    C672831t.this.COx();
                }
                boolean z = true;
                Iterator it = C672831t.this.A02.iterator();
                while (it.hasNext()) {
                    z &= ((InterfaceC673031v) it.next()).DMA(c1pz);
                }
                return z;
            }

            @Override // X.InterfaceC673031v
            public final void Dgp() {
                Iterator it = C672831t.this.A02.iterator();
                while (it.hasNext()) {
                    ((InterfaceC673031v) it.next()).Dgp();
                }
            }
        };
        Iterator it = list.iterator();
        while (it.hasNext()) {
            InterfaceC671531g interfaceC671531g = (InterfaceC671531g) it.next();
            this.A00.add(interfaceC671531g.AMN());
            interfaceC671531g.A7z(interfaceC673031v);
        }
    }
}
