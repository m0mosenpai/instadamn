package X;

/* loaded from: classes7.dex */
public abstract class I26 {
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0065, code lost:
    
        if (r10 >= r5) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x006b, code lost:
    
        if (r10 <= r5) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C41020IEp A00(com.instagram.common.session.UserSession r7, X.C38321qM r8, X.C65192xH r9, int r10, int r11) {
        /*
            r3 = 0
            X.IEo r7 = X.AbstractC41707Idd.A01(r7, r8, r9, r10)
            int r6 = r7.A00
            r5 = -1
            if (r9 == 0) goto L24
            java.util.List r0 = r9.A08()
            java.util.Iterator r4 = r0.iterator()
            r2 = 0
        L13:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L24
            X.3XG r0 = X.AbstractC37300Gc1.A0D(r4)
            X.1XV r1 = r0.A06
            X.1XV r0 = X.C1XV.A0F
            if (r1 != r0) goto L7e
            r5 = r2
        L24:
            r0 = -1
            r4 = 0
            if (r6 != r0) goto L34
            X.IEp r2 = new X.IEp
            r2.<init>()
            r2.A01 = r3
            java.lang.String r3 = r7.A01
        L31:
            r2.A00 = r3
            return r2
        L34:
            if (r11 < r6) goto L40
            X.IEp r2 = new X.IEp
            r2.<init>()
            r2.A01 = r3
            java.lang.String r3 = "next_sponsored_item_impressed"
            goto L31
        L40:
            java.lang.String r3 = "next_sponsored_item_eligible"
            if (r5 != r0) goto L4d
            X.IEp r2 = new X.IEp
            r2.<init>()
            r0 = 1
            r2.A01 = r0
            goto L31
        L4d:
            boolean r0 = r8.CdW()
            java.lang.String r2 = "next_sponsored_item_in_feed_recs"
            if (r0 == 0) goto L62
            if (r6 >= r5) goto L60
            r4 = 1
        L58:
            X.IEp r2 = new X.IEp
            r2.<init>()
        L5d:
            r2.A01 = r4
            goto L31
        L60:
            r3 = r2
            goto L58
        L62:
            if (r6 >= r5) goto L67
            r1 = 1
            if (r10 < r5) goto L68
        L67:
            r1 = 0
        L68:
            if (r6 <= r5) goto L6d
            r0 = 1
            if (r10 > r5) goto L6e
        L6d:
            r0 = 0
        L6e:
            if (r1 != 0) goto L73
            if (r0 != 0) goto L73
            r3 = r2
        L73:
            X.IEp r2 = new X.IEp
            r2.<init>()
            if (r1 != 0) goto L7c
            if (r0 == 0) goto L5d
        L7c:
            r4 = 1
            goto L5d
        L7e:
            int r2 = r2 + 1
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: X.I26.A00(com.instagram.common.session.UserSession, X.1qM, X.2xH, int, int):X.IEp");
    }
}
