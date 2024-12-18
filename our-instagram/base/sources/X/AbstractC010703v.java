package X;

import android.content.res.Resources;

/* renamed from: X.03v, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC010703v {
    public static int A02(Resources resources, YND ynd, int i, int i2) {
        int dimensionPixelSize;
        if (i != -1) {
            if (i != 0 && (dimensionPixelSize = resources.getDimensionPixelSize(i)) >= 0) {
                return dimensionPixelSize;
            }
            return i2;
        }
        return ynd.AXP().intValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0016, code lost:
    
        if (r1 == null) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int A00(android.content.Context r5, final android.view.ViewConfiguration r6, int r7, int r8, int r9) {
        /*
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 34
            if (r1 < r0) goto Lb
            int r0 = X.AbstractC010603u.A00(r6, r7, r8, r9)
            return r0
        Lb:
            android.view.InputDevice r0 = android.view.InputDevice.getDevice(r7)
            if (r0 == 0) goto L18
            android.view.InputDevice$MotionRange r1 = r0.getMotionRange(r8, r9)
            r0 = 1
            if (r1 != 0) goto L19
        L18:
            r0 = 0
        L19:
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 != 0) goto L1e
            return r4
        L1e:
            android.content.res.Resources r3 = r5.getResources()
            r0 = 4194304(0x400000, float:5.877472E-39)
            if (r9 != r0) goto L42
            r0 = 26
            if (r8 != r0) goto L42
            java.lang.String r2 = "config_viewMaxRotaryEncoderFlingVelocity"
            java.lang.String r1 = "dimen"
            java.lang.String r0 = "android"
            int r1 = r3.getIdentifier(r2, r1, r0)
        L35:
            r6.getClass()
            X.03r r0 = new X.03r
            r0.<init>()
            int r0 = A02(r3, r0, r1, r4)
            return r0
        L42:
            r1 = -1
            goto L35
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC010703v.A00(android.content.Context, android.view.ViewConfiguration, int, int, int):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0016, code lost:
    
        if (r1 == null) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int A01(android.content.Context r5, final android.view.ViewConfiguration r6, int r7, int r8, int r9) {
        /*
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 34
            if (r1 < r0) goto Lb
            int r0 = X.AbstractC010603u.A01(r6, r7, r8, r9)
            return r0
        Lb:
            android.view.InputDevice r0 = android.view.InputDevice.getDevice(r7)
            if (r0 == 0) goto L18
            android.view.InputDevice$MotionRange r1 = r0.getMotionRange(r8, r9)
            r0 = 1
            if (r1 != 0) goto L19
        L18:
            r0 = 0
        L19:
            r4 = 2147483647(0x7fffffff, float:NaN)
            if (r0 != 0) goto L1f
            return r4
        L1f:
            android.content.res.Resources r3 = r5.getResources()
            r0 = 4194304(0x400000, float:5.877472E-39)
            if (r9 != r0) goto L43
            r0 = 26
            if (r8 != r0) goto L43
            java.lang.String r2 = "config_viewMinRotaryEncoderFlingVelocity"
            java.lang.String r1 = "dimen"
            java.lang.String r0 = "android"
            int r1 = r3.getIdentifier(r2, r1, r0)
        L36:
            r6.getClass()
            X.03q r0 = new X.03q
            r0.<init>()
            int r0 = A02(r3, r0, r1, r4)
            return r0
        L43:
            r1 = -1
            goto L36
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC010703v.A01(android.content.Context, android.view.ViewConfiguration, int, int, int):int");
    }
}
