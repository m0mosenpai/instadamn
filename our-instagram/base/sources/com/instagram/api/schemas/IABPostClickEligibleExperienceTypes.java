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
public final class IABPostClickEligibleExperienceTypes implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ IABPostClickEligibleExperienceTypes[] A03;
    public static final IABPostClickEligibleExperienceTypes A04;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        IABPostClickEligibleExperienceTypes iABPostClickEligibleExperienceTypes = new IABPostClickEligibleExperienceTypes("UNRECOGNIZED", 0, "IABPostClickEligibleExperienceTypes_unspecified");
        A04 = iABPostClickEligibleExperienceTypes;
        IABPostClickEligibleExperienceTypes[] iABPostClickEligibleExperienceTypesArr = {iABPostClickEligibleExperienceTypes, new IABPostClickEligibleExperienceTypes("IAB_BUY_WITH_PRIME", 1, "IAB_BUY_WITH_PRIME")};
        A03 = iABPostClickEligibleExperienceTypesArr;
        A02 = AbstractC12190kN.A00(iABPostClickEligibleExperienceTypesArr);
        IABPostClickEligibleExperienceTypes[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (IABPostClickEligibleExperienceTypes iABPostClickEligibleExperienceTypes2 : values) {
            A18.put(iABPostClickEligibleExperienceTypes2.A00, iABPostClickEligibleExperienceTypes2);
        }
        A01 = A18;
        CREATOR = C41858IgC.A00(11);
    }

    public static IABPostClickEligibleExperienceTypes valueOf(String str) {
        return (IABPostClickEligibleExperienceTypes) Enum.valueOf(IABPostClickEligibleExperienceTypes.class, str);
    }

    public static IABPostClickEligibleExperienceTypes[] values() {
        return (IABPostClickEligibleExperienceTypes[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public IABPostClickEligibleExperienceTypes(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}