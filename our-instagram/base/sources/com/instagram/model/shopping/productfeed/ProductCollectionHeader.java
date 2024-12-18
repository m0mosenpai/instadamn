package com.instagram.model.shopping.productfeed;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC167027dH;
import X.AbstractC25229BEm;
import X.C0T6;
import X.C14360o3;
import X.C41856IgA;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.model.shopping.productcollection.ProductCollectionCoverImpl;
import com.instagram.model.shopping.productcollection.ProductCollectionDropsMetadataImpl;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes7.dex */
public final class ProductCollectionHeader extends C0T6 implements Parcelable {
    public static final Parcelable.Creator CREATOR = C41856IgA.A00(44);
    public ProductCollectionCoverImpl A00;
    public ProductCollectionDropsMetadataImpl A01;
    public String A02;
    public String A03;
    public String A04;
    public ArrayList A05;

    public ProductCollectionHeader() {
        ProductCollectionCoverImpl productCollectionCoverImpl = new ProductCollectionCoverImpl(null, null);
        ArrayList A1E = AbstractC166987dD.A1E();
        AbstractC167027dH.A13(productCollectionCoverImpl, "", A1E);
        this.A00 = productCollectionCoverImpl;
        this.A04 = "";
        this.A05 = A1E;
        this.A03 = null;
        this.A02 = null;
        this.A01 = null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ProductCollectionHeader) {
                ProductCollectionHeader productCollectionHeader = (ProductCollectionHeader) obj;
                if (!C14360o3.A0K(this.A00, productCollectionHeader.A00) || !C14360o3.A0K(this.A04, productCollectionHeader.A04) || !C14360o3.A0K(this.A05, productCollectionHeader.A05) || !C14360o3.A0K(this.A03, productCollectionHeader.A03) || !C14360o3.A0K(this.A02, productCollectionHeader.A02) || !C14360o3.A0K(this.A01, productCollectionHeader.A01)) {
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
        parcel.writeString(this.A04);
        ArrayList arrayList = this.A05;
        parcel.writeInt(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AbstractC25229BEm.A15(parcel, it, i);
        }
        parcel.writeString(this.A03);
        parcel.writeString(this.A02);
        parcel.writeParcelable(this.A01, i);
    }

    public final int hashCode() {
        return ((((AbstractC166997dE.A0J(this.A05, AbstractC166997dE.A0K(this.A04, AbstractC166987dD.A0G(this.A00))) + AbstractC167017dG.A0O(this.A03)) * 31) + AbstractC167017dG.A0O(this.A02)) * 31) + AbstractC166997dE.A0I(this.A01);
    }
}
