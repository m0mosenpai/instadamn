package X;

import com.instagram.api.schemas.ProductCardSubtitleType;
import com.instagram.api.schemas.ProductTileMetadata;
import com.instagram.api.schemas.ProductTileProduct;
import com.instagram.api.schemas.ProductTileUCILoggingInfo;
import com.instagram.api.schemas.RankingInfo;
import com.instagram.user.model.ProductDetailsProductItemDict;

/* renamed from: X.H4m, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38746H4m extends C0T6 implements InterfaceC43479JIr {
    public final ProductCardSubtitleType A00;
    public final ProductTileMetadata A01;
    public final ProductTileProduct A02;
    public final ProductTileUCILoggingInfo A03;
    public final RankingInfo A04;
    public final C38321qM A05;
    public final ProductDetailsProductItemDict A06;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C38746H4m) {
                C38746H4m c38746H4m = (C38746H4m) obj;
                if (!C14360o3.A0K(this.A05, c38746H4m.A05) || !C14360o3.A0K(this.A06, c38746H4m.A06) || !C14360o3.A0K(this.A02, c38746H4m.A02) || !C14360o3.A0K(this.A01, c38746H4m.A01) || !C14360o3.A0K(this.A04, c38746H4m.A04) || this.A00 != c38746H4m.A00 || !C14360o3.A0K(this.A03, c38746H4m.A03)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((((((((AbstractC167017dG.A0M(this.A05) * 31) + AbstractC167017dG.A0M(this.A06)) * 31) + AbstractC167017dG.A0M(this.A02)) * 31) + AbstractC167017dG.A0M(this.A01)) * 31) + AbstractC167017dG.A0M(this.A04)) * 31) + AbstractC167017dG.A0M(this.A00)) * 31) + AbstractC166997dE.A0I(this.A03);
    }

    public C38746H4m(ProductCardSubtitleType productCardSubtitleType, ProductTileMetadata productTileMetadata, ProductTileProduct productTileProduct, ProductTileUCILoggingInfo productTileUCILoggingInfo, RankingInfo rankingInfo, C38321qM c38321qM, ProductDetailsProductItemDict productDetailsProductItemDict) {
        this.A05 = c38321qM;
        this.A06 = productDetailsProductItemDict;
        this.A02 = productTileProduct;
        this.A01 = productTileMetadata;
        this.A04 = rankingInfo;
        this.A00 = productCardSubtitleType;
        this.A03 = productTileUCILoggingInfo;
    }
}
