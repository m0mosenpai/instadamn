package X;

/* renamed from: X.9CD, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9CD extends C0T6 {
    public Object A00;
    public String A01;
    public String A02;
    public boolean A03;
    public final int A04;

    public C9CD(AnonymousClass859 anonymousClass859, String str, String str2, boolean z) {
        this.A04 = 0;
        C14360o3.A0B(str, 1);
        C14360o3.A0B(str2, 2);
        C14360o3.A0B(anonymousClass859, 3);
        this.A02 = str;
        this.A01 = str2;
        this.A00 = anonymousClass859;
        this.A03 = z;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            int r0 = r2.A04
            switch(r0) {
                case 0: goto L38;
                case 1: goto L60;
                case 2: goto L93;
                default: goto L5;
            }
        L5:
            if (r2 == r3) goto Lb0
            r1 = 3
            boolean r0 = r3 instanceof X.C9CD
            if (r0 == 0) goto L36
            X.9CD r3 = (X.C9CD) r3
            int r0 = r3.A04
            if (r0 != r1) goto L36
            java.lang.String r1 = r2.A02
            java.lang.String r0 = r3.A02
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 == 0) goto L36
            java.lang.String r1 = r2.A01
            java.lang.String r0 = r3.A01
        L20:
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 == 0) goto L36
            boolean r1 = r2.A03
            boolean r0 = r3.A03
            if (r1 != r0) goto L36
            java.lang.Object r1 = r2.A00
            java.lang.Object r0 = r3.A00
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 != 0) goto Lb0
        L36:
            r0 = 0
            return r0
        L38:
            if (r2 == r3) goto Lb0
            r1 = 0
            boolean r0 = r3 instanceof X.C9CD
            if (r0 == 0) goto L36
            X.9CD r3 = (X.C9CD) r3
            int r0 = r3.A04
            if (r0 != r1) goto L36
            java.lang.String r1 = r2.A02
            java.lang.String r0 = r3.A02
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 == 0) goto L36
            java.lang.String r1 = r2.A01
            java.lang.String r0 = r3.A01
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 == 0) goto L36
            java.lang.Object r1 = r2.A00
            java.lang.Object r0 = r3.A00
            if (r1 == r0) goto L8c
            goto L36
        L60:
            if (r2 == r3) goto Lb0
            r1 = 1
            boolean r0 = r3 instanceof X.C9CD
            if (r0 == 0) goto L36
            X.9CD r3 = (X.C9CD) r3
            int r0 = r3.A04
            if (r0 != r1) goto L36
            java.lang.String r1 = r2.A01
            java.lang.String r0 = r3.A01
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 == 0) goto L36
            java.lang.String r1 = r2.A02
            java.lang.String r0 = r3.A02
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 == 0) goto L36
            java.lang.Object r1 = r2.A00
            java.lang.Object r0 = r3.A00
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 != 0) goto L8c
            goto L36
        L8c:
            boolean r1 = r2.A03
            boolean r0 = r3.A03
            if (r1 == r0) goto Lb0
            goto L36
        L93:
            if (r2 == r3) goto Lb0
            r1 = 2
            boolean r0 = r3 instanceof X.C9CD
            if (r0 == 0) goto L36
            X.9CD r3 = (X.C9CD) r3
            int r0 = r3.A04
            if (r0 != r1) goto L36
            java.lang.String r1 = r2.A01
            java.lang.String r0 = r3.A01
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 == 0) goto L36
            java.lang.String r1 = r2.A02
            java.lang.String r0 = r3.A02
            goto L20
        Lb0:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9CD.equals(java.lang.Object):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x009b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int hashCode() {
        /*
            r4 = this;
            int r0 = r4.A04
            switch(r0) {
                case 0: goto L7b;
                case 1: goto L57;
                case 2: goto L29;
                default: goto L5;
            }
        L5:
            java.lang.String r0 = r4.A02
            int r0 = r0.hashCode()
            int r1 = r0 * 31
            java.lang.String r0 = r4.A01
            int r0 = r0.hashCode()
            int r1 = r1 + r0
            int r2 = r1 * 31
            boolean r1 = r4.A03
            r0 = 1237(0x4d5, float:1.733E-42)
            if (r1 == 0) goto L1e
            r0 = 1231(0x4cf, float:1.725E-42)
        L1e:
            int r2 = r2 + r0
            int r3 = r2 * 31
            java.lang.Object r0 = r4.A00
            int r1 = r0.hashCode()
        L27:
            int r1 = r1 + r3
            return r1
        L29:
            java.lang.String r0 = r4.A01
            r3 = 0
            if (r0 != 0) goto L52
            r0 = 0
        L2f:
            int r1 = r0 * 31
            java.lang.String r0 = r4.A02
            if (r0 != 0) goto L4d
            r0 = 0
        L36:
            int r1 = r1 + r0
            int r2 = r1 * 31
            boolean r1 = r4.A03
            r0 = 1237(0x4d5, float:1.733E-42)
            if (r1 == 0) goto L41
            r0 = 1231(0x4cf, float:1.725E-42)
        L41:
            int r2 = r2 + r0
            int r1 = r2 * 31
            java.lang.Object r0 = r4.A00
            if (r0 == 0) goto L27
            int r3 = r0.hashCode()
            goto L27
        L4d:
            int r0 = r0.hashCode()
            goto L36
        L52:
            int r0 = r0.hashCode()
            goto L2f
        L57:
            java.lang.String r0 = r4.A01
            r2 = 0
            if (r0 != 0) goto L76
            r0 = 0
        L5d:
            int r1 = r0 * 31
            java.lang.String r0 = r4.A02
            if (r0 != 0) goto L71
            r0 = 0
        L64:
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.Object r0 = r4.A00
            if (r0 == 0) goto L6f
            int r2 = r0.hashCode()
        L6f:
            int r1 = r1 + r2
            goto L93
        L71:
            int r0 = r0.hashCode()
            goto L64
        L76:
            int r0 = r0.hashCode()
            goto L5d
        L7b:
            java.lang.String r0 = r4.A02
            int r0 = r0.hashCode()
            int r1 = r0 * 31
            java.lang.String r0 = r4.A01
            int r0 = r0.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.Object r0 = r4.A00
            int r0 = r0.hashCode()
            int r1 = r1 + r0
        L93:
            int r3 = r1 * 31
            boolean r0 = r4.A03
            r1 = 1237(0x4d5, float:1.733E-42)
            if (r0 == 0) goto L27
            r1 = 1231(0x4cf, float:1.725E-42)
            goto L27
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9CD.hashCode():int");
    }

    public C9CD(C51755Mte c51755Mte, String str, String str2, boolean z) {
        this.A04 = 3;
        C14360o3.A0B(str, 1);
        C14360o3.A0B(str2, 2);
        this.A02 = str;
        this.A01 = str2;
        this.A03 = z;
        this.A00 = c51755Mte;
    }

    public C9CD(Object obj, String str, String str2, int i, boolean z) {
        this.A04 = i;
        this.A01 = str;
        this.A02 = str2;
        this.A00 = obj;
        this.A03 = z;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C9CD() {
        this(null, null, null, 2, false);
        this.A04 = 2;
        this.A04 = 2;
    }
}
