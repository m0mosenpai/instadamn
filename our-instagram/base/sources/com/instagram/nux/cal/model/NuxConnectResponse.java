package com.instagram.nux.cal.model;

import X.C40781ul;
import X.C41856IgA;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes6.dex */
public final class NuxConnectResponse extends C40781ul implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C41856IgA(95);
    public String A00;
    public String A01;
    public String A02;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // X.C40781ul, X.InterfaceC40821up
    public final String getStatus() {
        String str = this.A01;
        str.getClass();
        return str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        parcel.writeString(this.A00);
    }
}
