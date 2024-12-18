package com.instagram.user.model;

import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC25226BEj;
import X.AbstractC37300Gc1;
import X.AbstractC37304Gc5;
import X.C0T6;
import X.C14360o3;
import X.C1DV;
import X.C1DY;
import X.C55344OhA;
import X.IA9;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.ProductCollectionV2Type;
import com.instagram.model.shopping.businessintegrity.ProductCollectionReviewStatus;
import com.instagram.model.shopping.productcollection.ProductCollectionCover;
import com.instagram.model.shopping.productcollection.ProductCollectionDropsMetadata;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class ProductCollectionImpl extends C0T6 implements ProductCollection, Parcelable {
    public static final Parcelable.Creator CREATOR = new C55344OhA(18);
    public final ProductCollectionV2Type A00;
    public final ProductCollectionReviewStatus A01;
    public final ProductCollectionCover A02;
    public final ProductCollectionDropsMetadata A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final List A09;

    @Override // com.instagram.user.model.ProductCollection
    public final ProductCollectionImpl F7Q(C1DY c1dy) {
        return this;
    }

    @Override // com.instagram.user.model.ProductCollection
    public final ProductCollectionImpl F7R(C1DV c1dv) {
        return this;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ProductCollectionImpl) {
                ProductCollectionImpl productCollectionImpl = (ProductCollectionImpl) obj;
                if (!C14360o3.A0K(this.A04, productCollectionImpl.A04) || this.A01 != productCollectionImpl.A01 || this.A00 != productCollectionImpl.A00 || !C14360o3.A0K(this.A02, productCollectionImpl.A02) || !C14360o3.A0K(this.A05, productCollectionImpl.A05) || !C14360o3.A0K(this.A03, productCollectionImpl.A03) || !C14360o3.A0K(this.A06, productCollectionImpl.A06) || !C14360o3.A0K(this.A07, productCollectionImpl.A07) || !C14360o3.A0K(this.A08, productCollectionImpl.A08) || !C14360o3.A0K(this.A09, productCollectionImpl.A09)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A04);
        parcel.writeParcelable(this.A01, i);
        parcel.writeParcelable(this.A00, i);
        parcel.writeParcelable(this.A02, i);
        parcel.writeString(this.A05);
        parcel.writeParcelable(this.A03, i);
        parcel.writeString(this.A06);
        parcel.writeString(this.A07);
        parcel.writeString(this.A08);
        List list = this.A09;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator A0l = AbstractC37304Gc5.A0l(parcel, list);
        while (A0l.hasNext()) {
            AbstractC25226BEj.A15(A0l).writeToParcel(parcel, i);
        }
    }

    @Override // com.instagram.user.model.ProductCollection
    public final String Ap3() {
        return this.A04;
    }

    @Override // com.instagram.user.model.ProductCollection
    public final ProductCollectionReviewStatus ApC() {
        return this.A01;
    }

    @Override // com.instagram.user.model.ProductCollection
    public final ProductCollectionV2Type ApF() {
        return this.A00;
    }

    @Override // com.instagram.user.model.ProductCollection
    public final ProductCollectionCover AsD() {
        return this.A02;
    }

    @Override // com.instagram.user.model.ProductCollection
    public final ProductCollectionDropsMetadata Azb() {
        return this.A03;
    }

    @Override // com.instagram.user.model.ProductCollection
    public final String BSZ() {
        return this.A06;
    }

    @Override // com.instagram.user.model.ProductCollection
    public final List CEC() {
        return this.A09;
    }

    @Override // com.instagram.user.model.ProductCollection
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTMicroProductCollectionTileDict", IA9.A00(this));
    }

    @Override // com.instagram.user.model.ProductCollection
    public final String getDescription() {
        return this.A05;
    }

    @Override // com.instagram.user.model.ProductCollection
    public final String getSubtitle() {
        return this.A07;
    }

    @Override // com.instagram.user.model.ProductCollection
    public final String getTitle() {
        return this.A08;
    }

    public final int hashCode() {
        return (((((((((((((((((AbstractC167017dG.A0O(this.A04) * 31) + AbstractC167017dG.A0M(this.A01)) * 31) + AbstractC167017dG.A0M(this.A00)) * 31) + AbstractC167017dG.A0M(this.A02)) * 31) + AbstractC167017dG.A0O(this.A05)) * 31) + AbstractC167017dG.A0M(this.A03)) * 31) + AbstractC167017dG.A0O(this.A06)) * 31) + AbstractC167017dG.A0O(this.A07)) * 31) + AbstractC167017dG.A0O(this.A08)) * 31) + AbstractC166997dE.A0I(this.A09);
    }

    public ProductCollectionImpl(ProductCollectionV2Type productCollectionV2Type, ProductCollectionReviewStatus productCollectionReviewStatus, ProductCollectionCover productCollectionCover, ProductCollectionDropsMetadata productCollectionDropsMetadata, String str, String str2, String str3, String str4, String str5, List list) {
        this.A04 = str;
        this.A01 = productCollectionReviewStatus;
        this.A00 = productCollectionV2Type;
        this.A02 = productCollectionCover;
        this.A05 = str2;
        this.A03 = productCollectionDropsMetadata;
        this.A06 = str3;
        this.A07 = str4;
        this.A08 = str5;
        this.A09 = list;
    }

    @Override // com.instagram.user.model.ProductCollection
    public final ProductCollection ECD(C1DY c1dy) {
        return this;
    }
}
