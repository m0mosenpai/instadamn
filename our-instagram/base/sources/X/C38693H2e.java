package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.AssetRecommendationType;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.H2e, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38693H2e extends C0T6 implements InterfaceC43553JLn {
    public final AssetRecommendationType A00;
    public final ImageUrl A01;
    public final String A02;
    public final String A03;
    public final String A04;

    @Override // X.InterfaceC43553JLn
    public final C38693H2e Ers() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C38693H2e) {
                C38693H2e c38693H2e = (C38693H2e) obj;
                if (!C14360o3.A0K(this.A02, c38693H2e.A02) || !C14360o3.A0K(this.A03, c38693H2e.A03) || this.A00 != c38693H2e.A00 || !C14360o3.A0K(this.A01, c38693H2e.A01) || !C14360o3.A0K(this.A04, c38693H2e.A04)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC43553JLn
    public final AssetRecommendationType Acv() {
        return this.A00;
    }

    @Override // X.InterfaceC43553JLn
    public final ImageUrl AsE() {
        return this.A01;
    }

    @Override // X.InterfaceC43553JLn
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTClipsAssetRecommendationMetadata", AbstractC39811HlL.A00(this));
    }

    @Override // X.InterfaceC43553JLn
    public final String getAssetId() {
        return this.A02;
    }

    @Override // X.InterfaceC43553JLn
    public final String getAssetName() {
        return this.A03;
    }

    @Override // X.InterfaceC43553JLn
    public final String getExtra() {
        return this.A04;
    }

    public final int hashCode() {
        return ((AbstractC166997dE.A0J(this.A00, AbstractC166997dE.A0K(this.A03, AbstractC166987dD.A0J(this.A02))) + AbstractC167017dG.A0M(this.A01)) * 31) + AbstractC25227BEk.A07(this.A04);
    }

    public C38693H2e(AssetRecommendationType assetRecommendationType, ImageUrl imageUrl, String str, String str2, String str3) {
        AbstractC167027dH.A13(str, str2, assetRecommendationType);
        this.A02 = str;
        this.A03 = str2;
        this.A00 = assetRecommendationType;
        this.A01 = imageUrl;
        this.A04 = str3;
    }
}
