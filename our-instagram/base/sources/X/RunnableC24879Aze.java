package X;

/* renamed from: X.Aze, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24879Aze implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ int A03;
    public final /* synthetic */ C176087sR A04;
    public final /* synthetic */ byte[] A05;

    public RunnableC24879Aze(C176087sR c176087sR, byte[] bArr, int i, int i2, int i3, int i4) {
        this.A04 = c176087sR;
        this.A05 = bArr;
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
            X.7sR r0 = r14.A04
            X.7sN r8 = r0.A00
            X.AH7 r0 = r8.A0E
            if (r0 == 0) goto Lb
            X.AH7.A00(r0)
        Lb:
            boolean r0 = r8.A02     // Catch: java.lang.Exception -> L7b
            if (r0 != 0) goto L5a
            byte[] r3 = r14.A05     // Catch: java.lang.Exception -> L7b
            int r4 = r14.A03     // Catch: java.lang.Exception -> L7b
            int r5 = r14.A02     // Catch: java.lang.Exception -> L7b
            int r6 = r14.A01     // Catch: java.lang.Exception -> L7b
            int r7 = r14.A00     // Catch: java.lang.Exception -> L7b
            java.lang.ref.WeakReference r0 = r8.A07     // Catch: java.lang.Exception -> L7b
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Exception -> L7b
            X.7y3 r0 = (X.C179537y3) r0     // Catch: java.lang.Exception -> L7b
            if (r0 == 0) goto L48
            com.facebook.cameracore.mediapipeline.services.audio.interfaces.AudioPlatformComponentHost r2 = r0.A00()     // Catch: java.lang.Exception -> L7b
            com.facebook.cameracore.mediapipeline.services.audio.interfaces.AudioRenderCallback r1 = r8.A0G     // Catch: java.lang.Exception -> L7b
            if (r2 == 0) goto L48
            if (r1 == 0) goto L48
            java.util.WeakHashMap r0 = r8.A08     // Catch: java.lang.Exception -> L7b
            java.lang.Object r0 = r0.get(r2)     // Catch: java.lang.Exception -> L7b
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Exception -> L7b
            if (r0 == 0) goto L53
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Exception -> L7b
            if (r0 == 0) goto L53
        L3d:
            r0 = r2
            com.facebook.cameracore.mediapipeline.services.audio.implementation.AudioPlatformComponentHostImpl r0 = (com.facebook.cameracore.mediapipeline.services.audio.implementation.AudioPlatformComponentHostImpl) r0     // Catch: java.lang.Exception -> L7b
            r0.mRenderCallback = r1     // Catch: java.lang.Exception -> L7b
            boolean r0 = r2.onInputDataAvailable(r3, r4, r5, r6, r7)     // Catch: java.lang.Exception -> L7b
            if (r0 != 0) goto L8b
        L48:
            X.AC7 r0 = r8.A0F     // Catch: java.lang.Exception -> L7b
            if (r0 == 0) goto L4f
            r0.A01(r3, r7)     // Catch: java.lang.Exception -> L7b
        L4f:
            X.C176047sN.A01(r8)     // Catch: java.lang.Exception -> L7b
            goto L72
        L53:
            boolean r0 = X.C176047sN.A03(r8)     // Catch: java.lang.Exception -> L7b
            if (r0 == 0) goto L48
            goto L3d
        L5a:
            X.AC7 r2 = r8.A0F     // Catch: java.lang.Exception -> L7b
            if (r2 == 0) goto L65
            byte[] r1 = r14.A05     // Catch: java.lang.Exception -> L7b
            int r0 = r14.A00     // Catch: java.lang.Exception -> L7b
            r2.A01(r1, r0)     // Catch: java.lang.Exception -> L7b
        L65:
            X.C176047sN.A01(r8)     // Catch: java.lang.Exception -> L7b
            byte[] r3 = r14.A05     // Catch: java.lang.Exception -> L7b
            int r4 = r14.A03     // Catch: java.lang.Exception -> L7b
            int r5 = r14.A02     // Catch: java.lang.Exception -> L7b
            int r6 = r14.A01     // Catch: java.lang.Exception -> L7b
            int r7 = r14.A00     // Catch: java.lang.Exception -> L7b
        L72:
            r9 = r3
            r10 = r4
            r11 = r5
            r12 = r6
            r13 = r7
            X.C176047sN.A02(r8, r9, r10, r11, r12, r13)     // Catch: java.lang.Exception -> L7b
            return
        L7b:
            r3 = move-exception
            X.7se r2 = r8.A0H
            if (r2 == 0) goto L8b
            r1 = 40000(0x9c40, float:5.6052E-41)
            X.9b8 r0 = new X.9b8
            r0.<init>(r1, r3)
            r2.A00(r0)
        L8b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.RunnableC24879Aze.run():void");
    }
}
