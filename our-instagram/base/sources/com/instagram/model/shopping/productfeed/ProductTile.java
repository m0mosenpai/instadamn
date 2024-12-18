package com.instagram.model.shopping.productfeed;

import X.AbstractC166997dE;
import X.AbstractC37300Gc1;
import X.AbstractC38851rI;
import X.AbstractC50102Ry;
import X.C14360o3;
import X.C38321qM;
import X.C41856IgA;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.api.schemas.MerchantCheckoutStyle;
import com.instagram.api.schemas.ProductCardSubtitleType;
import com.instagram.api.schemas.ProductTileMetadataImpl;
import com.instagram.api.schemas.ProductTileProductImpl;
import com.instagram.api.schemas.ProductTileUCILoggingInfoImpl;
import com.instagram.api.schemas.RankingInfo;
import com.instagram.common.session.UserSession;
import com.instagram.model.mediasize.ImageInfo;
import com.instagram.user.model.Product;
import com.instagram.user.model.ProductDetailsProductItemDict;
import com.instagram.user.model.User;
import java.util.Arrays;

/* loaded from: classes7.dex */
public final class ProductTile implements Parcelable {
    public static final Parcelable.Creator CREATOR = C41856IgA.A00(48);
    public ProductCardSubtitleType A00;
    public ProductTileMetadataImpl A01;
    public ProductTileProductImpl A02;
    public ProductTileUCILoggingInfoImpl A03;
    public RankingInfo A04;
    public C38321qM A05;
    public ProductTileMedia A06;
    public Product A07;
    public ProductDetailsProductItemDict A08;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductTile)) {
            return false;
        }
        ProductTile productTile = (ProductTile) obj;
        return AbstractC50102Ry.A00(this.A07, productTile.A07) && this.A00 == productTile.A00 && AbstractC50102Ry.A00(this.A05, productTile.A05) && AbstractC50102Ry.A00(this.A02, productTile.A02) && AbstractC50102Ry.A00(this.A04, productTile.A04) && AbstractC50102Ry.A00(this.A03, productTile.A03);
    }

    public final ProductTileMedia A00(UserSession userSession) {
        C38321qM c38321qM = this.A05;
        if (c38321qM != null && this.A06 == null) {
            User A2E = c38321qM.A2E(userSession);
            String id = this.A05.getId();
            ImageInfo A1t = this.A05.A1t();
            String BU6 = this.A05.BU6();
            Boolean valueOf = Boolean.valueOf(A2E.isVerified());
            MerchantCheckoutStyle BSX = A2E.A03.BSX();
            String id2 = A2E.getId();
            this.A06 = new ProductTileMedia(A1t, AbstractC38851rI.A02(BSX, AbstractC37300Gc1.A08(A2E), A2E.Bhu(), null, valueOf, AbstractC166997dE.A0a(), id2, null, A2E.getUsername()), id, BU6);
        }
        return this.A06;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A07, this.A00, this.A05, this.A02, this.A04, this.A03});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.A07, i);
        parcel.writeParcelable(this.A02, i);
        parcel.writeSerializable(this.A00);
        parcel.writeParcelable(this.A01, i);
        parcel.writeParcelable(this.A06, i);
        parcel.writeParcelable(this.A04, i);
        parcel.writeParcelable(this.A03, i);
    }

    public ProductTile(Product product) {
        C14360o3.A0B(product, 0);
        this.A08 = product.A01;
        this.A07 = product;
    }

    public ProductTile() {
    }
}
