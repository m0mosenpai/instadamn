package X;

/* renamed from: X.9CB, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9CB extends C0T6 {
    public final int A00 = 2;
    public final Object A01;
    public final String A02;
    public final String A03;

    public C9CB(C1EN c1en, String str, String str2) {
        C14360o3.A0B(str, 1);
        C14360o3.A0B(c1en, 2);
        C14360o3.A0B(str2, 3);
        this.A03 = str;
        this.A01 = c1en;
        this.A02 = str2;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            int r0 = r2.A00
            switch(r0) {
                case 0: goto L2e;
                case 1: goto L50;
                default: goto L5;
            }
        L5:
            if (r2 == r3) goto L73
            r1 = 2
            boolean r0 = r3 instanceof X.C9CB
            if (r0 == 0) goto L2c
            X.9CB r3 = (X.C9CB) r3
            int r0 = r3.A00
            if (r0 != r1) goto L2c
            java.lang.String r1 = r2.A03
            java.lang.String r0 = r3.A03
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 == 0) goto L2c
            java.lang.Object r1 = r2.A01
            java.lang.Object r0 = r3.A01
            if (r1 != r0) goto L2c
            java.lang.String r1 = r2.A02
            java.lang.String r0 = r3.A02
        L26:
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 != 0) goto L73
        L2c:
            r0 = 0
            return r0
        L2e:
            if (r2 == r3) goto L73
            r1 = 0
            boolean r0 = r3 instanceof X.C9CB
            if (r0 == 0) goto L2c
            X.9CB r3 = (X.C9CB) r3
            int r0 = r3.A00
            if (r0 != r1) goto L2c
            java.lang.String r1 = r2.A02
            java.lang.String r0 = r3.A02
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 == 0) goto L2c
            java.lang.Object r1 = r2.A01
            java.lang.Object r0 = r3.A01
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 != 0) goto L6e
            goto L2c
        L50:
            if (r2 == r3) goto L73
            r1 = 1
            boolean r0 = r3 instanceof X.C9CB
            if (r0 == 0) goto L2c
            X.9CB r3 = (X.C9CB) r3
            int r0 = r3.A00
            if (r0 != r1) goto L2c
            java.lang.String r1 = r2.A02
            java.lang.String r0 = r3.A02
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 == 0) goto L2c
            java.lang.Object r1 = r2.A01
            java.lang.Object r0 = r3.A01
            if (r1 == r0) goto L6e
            goto L2c
        L6e:
            java.lang.String r1 = r2.A03
            java.lang.String r0 = r3.A03
            goto L26
        L73:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9CB.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int hashCode;
        String str;
        int i;
        int hashCode2;
        switch (this.A00) {
            case 0:
                int hashCode3 = this.A02.hashCode() * 31;
                Object obj = this.A01;
                hashCode = 0;
                if (obj == null) {
                    hashCode2 = 0;
                } else {
                    hashCode2 = obj.hashCode();
                }
                i = (hashCode3 + hashCode2) * 31;
                String str2 = this.A03;
                if (str2 != null) {
                    hashCode = str2.hashCode();
                    break;
                }
                break;
            case 1:
                hashCode = ((this.A02.hashCode() * 31) + this.A01.hashCode()) * 31;
                str = this.A03;
                if (str == null) {
                    i = 0;
                    break;
                }
                i = str.hashCode();
                break;
            default:
                hashCode = ((this.A03.hashCode() * 31) + this.A01.hashCode()) * 31;
                str = this.A02;
                i = str.hashCode();
                break;
        }
        return i + hashCode;
    }

    public C9CB(AnonymousClass859 anonymousClass859, String str, String str2) {
        C14360o3.A0B(anonymousClass859, 2);
        this.A02 = str;
        this.A01 = anonymousClass859;
        this.A03 = str2;
    }

    public C9CB(String str, Object obj, String str2) {
        this.A02 = str;
        this.A01 = obj;
        this.A03 = str2;
    }

    public C9CB(AnonymousClass859 anonymousClass859, String str) {
        this(anonymousClass859, str, (String) null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C9CB(X.C1EN r2, java.lang.String r3) {
        /*
            r1 = this;
            r0 = 2
            r1.A00 = r0
            java.util.UUID r0 = java.util.UUID.randomUUID()
            java.lang.String r0 = r0.toString()
            X.C14360o3.A07(r0)
            r1.<init>(r2, r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9CB.<init>(X.1EN, java.lang.String):void");
    }
}
