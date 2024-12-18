package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.IGAdsCardBackgroundTypeEnum;
import com.instagram.api.schemas.IGAdsCardStickerCTATypeEnum;
import com.instagram.api.schemas.IGAdsCardStickerClickAreaEnum;
import com.instagram.api.schemas.IGAdsCardStickerSizeEnum;

/* loaded from: classes12.dex */
public final class XVZ extends C0T6 implements YQS {
    public final IGAdsCardBackgroundTypeEnum A00;
    public final IGAdsCardStickerCTATypeEnum A01;
    public final IGAdsCardStickerClickAreaEnum A02;
    public final IGAdsCardStickerSizeEnum A03;
    public final Boolean A04;
    public final Boolean A05;
    public final Integer A06;
    public final Integer A07;
    public final String A08;
    public final String A09;

    @Override // X.YQS
    public final XVZ F5h() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof XVZ) {
                XVZ xvz = (XVZ) obj;
                if (this.A00 != xvz.A00 || this.A02 != xvz.A02 || !C14360o3.A0K(this.A08, xvz.A08) || !C14360o3.A0K(this.A06, xvz.A06) || this.A01 != xvz.A01 || !C14360o3.A0K(this.A07, xvz.A07) || !C14360o3.A0K(this.A05, xvz.A05) || !C14360o3.A0K(this.A04, xvz.A04) || !C14360o3.A0K(this.A09, xvz.A09) || this.A03 != xvz.A03) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.YQS
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTIGLeadGenCardDict", Xj8.A00(this));
    }

    public final int hashCode() {
        return (((((((((((((((((AbstractC167017dG.A0M(this.A00) * 31) + AbstractC167017dG.A0M(this.A02)) * 31) + AbstractC167017dG.A0O(this.A08)) * 31) + AbstractC167017dG.A0M(this.A06)) * 31) + AbstractC167017dG.A0M(this.A01)) * 31) + AbstractC167017dG.A0M(this.A07)) * 31) + AbstractC167017dG.A0M(this.A05)) * 31) + AbstractC167017dG.A0M(this.A04)) * 31) + AbstractC167017dG.A0O(this.A09)) * 31) + AbstractC166997dE.A0I(this.A03);
    }

    public XVZ(IGAdsCardBackgroundTypeEnum iGAdsCardBackgroundTypeEnum, IGAdsCardStickerCTATypeEnum iGAdsCardStickerCTATypeEnum, IGAdsCardStickerClickAreaEnum iGAdsCardStickerClickAreaEnum, IGAdsCardStickerSizeEnum iGAdsCardStickerSizeEnum, Boolean bool, Boolean bool2, Integer num, Integer num2, String str, String str2) {
        this.A00 = iGAdsCardBackgroundTypeEnum;
        this.A02 = iGAdsCardStickerClickAreaEnum;
        this.A08 = str;
        this.A06 = num;
        this.A01 = iGAdsCardStickerCTATypeEnum;
        this.A07 = num2;
        this.A05 = bool;
        this.A04 = bool2;
        this.A09 = str2;
        this.A03 = iGAdsCardStickerSizeEnum;
    }

    @Override // X.YQS
    public final IGAdsCardBackgroundTypeEnum Af5() {
        return this.A00;
    }

    @Override // X.YQS
    public final IGAdsCardStickerClickAreaEnum Ank() {
        return this.A02;
    }

    @Override // X.YQS
    public final String ArM() {
        return this.A08;
    }

    @Override // X.YQS
    public final Integer Atf() {
        return this.A06;
    }

    @Override // X.YQS
    public final IGAdsCardStickerCTATypeEnum Atq() {
        return this.A01;
    }

    @Override // X.YQS
    public final Integer B04() {
        return this.A07;
    }

    @Override // X.YQS
    public final Boolean Bve() {
        return this.A04;
    }

    @Override // X.YQS
    public final Boolean Bvj() {
        return this.A05;
    }

    @Override // X.YQS
    public final String C0b() {
        return this.A09;
    }

    @Override // X.YQS
    public final IGAdsCardStickerSizeEnum C0f() {
        return this.A03;
    }
}
