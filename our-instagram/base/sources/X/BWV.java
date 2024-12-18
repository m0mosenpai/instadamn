package X;

/* loaded from: classes5.dex */
public final class BWV extends C0T6 implements InterfaceC30893Di6 {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public BWV(C26135BhM c26135BhM, C38321qM c38321qM) {
        this.A00 = 1;
        this.A00 = 1;
        this.A03 = c26135BhM;
        this.A01 = c38321qM;
        this.A02 = c26135BhM;
    }

    public static boolean A00(Object obj, int i) {
        if ((obj instanceof BWV) && ((BWV) obj).A00 == i) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002e A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x000e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            int r0 = r2.A00
            switch(r0) {
                case 0: goto L30;
                case 1: goto L50;
                default: goto L5;
            }
        L5:
            if (r2 == r3) goto L54
            r0 = 2
        L8:
            boolean r0 = A00(r3, r0)
            if (r0 == 0) goto L2e
            X.BWV r3 = (X.BWV) r3
            java.lang.Object r1 = r2.A03
            java.lang.Object r0 = r3.A03
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 == 0) goto L2e
            java.lang.Object r1 = r2.A01
            java.lang.Object r0 = r3.A01
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 == 0) goto L2e
            java.lang.Object r1 = r2.A02
            java.lang.Object r0 = r3.A02
        L28:
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 != 0) goto L54
        L2e:
            r0 = 0
            return r0
        L30:
            if (r2 == r3) goto L54
            r0 = 0
            boolean r0 = A00(r3, r0)
            if (r0 == 0) goto L2e
            X.BWV r3 = (X.BWV) r3
            java.lang.Object r1 = r2.A03
            java.lang.Object r0 = r3.A03
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 == 0) goto L2e
            java.lang.Object r1 = r2.A02
            java.lang.Object r0 = r3.A02
            if (r1 != r0) goto L2e
            java.lang.Object r1 = r2.A01
            java.lang.Object r0 = r3.A01
            goto L28
        L50:
            if (r2 == r3) goto L54
            r0 = 1
            goto L8
        L54:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BWV.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int A0J;
        Object obj;
        int i;
        switch (this.A00) {
            case 0:
                i = ((AbstractC167017dG.A0M(this.A03) * 31) + AbstractC167017dG.A0M(this.A02)) * 31;
                A0J = AbstractC166997dE.A0I(this.A01);
                break;
            case 1:
                A0J = AbstractC166997dE.A0J(this.A01, AbstractC166987dD.A0G(this.A03));
                obj = this.A02;
                if (obj == null) {
                    i = 0;
                    break;
                }
                i = obj.hashCode();
                break;
            default:
                A0J = ((AbstractC167017dG.A0M(this.A03) * 31) + AbstractC166997dE.A0I(this.A01)) * 31;
                obj = this.A02;
                i = obj.hashCode();
                break;
        }
        return i + A0J;
    }

    public BWV(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A03 = obj;
        this.A02 = obj2;
        this.A01 = obj3;
    }
}
