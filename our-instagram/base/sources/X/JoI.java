package X;

/* loaded from: classes8.dex */
public final class JoI extends AbstractC70653Fc {
    public final int A00;
    public final int A01;
    public final boolean A02;
    public final boolean A03;

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004c, code lost:
    
        if (r5 < r4) goto L8;
     */
    @Override // X.AbstractC70653Fc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void getItemOffsets(android.graphics.Rect r7, android.view.View r8, androidx.recyclerview.widget.RecyclerView r9, X.C3F5 r10) {
        /*
            r6 = this;
            r1 = 0
            X.C14360o3.A0B(r7, r1)
            X.AbstractC167017dG.A1P(r8, r9)
            int r5 = androidx.recyclerview.widget.RecyclerView.A02(r8)
            r0 = -1
            if (r5 == r0) goto L14
            boolean r3 = r6.A03
            if (r3 == 0) goto L1d
            if (r5 != 0) goto L1d
        L14:
            r7.left = r1
            r7.right = r1
        L18:
            r7.top = r1
        L1a:
            r7.bottom = r1
            return
        L1d:
            X.2UU r0 = r9.A0A
            if (r0 == 0) goto L31
            r2 = 5
            int r0 = r0.getItemViewType(r5)
            if (r2 != r0) goto L31
            int r0 = r6.A00
            r7.left = r0
            r7.right = r0
            r7.top = r0
            goto L1a
        L31:
            if (r3 == 0) goto L35
            int r5 = r5 + (-1)
        L35:
            int r4 = r6.A01
            int r3 = r5 % r4
            boolean r2 = r6.A02
            int r1 = r6.A00
            int r0 = r3 * r1
            int r0 = r0 / r4
            int r0 = r1 - r0
            if (r2 == 0) goto L4f
            r7.right = r0
            int r0 = r3 + 1
            int r0 = r0 * r1
            int r0 = r0 / r4
            r7.left = r0
        L4c:
            if (r5 >= r4) goto L1a
            goto L18
        L4f:
            r7.left = r0
            int r0 = r3 + 1
            int r0 = r0 * r1
            int r0 = r0 / r4
            r7.right = r0
            goto L4c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.JoI.getItemOffsets(android.graphics.Rect, android.view.View, androidx.recyclerview.widget.RecyclerView, X.3F5):void");
    }

    public JoI(int i, int i2, boolean z, boolean z2) {
        this.A01 = i;
        this.A00 = i2;
        this.A03 = z;
        this.A02 = z2;
    }
}
