package X;

/* renamed from: X.9wW, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC225079wW {
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0044, code lost:
    
        r0 = (java.lang.String) r8.call();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004a, code lost:
    
        if (r0 == null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004c, code lost:
    
        r3.put(r6, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004f, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean A00(java.lang.String r5, java.lang.String r6, java.util.Map r7, java.util.concurrent.Callable r8) {
        /*
            r7.getClass()
            r4 = 0
            if (r5 == 0) goto L50
            java.util.Set r0 = r7.keySet()
            java.util.Iterator r2 = r0.iterator()
        Le:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L43
            java.lang.String r1 = X.AbstractC166987dD.A1B(r2)
            boolean r0 = r1.equals(r5)
            if (r0 == 0) goto Le
            java.lang.Object r3 = r7.get(r1)
            boolean r0 = r3 instanceof java.util.TreeMap
            if (r0 == 0) goto L43
            java.util.AbstractMap r3 = (java.util.AbstractMap) r3
            java.util.Iterator r2 = X.AbstractC166997dE.A14(r3)
        L2c:
            boolean r0 = r2.hasNext()
            r1 = 1
            if (r0 == 0) goto L44
            java.util.Map$Entry r0 = X.AbstractC166987dD.A1K(r2)
            java.lang.Object r0 = r0.getKey()
            java.lang.String r0 = (java.lang.String) r0
            boolean r0 = r0.equals(r6)
            if (r0 == 0) goto L2c
        L43:
            return r4
        L44:
            java.lang.Object r0 = r8.call()     // Catch: java.lang.Exception -> L43
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Exception -> L43
            if (r0 == 0) goto L50
            r3.put(r6, r0)
            return r1
        L50:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC225079wW.A00(java.lang.String, java.lang.String, java.util.Map, java.util.concurrent.Callable):boolean");
    }
}
