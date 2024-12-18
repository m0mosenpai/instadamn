package com.instagram.model.shopping.productfeed;

import X.AbstractC166987dD;
import X.C14360o3;
import X.C41856IgA;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes7.dex */
public final class ProductCollectionFooter implements Parcelable {
    public static final Parcelable.Creator CREATOR = C41856IgA.A00(42);
    public String A00;
    public ArrayList A01 = AbstractC166987dD.A1E();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A00);
        parcel.writeTypedList(this.A01);
    }
}
