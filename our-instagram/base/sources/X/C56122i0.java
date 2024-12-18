package X;

import java.util.ArrayList;

/* renamed from: X.2i0, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C56122i0 {
    public C56062hu A00;
    public final ArrayList A02 = new ArrayList();
    public C56132i1 A01 = new Object();

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0030, code lost:
    
        if (r7.A01 <= 0.0f) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003a, code lost:
    
        if (r7.A01 <= 0.0f) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean A00(X.C56082hw r7, X.InterfaceC56272iG r8, X.C56122i0 r9, int r10) {
        /*
            X.2i1 r3 = r9.A01
            java.lang.Integer[] r0 = r7.A14
            r2 = 0
            r4 = r0[r2]
            r3.A06 = r4
            r6 = 1
            r5 = r0[r6]
            r3.A07 = r5
            int r0 = r7.A07()
            r3.A00 = r0
            int r0 = r7.A06()
            r3.A05 = r0
            r3.A09 = r2
            r3.A01 = r10
            java.lang.Integer r1 = X.C05F.A0C
            r0 = 0
            if (r4 != r1) goto L24
            r0 = 1
        L24:
            r4 = 0
            if (r5 != r1) goto L28
            r4 = 1
        L28:
            r1 = 0
            if (r0 == 0) goto L32
            float r0 = r7.A01
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r5 = 1
            if (r0 > 0) goto L33
        L32:
            r5 = 0
        L33:
            if (r4 == 0) goto L3c
            float r0 = r7.A01
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r4 = 1
            if (r0 > 0) goto L3d
        L3c:
            r4 = 0
        L3d:
            r1 = 4
            if (r5 == 0) goto L4a
            int[] r0 = r7.A10
            r0 = r0[r2]
            if (r0 != r1) goto L4a
            java.lang.Integer r0 = X.C05F.A00
            r3.A06 = r0
        L4a:
            if (r4 == 0) goto L56
            int[] r0 = r7.A10
            r0 = r0[r6]
            if (r0 != r1) goto L56
            java.lang.Integer r0 = X.C05F.A00
            r3.A07 = r0
        L56:
            r8.Cp9(r7, r3)
            int r0 = r3.A04
            r7.A0I(r0)
            int r0 = r3.A03
            r7.A0H(r0)
            boolean r0 = r3.A08
            r7.A0q = r0
            int r0 = r3.A02
            r7.A0G(r0)
            r3.A01 = r2
            boolean r0 = r3.A09
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56122i0.A00(X.2hw, X.2iG, X.2i0, int):boolean");
    }

    public final void A01(C56062hu c56062hu) {
        ArrayList arrayList = this.A02;
        arrayList.clear();
        ArrayList arrayList2 = ((AbstractC56072hv) c56062hu).A00;
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            C56082hw c56082hw = (C56082hw) arrayList2.get(i);
            Integer num = c56082hw.A14[0];
            Integer num2 = C05F.A0C;
            if (num == num2 || c56082hw.A14[1] == num2) {
                arrayList.add(c56082hw);
            }
        }
        c56062hu.A0A.A05 = true;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.2i1, java.lang.Object] */
    public C56122i0(C56062hu c56062hu) {
        this.A00 = c56062hu;
    }
}
