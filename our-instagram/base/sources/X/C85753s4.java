package X;

import com.facebook.proxygen.TraceFieldType;

/* renamed from: X.3s4, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C85753s4 {
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002e, code lost:
    
        if (r2.isEmpty() != false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String A00(java.util.Map r8) {
        /*
            r7 = 0
            java.io.StringWriter r6 = new java.io.StringWriter     // Catch: java.io.IOException -> L58
            r6.<init>()     // Catch: java.io.IOException -> L58
            X.15v r0 = X.AbstractC221915u.A00     // Catch: java.io.IOException -> L58
            X.17z r5 = r0.A0A(r6)     // Catch: java.io.IOException -> L58
            r5.A0c()     // Catch: java.io.IOException -> L58
            java.util.Collection r0 = r8.values()     // Catch: java.io.IOException -> L58
            java.util.Iterator r4 = r0.iterator()     // Catch: java.io.IOException -> L58
        L17:
            boolean r0 = r4.hasNext()     // Catch: java.io.IOException -> L58
            if (r0 == 0) goto L4d
            java.lang.Object r3 = r4.next()     // Catch: java.io.IOException -> L58
            X.5I4 r3 = (X.C5I4) r3     // Catch: java.io.IOException -> L58
            java.util.List r2 = r3.BVA()     // Catch: java.io.IOException -> L58
            if (r2 == 0) goto L30
            boolean r1 = r2.isEmpty()     // Catch: java.io.IOException -> L58
            r0 = 1
            if (r1 == 0) goto L31
        L30:
            r0 = 0
        L31:
            if (r0 == 0) goto L49
            if (r2 == 0) goto L17
            java.util.Iterator r1 = r2.iterator()     // Catch: java.io.IOException -> L58
        L39:
            boolean r0 = r1.hasNext()     // Catch: java.io.IOException -> L58
            if (r0 == 0) goto L17
            java.lang.Object r0 = r1.next()     // Catch: java.io.IOException -> L58
            X.5I4 r0 = (X.C5I4) r0     // Catch: java.io.IOException -> L58
            A01(r5, r0)     // Catch: java.io.IOException -> L58
            goto L39
        L49:
            A01(r5, r3)     // Catch: java.io.IOException -> L58
            goto L17
        L4d:
            r5.A0Z()     // Catch: java.io.IOException -> L58
            r5.close()     // Catch: java.io.IOException -> L58
            java.lang.String r0 = r6.toString()     // Catch: java.io.IOException -> L58
            return r0
        L58:
            r3 = move-exception
            java.lang.Class<X.3s4> r2 = X.C85753s4.class
            java.lang.Object[] r1 = new java.lang.Object[r7]
            java.lang.String r0 = "Failed to convert a collection to json"
            X.C0K8.A07(r2, r0, r3, r1)
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C85753s4.A00(java.util.Map):java.lang.String");
    }

    public static final void A01(AnonymousClass182 anonymousClass182, C5I4 c5i4) {
        int i;
        anonymousClass182.A0d();
        switch (c5i4.BKD().intValue()) {
            case 1:
                i = 1;
                break;
            case 2:
                i = 2;
                break;
            case 3:
                i = 3;
                break;
            default:
                i = 0;
                break;
        }
        anonymousClass182.A0Q("item_type", i);
        anonymousClass182.A0S("item_id", c5i4.getId());
        anonymousClass182.A0Q(TraceFieldType.CurrentState, c5i4.C03().A00);
        anonymousClass182.A0Q("priority_index", c5i4.BgX());
        anonymousClass182.A0Q("insertion_index", c5i4.BIC());
        anonymousClass182.A0S("ad_pod_id", c5i4.AZM());
        anonymousClass182.A0Q("multi_ads_type", c5i4.BVI());
        anonymousClass182.A0a();
    }
}
