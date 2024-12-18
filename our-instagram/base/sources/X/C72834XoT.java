package X;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import java.lang.ref.WeakReference;

/* renamed from: X.XoT, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C72834XoT {
    public C197938p4 A00;
    public SurfaceTexture A01;
    public Surface A02;
    public C72173XRh A03;
    public final YOj A04;
    public final WeakReference A05;

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0058, code lost:
    
        if (r1 != null) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A00(android.graphics.SurfaceTexture r4, int r5, int r6) {
        /*
            r3 = this;
            boolean r0 = r4 instanceof X.XPQ
            if (r0 != 0) goto L45
            android.graphics.SurfaceTexture r0 = r3.A01
            if (r0 == r4) goto L11
            android.view.Surface r0 = new android.view.Surface
            r0.<init>(r4)
            r3.A02 = r0
            r3.A01 = r4
        L11:
            X.8p4 r0 = r3.A00
            android.view.Surface r2 = r3.A02
            if (r0 != 0) goto L41
            X.8Lz r1 = X.EnumC185798Lz.PREVIEW
            X.8p4 r0 = new X.8p4
            r0.<init>(r2, r1, r5, r6)
            r3.A00 = r0
        L20:
            java.lang.ref.WeakReference r2 = r3.A05
            java.lang.Object r1 = r2.get()
            X.Y2I r1 = (X.Y2I) r1
            if (r1 == 0) goto L2f
            X.8p4 r0 = r3.A00
        L2c:
            r1.A04(r0)
        L2f:
            java.lang.Object r2 = r2.get()
            X.Y2I r2 = (X.Y2I) r2
            if (r2 == 0) goto L40
            X.YOj r1 = r3.A04
            X.8sJ r0 = r1.CFC()
            r2.A03(r0, r1)
        L40:
            return
        L41:
            r0.A01(r2, r5, r6)
            goto L20
        L45:
            X.XRh r0 = r3.A03
            if (r0 != 0) goto L50
            X.XRh r0 = new X.XRh
            r0.<init>(r4)
            r3.A03 = r0
        L50:
            java.lang.ref.WeakReference r2 = r3.A05
            java.lang.Object r1 = r2.get()
            X.Y2I r1 = (X.Y2I) r1
            if (r1 == 0) goto L2f
            goto L2c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C72834XoT.A00(android.graphics.SurfaceTexture, int, int):void");
    }

    public C72834XoT(Y2I y2i, YOj yOj) {
        this.A05 = AbstractC25225BEi.A16(y2i);
        this.A04 = yOj;
    }
}
