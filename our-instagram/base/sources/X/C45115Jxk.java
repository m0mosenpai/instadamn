package X;

import com.instagram.common.ui.widget.imageview.ConstrainedImageView;

/* renamed from: X.Jxk, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45115Jxk extends C0T6 {
    public final int A00 = 0;
    public final int A01;
    public final int A02;
    public final Object A03;
    public final Object A04;
    public final String A05;
    public final String A06;

    public C45115Jxk(ConstrainedImageView constrainedImageView, ConstrainedImageView constrainedImageView2, String str, String str2, int i, int i2) {
        AbstractC25233BEq.A0w(2, constrainedImageView2, str, str2);
        this.A03 = constrainedImageView;
        this.A04 = constrainedImageView2;
        this.A06 = str;
        this.A05 = str2;
        this.A02 = i;
        this.A01 = i2;
    }

    public final boolean equals(Object obj) {
        if (this.A00 != 0) {
            if (this != obj) {
                if (obj instanceof C45115Jxk) {
                    C45115Jxk c45115Jxk = (C45115Jxk) obj;
                    if (c45115Jxk.A00 != 1 || !C14360o3.A0K(this.A06, c45115Jxk.A06) || this.A02 != c45115Jxk.A02 || this.A01 != c45115Jxk.A01 || !C14360o3.A0K(this.A04, c45115Jxk.A04) || !C14360o3.A0K(this.A05, c45115Jxk.A05) || !C14360o3.A0K(this.A03, c45115Jxk.A03)) {
                        return false;
                    }
                    return true;
                }
                return false;
            }
            return true;
        }
        if (this != obj) {
            if (!(obj instanceof C45115Jxk)) {
                return false;
            }
            C45115Jxk c45115Jxk2 = (C45115Jxk) obj;
            if (c45115Jxk2.A00 != 0 || !C14360o3.A0K(this.A03, c45115Jxk2.A03) || !C14360o3.A0K(this.A04, c45115Jxk2.A04) || !C14360o3.A0K(this.A06, c45115Jxk2.A06) || !C14360o3.A0K(this.A05, c45115Jxk2.A05) || this.A02 != c45115Jxk2.A02 || this.A01 != c45115Jxk2.A01) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        int A0K;
        int i;
        if (this.A00 != 0) {
            A0K = (((((((AbstractC166987dD.A0J(this.A06) + this.A02) * 31) + this.A01) * 31) + AbstractC167017dG.A0M(this.A04)) * 31) + AbstractC167017dG.A0O(this.A05)) * 31;
            i = AbstractC166997dE.A0I(this.A03);
        } else {
            A0K = (AbstractC166997dE.A0K(this.A05, AbstractC166997dE.A0K(this.A06, AbstractC166997dE.A0J(this.A04, AbstractC166987dD.A0G(this.A03)))) + this.A02) * 31;
            i = this.A01;
        }
        return A0K + i;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C45115Jxk(ConstrainedImageView constrainedImageView, ConstrainedImageView constrainedImageView2, C45059Jwo c45059Jwo, String str) {
        this(constrainedImageView, constrainedImageView2, str, c45059Jwo.A03, c45059Jwo.A01, c45059Jwo.A00);
        AbstractC167017dG.A1P(constrainedImageView, constrainedImageView2);
    }

    public C45115Jxk(Float f, Float f2, String str, String str2, int i, int i2) {
        this.A06 = str;
        this.A02 = i;
        this.A01 = i2;
        this.A04 = f;
        this.A05 = str2;
        this.A03 = f2;
    }
}
