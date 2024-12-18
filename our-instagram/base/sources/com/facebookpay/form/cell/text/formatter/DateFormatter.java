package com.facebookpay.form.cell.text.formatter;

import X.C70221WIe;
import X.Q43;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;

/* loaded from: classes10.dex */
public class DateFormatter implements TextFormatter {
    public static final Parcelable.Creator CREATOR = new C70221WIe(86);
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
            try {
                if (editable.length() == 1 && Integer.parseInt(editable.toString()) > 1) {
                    editable.insert(0, "0");
                }
            } catch (NumberFormatException unused) {
            }
            for (Object obj : editable.getSpans(0, editable.length(), Q43.class)) {
                editable.removeSpan(obj);
            }
            try {
                if (editable.length() == 2 && Integer.parseInt(editable.toString()) > 12) {
                    editable.insert(0, "0");
                }
            } catch (NumberFormatException unused2) {
            }
            if (2 <= editable.length()) {
                editable.setSpan(new Q43("/"), 1, 2, 33);
            }
            this.A00 = false;
        }
    }
}
