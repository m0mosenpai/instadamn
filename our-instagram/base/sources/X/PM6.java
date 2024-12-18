package X;

/* loaded from: classes9.dex */
public final class PM6 implements Runnable {
    public final /* synthetic */ C52135N5j A00;

    public PM6(C52135N5j c52135N5j) {
        this.A00 = c52135N5j;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006a  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r7 = this;
            X.N5j r4 = r7.A00
            X.PsB r0 = r4.A0E
            if (r0 == 0) goto L96
            java.lang.String r2 = "Required value was null."
            int r3 = r0.getCurrentPosition()
            if (r3 > 0) goto Lf
            r3 = -1
        Lf:
            int r0 = r4.A00
            if (r3 < r0) goto L2e
            boolean r0 = r4.A0N
            if (r0 != 0) goto L2e
            X.PsB r1 = r4.A0E
            if (r1 == 0) goto L8c
            int r0 = r4.A01
            r1.seekTo(r0)
        L20:
            android.view.ViewGroup r1 = r4.A08
            if (r1 != 0) goto L91
            java.lang.String r0 = "clipsReviewContainer"
        L26:
            X.C14360o3.A0F(r0)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        L2e:
            r6 = -1
            if (r3 == r6) goto L20
            r5 = r3
            X.8RS r1 = r4.A0C
            if (r1 != 0) goto L39
            java.lang.String r0 = "currentReviewMode"
            goto L26
        L39:
            X.8RR r0 = r4.A0G
            if (r0 == 0) goto L89
            if (r1 != r0) goto L63
            X.Oyn r1 = r4.A0T
            int r0 = r4.A04
            int r2 = r1.BsQ(r0)
            int r1 = r3 + r2
            int r0 = r4.A01
            int r1 = r1 - r0
            int r0 = r4.A02
            int r5 = X.AbstractC13600mm.A03(r1, r2, r0)
            if (r5 != r6) goto L63
            X.0do r0 = r4.A0X
            int r0 = X.C51033Mgh.A00(r0)
            int r2 = r0 + (-1)
        L5c:
            X.MsV r0 = r4.A09
            if (r0 != 0) goto L6a
            java.lang.String r0 = "trimData"
            goto L26
        L63:
            X.Oyn r0 = r4.A0T
            int r2 = X.NsX.A00(r0, r5)
            goto L5c
        L6a:
            int r0 = r0.A03
            X.C52135N5j.A04(r4, r5, r2, r0)
            X.8RS r1 = r4.A0C
            java.lang.String r0 = "currentReviewMode"
            if (r1 == 0) goto L26
            X.8RR r0 = r4.A0G
            if (r0 == 0) goto L89
            if (r1 != r0) goto L7f
            boolean r0 = r4.A0N
            if (r0 != 0) goto L20
        L7f:
            X.0do r0 = r4.A0X
            int r0 = X.C51033Mgh.A00(r0)
            r1.DzG(r3, r2, r0)
            goto L20
        L89:
            java.lang.String r0 = "clipsReviewTrimMode"
            goto L26
        L8c:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A14(r2)
            throw r0
        L91:
            java.lang.Runnable r0 = r4.A0U
            r1.postOnAnimation(r0)
        L96:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.PM6.run():void");
    }
}
