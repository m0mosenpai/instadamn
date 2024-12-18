package X;

import android.graphics.SurfaceTexture;
import android.os.HandlerThread;
import android.view.Surface;

/* renamed from: X.VmO, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69378VmO {
    public int A00;
    public long A01 = 0;
    public SurfaceTexture A02;
    public HandlerThread A03;
    public Surface A04;
    public C66048Tyl A05;
    public final /* synthetic */ C68923VeN A06;

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0014, code lost:
    
        if (r6.A1O() == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C69378VmO(X.C68923VeN r5, X.U7W r6, int r7) {
        /*
            r4 = this;
            r4.A06 = r5
            r4.<init>()
            r0 = 0
            r4.A01 = r0
            boolean r0 = r6.A0U()
            if (r0 == 0) goto L16
            boolean r0 = r6.A1O()
            r1 = 1
            if (r0 != 0) goto L17
        L16:
            r1 = 0
        L17:
            X.VeN r2 = r4.A06
            X.XEv r0 = r2.A00
            r0.getClass()
            android.graphics.SurfaceTexture r3 = r0.BI8(r7, r1)
            r3.getClass()
            r4.A00 = r7
            if (r1 == 0) goto L2b
            r4.A02 = r3
        L2b:
            X.Tyl r1 = new X.Tyl
            r1.<init>(r3)
            r4.A05 = r1
            boolean r0 = r6.A0Q()
            r1.A03 = r0
            boolean r0 = r2.A01
            r1.A02 = r0
            r2 = -19
            java.lang.String r1 = "videotranscoder-framecallback"
            android.os.HandlerThread r0 = new android.os.HandlerThread
            r0.<init>(r1, r2)
            X.AbstractC09770fa.A00(r0)
            r4.A03 = r0
            r0.start()
            X.Tyl r1 = r4.A05
            android.os.HandlerThread r0 = r4.A03
            X.AbstractC65702TsY.A0y(r1, r3, r0)
            android.view.Surface r0 = new android.view.Surface
            r0.<init>(r3)
            r4.A04 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C69378VmO.<init>(X.VeN, X.U7W, int):void");
    }
}
