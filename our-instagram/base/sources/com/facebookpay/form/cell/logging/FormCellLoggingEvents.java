package com.facebookpay.form.cell.logging;

import X.C14360o3;
import X.C70221WIe;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes11.dex */
public final class FormCellLoggingEvents implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C70221WIe(80);
    public final FormCellFocusEvents A00;

    public FormCellLoggingEvents(FormCellFocusEvents formCellFocusEvents) {
        C14360o3.A0B(formCellFocusEvents, 1);
        this.A00 = formCellFocusEvents;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        this.A00.writeToParcel(parcel, i);
    }
}
