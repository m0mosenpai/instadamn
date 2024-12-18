package com.facebookpay.form.cell.text.formatter;

import X.C70221WIe;
import android.os.Parcel;
import android.os.Parcelable;
import android.telephony.PhoneNumberFormattingTextWatcher;

/* loaded from: classes11.dex */
public class PhoneFormatter extends PhoneNumberFormattingTextWatcher implements TextFormatter {
    public static final Parcelable.Creator CREATOR = new C70221WIe(88);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
    }
}
