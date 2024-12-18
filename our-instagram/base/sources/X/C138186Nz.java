package X;

/* renamed from: X.6Nz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C138186Nz implements C6O0 {
    public final int A00;
    public final Object[] A01;
    public final AbstractC004001f A02;

    @Override // X.C6O0
    public final int BHP(Object obj) {
        AbstractC004001f abstractC004001f = this.A02;
        int A03 = abstractC004001f.A03(obj);
        if (A03 >= 0) {
            return abstractC004001f.A02[A03];
        }
        return -1;
    }

    @Override // X.C6O0
    public final Object BKc(int i) {
        Object[] objArr = this.A01;
        int i2 = i - this.A00;
        if (i2 >= 0) {
            C14360o3.A0B(objArr, 0);
            if (i2 <= objArr.length - 1) {
                return objArr[i2];
            }
            return null;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x007b, code lost:
    
        if (r2 == null) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C138186Nz(X.C6KS r15, X.C17u r16) {
        /*
            r14 = this;
            r14.<init>()
            X.6Nw r4 = r15.A00()
            r0 = r16
            int r12 = r0.A00
            r3 = 1
            r2 = 0
            if (r12 < 0) goto L99
            int r1 = r0.A01
            X.6Nv r4 = (X.C6Nv) r4
            int r0 = r4.A00
            int r0 = r0 - r3
            int r11 = java.lang.Math.min(r1, r0)
            if (r11 >= r12) goto L2a
            X.0vq r1 = X.AbstractC004101g.A00
            java.lang.String r0 = "null cannot be cast to non-null type androidx.collection.ObjectIntMap<K of androidx.collection.ObjectIntMapKt.emptyObjectIntMap>"
            X.C14360o3.A0C(r1, r0)
            r14.A02 = r1
            java.lang.Object[] r0 = new java.lang.Object[r2]
            r14.A01 = r0
            return
        L2a:
            int r0 = r11 - r12
            int r1 = r0 + 1
            java.lang.Object[] r0 = new java.lang.Object[r1]
            r14.A01 = r0
            r14.A00 = r12
            X.0vq r10 = new X.0vq
            r10.<init>(r1)
            X.C6Nv.A00(r4, r12)
            X.C6Nv.A00(r4, r11)
            X.57S r9 = r4.A02
            int r13 = X.C6O1.A00(r9, r12)
            java.lang.Object[] r0 = r9.A02
            r0 = r0[r13]
            X.6Nx r0 = (X.C6Nx) r0
            int r8 = r0.A01
        L4d:
            if (r8 > r11) goto L96
            java.lang.Object[] r0 = r9.A02
            r1 = r0[r13]
            X.6Nx r1 = (X.C6Nx) r1
            java.lang.Object r0 = r1.A02
            X.6Ny r0 = (X.InterfaceC138176Ny) r0
            X.0sJ r7 = r0.BKh()
            int r6 = r1.A01
            int r5 = java.lang.Math.max(r12, r6)
            int r4 = r1.A00
            int r0 = r6 + r4
            int r0 = r0 + (-1)
            int r3 = java.lang.Math.min(r11, r0)
            if (r5 > r3) goto L92
        L6f:
            if (r7 == 0) goto L7d
            int r0 = r5 - r6
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object r2 = r7.invoke(r0)
            if (r2 != 0) goto L82
        L7d:
            androidx.compose.foundation.lazy.layout.DefaultLazyKey r2 = new androidx.compose.foundation.lazy.layout.DefaultLazyKey
            r2.<init>(r5)
        L82:
            r10.A06(r2, r5)
            java.lang.Object[] r1 = r14.A01
            int r0 = r14.A00
            int r0 = r5 - r0
            r1[r0] = r2
            if (r5 == r3) goto L92
            int r5 = r5 + 1
            goto L6f
        L92:
            int r8 = r8 + r4
            int r13 = r13 + 1
            goto L4d
        L96:
            r14.A02 = r10
            return
        L99:
            java.lang.String r1 = "negative nearestRange.first"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C138186Nz.<init>(X.6KS, X.17u):void");
    }
}
