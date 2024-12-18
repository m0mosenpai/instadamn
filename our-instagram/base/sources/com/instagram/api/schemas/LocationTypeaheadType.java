package com.instagram.api.schemas;

import X.AbstractC12190kN;
import X.AbstractC167017dG;
import X.AbstractC167027dH;
import X.AbstractC25225BEi;
import X.C41858IgC;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class LocationTypeaheadType implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ LocationTypeaheadType[] A03;
    public static final LocationTypeaheadType A04;
    public static final LocationTypeaheadType A05;
    public static final LocationTypeaheadType A06;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        LocationTypeaheadType locationTypeaheadType = new LocationTypeaheadType("UNRECOGNIZED", 0, "LocationTypeaheadType_unspecified");
        A06 = locationTypeaheadType;
        LocationTypeaheadType locationTypeaheadType2 = new LocationTypeaheadType("ADDRESS", 1, "ADDRESS");
        A04 = locationTypeaheadType2;
        LocationTypeaheadType locationTypeaheadType3 = new LocationTypeaheadType("ALL", 2, "ALL");
        A05 = locationTypeaheadType3;
        LocationTypeaheadType[] locationTypeaheadTypeArr = {locationTypeaheadType, locationTypeaheadType2, locationTypeaheadType3, new LocationTypeaheadType("REGIONAL", 3, "REGIONAL")};
        A03 = locationTypeaheadTypeArr;
        A02 = AbstractC12190kN.A00(locationTypeaheadTypeArr);
        LocationTypeaheadType[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (LocationTypeaheadType locationTypeaheadType4 : values) {
            A18.put(locationTypeaheadType4.A00, locationTypeaheadType4);
        }
        A01 = A18;
        CREATOR = C41858IgC.A00(77);
    }

    public static LocationTypeaheadType valueOf(String str) {
        return (LocationTypeaheadType) Enum.valueOf(LocationTypeaheadType.class, str);
    }

    public static LocationTypeaheadType[] values() {
        return (LocationTypeaheadType[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public LocationTypeaheadType(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
