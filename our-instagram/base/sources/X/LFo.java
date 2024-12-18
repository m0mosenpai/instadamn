package X;

import android.util.LruCache;

/* loaded from: classes8.dex */
public final class LFo {
    public static final long A01 = C36H.A03(C36G.A04, 4);
    public final LruCache A00 = new LruCache(20);

    /* JADX WARN: Code restructure failed: missing block: B:3:0x0007, code lost:
    
        if (r13.length() == 0) goto L5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.facebookpay.offsite.models.message.OffsiteData A00(java.lang.String r13) {
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
            if (r1 != 0) goto L32
            X.L9O r11 = new X.L9O
            r11.<init>(r13)
            android.util.LruCache r10 = r12.A00
            java.lang.Object r9 = r10.get(r11)
            X.L9a r9 = (X.C47793L9a) r9
            if (r9 == 0) goto L32
            long r3 = r9.A00
            long r7 = java.lang.System.currentTimeMillis()
            long r5 = X.LFo.A01
            X.36G r1 = X.C36G.A06
            long r1 = X.C36J.A06(r1, r5)
            long r7 = r7 - r1
            int r1 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r1 >= 0) goto L33
            r10.remove(r11)
        L32:
            return r0
        L33:
            com.facebookpay.offsite.models.message.OffsiteData r0 = r9.A01
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LFo.A00(java.lang.String):com.facebookpay.offsite.models.message.OffsiteData");
    }
}
