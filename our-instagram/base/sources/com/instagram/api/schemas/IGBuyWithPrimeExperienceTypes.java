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
public final class IGBuyWithPrimeExperienceTypes implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ IGBuyWithPrimeExperienceTypes[] A03;
    public static final IGBuyWithPrimeExperienceTypes A04;
    public static final IGBuyWithPrimeExperienceTypes A05;
    public static final IGBuyWithPrimeExperienceTypes A06;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        IGBuyWithPrimeExperienceTypes iGBuyWithPrimeExperienceTypes = new IGBuyWithPrimeExperienceTypes("UNRECOGNIZED", 0, "IGBuyWithPrimeExperienceTypes_unspecified");
        A06 = iGBuyWithPrimeExperienceTypes;
        IGBuyWithPrimeExperienceTypes iGBuyWithPrimeExperienceTypes2 = new IGBuyWithPrimeExperienceTypes("CUSTOM_IAB_FOR_1P", 1, "CUSTOM_IAB_FOR_1P");
        A04 = iGBuyWithPrimeExperienceTypes2;
        IGBuyWithPrimeExperienceTypes iGBuyWithPrimeExperienceTypes3 = new IGBuyWithPrimeExperienceTypes("CUSTOM_IAB_FOR_DTC", 2, "CUSTOM_IAB_FOR_DTC");
        A05 = iGBuyWithPrimeExperienceTypes3;
        IGBuyWithPrimeExperienceTypes[] iGBuyWithPrimeExperienceTypesArr = {iGBuyWithPrimeExperienceTypes, iGBuyWithPrimeExperienceTypes2, iGBuyWithPrimeExperienceTypes3, new IGBuyWithPrimeExperienceTypes("STANDARD_IAB", 3, "STANDARD_IAB")};
        A03 = iGBuyWithPrimeExperienceTypesArr;
        A02 = AbstractC12190kN.A00(iGBuyWithPrimeExperienceTypesArr);
        IGBuyWithPrimeExperienceTypes[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (IGBuyWithPrimeExperienceTypes iGBuyWithPrimeExperienceTypes4 : values) {
            A18.put(iGBuyWithPrimeExperienceTypes4.A00, iGBuyWithPrimeExperienceTypes4);
        }
        A01 = A18;
        CREATOR = C41858IgC.A00(26);
    }

    public static IGBuyWithPrimeExperienceTypes valueOf(String str) {
        return (IGBuyWithPrimeExperienceTypes) Enum.valueOf(IGBuyWithPrimeExperienceTypes.class, str);
    }

    public static IGBuyWithPrimeExperienceTypes[] values() {
        return (IGBuyWithPrimeExperienceTypes[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public IGBuyWithPrimeExperienceTypes(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
