package X;

import java.util.ArrayList;

/* renamed from: X.0UG, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C0UG implements InterfaceC14870p1 {
    public final int A00;
    public final Integer A01;
    public final C12W A02;

    public abstract Object A00(InterfaceC71543Iw interfaceC71543Iw, InterfaceC23621Ds interfaceC23621Ds);

    public String A01() {
        return null;
    }

    public InterfaceC19390xP A03() {
        return null;
    }

    public abstract C0UG A04(Integer num, C12W c12w, int i);

    @Override // X.InterfaceC19390xP
    public Object collect(InterfaceC19960yQ interfaceC19960yQ, InterfaceC23621Ds interfaceC23621Ds) {
        Object A00 = AnonymousClass194.A00(interfaceC23621Ds, new C0UJ(null, interfaceC19960yQ, this));
        if (A00 != C1JX.A02) {
            return C0eB.A00;
        }
        return A00;
    }

    public String toString() {
        ArrayList arrayList = new ArrayList(4);
        String A01 = A01();
        if (A01 != null) {
            arrayList.add(A01);
        }
        C12W c12w = this.A02;
        if (c12w != AnonymousClass191.A00) {
            StringBuilder sb = new StringBuilder();
            sb.append("context=");
            sb.append(c12w);
            arrayList.add(sb.toString());
        }
        int i = this.A00;
        if (i != -3) {
            arrayList.add(AnonymousClass001.A0O("capacity=", i));
        }
        Integer num = this.A01;
        if (num != C05F.A00) {
            arrayList.add(AnonymousClass001.A0R("onBufferOverflow=", A3C.A00(num)));
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getClass().getSimpleName());
        sb2.append('[');
        sb2.append(AbstractC001800i.A0P(", ", "", "", arrayList, null));
        sb2.append(']');
        return sb2.toString();
    }

    public InterfaceC24751Is A02(C19L c19l) {
        C12W c12w = this.A02;
        int i = this.A00;
        if (i == -3) {
            i = -2;
        }
        return AbstractC71523Is.A02(this.A01, C05F.A0C, c12w, new C0UH(null, this), c19l, i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001a, code lost:
    
        if (r1 >= 0) goto L12;
     */
    @Override // X.InterfaceC14870p1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.InterfaceC19390xP AWl(java.lang.Integer r5, X.C12W r6, int r7) {
        /*
            r4 = this;
            X.12W r3 = r4.A02
            X.12W r2 = r6.plus(r3)
            java.lang.Integer r0 = X.C05F.A00
            if (r5 != r0) goto L1f
            int r1 = r4.A00
            r0 = -3
            if (r1 == r0) goto L1d
            if (r7 == r0) goto L1c
            r0 = -2
            if (r1 == r0) goto L1d
            if (r7 == r0) goto L1c
            int r1 = r1 + r7
            r7 = 2147483647(0x7fffffff, float:NaN)
            if (r1 < 0) goto L1d
        L1c:
            r7 = r1
        L1d:
            java.lang.Integer r5 = r4.A01
        L1f:
            boolean r0 = X.C14360o3.A0K(r2, r3)
            if (r0 == 0) goto L2e
            int r0 = r4.A00
            if (r7 != r0) goto L2e
            java.lang.Integer r0 = r4.A01
            if (r5 != r0) goto L2e
            return r4
        L2e:
            X.0UG r0 = r4.A04(r5, r2, r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0UG.AWl(java.lang.Integer, X.12W, int):X.0xP");
    }

    public C0UG(Integer num, C12W c12w, int i) {
        this.A02 = c12w;
        this.A00 = i;
        this.A01 = num;
    }
}
