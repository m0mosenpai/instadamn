package com.instagram.nux.common;

import X.AbstractC167027dH;
import X.C14360o3;
import X.C41856IgA;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes6.dex */
public final class HowItWorksNuxFragment$Row implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C41856IgA(97);
    public final Integer A00;
    public final Integer A01;
    public final Integer A02;
    public final Integer A03;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        AbstractC167027dH.A0o(parcel, this.A03, 0, 1);
        AbstractC167027dH.A0o(parcel, this.A00, 0, 1);
        AbstractC167027dH.A0o(parcel, this.A02, 0, 1);
        AbstractC167027dH.A0o(parcel, this.A01, 0, 1);
    }

    public HowItWorksNuxFragment$Row(Integer num, Integer num2, Integer num3, Integer num4) {
        this.A03 = num;
        this.A00 = num2;
        this.A02 = num3;
        this.A01 = num4;
    }

    public HowItWorksNuxFragment$Row() {
        this(null, null, null, null);
    }
}
