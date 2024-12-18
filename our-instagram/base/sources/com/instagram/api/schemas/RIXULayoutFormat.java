package com.instagram.api.schemas;

import X.AbstractC12190kN;
import X.AbstractC16850sd;
import X.C14360o3;
import X.C206159Ax;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class RIXULayoutFormat implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ RIXULayoutFormat[] A03;
    public static final RIXULayoutFormat A04;
    public static final RIXULayoutFormat A05;
    public static final RIXULayoutFormat A06;
    public static final RIXULayoutFormat A07;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeInt(ordinal());
    }

    static {
        RIXULayoutFormat rIXULayoutFormat = new RIXULayoutFormat("UNRECOGNIZED", 0, "RIXULayoutFormat_unspecified");
        A07 = rIXULayoutFormat;
        RIXULayoutFormat rIXULayoutFormat2 = new RIXULayoutFormat("GRID", 1, "grid");
        A04 = rIXULayoutFormat2;
        RIXULayoutFormat rIXULayoutFormat3 = new RIXULayoutFormat("GRID_2X2", 2, "grid_2x2");
        A05 = rIXULayoutFormat3;
        RIXULayoutFormat rIXULayoutFormat4 = new RIXULayoutFormat("GRID_3X2", 3, "grid_3x2");
        A06 = rIXULayoutFormat4;
        RIXULayoutFormat[] rIXULayoutFormatArr = {rIXULayoutFormat, rIXULayoutFormat2, rIXULayoutFormat3, rIXULayoutFormat4, new RIXULayoutFormat("HSCROLL", 4, "hscroll")};
        A03 = rIXULayoutFormatArr;
        A02 = AbstractC12190kN.A00(rIXULayoutFormatArr);
        RIXULayoutFormat[] values = values();
        int A0L = AbstractC16850sd.A0L(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L < 16 ? 16 : A0L);
        for (RIXULayoutFormat rIXULayoutFormat5 : values) {
            linkedHashMap.put(rIXULayoutFormat5.A00, rIXULayoutFormat5);
        }
        A01 = linkedHashMap;
        CREATOR = new C206159Ax(95);
    }

    public static RIXULayoutFormat valueOf(String str) {
        return (RIXULayoutFormat) Enum.valueOf(RIXULayoutFormat.class, str);
    }

    public static RIXULayoutFormat[] values() {
        return (RIXULayoutFormat[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public RIXULayoutFormat(String str, int i, String str2) {
        this.A00 = str2;
    }
}
