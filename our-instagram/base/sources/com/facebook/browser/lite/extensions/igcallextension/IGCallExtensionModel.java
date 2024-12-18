package com.facebook.browser.lite.extensions.igcallextension;

import X.C14360o3;
import X.C63475SlG;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes10.dex */
public final class IGCallExtensionModel implements Parcelable {
    public static final Parcelable.Creator CREATOR = C63475SlG.A02(20);
    public final String A00;
    public final String A01;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A01);
        parcel.writeString(this.A00);
    }

    public IGCallExtensionModel(String str, String str2) {
        this.A01 = str;
        this.A00 = str2;
    }

    public IGCallExtensionModel(Parcel parcel) {
        this.A01 = parcel.readString();
        this.A00 = parcel.readString();
    }
}
