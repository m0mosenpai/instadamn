package X;

import java.util.List;

/* renamed from: X.5BN, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5BN extends C5BM {
    public C6KW A00;
    public InterfaceC1131459c A01;
    public boolean A04;
    public final C58J A06;
    public final C58475Pw0 A07 = new C58475Pw0();
    public final C003501a A05 = new C003501a(2);
    public boolean A02 = true;
    public boolean A03 = true;

    /* JADX WARN: Code restructure failed: missing block: B:150:0x013f, code lost:
    
        if (r1 == 1) goto L9;
     */
    @Override // X.C5BM
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A04(X.C003501a r42, X.C25256BFu r43, X.InterfaceC1131459c r44, boolean r45) {
        /*
            Method dump skipped, instructions count: 592
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5BN.A04(X.01a, X.BFu, X.59c, boolean):boolean");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Node(pointerInputFilter=");
        sb.append(this.A06);
        sb.append(", children=");
        sb.append(super.A00);
        sb.append(", pointerIds=");
        sb.append(this.A07);
        sb.append(')');
        return sb.toString();
    }

    public C5BN(C58J c58j) {
        this.A06 = c58j;
    }

    @Override // X.C5BM
    public final void A03(C25256BFu c25256BFu) {
        super.A03(c25256BFu);
        C6KW c6kw = this.A00;
        if (c6kw != null) {
            this.A04 = this.A02;
            List list = c6kw.A03;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                BFo bFo = (BFo) list.get(i);
                boolean z = !bFo.A0B;
                boolean z2 = !c25256BFu.A00(bFo.A05);
                boolean z3 = !this.A02;
                if (z && (z2 || z3)) {
                    this.A07.A01(bFo.A05);
                }
            }
            this.A02 = false;
            boolean z4 = false;
            if (c6kw.A00 == 5) {
                z4 = true;
            }
            this.A03 = z4;
        }
    }
}
