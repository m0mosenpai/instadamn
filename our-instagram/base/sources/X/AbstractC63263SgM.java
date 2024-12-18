package X;

/* renamed from: X.SgM, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC63263SgM {
    public static final C64531TIl A00 = C64531TIl.A02("\"\\");
    public static final C64531TIl A01 = C64531TIl.A02("\t ,=");

    /* JADX WARN: Code restructure failed: missing block: B:185:0x0297, code lost:
    
        throw X.AbstractC58318PtA.A0Y();
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:?, code lost:
    
        throw X.AbstractC58318PtA.A0Y();
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:?, code lost:
    
        throw X.AbstractC58318PtA.A0Y();
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:?, code lost:
    
        throw X.AbstractC58318PtA.A0Y();
     */
    /* JADX WARN: Removed duplicated region for block: B:166:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0235 A[EDGE_INSN: B:198:0x0235->B:199:0x0235 BREAK  A[LOOP:1: B:17:0x003e->B:234:0x00bf, LOOP_LABEL: LOOP:1: B:17:0x003e->B:234:0x00bf], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:214:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0373  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00e1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A01(X.InterfaceC65605Tnu r47, X.C63365SiO r48, X.C63379Sit r49) {
        /*
            Method dump skipped, instructions count: 910
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC63263SgM.A01(X.Tnu, X.SiO, X.Sit):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0035, code lost:
    
        if (r3 == (-1)) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean A02(X.THP r8) {
        /*
            X.SMk r0 = r8.A07
            java.lang.String r1 = r0.A00
            java.lang.String r0 = "HEAD"
            boolean r0 = r1.equals(r0)
            r7 = 0
            if (r0 != 0) goto L4a
            int r1 = r8.A00
            r0 = 100
            r6 = 1
            if (r1 < r0) goto L20
            r0 = 200(0xc8, float:2.8E-43)
            if (r1 < r0) goto L21
            r0 = 204(0xcc, float:2.86E-43)
            if (r1 == r0) goto L21
            r0 = 304(0x130, float:4.26E-43)
            if (r1 == r0) goto L21
        L20:
            return r6
        L21:
            X.SiO r5 = r8.A05
            java.lang.String r0 = "Content-Length"
            java.lang.String r0 = r5.A04(r0)
            r3 = -1
            if (r0 == 0) goto L37
            long r3 = java.lang.Long.parseLong(r0)     // Catch: java.lang.NumberFormatException -> L31
        L31:
            r1 = -1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L20
        L37:
            java.lang.String r0 = "Transfer-Encoding"
            r1 = 0
            java.lang.String r0 = r5.A04(r0)
            if (r0 == 0) goto L41
            r1 = r0
        L41:
            java.lang.String r0 = "chunked"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L4a
            return r6
        L4a:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC63263SgM.A02(X.THP):boolean");
    }

    public static int A00(String str, int i) {
        try {
            long parseLong = Long.parseLong(str);
            if (parseLong > 2147483647L) {
                return Integer.MAX_VALUE;
            }
            if (parseLong < 0) {
                return 0;
            }
            return (int) parseLong;
        } catch (NumberFormatException unused) {
            return i;
        }
    }
}
