package X;

import android.os.Handler;

/* loaded from: classes12.dex */
public final class YI1 implements Runnable {
    public final /* synthetic */ Handler A00;
    public final /* synthetic */ Y9S A01;
    public final /* synthetic */ InterfaceC176207sd A02;

    public YI1(Handler handler, Y9S y9s, InterfaceC176207sd interfaceC176207sd) {
        this.A01 = y9s;
        this.A02 = interfaceC176207sd;
        this.A00 = handler;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x004a A[Catch: Exception -> 0x0072, all -> 0x0081, TryCatch #1 {Exception -> 0x0072, blocks: (B:3:0x0007, B:5:0x000b, B:7:0x0012, B:9:0x0018, B:10:0x001d, B:12:0x0029, B:16:0x0035, B:17:0x003d, B:18:0x0046, B:20:0x004a, B:22:0x004e, B:27:0x0063, B:29:0x0059), top: B:2:0x0007, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0063 A[Catch: Exception -> 0x0072, all -> 0x0081, TRY_LEAVE, TryCatch #1 {Exception -> 0x0072, blocks: (B:3:0x0007, B:5:0x000b, B:7:0x0012, B:9:0x0018, B:10:0x001d, B:12:0x0029, B:16:0x0035, B:17:0x003d, B:18:0x0046, B:20:0x004a, B:22:0x004e, B:27:0x0063, B:29:0x0059), top: B:2:0x0007, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0059 A[Catch: Exception -> 0x0072, all -> 0x0081, TryCatch #1 {Exception -> 0x0072, blocks: (B:3:0x0007, B:5:0x000b, B:7:0x0012, B:9:0x0018, B:10:0x001d, B:12:0x0029, B:16:0x0035, B:17:0x003d, B:18:0x0046, B:20:0x004a, B:22:0x004e, B:27:0x0063, B:29:0x0059), top: B:2:0x0007, outer: #0 }] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r7 = this;
            X.Y9S r3 = r7.A01
            X.7sd r5 = r7.A02
            android.os.Handler r4 = r7.A00
            r2 = 0
            boolean r0 = r3 instanceof X.C72169XRd     // Catch: java.lang.Exception -> L72 java.lang.Throwable -> L81
            if (r0 == 0) goto L1d
            r6 = r3
            X.XRd r6 = (X.C72169XRd) r6     // Catch: java.lang.Exception -> L72 java.lang.Throwable -> L81
            android.media.MediaCodec r0 = r6.A01     // Catch: java.lang.Exception -> L72 java.lang.Throwable -> L81
            if (r0 == 0) goto L1d
            java.lang.Integer r1 = r6.A08     // Catch: java.lang.Exception -> L72 java.lang.Throwable -> L81
            java.lang.Integer r0 = X.C05F.A0C     // Catch: java.lang.Exception -> L72 java.lang.Throwable -> L81
            if (r1 != r0) goto L1d
            android.media.MediaCodec r0 = r6.A01     // Catch: java.lang.Exception -> L72 java.lang.Throwable -> L81
            X.C72169XRd.A00(r0, r6)     // Catch: java.lang.Exception -> L72 java.lang.Throwable -> L81
        L1d:
            X.7w7 r1 = r3.A05     // Catch: java.lang.Exception -> L72 java.lang.Throwable -> L81
            r0 = 119(0x77, float:1.67E-43)
            boolean r6 = r1.CUZ(r0)     // Catch: java.lang.Exception -> L72 java.lang.Throwable -> L81
            android.media.MediaCodec r0 = r3.A01     // Catch: java.lang.Exception -> L72 java.lang.Throwable -> L81
            if (r0 == 0) goto L64
            java.lang.Integer r0 = r3.A08     // Catch: java.lang.Exception -> L72 java.lang.Throwable -> L81
            java.lang.Integer r1 = X.C05F.A0C     // Catch: java.lang.Exception -> L72 java.lang.Throwable -> L81
            if (r0 != r1) goto L32
            if (r6 != 0) goto L46
            goto L35
        L32:
            if (r6 != 0) goto L46
            goto L3d
        L35:
            android.media.MediaCodec r1 = r3.A01     // Catch: java.lang.Exception -> L72 java.lang.Throwable -> L81
            r0 = 1783857468(0x6a53813c, float:6.392341E25)
            X.C0fT.A06(r1, r0)     // Catch: java.lang.Exception -> L72 java.lang.Throwable -> L81
        L3d:
            android.media.MediaCodec r1 = r3.A01     // Catch: java.lang.Exception -> L72 java.lang.Throwable -> L81
            r0 = -1048103367(0xffffffffc1873639, float:-16.901476)
            X.C0fT.A03(r1, r0)     // Catch: java.lang.Exception -> L72 java.lang.Throwable -> L81
            goto L64
        L46:
            java.lang.Integer r0 = r3.A08     // Catch: java.lang.Exception -> L72 java.lang.Throwable -> L81
            if (r0 != r1) goto L59
            android.media.MediaCodec r0 = r3.A01     // Catch: java.lang.Exception -> L72 java.lang.Throwable -> L81
            if (r0 == 0) goto L64
            java.lang.Exception r1 = X.Y2X.A01(r0)     // Catch: java.lang.Exception -> L72 java.lang.Throwable -> L81
            java.lang.Exception r0 = X.Y2X.A00(r0)     // Catch: java.lang.Exception -> L72 java.lang.Throwable -> L81
            if (r1 != 0) goto L61
            goto L60
        L59:
            android.media.MediaCodec r0 = r3.A01     // Catch: java.lang.Exception -> L72 java.lang.Throwable -> L81
            java.lang.Exception r1 = X.Y2X.A00(r0)     // Catch: java.lang.Exception -> L72 java.lang.Throwable -> L81
            goto L61
        L60:
            r1 = r0
        L61:
            if (r1 == 0) goto L64
            throw r1     // Catch: java.lang.Exception -> L72 java.lang.Throwable -> L81
        L64:
            java.lang.Integer r0 = X.C05F.A00
            r3.A08 = r0
            r3.A01 = r2
            r3.A00 = r2
            r3.A02 = r2
            X.AbstractC72880XqE.A00(r4, r5)
            return
        L72:
            r0 = move-exception
            X.AbstractC72880XqE.A01(r4, r5, r0)     // Catch: java.lang.Throwable -> L81
            java.lang.Integer r0 = X.C05F.A00
            r3.A08 = r0
            r3.A01 = r2
            r3.A00 = r2
            r3.A02 = r2
            return
        L81:
            r1 = move-exception
            java.lang.Integer r0 = X.C05F.A00
            r3.A08 = r0
            r3.A01 = r2
            r3.A00 = r2
            r3.A02 = r2
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.YI1.run():void");
    }
}
