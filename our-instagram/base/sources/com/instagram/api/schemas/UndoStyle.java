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
public final class UndoStyle implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ UndoStyle[] A03;
    public static final UndoStyle A04;
    public static final UndoStyle A05;
    public static final UndoStyle A06;
    public static final UndoStyle A07;
    public static final UndoStyle A08;
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
        UndoStyle undoStyle = new UndoStyle("UNRECOGNIZED", 0, "UndoStyle_unspecified");
        A08 = undoStyle;
        UndoStyle undoStyle2 = new UndoStyle("BUTTON", 1, "button");
        A04 = undoStyle2;
        UndoStyle undoStyle3 = new UndoStyle("INLINE", 2, "inline");
        A05 = undoStyle3;
        UndoStyle undoStyle4 = new UndoStyle("ROW", 3, "row");
        A06 = undoStyle4;
        UndoStyle undoStyle5 = new UndoStyle("TOP_RIGHT", 4, "top_right");
        A07 = undoStyle5;
        UndoStyle[] undoStyleArr = {undoStyle, undoStyle2, undoStyle3, undoStyle4, undoStyle5};
        A03 = undoStyleArr;
        A02 = AbstractC12190kN.A00(undoStyleArr);
        UndoStyle[] values = values();
        int A0L = AbstractC16850sd.A0L(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L < 16 ? 16 : A0L);
        for (UndoStyle undoStyle6 : values) {
            linkedHashMap.put(undoStyle6.A00, undoStyle6);
        }
        A01 = linkedHashMap;
        CREATOR = new C206139Av(34);
    }

    public static UndoStyle valueOf(String str) {
        return (UndoStyle) Enum.valueOf(UndoStyle.class, str);
    }

    public static UndoStyle[] values() {
        return (UndoStyle[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public UndoStyle(String str, int i, String str2) {
        this.A00 = str2;
    }
}
