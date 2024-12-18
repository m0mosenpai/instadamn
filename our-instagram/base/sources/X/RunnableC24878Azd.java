package X;

/* renamed from: X.Azd, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24878Azd implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ int A03;
    public final /* synthetic */ C73493YFw A04;
    public final /* synthetic */ C176087sR A05;

    public RunnableC24878Azd(C73493YFw c73493YFw, C176087sR c176087sR, int i, int i2, int i3, int i4) {
        this.A05 = c176087sR;
        this.A04 = c73493YFw;
        this.A03 = i;
        this.A02 = i2;
        this.A01 = i3;
        this.A00 = i4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003b, code lost:
    
        if (r0.booleanValue() != false) goto L16;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [X.9b8, X.9ty] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r14 = this;
            X.7sR r0 = r14.A05
            X.7sN r2 = r0.A00
            X.AH7 r0 = r2.A0E
            if (r0 == 0) goto Lb
            X.AH7.A00(r0)
        Lb:
            boolean r0 = r2.A02     // Catch: java.lang.Exception -> L9a
            if (r0 != 0) goto L70
            X.YFw r4 = r14.A04     // Catch: java.lang.Exception -> L9a
            int r7 = r14.A03     // Catch: java.lang.Exception -> L9a
            int r8 = r14.A02     // Catch: java.lang.Exception -> L9a
            int r9 = r14.A01     // Catch: java.lang.Exception -> L9a
            int r10 = r14.A00     // Catch: java.lang.Exception -> L9a
            java.lang.ref.WeakReference r0 = r2.A07     // Catch: java.lang.Exception -> L9a
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Exception -> L9a
            X.7y3 r0 = (X.C179537y3) r0     // Catch: java.lang.Exception -> L9a
            if (r0 == 0) goto L65
            com.facebook.cameracore.mediapipeline.services.audio.interfaces.AudioPlatformComponentHost r5 = r0.A00()     // Catch: java.lang.Exception -> L9a
            com.facebook.cameracore.mediapipeline.services.audio.interfaces.AudioRenderCallback r0 = r2.A0G     // Catch: java.lang.Exception -> L9a
            if (r5 == 0) goto L65
            if (r0 == 0) goto L65
            java.util.WeakHashMap r0 = r2.A08     // Catch: java.lang.Exception -> L9a
            java.lang.Object r0 = r0.get(r5)     // Catch: java.lang.Exception -> L9a
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Exception -> L9a
            if (r0 == 0) goto L69
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Exception -> L9a
            if (r0 == 0) goto L69
        L3d:
            java.nio.ByteBuffer r6 = r4.A02     // Catch: java.lang.Exception -> L9a
            byte[] r0 = r2.A03     // Catch: java.lang.Exception -> L9a
            int r1 = r0.length     // Catch: java.lang.Exception -> L9a
            int r0 = r6.capacity()     // Catch: java.lang.Exception -> L9a
            if (r1 == r0) goto L50
            int r0 = r6.capacity()     // Catch: java.lang.Exception -> L9a
            byte[] r0 = new byte[r0]     // Catch: java.lang.Exception -> L9a
            r2.A03 = r0     // Catch: java.lang.Exception -> L9a
        L50:
            byte[] r0 = r2.A03     // Catch: java.lang.Exception -> L9a
            r6.get(r0)     // Catch: java.lang.Exception -> L9a
            X.9Y8 r1 = new X.9Y8     // Catch: java.lang.Exception -> L9a
            r1.<init>(r4, r2)     // Catch: java.lang.Exception -> L9a
            r0 = r5
            com.facebook.cameracore.mediapipeline.services.audio.implementation.AudioPlatformComponentHostImpl r0 = (com.facebook.cameracore.mediapipeline.services.audio.implementation.AudioPlatformComponentHostImpl) r0     // Catch: java.lang.Exception -> L9a
            r0.mRenderCallback = r1     // Catch: java.lang.Exception -> L9a
            boolean r0 = r5.onInputDataAvailable(r6, r7, r8, r9, r10)     // Catch: java.lang.Exception -> L9a
            if (r0 != 0) goto Laa
        L65:
            X.C176047sN.A01(r2)     // Catch: java.lang.Exception -> L9a
            goto L7d
        L69:
            boolean r0 = X.C176047sN.A03(r2)     // Catch: java.lang.Exception -> L9a
            if (r0 == 0) goto L65
            goto L3d
        L70:
            X.C176047sN.A01(r2)     // Catch: java.lang.Exception -> L9a
            X.YFw r4 = r14.A04     // Catch: java.lang.Exception -> L9a
            int r7 = r14.A03     // Catch: java.lang.Exception -> L9a
            int r8 = r14.A02     // Catch: java.lang.Exception -> L9a
            int r9 = r14.A01     // Catch: java.lang.Exception -> L9a
            int r10 = r14.A00     // Catch: java.lang.Exception -> L9a
        L7d:
            X.7se r3 = r2.A0H     // Catch: java.lang.Exception -> L9a
            if (r3 == 0) goto L86
            long r0 = r2.A00     // Catch: java.lang.Exception -> L9a
            r3.A01(r4, r10, r0)     // Catch: java.lang.Exception -> L9a
        L86:
            if (r10 <= 0) goto Laa
            if (r7 <= 0) goto Laa
            if (r8 <= 0) goto Laa
            if (r9 <= 0) goto Laa
            long r0 = r2.A00     // Catch: java.lang.Exception -> L9a
            long r10 = (long) r10     // Catch: java.lang.Exception -> L9a
            long r12 = (long) r7     // Catch: java.lang.Exception -> L9a
            long r3 = X.AMJ.A01(r8, r9, r10, r12)     // Catch: java.lang.Exception -> L9a
            long r0 = r0 + r3
            r2.A00 = r0     // Catch: java.lang.Exception -> L9a
            return
        L9a:
            r3 = move-exception
            X.7se r2 = r2.A0H
            if (r2 == 0) goto Laa
            r1 = 40000(0x9c40, float:5.6052E-41)
            X.9b8 r0 = new X.9b8
            r0.<init>(r1, r3)
            r2.A00(r0)
        Laa:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.RunnableC24878Azd.run():void");
    }
}
