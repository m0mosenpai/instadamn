package com.google.android.material.navigation;

import X.C63469Sl9;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.internal.ParcelableSparseArray;

/* loaded from: classes10.dex */
public class NavigationBarPresenter$SavedState implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C63469Sl9(13);
    public int A00;
    public ParcelableSparseArray A01;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A00);
        parcel.writeParcelable(this.A01, 0);
    }
}
