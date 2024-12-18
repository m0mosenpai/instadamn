package X;

import android.os.Handler;
import android.util.Pair;
import java.util.ArrayDeque;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.5T1, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5T1 {
    public Pair A00;
    public CopyOnWriteArrayList A01;
    public Handler A03;
    public final C117385Sx A05;
    public final C4U1 A06;
    public final ArrayDeque A08 = new ArrayDeque();
    public final ArrayDeque A07 = new ArrayDeque();
    public boolean A02 = true;
    public C4U9 A04 = C4U9.A04;

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0027, code lost:
    
        if (r1 == 6) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A00(X.C4B6 r9) {
        /*
            r8 = this;
            boolean r0 = r8.A02
            r4 = 0
            if (r0 == 0) goto Lb
            java.util.concurrent.CopyOnWriteArrayList r0 = r8.A01
            if (r0 != 0) goto Lc
            r8.A02 = r4
        Lb:
            return
        Lc:
            r2 = 0
            android.os.Looper r1 = android.os.Looper.myLooper()
            X.C4B8.A01(r1)
            android.os.Handler r0 = new android.os.Handler
            r0.<init>(r1, r2)
            r8.A03 = r0
            X.5Sx r3 = r8.A05
            com.google.android.exoplayer2.video.ColorInfo r7 = r9.A0Q
            if (r7 == 0) goto L2d
            int r1 = r7.A03
            r0 = 7
            if (r1 == r0) goto L30
            r0 = 6
            if (r1 != r0) goto L2d
        L29:
            android.util.Pair.create(r7, r7)
            goto L3f
        L2d:
            com.google.android.exoplayer2.video.ColorInfo r7 = com.google.android.exoplayer2.video.ColorInfo.A05
            goto L29
        L30:
            int r6 = r7.A02
            int r5 = r7.A01
            byte[] r2 = r7.A04
            r1 = 6
            com.google.android.exoplayer2.video.ColorInfo r0 = new com.google.android.exoplayer2.video.ColorInfo
            r0.<init>(r6, r5, r1, r2)
            android.util.Pair.create(r7, r0)
        L3f:
            X.AbstractC62385S9k.A00()     // Catch: java.lang.Exception -> L67
            java.lang.reflect.Constructor r1 = X.AbstractC62385S9k.A01     // Catch: java.lang.Exception -> L67
            java.lang.Object[] r0 = new java.lang.Object[r4]     // Catch: java.lang.Exception -> L67
            java.lang.Object r2 = r1.newInstance(r0)     // Catch: java.lang.Exception -> L67
            java.lang.reflect.Method r1 = X.AbstractC62385S9k.A03     // Catch: java.lang.Exception -> L67
            java.lang.Object[] r0 = new java.lang.Object[r4]     // Catch: java.lang.Exception -> L67
            java.lang.Object r0 = r1.invoke(r2, r0)     // Catch: java.lang.Exception -> L67
            r0.getClass()     // Catch: java.lang.Exception -> L67
            java.util.concurrent.CopyOnWriteArrayList r0 = r8.A01     // Catch: java.lang.Exception -> L67
            r0.getClass()     // Catch: java.lang.Exception -> L67
            android.os.Handler r0 = r8.A03     // Catch: java.lang.Exception -> L67
            r0.getClass()     // Catch: java.lang.Exception -> L67
            java.lang.String r1 = "create"
            java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch: java.lang.Exception -> L67
            r0.<init>(r1)     // Catch: java.lang.Exception -> L67
            throw r0     // Catch: java.lang.Exception -> L67
        L67:
            r1 = move-exception
            r0 = 7000(0x1b58, float:9.809E-42)
            X.4Y3 r0 = r3.A0F(r9, r1, r0, r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5T1.A00(X.4B6):void");
    }

    public C5T1(C117385Sx c117385Sx, C4U1 c4u1) {
        this.A06 = c4u1;
        this.A05 = c117385Sx;
    }
}
