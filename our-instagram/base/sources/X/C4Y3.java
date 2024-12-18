package X;

import java.io.IOException;

/* renamed from: X.4Y3, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4Y3 extends C4Y4 {
    public final int A00;
    public final int A01;
    public final int A02;
    public final C4B6 A03;
    public final C4WY A04;
    public final String A05;
    public final boolean A06;

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0014, code lost:
    
        if (r18 == 1) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C4Y3(X.C4B6 r12, X.C4WY r13, java.lang.String r14, java.lang.String r15, java.lang.Throwable r16, int r17, int r18, int r19, int r20, long r21, boolean r23) {
        /*
            r11 = this;
            r5 = r11
            r6 = r14
            r7 = r16
            r8 = r17
            r9 = r21
            r5.<init>(r6, r7, r8, r9)
            r2 = 0
            r1 = 1
            r4 = r18
            r3 = r23
            if (r23 == 0) goto L16
            r0 = 0
            if (r4 != r1) goto L17
        L16:
            r0 = 1
        L17:
            X.C4B8.A03(r0)
            if (r16 != 0) goto L1f
            r0 = 3
            if (r4 != r0) goto L20
        L1f:
            r2 = 1
        L20:
            X.C4B8.A03(r2)
            r11.A02 = r4
            r11.A05 = r15
            r0 = r19
            r11.A01 = r0
            r11.A03 = r12
            r0 = r20
            r11.A00 = r0
            r11.A04 = r13
            r11.A06 = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4Y3.<init>(X.4B6, X.4WY, java.lang.String, java.lang.String, java.lang.Throwable, int, int, int, int, long, boolean):void");
    }

    public static C4Y3 A00(IOException iOException, int i) {
        return new C4Y3(null, null, iOException, 0, i, -1, 4, false);
    }

    public static C4Y3 A01(RuntimeException runtimeException, int i) {
        return new C4Y3(null, null, runtimeException, 2, i, -1, 4, false);
    }

    public final C4Y3 A02(C4WY c4wy) {
        String message = getMessage();
        Throwable cause = getCause();
        int i = super.A00;
        int i2 = this.A02;
        return new C4Y3(this.A03, c4wy, message, this.A05, cause, i, i2, this.A01, this.A00, super.A01, this.A06);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C4Y3(X.C4B6 r15, java.lang.String r16, java.lang.Throwable r17, int r18, int r19, int r20, int r21, boolean r22) {
        /*
            r14 = this;
            r3 = 0
            r2 = r15
            r5 = r16
            r6 = r17
            r8 = r18
            r9 = r20
            r10 = r21
            if (r17 == 0) goto L21
            java.lang.String r4 = r6.getMessage()
            if (r4 == 0) goto L21
        L14:
            long r11 = android.os.SystemClock.elapsedRealtime()
            r1 = r14
            r7 = r19
            r13 = r22
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r13)
            return
        L21:
            if (r18 == 0) goto L62
            r0 = 1
            if (r8 == r0) goto L39
            r0 = 1837(0x72d, float:2.574E-42)
            java.lang.String r4 = X.AbstractC111324zv.A00(r0)
        L2c:
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L14
            java.lang.String r0 = ": "
            java.lang.String r4 = X.AnonymousClass001.A0g(r4, r0, r3)
            goto L14
        L39:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r5)
            java.lang.String r0 = " error, index="
            r1.append(r0)
            r1.append(r9)
            java.lang.String r0 = ", format="
            r1.append(r0)
            r1.append(r15)
            java.lang.String r0 = ", format_supported="
            r1.append(r0)
            java.lang.String r0 = com.google.android.exoplayer2.util.Util.A0B(r10)
            r1.append(r0)
            java.lang.String r4 = r1.toString()
            goto L2c
        L62:
            java.lang.String r4 = "Source error"
            goto L2c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4Y3.<init>(X.4B6, java.lang.String, java.lang.Throwable, int, int, int, int, boolean):void");
    }
}
