package X;

/* renamed from: X.ADt, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC23037ADt {
    /* JADX WARN: Removed duplicated region for block: B:32:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:4:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final android.graphics.Rect A01(android.content.Context r7, java.lang.Integer r8, float r9, int r10, int r11, boolean r12) {
        /*
            r0 = 5
            X.C14360o3.A0B(r8, r0)
            r3 = 1065353216(0x3f800000, float:1.0)
            float r0 = X.AbstractC166987dD.A01(r9, r3)
            double r0 = (double) r0
            r4 = 4587366580439587226(0x3fa999999999999a, double:0.05)
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            int r6 = r8.intValue()
            if (r2 >= 0) goto L70
            switch(r6) {
                case 1: goto L6c;
                case 2: goto L1b;
                case 3: goto L78;
                case 4: goto L7c;
                case 5: goto L1b;
                case 6: goto L7c;
                case 7: goto L7f;
                default: goto L1b;
            }
        L1b:
            r2 = 1065353216(0x3f800000, float:1.0)
        L1d:
            int r1 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            float r0 = (float) r10
            float r0 = r0 * r2
            int r5 = (int) r0
            float r0 = (float) r5
            if (r1 > 0) goto L67
            float r3 = r3 / r9
            float r0 = r0 * r3
            int r0 = (int) r0
        L28:
            switch(r6) {
                case 1: goto L64;
                case 2: goto L2b;
                case 3: goto L64;
                case 4: goto L2b;
                case 5: goto L2b;
                case 6: goto L64;
                default: goto L2b;
            }
        L2b:
            r1 = 0
        L2c:
            int r4 = X.AbstractC166987dD.A0C(r7, r1)
            if (r12 != 0) goto L35
            switch(r6) {
                case 1: goto L60;
                case 2: goto L35;
                case 3: goto L60;
                case 4: goto L35;
                case 5: goto L35;
                case 6: goto L60;
                default: goto L35;
            }
        L35:
            float r2 = (float) r11
            switch(r6) {
                case 1: goto L51;
                case 2: goto L39;
                case 3: goto L55;
                case 4: goto L59;
                case 5: goto L39;
                case 6: goto L5c;
                default: goto L39;
            }
        L39:
            r1 = 0
        L3a:
            float r2 = r2 * r1
            int r3 = (int) r2
            int r5 = r5 + r4
            float r2 = (float) r3
            float r1 = (float) r0
            switch(r6) {
                case 2: goto L4c;
                case 3: goto L42;
                case 4: goto L42;
                case 5: goto L4c;
                case 6: goto L42;
                case 7: goto L4f;
                default: goto L42;
            }
        L42:
            r0 = 1065353216(0x3f800000, float:1.0)
        L44:
            float r1 = r1 * r0
            float r2 = r2 + r1
            int r0 = (int) r2
            android.graphics.Rect r0 = X.AbstractC166987dD.A0V(r4, r3, r5, r0)
            return r0
        L4c:
            r0 = 1056964608(0x3f000000, float:0.5)
            goto L44
        L4f:
            r0 = 0
            goto L44
        L51:
            r1 = 1041865114(0x3e19999a, float:0.15)
            goto L3a
        L55:
            r1 = 1036831949(0x3dcccccd, float:0.1)
            goto L3a
        L59:
            r1 = 1048576000(0x3e800000, float:0.25)
            goto L3a
        L5c:
            r1 = 1036160860(0x3dc28f5c, float:0.095)
            goto L3a
        L60:
            int r10 = r10 - r4
            int r4 = r10 - r5
            goto L35
        L64:
            r1 = 20
            goto L2c
        L67:
            float r0 = r0 * r9
            int r1 = (int) r0
            r0 = r5
            r5 = r1
            goto L28
        L6c:
            r2 = 1053609165(0x3ecccccd, float:0.4)
            goto L1d
        L70:
            switch(r6) {
                case 1: goto L74;
                case 2: goto L73;
                case 3: goto L78;
                case 4: goto L7c;
                case 5: goto L73;
                case 6: goto L7c;
                case 7: goto L7f;
                default: goto L73;
            }
        L73:
            goto L1b
        L74:
            r2 = 1051260355(0x3ea8f5c3, float:0.33)
            goto L1d
        L78:
            r2 = 1055286886(0x3ee66666, float:0.45)
            goto L1d
        L7c:
            r2 = 1056964608(0x3f000000, float:0.5)
            goto L1d
        L7f:
            r2 = 0
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC23037ADt.A01(android.content.Context, java.lang.Integer, float, int, int, boolean):android.graphics.Rect");
    }

    public static final float A00(float f, float f2) {
        float f3 = f2 % 360.0f;
        float A01 = AbstractC166987dD.A01(f % 360.0f, f3);
        float f4 = f3 + 360.0f;
        float f5 = f3 - 360.0f;
        float abs = Math.abs(f4);
        if (abs < A01) {
            f3 = f4;
            A01 = abs;
        }
        if (Math.abs(f5) >= A01) {
            return f3;
        }
        return f5;
    }
}
