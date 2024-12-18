package X;

import android.graphics.Bitmap;

/* loaded from: classes4.dex */
public final class Ax9 implements Runnable {
    public final /* synthetic */ Bitmap A00;
    public final /* synthetic */ A6X A01;
    public final /* synthetic */ C23318AVd A02;

    public Ax9(Bitmap bitmap, A6X a6x, C23318AVd c23318AVd) {
        this.A02 = c23318AVd;
        this.A00 = bitmap;
        this.A01 = a6x;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0039, code lost:
    
        if (java.lang.Boolean.TRUE.equals(null) == false) goto L10;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r16 = this;
            r1 = r16
            X.AVd r0 = r1.A02
            X.7yo r7 = r0.A02
            android.graphics.Bitmap r10 = r1.A00
            int r4 = r7.A00
            X.A6X r6 = r1.A01
            java.io.File r9 = r0.A04
            X.BCQ r5 = r0.A01
            X.A4g r8 = r0.A03
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            java.lang.Thread r0 = r0.getThread()
            if (r1 != r0) goto L27
            java.lang.String r0 = "Method handlePreviewPhotoTaken must be invoked on a background thread"
            java.lang.RuntimeException r0 = X.AbstractC166987dD.A18(r0)
            throw r0
        L27:
            X.7yi r0 = r7.A01
            X.7yh r0 = (X.AbstractC179917yh) r0
            int r0 = r0.A00
            r3 = 0
            r2 = 1
            if (r0 != r2) goto L3b
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r0 = 0
            boolean r0 = r1.equals(r0)
            r1 = 1
            if (r0 != 0) goto L3c
        L3b:
            r1 = 0
        L3c:
            if (r4 != 0) goto L49
            if (r1 != 0) goto L49
            r11 = r5
            r12 = r6
            r13 = r7
            r14 = r8
            r15 = r9
            X.C179987yo.A00(r10, r11, r12, r13, r14, r15)
            return
        L49:
            r0 = 0
            if (r4 == 0) goto L50
            android.graphics.Bitmap r10 = X.AbstractC23117AKb.A00(r10, r0, r4, r3)
        L50:
            if (r10 == 0) goto L65
            if (r1 == 0) goto L63
            android.graphics.Bitmap r4 = X.AbstractC23117AKb.A00(r10, r0, r3, r2)
            if (r4 == 0) goto L63
            if (r4 == r10) goto L63
            r10.recycle()
        L5f:
            X.C179987yo.A00(r4, r5, r6, r7, r8, r9)
            return
        L63:
            r4 = r10
            goto L5f
        L65:
            X.C179987yo.A01(r7)
            java.lang.String r0 = "Failed to process photo."
            java.lang.IllegalArgumentException r0 = X.AbstractC166987dD.A12(r0)
            X.APL.A03(r5, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Ax9.run():void");
    }
}
