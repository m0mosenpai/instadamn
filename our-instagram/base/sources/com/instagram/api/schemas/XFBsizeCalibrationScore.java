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
/* loaded from: classes3.dex */
public final class XFBsizeCalibrationScore implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ XFBsizeCalibrationScore[] A03;
    public static final XFBsizeCalibrationScore A04;
    public static final XFBsizeCalibrationScore A05;
    public static final XFBsizeCalibrationScore A06;
    public static final XFBsizeCalibrationScore A07;
    public static final XFBsizeCalibrationScore A08;
    public static final XFBsizeCalibrationScore A09;
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
        XFBsizeCalibrationScore xFBsizeCalibrationScore = new XFBsizeCalibrationScore("UNRECOGNIZED", 0, "XFBsizeCalibrationScore_unspecified");
        A09 = xFBsizeCalibrationScore;
        XFBsizeCalibrationScore xFBsizeCalibrationScore2 = new XFBsizeCalibrationScore("EMPTY", 1, "EMPTY");
        A04 = xFBsizeCalibrationScore2;
        XFBsizeCalibrationScore xFBsizeCalibrationScore3 = new XFBsizeCalibrationScore("RUNS_LARGE", 2, "RUNS_LARGE");
        A05 = xFBsizeCalibrationScore3;
        XFBsizeCalibrationScore xFBsizeCalibrationScore4 = new XFBsizeCalibrationScore("RUNS_SMALL", 3, "RUNS_SMALL");
        A06 = xFBsizeCalibrationScore4;
        XFBsizeCalibrationScore xFBsizeCalibrationScore5 = new XFBsizeCalibrationScore("RUNS_VERY_LARGE", 4, "RUNS_VERY_LARGE");
        A07 = xFBsizeCalibrationScore5;
        XFBsizeCalibrationScore xFBsizeCalibrationScore6 = new XFBsizeCalibrationScore("RUNS_VERY_SMALL", 5, "RUNS_VERY_SMALL");
        A08 = xFBsizeCalibrationScore6;
        XFBsizeCalibrationScore[] xFBsizeCalibrationScoreArr = {xFBsizeCalibrationScore, xFBsizeCalibrationScore2, xFBsizeCalibrationScore3, xFBsizeCalibrationScore4, xFBsizeCalibrationScore5, xFBsizeCalibrationScore6, new XFBsizeCalibrationScore("TRUE_TO_SIZE", 6, "TRUE_TO_SIZE")};
        A03 = xFBsizeCalibrationScoreArr;
        A02 = AbstractC12190kN.A00(xFBsizeCalibrationScoreArr);
        XFBsizeCalibrationScore[] values = values();
        int A0L = AbstractC16850sd.A0L(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L < 16 ? 16 : A0L);
        for (XFBsizeCalibrationScore xFBsizeCalibrationScore7 : values) {
            linkedHashMap.put(xFBsizeCalibrationScore7.A00, xFBsizeCalibrationScore7);
        }
        A01 = linkedHashMap;
        CREATOR = new C206139Av(41);
    }

    public static XFBsizeCalibrationScore valueOf(String str) {
        return (XFBsizeCalibrationScore) Enum.valueOf(XFBsizeCalibrationScore.class, str);
    }

    public static XFBsizeCalibrationScore[] values() {
        return (XFBsizeCalibrationScore[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public XFBsizeCalibrationScore(String str, int i, String str2) {
        this.A00 = str2;
    }
}
