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
public final class ClipsIFUType implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ ClipsIFUType[] A03;
    public static final ClipsIFUType A04;
    public static final ClipsIFUType A05;
    public static final ClipsIFUType A06;
    public static final ClipsIFUType A07;
    public static final ClipsIFUType A08;
    public static final ClipsIFUType A09;
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
        ClipsIFUType clipsIFUType = new ClipsIFUType("UNRECOGNIZED", 0, "ClipsIFUType_unspecified");
        A09 = clipsIFUType;
        ClipsIFUType clipsIFUType2 = new ClipsIFUType("DIRECT_SEARCH", 1, "direct_search");
        A04 = clipsIFUType2;
        ClipsIFUType clipsIFUType3 = new ClipsIFUType("MUSIC_DROPS", 2, "music_drops");
        A05 = clipsIFUType3;
        ClipsIFUType clipsIFUType4 = new ClipsIFUType("QUICK_PROMOTION", 3, "quick_promotion");
        A06 = clipsIFUType4;
        ClipsIFUType clipsIFUType5 = new ClipsIFUType("SUGGESTED", 4, "suggested");
        A07 = clipsIFUType5;
        ClipsIFUType clipsIFUType6 = new ClipsIFUType("TRENDING", 5, "trending");
        A08 = clipsIFUType6;
        ClipsIFUType[] clipsIFUTypeArr = {clipsIFUType, clipsIFUType2, clipsIFUType3, clipsIFUType4, clipsIFUType5, clipsIFUType6, new ClipsIFUType("TRENDING_ATTRIBUTE", 6, "trending_attribute")};
        A03 = clipsIFUTypeArr;
        A02 = AbstractC12190kN.A00(clipsIFUTypeArr);
        ClipsIFUType[] values = values();
        int A0L = AbstractC16850sd.A0L(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L < 16 ? 16 : A0L);
        for (ClipsIFUType clipsIFUType7 : values) {
            linkedHashMap.put(clipsIFUType7.A00, clipsIFUType7);
        }
        A01 = linkedHashMap;
        CREATOR = new C206149Aw(64);
    }

    public static ClipsIFUType valueOf(String str) {
        return (ClipsIFUType) Enum.valueOf(ClipsIFUType.class, str);
    }

    public static ClipsIFUType[] values() {
        return (ClipsIFUType[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public ClipsIFUType(String str, int i, String str2) {
        this.A00 = str2;
    }
}
