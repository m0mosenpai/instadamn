package X;

import com.instagram.api.schemas.TextPostAppAYSFButton;
import com.instagram.api.schemas.TextPostAppAYSFStyle;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.JxR, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45097JxR extends C0T6 {
    public final int A00 = 1;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final String A05;
    public final String A06;

    public C45097JxR(C45117Jxm c45117Jxm, TextPostAppAYSFButton textPostAppAYSFButton, TextPostAppAYSFStyle textPostAppAYSFStyle, String str, String str2, int i) {
        AbstractC167017dG.A1T(textPostAppAYSFStyle, c45117Jxm);
        this.A02 = textPostAppAYSFButton;
        this.A05 = str;
        this.A06 = str2;
        this.A01 = i;
        this.A03 = textPostAppAYSFStyle;
        this.A04 = c45117Jxm;
    }

    public final boolean equals(Object obj) {
        if (this.A00 != 0) {
            if (this != obj) {
                if (obj instanceof C45097JxR) {
                    C45097JxR c45097JxR = (C45097JxR) obj;
                    if (c45097JxR.A00 != 1 || this.A04 != c45097JxR.A04 || !C14360o3.A0K(this.A03, c45097JxR.A03) || !C14360o3.A0K(this.A02, c45097JxR.A02) || !C14360o3.A0K(this.A06, c45097JxR.A06) || !C14360o3.A0K(this.A05, c45097JxR.A05) || this.A01 != c45097JxR.A01) {
                        return false;
                    }
                    return true;
                }
                return false;
            }
            return true;
        }
        if (this != obj) {
            if (!(obj instanceof C45097JxR)) {
                return false;
            }
            C45097JxR c45097JxR2 = (C45097JxR) obj;
            if (c45097JxR2.A00 != 0 || this.A02 != c45097JxR2.A02 || !C14360o3.A0K(this.A05, c45097JxR2.A05) || !C14360o3.A0K(this.A06, c45097JxR2.A06) || this.A01 != c45097JxR2.A01 || this.A03 != c45097JxR2.A03 || !C14360o3.A0K(this.A04, c45097JxR2.A04)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        int A0J;
        int hashCode;
        if (this.A00 != 0) {
            A0J = (((AbstractC166997dE.A0J(this.A02, AbstractC166997dE.A0J(this.A03, AbstractC166987dD.A0G(this.A04))) + AbstractC167017dG.A0O(this.A06)) * 31) + AbstractC25227BEk.A07(this.A05)) * 31;
            hashCode = this.A01;
        } else {
            A0J = AbstractC166997dE.A0J(this.A03, ((((((AbstractC167017dG.A0M(this.A02) * 31) + AbstractC167017dG.A0O(this.A05)) * 31) + AbstractC25227BEk.A07(this.A06)) * 31) + this.A01) * 31);
            hashCode = this.A04.hashCode();
        }
        return A0J + hashCode;
    }

    public C45097JxR(AnonymousClass541 anonymousClass541, ImageUrl imageUrl, ImageUrl imageUrl2, String str, String str2, int i) {
        this.A04 = anonymousClass541;
        this.A03 = imageUrl;
        this.A02 = imageUrl2;
        this.A06 = str;
        this.A05 = str2;
        this.A01 = i;
    }
}
