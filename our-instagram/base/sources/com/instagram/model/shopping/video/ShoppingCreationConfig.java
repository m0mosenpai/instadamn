package com.instagram.model.shopping.video;

import X.C14360o3;
import X.C41856IgA;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes7.dex */
public final class ShoppingCreationConfig implements Parcelable {
    public static final C41856IgA CREATOR = C41856IgA.A00(68);
    public int A00;
    public boolean A01;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeByte(this.A01 ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.A00);
    }
}
