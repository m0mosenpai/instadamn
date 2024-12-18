package com.instagram.api.schemas;

import X.C0T6;
import X.C14360o3;
import X.C41854Ig8;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes7.dex */
public final class CollectionTitleCustomizationImpl extends C0T6 implements Parcelable, CollectionTitleCustomization {
    public static final Parcelable.Creator CREATOR = C41854Ig8.A00(24);
    public final int A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof CollectionTitleCustomizationImpl) && this.A00 == ((CollectionTitleCustomizationImpl) obj).A00);
    }

    public final int hashCode() {
        return this.A00;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeInt(this.A00);
    }

    public CollectionTitleCustomizationImpl(int i) {
        this.A00 = i;
    }
}
