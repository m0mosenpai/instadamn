package com.instagram.api.schemas;

import X.AbstractC12190kN;
import X.AbstractC167017dG;
import X.AbstractC167027dH;
import X.AbstractC25225BEi;
import X.C41854Ig8;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class DynamicCreativeOptimizationDoFType implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ DynamicCreativeOptimizationDoFType[] A03;
    public static final DynamicCreativeOptimizationDoFType A04;
    public static final DynamicCreativeOptimizationDoFType A05;
    public static final DynamicCreativeOptimizationDoFType A06;
    public static final DynamicCreativeOptimizationDoFType A07;
    public static final DynamicCreativeOptimizationDoFType A08;
    public static final DynamicCreativeOptimizationDoFType A09;
    public static final DynamicCreativeOptimizationDoFType A0A;
    public static final DynamicCreativeOptimizationDoFType A0B;
    public static final DynamicCreativeOptimizationDoFType A0C;
    public static final DynamicCreativeOptimizationDoFType A0D;
    public static final DynamicCreativeOptimizationDoFType A0E;
    public static final DynamicCreativeOptimizationDoFType A0F;
    public static final DynamicCreativeOptimizationDoFType A0G;
    public static final DynamicCreativeOptimizationDoFType A0H;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        DynamicCreativeOptimizationDoFType dynamicCreativeOptimizationDoFType = new DynamicCreativeOptimizationDoFType("UNRECOGNIZED", 0, "DynamicCreativeOptimizationDoFType_unspecified");
        A0B = dynamicCreativeOptimizationDoFType;
        DynamicCreativeOptimizationDoFType dynamicCreativeOptimizationDoFType2 = new DynamicCreativeOptimizationDoFType("DISABLED", 1, "DISABLED");
        A04 = dynamicCreativeOptimizationDoFType2;
        DynamicCreativeOptimizationDoFType dynamicCreativeOptimizationDoFType3 = new DynamicCreativeOptimizationDoFType("FAM_TOGGLE_OFF", 2, "FAM_TOGGLE_OFF");
        A05 = dynamicCreativeOptimizationDoFType3;
        DynamicCreativeOptimizationDoFType dynamicCreativeOptimizationDoFType4 = new DynamicCreativeOptimizationDoFType("FAM_TOGGLE_ON", 3, "FAM_TOGGLE_ON");
        A06 = dynamicCreativeOptimizationDoFType4;
        DynamicCreativeOptimizationDoFType dynamicCreativeOptimizationDoFType5 = new DynamicCreativeOptimizationDoFType("SMART_CROP_ELIGIBLE_OFF", 4, "SMART_CROP_ELIGIBLE_OFF");
        A07 = dynamicCreativeOptimizationDoFType5;
        DynamicCreativeOptimizationDoFType dynamicCreativeOptimizationDoFType6 = new DynamicCreativeOptimizationDoFType("SMART_CROP_ELIGIBLE_ON", 5, "SMART_CROP_ELIGIBLE_ON");
        A08 = dynamicCreativeOptimizationDoFType6;
        DynamicCreativeOptimizationDoFType dynamicCreativeOptimizationDoFType7 = new DynamicCreativeOptimizationDoFType("SMART_CROP_INELIGIBLE_OFF", 6, "SMART_CROP_INELIGIBLE_OFF");
        A09 = dynamicCreativeOptimizationDoFType7;
        DynamicCreativeOptimizationDoFType dynamicCreativeOptimizationDoFType8 = new DynamicCreativeOptimizationDoFType("SMART_CROP_INELIGIBLE_ON", 7, "SMART_CROP_INELIGIBLE_ON");
        A0A = dynamicCreativeOptimizationDoFType8;
        DynamicCreativeOptimizationDoFType dynamicCreativeOptimizationDoFType9 = new DynamicCreativeOptimizationDoFType("USER_ENROLLED", 8, "USER_ENROLLED");
        A0C = dynamicCreativeOptimizationDoFType9;
        DynamicCreativeOptimizationDoFType dynamicCreativeOptimizationDoFType10 = new DynamicCreativeOptimizationDoFType("USER_ENROLLED_AUTOFLOW", 9, "USER_ENROLLED_AUTOFLOW");
        A0D = dynamicCreativeOptimizationDoFType10;
        DynamicCreativeOptimizationDoFType dynamicCreativeOptimizationDoFType11 = new DynamicCreativeOptimizationDoFType("USER_ENROLLED_IMAGE_CROPPING_NON_DCO", 10, "USER_ENROLLED_IMAGE_CROPPING_NON_DCO");
        A0E = dynamicCreativeOptimizationDoFType11;
        DynamicCreativeOptimizationDoFType dynamicCreativeOptimizationDoFType12 = new DynamicCreativeOptimizationDoFType("USER_ENROLLED_LWI_ACO", 11, "USER_ENROLLED_LWI_ACO");
        A0F = dynamicCreativeOptimizationDoFType12;
        DynamicCreativeOptimizationDoFType dynamicCreativeOptimizationDoFType13 = new DynamicCreativeOptimizationDoFType("USER_ENROLLED_NON_DCO", 12, "USER_ENROLLED_NON_DCO");
        A0G = dynamicCreativeOptimizationDoFType13;
        DynamicCreativeOptimizationDoFType dynamicCreativeOptimizationDoFType14 = new DynamicCreativeOptimizationDoFType("VCK_MIXED_FORMAT", 13, "VCK_MIXED_FORMAT");
        A0H = dynamicCreativeOptimizationDoFType14;
        DynamicCreativeOptimizationDoFType[] dynamicCreativeOptimizationDoFTypeArr = {dynamicCreativeOptimizationDoFType, dynamicCreativeOptimizationDoFType2, dynamicCreativeOptimizationDoFType3, dynamicCreativeOptimizationDoFType4, dynamicCreativeOptimizationDoFType5, dynamicCreativeOptimizationDoFType6, dynamicCreativeOptimizationDoFType7, dynamicCreativeOptimizationDoFType8, dynamicCreativeOptimizationDoFType9, dynamicCreativeOptimizationDoFType10, dynamicCreativeOptimizationDoFType11, dynamicCreativeOptimizationDoFType12, dynamicCreativeOptimizationDoFType13, dynamicCreativeOptimizationDoFType14, new DynamicCreativeOptimizationDoFType("VIDEO_TEMPLATES", 14, "VIDEO_TEMPLATES")};
        A03 = dynamicCreativeOptimizationDoFTypeArr;
        A02 = AbstractC12190kN.A00(dynamicCreativeOptimizationDoFTypeArr);
        DynamicCreativeOptimizationDoFType[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (DynamicCreativeOptimizationDoFType dynamicCreativeOptimizationDoFType15 : values) {
            A18.put(dynamicCreativeOptimizationDoFType15.A00, dynamicCreativeOptimizationDoFType15);
        }
        A01 = A18;
        CREATOR = C41854Ig8.A00(64);
    }

    public static DynamicCreativeOptimizationDoFType valueOf(String str) {
        return (DynamicCreativeOptimizationDoFType) Enum.valueOf(DynamicCreativeOptimizationDoFType.class, str);
    }

    public static DynamicCreativeOptimizationDoFType[] values() {
        return (DynamicCreativeOptimizationDoFType[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public DynamicCreativeOptimizationDoFType(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
