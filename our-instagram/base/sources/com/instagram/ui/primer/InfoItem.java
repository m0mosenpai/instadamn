package com.instagram.ui.primer;

import X.AbstractC167017dG;
import X.AbstractC31181DnP;
import X.C14360o3;
import X.C55344OhA;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes8.dex */
public final class InfoItem implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C55344OhA(11);
    public final IconConfig A00;
    public final Integer A01;
    public final String A02;
    public final String A03;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A02);
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A03);
        parcel.writeInt(AbstractC31181DnP.A01(parcel, this.A01));
    }

    public InfoItem(IconConfig iconConfig, Integer num, String str, String str2) {
        AbstractC167017dG.A1P(str, iconConfig);
        this.A02 = str;
        this.A00 = iconConfig;
        this.A03 = str2;
        this.A01 = num;
    }
}
