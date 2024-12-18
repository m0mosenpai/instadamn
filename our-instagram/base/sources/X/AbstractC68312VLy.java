package X;

/* renamed from: X.VLy, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC68312VLy {
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0075, code lost:
    
        if (r6.equals("full") != false) goto L36;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0011 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.text.DateFormat] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String A00(java.lang.String r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, long r9) {
        /*
            java.lang.String r1 = "DatetimeTextProviderUtils"
            if (r6 == 0) goto Le
            int r3 = X.C6BE.A04(r6)     // Catch: X.C41M -> L9
            goto Lf
        L9:
            java.lang.String r0 = "Error while parsing DateTime format"
            X.AbstractC25241Le.A02(r1, r0)
        Le:
            r3 = 2
        Lf:
            if (r7 == 0) goto L1b
            int r4 = X.C6BE.A04(r7)     // Catch: X.C41M -> L16
            goto L1c
        L16:
            java.lang.String r0 = "Error while parsing Time format"
            X.AbstractC25241Le.A02(r1, r0)
        L1b:
            r4 = r3
        L1c:
            if (r6 != 0) goto L20
            java.lang.String r6 = "medium"
        L20:
            int r0 = r5.hashCode()
            r2 = 2
            r1 = -1
            switch(r0) {
                case 3076014: goto L33;
                case 3560141: goto L3d;
                case 1793702779: goto L47;
                default: goto L29;
            }
        L29:
            switch(r1) {
                case 0: goto L56;
                case 1: goto L51;
                case 2: goto L90;
                default: goto L2c;
            }
        L2c:
            java.lang.String r0 = "Unknown dateformat type: "
            java.lang.IllegalArgumentException r0 = X.AbstractC167007dF.A0c(r0, r5)
            throw r0
        L33:
            java.lang.String r0 = "date"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L29
            r1 = 0
            goto L29
        L3d:
            java.lang.String r0 = "time"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L29
            r1 = 1
            goto L29
        L47:
            java.lang.String r0 = "datetime"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L29
            r1 = 2
            goto L29
        L51:
            java.text.DateFormat r2 = java.text.DateFormat.getTimeInstance(r4)
            goto L94
        L56:
            java.lang.String r0 = "short"
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L77
            java.lang.String r0 = "medium"
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L77
            java.lang.String r0 = "long"
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L77
            java.lang.String r0 = "full"
            boolean r1 = r6.equals(r0)
            r0 = 0
            if (r1 == 0) goto L78
        L77:
            r0 = 1
        L78:
            if (r0 == 0) goto L88
            int r0 = X.C6BE.A04(r6)     // Catch: X.C41M -> L83
            java.text.DateFormat r2 = java.text.DateFormat.getDateInstance(r0)     // Catch: X.C41M -> L83
            goto L94
        L83:
            java.text.DateFormat r2 = java.text.DateFormat.getDateInstance(r2)
            goto L94
        L88:
            java.util.Locale r0 = java.util.Locale.US
            java.text.SimpleDateFormat r2 = new java.text.SimpleDateFormat
            r2.<init>(r6, r0)
            goto L94
        L90:
            java.text.DateFormat r2 = java.text.DateFormat.getDateTimeInstance(r3, r4)
        L94:
            if (r8 != 0) goto La2
            java.util.Calendar r0 = java.util.Calendar.getInstance()
            java.util.TimeZone r0 = r0.getTimeZone()
            java.lang.String r8 = r0.getID()
        La2:
            java.util.TimeZone r0 = java.util.TimeZone.getTimeZone(r8)
            r2.setTimeZone(r0)
            r0 = 1000(0x3e8, double:4.94E-321)
            long r9 = r9 * r0
            java.lang.Long r0 = java.lang.Long.valueOf(r9)
            java.lang.String r0 = r2.format(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC68312VLy.A00(java.lang.String, java.lang.String, java.lang.String, java.lang.String, long):java.lang.String");
    }
}
