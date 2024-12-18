package com.google.android.material.datepicker;

import X.AbstractC166987dD;
import X.C3AY;
import X.C63469Sl9;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes10.dex */
public class RangeDateSelector implements DateSelector {
    public static final Parcelable.Creator CREATOR = new C63469Sl9(9);
    public Long A01 = null;
    public Long A00 = null;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public final ArrayList Bsm() {
        Long l;
        Long l2 = this.A01;
        if (l2 != null && (l = this.A00) != null) {
            ArrayList A1E = AbstractC166987dD.A1E();
            A1E.add(new C3AY(l2, l));
            return A1E;
        }
        return AbstractC166987dD.A1E();
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public final void EMp(long j) {
        Long l = this.A01;
        if (l != null) {
            if (this.A00 == null && l.longValue() <= j) {
                this.A00 = Long.valueOf(j);
                return;
            }
            this.A00 = null;
        }
        this.A01 = Long.valueOf(j);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeValue(this.A01);
        parcel.writeValue(this.A00);
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public final ArrayList BsY() {
        ArrayList A1E = AbstractC166987dD.A1E();
        Long l = this.A01;
        if (l != null) {
            A1E.add(l);
        }
        Long l2 = this.A00;
        if (l2 != null) {
            A1E.add(l2);
        }
        return A1E;
    }
}
