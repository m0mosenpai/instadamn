package com.facebookpay.expresscheckout.models;

import X.C14360o3;
import X.C70221WIe;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

/* loaded from: classes11.dex */
public final class EcpNuxLearnMoreScreenStyle implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C70221WIe(50);
    public final CharSequence A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        TextUtils.writeToParcel(this.A00, parcel, i);
    }

    public EcpNuxLearnMoreScreenStyle(CharSequence charSequence) {
        this.A00 = charSequence;
    }

    public EcpNuxLearnMoreScreenStyle() {
        this(null);
    }
}
