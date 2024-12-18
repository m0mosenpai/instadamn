package com.instagram.api.schemas;

import X.AbstractC12190kN;
import X.AbstractC16850sd;
import X.C14360o3;
import X.C206139Av;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class WearablesAppAttributionType implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ WearablesAppAttributionType[] A03;
    public static final WearablesAppAttributionType A04;
    public static final WearablesAppAttributionType A05;
    public static final WearablesAppAttributionType A06;
    public static final WearablesAppAttributionType A07;
    public static final WearablesAppAttributionType A08;
    public static final WearablesAppAttributionType A09;
    public static final WearablesAppAttributionType A0A;
    public static final WearablesAppAttributionType A0B;
    public static final WearablesAppAttributionType A0C;
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
        WearablesAppAttributionType wearablesAppAttributionType = new WearablesAppAttributionType("UNRECOGNIZED", 0, "WearablesAppAttributionType_unspecified");
        A0B = wearablesAppAttributionType;
        WearablesAppAttributionType wearablesAppAttributionType2 = new WearablesAppAttributionType("GREATWHITE", 1, "greatwhite");
        A04 = wearablesAppAttributionType2;
        WearablesAppAttributionType wearablesAppAttributionType3 = new WearablesAppAttributionType("HAMMERHEAD", 2, "hammerhead");
        A05 = wearablesAppAttributionType3;
        WearablesAppAttributionType wearablesAppAttributionType4 = new WearablesAppAttributionType("HORIZON", 3, "horizon");
        A06 = wearablesAppAttributionType4;
        WearablesAppAttributionType wearablesAppAttributionType5 = new WearablesAppAttributionType("ICONIC_ENTRYPOINTS", 4, "iconic_entrypoints");
        A07 = wearablesAppAttributionType5;
        WearablesAppAttributionType wearablesAppAttributionType6 = new WearablesAppAttributionType("ICONIC_ENTRYPOINTS_AND_WORLD_PAGES", 5, "iconic_entrypoints_and_world_pages");
        A08 = wearablesAppAttributionType6;
        WearablesAppAttributionType wearablesAppAttributionType7 = new WearablesAppAttributionType("META_QUEST", 6, "meta_quest");
        A09 = wearablesAppAttributionType7;
        WearablesAppAttributionType wearablesAppAttributionType8 = new WearablesAppAttributionType("STELLA", 7, "stella");
        A0A = wearablesAppAttributionType8;
        WearablesAppAttributionType wearablesAppAttributionType9 = new WearablesAppAttributionType("WORLD_PAGES", 8, "world_pages");
        A0C = wearablesAppAttributionType9;
        WearablesAppAttributionType[] wearablesAppAttributionTypeArr = {wearablesAppAttributionType, wearablesAppAttributionType2, wearablesAppAttributionType3, wearablesAppAttributionType4, wearablesAppAttributionType5, wearablesAppAttributionType6, wearablesAppAttributionType7, wearablesAppAttributionType8, wearablesAppAttributionType9};
        A03 = wearablesAppAttributionTypeArr;
        A02 = AbstractC12190kN.A00(wearablesAppAttributionTypeArr);
        WearablesAppAttributionType[] values = values();
        int A0L = AbstractC16850sd.A0L(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L < 16 ? 16 : A0L);
        for (WearablesAppAttributionType wearablesAppAttributionType10 : values) {
            linkedHashMap.put(wearablesAppAttributionType10.A00, wearablesAppAttributionType10);
        }
        A01 = linkedHashMap;
        CREATOR = new C206139Av(37);
    }

    public static WearablesAppAttributionType valueOf(String str) {
        return (WearablesAppAttributionType) Enum.valueOf(WearablesAppAttributionType.class, str);
    }

    public static WearablesAppAttributionType[] values() {
        return (WearablesAppAttributionType[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public WearablesAppAttributionType(String str, int i, String str2) {
        this.A00 = str2;
    }
}
