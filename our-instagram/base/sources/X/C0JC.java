package X;

/* renamed from: X.0JC, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C0JC {
    public static final int[] A01 = {4096};
    public static C0Ga A00 = new C0Ga();

    /* JADX WARN: Removed duplicated region for block: B:16:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.util.Pair A00(java.lang.String r11) {
        /*
            r7 = 0
            r0 = 0
            java.lang.String[] r10 = new java.lang.String[]{r0}
            int[] r1 = X.C0JC.A01
            X.0Ga r0 = X.C0JC.A00
            r8 = 384(0x180, float:5.38E-43)
            byte[] r6 = new byte[r8]
            int r3 = X.C0Ga.A00(r0, r11, r6)
            if (r3 >= 0) goto L21
            r0 = 4
        L15:
            r2 = r10[r7]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            android.util.Pair r0 = new android.util.Pair
            r0.<init>(r2, r1)
            return r0
        L21:
            r5 = 0
            r9 = r1[r7]
            r0 = r9 & 512(0x200, float:7.17E-43)
            r1 = 34
            if (r0 != 0) goto L3b
            r0 = r9 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L34
            r0 = r6[r7]
            if (r0 == r1) goto L3b
            r9 = r9 & (-1025(0xfffffffffffffbff, float:NaN))
        L34:
            r0 = r9 & 255(0xff, float:3.57E-43)
            char r2 = (char) r0
            if (r5 < r3) goto L3d
            r0 = 5
            goto L15
        L3b:
            r5 = 1
            goto L34
        L3d:
            r4 = -1
            r0 = r9 & 512(0x200, float:7.17E-43)
            if (r0 == 0) goto L4e
            r4 = r5
        L43:
            if (r4 >= r3) goto L5c
            r1 = r6[r4]
            r0 = 41
            if (r1 == r0) goto L5c
            int r4 = r4 + 1
            goto L43
        L4e:
            r0 = r9 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L5f
            r4 = r5
        L53:
            r0 = r6[r4]
            if (r0 == r1) goto L5c
            if (r4 >= r3) goto L5c
            int r4 = r4 + 1
            goto L53
        L5c:
            int r1 = r4 + 1
            goto L60
        L5f:
            r1 = r5
        L60:
            if (r1 >= r3) goto L69
            r0 = r6[r1]
            if (r0 == r2) goto L69
            int r1 = r1 + 1
            goto L60
        L69:
            if (r4 >= 0) goto L6c
            r4 = r1
        L6c:
            if (r1 >= r3) goto L7d
            int r1 = r1 + 1
            r0 = r9 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L7d
        L74:
            if (r1 >= r3) goto L7d
            r0 = r6[r1]
            if (r0 != r2) goto L7d
            int r1 = r1 + 1
            goto L74
        L7d:
            r0 = r9 & 28672(0x7000, float:4.0178E-41)
            if (r0 == 0) goto La3
            if (r4 >= r8) goto La6
            r3 = 1
            r2 = r6[r4]
            r6[r4] = r7
        L88:
            r0 = r9 & 4096(0x1000, float:5.74E-42)
            if (r0 == 0) goto L9f
            r1 = r5
        L8d:
            r0 = r6[r1]
            if (r0 == r7) goto L97
            int r1 = r1 + 1
            if (r1 < r8) goto L8d
            r1 = 384(0x180, float:5.38E-43)
        L97:
            int r1 = r1 - r5
            java.lang.String r0 = new java.lang.String
            r0.<init>(r6, r5, r1)
            r10[r7] = r0
        L9f:
            if (r3 == 0) goto La3
            r6[r4] = r2
        La3:
            r0 = 0
            goto L15
        La6:
            r3 = 0
            r2 = 0
            goto L88
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0JC.A00(java.lang.String):android.util.Pair");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00aa A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00af A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean A01(java.lang.String r16, int[] r17, long[] r18) {
        /*
            X.0Ga r0 = X.C0JC.A00
            r12 = 384(0x180, float:5.38E-43)
            byte[] r11 = new byte[r12]
            r1 = r16
            int r10 = X.C0Ga.A00(r0, r1, r11)
            if (r10 < 0) goto Laf
            r0 = r17
            int r9 = r0.length
            r8 = 0
            r13 = r18
            int r7 = r13.length
            int r0 = java.lang.Math.max(r7, r8)
            int r6 = java.lang.Math.max(r8, r0)
            r1 = 0
            r5 = 0
            r4 = 0
        L20:
            if (r5 >= r9) goto L9f
            r15 = r17[r5]
            r0 = r15 & 512(0x200, float:7.17E-43)
            r2 = 34
            if (r0 != 0) goto L79
            r0 = r15 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L34
            r0 = r11[r1]
            if (r0 == r2) goto L79
            r15 = r15 & (-1025(0xfffffffffffffbff, float:NaN))
        L34:
            r0 = r15 & 255(0xff, float:3.57E-43)
            char r0 = (char) r0
            if (r1 >= r10) goto Laf
            r3 = -1
            r14 = r15 & 512(0x200, float:7.17E-43)
            if (r14 == 0) goto L4a
            r3 = r1
        L3f:
            if (r3 >= r10) goto L58
            r14 = r11[r3]
            r2 = 41
            if (r14 == r2) goto L58
            int r3 = r3 + 1
            goto L3f
        L4a:
            r14 = r15 & 1024(0x400, float:1.435E-42)
            if (r14 == 0) goto L5b
            r3 = r1
        L4f:
            r14 = r11[r3]
            if (r14 == r2) goto L58
            if (r3 >= r10) goto L58
            int r3 = r3 + 1
            goto L4f
        L58:
            int r2 = r3 + 1
            goto L5c
        L5b:
            r2 = r1
        L5c:
            if (r2 >= r10) goto L65
            r14 = r11[r2]
            if (r14 == r0) goto L65
            int r2 = r2 + 1
            goto L5c
        L65:
            if (r3 >= 0) goto L68
            r3 = r2
        L68:
            if (r2 >= r10) goto L7c
            int r2 = r2 + 1
            r14 = r15 & 256(0x100, float:3.59E-43)
            if (r14 == 0) goto L7c
        L70:
            if (r2 >= r10) goto L7c
            r14 = r11[r2]
            if (r14 != r0) goto L7c
            int r2 = r2 + 1
            goto L70
        L79:
            int r1 = r1 + 1
            goto L34
        L7c:
            r0 = r15 & 28672(0x7000, float:4.0178E-41)
            if (r0 == 0) goto Laa
            if (r3 >= r12) goto La6
            r16 = 1
            r14 = r11[r3]
            r11[r3] = r8
        L88:
            r0 = r15 & 8192(0x2000, float:1.148E-41)
            if (r0 == 0) goto L97
            if (r4 >= r7) goto L97
            r0 = r15 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto La1
            r0 = r11[r1]
            long r0 = (long) r0
        L95:
            r18[r4] = r0
        L97:
            if (r16 == 0) goto L9b
            r11[r3] = r14
        L9b:
            int r4 = r4 + 1
            if (r4 < r6) goto Laa
        L9f:
            r0 = 1
            return r0
        La1:
            long r0 = X.C0JB.A00(r11, r1)
            goto L95
        La6:
            r16 = 0
            r14 = 0
            goto L88
        Laa:
            int r5 = r5 + 1
            r1 = r2
            goto L20
        Laf:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0JC.A01(java.lang.String, int[], long[]):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x007f, code lost:
    
        if (r7[r3] != 10) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0082, code lost:
    
        if (r3 < 2048) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x008c, code lost:
    
        r16[r12] = X.C0JB.A00(r7, r1);
        r5 = r5 + 1;
        r1 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0095, code lost:
    
        if (r2 == false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0086, code lost:
    
        if (r7[r3] == 0) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0088, code lost:
    
        r7[r3] = 0;
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x00ad, code lost:
    
        if (r6 < 2048) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean A02(java.lang.String r15, long[] r16, java.lang.String[] r17) {
        /*
            Method dump skipped, instructions count: 194
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0JC.A02(java.lang.String, long[], java.lang.String[]):boolean");
    }
}
