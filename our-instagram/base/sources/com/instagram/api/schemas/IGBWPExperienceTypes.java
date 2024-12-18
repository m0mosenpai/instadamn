package com.instagram.api.schemas;

import X.AbstractC12190kN;
import X.AbstractC167017dG;
import X.AbstractC167027dH;
import X.AbstractC25225BEi;
import X.C41858IgC;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class IGBWPExperienceTypes implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ IGBWPExperienceTypes[] A03;
    public static final IGBWPExperienceTypes A04;
    public static final IGBWPExperienceTypes A05;
    public static final IGBWPExperienceTypes A06;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        IGBWPExperienceTypes iGBWPExperienceTypes = new IGBWPExperienceTypes("UNRECOGNIZED", 0, "IGBWPExperienceTypes_unspecified");
        A06 = iGBWPExperienceTypes;
        IGBWPExperienceTypes iGBWPExperienceTypes2 = new IGBWPExperienceTypes("CUSTOM_IAB_FOR_1P", 1, "CUSTOM_IAB_FOR_1P");
        A04 = iGBWPExperienceTypes2;
        IGBWPExperienceTypes iGBWPExperienceTypes3 = new IGBWPExperienceTypes("CUSTOM_IAB_FOR_DTC", 2, "CUSTOM_IAB_FOR_DTC");
        A05 = iGBWPExperienceTypes3;
        IGBWPExperienceTypes[] iGBWPExperienceTypesArr = {iGBWPExperienceTypes, iGBWPExperienceTypes2, iGBWPExperienceTypes3, new IGBWPExperienceTypes("STANDARD_IAB", 3, "STANDARD_IAB")};
        A03 = iGBWPExperienceTypesArr;
        A02 = AbstractC12190kN.A00(iGBWPExperienceTypesArr);
        IGBWPExperienceTypes[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (IGBWPExperienceTypes iGBWPExperienceTypes4 : values) {
            A18.put(iGBWPExperienceTypes4.A00, iGBWPExperienceTypes4);
        }
        A01 = A18;
        CREATOR = C41858IgC.A00(24);
    }

    public static IGBWPExperienceTypes valueOf(String str) {
        return (IGBWPExperienceTypes) Enum.valueOf(IGBWPExperienceTypes.class, str);
    }

    public static IGBWPExperienceTypes[] values() {
        return (IGBWPExperienceTypes[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public IGBWPExperienceTypes(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
