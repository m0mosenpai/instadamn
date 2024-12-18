package X;

/* renamed from: X.BGy, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25282BGy {
    public boolean A00;
    public final Integer A01;
    public final String A02;
    public final String A03;
    public final boolean A04;
    public final boolean A05;
    public final int A06;

    /* JADX WARN: Removed duplicated region for block: B:11:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.text.SpannedString A00(android.content.Context r9, X.InterfaceC16660sJ r10, boolean r11) {
        /*
            r8 = this;
            r0 = 1
            X.C14360o3.A0B(r9, r0)
            java.lang.Integer r0 = r8.A01
            if (r11 == 0) goto L18
            if (r0 == 0) goto L9a
            int r1 = r0.intValue()
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = X.AbstractC13950nL.A08(r1, r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L18:
            if (r0 == 0) goto L9a
            int r7 = r0.intValue()
        L1e:
            android.text.SpannableStringBuilder r3 = new android.text.SpannableStringBuilder
            r3.<init>()
            java.lang.String r0 = r8.A03
            int r0 = r0.length()
            boolean r1 = X.AbstractC167007dF.A1O(r0)
            r4 = 17
            int r0 = r8.A06
            if (r1 == 0) goto L7b
            X.Bzl r6 = new X.Bzl
            r6.<init>(r8, r10, r7, r0)
            int r5 = r3.length()
            java.lang.String r0 = r8.A02
            r3.append(r0)
        L41:
            int r0 = r3.length()
            r3.setSpan(r6, r5, r0, r4)
            boolean r0 = r8.A05
            if (r0 == 0) goto L75
            android.graphics.drawable.BitmapDrawable r0 = X.C85963sQ.A00(r9)
            android.graphics.drawable.Drawable r1 = r0.mutate()
            X.C14360o3.A07(r1)
            X.AbstractC167017dG.A14(r1)
            r0 = 2131099704(0x7f060038, float:1.7811769E38)
            X.AbstractC25231BEo.A0x(r9, r1, r0)
            X.3sR r2 = new X.3sR
            r2.<init>(r1)
            int r1 = r3.length()
            java.lang.String r0 = "verified"
            r3.append(r0)
            int r0 = r3.length()
            r3.setSpan(r2, r1, r0, r4)
        L75:
            android.text.SpannedString r0 = new android.text.SpannedString
            r0.<init>(r3)
            return r0
        L7b:
            android.text.style.StyleSpan r6 = new android.text.style.StyleSpan
            r6.<init>(r0)
            int r5 = r3.length()
            android.text.style.ForegroundColorSpan r2 = new android.text.style.ForegroundColorSpan
            r2.<init>(r7)
            int r1 = r3.length()
            java.lang.String r0 = r8.A02
            r3.append(r0)
            int r0 = r3.length()
            r3.setSpan(r2, r1, r0, r4)
            goto L41
        L9a:
            r7 = -1
            goto L1e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25282BGy.A00(android.content.Context, X.0sJ, boolean):android.text.SpannedString");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0020, code lost:
    
        if (r1 >= 6) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C25282BGy(java.lang.String r13) {
        /*
            r12 = this;
            java.lang.String r9 = "Failed to parse the color string: "
            java.lang.String r8 = "NewsfeedEmbeddedText_Color"
            r3 = 1
            X.C14360o3.A0B(r13, r3)
            r12.<init>()
            r2 = 1
            char[] r1 = new char[r3]
            r0 = 124(0x7c, float:1.74E-43)
            r11 = 0
            r1[r11] = r0
            r6 = 6
            java.util.List r5 = X.AbstractC001900j.A0Q(r13, r1, r11)
            int r1 = r5.size()
            r4 = 4
            if (r4 > r1) goto L22
            r0 = 1
            if (r1 < r6) goto L23
        L22:
            r0 = 0
        L23:
            r7 = 0
            java.lang.String r6 = ""
            if (r0 == 0) goto L7f
            java.lang.Object r1 = r5.get(r11)     // Catch: java.lang.Exception -> L35
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Exception -> L35
            java.lang.String r0 = "UTF-8"
            java.lang.String r0 = java.net.URLDecoder.decode(r1, r0)     // Catch: java.lang.Exception -> L35
            goto L4d
        L35:
            r10 = move-exception
            java.lang.String r1 = "Failed to decode embedded text: "
            java.lang.Object r0 = r5.get(r11)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r1 = X.AnonymousClass001.A0R(r1, r0)
            java.lang.String r0 = "Couldn't decode embedded text"
            X.C0w9.A06(r0, r1, r10)
            java.lang.Object r0 = r5.get(r11)
            java.lang.String r0 = (java.lang.String) r0
        L4d:
            r12.A02 = r0
            r1 = 35
            java.lang.Object r0 = r5.get(r3)     // Catch: java.lang.Throwable -> L64
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L64
            java.lang.String r0 = X.AnonymousClass001.A0D(r0, r1)     // Catch: java.lang.Throwable -> L64
            int r0 = android.graphics.Color.parseColor(r0)     // Catch: java.lang.Throwable -> L64
            java.lang.Integer r7 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L64
            goto L71
        L64:
            java.lang.Object r0 = r5.get(r3)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = X.AnonymousClass001.A0R(r9, r0)
            X.C0w9.A03(r8, r0)
        L71:
            r12.A01 = r7
            r8 = 2
            java.lang.Object r0 = r5.get(r8)     // Catch: java.lang.NumberFormatException -> L8d
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.NumberFormatException -> L8d
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.NumberFormatException -> L8d
            goto Lb3
        L7f:
            r12.A02 = r6
            r12.A03 = r6
            r12.A00 = r3
            java.lang.String r1 = "NewsfeedEmbeddedText"
            java.lang.String r0 = "Response does not have correct number of fields"
            X.C0w9.A03(r1, r0)
            goto Ld8
        L8d:
            r7 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "Failed to parse style info: "
            r1.append(r0)
            java.lang.Object r0 = r5.get(r8)
            java.lang.String r0 = (java.lang.String) r0
            r1.append(r0)
            java.lang.String r0 = ", Exception: "
            r1.append(r0)
            r1.append(r7)
            java.lang.String r1 = r1.toString()
            java.lang.String r0 = "NewsfeedEmbeddedText_Style"
            X.C0w9.A03(r0, r1)
            r0 = 0
        Lb3:
            r12.A06 = r0
            r0 = 3
            java.lang.Object r1 = r5.get(r0)
            java.lang.String r1 = (java.lang.String) r1
            boolean r0 = X.AbstractC001900j.A0T(r1)
            r0 = r0 ^ 1
            if (r0 == 0) goto Lca
            java.lang.String r0 = "ig://"
            java.lang.String r6 = X.AnonymousClass001.A0R(r0, r1)
        Lca:
            r12.A03 = r6
            java.lang.Object r1 = X.AbstractC001800i.A0O(r5, r4)
            java.lang.String r0 = "verified"
            boolean r0 = X.C14360o3.A0K(r1, r0)
            r12.A05 = r0
        Ld8:
            int r0 = r12.A06
            r0 = r0 & 1
            if (r0 == r3) goto Ldf
            r2 = 0
        Ldf:
            r12.A04 = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25282BGy.<init>(java.lang.String):void");
    }
}
