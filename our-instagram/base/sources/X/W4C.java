package X;

import android.util.LruCache;

/* loaded from: classes11.dex */
public final class W4C {
    public static final long A01 = C36H.A03(C36G.A04, 2);
    public final LruCache A00 = new LruCache(20);

    /* JADX WARN: Code restructure failed: missing block: B:3:0x0007, code lost:
    
        if (r13.length() == 0) goto L5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C69379VmP A00(java.lang.String r13, java.lang.String r14) {
        /*
            r12 = this;
            if (r13 == 0) goto L9
            int r0 = r13.length()
            r1 = 0
            if (r0 != 0) goto La
        L9:
            r1 = 1
        La:
            r0 = 0
            if (r1 != 0) goto L3a
            if (r14 == 0) goto L3a
            int r1 = r14.length()
            if (r1 == 0) goto L3a
            X.Vub r10 = new X.Vub
            r10.<init>(r13, r14)
            android.util.LruCache r11 = r12.A00
            java.lang.Object r9 = r11.get(r10)
            X.Vuc r9 = (X.C69742Vuc) r9
            if (r9 == 0) goto L3a
            long r3 = r9.A00
            long r7 = java.lang.System.currentTimeMillis()
            long r5 = X.W4C.A01
            X.36G r1 = X.C36G.A06
            long r1 = X.C36J.A06(r1, r5)
            long r7 = r7 - r1
            int r1 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r1 >= 0) goto L3b
            r11.remove(r10)
        L3a:
            return r0
        L3b:
            X.VmP r0 = r9.A01
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.W4C.A00(java.lang.String, java.lang.String):X.VmP");
    }
}
