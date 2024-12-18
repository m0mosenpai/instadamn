package com.instagram.monetization.onboarding.model;

import X.C14360o3;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes7.dex */
public final class ProductOnboardingNextStepInfo implements Parcelable {
    public int A00 = 0;
    public String A02 = null;
    public String A01 = "incomplete";

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeInt(this.A00);
        parcel.writeString(this.A02);
        parcel.writeString(this.A01);
    }
}
