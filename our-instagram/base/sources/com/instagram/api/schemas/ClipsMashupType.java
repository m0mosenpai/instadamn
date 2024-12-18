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
public final class ClipsMashupType implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ ClipsMashupType[] A03;
    public static final ClipsMashupType A04;
    public static final ClipsMashupType A05;
    public static final ClipsMashupType A06;
    public static final ClipsMashupType A07;
    public static final ClipsMashupType A08;
    public static final ClipsMashupType A09;
    public static final ClipsMashupType A0A;
    public static final ClipsMashupType A0B;
    public static final ClipsMashupType A0C;
    public static final ClipsMashupType A0D;
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
        ClipsMashupType clipsMashupType = new ClipsMashupType("UNRECOGNIZED", 0, "ClipsMashupType_unspecified");
        A0D = clipsMashupType;
        ClipsMashupType clipsMashupType2 = new ClipsMashupType("GREEN_SCREEN", 1, "green_screen");
        A04 = clipsMashupType2;
        ClipsMashupType clipsMashupType3 = new ClipsMashupType("NOT_MASHUP", 2, "not_mashup");
        A05 = clipsMashupType3;
        ClipsMashupType clipsMashupType4 = new ClipsMashupType("PICTURE_IN_PICTURE", 3, "picture_in_picture");
        A06 = clipsMashupType4;
        ClipsMashupType clipsMashupType5 = new ClipsMashupType("REMIX_COMPOSITION", 4, "remix_composition");
        A07 = clipsMashupType5;
        ClipsMashupType clipsMashupType6 = new ClipsMashupType("REMIX_TEMPLATE", 5, "remix_template");
        A08 = clipsMashupType6;
        ClipsMashupType clipsMashupType7 = new ClipsMashupType("REVERSE_PICTURE_IN_PICTURE", 6, "reverse_picture_in_picture");
        A09 = clipsMashupType7;
        ClipsMashupType clipsMashupType8 = new ClipsMashupType("SEQUENTIAL", 7, "sequential");
        A0A = clipsMashupType8;
        ClipsMashupType clipsMashupType9 = new ClipsMashupType("SIDE_BY_SIDE", 8, "side_by_side");
        A0B = clipsMashupType9;
        ClipsMashupType clipsMashupType10 = new ClipsMashupType("TOP_AND_BOTTOM", 9, "top_and_bottom");
        A0C = clipsMashupType10;
        ClipsMashupType[] clipsMashupTypeArr = {clipsMashupType, clipsMashupType2, clipsMashupType3, clipsMashupType4, clipsMashupType5, clipsMashupType6, clipsMashupType7, clipsMashupType8, clipsMashupType9, clipsMashupType10, new ClipsMashupType("UNKNOWN", 10, "")};
        A03 = clipsMashupTypeArr;
        A02 = AbstractC12190kN.A00(clipsMashupTypeArr);
        ClipsMashupType[] values = values();
        int A0L = AbstractC16850sd.A0L(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L < 16 ? 16 : A0L);
        for (ClipsMashupType clipsMashupType11 : values) {
            linkedHashMap.put(clipsMashupType11.A00, clipsMashupType11);
        }
        A01 = linkedHashMap;
        CREATOR = new C206149Aw(66);
    }

    public static ClipsMashupType valueOf(String str) {
        return (ClipsMashupType) Enum.valueOf(ClipsMashupType.class, str);
    }

    public static ClipsMashupType[] values() {
        return (ClipsMashupType[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public ClipsMashupType(String str, int i, String str2) {
        this.A00 = str2;
    }
}
