package com.instagram.model.shopping.productcollection;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC37304Gc5;
import X.C0T6;
import X.C14360o3;
import X.C41856IgA;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes7.dex */
public final class ProductCollectionTagInfo extends C0T6 implements Parcelable {
    public static final Parcelable.Creator CREATOR = C41856IgA.A00(40);
    public Boolean A00;
    public String A01;
    public String A02;
    public String A03;
    public String A04;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ProductCollectionTagInfo) {
                ProductCollectionTagInfo productCollectionTagInfo = (ProductCollectionTagInfo) obj;
                if (!C14360o3.A0K(this.A01, productCollectionTagInfo.A01) || !C14360o3.A0K(this.A02, productCollectionTagInfo.A02) || !C14360o3.A0K(this.A03, productCollectionTagInfo.A03) || !C14360o3.A0K(this.A04, productCollectionTagInfo.A04) || !C14360o3.A0K(this.A00, productCollectionTagInfo.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
        parcel.writeString(this.A04);
        parcel.writeInt(AbstractC37304Gc5.A1Y(parcel, this.A00) ? 1 : 0);
    }

    public final int hashCode() {
        return (((((((AbstractC167017dG.A0O(this.A01) * 31) + AbstractC167017dG.A0O(this.A02)) * 31) + AbstractC167017dG.A0O(this.A03)) * 31) + AbstractC167017dG.A0O(this.A04)) * 31) + AbstractC166997dE.A0I(this.A00);
    }

    public ProductCollectionTagInfo(Boolean bool, String str, String str2, String str3, String str4) {
        this.A01 = str;
        this.A02 = str2;
        this.A03 = str3;
        this.A04 = str4;
        this.A00 = bool;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("ProductCollectionTagInfo(collectionId=");
        A1C.append(this.A01);
        A1C.append(", collectionType=");
        A1C.append(this.A02);
        A1C.append(", untaggedCollectionId=");
        A1C.append(this.A03);
        A1C.append(", untaggedCollectionType=");
        A1C.append(this.A04);
        A1C.append(", isAutoTagged=");
        return AbstractC167017dG.A0o(this.A00, A1C);
    }

    public ProductCollectionTagInfo() {
        this(AbstractC166997dE.A0a(), null, null, null, null);
    }
}
