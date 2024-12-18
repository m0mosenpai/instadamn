package X;

/* renamed from: X.6BJ, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C6BJ {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0061, code lost:
    
        if (r7.equals("normal") != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x008b, code lost:
    
        if (r7.equals("italic") != false) goto L39;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:8:0x0015. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final android.graphics.Typeface A00(android.graphics.Typeface r6, java.lang.String r7) {
        /*
            r4 = 0
            r3 = 1
            r0 = 400(0x190, float:5.6E-43)
            if (r6 == 0) goto La
            int r0 = r6.getWeight()
        La:
            r5 = 400(0x190, float:5.6E-43)
            r1 = 0
            if (r0 <= r5) goto L11
            int r1 = r0 - r5
        L11:
            int r0 = r7.hashCode()
            switch(r0) {
                case -1178781136: goto L85;
                case -1078030475: goto L64;
                case -1039745817: goto L5b;
                case 3029637: goto L50;
                case 99152071: goto L45;
                case 102970646: goto L3a;
                case 1223860979: goto L2f;
                case 1734741290: goto L24;
                default: goto L18;
            }
        L18:
            java.lang.String r0 = "Can't parse unknown typeface: "
            java.lang.String r1 = X.AnonymousClass001.A0R(r0, r7)
            X.41M r0 = new X.41M
            r0.<init>(r1)
            throw r0
        L24:
            java.lang.String r0 = "bold_italic"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L18
            r5 = 700(0x2bc, float:9.81E-43)
            goto L8d
        L2f:
            java.lang.String r0 = "semibold"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L18
            r5 = 600(0x258, float:8.41E-43)
            goto L6e
        L3a:
            java.lang.String r0 = "light"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L18
            r5 = 300(0x12c, float:4.2E-43)
            goto L6e
        L45:
            java.lang.String r0 = "heavy"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L18
            r5 = 800(0x320, float:1.121E-42)
            goto L6e
        L50:
            java.lang.String r0 = "bold"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L18
            r5 = 700(0x2bc, float:9.81E-43)
            goto L6e
        L5b:
            java.lang.String r0 = "normal"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L18
            goto L6e
        L64:
            java.lang.String r0 = "medium"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L18
            r5 = 500(0x1f4, float:7.0E-43)
        L6e:
            int r5 = r5 + r1
            r2 = 1000(0x3e8, float:1.401E-42)
            int r1 = java.lang.Math.min(r5, r2)
            X.0MA r0 = X.AbstractC05160Pl.A01
            java.lang.String r0 = "weight"
            X.C02R.A01(r1, r3, r0, r2)
            if (r6 != 0) goto L80
            android.graphics.Typeface r6 = android.graphics.Typeface.DEFAULT
        L80:
            android.graphics.Typeface r0 = android.graphics.Typeface.create(r6, r1, r4)
            goto La3
        L85:
            java.lang.String r0 = "italic"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L18
        L8d:
            int r5 = r5 + r1
            r2 = 1000(0x3e8, float:1.401E-42)
            int r1 = java.lang.Math.min(r5, r2)
            X.0MA r0 = X.AbstractC05160Pl.A01
            java.lang.String r0 = "weight"
            X.C02R.A01(r1, r3, r0, r2)
            if (r6 != 0) goto L9f
            android.graphics.Typeface r6 = android.graphics.Typeface.DEFAULT
        L9f:
            android.graphics.Typeface r0 = android.graphics.Typeface.create(r6, r1, r3)
        La3:
            X.C14360o3.A0A(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6BJ.A00(android.graphics.Typeface, java.lang.String):android.graphics.Typeface");
    }
}
