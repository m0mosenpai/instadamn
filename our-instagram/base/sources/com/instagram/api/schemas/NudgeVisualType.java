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
/* loaded from: classes4.dex */
public final class NudgeVisualType implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ NudgeVisualType[] A03;
    public static final NudgeVisualType A04;
    public static final NudgeVisualType A05;
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
        NudgeVisualType nudgeVisualType = new NudgeVisualType("UNRECOGNIZED", 0, "NudgeVisualType_unspecified");
        A05 = nudgeVisualType;
        NudgeVisualType nudgeVisualType2 = new NudgeVisualType("POST_LEVEL_PERSISTENT", 1, "post_level_persistent");
        A04 = nudgeVisualType2;
        NudgeVisualType[] nudgeVisualTypeArr = {nudgeVisualType, nudgeVisualType2};
        A03 = nudgeVisualTypeArr;
        A02 = AbstractC12190kN.A00(nudgeVisualTypeArr);
        NudgeVisualType[] values = values();
        int A0L = AbstractC16850sd.A0L(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L < 16 ? 16 : A0L);
        for (NudgeVisualType nudgeVisualType3 : values) {
            linkedHashMap.put(nudgeVisualType3.A00, nudgeVisualType3);
        }
        A01 = linkedHashMap;
        CREATOR = new C206159Ax(67);
    }

    public static NudgeVisualType valueOf(String str) {
        return (NudgeVisualType) Enum.valueOf(NudgeVisualType.class, str);
    }

    public static NudgeVisualType[] values() {
        return (NudgeVisualType[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public NudgeVisualType(String str, int i, String str2) {
        this.A00 = str2;
    }
}
