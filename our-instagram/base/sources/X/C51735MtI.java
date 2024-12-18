package X;

import java.util.Date;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: X.MtI, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51735MtI extends C0T6 {
    public final int A00;
    public final Object A01;
    public final String A02;
    public final String A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C51735MtI() {
        this(null, "", "", false, false, false);
        this.A00 = 1;
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        switch (this.A00) {
            case 0:
                if (this != obj) {
                    if (!(obj instanceof C51735MtI)) {
                        return false;
                    }
                    C51735MtI c51735MtI = (C51735MtI) obj;
                    if (c51735MtI.A00 != 0 || !C14360o3.A0K(this.A01, c51735MtI.A01) || this.A05 != c51735MtI.A05 || this.A04 != c51735MtI.A04 || !C14360o3.A0K(this.A03, c51735MtI.A03) || !C14360o3.A0K(this.A02, c51735MtI.A02)) {
                        return false;
                    }
                    z = this.A06;
                    z2 = c51735MtI.A06;
                    break;
                } else {
                    return true;
                }
                break;
            case 1:
                if (this != obj) {
                    if (!(obj instanceof C51735MtI)) {
                        return false;
                    }
                    C51735MtI c51735MtI2 = (C51735MtI) obj;
                    if (c51735MtI2.A00 != 1 || this.A04 != c51735MtI2.A04 || !C14360o3.A0K(this.A02, c51735MtI2.A02) || !C14360o3.A0K(this.A03, c51735MtI2.A03) || this.A06 != c51735MtI2.A06 || this.A05 != c51735MtI2.A05 || !C14360o3.A0K(this.A01, c51735MtI2.A01)) {
                        return false;
                    }
                    return true;
                }
                return true;
            default:
                if (this != obj) {
                    if (obj instanceof C51735MtI) {
                        C51735MtI c51735MtI3 = (C51735MtI) obj;
                        if (c51735MtI3.A00 == 2 && this.A06 == c51735MtI3.A06 && C14360o3.A0K(this.A03, c51735MtI3.A03) && this.A04 == c51735MtI3.A04 && C14360o3.A0K(this.A01, c51735MtI3.A01) && C14360o3.A0K(this.A02, c51735MtI3.A02)) {
                            z = this.A05;
                            z2 = c51735MtI3.A05;
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

    /* JADX WARN: Removed duplicated region for block: B:6:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int hashCode() {
        /*
            r3 = this;
            int r0 = r3.A00
            switch(r0) {
                case 0: goto L5b;
                case 1: goto L36;
                default: goto L5;
            }
        L5:
            boolean r0 = r3.A06
            int r1 = X.AbstractC25225BEi.A08(r0)
            java.lang.String r0 = r3.A03
            int r0 = X.AbstractC167017dG.A0O(r0)
            int r1 = r1 + r0
            int r1 = r1 * 31
            boolean r0 = r3.A04
            int r1 = X.AbstractC167007dF.A0D(r0, r1)
            java.lang.Object r0 = r3.A01
            int r0 = X.AbstractC167017dG.A0M(r0)
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.String r0 = r3.A02
            int r0 = X.AbstractC25227BEk.A07(r0)
            int r1 = r1 + r0
            int r2 = r1 * 31
            boolean r1 = r3.A05
        L2e:
            r0 = 1237(0x4d5, float:1.733E-42)
            if (r1 == 0) goto L34
            r0 = 1231(0x4cf, float:1.725E-42)
        L34:
            int r2 = r2 + r0
            return r2
        L36:
            boolean r0 = r3.A04
            int r1 = X.AbstractC25225BEi.A08(r0)
            java.lang.String r0 = r3.A02
            int r1 = X.AbstractC166997dE.A0K(r0, r1)
            java.lang.String r0 = r3.A03
            int r1 = X.AbstractC166997dE.A0K(r0, r1)
            boolean r0 = r3.A06
            int r1 = X.AbstractC167007dF.A0D(r0, r1)
            boolean r0 = r3.A05
            int r2 = X.AbstractC167007dF.A0D(r0, r1)
            java.lang.Object r0 = r3.A01
            int r0 = X.AbstractC167017dG.A0M(r0)
            goto L34
        L5b:
            java.lang.Object r0 = r3.A01
            int r0 = X.AbstractC167017dG.A0M(r0)
            int r1 = r0 * 31
            boolean r0 = r3.A05
            int r1 = X.AbstractC167007dF.A0D(r0, r1)
            boolean r0 = r3.A04
            int r1 = X.AbstractC167007dF.A0D(r0, r1)
            java.lang.String r0 = r3.A03
            int r0 = X.AbstractC167017dG.A0O(r0)
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.String r0 = r3.A02
            int r0 = X.AbstractC25227BEk.A07(r0)
            int r1 = r1 + r0
            int r2 = r1 * 31
            boolean r1 = r3.A06
            goto L2e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C51735MtI.hashCode():int");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C51735MtI(String str, String str2, Date date, DefaultConstructorMarker defaultConstructorMarker, int i, int i2, boolean z, boolean z2, boolean z3) {
        this(null, null, null, 0, false, false, false);
        this.A00 = 0;
    }

    public C51735MtI(Object obj, String str, String str2, int i, boolean z, boolean z2, boolean z3) {
        this.A00 = i;
        this.A01 = obj;
        this.A05 = z;
        this.A04 = z2;
        this.A03 = str;
        this.A02 = str2;
        this.A06 = z3;
    }

    public C51735MtI(C26173Bhy c26173Bhy, String str, String str2, boolean z, boolean z2, boolean z3) {
        this.A00 = 1;
        this.A04 = z;
        this.A02 = str;
        this.A03 = str2;
        this.A06 = z2;
        this.A05 = z3;
        this.A01 = c26173Bhy;
    }
}
