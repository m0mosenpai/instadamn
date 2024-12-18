package X;

/* renamed from: X.45N, reason: invalid class name */
/* loaded from: classes2.dex */
public enum C45N {
    ANY,
    /* JADX INFO: Fake field, exist only in values array */
    NON_PRIVATE,
    /* JADX INFO: Fake field, exist only in values array */
    PROTECTED_AND_PUBLIC,
    PUBLIC_ONLY,
    NONE,
    DEFAULT;

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0025, code lost:
    
        if (java.lang.reflect.Modifier.isProtected(r4.getModifiers()) != false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A00(java.lang.reflect.Member r4) {
        /*
            r3 = this;
            int r2 = r3.ordinal()
            r1 = 1
            r0 = 0
            if (r2 == r0) goto L27
            if (r2 == r1) goto L12
            r0 = 2
            if (r2 == r0) goto L1d
            r0 = 3
            if (r2 == r0) goto L28
            r0 = 0
            return r0
        L12:
            int r0 = r4.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isPrivate(r0)
            r0 = r0 ^ 1
            return r0
        L1d:
            int r0 = r4.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isProtected(r0)
            if (r0 == 0) goto L28
        L27:
            return r1
        L28:
            int r0 = r4.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isPublic(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C45N.A00(java.lang.reflect.Member):boolean");
    }
}
