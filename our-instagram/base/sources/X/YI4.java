package X;

import android.os.Handler;

/* loaded from: classes12.dex */
public final class YI4 implements Runnable {
    public final /* synthetic */ Handler A00;
    public final /* synthetic */ Y9T A01;
    public final /* synthetic */ InterfaceC176207sd A02;

    public YI4(Handler handler, Y9T y9t, InterfaceC176207sd interfaceC176207sd) {
        this.A01 = y9t;
        this.A02 = interfaceC176207sd;
        this.A00 = handler;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x006f A[Catch: Exception -> 0x009c, all -> 0x00b0, TryCatch #1 {Exception -> 0x009c, blocks: (B:3:0x0018, B:5:0x001c, B:7:0x0022, B:9:0x0034, B:10:0x0051, B:13:0x005a, B:14:0x0062, B:15:0x006b, B:17:0x006f, B:19:0x0073, B:24:0x0088, B:26:0x007e, B:27:0x004b), top: B:2:0x0018, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0088 A[Catch: Exception -> 0x009c, all -> 0x00b0, TRY_LEAVE, TryCatch #1 {Exception -> 0x009c, blocks: (B:3:0x0018, B:5:0x001c, B:7:0x0022, B:9:0x0034, B:10:0x0051, B:13:0x005a, B:14:0x0062, B:15:0x006b, B:17:0x006f, B:19:0x0073, B:24:0x0088, B:26:0x007e, B:27:0x004b), top: B:2:0x0018, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007e A[Catch: Exception -> 0x009c, all -> 0x00b0, TryCatch #1 {Exception -> 0x009c, blocks: (B:3:0x0018, B:5:0x001c, B:7:0x0022, B:9:0x0034, B:10:0x0051, B:13:0x005a, B:14:0x0062, B:15:0x006b, B:17:0x006f, B:19:0x0073, B:24:0x0088, B:26:0x007e, B:27:0x004b), top: B:2:0x0018, outer: #0 }] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r17 = this;
            r0 = r17
            X.Y9T r4 = r0.A01
            X.7sd r6 = r0.A02
            android.os.Handler r5 = r0.A00
            X.7s7 r3 = r4.A04
            java.lang.String r0 = "sAEi"
            r3.A01(r0)
            X.7w7 r1 = r4.A06
            r0 = 119(0x77, float:1.67E-43)
            boolean r9 = r1.CUZ(r0)
            r2 = 0
            android.media.MediaCodec r0 = r4.A01     // Catch: java.lang.Exception -> L9c java.lang.Throwable -> Lb0
            if (r0 == 0) goto L89
            java.lang.Integer r0 = r4.A0B     // Catch: java.lang.Exception -> L9c java.lang.Throwable -> Lb0
            java.lang.Integer r7 = X.C05F.A0C     // Catch: java.lang.Exception -> L9c java.lang.Throwable -> Lb0
            if (r0 != r7) goto L57
            java.lang.String r0 = "sAEdq"
            r3.A01(r0)     // Catch: java.lang.Exception -> L9c java.lang.Throwable -> Lb0
            android.media.MediaCodec r8 = r4.A01     // Catch: java.lang.Exception -> L9c java.lang.Throwable -> Lb0
            X.7uq r0 = r4.A05     // Catch: java.lang.Exception -> L9c java.lang.Throwable -> Lb0
            int r0 = r0.A04     // Catch: java.lang.Exception -> L9c java.lang.Throwable -> Lb0
            long r0 = (long) r0     // Catch: java.lang.Exception -> L9c java.lang.Throwable -> Lb0
            int r11 = r8.dequeueInputBuffer(r0)     // Catch: java.lang.Exception -> L9c java.lang.Throwable -> Lb0
            if (r11 < 0) goto L4b
            java.lang.String r0 = "sAEq"
            r3.A01(r0)     // Catch: java.lang.Exception -> L9c java.lang.Throwable -> Lb0
            android.media.MediaCodec r10 = r4.A01     // Catch: java.lang.Exception -> L9c java.lang.Throwable -> Lb0
            r12 = 0
            r14 = 0
            r16 = 4
            r13 = r12
            r10.queueInputBuffer(r11, r12, r13, r14, r16)     // Catch: java.lang.Exception -> L9c java.lang.Throwable -> Lb0
            java.lang.String r0 = "sAEpT"
            r3.A01(r0)     // Catch: java.lang.Exception -> L9c java.lang.Throwable -> Lb0
            r0 = 1
            goto L51
        L4b:
            java.lang.String r0 = "sAEpF"
            r3.A01(r0)     // Catch: java.lang.Exception -> L9c java.lang.Throwable -> Lb0
            r0 = 0
        L51:
            X.Y9T.A00(r4, r0)     // Catch: java.lang.Exception -> L9c java.lang.Throwable -> Lb0
            if (r9 != 0) goto L6b
            goto L5a
        L57:
            if (r9 != 0) goto L6b
            goto L62
        L5a:
            android.media.MediaCodec r1 = r4.A01     // Catch: java.lang.Exception -> L9c java.lang.Throwable -> Lb0
            r0 = 1699712939(0x654f8fab, float:6.1261254E22)
            X.C0fT.A06(r1, r0)     // Catch: java.lang.Exception -> L9c java.lang.Throwable -> Lb0
        L62:
            android.media.MediaCodec r1 = r4.A01     // Catch: java.lang.Exception -> L9c java.lang.Throwable -> Lb0
            r0 = -1011709272(0xffffffffc3b28aa8, float:-357.08325)
            X.C0fT.A03(r1, r0)     // Catch: java.lang.Exception -> L9c java.lang.Throwable -> Lb0
            goto L89
        L6b:
            java.lang.Integer r0 = r4.A0B     // Catch: java.lang.Exception -> L9c java.lang.Throwable -> Lb0
            if (r0 != r7) goto L7e
            android.media.MediaCodec r0 = r4.A01     // Catch: java.lang.Exception -> L9c java.lang.Throwable -> Lb0
            if (r0 == 0) goto L89
            java.lang.Exception r1 = X.Y2X.A01(r0)     // Catch: java.lang.Exception -> L9c java.lang.Throwable -> Lb0
            java.lang.Exception r0 = X.Y2X.A00(r0)     // Catch: java.lang.Exception -> L9c java.lang.Throwable -> Lb0
            if (r1 != 0) goto L86
            goto L85
        L7e:
            android.media.MediaCodec r0 = r4.A01     // Catch: java.lang.Exception -> L9c java.lang.Throwable -> Lb0
            java.lang.Exception r1 = X.Y2X.A00(r0)     // Catch: java.lang.Exception -> L9c java.lang.Throwable -> Lb0
            goto L86
        L85:
            r1 = r0
        L86:
            if (r1 == 0) goto L89
            throw r1     // Catch: java.lang.Exception -> L9c java.lang.Throwable -> Lb0
        L89:
            java.lang.Integer r0 = X.C05F.A00
            r4.A0B = r0
            r4.A01 = r2
            r4.A00 = r2
            r4.A02 = r2
            java.lang.String r0 = "sAEs"
            r3.A01(r0)
            X.AbstractC72880XqE.A00(r5, r6)
            return
        L9c:
            r1 = move-exception
            java.lang.String r0 = "sAEe"
            r3.A01(r0)     // Catch: java.lang.Throwable -> Lb0
            X.AbstractC72880XqE.A01(r5, r6, r1)     // Catch: java.lang.Throwable -> Lb0
            java.lang.Integer r0 = X.C05F.A00
            r4.A0B = r0
            r4.A01 = r2
            r4.A00 = r2
            r4.A02 = r2
            return
        Lb0:
            r1 = move-exception
            java.lang.Integer r0 = X.C05F.A00
            r4.A0B = r0
            r4.A01 = r2
            r4.A00 = r2
            r4.A02 = r2
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.YI4.run():void");
    }
}
