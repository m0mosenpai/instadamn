package com.facebookpay.form.cell.logging;

import X.AbstractC167027dH;
import X.C14360o3;
import X.C70221WIe;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes11.dex */
public final class FormCellFocusEvents implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C70221WIe(79);
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public FormCellFocusEvents(String str, String str2, String str3, String str4) {
        AbstractC167027dH.A0a(1, str, str2, str3, str4);
        this.A02 = str;
        this.A00 = str2;
        this.A01 = str3;
        this.A03 = str4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A02);
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
        parcel.writeString(this.A03);
    }
}
