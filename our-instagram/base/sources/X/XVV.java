package X;

/* loaded from: classes12.dex */
public final class XVV extends C0T6 {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final String A05;
    public final String A06;

    public XVV(Object obj, Object obj2, Object obj3, Object obj4, String str, String str2, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
        this.A05 = str;
        this.A03 = obj3;
        this.A06 = str2;
        this.A04 = obj4;
    }

    public final boolean equals(Object obj) {
        XVV xvv;
        Object obj2;
        Object obj3;
        if (this.A00 != 0) {
            if (this != obj) {
                if (obj instanceof XVV) {
                    xvv = (XVV) obj;
                    if (xvv.A00 == 1 && C14360o3.A0K(this.A01, xvv.A01) && C14360o3.A0K(this.A05, xvv.A05)) {
                        obj2 = this.A02;
                        obj3 = xvv.A02;
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                return true;
            }
        } else if (this != obj) {
            if (!(obj instanceof XVV)) {
                return false;
            }
            xvv = (XVV) obj;
            if (xvv.A00 != 0 || this.A01 != xvv.A01 || !C14360o3.A0K(this.A02, xvv.A02)) {
                return false;
            }
            obj2 = this.A05;
            obj3 = xvv.A05;
        } else {
            return true;
        }
        if (!C14360o3.A0K(obj2, obj3) || !C14360o3.A0K(this.A03, xvv.A03) || !C14360o3.A0K(this.A06, xvv.A06) || !C14360o3.A0K(this.A04, xvv.A04)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A0M;
        int A0O;
        int i = this.A00;
        int A0M2 = AbstractC167017dG.A0M(this.A01);
        if (i != 0) {
            A0M = ((A0M2 * 31) + AbstractC167017dG.A0O(this.A05)) * 31;
            A0O = AbstractC167017dG.A0M(this.A02);
        } else {
            A0M = ((A0M2 * 31) + AbstractC167017dG.A0M(this.A02)) * 31;
            A0O = AbstractC167017dG.A0O(this.A05);
        }
        return ((((((A0M + A0O) * 31) + AbstractC167017dG.A0M(this.A03)) * 31) + AbstractC167017dG.A0O(this.A06)) * 31) + AbstractC166997dE.A0I(this.A04);
    }
}
