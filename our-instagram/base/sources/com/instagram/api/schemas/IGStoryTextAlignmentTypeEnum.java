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
public final class IGStoryTextAlignmentTypeEnum implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ IGStoryTextAlignmentTypeEnum[] A03;
    public static final IGStoryTextAlignmentTypeEnum A04;
    public static final IGStoryTextAlignmentTypeEnum A05;
    public static final IGStoryTextAlignmentTypeEnum A06;
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
        IGStoryTextAlignmentTypeEnum iGStoryTextAlignmentTypeEnum = new IGStoryTextAlignmentTypeEnum("UNRECOGNIZED", 0, "IGStoryTextAlignmentTypeEnum_unspecified");
        A06 = iGStoryTextAlignmentTypeEnum;
        IGStoryTextAlignmentTypeEnum iGStoryTextAlignmentTypeEnum2 = new IGStoryTextAlignmentTypeEnum("LEFT", 1, "LEFT");
        A05 = iGStoryTextAlignmentTypeEnum2;
        IGStoryTextAlignmentTypeEnum iGStoryTextAlignmentTypeEnum3 = new IGStoryTextAlignmentTypeEnum("CENTER", 2, "CENTER");
        A04 = iGStoryTextAlignmentTypeEnum3;
        IGStoryTextAlignmentTypeEnum[] iGStoryTextAlignmentTypeEnumArr = {iGStoryTextAlignmentTypeEnum, iGStoryTextAlignmentTypeEnum2, iGStoryTextAlignmentTypeEnum3, new IGStoryTextAlignmentTypeEnum("RIGHT", 3, "RIGHT")};
        A03 = iGStoryTextAlignmentTypeEnumArr;
        A02 = AbstractC12190kN.A00(iGStoryTextAlignmentTypeEnumArr);
        IGStoryTextAlignmentTypeEnum[] values = values();
        int A0L = AbstractC16850sd.A0L(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L < 16 ? 16 : A0L);
        for (IGStoryTextAlignmentTypeEnum iGStoryTextAlignmentTypeEnum4 : values) {
            linkedHashMap.put(iGStoryTextAlignmentTypeEnum4.A00, iGStoryTextAlignmentTypeEnum4);
        }
        A01 = linkedHashMap;
        CREATOR = new C206159Ax(25);
    }

    public static IGStoryTextAlignmentTypeEnum valueOf(String str) {
        return (IGStoryTextAlignmentTypeEnum) Enum.valueOf(IGStoryTextAlignmentTypeEnum.class, str);
    }

    public static IGStoryTextAlignmentTypeEnum[] values() {
        return (IGStoryTextAlignmentTypeEnum[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public IGStoryTextAlignmentTypeEnum(String str, int i, String str2) {
        this.A00 = str2;
    }
}
