package com.facebookpay.form.cell.text.formatter;

import X.C70221WIe;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import java.util.Locale;

/* loaded from: classes11.dex */
public class UpperCaseFormatter implements TextFormatter {
    public static final Parcelable.Creator CREATOR = new C70221WIe(89);
    public boolean A00;

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        if (!this.A00) {
            this.A00 = true;
            editable.replace(0, editable.length(), editable.toString().toUpperCase(Locale.US));
            this.A00 = false;
        }
    }
}
