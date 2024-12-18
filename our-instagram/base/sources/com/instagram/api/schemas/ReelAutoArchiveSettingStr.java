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
public final class ReelAutoArchiveSettingStr implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ ReelAutoArchiveSettingStr[] A03;
    public static final ReelAutoArchiveSettingStr A04;
    public static final ReelAutoArchiveSettingStr A05;
    public static final ReelAutoArchiveSettingStr A06;
    public static final ReelAutoArchiveSettingStr A07;
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
        ReelAutoArchiveSettingStr reelAutoArchiveSettingStr = new ReelAutoArchiveSettingStr("UNRECOGNIZED", 0, "ReelAutoArchiveSettingStr_unspecified");
        A06 = reelAutoArchiveSettingStr;
        ReelAutoArchiveSettingStr reelAutoArchiveSettingStr2 = new ReelAutoArchiveSettingStr("OFF", 1, "off");
        A04 = reelAutoArchiveSettingStr2;
        ReelAutoArchiveSettingStr reelAutoArchiveSettingStr3 = new ReelAutoArchiveSettingStr("ON", 2, "on");
        A05 = reelAutoArchiveSettingStr3;
        ReelAutoArchiveSettingStr reelAutoArchiveSettingStr4 = new ReelAutoArchiveSettingStr("UNSET", 3, "unset");
        A07 = reelAutoArchiveSettingStr4;
        ReelAutoArchiveSettingStr[] reelAutoArchiveSettingStrArr = {reelAutoArchiveSettingStr, reelAutoArchiveSettingStr2, reelAutoArchiveSettingStr3, reelAutoArchiveSettingStr4};
        A03 = reelAutoArchiveSettingStrArr;
        A02 = AbstractC12190kN.A00(reelAutoArchiveSettingStrArr);
        ReelAutoArchiveSettingStr[] values = values();
        int A0L = AbstractC16850sd.A0L(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L < 16 ? 16 : A0L);
        for (ReelAutoArchiveSettingStr reelAutoArchiveSettingStr5 : values) {
            linkedHashMap.put(reelAutoArchiveSettingStr5.A00, reelAutoArchiveSettingStr5);
        }
        A01 = linkedHashMap;
        CREATOR = new C206159Ax(98);
    }

    public static ReelAutoArchiveSettingStr valueOf(String str) {
        return (ReelAutoArchiveSettingStr) Enum.valueOf(ReelAutoArchiveSettingStr.class, str);
    }

    public static ReelAutoArchiveSettingStr[] values() {
        return (ReelAutoArchiveSettingStr[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public ReelAutoArchiveSettingStr(String str, int i, String str2) {
        this.A00 = str2;
    }
}
