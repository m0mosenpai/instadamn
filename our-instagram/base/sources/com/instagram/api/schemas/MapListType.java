package com.instagram.api.schemas;

import X.AbstractC12190kN;
import X.AbstractC167017dG;
import X.AbstractC167027dH;
import X.C41858IgC;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class MapListType implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ MapListType[] A03;
    public static final MapListType A04;
    public static final MapListType A05;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        MapListType mapListType = new MapListType("UNRECOGNIZED", 0, "MapListType_unspecified");
        A05 = mapListType;
        MapListType mapListType2 = new MapListType("LIST", 1, "LIST");
        A04 = mapListType2;
        MapListType[] mapListTypeArr = {mapListType, mapListType2, new MapListType("STICKER_COLLECTION", 2, "STICKER_COLLECTION")};
        A03 = mapListTypeArr;
        A02 = AbstractC12190kN.A00(mapListTypeArr);
        MapListType[] values = values();
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC167017dG.A01(values.length));
        for (MapListType mapListType3 : values) {
            linkedHashMap.put(mapListType3.A00, mapListType3);
        }
        A01 = linkedHashMap;
        CREATOR = new C41858IgC(79);
    }

    public static MapListType valueOf(String str) {
        return (MapListType) Enum.valueOf(MapListType.class, str);
    }

    public static MapListType[] values() {
        return (MapListType[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public MapListType(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
