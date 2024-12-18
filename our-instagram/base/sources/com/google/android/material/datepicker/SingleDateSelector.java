package com.google.android.material.datepicker;

import X.AbstractC166987dD;
import X.C63469Sl9;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes10.dex */
public class SingleDateSelector implements DateSelector {
    public static final Parcelable.Creator CREATOR = new C63469Sl9(10);
    public Long A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeValue(this.A00);
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public final ArrayList BsY() {
        ArrayList A1E = AbstractC166987dD.A1E();
        Long l = this.A00;
        if (l != null) {
            A1E.add(l);
        }
        return A1E;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public final ArrayList Bsm() {
        return AbstractC166987dD.A1E();
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public final void EMp(long j) {
        this.A00 = Long.valueOf(j);
    }
}
