package X;

/* renamed from: X.9CL, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9CL extends C0T6 {
    public Object A00;
    public Object A01;
    public String A02;
    public String A03;
    public String A04;
    public final int A05;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C9CL(C38321qM c38321qM) {
        this(c38321qM, null, null, null, null);
        this.A05 = 2;
    }

    public static boolean A00(Object obj, int i) {
        if ((obj instanceof C9CL) && ((C9CL) obj).A05 == i) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            int r0 = r2.A05
            switch(r0) {
                case 0: goto L2c;
                case 1: goto L64;
                default: goto L5;
            }
        L5:
            if (r2 == r3) goto La3
            r0 = 2
            boolean r0 = A00(r3, r0)
            if (r0 == 0) goto L2a
            X.9CL r3 = (X.C9CL) r3
            java.lang.Object r1 = r2.A00
            java.lang.Object r0 = r3.A00
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 == 0) goto L2a
            java.lang.String r1 = r2.A04
            java.lang.String r0 = r3.A04
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 == 0) goto L2a
            java.lang.Object r1 = r2.A01
            java.lang.Object r0 = r3.A01
            if (r1 == r0) goto L8e
        L2a:
            r0 = 0
            return r0
        L2c:
            if (r2 == r3) goto La3
            r0 = 0
            boolean r0 = A00(r3, r0)
            if (r0 == 0) goto L2a
            X.9CL r3 = (X.C9CL) r3
            java.lang.String r1 = r2.A03
            java.lang.String r0 = r3.A03
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 == 0) goto L2a
            java.lang.String r1 = r2.A02
            java.lang.String r0 = r3.A02
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 == 0) goto L2a
            java.lang.Object r1 = r2.A00
            java.lang.Object r0 = r3.A00
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 == 0) goto L2a
            java.lang.Object r1 = r2.A01
            java.lang.Object r0 = r3.A01
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 == 0) goto L2a
            java.lang.String r1 = r2.A04
            java.lang.String r0 = r3.A04
            goto L9c
        L64:
            if (r2 == r3) goto La3
            r0 = 1
            boolean r0 = A00(r3, r0)
            if (r0 == 0) goto L2a
            X.9CL r3 = (X.C9CL) r3
            java.lang.String r1 = r2.A04
            java.lang.String r0 = r3.A04
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 == 0) goto L2a
            java.lang.Object r1 = r2.A01
            java.lang.Object r0 = r3.A01
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 == 0) goto L2a
            java.lang.Object r1 = r2.A00
            java.lang.Object r0 = r3.A00
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 != 0) goto L8e
            goto L2a
        L8e:
            java.lang.String r1 = r2.A02
            java.lang.String r0 = r3.A02
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 == 0) goto L2a
            java.lang.String r1 = r2.A03
            java.lang.String r0 = r3.A03
        L9c:
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 != 0) goto La3
            goto L2a
        La3:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9CL.equals(java.lang.Object):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int hashCode() {
        /*
            r5 = this;
            int r1 = r5.A05
            switch(r1) {
                case 0: goto L71;
                case 1: goto L4c;
                default: goto L5;
            }
        L5:
            java.lang.Object r1 = r5.A00
            int r1 = r1.hashCode()
            int r2 = r1 * 31
            java.lang.String r1 = r5.A04
            r4 = 0
            if (r1 != 0) goto L47
            r1 = 0
        L13:
            int r2 = r2 + r1
            int r3 = r2 * 31
            java.lang.Object r1 = r5.A01
            java.lang.Number r1 = (java.lang.Number) r1
            if (r1 == 0) goto L6f
            int r2 = r1.intValue()
            r0 = 1
            if (r0 == r2) goto L44
            java.lang.String r1 = "DIRECT_REPLY_TO_AUTHOR"
        L25:
            int r1 = r1.hashCode()
            int r1 = r1 + r2
        L2a:
            int r3 = r3 + r1
            int r2 = r3 * 31
            java.lang.String r1 = r5.A02
            if (r1 != 0) goto L3f
            r1 = 0
        L32:
            int r2 = r2 + r1
            int r2 = r2 * 31
            java.lang.String r1 = r5.A03
        L37:
            if (r1 == 0) goto L3d
            int r4 = r1.hashCode()
        L3d:
            int r2 = r2 + r4
            return r2
        L3f:
            int r1 = r1.hashCode()
            goto L32
        L44:
            java.lang.String r1 = "COAUTHOR_INVITE"
            goto L25
        L47:
            int r1 = r1.hashCode()
            goto L13
        L4c:
            java.lang.String r1 = r5.A04
            r4 = 0
            if (r1 != 0) goto L6a
            r1 = 0
        L52:
            int r2 = r1 * 31
            java.lang.Object r1 = r5.A01
            if (r1 != 0) goto L65
            r1 = 0
        L59:
            int r2 = r2 + r1
            int r3 = r2 * 31
            java.lang.Object r1 = r5.A00
            if (r1 == 0) goto L6f
            int r1 = r1.hashCode()
            goto L2a
        L65:
            int r1 = r1.hashCode()
            goto L59
        L6a:
            int r1 = r1.hashCode()
            goto L52
        L6f:
            r1 = 0
            goto L2a
        L71:
            java.lang.String r1 = r5.A03
            r4 = 0
            if (r1 != 0) goto La3
            r1 = 0
        L77:
            int r2 = r1 * 31
            java.lang.String r1 = r5.A02
            if (r1 != 0) goto L9e
            r1 = 0
        L7e:
            int r2 = r2 + r1
            int r2 = r2 * 31
            java.lang.Object r1 = r5.A00
            if (r1 != 0) goto L99
            r1 = 0
        L86:
            int r2 = r2 + r1
            int r2 = r2 * 31
            java.lang.Object r1 = r5.A01
            if (r1 != 0) goto L94
            r1 = 0
        L8e:
            int r2 = r2 + r1
            int r2 = r2 * 31
            java.lang.String r1 = r5.A04
            goto L37
        L94:
            int r1 = r1.hashCode()
            goto L8e
        L99:
            int r1 = r1.hashCode()
            goto L86
        L9e:
            int r1 = r1.hashCode()
            goto L7e
        La3:
            int r1 = r1.hashCode()
            goto L77
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9CL.hashCode():int");
    }

    public C9CL(C38321qM c38321qM, Integer num, String str, String str2, String str3) {
        this.A05 = 2;
        C14360o3.A0B(c38321qM, 1);
        this.A00 = c38321qM;
        this.A04 = str;
        this.A01 = num;
        this.A02 = str2;
        this.A03 = str3;
    }

    public C9CL(Object obj, Object obj2, String str, String str2, String str3, int i) {
        this.A05 = i;
        this.A04 = str;
        this.A01 = obj;
        this.A00 = obj2;
        this.A02 = str2;
        this.A03 = str3;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C9CL() {
        this(null, null, null, null, null, 1);
        this.A05 = 1;
    }
}
