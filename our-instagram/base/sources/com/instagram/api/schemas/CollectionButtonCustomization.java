package com.instagram.api.schemas;

import X.AbstractC167017dG;
import X.C0T6;
import X.C14360o3;
import X.C41854Ig8;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes7.dex */
public final class CollectionButtonCustomization extends C0T6 implements Parcelable, CollectionButtonCustomizationIntf {
    public static final Parcelable.Creator CREATOR = C41854Ig8.A00(21);
    public final MiniShopColorCustomization A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof CollectionButtonCustomization) && C14360o3.A0K(this.A00, ((CollectionButtonCustomization) obj).A00));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeParcelable(this.A00, i);
    }

    public final int hashCode() {
        return AbstractC167017dG.A0M(this.A00);
    }

    public CollectionButtonCustomization(MiniShopColorCustomization miniShopColorCustomization) {
        this.A00 = miniShopColorCustomization;
    }
}
