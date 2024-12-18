package com.instagram.api.schemas;

import X.AbstractC12190kN;
import X.AbstractC16850sd;
import X.C14360o3;
import X.C206149Aw;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class DemarcatorStyleEnum implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ DemarcatorStyleEnum[] A03;
    public static final DemarcatorStyleEnum A04;
    public static final DemarcatorStyleEnum A05;
    public static final DemarcatorStyleEnum A06;
    public static final DemarcatorStyleEnum A07;
    public static final DemarcatorStyleEnum A08;
    public static final DemarcatorStyleEnum A09;
    public static final DemarcatorStyleEnum A0A;
    public static final DemarcatorStyleEnum A0B;
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
        DemarcatorStyleEnum demarcatorStyleEnum = new DemarcatorStyleEnum("UNRECOGNIZED", 0, "DemarcatorStyleEnum_unspecified");
        A08 = demarcatorStyleEnum;
        DemarcatorStyleEnum demarcatorStyleEnum2 = new DemarcatorStyleEnum("DISCOVER_MORE_V1", 1, "discover_more_v1");
        A04 = demarcatorStyleEnum2;
        DemarcatorStyleEnum demarcatorStyleEnum3 = new DemarcatorStyleEnum("HIDDEN", 2, "hidden");
        A05 = demarcatorStyleEnum3;
        DemarcatorStyleEnum demarcatorStyleEnum4 = new DemarcatorStyleEnum("RETURN_FEED_V1", 3, "return_feed_v1");
        A07 = demarcatorStyleEnum4;
        DemarcatorStyleEnum demarcatorStyleEnum5 = new DemarcatorStyleEnum("ON_TOP_V1", 4, "top_of_feed");
        A06 = demarcatorStyleEnum5;
        DemarcatorStyleEnum demarcatorStyleEnum6 = new DemarcatorStyleEnum("V2", 5, "v2");
        A09 = demarcatorStyleEnum6;
        DemarcatorStyleEnum demarcatorStyleEnum7 = new DemarcatorStyleEnum("V3", 6, "v3");
        A0A = demarcatorStyleEnum7;
        DemarcatorStyleEnum demarcatorStyleEnum8 = new DemarcatorStyleEnum("V4", 7, "v4");
        A0B = demarcatorStyleEnum8;
        DemarcatorStyleEnum[] demarcatorStyleEnumArr = {demarcatorStyleEnum, demarcatorStyleEnum2, demarcatorStyleEnum3, demarcatorStyleEnum4, demarcatorStyleEnum5, demarcatorStyleEnum6, demarcatorStyleEnum7, demarcatorStyleEnum8};
        A03 = demarcatorStyleEnumArr;
        A02 = AbstractC12190kN.A00(demarcatorStyleEnumArr);
        DemarcatorStyleEnum[] values = values();
        int A0L = AbstractC16850sd.A0L(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L < 16 ? 16 : A0L);
        for (DemarcatorStyleEnum demarcatorStyleEnum9 : values) {
            linkedHashMap.put(demarcatorStyleEnum9.A00, demarcatorStyleEnum9);
        }
        A01 = linkedHashMap;
        CREATOR = new C206149Aw(84);
    }

    public static DemarcatorStyleEnum valueOf(String str) {
        return (DemarcatorStyleEnum) Enum.valueOf(DemarcatorStyleEnum.class, str);
    }

    public static DemarcatorStyleEnum[] values() {
        return (DemarcatorStyleEnum[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public DemarcatorStyleEnum(String str, int i, String str2) {
        this.A00 = str2;
    }
}
