package com.instagram.api.schemas;

import X.AbstractC12190kN;
import X.AbstractC16850sd;
import X.C14360o3;
import X.C41855Ig9;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class RIXUCoverSize implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ RIXUCoverSize[] A03;
    public static final RIXUCoverSize A04;
    public static final RIXUCoverSize A05;
    public static final RIXUCoverSize A06;
    public static final RIXUCoverSize A07;
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
        RIXUCoverSize rIXUCoverSize = new RIXUCoverSize("UNRECOGNIZED", 0, "RIXUCoverSize_unspecified");
        A07 = rIXUCoverSize;
        RIXUCoverSize rIXUCoverSize2 = new RIXUCoverSize("EXTRA_SMALL", 1, "extra_small");
        A04 = rIXUCoverSize2;
        RIXUCoverSize rIXUCoverSize3 = new RIXUCoverSize("SMALL", 2, "small");
        A06 = rIXUCoverSize3;
        RIXUCoverSize rIXUCoverSize4 = new RIXUCoverSize("MEDIUM", 3, "medium");
        A05 = rIXUCoverSize4;
        RIXUCoverSize[] rIXUCoverSizeArr = {rIXUCoverSize, rIXUCoverSize2, rIXUCoverSize3, rIXUCoverSize4, new RIXUCoverSize("LARGE", 4, "large")};
        A03 = rIXUCoverSizeArr;
        A02 = AbstractC12190kN.A00(rIXUCoverSizeArr);
        RIXUCoverSize[] values = values();
        int A0L = AbstractC16850sd.A0L(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L < 16 ? 16 : A0L);
        for (RIXUCoverSize rIXUCoverSize5 : values) {
            linkedHashMap.put(rIXUCoverSize5.A00, rIXUCoverSize5);
        }
        A01 = linkedHashMap;
        CREATOR = new C41855Ig9(83);
    }

    public static RIXUCoverSize valueOf(String str) {
        return (RIXUCoverSize) Enum.valueOf(RIXUCoverSize.class, str);
    }

    public static RIXUCoverSize[] values() {
        return (RIXUCoverSize[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public RIXUCoverSize(String str, int i, String str2) {
        this.A00 = str2;
    }
}
