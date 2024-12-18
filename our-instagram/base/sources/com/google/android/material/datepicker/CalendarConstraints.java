package com.google.android.material.datepicker;

import X.C02O;
import X.C63469Sl9;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;

/* loaded from: classes11.dex */
public final class CalendarConstraints implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C63469Sl9(4);
    public Month A00;
    public final int A01;
    public final int A02;
    public final DateValidator A03;
    public final Month A04;
    public final Month A05;

    /* loaded from: classes10.dex */
    public interface DateValidator extends Parcelable {
        boolean CfP(long j);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CalendarConstraints)) {
            return false;
        }
        CalendarConstraints calendarConstraints = (CalendarConstraints) obj;
        return this.A05.equals(calendarConstraints.A05) && this.A04.equals(calendarConstraints.A04) && C02O.A00(this.A00, calendarConstraints.A00) && this.A03.equals(calendarConstraints.A03);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A05, this.A04, this.A00, this.A03});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.A05, 0);
        parcel.writeParcelable(this.A04, 0);
        parcel.writeParcelable(this.A00, 0);
        parcel.writeParcelable(this.A03, 0);
    }

    public CalendarConstraints(DateValidator dateValidator, Month month, Month month2, Month month3) {
        this.A05 = month;
        this.A04 = month2;
        this.A00 = month3;
        this.A03 = dateValidator;
        if (month3 != null) {
            Calendar calendar = month.A05;
            Calendar calendar2 = month3.A05;
            if (calendar.compareTo(calendar2) <= 0) {
                if (calendar2.compareTo(month2.A05) > 0) {
                    throw new IllegalArgumentException("current Month cannot be after end Month");
                }
            } else {
                throw new IllegalArgumentException("start Month cannot be after current Month");
            }
        }
        if (month.A05 instanceof GregorianCalendar) {
            int i = month2.A04 - month.A04;
            this.A01 = (i * 12) + (month2.A03 - month.A03) + 1;
            this.A02 = i + 1;
            return;
        }
        throw new IllegalArgumentException("Only Gregorian calendars are supported.");
    }
}
