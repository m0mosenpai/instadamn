package com.instagram.api.schemas;

import X.AbstractC12190kN;
import X.AbstractC16850sd;
import X.C14360o3;
import X.C41857IgB;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class TIXUDesignTypeEnum implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ TIXUDesignTypeEnum[] A03;
    public static final TIXUDesignTypeEnum A04;
    public static final TIXUDesignTypeEnum A05;
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
        TIXUDesignTypeEnum tIXUDesignTypeEnum = new TIXUDesignTypeEnum("UNRECOGNIZED", 0, "TIXUDesignTypeEnum_unspecified");
        A05 = tIXUDesignTypeEnum;
        TIXUDesignTypeEnum tIXUDesignTypeEnum2 = new TIXUDesignTypeEnum("BETTER_MEDIA", 1, "better_media");
        A04 = tIXUDesignTypeEnum2;
        TIXUDesignTypeEnum[] tIXUDesignTypeEnumArr = {tIXUDesignTypeEnum, tIXUDesignTypeEnum2, new TIXUDesignTypeEnum("CONDENSED", 2, "condensed")};
        A03 = tIXUDesignTypeEnumArr;
        A02 = AbstractC12190kN.A00(tIXUDesignTypeEnumArr);
        TIXUDesignTypeEnum[] values = values();
        int A0L = AbstractC16850sd.A0L(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L < 16 ? 16 : A0L);
        for (TIXUDesignTypeEnum tIXUDesignTypeEnum3 : values) {
            linkedHashMap.put(tIXUDesignTypeEnum3.A00, tIXUDesignTypeEnum3);
        }
        A01 = linkedHashMap;
        CREATOR = new C41857IgB(40);
    }

    public static TIXUDesignTypeEnum valueOf(String str) {
        return (TIXUDesignTypeEnum) Enum.valueOf(TIXUDesignTypeEnum.class, str);
    }

    public static TIXUDesignTypeEnum[] values() {
        return (TIXUDesignTypeEnum[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public TIXUDesignTypeEnum(String str, int i, String str2) {
        this.A00 = str2;
    }
}
