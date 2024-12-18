package com.facebookpay.form.cell.text.formatter;

import X.AbstractC13190m5;
import X.C0s6;
import X.C14360o3;
import X.C70221WIe;
import X.EnumC61219RhJ;
import X.Q43;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;

/* loaded from: classes10.dex */
public final class CreditCardFormatter implements TextFormatter {
    public static final Parcelable.Creator CREATOR = new C70221WIe(85);
    public int A00;
    public int A01;
    public boolean A02;

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        int[] iArr;
        C14360o3.A0B(editable, 0);
        if (!this.A02) {
            this.A02 = true;
            C0s6 A00 = AbstractC13190m5.A00(editable.getSpans(0, editable.length(), Q43.class));
            while (A00.hasNext()) {
                editable.removeSpan(A00.next());
            }
            EnumC61219RhJ A02 = EnumC61219RhJ.A06.A02(editable.toString());
            if (editable.length() > A02.A00) {
                int i = this.A01;
                editable.delete(i, this.A00 + i);
            }
            if (A02 == EnumC61219RhJ.A0B) {
                iArr = EnumC61219RhJ.A07;
            } else {
                iArr = EnumC61219RhJ.A08;
            }
            int length = editable.length();
            for (int i2 : iArr) {
                if (i2 <= length) {
                    editable.setSpan(new Q43(" "), i2 - 1, i2, 33);
                }
            }
            this.A02 = false;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.A01 = i;
        this.A00 = i3;
    }
}
