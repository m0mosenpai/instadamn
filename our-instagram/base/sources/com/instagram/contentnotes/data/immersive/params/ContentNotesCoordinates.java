package com.instagram.contentnotes.data.immersive.params;

import X.C0T6;
import X.C14360o3;
import X.LNM;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes8.dex */
public final class ContentNotesCoordinates extends C0T6 implements Parcelable {
    public static final Parcelable.Creator CREATOR = LNM.A00(24);
    public final int A00;
    public final int A01;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A01);
    }

    public ContentNotesCoordinates(int i, int i2) {
        this.A00 = i;
        this.A01 = i2;
    }
}
