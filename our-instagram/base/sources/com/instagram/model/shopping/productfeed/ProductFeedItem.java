package com.instagram.model.shopping.productfeed;

import X.AbstractC1563570f;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC37300Gc1;
import X.AbstractC37302Gc3;
import X.AbstractC38048Gob;
import X.AbstractC38851rI;
import X.AbstractC40161tk;
import X.AbstractC41709Idf;
import X.AbstractC50102Ry;
import X.C05F;
import X.C1NI;
import X.C38321qM;
import X.C41856IgA;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.analytics.ppr.loggingdata.PPRLoggingData;
import com.instagram.api.schemas.FBProductItemDetailsDict;
import com.instagram.api.schemas.MerchantCheckoutStyle;
import com.instagram.api.schemas.ProductTileProductImpl;
import com.instagram.common.session.UserSession;
import com.instagram.model.mediasize.ImageInfo;
import com.instagram.user.model.Product;
import com.instagram.user.model.ProductDetailsProductItemDict;
import com.instagram.user.model.UnavailableProductImpl;
import com.instagram.user.model.User;

/* loaded from: classes7.dex */
public class ProductFeedItem implements C1NI, Parcelable {
    public static final Parcelable.Creator CREATOR = C41856IgA.A00(46);
    public C38321qM A00;
    public MultiProductComponent A01;
    public ProductTile A02;
    public ProductTileMedia A03;
    public ProductDetailsProductItemDict A04;
    public UnavailableProductImpl A05;
    public Integer A06;

    @Override // X.C1NI
    public final String BzL(UserSession userSession) {
        return null;
    }

    @Override // X.C1NI
    public final boolean CW9() {
        return true;
    }

    @Override // X.C1NI
    public final boolean CZq() {
        return true;
    }

    @Override // X.C1NI
    public final boolean CdW() {
        return false;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductFeedItem)) {
            return false;
        }
        ProductFeedItem productFeedItem = (ProductFeedItem) obj;
        return AbstractC50102Ry.A00(this.A05, productFeedItem.A05) && AbstractC50102Ry.A00(this.A01, productFeedItem.A01) && AbstractC50102Ry.A00(this.A02, productFeedItem.A02) && AbstractC50102Ry.A00(this.A00, productFeedItem.A00) && AbstractC50102Ry.A00(this.A03, productFeedItem.A03);
    }

    public final ImageInfo A00() {
        ProductTile productTile = this.A02;
        if (productTile != null) {
            C38321qM c38321qM = productTile.A05;
            if (c38321qM != null) {
                return c38321qM.A1t();
            }
            return AbstractC41709Idf.A02(productTile);
        }
        return null;
    }

    public final ProductTileMedia A01(UserSession userSession) {
        C38321qM c38321qM = this.A00;
        if (c38321qM != null && this.A03 == null && c38321qM.A1t() != null) {
            User A2E = this.A00.A2E(userSession);
            A2E.getClass();
            String id = this.A00.getId();
            ImageInfo A1t = this.A00.A1t();
            String BU6 = this.A00.BU6();
            Boolean valueOf = Boolean.valueOf(A2E.isVerified());
            MerchantCheckoutStyle BSX = A2E.A03.BSX();
            String id2 = A2E.getId();
            this.A03 = new ProductTileMedia(A1t, AbstractC38851rI.A02(BSX, AbstractC37300Gc1.A08(A2E), A2E.Bhu(), null, valueOf, AbstractC166997dE.A0a(), id2, null, A2E.getUsername()), id, BU6);
        }
        return this.A03;
    }

    public final Product A02() {
        ProductTile productTile = this.A02;
        if (productTile != null) {
            return productTile.A07;
        }
        return null;
    }

    public final String A03() {
        FBProductItemDetailsDict fBProductItemDetailsDict;
        ProductTile productTile = this.A02;
        if (productTile != null) {
            Product product = productTile.A07;
            if (product != null) {
                return product.A0J;
            }
            ProductTileProductImpl productTileProductImpl = productTile.A02;
            if (productTileProductImpl == null || (fBProductItemDetailsDict = productTileProductImpl.A00) == null) {
                return null;
            }
            return fBProductItemDetailsDict.BhE();
        }
        return null;
    }

    public final void A04() {
        Integer num;
        boolean z;
        ProductDetailsProductItemDict productDetailsProductItemDict = this.A04;
        if (productDetailsProductItemDict != null) {
            this.A02 = new ProductTile(AbstractC38048Gob.A01(productDetailsProductItemDict));
            this.A06 = C05F.A0C;
            this.A04 = null;
        } else {
            if (this.A05 != null) {
                num = C05F.A01;
            } else if (this.A01 != null) {
                num = C05F.A00;
            } else if (this.A02 != null) {
                num = C05F.A0C;
            } else {
                if (this.A00 == null && this.A03 == null) {
                    throw AbstractC166987dD.A14("There must be a non null feed item field");
                }
                num = C05F.A0N;
            }
            this.A06 = num;
        }
        ProductTile productTile = this.A02;
        if (productTile != null && AbstractC41709Idf.A02(productTile) != null) {
            ImageInfo A02 = AbstractC41709Idf.A02(this.A02);
            String id = getId();
            Integer num2 = C05F.A0C;
            Integer num3 = C05F.A00;
            C38321qM c38321qM = this.A00;
            if (c38321qM != null) {
                z = c38321qM.Cff();
            } else {
                z = false;
            }
            AbstractC40161tk.A06(new PPRLoggingData(null, num2, num3, id, false, false, z), A02, false);
        }
    }

    public final boolean A05(UserSession userSession) {
        ProductTile productTile = this.A02;
        if (productTile != null) {
            return AbstractC41709Idf.A03(userSession, productTile);
        }
        if (this.A04 != null) {
            return AbstractC1563570f.A00(userSession).A03(AbstractC38048Gob.A01(this.A04));
        }
        C38321qM c38321qM = this.A00;
        if (c38321qM != null) {
            return c38321qM.CcN();
        }
        return false;
    }

    @Override // X.C1NI, X.InterfaceC38381qS, X.InterfaceC38411qV
    public final String getId() {
        String str;
        UnavailableProductImpl unavailableProductImpl = this.A05;
        if (unavailableProductImpl != null) {
            return unavailableProductImpl.A01;
        }
        MultiProductComponent multiProductComponent = this.A01;
        if (multiProductComponent != null) {
            return multiProductComponent.A06;
        }
        ProductTile productTile = this.A02;
        if (productTile != null) {
            Product product = productTile.A07;
            FBProductItemDetailsDict fBProductItemDetailsDict = null;
            if (product != null) {
                str = product.A0H;
            } else {
                str = null;
            }
            ProductTileProductImpl productTileProductImpl = productTile.A02;
            if (productTileProductImpl != null) {
                fBProductItemDetailsDict = productTileProductImpl.A00;
            }
            if (str != null) {
                return str;
            }
            if (fBProductItemDetailsDict != null) {
                return AbstractC37302Gc3.A0Z(fBProductItemDetailsDict);
            }
            throw AbstractC166987dD.A14("There must be a non null feed item field");
        }
        C38321qM c38321qM = this.A00;
        if (c38321qM != null) {
            return c38321qM.getId();
        }
        ProductTileMedia productTileMedia = this.A03;
        if (productTileMedia != null) {
            return productTileMedia.A02;
        }
        throw AbstractC166987dD.A14("There must be a non null feed item field");
    }

    public final int hashCode() {
        return (((((((AbstractC167017dG.A0M(this.A05) * 31) + AbstractC167017dG.A0M(this.A01)) * 31) + AbstractC167017dG.A0M(this.A02)) * 31) + AbstractC167017dG.A0M(this.A00)) * 31) + AbstractC166997dE.A0I(this.A03);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.A01, i);
        parcel.writeParcelable(this.A04, i);
        parcel.writeParcelable(this.A05, i);
        parcel.writeParcelable(this.A02, i);
    }

    public ProductFeedItem(Product product) {
        Integer num = C05F.A0C;
        this.A06 = num;
        this.A02 = new ProductTile(product);
        this.A06 = num;
    }

    public ProductFeedItem() {
        this.A06 = C05F.A0C;
    }
}
