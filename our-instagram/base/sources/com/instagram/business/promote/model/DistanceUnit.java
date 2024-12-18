package com.instagram.business.promote.model;

import X.AbstractC12190kN;
import X.C70220WId;
import X.MSZ;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class DistanceUnit implements Parcelable {
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ DistanceUnit[] A02;
    public static final DistanceUnit A03;
    public static final DistanceUnit A04;
    public static final Parcelable.Creator CREATOR;
    public final int A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public static DistanceUnit valueOf(String str) {
        return (DistanceUnit) Enum.valueOf(DistanceUnit.class, str);
    }

    public static DistanceUnit[] values() {
        return (DistanceUnit[]) A02.clone();
    }

    static {
        DistanceUnit distanceUnit = new DistanceUnit("MILE", 0, 2131970510);
        A04 = distanceUnit;
        DistanceUnit distanceUnit2 = new DistanceUnit("KILOMETER", 1, 2131970509);
        A03 = distanceUnit2;
        DistanceUnit[] distanceUnitArr = {distanceUnit, distanceUnit2};
        A02 = distanceUnitArr;
        A01 = AbstractC12190kN.A00(distanceUnitArr);
        CREATOR = new C70220WId(50);
    }

    public DistanceUnit(String str, int i, int i2) {
        this.A00 = i2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        MSZ.A12(parcel, this);
    }
}
