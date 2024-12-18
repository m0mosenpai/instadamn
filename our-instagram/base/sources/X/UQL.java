package X;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes11.dex */
public final class UQL extends C0T6 {
    public int A00;
    public int A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;
    public final int A06;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public UQL(String str, String str2, String str3, String str4, DefaultConstructorMarker defaultConstructorMarker, int i, int i2, int i3, int i4) {
        this((String) null, (String) null, (String) null, (String) null, 0, 0, 2);
        this.A06 = 2;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            int r0 = r2.A06
            switch(r0) {
                case 0: goto L48;
                case 1: goto L80;
                default: goto L5;
            }
        L5:
            if (r2 == r3) goto Lbd
            r1 = 2
            boolean r0 = r3 instanceof X.UQL
            if (r0 == 0) goto L46
            X.UQL r3 = (X.UQL) r3
            int r0 = r3.A06
            if (r0 != r1) goto L46
            int r1 = r2.A01
            int r0 = r3.A01
            if (r1 != r0) goto L46
            int r1 = r2.A00
            int r0 = r3.A00
            if (r1 != r0) goto L46
            java.lang.String r1 = r2.A04
            java.lang.String r0 = r3.A04
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 == 0) goto L46
            java.lang.String r1 = r2.A05
            java.lang.String r0 = r3.A05
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 == 0) goto L46
            java.lang.String r1 = r2.A02
            java.lang.String r0 = r3.A02
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 == 0) goto L46
            java.lang.String r1 = r2.A03
            java.lang.String r0 = r3.A03
        L40:
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 != 0) goto Lbd
        L46:
            r0 = 0
            return r0
        L48:
            if (r2 == r3) goto Lbd
            r1 = 0
            boolean r0 = r3 instanceof X.UQL
            if (r0 == 0) goto L46
            X.UQL r3 = (X.UQL) r3
            int r0 = r3.A06
            if (r0 != r1) goto L46
            java.lang.String r1 = r2.A03
            java.lang.String r0 = r3.A03
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 == 0) goto L46
            java.lang.String r1 = r2.A04
            java.lang.String r0 = r3.A04
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 == 0) goto L46
            java.lang.String r1 = r2.A05
            java.lang.String r0 = r3.A05
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 == 0) goto L46
            int r1 = r2.A01
            int r0 = r3.A01
            if (r1 != r0) goto L46
            int r1 = r2.A00
            int r0 = r3.A00
            if (r1 == r0) goto Lb8
            goto L46
        L80:
            if (r2 == r3) goto Lbd
            r1 = 1
            boolean r0 = r3 instanceof X.UQL
            if (r0 == 0) goto L46
            X.UQL r3 = (X.UQL) r3
            int r0 = r3.A06
            if (r0 != r1) goto L46
            int r1 = r2.A00
            int r0 = r3.A00
            if (r1 != r0) goto L46
            int r1 = r2.A01
            int r0 = r3.A01
            if (r1 != r0) goto L46
            java.lang.String r1 = r2.A03
            java.lang.String r0 = r3.A03
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 == 0) goto L46
            java.lang.String r1 = r2.A05
            java.lang.String r0 = r3.A05
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 == 0) goto L46
            java.lang.String r1 = r2.A04
            java.lang.String r0 = r3.A04
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 != 0) goto Lb8
            goto L46
        Lb8:
            java.lang.String r1 = r2.A02
            java.lang.String r0 = r3.A02
            goto L40
        Lbd:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.UQL.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i;
        int A0O;
        String str;
        switch (this.A06) {
            case 0:
                return ((((AbstractC166997dE.A0K(this.A05, AbstractC166997dE.A0K(this.A04, this.A03.hashCode() * 31)) + this.A01) * 31) + this.A00) * 31) + this.A02.hashCode();
            case 1:
                i = 0;
                A0O = ((((((((this.A00 * 31) + this.A01) * 31) + AbstractC167017dG.A0O(this.A03)) * 31) + AbstractC167017dG.A0O(this.A05)) * 31) + AbstractC167017dG.A0O(this.A04)) * 31;
                str = this.A02;
                break;
            default:
                i = 0;
                A0O = ((((((((this.A01 * 31) + this.A00) * 31) + AbstractC167017dG.A0O(this.A04)) * 31) + AbstractC167017dG.A0O(this.A05)) * 31) + AbstractC167017dG.A0O(this.A02)) * 31;
                str = this.A03;
                break;
        }
        if (str != null) {
            i = str.hashCode();
        }
        return A0O + i;
    }

    public UQL(String str, String str2, String str3, int i, int i2, String str4, int i3) {
        this.A06 = 0;
        this.A03 = str;
        this.A04 = str2;
        this.A05 = str3;
        this.A01 = i;
        this.A00 = i2;
        this.A02 = str4;
    }

    public UQL(String str, String str2, String str3, String str4, int i, int i2, int i3) {
        this.A06 = i3;
        if (1 - i3 != 0) {
            this.A01 = i;
            this.A00 = i2;
            this.A04 = str;
            this.A05 = str2;
            this.A02 = str3;
            this.A03 = str4;
            return;
        }
        this.A00 = i;
        this.A01 = i2;
        this.A03 = str;
        this.A05 = str2;
        this.A04 = str3;
        this.A02 = str4;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public UQL() {
        this((String) null, (String) null, (String) null, (String) null, 0, 0, 1);
        this.A06 = 1;
        this.A06 = 1;
    }
}
