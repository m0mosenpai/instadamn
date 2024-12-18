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
public final class RIXUPlayType implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ RIXUPlayType[] A03;
    public static final RIXUPlayType A04;
    public static final RIXUPlayType A05;
    public static final RIXUPlayType A06;
    public static final RIXUPlayType A07;
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
        RIXUPlayType rIXUPlayType = new RIXUPlayType("UNRECOGNIZED", 0, "RIXUPlayType_unspecified");
        A07 = rIXUPlayType;
        RIXUPlayType rIXUPlayType2 = new RIXUPlayType("CONCURRENT", 1, "concurrent");
        A04 = rIXUPlayType2;
        RIXUPlayType rIXUPlayType3 = new RIXUPlayType("FOCUSED", 2, "focused");
        A05 = rIXUPlayType3;
        RIXUPlayType rIXUPlayType4 = new RIXUPlayType("NO_ANIMATION", 3, "no_animation");
        A06 = rIXUPlayType4;
        RIXUPlayType[] rIXUPlayTypeArr = {rIXUPlayType, rIXUPlayType2, rIXUPlayType3, rIXUPlayType4, new RIXUPlayType("SEQUENTIAL", 4, "sequential")};
        A03 = rIXUPlayTypeArr;
        A02 = AbstractC12190kN.A00(rIXUPlayTypeArr);
        RIXUPlayType[] values = values();
        int A0L = AbstractC16850sd.A0L(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L < 16 ? 16 : A0L);
        for (RIXUPlayType rIXUPlayType5 : values) {
            linkedHashMap.put(rIXUPlayType5.A00, rIXUPlayType5);
        }
        A01 = linkedHashMap;
        CREATOR = new C206159Ax(97);
    }

    public static RIXUPlayType valueOf(String str) {
        return (RIXUPlayType) Enum.valueOf(RIXUPlayType.class, str);
    }

    public static RIXUPlayType[] values() {
        return (RIXUPlayType[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public RIXUPlayType(String str, int i, String str2) {
        this.A00 = str2;
    }
}
