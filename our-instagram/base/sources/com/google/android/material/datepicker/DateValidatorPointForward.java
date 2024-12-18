package com.google.android.material.datepicker;

import X.AbstractC58322PtE;
import X.C63469Sl9;
import X.MSY;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.datepicker.CalendarConstraints;

/* loaded from: classes10.dex */
public class DateValidatorPointForward implements CalendarConstraints.DateValidator {
    public static final Parcelable.Creator CREATOR = new C63469Sl9(7);
    public final long A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof DateValidatorPointForward) && this.A00 == ((DateValidatorPointForward) obj).A00;
        }
        return true;
    }

    @Override // com.google.android.material.datepicker.CalendarConstraints.DateValidator
    public final boolean CfP(long j) {
        return MSY.A1R((j > this.A00 ? 1 : (j == this.A00 ? 0 : -1)));
    }

    public final int hashCode() {
        return AbstractC58322PtE.A08(Long.valueOf(this.A00));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.A00);
    }

    public DateValidatorPointForward(long j) {
        this.A00 = j;
    }
}
