package X;

import android.view.View;

/* renamed from: X.3fS, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC78603fS {
    /* JADX WARN: Code restructure failed: missing block: B:10:0x002a, code lost:
    
        if (X.C78613fT.A01(r11) < X.C78613fT.A01(r9)) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0038, code lost:
    
        if (r1 > r2) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0055, code lost:
    
        if (X.C78613fT.A00(r9) != ((int) (r13 & 4294967295L))) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006b, code lost:
    
        if (X.C78613fT.A00(r11) < X.C78613fT.A00(r9)) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x007c, code lost:
    
        if (r1 > r2) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0014, code lost:
    
        if (X.C78613fT.A01(r9) != X.AbstractC78683fa.A00(r13)) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean A02(long r9, long r11, long r13) {
        /*
            r8 = 1
            int r0 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r0 == 0) goto L8a
            boolean r0 = X.C78613fT.A08(r9)
            if (r0 == 0) goto L16
            int r1 = X.C78613fT.A01(r9)
            int r0 = X.AbstractC78683fa.A00(r13)
            r5 = 1
            if (r1 == r0) goto L17
        L16:
            r5 = 0
        L17:
            int r0 = X.C78613fT.A03(r11)
            int r4 = X.C78613fT.A03(r9)
            if (r0 > r4) goto L2c
            int r1 = X.C78613fT.A01(r11)
            int r0 = X.C78613fT.A01(r9)
            r3 = 1
            if (r1 >= r0) goto L2d
        L2c:
            r3 = 0
        L2d:
            int r2 = X.C78613fT.A01(r9)
            int r1 = X.AbstractC78683fa.A00(r13)
            if (r4 > r1) goto L3a
            r0 = 1
            if (r1 <= r2) goto L3b
        L3a:
            r0 = 0
        L3b:
            if (r5 != 0) goto L41
            if (r3 == 0) goto L8d
            if (r0 == 0) goto L8d
        L41:
            r7 = 1
        L42:
            boolean r0 = X.C78613fT.A07(r9)
            if (r0 == 0) goto L57
            int r6 = X.C78613fT.A00(r9)
            r3 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r1 = r13 & r3
            int r0 = (int) r1
            r5 = 1
            if (r6 == r0) goto L58
        L57:
            r5 = 0
        L58:
            int r0 = X.C78613fT.A02(r11)
            int r4 = X.C78613fT.A02(r9)
            if (r0 > r4) goto L6d
            int r1 = X.C78613fT.A00(r11)
            int r0 = X.C78613fT.A00(r9)
            r3 = 1
            if (r1 >= r0) goto L6e
        L6d:
            r3 = 0
        L6e:
            int r2 = X.C78613fT.A00(r9)
            r0 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r13 = r13 & r0
            int r1 = (int) r13
            if (r4 > r1) goto L7e
            r0 = 1
            if (r1 <= r2) goto L7f
        L7e:
            r0 = 0
        L7f:
            if (r5 != 0) goto L85
            if (r3 == 0) goto L8b
            if (r0 == 0) goto L8b
        L85:
            r0 = 1
        L86:
            if (r7 == 0) goto L8f
            if (r0 == 0) goto L8f
        L8a:
            return r8
        L8b:
            r0 = 0
            goto L86
        L8d:
            r7 = 0
            goto L42
        L8f:
            r8 = 0
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC78603fS.A02(long, long, long):boolean");
    }

    public static final int A00(long j) {
        int i;
        int A02 = C78613fT.A02(j);
        int A00 = C78613fT.A00(j);
        if (A02 == A00) {
            i = AbstractC63123SdR.MAX_SIGNED_POWER_OF_TWO;
        } else {
            i = Integer.MIN_VALUE;
            if (A00 == Integer.MAX_VALUE) {
                return View.MeasureSpec.makeMeasureSpec(0, 0);
            }
        }
        return View.MeasureSpec.makeMeasureSpec(A00, i);
    }

    public static final int A01(long j) {
        int i;
        int A03 = C78613fT.A03(j);
        int A01 = C78613fT.A01(j);
        if (A03 == A01) {
            i = AbstractC63123SdR.MAX_SIGNED_POWER_OF_TWO;
        } else {
            i = Integer.MIN_VALUE;
            if (A01 == Integer.MAX_VALUE) {
                return View.MeasureSpec.makeMeasureSpec(0, 0);
            }
        }
        return View.MeasureSpec.makeMeasureSpec(A01, i);
    }
}
