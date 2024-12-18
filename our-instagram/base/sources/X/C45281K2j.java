package X;

import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.K2j, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45281K2j extends C0T6 implements MNQ {
    public final ImageUrl A00;
    public final MNQ A01;
    public final EnumC46162Kc0 A02;
    public final EnumC46203Kcf A03;
    public final String A04;
    public final boolean A05;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C45281K2j) {
                C45281K2j c45281K2j = (C45281K2j) obj;
                if (this.A03 != c45281K2j.A03 || this.A02 != c45281K2j.A02 || !C14360o3.A0K(this.A01, c45281K2j.A01) || !C14360o3.A0K(this.A04, c45281K2j.A04) || this.A05 != c45281K2j.A05 || !C14360o3.A0K(this.A00, c45281K2j.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC167007dF.A0D(this.A05, (((AbstractC166997dE.A0J(this.A02, AbstractC166987dD.A0G(this.A03)) + AbstractC167017dG.A0M(this.A01)) * 31) + AbstractC167017dG.A0O(this.A04)) * 31) + AbstractC166997dE.A0I(this.A00);
    }

    public C45281K2j(ImageUrl imageUrl, MNQ mnq, EnumC46162Kc0 enumC46162Kc0, EnumC46203Kcf enumC46203Kcf, String str, boolean z) {
        this.A03 = enumC46203Kcf;
        this.A02 = enumC46162Kc0;
        this.A01 = mnq;
        this.A04 = str;
        this.A05 = z;
        this.A00 = imageUrl;
    }
}
