package X;

/* renamed from: X.Mt0, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51723Mt0 extends C0T6 {
    public Object A00;
    public String A01;
    public String A02;
    public String A03;
    public boolean A04;
    public final int A05;

    public C51723Mt0(C51757Mtg c51757Mtg, String str, String str2, String str3, boolean z) {
        this.A05 = 1;
        this.A02 = str;
        this.A03 = str2;
        this.A04 = z;
        this.A01 = str3;
        this.A00 = c51757Mtg;
    }

    public final boolean equals(Object obj) {
        C51723Mt0 c51723Mt0;
        Object obj2;
        Object obj3;
        switch (this.A05) {
            case 0:
                if (this != obj) {
                    if (!(obj instanceof C51723Mt0)) {
                        return false;
                    }
                    c51723Mt0 = (C51723Mt0) obj;
                    if (c51723Mt0.A05 != 0 || !C14360o3.A0K(this.A02, c51723Mt0.A02) || !C14360o3.A0K(this.A01, c51723Mt0.A01) || !C14360o3.A0K(this.A03, c51723Mt0.A03)) {
                        return false;
                    }
                    obj2 = this.A00;
                    obj3 = c51723Mt0.A00;
                    break;
                } else {
                    return true;
                }
                break;
            case 1:
                if (this != obj) {
                    if (!(obj instanceof C51723Mt0)) {
                        return false;
                    }
                    C51723Mt0 c51723Mt02 = (C51723Mt0) obj;
                    if (c51723Mt02.A05 != 1 || !C14360o3.A0K(this.A02, c51723Mt02.A02) || !C14360o3.A0K(this.A03, c51723Mt02.A03) || this.A04 != c51723Mt02.A04 || !C14360o3.A0K(this.A01, c51723Mt02.A01) || !C14360o3.A0K(this.A00, c51723Mt02.A00)) {
                        return false;
                    }
                    return true;
                }
                return true;
            default:
                if (this != obj) {
                    if (obj instanceof C51723Mt0) {
                        c51723Mt0 = (C51723Mt0) obj;
                        if (c51723Mt0.A05 == 2 && C14360o3.A0K(this.A01, c51723Mt0.A01) && C14360o3.A0K(this.A02, c51723Mt0.A02) && C14360o3.A0K(this.A00, c51723Mt0.A00)) {
                            obj2 = this.A03;
                            obj3 = c51723Mt0.A03;
                            break;
                        } else {
                            return false;
                        }
                    } else {
                        return false;
                    }
                } else {
                    return true;
                }
                break;
        }
        if (!C14360o3.A0K(obj2, obj3) || this.A04 != c51723Mt0.A04) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int hashCode() {
        /*
            r3 = this;
            int r0 = r3.A05
            switch(r0) {
                case 0: goto L52;
                case 1: goto L2d;
                default: goto L5;
            }
        L5:
            java.lang.String r0 = r3.A01
            int r1 = X.AbstractC166987dD.A0J(r0)
            java.lang.String r0 = r3.A02
            int r1 = X.AbstractC166997dE.A0K(r0, r1)
            java.lang.Object r0 = r3.A00
            int r0 = X.AbstractC167017dG.A0M(r0)
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.String r0 = r3.A03
            int r0 = X.AbstractC25227BEk.A07(r0)
        L20:
            int r1 = r1 + r0
            int r2 = r1 * 31
            boolean r1 = r3.A04
            r0 = 1237(0x4d5, float:1.733E-42)
            if (r1 == 0) goto L2b
            r0 = 1231(0x4cf, float:1.725E-42)
        L2b:
            int r2 = r2 + r0
            return r2
        L2d:
            java.lang.String r0 = r3.A02
            int r1 = X.AbstractC166987dD.A0J(r0)
            java.lang.String r0 = r3.A03
            int r0 = X.AbstractC167017dG.A0O(r0)
            int r1 = r1 + r0
            int r1 = r1 * 31
            boolean r0 = r3.A04
            int r1 = X.AbstractC167007dF.A0D(r0, r1)
            java.lang.String r0 = r3.A01
            int r0 = X.AbstractC25227BEk.A07(r0)
            int r1 = r1 + r0
            int r2 = r1 * 31
            java.lang.Object r0 = r3.A00
            int r0 = r0.hashCode()
            goto L2b
        L52:
            java.lang.String r0 = r3.A02
            int r0 = X.AbstractC167017dG.A0O(r0)
            int r1 = r0 * 31
            java.lang.String r0 = r3.A01
            int r0 = X.AbstractC167017dG.A0O(r0)
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.String r0 = r3.A03
            int r0 = X.AbstractC167017dG.A0O(r0)
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.Object r0 = r3.A00
            int r0 = X.AbstractC166997dE.A0I(r0)
            goto L20
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C51723Mt0.hashCode():int");
    }

    public C51723Mt0(Boolean bool, String str, String str2, String str3, boolean z) {
        this.A05 = 0;
        this.A02 = str;
        this.A01 = str2;
        this.A03 = str3;
        this.A00 = bool;
        this.A04 = z;
    }

    public C51723Mt0() {
        this.A05 = 2;
        this.A05 = 2;
        this.A01 = "$0";
        this.A02 = "0";
        this.A00 = 0;
        this.A03 = "$0";
        this.A04 = false;
    }
}
