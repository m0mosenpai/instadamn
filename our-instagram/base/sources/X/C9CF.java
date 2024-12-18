package X;

/* renamed from: X.9CF, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9CF extends C0T6 implements InterfaceC132245y2 {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final String A03;
    public final String A04;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C9CF(X.C132175xv r14, java.lang.String r15, java.lang.String r16, int r17) {
        /*
            r13 = this;
            r7 = r13
            r0 = r17
            r13.A00 = r0
            r2 = 0
            X.BfP r1 = new X.BfP
            switch(r17) {
                case 0: goto L25;
                case 1: goto L1c;
                default: goto Lb;
            }
        Lb:
            r3 = r2
            r4 = r2
            r5 = r2
            r6 = r2
            r1.<init>(r2, r3, r4, r5, r6)
            r12 = 2
        L13:
            r8 = r14
            r10 = r15
            r11 = r16
            r9 = r1
            r7.<init>(r8, r9, r10, r11, r12)
            return
        L1c:
            r3 = r2
            r4 = r2
            r5 = r2
            r6 = r2
            r1.<init>(r2, r3, r4, r5, r6)
            r12 = 1
            goto L13
        L25:
            r3 = r2
            r4 = r2
            r5 = r2
            r6 = r2
            r1.<init>(r2, r3, r4, r5, r6)
            r12 = 0
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9CF.<init>(X.5xv, java.lang.String, java.lang.String, int):void");
    }

    public static boolean A00(Object obj, int i) {
        if ((obj instanceof C9CF) && ((C9CF) obj).A00 == i) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC132245y2
    public final String BKd() {
        String A00;
        switch (this.A00) {
            case 0:
                A00 = MSV.A00(508);
                break;
            case 1:
                A00 = "igMediaPivotPage";
                break;
            default:
                A00 = "transparencyLabel";
                break;
        }
        return AbstractC132295y8.A01(this, A00, ((C132175xv) this.A02).A03);
    }

    @Override // X.InterfaceC132245y2
    public final C132175xv Bet() {
        return (C132175xv) this.A02;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            int r0 = r2.A00
            switch(r0) {
                case 0: goto L3a;
                case 1: goto L3e;
                default: goto L5;
            }
        L5:
            if (r2 == r3) goto L6c
            r0 = 2
            boolean r0 = A00(r3, r0)
            if (r0 == 0) goto L38
            X.9CF r3 = (X.C9CF) r3
            java.lang.Object r1 = r2.A02
            java.lang.Object r0 = r3.A02
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 == 0) goto L38
            java.lang.Object r1 = r2.A01
            java.lang.Object r0 = r3.A01
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 == 0) goto L38
            java.lang.String r1 = r2.A03
            java.lang.String r0 = r3.A03
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 == 0) goto L38
            java.lang.String r1 = r2.A04
            java.lang.String r0 = r3.A04
        L32:
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 != 0) goto L6c
        L38:
            r0 = 0
            return r0
        L3a:
            if (r2 == r3) goto L6c
            r0 = 0
            goto L41
        L3e:
            if (r2 == r3) goto L6c
            r0 = 1
        L41:
            boolean r0 = A00(r3, r0)
            if (r0 == 0) goto L38
            X.9CF r3 = (X.C9CF) r3
            java.lang.Object r1 = r2.A02
            java.lang.Object r0 = r3.A02
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 == 0) goto L38
            java.lang.Object r1 = r2.A01
            java.lang.Object r0 = r3.A01
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 == 0) goto L38
            java.lang.String r1 = r2.A04
            java.lang.String r0 = r3.A04
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 == 0) goto L38
            java.lang.String r1 = r2.A03
            java.lang.String r0 = r3.A03
            goto L32
        L6c:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9CF.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int hashCode;
        String str;
        int i = this.A00;
        int hashCode2 = this.A02.hashCode();
        if (2 - i != 0) {
            hashCode = ((((hashCode2 * 31) + this.A01.hashCode()) * 31) + this.A04.hashCode()) * 31;
            str = this.A03;
        } else {
            hashCode = ((((hashCode2 * 31) + this.A01.hashCode()) * 31) + this.A03.hashCode()) * 31;
            str = this.A04;
        }
        return hashCode + str.hashCode();
    }

    @Override // X.InterfaceC132245y2
    public final /* synthetic */ C51758Mth CGR() {
        return AbstractC132295y8.A00();
    }

    public C9CF(C132175xv c132175xv, C26036BfP c26036BfP, String str, String str2, int i) {
        this.A00 = i;
        this.A02 = c132175xv;
        this.A01 = c26036BfP;
        switch (i) {
            case 0:
            case 1:
                this.A04 = str;
                this.A03 = str2;
                return;
            default:
                this.A03 = str;
                this.A04 = str2;
                return;
        }
    }
}
