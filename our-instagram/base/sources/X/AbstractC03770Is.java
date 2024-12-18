package X;

/* renamed from: X.0Is, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC03770Is {
    public static String A00(Object obj) {
        return obj != null ? "found" : "NOT found";
    }

    public static String A01(String str) {
        if (str != null && str.length() != 0) {
            char charAt = str.charAt(0);
            char c = charAt;
            if (charAt >= 'a' && charAt <= 'z') {
                c = (char) (charAt - ' ');
            }
            if (charAt != c) {
                char[] charArray = str.toCharArray();
                charArray[0] = c;
                return new String(charArray);
            }
        }
        return str;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00a6 A[LOOP:0: B:38:0x00a4->B:39:0x00a6, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b5 A[LOOP:1: B:42:0x00b3->B:43:0x00b5, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String A02(boolean r9, int r10) {
        /*
            java.lang.String r6 = "Successfully"
            java.lang.String r8 = "Un"
            r4 = 0
            int r3 = r8.length()
            if (r3 == 0) goto L3a
            if (r9 != 0) goto L3a
            int r7 = r6.length()
            if (r7 != 0) goto L66
            r6 = r8
            r0 = 1
            if (r10 == r0) goto L1c
            java.lang.String r6 = A01(r8)
        L1b:
            return r6
        L1c:
            char r2 = r8.charAt(r4)
            r1 = r2
            r0 = 65
            if (r2 < r0) goto L2c
            r0 = 90
            if (r2 > r0) goto L2c
            int r0 = r2 + 32
            char r1 = (char) r0
        L2c:
            if (r2 == r1) goto L1b
            char[] r0 = r8.toCharArray()
            r0[r4] = r1
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0)
            return r6
        L3a:
            r0 = 1
            if (r10 == r0) goto L42
            java.lang.String r6 = A01(r6)
            return r6
        L42:
            int r0 = r6.length()
            if (r0 == 0) goto L1b
            char r2 = r6.charAt(r4)
            r1 = r2
            r0 = 65
            if (r2 < r0) goto L58
            r0 = 90
            if (r2 > r0) goto L58
            int r0 = r2 + 32
            char r1 = (char) r0
        L58:
            if (r2 == r1) goto L1b
            char[] r0 = r6.toCharArray()
            r0[r4] = r1
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0)
            return r6
        L66:
            char r5 = r8.charAt(r4)
            r0 = 1
            r9 = r5
            if (r10 == r0) goto L92
            r0 = 97
            if (r5 < r0) goto L79
            r0 = 122(0x7a, float:1.71E-43)
            if (r5 > r0) goto L79
            int r0 = r5 + (-32)
        L78:
            char r9 = (char) r0
        L79:
            char r1 = r6.charAt(r4)
            r2 = r1
            r0 = 65
            if (r1 < r0) goto L89
            r0 = 90
            if (r1 > r0) goto L89
            int r0 = r1 + 32
            char r2 = (char) r0
        L89:
            if (r5 != r9) goto L9d
            if (r1 != r2) goto L9d
            java.lang.String r6 = X.AnonymousClass001.A0R(r8, r6)
            return r6
        L92:
            r0 = 65
            if (r5 < r0) goto L79
            r0 = 90
            if (r5 > r0) goto L79
            int r0 = r5 + 32
            goto L78
        L9d:
            int r7 = r7 + r3
            char[] r5 = new char[r7]
            r5[r4] = r9
            r4 = 1
            r1 = 1
        La4:
            if (r1 >= r3) goto Laf
            char r0 = r8.charAt(r1)
            r5[r1] = r0
            int r1 = r1 + 1
            goto La4
        Laf:
            int r3 = r1 + 1
            r5[r1] = r2
        Lb3:
            if (r3 >= r7) goto Lc2
            int r2 = r3 + 1
            int r1 = r4 + 1
            char r0 = r6.charAt(r4)
            r5[r3] = r0
            r3 = r2
            r4 = r1
            goto Lb3
        Lc2:
            java.lang.String r6 = new java.lang.String
            r6.<init>(r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC03770Is.A02(boolean, int):java.lang.String");
    }
}
