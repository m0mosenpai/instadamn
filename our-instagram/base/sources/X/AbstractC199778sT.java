package X;

/* renamed from: X.8sT, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC199778sT {
    public static Boolean A00;
    public static final float[] A03 = new float[16];
    public static final float[] A01 = {0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 1.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f};
    public static final float[] A02 = {-0.5f, -0.5f, 0.0f, 1.0f, -0.5f, 0.5f, 0.0f, 1.0f, 0.5f, -0.5f, 0.0f, 1.0f, 0.5f, 0.5f, 0.0f, 1.0f};

    /* JADX WARN: Removed duplicated region for block: B:23:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean A00(float[] r15, boolean r16) {
        /*
            r11 = 0
            r12 = r15
            X.C14360o3.A0B(r15, r11)
            java.lang.Boolean r0 = X.AbstractC199778sT.A00
            if (r0 == 0) goto L16
            boolean r10 = r0.booleanValue()
            float[] r0 = X.AbstractC199778sT.A03
            boolean r0 = java.util.Arrays.equals(r0, r15)
            if (r0 == 0) goto L16
            return r10
        L16:
            if (r16 == 0) goto L8c
            float[] r14 = X.AbstractC199778sT.A02
        L1a:
            r3 = 16
            float[] r10 = new float[r3]
            r2 = 0
            r13 = r11
            r15 = r11
            android.opengl.Matrix.multiplyMM(r10, r11, r12, r13, r14, r15)
            r7 = 1
            r5 = 1
            r6 = 2139095039(0x7f7fffff, float:3.4028235E38)
            r4 = 2139095039(0x7f7fffff, float:3.4028235E38)
        L2c:
            int r1 = r2 * 4
            int r0 = r1 + 1
            r1 = r10[r1]
            float r6 = java.lang.Math.min(r1, r6)
            r0 = r10[r0]
            float r7 = java.lang.Math.max(r0, r7)
            float r5 = java.lang.Math.max(r1, r5)
            float r4 = java.lang.Math.min(r0, r4)
            int r2 = r2 + 1
            r0 = 4
            if (r2 < r0) goto L2c
            r10 = 1
            if (r16 == 0) goto L77
            double r0 = (double) r6
            r8 = -4620693127610138624(0xbfe00014f8b58000, double:-0.5000099999997474)
            int r2 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r2 <= 0) goto L6b
            double r1 = (double) r5
            r5 = 4602678909244637184(0x3fe00014f8b58000, double:0.5000099999997474)
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 >= 0) goto L6b
            double r1 = (double) r7
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 >= 0) goto L6b
            double r1 = (double) r4
            int r0 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
        L68:
            if (r0 <= 0) goto L6b
            r10 = 0
        L6b:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r10)
            X.AbstractC199778sT.A00 = r0
            float[] r0 = X.AbstractC199778sT.A03
            java.lang.System.arraycopy(r12, r11, r0, r11, r3)
            return r10
        L77:
            r2 = -1222130260(0xffffffffb727c5ac, float:-1.0E-5)
            int r0 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r0 <= 0) goto L6b
            r1 = 1065353300(0x3f800054, float:1.00001)
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 >= 0) goto L6b
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 >= 0) goto L6b
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            goto L68
        L8c:
            float[] r14 = X.AbstractC199778sT.A01
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC199778sT.A00(float[], boolean):boolean");
    }
}
