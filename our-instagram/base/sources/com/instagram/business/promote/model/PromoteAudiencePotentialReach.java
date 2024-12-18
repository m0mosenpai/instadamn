package com.instagram.business.promote.model;

import X.C14360o3;
import X.C40781ul;
import X.C70220WId;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes11.dex */
public final class PromoteAudiencePotentialReach extends C40781ul implements Parcelable {
    public static final C70220WId CREATOR = new C70220WId(62);
    public int A00;
    public int A01;
    public int A02;
    public AudiencePotentialReachRating A03;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeInt(this.A00);
        parcel.writeParcelable(this.A03, i);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A02);
    }
}
