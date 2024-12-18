package com.facebook.browser.lite.ipc;

import X.C63475SlG;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* loaded from: classes10.dex */
public class IABExtensionStatesHandlerPayload implements Parcelable {
    public static final Parcelable.Creator CREATOR = C63475SlG.A02(25);
    public String A00;
    public String A01;
    public String A02;
    public List A03;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int dataPosition = parcel.dataPosition();
        parcel.writeInt(0);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        parcel.writeString(this.A00);
        parcel.writeStringList(this.A03);
        int dataPosition2 = parcel.dataPosition();
        parcel.setDataPosition(dataPosition);
        parcel.writeInt(dataPosition2 - dataPosition);
        parcel.setDataPosition(dataPosition2);
    }
}
