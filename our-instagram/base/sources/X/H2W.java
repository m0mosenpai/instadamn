package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.ShoppingIGFundedIncentivesShopAdsBannerStyles;

/* loaded from: classes7.dex */
public final class H2W extends C0T6 implements InterfaceC104784ni {
    public final ShoppingIGFundedIncentivesShopAdsBannerStyles A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;

    @Override // X.InterfaceC104784ni
    public final H2W ErV() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof H2W) {
                H2W h2w = (H2W) obj;
                if (!C14360o3.A0K(this.A01, h2w.A01) || !C14360o3.A0K(this.A02, h2w.A02) || this.A00 != h2w.A00 || !C14360o3.A0K(this.A03, h2w.A03) || !C14360o3.A0K(this.A04, h2w.A04) || !C14360o3.A0K(this.A05, h2w.A05)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC104784ni
    public final String Aj7() {
        return this.A01;
    }

    @Override // X.InterfaceC104784ni
    public final String Awt() {
        return this.A02;
    }

    @Override // X.InterfaceC104784ni
    public final ShoppingIGFundedIncentivesShopAdsBannerStyles Ayh() {
        return this.A00;
    }

    @Override // X.InterfaceC104784ni
    public final String BHK() {
        return this.A03;
    }

    @Override // X.InterfaceC104784ni
    public final String C5n() {
        return this.A04;
    }

    @Override // X.InterfaceC104784ni
    public final String C5o() {
        return this.A05;
    }

    @Override // X.InterfaceC104784ni
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTBuyerIncentiveAdsInfo", AbstractC39790Hl0.A00(this));
    }

    public final int hashCode() {
        return (((((((((AbstractC167017dG.A0O(this.A01) * 31) + AbstractC167017dG.A0O(this.A02)) * 31) + AbstractC167017dG.A0M(this.A00)) * 31) + AbstractC167017dG.A0O(this.A03)) * 31) + AbstractC167017dG.A0O(this.A04)) * 31) + AbstractC25227BEk.A07(this.A05);
    }

    public H2W(ShoppingIGFundedIncentivesShopAdsBannerStyles shoppingIGFundedIncentivesShopAdsBannerStyles, String str, String str2, String str3, String str4, String str5) {
        this.A01 = str;
        this.A02 = str2;
        this.A00 = shoppingIGFundedIncentivesShopAdsBannerStyles;
        this.A03 = str3;
        this.A04 = str4;
        this.A05 = str5;
    }
}
