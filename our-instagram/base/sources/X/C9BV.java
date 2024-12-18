package X;

/* renamed from: X.9BV, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9BV extends C0T6 implements InterfaceC76583c3 {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C9BV(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    public static boolean A00(Object obj, int i) {
        if ((obj instanceof C9BV) && ((C9BV) obj).A00 == i) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0024 A[ORIG_RETURN, RETURN] */
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
                case 0: goto L26;
                case 1: goto L40;
                default: goto L5;
            }
        L5:
            if (r2 == r3) goto L44
            r0 = 2
        L8:
            boolean r0 = A00(r3, r0)
            if (r0 == 0) goto L24
            X.9BV r3 = (X.C9BV) r3
            java.lang.Object r1 = r2.A01
            java.lang.Object r0 = r3.A01
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 == 0) goto L24
            java.lang.Object r1 = r2.A02
            java.lang.Object r0 = r3.A02
        L1e:
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 != 0) goto L44
        L24:
            r0 = 0
            return r0
        L26:
            if (r2 == r3) goto L44
            r0 = 0
            boolean r0 = A00(r3, r0)
            if (r0 == 0) goto L24
            X.9BV r3 = (X.C9BV) r3
            java.lang.Object r1 = r2.A02
            java.lang.Object r0 = r3.A02
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 == 0) goto L24
            java.lang.Object r1 = r2.A01
            java.lang.Object r0 = r3.A01
            goto L1e
        L40:
            if (r2 == r3) goto L44
            r0 = 1
            goto L8
        L44:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9BV.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int hashCode;
        Object obj;
        if (this.A00 != 0) {
            hashCode = this.A01.hashCode() * 31;
            obj = this.A02;
        } else {
            hashCode = this.A02.hashCode() * 31;
            obj = this.A01;
        }
        return hashCode + obj.hashCode();
    }
}
