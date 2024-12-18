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
public final class NoteBackgroundColor implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ NoteBackgroundColor[] A03;
    public static final NoteBackgroundColor A04;
    public static final NoteBackgroundColor A05;
    public static final NoteBackgroundColor A06;
    public static final NoteBackgroundColor A07;
    public static final NoteBackgroundColor A08;
    public static final NoteBackgroundColor A09;
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
        NoteBackgroundColor noteBackgroundColor = new NoteBackgroundColor("UNRECOGNIZED", 0, "NoteBackgroundColor_unspecified");
        A08 = noteBackgroundColor;
        NoteBackgroundColor noteBackgroundColor2 = new NoteBackgroundColor("LAVENDER", 1, "lavender");
        A04 = noteBackgroundColor2;
        NoteBackgroundColor noteBackgroundColor3 = new NoteBackgroundColor("ORANGE", 2, "orange");
        A05 = noteBackgroundColor3;
        NoteBackgroundColor noteBackgroundColor4 = new NoteBackgroundColor("PINK", 3, "pink");
        A06 = noteBackgroundColor4;
        NoteBackgroundColor noteBackgroundColor5 = new NoteBackgroundColor("PURPLE", 4, "purple");
        A07 = noteBackgroundColor5;
        NoteBackgroundColor noteBackgroundColor6 = new NoteBackgroundColor("WHITE", 5, "white");
        A09 = noteBackgroundColor6;
        NoteBackgroundColor[] noteBackgroundColorArr = {noteBackgroundColor, noteBackgroundColor2, noteBackgroundColor3, noteBackgroundColor4, noteBackgroundColor5, noteBackgroundColor6};
        A03 = noteBackgroundColorArr;
        A02 = AbstractC12190kN.A00(noteBackgroundColorArr);
        NoteBackgroundColor[] values = values();
        int A0L = AbstractC16850sd.A0L(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L < 16 ? 16 : A0L);
        for (NoteBackgroundColor noteBackgroundColor7 : values) {
            linkedHashMap.put(noteBackgroundColor7.A00, noteBackgroundColor7);
        }
        A01 = linkedHashMap;
        CREATOR = new C206159Ax(64);
    }

    public static NoteBackgroundColor valueOf(String str) {
        return (NoteBackgroundColor) Enum.valueOf(NoteBackgroundColor.class, str);
    }

    public static NoteBackgroundColor[] values() {
        return (NoteBackgroundColor[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public NoteBackgroundColor(String str, int i, String str2) {
        this.A00 = str2;
    }
}
