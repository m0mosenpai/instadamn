package com.instagram.model.shopping.productfeed;

import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC31179DnN;
import X.C0T6;
import X.C14360o3;
import X.C41856IgA;
import X.C5GU;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.model.shopping.productcollection.ProductCollectionCoverImpl;
import com.instagram.user.model.User;

/* loaded from: classes7.dex */
public final class ProductCollectionTile extends C0T6 implements Parcelable {
    public static final Parcelable.Creator CREATOR = C41856IgA.A00(45);
    public String A04 = null;
    public C5GU A01 = null;
    public String A05 = null;
    public String A07 = null;
    public String A06 = null;
    public User A02 = null;
    public ProductCollectionCoverImpl A00 = null;
    public Long A03 = null;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ProductCollectionTile) {
                ProductCollectionTile productCollectionTile = (ProductCollectionTile) obj;
                if (!C14360o3.A0K(this.A04, productCollectionTile.A04) || this.A01 != productCollectionTile.A01 || !C14360o3.A0K(this.A05, productCollectionTile.A05) || !C14360o3.A0K(this.A07, productCollectionTile.A07) || !C14360o3.A0K(this.A06, productCollectionTile.A06) || !C14360o3.A0K(this.A02, productCollectionTile.A02) || !C14360o3.A0K(this.A00, productCollectionTile.A00) || !C14360o3.A0K(this.A03, productCollectionTile.A03)) {
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
        C5GU c5gu = this.A01;
        if (c5gu == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            AbstractC166997dE.A1I(parcel, c5gu);
        }
        parcel.writeString(this.A05);
        parcel.writeString(this.A07);
        parcel.writeString(this.A06);
        parcel.writeParcelable(this.A02, i);
        parcel.writeParcelable(this.A00, i);
        AbstractC31179DnN.A0q(parcel, this.A03);
    }

    public final int hashCode() {
        return (((((((((((((AbstractC167017dG.A0O(this.A04) * 31) + AbstractC167017dG.A0M(this.A01)) * 31) + AbstractC167017dG.A0O(this.A05)) * 31) + AbstractC167017dG.A0O(this.A07)) * 31) + AbstractC167017dG.A0O(this.A06)) * 31) + AbstractC167017dG.A0M(this.A02)) * 31) + AbstractC167017dG.A0M(this.A00)) * 31) + AbstractC166997dE.A0I(this.A03);
    }
}
