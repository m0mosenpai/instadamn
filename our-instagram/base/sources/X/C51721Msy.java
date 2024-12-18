package X;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: X.Msy, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51721Msy extends C0T6 {
    public final int A00;
    public final String A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;

    public C51721Msy(String str, int i, boolean z, boolean z2, boolean z3) {
        this.A00 = i;
        this.A01 = str;
        this.A03 = z;
        this.A02 = z2;
        this.A04 = z3;
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        switch (this.A00) {
            case 0:
                if (this != obj) {
                    if (!(obj instanceof C51721Msy)) {
                        return false;
                    }
                    C51721Msy c51721Msy = (C51721Msy) obj;
                    if (c51721Msy.A00 != 0 || this.A04 != c51721Msy.A04 || this.A02 != c51721Msy.A02 || !C14360o3.A0K(this.A01, c51721Msy.A01)) {
                        return false;
                    }
                    z = this.A03;
                    z2 = c51721Msy.A03;
                    break;
                } else {
                    return true;
                }
            case 1:
                if (this != obj) {
                    if (!(obj instanceof C51721Msy)) {
                        return false;
                    }
                    C51721Msy c51721Msy2 = (C51721Msy) obj;
                    if (c51721Msy2.A00 != 1 || this.A04 != c51721Msy2.A04 || this.A02 != c51721Msy2.A02 || this.A03 != c51721Msy2.A03 || !C14360o3.A0K(this.A01, c51721Msy2.A01)) {
                        return false;
                    }
                    return true;
                }
                return true;
            default:
                if (this != obj) {
                    if (obj instanceof C51721Msy) {
                        C51721Msy c51721Msy3 = (C51721Msy) obj;
                        if (c51721Msy3.A00 == 2 && C14360o3.A0K(this.A01, c51721Msy3.A01) && this.A03 == c51721Msy3.A03 && this.A02 == c51721Msy3.A02) {
                            z = this.A04;
                            z2 = c51721Msy3.A04;
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
        if (z != z2) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int hashCode() {
        /*
            r3 = this;
            int r0 = r3.A00
            switch(r0) {
                case 0: goto L3c;
                case 1: goto L23;
                default: goto L5;
            }
        L5:
            java.lang.String r0 = r3.A01
            int r0 = X.AbstractC167017dG.A0O(r0)
            int r1 = r0 * 31
            boolean r0 = r3.A03
            int r1 = X.AbstractC167007dF.A0D(r0, r1)
            boolean r0 = r3.A02
            int r2 = X.AbstractC167007dF.A0D(r0, r1)
            boolean r1 = r3.A04
        L1b:
            r0 = 1237(0x4d5, float:1.733E-42)
            if (r1 == 0) goto L21
            r0 = 1231(0x4cf, float:1.725E-42)
        L21:
            int r2 = r2 + r0
            return r2
        L23:
            boolean r0 = r3.A04
            int r1 = X.AbstractC25225BEi.A08(r0)
            boolean r0 = r3.A02
            int r1 = X.AbstractC167007dF.A0D(r0, r1)
            boolean r0 = r3.A03
            int r2 = X.AbstractC167007dF.A0D(r0, r1)
            java.lang.String r0 = r3.A01
            int r0 = X.AbstractC167017dG.A0O(r0)
            goto L21
        L3c:
            boolean r0 = r3.A04
            int r1 = X.AbstractC25225BEi.A08(r0)
            boolean r0 = r3.A02
            int r1 = X.AbstractC167007dF.A0D(r0, r1)
            java.lang.String r0 = r3.A01
            int r0 = X.AbstractC167017dG.A0O(r0)
            int r1 = r1 + r0
            int r2 = r1 * 31
            boolean r1 = r3.A03
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C51721Msy.hashCode():int");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C51721Msy(String str, DefaultConstructorMarker defaultConstructorMarker, int i, int i2, boolean z, boolean z2, boolean z3) {
        this(null, 1, false, false, false);
        this.A00 = 1;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C51721Msy() {
        this(null, 2, true, false, false);
        this.A00 = 2;
    }
}
