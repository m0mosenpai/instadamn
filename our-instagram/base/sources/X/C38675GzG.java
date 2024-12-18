package X;

/* renamed from: X.GzG, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38675GzG extends C0T6 {
    public String A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final String A04;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C38675GzG(X.C19260xA r8, java.lang.String r9, java.lang.String r10, int r11) {
        /*
            r7 = this;
            r6 = r10
            r5 = r9
            r2 = r8
            r4 = 0
            r0 = r11 & 1
            if (r0 == 0) goto L9
            r2 = r4
        L9:
            r0 = r11 & 2
            if (r0 == 0) goto Le
            r5 = r4
        Le:
            r0 = r11 & 4
            if (r0 == 0) goto L13
            r6 = r4
        L13:
            r0 = r11 & 512(0x200, float:7.17E-43)
            r1 = 0
            if (r0 == 0) goto L29
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r1)
        L1c:
            r0 = r11 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L24
            java.lang.Integer r4 = java.lang.Integer.valueOf(r1)
        L24:
            r1 = r7
            r1.<init>(r2, r3, r4, r5, r6)
            return
        L29:
            r3 = r4
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C38675GzG.<init>(X.0xA, java.lang.String, java.lang.String, int):void");
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("ProductCardLoggingInfo(extraBundle=");
        A1C.append(this.A01);
        A1C.append(", submodule=");
        A1C.append(this.A04);
        A1C.append(AbstractC111324zv.A00(278));
        A1C.append(this.A00);
        A1C.append(", navigationMetadata=");
        A1C.append((Object) null);
        A1C.append(", moduleLoggingInfo=");
        A1C.append((Object) null);
        A1C.append(", mediaId=");
        A1C.append((String) null);
        A1C.append(", contentType=");
        A1C.append((String) null);
        A1C.append(", filtersLoggingInfo=");
        A1C.append((Object) null);
        A1C.append(", rankingLoggingInfo=");
        A1C.append((Object) null);
        A1C.append(", isFullWidthProductTileCellEnabled=");
        A1C.append(this.A02);
        A1C.append(", numMediaInProductRow=");
        return AbstractC167017dG.A0o(this.A03, A1C);
    }

    public C38675GzG(Object obj, Object obj2, Object obj3, String str, String str2) {
        this.A01 = obj;
        this.A04 = str;
        this.A00 = str2;
        this.A02 = obj2;
        this.A03 = obj3;
    }
}
