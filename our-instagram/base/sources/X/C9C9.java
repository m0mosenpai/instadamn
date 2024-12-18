package X;

/* renamed from: X.9C9, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9C9 extends C0T6 {
    public String A00;
    public String A01;
    public final int A02;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C9C9(int r3) {
        /*
            r2 = this;
            r2.A02 = r3
            r1 = 0
            switch(r3) {
                case 6: goto L11;
                case 7: goto L6;
                case 8: goto Le;
                default: goto L6;
            }
        L6:
            r0 = 10
        L8:
            r2.A02 = r0
            r2.<init>(r1, r1, r0)
            return
        Le:
            r0 = 8
            goto L8
        L11:
            r0 = 6
            goto L8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9C9.<init>(int):void");
    }

    public static boolean A00(Object obj, int i) {
        if ((obj instanceof C9C9) && ((C9C9) obj).A02 == i) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0067 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            int r0 = r2.A02
            switch(r0) {
                case 1: goto La;
                case 2: goto L5;
                case 3: goto Le;
                case 4: goto L12;
                case 5: goto L16;
                case 6: goto L1a;
                case 7: goto L1e;
                case 8: goto L22;
                case 9: goto L27;
                case 10: goto L42;
                case 11: goto L47;
                default: goto L5;
            }
        L5:
            boolean r0 = super.equals(r3)
            return r0
        La:
            if (r2 == r3) goto L69
            r0 = 1
            goto L2b
        Le:
            if (r2 == r3) goto L69
            r0 = 3
            goto L2b
        L12:
            if (r2 == r3) goto L69
            r0 = 4
            goto L4b
        L16:
            if (r2 == r3) goto L69
            r0 = 5
            goto L2b
        L1a:
            if (r2 == r3) goto L69
            r0 = 6
            goto L2b
        L1e:
            if (r2 == r3) goto L69
            r0 = 7
            goto L2b
        L22:
            if (r2 == r3) goto L69
            r0 = 8
            goto L2b
        L27:
            if (r2 == r3) goto L69
            r0 = 9
        L2b:
            boolean r0 = A00(r3, r0)
            if (r0 == 0) goto L67
            X.9C9 r3 = (X.C9C9) r3
            java.lang.String r1 = r2.A01
            java.lang.String r0 = r3.A01
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 == 0) goto L67
            java.lang.String r1 = r2.A00
            java.lang.String r0 = r3.A00
            goto L61
        L42:
            if (r2 == r3) goto L69
            r0 = 10
            goto L4b
        L47:
            if (r2 == r3) goto L69
            r0 = 11
        L4b:
            boolean r0 = A00(r3, r0)
            if (r0 == 0) goto L67
            X.9C9 r3 = (X.C9C9) r3
            java.lang.String r1 = r2.A00
            java.lang.String r0 = r3.A00
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 == 0) goto L67
            java.lang.String r1 = r2.A01
            java.lang.String r0 = r3.A01
        L61:
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 != 0) goto L69
        L67:
            r0 = 0
            return r0
        L69:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9C9.equals(java.lang.Object):boolean");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int hashCode() {
        /*
            r3 = this;
            int r0 = r3.A02
            switch(r0) {
                case 1: goto La;
                case 2: goto L5;
                case 3: goto La;
                case 4: goto L1a;
                case 5: goto L30;
                case 6: goto La;
                case 7: goto L3b;
                case 8: goto La;
                case 9: goto L30;
                case 10: goto L1a;
                case 11: goto L4f;
                default: goto L5;
            }
        L5:
            int r1 = super.hashCode()
            return r1
        La:
            java.lang.String r0 = r3.A01
            r2 = 0
            if (r0 != 0) goto L15
            r0 = 0
        L10:
            int r1 = r0 * 31
            java.lang.String r0 = r3.A00
            goto L24
        L15:
            int r0 = r0.hashCode()
            goto L10
        L1a:
            java.lang.String r0 = r3.A00
            r2 = 0
            if (r0 != 0) goto L2b
            r0 = 0
        L20:
            int r1 = r0 * 31
            java.lang.String r0 = r3.A01
        L24:
            if (r0 == 0) goto L48
            int r2 = r0.hashCode()
            goto L48
        L2b:
            int r0 = r0.hashCode()
            goto L20
        L30:
            java.lang.String r0 = r3.A01
            int r0 = r0.hashCode()
            int r1 = r0 * 31
            java.lang.String r0 = r3.A00
            goto L59
        L3b:
            java.lang.String r0 = r3.A01
            int r0 = r0.hashCode()
            int r2 = r0 * 31
            java.lang.String r0 = r3.A00
            if (r0 != 0) goto L4a
            r1 = 0
        L48:
            int r1 = r1 + r2
            return r1
        L4a:
            int r1 = r0.hashCode()
            goto L48
        L4f:
            java.lang.String r0 = r3.A00
            int r0 = r0.hashCode()
            int r1 = r0 * 31
            java.lang.String r0 = r3.A01
        L59:
            int r0 = r0.hashCode()
            int r1 = r1 + r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9C9.hashCode():int");
    }

    public final String toString() {
        if (10 - this.A02 != 0) {
            return super.toString();
        }
        return AnonymousClass001.A0v("CreatedFromHighlightInfo(mediaId=", this.A00, ", reelId=", this.A01, ')');
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    public C9C9(String str, String str2, int i) {
        this.A02 = i;
        switch (i) {
            case 0:
                C14360o3.A0B(str2, 2);
                this.A00 = str;
                this.A01 = str2;
                return;
            case 1:
            case 3:
            case 6:
            case 8:
            case 9:
                this.A01 = str;
                this.A00 = str2;
                return;
            case 2:
            case 4:
            case 10:
                this.A00 = str;
                this.A01 = str2;
                return;
            case 5:
                C14360o3.A0B(str, 1);
                C14360o3.A0B(str2, 2);
                this.A01 = str;
                this.A00 = str2;
                return;
            case 7:
                C14360o3.A0B(str, 1);
                this.A01 = str;
                this.A00 = str2;
                return;
            default:
                C14360o3.A0B(str, 1);
                C14360o3.A0B(str2, 2);
                this.A00 = str;
                this.A01 = str2;
                return;
        }
    }
}
