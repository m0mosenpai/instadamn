package X;

/* renamed from: X.VsK, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC69617VsK {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int[] A05;

    public final void A00() {
        if (this instanceof C67757UxY) {
            C67757UxY c67757UxY = (C67757UxY) this;
            if (c67757UxY.A00 == 0) {
                if (c67757UxY.A03 <= 0) {
                    if (c67757UxY.A05.length < 3) {
                        throw new IllegalArgumentException("Contiguous indeterminate animation must be used with 3 or more indicator colors.");
                    }
                    return;
                }
                throw new IllegalArgumentException("Rounded corners are not supported in contiguous indeterminate animation.");
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AbstractC69617VsK(android.content.Context r13, android.util.AttributeSet r14, int r15, int r16) {
        /*
            r12 = this;
            r12.<init>()
            r4 = 0
            int[] r0 = new int[r4]
            r12.A05 = r0
            r6 = r13
            int r1 = X.AbstractC167017dG.A04(r13)
            int[] r8 = X.C65N.A03
            int[] r9 = new int[r4]
            r7 = r14
            r10 = r15
            r11 = r16
            android.content.res.TypedArray r3 = X.C65M.A00(r6, r7, r8, r9, r10, r11)
            r0 = 8
            int r0 = X.AbstractC1567371w.A00(r13, r3, r0, r1)
            r12.A04 = r0
            r0 = 7
            int r1 = X.AbstractC1567371w.A00(r13, r3, r0, r4)
            int r0 = r12.A04
            int r0 = r0 / 2
            int r0 = java.lang.Math.min(r1, r0)
            r12.A03 = r0
            r0 = 4
            int r0 = r3.getInt(r0, r4)
            r12.A01 = r0
            r1 = 1
            int r0 = r3.getInt(r1, r4)
            r12.A00 = r0
            r5 = 2
            boolean r0 = r3.hasValue(r5)
            r2 = -1
            if (r0 != 0) goto L94
            int[] r1 = new int[r1]
            r0 = 2130969110(0x7f040216, float:1.7546893E38)
            android.util.TypedValue r0 = X.AbstractC1343565e.A02(r13, r0)
            if (r0 == 0) goto L92
            int r0 = r0.data
        L53:
            r1[r4] = r0
            r12.A05 = r1
        L57:
            r1 = 6
            boolean r0 = r3.hasValue(r1)
            if (r0 == 0) goto L68
            int r0 = r3.getColor(r1, r2)
        L62:
            r12.A02 = r0
            r3.recycle()
            return
        L68:
            int[] r0 = r12.A05
            r0 = r0[r4]
            r12.A02 = r0
            android.content.res.Resources$Theme r1 = r13.getTheme()
            r0 = 16842803(0x1010033, float:2.36937E-38)
            int[] r0 = new int[]{r0}
            android.content.res.TypedArray r2 = r1.obtainStyledAttributes(r0)
            r0 = 1045220557(0x3e4ccccd, float:0.2)
            float r1 = r2.getFloat(r4, r0)
            r2.recycle()
            r0 = 1132396544(0x437f0000, float:255.0)
            float r1 = r1 * r0
            int r1 = (int) r1
            int r0 = r12.A02
            int r0 = X.AbstractC69853Vwe.A01(r0, r1)
            goto L62
        L92:
            r0 = -1
            goto L53
        L94:
            android.util.TypedValue r0 = r3.peekValue(r5)
            int r0 = r0.type
            if (r0 == r1) goto La3
            int[] r1 = new int[r1]
            int r0 = r3.getColor(r5, r2)
            goto L53
        La3:
            android.content.res.Resources r1 = r13.getResources()
            int r0 = r3.getResourceId(r5, r2)
            int[] r0 = r1.getIntArray(r0)
            r12.A05 = r0
            int r0 = r0.length
            if (r0 != 0) goto L57
            java.lang.String r1 = "indicatorColors cannot be empty when indicatorColor is not used."
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC69617VsK.<init>(android.content.Context, android.util.AttributeSet, int, int):void");
    }
}
