package com.instagram.mediakit.ui.model;

import X.C14360o3;
import X.C55343Oh9;
import X.InterfaceC16820sZ;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;

/* loaded from: classes9.dex */
public final class MediaKitLink implements Parcelable {
    public static final Parcelable.Creator CREATOR = C55343Oh9.A00(50);
    public final int A00;
    public final InterfaceC16820sZ A01;

    public MediaKitLink(InterfaceC16820sZ interfaceC16820sZ, int i) {
        C14360o3.A0B(interfaceC16820sZ, 2);
        this.A00 = i;
        this.A01 = interfaceC16820sZ;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeInt(this.A00);
        parcel.writeSerializable((Serializable) this.A01);
    }
}
