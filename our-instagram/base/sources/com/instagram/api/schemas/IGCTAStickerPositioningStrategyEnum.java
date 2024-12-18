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
/* loaded from: classes2.dex */
public final class IGCTAStickerPositioningStrategyEnum implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ IGCTAStickerPositioningStrategyEnum[] A03;
    public static final IGCTAStickerPositioningStrategyEnum A04;
    public static final IGCTAStickerPositioningStrategyEnum A05;
    public static final IGCTAStickerPositioningStrategyEnum A06;
    public static final IGCTAStickerPositioningStrategyEnum A07;
    public static final IGCTAStickerPositioningStrategyEnum A08;
    public static final IGCTAStickerPositioningStrategyEnum A09;
    public static final IGCTAStickerPositioningStrategyEnum A0A;
    public static final IGCTAStickerPositioningStrategyEnum A0B;
    public static final IGCTAStickerPositioningStrategyEnum A0C;
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
        IGCTAStickerPositioningStrategyEnum iGCTAStickerPositioningStrategyEnum = new IGCTAStickerPositioningStrategyEnum("UNRECOGNIZED", 0, "IGCTAStickerPositioningStrategyEnum_unspecified");
        A0C = iGCTAStickerPositioningStrategyEnum;
        IGCTAStickerPositioningStrategyEnum iGCTAStickerPositioningStrategyEnum2 = new IGCTAStickerPositioningStrategyEnum("CONSERVATIVE_POSITIONING", 1, "CONSERVATIVE_POSITIONING");
        A04 = iGCTAStickerPositioningStrategyEnum2;
        IGCTAStickerPositioningStrategyEnum iGCTAStickerPositioningStrategyEnum3 = new IGCTAStickerPositioningStrategyEnum("HIGHEST_POSITION_0_20", 2, "HIGHEST_POSITION_0_20");
        A05 = iGCTAStickerPositioningStrategyEnum3;
        IGCTAStickerPositioningStrategyEnum iGCTAStickerPositioningStrategyEnum4 = new IGCTAStickerPositioningStrategyEnum("HIGHEST_POSITION_0_30", 3, "HIGHEST_POSITION_0_30");
        A06 = iGCTAStickerPositioningStrategyEnum4;
        IGCTAStickerPositioningStrategyEnum iGCTAStickerPositioningStrategyEnum5 = new IGCTAStickerPositioningStrategyEnum("HIGHEST_POSITION_WITH_MIN_BUFFER_0_20", 4, "HIGHEST_POSITION_WITH_MIN_BUFFER_0_20");
        A07 = iGCTAStickerPositioningStrategyEnum5;
        IGCTAStickerPositioningStrategyEnum iGCTAStickerPositioningStrategyEnum6 = new IGCTAStickerPositioningStrategyEnum("HIGHEST_POSITION_WITH_MIN_BUFFER_0_30", 5, "HIGHEST_POSITION_WITH_MIN_BUFFER_0_30");
        A08 = iGCTAStickerPositioningStrategyEnum6;
        IGCTAStickerPositioningStrategyEnum iGCTAStickerPositioningStrategyEnum7 = new IGCTAStickerPositioningStrategyEnum("LARGEST_EMPTY_AREA_0_20", 6, "LARGEST_EMPTY_AREA_0_20");
        A09 = iGCTAStickerPositioningStrategyEnum7;
        IGCTAStickerPositioningStrategyEnum iGCTAStickerPositioningStrategyEnum8 = new IGCTAStickerPositioningStrategyEnum("LARGEST_EMPTY_AREA_0_30", 7, "LARGEST_EMPTY_AREA_0_30");
        A0A = iGCTAStickerPositioningStrategyEnum8;
        IGCTAStickerPositioningStrategyEnum iGCTAStickerPositioningStrategyEnum9 = new IGCTAStickerPositioningStrategyEnum("NEAR_CENTER_0_20", 8, "NEAR_CENTER_0_20");
        A0B = iGCTAStickerPositioningStrategyEnum9;
        IGCTAStickerPositioningStrategyEnum[] iGCTAStickerPositioningStrategyEnumArr = {iGCTAStickerPositioningStrategyEnum, iGCTAStickerPositioningStrategyEnum2, iGCTAStickerPositioningStrategyEnum3, iGCTAStickerPositioningStrategyEnum4, iGCTAStickerPositioningStrategyEnum5, iGCTAStickerPositioningStrategyEnum6, iGCTAStickerPositioningStrategyEnum7, iGCTAStickerPositioningStrategyEnum8, iGCTAStickerPositioningStrategyEnum9, new IGCTAStickerPositioningStrategyEnum("NEAR_CENTER_0_30", 9, "NEAR_CENTER_0_30")};
        A03 = iGCTAStickerPositioningStrategyEnumArr;
        A02 = AbstractC12190kN.A00(iGCTAStickerPositioningStrategyEnumArr);
        IGCTAStickerPositioningStrategyEnum[] values = values();
        int A0L = AbstractC16850sd.A0L(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L < 16 ? 16 : A0L);
        for (IGCTAStickerPositioningStrategyEnum iGCTAStickerPositioningStrategyEnum10 : values) {
            linkedHashMap.put(iGCTAStickerPositioningStrategyEnum10.A00, iGCTAStickerPositioningStrategyEnum10);
        }
        A01 = linkedHashMap;
        CREATOR = new C206159Ax(14);
    }

    public static IGCTAStickerPositioningStrategyEnum valueOf(String str) {
        return (IGCTAStickerPositioningStrategyEnum) Enum.valueOf(IGCTAStickerPositioningStrategyEnum.class, str);
    }

    public static IGCTAStickerPositioningStrategyEnum[] values() {
        return (IGCTAStickerPositioningStrategyEnum[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public IGCTAStickerPositioningStrategyEnum(String str, int i, String str2) {
        this.A00 = str2;
    }
}
