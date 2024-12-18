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
/* loaded from: classes.dex */
public final class HighlightReelTypeStr implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ HighlightReelTypeStr[] A03;
    public static final HighlightReelTypeStr A04;
    public static final HighlightReelTypeStr A05;
    public static final HighlightReelTypeStr A06;
    public static final HighlightReelTypeStr A07;
    public static final HighlightReelTypeStr A08;
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
        HighlightReelTypeStr highlightReelTypeStr = new HighlightReelTypeStr("UNRECOGNIZED", 0, "HighlightReelTypeStr_unspecified");
        A08 = highlightReelTypeStr;
        HighlightReelTypeStr highlightReelTypeStr2 = new HighlightReelTypeStr("DEFAULT", 1, "DEFAULT");
        A04 = highlightReelTypeStr2;
        HighlightReelTypeStr highlightReelTypeStr3 = new HighlightReelTypeStr("FAN_CLUB", 2, "FAN_CLUB");
        A05 = highlightReelTypeStr3;
        HighlightReelTypeStr highlightReelTypeStr4 = new HighlightReelTypeStr("FAN_CLUB_WELCOME_FEEDBACK_STORY", 3, "FAN_CLUB_WELCOME_FEEDBACK_STORY");
        A06 = highlightReelTypeStr4;
        HighlightReelTypeStr highlightReelTypeStr5 = new HighlightReelTypeStr("MUSIC", 4, "MUSIC");
        A07 = highlightReelTypeStr5;
        HighlightReelTypeStr[] highlightReelTypeStrArr = {highlightReelTypeStr, highlightReelTypeStr2, highlightReelTypeStr3, highlightReelTypeStr4, highlightReelTypeStr5};
        A03 = highlightReelTypeStrArr;
        A02 = AbstractC12190kN.A00(highlightReelTypeStrArr);
        HighlightReelTypeStr[] values = values();
        int A0L = AbstractC16850sd.A0L(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L < 16 ? 16 : A0L);
        for (HighlightReelTypeStr highlightReelTypeStr6 : values) {
            linkedHashMap.put(highlightReelTypeStr6.A00, highlightReelTypeStr6);
        }
        A01 = linkedHashMap;
        CREATOR = new C206159Ax(0);
    }

    public static HighlightReelTypeStr valueOf(String str) {
        return (HighlightReelTypeStr) Enum.valueOf(HighlightReelTypeStr.class, str);
    }

    public static HighlightReelTypeStr[] values() {
        return (HighlightReelTypeStr[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public HighlightReelTypeStr(String str, int i, String str2) {
        this.A00 = str2;
    }
}
