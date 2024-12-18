package X;

import java.util.List;

/* loaded from: classes12.dex */
public final class XVT extends C0T6 {
    public final String A00;
    public final List A01;
    public final boolean A02;

    public XVT(String str, List list, boolean z) {
        C14360o3.A0B(list, 3);
        this.A00 = str;
        this.A02 = z;
        this.A01 = list;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof XVT) {
                XVT xvt = (XVT) obj;
                if (!C14360o3.A0K(this.A00, xvt.A00) || this.A02 != xvt.A02 || !C14360o3.A0K(this.A01, xvt.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A0O = AbstractC167017dG.A0O(this.A00) * 31;
        int i = 1237;
        if (this.A02) {
            i = 1231;
        }
        return AbstractC166987dD.A0I(this.A01, (A0O + i) * 31);
    }
}
