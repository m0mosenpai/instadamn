package com.instagram.model.shopping.reels;

import X.AbstractC166987dD;
import X.AbstractC167017dG;
import X.AbstractC25226BEj;
import X.AbstractC37300Gc1;
import X.C0T6;
import X.C14360o3;
import X.C41856IgA;
import X.I4E;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes7.dex */
public final class ShoppingIncentiveMetadata extends C0T6 implements Parcelable, ShoppingIncentiveMetadataIntf {
    public static final Parcelable.Creator CREATOR = C41856IgA.A00(64);
    public final String A00;
    public final String A01;

    @Override // com.instagram.model.shopping.reels.ShoppingIncentiveMetadataIntf
    public final ShoppingIncentiveMetadata F6U() {
        return this;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ShoppingIncentiveMetadata) {
                ShoppingIncentiveMetadata shoppingIncentiveMetadata = (ShoppingIncentiveMetadata) obj;
                if (!C14360o3.A0K(this.A00, shoppingIncentiveMetadata.A00) || !C14360o3.A0K(this.A01, shoppingIncentiveMetadata.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
    }

    @Override // com.instagram.model.shopping.reels.ShoppingIncentiveMetadataIntf
    public final String BHK() {
        return this.A00;
    }

    @Override // com.instagram.model.shopping.reels.ShoppingIncentiveMetadataIntf
    public final String BSZ() {
        return this.A01;
    }

    @Override // com.instagram.model.shopping.reels.ShoppingIncentiveMetadataIntf
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTIncentiveMetadata", I4E.A00(this));
    }

    public final int hashCode() {
        return AbstractC25226BEj.A03(this.A01, AbstractC166987dD.A0J(this.A00));
    }

    public ShoppingIncentiveMetadata(String str, String str2) {
        AbstractC167017dG.A1P(str, str2);
        this.A00 = str;
        this.A01 = str2;
    }
}
