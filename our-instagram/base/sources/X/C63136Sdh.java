package X;

/* renamed from: X.Sdh, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63136Sdh {
    public final TZE A00;
    public final String[] A01;

    /* JADX WARN: Removed duplicated region for block: B:14:0x0038 A[Catch: IOException -> 0x0067, TryCatch #0 {IOException -> 0x0067, blocks: (B:2:0x0000, B:4:0x000b, B:6:0x001c, B:8:0x0024, B:12:0x0040, B:14:0x0038, B:15:0x003b, B:26:0x0045, B:28:0x0048, B:31:0x0057), top: B:1:0x0000 }] */
    /* JADX WARN: Type inference failed for: r8v0, types: [X.TWX, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C63136Sdh A01(java.lang.String... r12) {
        /*
            int r10 = r12.length     // Catch: java.io.IOException -> L67
            X.TIl[] r9 = new X.C64531TIl[r10]     // Catch: java.io.IOException -> L67
            X.TWX r8 = new X.TWX     // Catch: java.io.IOException -> L67
            r8.<init>()     // Catch: java.io.IOException -> L67
            r7 = 0
        L9:
            if (r7 >= r10) goto L57
            r11 = r12[r7]     // Catch: java.io.IOException -> L67
            java.lang.String[] r6 = X.THX.A04     // Catch: java.io.IOException -> L67
            r5 = 34
            r8.A0B(r5)     // Catch: java.io.IOException -> L67
            int r4 = r11.length()     // Catch: java.io.IOException -> L67
            r3 = 0
            r2 = 0
        L1a:
            if (r3 >= r4) goto L43
            char r1 = r11.charAt(r3)     // Catch: java.io.IOException -> L67
            r0 = 128(0x80, float:1.8E-43)
            if (r1 >= r0) goto L29
            r0 = r6[r1]     // Catch: java.io.IOException -> L67
            if (r0 != 0) goto L36
            goto L40
        L29:
            r0 = 8232(0x2028, float:1.1535E-41)
            if (r1 != r0) goto L30
            java.lang.String r0 = "\\u2028"
            goto L36
        L30:
            r0 = 8233(0x2029, float:1.1537E-41)
            if (r1 != r0) goto L40
            java.lang.String r0 = "\\u2029"
        L36:
            if (r2 >= r3) goto L3b
            r8.A0G(r11, r2, r3)     // Catch: java.io.IOException -> L67
        L3b:
            r8.FEs(r0)     // Catch: java.io.IOException -> L67
            int r2 = r3 + 1
        L40:
            int r3 = r3 + 1
            goto L1a
        L43:
            if (r2 >= r4) goto L48
            r8.A0G(r11, r2, r4)     // Catch: java.io.IOException -> L67
        L48:
            r8.A0B(r5)     // Catch: java.io.IOException -> L67
            r8.readByte()     // Catch: java.io.IOException -> L67
            X.TIl r0 = r8.A08()     // Catch: java.io.IOException -> L67
            r9[r7] = r0     // Catch: java.io.IOException -> L67
            int r7 = r7 + 1
            goto L9
        L57:
            java.lang.Object r2 = r12.clone()     // Catch: java.io.IOException -> L67
            java.lang.String[] r2 = (java.lang.String[]) r2     // Catch: java.io.IOException -> L67
            X.TZE r1 = X.TZE.A00(r9)     // Catch: java.io.IOException -> L67
            X.Sdh r0 = new X.Sdh     // Catch: java.io.IOException -> L67
            r0.<init>(r1, r2)     // Catch: java.io.IOException -> L67
            return r0
        L67:
            r0 = move-exception
            java.lang.AssertionError r0 = X.AbstractC58318PtA.A0W(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63136Sdh.A01(java.lang.String[]):X.Sdh");
    }

    public C63136Sdh(TZE tze, String[] strArr) {
        this.A01 = strArr;
        this.A00 = tze;
    }

    public static C63136Sdh A00(String str, String str2) {
        return A01(str, str2);
    }
}
