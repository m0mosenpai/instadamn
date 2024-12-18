package com.instagram.shopping.model.taggingfeed;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC167017dG;
import X.AbstractC25227BEk;
import X.C0T6;
import X.C14360o3;
import X.C37324GcR;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.api.schemas.ProductCollectionV2Type;

/* loaded from: classes9.dex */
public final class ProductCollectionFeedTaggingMeta extends C0T6 implements Parcelable, ProductCollectionFeedTaggingMetaIntf {
    public static final Parcelable.Creator CREATOR = new C37324GcR(88);
    public final ProductCollectionV2Type A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final boolean A05;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ProductCollectionFeedTaggingMeta) {
                ProductCollectionFeedTaggingMeta productCollectionFeedTaggingMeta = (ProductCollectionFeedTaggingMeta) obj;
                if (!C14360o3.A0K(this.A01, productCollectionFeedTaggingMeta.A01) || this.A00 != productCollectionFeedTaggingMeta.A00 || !C14360o3.A0K(this.A02, productCollectionFeedTaggingMeta.A02) || !C14360o3.A0K(this.A03, productCollectionFeedTaggingMeta.A03) || this.A05 != productCollectionFeedTaggingMeta.A05 || !C14360o3.A0K(this.A04, productCollectionFeedTaggingMeta.A04)) {
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
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
        parcel.writeInt(this.A05 ? 1 : 0);
        parcel.writeString(this.A04);
    }

    public final int hashCode() {
        return AbstractC167007dF.A0D(this.A05, (((AbstractC166997dE.A0J(this.A00, AbstractC166987dD.A0J(this.A01)) + AbstractC167017dG.A0O(this.A02)) * 31) + AbstractC167017dG.A0O(this.A03)) * 31) + AbstractC25227BEk.A07(this.A04);
    }

    public ProductCollectionFeedTaggingMeta(ProductCollectionV2Type productCollectionV2Type, String str, String str2, String str3, String str4, boolean z) {
        AbstractC167017dG.A1P(str, productCollectionV2Type);
        this.A01 = str;
        this.A00 = productCollectionV2Type;
        this.A02 = str2;
        this.A03 = str3;
        this.A05 = z;
        this.A04 = str4;
    }
}
