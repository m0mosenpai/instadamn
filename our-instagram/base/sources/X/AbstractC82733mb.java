package X;

/* renamed from: X.3mb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC82733mb {
    public static final Long A00(String str) {
        if (str == null) {
            return null;
        }
        try {
            return AbstractC003100w.A0k(10, str);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x0007, code lost:
    
        if (r6.isEmpty() != false) goto L5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.HashMap A01(java.util.List r6) {
        /*
            if (r6 == 0) goto L9
            boolean r1 = r6.isEmpty()
            r0 = 0
            if (r1 == 0) goto La
        L9:
            r0 = 1
        La:
            r5 = 0
            if (r0 == 0) goto Le
            return r5
        Le:
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            java.util.Iterator r3 = r6.iterator()
        L17:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L45
            java.lang.Object r0 = r3.next()
            com.instagram.user.model.Product r0 = (com.instagram.user.model.Product) r0
            java.lang.String r2 = r0.A0H
            com.instagram.user.model.User r0 = r0.A0B
            if (r0 == 0) goto L43
            java.lang.String r1 = X.AbstractC76433bn.A00(r0)
        L2d:
            java.lang.Object r0 = r4.get(r1)
            if (r0 != 0) goto L3d
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            if (r1 == 0) goto L3d
            r4.put(r1, r0)
        L3d:
            java.util.List r0 = (java.util.List) r0
            r0.add(r2)
            goto L17
        L43:
            r1 = r5
            goto L2d
        L45:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC82733mb.A01(java.util.List):java.util.HashMap");
    }
}
