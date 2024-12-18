package X;

/* loaded from: classes11.dex */
public abstract class VKR {
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001c, code lost:
    
        if (r3 > 1.0f) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A00(android.text.TextPaint r2, float r3) {
        /*
            boolean r0 = java.lang.Float.isNaN(r3)
            if (r0 != 0) goto L19
            r0 = 0
            r1 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 >= 0) goto L1a
            r3 = 0
        Le:
            r1 = r3
        Lf:
            r0 = 1132396544(0x437f0000, float:255.0)
            float r1 = r1 * r0
            int r0 = java.lang.Math.round(r1)
            r2.setAlpha(r0)
        L19:
            return
        L1a:
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto Le
            goto Lf
        */
        throw new UnsupportedOperationException("Method not decompiled: X.VKR.A00(android.text.TextPaint, float):void");
    }
}
