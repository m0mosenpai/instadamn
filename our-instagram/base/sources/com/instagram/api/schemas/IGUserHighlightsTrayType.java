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
/* loaded from: classes2.dex */
public final class IGUserHighlightsTrayType implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ IGUserHighlightsTrayType[] A03;
    public static final IGUserHighlightsTrayType A04;
    public static final IGUserHighlightsTrayType A05;
    public static final IGUserHighlightsTrayType A06;
    public static final IGUserHighlightsTrayType A07;
    public static final IGUserHighlightsTrayType A08;
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
        IGUserHighlightsTrayType iGUserHighlightsTrayType = new IGUserHighlightsTrayType("UNRECOGNIZED", 0, "IGUserHighlightsTrayType_unspecified");
        A08 = iGUserHighlightsTrayType;
        IGUserHighlightsTrayType iGUserHighlightsTrayType2 = new IGUserHighlightsTrayType("CARDS", 1, "CARDS");
        A04 = iGUserHighlightsTrayType2;
        IGUserHighlightsTrayType iGUserHighlightsTrayType3 = new IGUserHighlightsTrayType("DEFAULT", 2, "DEFAULT");
        A05 = iGUserHighlightsTrayType3;
        IGUserHighlightsTrayType iGUserHighlightsTrayType4 = new IGUserHighlightsTrayType("POGS", 3, "POGS");
        A06 = iGUserHighlightsTrayType4;
        IGUserHighlightsTrayType iGUserHighlightsTrayType5 = new IGUserHighlightsTrayType("SUBTAB", 4, "SUBTAB");
        A07 = iGUserHighlightsTrayType5;
        IGUserHighlightsTrayType[] iGUserHighlightsTrayTypeArr = {iGUserHighlightsTrayType, iGUserHighlightsTrayType2, iGUserHighlightsTrayType3, iGUserHighlightsTrayType4, iGUserHighlightsTrayType5};
        A03 = iGUserHighlightsTrayTypeArr;
        A02 = AbstractC12190kN.A00(iGUserHighlightsTrayTypeArr);
        IGUserHighlightsTrayType[] values = values();
        int A0L = AbstractC16850sd.A0L(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L < 16 ? 16 : A0L);
        for (IGUserHighlightsTrayType iGUserHighlightsTrayType6 : values) {
            linkedHashMap.put(iGUserHighlightsTrayType6.A00, iGUserHighlightsTrayType6);
        }
        A01 = linkedHashMap;
        CREATOR = new C206159Ax(27);
    }

    public static IGUserHighlightsTrayType valueOf(String str) {
        return (IGUserHighlightsTrayType) Enum.valueOf(IGUserHighlightsTrayType.class, str);
    }

    public static IGUserHighlightsTrayType[] values() {
        return (IGUserHighlightsTrayType[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public IGUserHighlightsTrayType(String str, int i, String str2) {
        this.A00 = str2;
    }
}
