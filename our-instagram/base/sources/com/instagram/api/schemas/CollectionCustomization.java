package com.instagram.api.schemas;

import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.C0T6;
import X.C14360o3;
import X.C41854Ig8;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes7.dex */
public final class CollectionCustomization extends C0T6 implements Parcelable, CollectionCustomizationIntf {
    public static final Parcelable.Creator CREATOR = C41854Ig8.A00(22);
    public final CollectionButtonCustomization A00;
    public final CollectionTitleCustomization A01;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CollectionCustomization) {
                CollectionCustomization collectionCustomization = (CollectionCustomization) obj;
                if (!C14360o3.A0K(this.A00, collectionCustomization.A00) || !C14360o3.A0K(this.A01, collectionCustomization.A01)) {
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
        parcel.writeParcelable(this.A01, i);
    }

    public final int hashCode() {
        return (AbstractC167017dG.A0M(this.A00) * 31) + AbstractC166997dE.A0I(this.A01);
    }

    public CollectionCustomization(CollectionButtonCustomization collectionButtonCustomization, CollectionTitleCustomization collectionTitleCustomization) {
        this.A00 = collectionButtonCustomization;
        this.A01 = collectionTitleCustomization;
    }
}
