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
public final class ClipsTextAlignment implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ ClipsTextAlignment[] A03;
    public static final ClipsTextAlignment A04;
    public static final ClipsTextAlignment A05;
    public static final ClipsTextAlignment A06;
    public static final ClipsTextAlignment A07;
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
        ClipsTextAlignment clipsTextAlignment = new ClipsTextAlignment("UNRECOGNIZED", 0, "ClipsTextAlignment_unspecified");
        A07 = clipsTextAlignment;
        ClipsTextAlignment clipsTextAlignment2 = new ClipsTextAlignment("CENTER", 1, "center");
        A04 = clipsTextAlignment2;
        ClipsTextAlignment clipsTextAlignment3 = new ClipsTextAlignment("LEFT", 2, "left");
        A05 = clipsTextAlignment3;
        ClipsTextAlignment clipsTextAlignment4 = new ClipsTextAlignment("RIGHT", 3, "right");
        A06 = clipsTextAlignment4;
        ClipsTextAlignment[] clipsTextAlignmentArr = {clipsTextAlignment, clipsTextAlignment2, clipsTextAlignment3, clipsTextAlignment4};
        A03 = clipsTextAlignmentArr;
        A02 = AbstractC12190kN.A00(clipsTextAlignmentArr);
        ClipsTextAlignment[] values = values();
        int A0L = AbstractC16850sd.A0L(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L < 16 ? 16 : A0L);
        for (ClipsTextAlignment clipsTextAlignment5 : values) {
            linkedHashMap.put(clipsTextAlignment5.A00, clipsTextAlignment5);
        }
        A01 = linkedHashMap;
        CREATOR = new C206149Aw(68);
    }

    public static ClipsTextAlignment valueOf(String str) {
        return (ClipsTextAlignment) Enum.valueOf(ClipsTextAlignment.class, str);
    }

    public static ClipsTextAlignment[] values() {
        return (ClipsTextAlignment[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public ClipsTextAlignment(String str, int i, String str2) {
        this.A00 = str2;
    }
}
