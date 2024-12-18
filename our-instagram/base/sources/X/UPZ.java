package X;

import com.instagram.api.schemas.ProductTileBannerMetadataDecoration;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.mediasize.ImageInfo;
import java.util.List;

/* loaded from: classes11.dex */
public final class UPZ extends C0T6 {
    public final ProductTileBannerMetadataDecoration A00;
    public final C69749Vuj A01;
    public final C5QE A02;
    public final ImageUrl A03;
    public final ImageInfo A04;
    public final EnumC39541HdD A05;
    public final Integer A06;
    public final Integer A07;
    public final String A08;
    public final List A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;
    public final boolean A0G;
    public final boolean A0H;
    public final boolean A0I;
    public final boolean A0J;
    public final boolean A0K;
    public final boolean A0L;
    public final InterfaceC11380iw A0M;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof UPZ) {
                UPZ upz = (UPZ) obj;
                if (this.A05 != upz.A05 || !C14360o3.A0K(this.A02, upz.A02) || !C14360o3.A0K(this.A01, upz.A01) || !C14360o3.A0K(this.A04, upz.A04) || this.A0A != upz.A0A || this.A0B != upz.A0B || this.A0C != upz.A0C || this.A0E != upz.A0E || this.A0F != upz.A0F || this.A0G != upz.A0G || this.A0H != upz.A0H || this.A0I != upz.A0I || this.A0D != upz.A0D || !C14360o3.A0K(this.A09, upz.A09) || !C14360o3.A0K(this.A06, upz.A06) || !C14360o3.A0K(this.A00, upz.A00) || !C14360o3.A0K(this.A03, upz.A03) || !C14360o3.A0K(this.A08, upz.A08) || this.A0L != upz.A0L || !C14360o3.A0K(this.A07, upz.A07) || this.A0K != upz.A0K || !C14360o3.A0K(this.A0M, upz.A0M) || this.A0J != upz.A0J) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        int A0D = AbstractC167007dF.A0D(this.A0D, AbstractC167007dF.A0D(this.A0I, AbstractC167007dF.A0D(this.A0H, AbstractC167007dF.A0D(this.A0G, AbstractC167007dF.A0D(this.A0F, AbstractC167007dF.A0D(this.A0E, AbstractC167007dF.A0D(this.A0C, AbstractC167007dF.A0D(this.A0B, AbstractC167007dF.A0D(this.A0A, ((AbstractC166997dE.A0J(this.A01, AbstractC166997dE.A0J(this.A02, AbstractC167017dG.A0M(this.A05) * 31)) * 31) + AbstractC167017dG.A0M(this.A04)) * 31)))))))));
        int A00 = AbstractC53644Nnp.A00();
        int A0D2 = AbstractC167007dF.A0D(this.A0L, (((((((AbstractC166997dE.A0J(this.A09, (((A0D + A00) * 31) + A00) * 31) + AbstractC167017dG.A0M(this.A06)) * 31) + AbstractC167017dG.A0M(this.A00)) * 31) + AbstractC167017dG.A0M(this.A03)) * 31) + AbstractC167017dG.A0O(this.A08)) * 31);
        Integer num = this.A07;
        if (num != null) {
            i = num.hashCode();
        }
        int A0J = (AbstractC166997dE.A0J(this.A0M, AbstractC167007dF.A0D(this.A0K, (A0D2 + i) * 31)) + A00) * 31;
        int i2 = 1237;
        if (this.A0J) {
            i2 = 1231;
        }
        return A0J + i2;
    }

    public UPZ(ProductTileBannerMetadataDecoration productTileBannerMetadataDecoration, InterfaceC11380iw interfaceC11380iw, C69749Vuj c69749Vuj, C5QE c5qe, ImageUrl imageUrl, ImageInfo imageInfo, EnumC39541HdD enumC39541HdD, Integer num, Integer num2, String str, List list, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12) {
        this.A05 = enumC39541HdD;
        this.A02 = c5qe;
        this.A01 = c69749Vuj;
        this.A04 = imageInfo;
        this.A0A = z;
        this.A0B = z2;
        this.A0C = z3;
        this.A0E = z4;
        this.A0F = z5;
        this.A0G = z6;
        this.A0H = z7;
        this.A0I = z8;
        this.A0D = z9;
        this.A09 = list;
        this.A06 = num;
        this.A00 = productTileBannerMetadataDecoration;
        this.A03 = imageUrl;
        this.A08 = str;
        this.A0L = z10;
        this.A07 = num2;
        this.A0K = z11;
        this.A0M = interfaceC11380iw;
        this.A0J = z12;
    }
}
