package com.instagram.api.schemas;

import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC37304Gc5;
import X.C0T6;
import X.C14360o3;
import X.C41166IKf;
import X.C41854Ig8;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.model.shopping.productcheckoutproperties.ProductCheckoutProperties;
import com.instagram.model.shopping.productcheckoutproperties.ProductCheckoutPropertiesIntf;
import com.instagram.model.shopping.productimagecontainer.ProductImageContainer;

/* loaded from: classes7.dex */
public final class FBProductItemDetailsDictImpl extends C0T6 implements FBProductItemDetailsDict, Parcelable {
    public static final Parcelable.Creator CREATOR = C41854Ig8.A00(77);
    public final ProductCheckoutProperties A00;
    public final ProductImageContainer A01;
    public final ProductImageContainer A02;
    public final Boolean A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;

    @Override // com.instagram.api.schemas.FBProductItemDetailsDict
    public final FBProductItemDetailsDictImpl EtM() {
        return this;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FBProductItemDetailsDictImpl) {
                FBProductItemDetailsDictImpl fBProductItemDetailsDictImpl = (FBProductItemDetailsDictImpl) obj;
                if (!C14360o3.A0K(this.A00, fBProductItemDetailsDictImpl.A00) || !C14360o3.A0K(this.A03, fBProductItemDetailsDictImpl.A03) || !C14360o3.A0K(this.A04, fBProductItemDetailsDictImpl.A04) || !C14360o3.A0K(this.A05, fBProductItemDetailsDictImpl.A05) || !C14360o3.A0K(this.A01, fBProductItemDetailsDictImpl.A01) || !C14360o3.A0K(this.A06, fBProductItemDetailsDictImpl.A06) || !C14360o3.A0K(this.A07, fBProductItemDetailsDictImpl.A07) || !C14360o3.A0K(this.A08, fBProductItemDetailsDictImpl.A08) || !C14360o3.A0K(this.A09, fBProductItemDetailsDictImpl.A09) || !C14360o3.A0K(this.A0A, fBProductItemDetailsDictImpl.A0A) || !C14360o3.A0K(this.A0B, fBProductItemDetailsDictImpl.A0B) || !C14360o3.A0K(this.A0C, fBProductItemDetailsDictImpl.A0C) || !C14360o3.A0K(this.A02, fBProductItemDetailsDictImpl.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeParcelable(this.A00, i);
        parcel.writeInt(AbstractC37304Gc5.A1Y(parcel, this.A03) ? 1 : 0);
        parcel.writeString(this.A04);
        parcel.writeString(this.A05);
        parcel.writeParcelable(this.A01, i);
        parcel.writeString(this.A06);
        parcel.writeString(this.A07);
        parcel.writeString(this.A08);
        parcel.writeString(this.A09);
        parcel.writeString(this.A0A);
        parcel.writeString(this.A0B);
        parcel.writeString(this.A0C);
        parcel.writeParcelable(this.A02, i);
    }

    @Override // com.instagram.api.schemas.FBProductItemDetailsDict
    public final /* bridge */ /* synthetic */ C41166IKf AKJ() {
        return new C41166IKf(this);
    }

    @Override // com.instagram.api.schemas.FBProductItemDetailsDict
    public final /* bridge */ /* synthetic */ ProductCheckoutPropertiesIntf AnN() {
        return this.A00;
    }

    @Override // com.instagram.api.schemas.FBProductItemDetailsDict
    public final Boolean BCz() {
        return this.A03;
    }

    @Override // com.instagram.api.schemas.FBProductItemDetailsDict
    public final String BNr() {
        return this.A04;
    }

    @Override // com.instagram.api.schemas.FBProductItemDetailsDict
    public final String BNs() {
        return this.A05;
    }

    @Override // com.instagram.api.schemas.FBProductItemDetailsDict
    public final ProductImageContainer BPX() {
        return this.A01;
    }

    @Override // com.instagram.api.schemas.FBProductItemDetailsDict
    public final String Baz() {
        return this.A06;
    }

    @Override // com.instagram.api.schemas.FBProductItemDetailsDict
    public final String Bb3() {
        return this.A07;
    }

    @Override // com.instagram.api.schemas.FBProductItemDetailsDict
    public final String Bb5() {
        return this.A08;
    }

    @Override // com.instagram.api.schemas.FBProductItemDetailsDict
    public final String BhE() {
        return this.A0A;
    }

    @Override // com.instagram.api.schemas.FBProductItemDetailsDict
    public final String C2g() {
        return this.A0B;
    }

    @Override // com.instagram.api.schemas.FBProductItemDetailsDict
    public final String C2h() {
        return this.A0C;
    }

    @Override // com.instagram.api.schemas.FBProductItemDetailsDict
    public final ProductImageContainer C85() {
        return this.A02;
    }

    @Override // com.instagram.api.schemas.FBProductItemDetailsDict
    public final String getProductId() {
        return this.A09;
    }

    public final int hashCode() {
        return (((((((((((((((((((((((AbstractC167017dG.A0M(this.A00) * 31) + AbstractC167017dG.A0M(this.A03)) * 31) + AbstractC167017dG.A0O(this.A04)) * 31) + AbstractC167017dG.A0O(this.A05)) * 31) + AbstractC167017dG.A0M(this.A01)) * 31) + AbstractC167017dG.A0O(this.A06)) * 31) + AbstractC167017dG.A0O(this.A07)) * 31) + AbstractC167017dG.A0O(this.A08)) * 31) + AbstractC167017dG.A0O(this.A09)) * 31) + AbstractC167017dG.A0O(this.A0A)) * 31) + AbstractC167017dG.A0O(this.A0B)) * 31) + AbstractC167017dG.A0O(this.A0C)) * 31) + AbstractC166997dE.A0I(this.A02);
    }

    public FBProductItemDetailsDictImpl(ProductCheckoutProperties productCheckoutProperties, ProductImageContainer productImageContainer, ProductImageContainer productImageContainer2, Boolean bool, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        this.A00 = productCheckoutProperties;
        this.A03 = bool;
        this.A04 = str;
        this.A05 = str2;
        this.A01 = productImageContainer;
        this.A06 = str3;
        this.A07 = str4;
        this.A08 = str5;
        this.A09 = str6;
        this.A0A = str7;
        this.A0B = str8;
        this.A0C = str9;
        this.A02 = productImageContainer2;
    }
}
