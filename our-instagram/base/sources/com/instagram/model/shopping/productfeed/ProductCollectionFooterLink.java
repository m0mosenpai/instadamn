package com.instagram.model.shopping.productfeed;

import X.AbstractC50102Ry;
import X.C41856IgA;
import X.EnumC906041v;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes7.dex */
public final class ProductCollectionFooterLink implements Parcelable {
    public static final Parcelable.Creator CREATOR = C41856IgA.A00(43);
    public EnumC906041v A00;
    public String A01;
    public String A02;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductCollectionFooterLink)) {
            return false;
        }
        ProductCollectionFooterLink productCollectionFooterLink = (ProductCollectionFooterLink) obj;
        return AbstractC50102Ry.A00(this.A00, productCollectionFooterLink.A00) && AbstractC50102Ry.A00(this.A02, productCollectionFooterLink.A02) && AbstractC50102Ry.A00(this.A01, productCollectionFooterLink.A01);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A00, this.A02, this.A01});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A00.A00);
        parcel.writeString(this.A02);
        parcel.writeString(this.A01);
    }
}
