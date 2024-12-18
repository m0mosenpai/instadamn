package X;

/* renamed from: X.BHg, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC25288BHg {
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0024, code lost:
    
        if (r3 > 1.0000008f) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x000c, code lost:
    
        if (r3 < (-8.34465E-7f)) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x000e, code lost:
    
        r3 = Float.NaN;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int A00(float[] r2, float r3, int r4) {
        /*
            r1 = 1065353216(0x3f800000, float:1.0)
            r0 = 0
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 >= 0) goto L19
            r0 = -1251999744(0xffffffffb5600000, float:-8.34465E-7)
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            r3 = 0
            if (r0 >= 0) goto L10
        Le:
            r3 = 2143289344(0x7fc00000, float:NaN)
        L10:
            r2[r4] = r3
            boolean r0 = java.lang.Float.isNaN(r3)
            r0 = r0 ^ 1
            return r0
        L19:
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L10
            r0 = 1065353223(0x3f800007, float:1.0000008)
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            r3 = 1065353216(0x3f800000, float:1.0)
            if (r0 <= 0) goto L10
            goto Le
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC25288BHg.A00(float[], float, int):int");
    }
}
