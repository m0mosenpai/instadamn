package com.instagram.model.mapquery;

import X.AbstractC167007dF;
import X.AbstractC167017dG;
import X.C14360o3;
import X.C55343Oh9;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes9.dex */
public final class MapQuery implements Parcelable {
    public static final Parcelable.Creator CREATOR = C55343Oh9.A00(88);
    public String A00;
    public String A01;
    public String A02;
    public String A03;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
        parcel.writeString(this.A03);
        parcel.writeString(this.A02);
    }

    public MapQuery(String str, String str2, String str3) {
        AbstractC167017dG.A1P(str, str2);
        this.A00 = str;
        this.A01 = str2;
        this.A03 = "";
        this.A02 = str3;
    }

    public MapQuery() {
        this("", "", AbstractC167007dF.A0h("CATEGORY"));
    }
}
