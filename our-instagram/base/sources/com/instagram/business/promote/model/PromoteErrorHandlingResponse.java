package com.instagram.business.promote.model;

import X.C14360o3;
import X.C70220WId;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes11.dex */
public final class PromoteErrorHandlingResponse implements Parcelable {
    public static final C70220WId CREATOR = new C70220WId(72);
    public ErrorHandlingResponseType A00;
    public PromoteErrorLevel A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A03);
        parcel.writeString(this.A04);
        parcel.writeParcelable(this.A01, i);
        parcel.writeString(this.A02);
        parcel.writeString(this.A05);
    }
}
