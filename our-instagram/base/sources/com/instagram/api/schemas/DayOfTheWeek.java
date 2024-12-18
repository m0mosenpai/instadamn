package com.instagram.api.schemas;

import X.AbstractC12190kN;
import X.AbstractC167017dG;
import X.AbstractC167027dH;
import X.C41854Ig8;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class DayOfTheWeek implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ DayOfTheWeek[] A03;
    public static final DayOfTheWeek A04;
    public static final DayOfTheWeek A05;
    public static final DayOfTheWeek A06;
    public static final DayOfTheWeek A07;
    public static final DayOfTheWeek A08;
    public static final DayOfTheWeek A09;
    public static final DayOfTheWeek A0A;
    public static final DayOfTheWeek A0B;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        DayOfTheWeek dayOfTheWeek = new DayOfTheWeek("UNRECOGNIZED", 0, "DayOfTheWeek_unspecified");
        A0A = dayOfTheWeek;
        DayOfTheWeek dayOfTheWeek2 = new DayOfTheWeek("FRIDAY", 1, "FRIDAY");
        A04 = dayOfTheWeek2;
        DayOfTheWeek dayOfTheWeek3 = new DayOfTheWeek("MONDAY", 2, "MONDAY");
        A05 = dayOfTheWeek3;
        DayOfTheWeek dayOfTheWeek4 = new DayOfTheWeek("SATURDAY", 3, "SATURDAY");
        A06 = dayOfTheWeek4;
        DayOfTheWeek dayOfTheWeek5 = new DayOfTheWeek("SUNDAY", 4, "SUNDAY");
        A07 = dayOfTheWeek5;
        DayOfTheWeek dayOfTheWeek6 = new DayOfTheWeek("THURSDAY", 5, "THURSDAY");
        A08 = dayOfTheWeek6;
        DayOfTheWeek dayOfTheWeek7 = new DayOfTheWeek("TUESDAY", 6, "TUESDAY");
        A09 = dayOfTheWeek7;
        DayOfTheWeek dayOfTheWeek8 = new DayOfTheWeek("WEDNESDAY", 7, "WEDNESDAY");
        A0B = dayOfTheWeek8;
        DayOfTheWeek[] dayOfTheWeekArr = {dayOfTheWeek, dayOfTheWeek2, dayOfTheWeek3, dayOfTheWeek4, dayOfTheWeek5, dayOfTheWeek6, dayOfTheWeek7, dayOfTheWeek8};
        A03 = dayOfTheWeekArr;
        A02 = AbstractC12190kN.A00(dayOfTheWeekArr);
        DayOfTheWeek[] values = values();
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC167017dG.A01(values.length));
        for (DayOfTheWeek dayOfTheWeek9 : values) {
            linkedHashMap.put(dayOfTheWeek9.A00, dayOfTheWeek9);
        }
        A01 = linkedHashMap;
        CREATOR = new C41854Ig8(59);
    }

    public static DayOfTheWeek valueOf(String str) {
        return (DayOfTheWeek) Enum.valueOf(DayOfTheWeek.class, str);
    }

    public static DayOfTheWeek[] values() {
        return (DayOfTheWeek[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public DayOfTheWeek(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
