package X;

import com.instagram.common.typedurl.ImageUrl;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.KUs, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45941KUs extends AbstractC46447Kh7 {
    public final ImageUrl A00;
    public final User A01;
    public final String A02;
    public final String A03;
    public final List A04;
    public final boolean A05;
    public final boolean A06;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C45941KUs) {
                C45941KUs c45941KUs = (C45941KUs) obj;
                if (!C14360o3.A0K(this.A02, c45941KUs.A02) || !C14360o3.A0K(this.A03, c45941KUs.A03) || this.A06 != c45941KUs.A06 || !C14360o3.A0K(this.A01, c45941KUs.A01) || this.A05 != c45941KUs.A05 || !C14360o3.A0K(this.A04, c45941KUs.A04) || !C14360o3.A0K(this.A00, c45941KUs.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((AbstractC167007dF.A0D(this.A05, AbstractC25236BEt.A05(this.A01, AbstractC167007dF.A0D(this.A06, (AbstractC166987dD.A0J(this.A02) + AbstractC167017dG.A0O(this.A03)) * 31)) * 31) + AbstractC167017dG.A0M(this.A04)) * 31) + AbstractC166997dE.A0I(this.A00);
    }

    public C45941KUs(ImageUrl imageUrl, User user, String str, String str2, List list, boolean z, boolean z2) {
        this.A02 = str;
        this.A03 = str2;
        this.A06 = z;
        this.A01 = user;
        this.A05 = z2;
        this.A04 = list;
        this.A00 = imageUrl;
    }
}
