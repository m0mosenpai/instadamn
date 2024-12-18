package X;

/* renamed from: X.Azm, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24887Azm implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ int A03;
    public final /* synthetic */ AbstractServiceC201348vN A04;
    public final /* synthetic */ boolean A05;

    public RunnableC24887Azm(AbstractServiceC201348vN abstractServiceC201348vN, int i, int i2, int i3, int i4, boolean z) {
        this.A04 = abstractServiceC201348vN;
        this.A03 = i;
        this.A00 = i2;
        this.A02 = i3;
        this.A01 = i4;
        this.A05 = z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000c, code lost:
    
        if (r0 != r5) goto L6;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r9 = this;
            X.8vN r3 = r9.A04
            int r0 = r3.A01
            int r4 = r9.A03
            if (r0 != r4) goto Le
            int r0 = r3.A00
            int r5 = r9.A00
            if (r0 == r5) goto L74
        Le:
            r3.A01 = r4
            int r5 = r9.A00
            r3.A00 = r5
            X.810 r0 = r3.A0H
            if (r0 == 0) goto L34
            android.view.Surface r0 = r3.A09
            if (r0 == 0) goto L1f
            r0.release()
        L1f:
            r1 = 0
            r3.A09 = r1
            android.graphics.SurfaceTexture r0 = r3.A05
            if (r0 == 0) goto L29
            r0.release()
        L29:
            r3.A05 = r1
            X.810 r0 = r3.A0H
            if (r0 == 0) goto L32
            r0.A01()
        L32:
            r3.A0H = r1
        L34:
            java.lang.String r0 = "CameraInput"
            X.811 r1 = new X.811
            r1.<init>(r0)
            r0 = 36197(0x8d65, float:5.0723E-41)
            r1.A03 = r0
            int r0 = r3.A01
            r1.A04 = r0
            int r0 = r3.A00
            r1.A02 = r0
            r0 = 6408(0x1908, float:8.98E-42)
            r1.A00 = r0
            r0 = 1
            r1.A09 = r0
            X.810 r0 = new X.810
            r0.<init>(r1)
            r3.A0H = r0
            int r1 = r0.A00
            android.graphics.SurfaceTexture r0 = new android.graphics.SurfaceTexture
            r0.<init>(r1)
            r3.A05 = r0
            r0.setDefaultBufferSize(r4, r5)
            android.graphics.SurfaceTexture r1 = r3.A05
            if (r1 == 0) goto L6b
            android.graphics.SurfaceTexture$OnFrameAvailableListener r0 = r3.A0N
            r1.setOnFrameAvailableListener(r0)
        L6b:
            android.graphics.SurfaceTexture r1 = r3.A05
            android.view.Surface r0 = new android.view.Surface
            r0.<init>(r1)
            r3.A09 = r0
        L74:
            com.meta.arfx.engine.interfaces.IAREngineServiceCallback r1 = r3.A0J     // Catch: android.os.RemoteException -> L7e
            if (r1 == 0) goto L89
            android.view.Surface r0 = r3.A09     // Catch: android.os.RemoteException -> L7e
            r1.EWB(r0, r4, r5)     // Catch: android.os.RemoteException -> L7e
            goto L89
        L7e:
            r2 = move-exception
            java.lang.Class<X.8vN> r1 = X.AbstractServiceC201348vN.class
            java.lang.String r0 = "SetInputSurface failed: "
            X.C0K8.A05(r1, r0, r2)
            r3.stopSelf()
        L89:
            com.facebook.cameracore.mediapipeline.engine.AREngineController r3 = r3.A0C
            if (r3 == 0) goto L96
            int r6 = r9.A02
            int r7 = r9.A01
            boolean r8 = r9.A05
            r3.setupImageSourceFacet(r4, r5, r6, r7, r8)
        L96:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.RunnableC24887Azm.run():void");
    }
}
