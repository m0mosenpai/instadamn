package com.instagram.api.schemas;

import X.AbstractC166987dD;
import X.AbstractC167017dG;
import X.AbstractC25227BEk;
import X.C0T6;
import X.C14360o3;
import X.C41855Ig9;
import X.C69420Vn5;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.user.model.User;

/* loaded from: classes7.dex */
public final class ProductPivotsButtonImpl extends C0T6 implements Parcelable, ProductPivotsButton {
    public static final Parcelable.Creator CREATOR = C41855Ig9.A00(50);
    public final ProductPivotsButtonActionType A00;
    public final ProductPivotsButtonActionType A01;
    public final User A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;

    public ProductPivotsButtonImpl(ProductPivotsButtonActionType productPivotsButtonActionType, ProductPivotsButtonActionType productPivotsButtonActionType2, User user, String str, String str2, String str3, String str4, String str5) {
        C14360o3.A0B(productPivotsButtonActionType, 1);
        this.A00 = productPivotsButtonActionType;
        this.A03 = str;
        this.A04 = str2;
        this.A05 = str3;
        this.A06 = str4;
        this.A01 = productPivotsButtonActionType2;
        this.A02 = user;
        this.A07 = str5;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ProductPivotsButtonImpl) {
                ProductPivotsButtonImpl productPivotsButtonImpl = (ProductPivotsButtonImpl) obj;
                if (this.A00 != productPivotsButtonImpl.A00 || !C14360o3.A0K(this.A03, productPivotsButtonImpl.A03) || !C14360o3.A0K(this.A04, productPivotsButtonImpl.A04) || !C14360o3.A0K(this.A05, productPivotsButtonImpl.A05) || !C14360o3.A0K(this.A06, productPivotsButtonImpl.A06) || this.A01 != productPivotsButtonImpl.A01 || !C14360o3.A0K(this.A02, productPivotsButtonImpl.A02) || !C14360o3.A0K(this.A07, productPivotsButtonImpl.A07)) {
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
        parcel.writeString(this.A03);
        parcel.writeString(this.A04);
        parcel.writeString(this.A05);
        parcel.writeString(this.A06);
        parcel.writeParcelable(this.A01, i);
        parcel.writeParcelable(this.A02, i);
        parcel.writeString(this.A07);
    }

    @Override // com.instagram.api.schemas.ProductPivotsButton
    public final /* bridge */ /* synthetic */ C69420Vn5 AKS() {
        return new C69420Vn5(this);
    }

    @Override // com.instagram.api.schemas.ProductPivotsButton
    public final ProductPivotsButtonActionType AYO() {
        return this.A00;
    }

    @Override // com.instagram.api.schemas.ProductPivotsButton
    public final String Aj7() {
        return this.A03;
    }

    @Override // com.instagram.api.schemas.ProductPivotsButton
    public final String Ax2() {
        return this.A04;
    }

    @Override // com.instagram.api.schemas.ProductPivotsButton
    public final String Ax4() {
        return this.A05;
    }

    @Override // com.instagram.api.schemas.ProductPivotsButton
    public final String Ax5() {
        return this.A06;
    }

    @Override // com.instagram.api.schemas.ProductPivotsButton
    public final ProductPivotsButtonActionType Ax7() {
        return this.A01;
    }

    @Override // com.instagram.api.schemas.ProductPivotsButton
    public final User BSW() {
        return this.A02;
    }

    @Override // com.instagram.api.schemas.ProductPivotsButton
    public final String getText() {
        return this.A07;
    }

    public final int hashCode() {
        return ((((((((((((AbstractC166987dD.A0G(this.A00) + AbstractC167017dG.A0O(this.A03)) * 31) + AbstractC167017dG.A0O(this.A04)) * 31) + AbstractC167017dG.A0O(this.A05)) * 31) + AbstractC167017dG.A0O(this.A06)) * 31) + AbstractC167017dG.A0M(this.A01)) * 31) + AbstractC167017dG.A0M(this.A02)) * 31) + AbstractC25227BEk.A07(this.A07);
    }
}
