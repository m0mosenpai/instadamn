package X;

import com.facebook.R;

/* renamed from: X.JxP, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45095JxP extends C0T6 {
    public int A00;
    public final int A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;

    public C45095JxP(String str, String str2, int i, String str3, String str4) {
        this.A01 = 1;
        this.A00 = i;
        this.A05 = str;
        this.A04 = str2;
        this.A02 = str3;
        this.A03 = str4;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        if (this.A01 != 0) {
            if (this != obj) {
                if (obj instanceof C45095JxP) {
                    C45095JxP c45095JxP = (C45095JxP) obj;
                    if (c45095JxP.A01 == 1 && this.A00 == c45095JxP.A00 && C14360o3.A0K(this.A05, c45095JxP.A05) && C14360o3.A0K(this.A04, c45095JxP.A04) && C14360o3.A0K(this.A02, c45095JxP.A02)) {
                        str = this.A03;
                        str2 = c45095JxP.A03;
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
            if (!(obj instanceof C45095JxP)) {
                return false;
            }
            C45095JxP c45095JxP2 = (C45095JxP) obj;
            if (c45095JxP2.A01 != 0 || !C14360o3.A0K(this.A05, c45095JxP2.A05) || !C14360o3.A0K(this.A03, c45095JxP2.A03) || this.A00 != c45095JxP2.A00 || !C14360o3.A0K(this.A02, c45095JxP2.A02)) {
                return false;
            }
            str = this.A04;
            str2 = c45095JxP2.A04;
        } else {
            return true;
        }
        if (!C14360o3.A0K(str, str2)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A0K;
        String str;
        if (this.A01 != 0) {
            A0K = AbstractC166997dE.A0K(this.A02, AbstractC166997dE.A0K(this.A04, AbstractC166997dE.A0K(this.A05, this.A00 * 31)));
            str = this.A03;
        } else {
            A0K = AbstractC166997dE.A0K(this.A02, (((AbstractC166987dD.A0J(this.A05) + AbstractC167017dG.A0O(this.A03)) * 31) + this.A00) * 31);
            str = this.A04;
        }
        return AbstractC25226BEj.A03(str, A0K);
    }

    public C45095JxP(String str, String str2, String str3, String str4) {
        this.A01 = 0;
        this.A05 = str;
        this.A03 = str2;
        this.A00 = R.color.badge_color;
        this.A02 = str3;
        this.A04 = str4;
    }
}
