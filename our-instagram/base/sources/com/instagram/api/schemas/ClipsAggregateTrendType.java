package com.instagram.api.schemas;

import X.AbstractC12190kN;
import X.AbstractC167017dG;
import X.AbstractC167027dH;
import X.AbstractC25225BEi;
import X.C41854Ig8;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class ClipsAggregateTrendType implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ ClipsAggregateTrendType[] A03;
    public static final ClipsAggregateTrendType A04;
    public static final ClipsAggregateTrendType A05;
    public static final ClipsAggregateTrendType A06;
    public static final ClipsAggregateTrendType A07;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        ClipsAggregateTrendType clipsAggregateTrendType = new ClipsAggregateTrendType("UNRECOGNIZED", 0, "ClipsAggregateTrendType_unspecified");
        A06 = clipsAggregateTrendType;
        ClipsAggregateTrendType clipsAggregateTrendType2 = new ClipsAggregateTrendType("MOMENT", 1, "moment");
        A05 = clipsAggregateTrendType2;
        ClipsAggregateTrendType clipsAggregateTrendType3 = new ClipsAggregateTrendType("CURATION_REACTIVE", 2, "curation_reactive");
        A04 = clipsAggregateTrendType3;
        ClipsAggregateTrendType clipsAggregateTrendType4 = new ClipsAggregateTrendType("VERTICAL", 3, "vertical");
        A07 = clipsAggregateTrendType4;
        ClipsAggregateTrendType[] clipsAggregateTrendTypeArr = {clipsAggregateTrendType, clipsAggregateTrendType2, clipsAggregateTrendType3, clipsAggregateTrendType4, new ClipsAggregateTrendType("UNDEFINED", 4, "")};
        A03 = clipsAggregateTrendTypeArr;
        A02 = AbstractC12190kN.A00(clipsAggregateTrendTypeArr);
        ClipsAggregateTrendType[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (ClipsAggregateTrendType clipsAggregateTrendType5 : values) {
            A18.put(clipsAggregateTrendType5.A00, clipsAggregateTrendType5);
        }
        A01 = A18;
        CREATOR = C41854Ig8.A00(2);
    }

    public static ClipsAggregateTrendType valueOf(String str) {
        return (ClipsAggregateTrendType) Enum.valueOf(ClipsAggregateTrendType.class, str);
    }

    public static ClipsAggregateTrendType[] values() {
        return (ClipsAggregateTrendType[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public ClipsAggregateTrendType(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
