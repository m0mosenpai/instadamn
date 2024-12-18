package X;

import com.instagram.api.schemas.BonusPromoDialogAudienceType;

/* loaded from: classes6.dex */
public final class E6I extends C0T6 {
    public final BonusPromoDialogAudienceType A00;
    public final String A01;
    public final boolean A02;
    public final String A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof E6I) {
                E6I e6i = (E6I) obj;
                if (!C14360o3.A0K(this.A03, e6i.A03) || this.A00 != e6i.A00 || !C14360o3.A0K(this.A01, e6i.A01) || this.A02 != e6i.A02) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A02, ((((AbstractC167017dG.A0O(this.A03) * 31) + AbstractC167017dG.A0M(this.A00)) * 31) + AbstractC25227BEk.A07(this.A01)) * 31);
    }

    public E6I(BonusPromoDialogAudienceType bonusPromoDialogAudienceType, String str, String str2, boolean z) {
        this.A03 = str;
        this.A00 = bonusPromoDialogAudienceType;
        this.A01 = str2;
        this.A02 = z;
    }
}
