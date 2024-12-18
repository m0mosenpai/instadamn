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
public final class DynamicProductAdDisplayOption implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ DynamicProductAdDisplayOption[] A03;
    public static final DynamicProductAdDisplayOption A04;
    public static final DynamicProductAdDisplayOption A05;
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
        DynamicProductAdDisplayOption dynamicProductAdDisplayOption = new DynamicProductAdDisplayOption("UNRECOGNIZED", 0, "DynamicProductAdDisplayOption_unspecified");
        A05 = dynamicProductAdDisplayOption;
        DynamicProductAdDisplayOption dynamicProductAdDisplayOption2 = new DynamicProductAdDisplayOption("BACKGROUND_CROPPING", 1, "BACKGROUND_CROPPING");
        A04 = dynamicProductAdDisplayOption2;
        DynamicProductAdDisplayOption[] dynamicProductAdDisplayOptionArr = {dynamicProductAdDisplayOption, dynamicProductAdDisplayOption2, new DynamicProductAdDisplayOption("BACKGROUND_PADDING", 2, "BACKGROUND_PADDING")};
        A03 = dynamicProductAdDisplayOptionArr;
        A02 = AbstractC12190kN.A00(dynamicProductAdDisplayOptionArr);
        DynamicProductAdDisplayOption[] values = values();
        int A0L = AbstractC16850sd.A0L(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L < 16 ? 16 : A0L);
        for (DynamicProductAdDisplayOption dynamicProductAdDisplayOption3 : values) {
            linkedHashMap.put(dynamicProductAdDisplayOption3.A00, dynamicProductAdDisplayOption3);
        }
        A01 = linkedHashMap;
        CREATOR = new C206149Aw(87);
    }

    public static DynamicProductAdDisplayOption valueOf(String str) {
        return (DynamicProductAdDisplayOption) Enum.valueOf(DynamicProductAdDisplayOption.class, str);
    }

    public static DynamicProductAdDisplayOption[] values() {
        return (DynamicProductAdDisplayOption[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public DynamicProductAdDisplayOption(String str, int i, String str2) {
        this.A00 = str2;
    }
}
