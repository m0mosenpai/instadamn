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
public final class ClipsCreationEntryPoint implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ ClipsCreationEntryPoint[] A03;
    public static final ClipsCreationEntryPoint A04;
    public static final ClipsCreationEntryPoint A05;
    public static final ClipsCreationEntryPoint A06;
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
        ClipsCreationEntryPoint clipsCreationEntryPoint = new ClipsCreationEntryPoint("UNRECOGNIZED", 0, "ClipsCreationEntryPoint_unspecified");
        A06 = clipsCreationEntryPoint;
        ClipsCreationEntryPoint clipsCreationEntryPoint2 = new ClipsCreationEntryPoint("CLIPS", 1, "clips");
        A04 = clipsCreationEntryPoint2;
        ClipsCreationEntryPoint clipsCreationEntryPoint3 = new ClipsCreationEntryPoint("EMPTY", 2, "");
        A05 = clipsCreationEntryPoint3;
        ClipsCreationEntryPoint[] clipsCreationEntryPointArr = {clipsCreationEntryPoint, clipsCreationEntryPoint2, clipsCreationEntryPoint3, new ClipsCreationEntryPoint("FEED", 3, "feed")};
        A03 = clipsCreationEntryPointArr;
        A02 = AbstractC12190kN.A00(clipsCreationEntryPointArr);
        ClipsCreationEntryPoint[] values = values();
        int A0L = AbstractC16850sd.A0L(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L < 16 ? 16 : A0L);
        for (ClipsCreationEntryPoint clipsCreationEntryPoint4 : values) {
            linkedHashMap.put(clipsCreationEntryPoint4.A00, clipsCreationEntryPoint4);
        }
        A01 = linkedHashMap;
        CREATOR = new C206149Aw(63);
    }

    public static ClipsCreationEntryPoint valueOf(String str) {
        return (ClipsCreationEntryPoint) Enum.valueOf(ClipsCreationEntryPoint.class, str);
    }

    public static ClipsCreationEntryPoint[] values() {
        return (ClipsCreationEntryPoint[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public ClipsCreationEntryPoint(String str, int i, String str2) {
        this.A00 = str2;
    }
}
