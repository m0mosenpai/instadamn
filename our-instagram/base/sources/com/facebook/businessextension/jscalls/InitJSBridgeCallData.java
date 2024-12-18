package com.facebook.businessextension.jscalls;

import X.C63475SlG;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes10.dex */
public class InitJSBridgeCallData implements Parcelable {
    public static final Parcelable.Creator CREATOR = C63475SlG.A02(31);
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00);
    }

    public InitJSBridgeCallData(Parcel parcel) {
        this.A00 = parcel.readString();
    }
}
