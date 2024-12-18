package com.google.android.material.datepicker;

import X.C63469Sl9;
import X.InterfaceC65517Tlm;
import X.T7K;
import X.T7L;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.datepicker.CalendarConstraints;
import java.util.List;

/* loaded from: classes10.dex */
public final class CompositeDateValidator implements CalendarConstraints.DateValidator {
    public final InterfaceC65517Tlm A00;
    public final List A01;
    public static final InterfaceC65517Tlm A03 = new T7K();
    public static final InterfaceC65517Tlm A02 = new T7L();
    public static final Parcelable.Creator CREATOR = new C63469Sl9(5);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CompositeDateValidator)) {
            return false;
        }
        CompositeDateValidator compositeDateValidator = (CompositeDateValidator) obj;
        return this.A01.equals(compositeDateValidator.A01) && this.A00.BF3() == compositeDateValidator.A00.BF3();
    }

    @Override // com.google.android.material.datepicker.CalendarConstraints.DateValidator
    public final boolean CfP(long j) {
        return this.A00.CfQ(this.A01, j);
    }

    public final int hashCode() {
        return this.A01.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeList(this.A01);
        parcel.writeInt(this.A00.BF3());
    }

    public CompositeDateValidator(InterfaceC65517Tlm interfaceC65517Tlm, List list) {
        this.A01 = list;
        this.A00 = interfaceC65517Tlm;
    }
}
