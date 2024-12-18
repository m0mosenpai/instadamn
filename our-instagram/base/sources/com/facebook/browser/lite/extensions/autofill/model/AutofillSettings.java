package com.facebook.browser.lite.extensions.autofill.model;

import X.C14360o3;
import X.C63475SlG;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes10.dex */
public final class AutofillSettings implements Parcelable {
    public static final Parcelable.Creator CREATOR = C63475SlG.A02(16);
    public final int A00;
    public final int A01;
    public final boolean A02;
    public final boolean A03;
    public final int A04;
    public final String A05;
    public final String A06;
    public final boolean A07;
    public final boolean A08;

    public AutofillSettings(String str, String str2, int i, int i2, int i3, boolean z, boolean z2, boolean z3, boolean z4) {
        C14360o3.A0B(str, 7);
        C14360o3.A0B(str2, 8);
        this.A04 = i;
        this.A07 = z;
        this.A00 = i2;
        this.A03 = z2;
        this.A02 = z3;
        this.A08 = z4;
        this.A05 = str;
        this.A06 = str2;
        this.A01 = i3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeInt(this.A04);
        parcel.writeInt(this.A07 ? 1 : 0);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A03 ? 1 : 0);
        parcel.writeInt(this.A02 ? 1 : 0);
        parcel.writeInt(this.A08 ? 1 : 0);
        parcel.writeString(this.A05);
        parcel.writeString(this.A06);
        parcel.writeInt(this.A01);
    }
}
