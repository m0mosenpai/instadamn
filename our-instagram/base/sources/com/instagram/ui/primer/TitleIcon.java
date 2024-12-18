package com.instagram.ui.primer;

import X.C14360o3;
import X.C55344OhA;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes9.dex */
public final class TitleIcon implements Parcelable {
    public static final Parcelable.Creator CREATOR = C55344OhA.A00(13);
    public final int A00;
    public final ColorTint A01;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeInt(this.A00);
        ColorTint colorTint = this.A01;
        if (colorTint == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            colorTint.writeToParcel(parcel, i);
        }
    }

    public TitleIcon(ColorTint colorTint, int i) {
        this.A00 = i;
        this.A01 = colorTint;
    }
}
