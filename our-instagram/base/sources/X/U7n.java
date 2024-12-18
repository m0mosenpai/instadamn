package X;

import java.lang.ref.WeakReference;

/* loaded from: classes11.dex */
public final class U7n implements Runnable {
    public final WeakReference A00;

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0085, code lost:
    
        if (r1 >= 20.0f) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008d  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r11 = this;
            java.lang.ref.WeakReference r0 = r11.A00
            java.lang.Object r4 = r0.get()
            X.WTz r4 = (X.C70397WTz) r4
            if (r4 == 0) goto La9
            X.VaF r0 = r4.A08
            android.view.View r8 = r4.A06
            android.graphics.Rect r7 = r0.A00
            boolean r0 = r8.getGlobalVisibleRect(r7)
            if (r0 == 0) goto Lb1
            boolean r0 = r8.isShown()
            if (r0 == 0) goto Lb1
            int r0 = r7.height()
            long r5 = (long) r0
            int r0 = r7.width()
            long r0 = (long) r0
            long r5 = r5 * r0
            int r0 = r8.getHeight()
            long r2 = (long) r0
            int r0 = r8.getWidth()
            long r0 = (long) r0
            long r2 = r2 * r0
            r9 = 0
            int r0 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            boolean r10 = X.AbstractC167007dF.A1O(r0)
            r0 = 100
            long r5 = r5 * r0
            float r9 = (float) r5
            r1 = 1103626240(0x41c80000, float:25.0)
            float r0 = (float) r2
            float r0 = r0 * r1
            int r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            boolean r0 = X.MSY.A1R(r0)
            if (r10 == 0) goto Lb1
            if (r0 == 0) goto Lb1
            r8.getGlobalVisibleRect(r7)
            int r1 = r7.width()
            r8.getHitRect(r7)
            int r0 = r7.width()
            int r1 = r1 / r0
            float r1 = (float) r1
            r3 = 1120403456(0x42c80000, float:100.0)
            float r1 = r1 * r3
            boolean r0 = java.lang.Float.isNaN(r1)
            if (r0 == 0) goto L66
            r1 = 0
        L66:
            r2 = 1101004800(0x41a00000, float:20.0)
            int r0 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r0 >= 0) goto L87
            r8.getGlobalVisibleRect(r7)
            int r1 = r7.height()
            r8.getHitRect(r7)
            int r0 = r7.height()
            int r1 = r1 / r0
            float r1 = (float) r1
            float r1 = r1 * r3
            boolean r0 = java.lang.Float.isNaN(r1)
            if (r0 != 0) goto Lb1
            int r0 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r0 < 0) goto Lb1
        L87:
            java.lang.Integer r5 = X.C05F.A01
        L89:
            java.lang.Integer r0 = r4.A02
            if (r0 == r5) goto La0
            java.lang.Integer r1 = X.C05F.A01
            X.VJ6 r0 = r4.A0A
            com.facebook.quicklog.reliability.UserFlowLogger r3 = r0.A01
            if (r5 != r1) goto Laa
            if (r3 == 0) goto L9e
            long r1 = r0.A00
            java.lang.String r0 = "map_visible"
        L9b:
            r3.flowMarkPoint(r1, r0)
        L9e:
            r4.A02 = r5
        La0:
            android.os.Handler r3 = r4.A05
            X.U7n r2 = r4.A07
            r0 = 500(0x1f4, double:2.47E-321)
            r3.postDelayed(r2, r0)
        La9:
            return
        Laa:
            if (r3 == 0) goto L9e
            long r1 = r0.A00
            java.lang.String r0 = "map_invisible"
            goto L9b
        Lb1:
            java.lang.Integer r5 = X.C05F.A0C
            goto L89
        */
        throw new UnsupportedOperationException("Method not decompiled: X.U7n.run():void");
    }

    public U7n(C70397WTz c70397WTz) {
        this.A00 = new WeakReference(c70397WTz);
    }
}
