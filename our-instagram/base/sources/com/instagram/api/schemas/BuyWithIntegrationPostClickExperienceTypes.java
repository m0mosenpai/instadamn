package com.instagram.api.schemas;

import X.AbstractC12190kN;
import X.AbstractC167017dG;
import X.AbstractC167027dH;
import X.AbstractC25225BEi;
import X.C63469Sl9;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class BuyWithIntegrationPostClickExperienceTypes implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ BuyWithIntegrationPostClickExperienceTypes[] A03;
    public static final BuyWithIntegrationPostClickExperienceTypes A04;
    public static final BuyWithIntegrationPostClickExperienceTypes A05;
    public static final BuyWithIntegrationPostClickExperienceTypes A06;
    public static final BuyWithIntegrationPostClickExperienceTypes A07;
    public static final BuyWithIntegrationPostClickExperienceTypes A08;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        BuyWithIntegrationPostClickExperienceTypes buyWithIntegrationPostClickExperienceTypes = new BuyWithIntegrationPostClickExperienceTypes("UNRECOGNIZED", 0, "BuyWithIntegrationPostClickExperienceTypes_unspecified");
        A08 = buyWithIntegrationPostClickExperienceTypes;
        BuyWithIntegrationPostClickExperienceTypes buyWithIntegrationPostClickExperienceTypes2 = new BuyWithIntegrationPostClickExperienceTypes("BWI_STANDARD_IAB", 1, "BWI_STANDARD_IAB");
        A04 = buyWithIntegrationPostClickExperienceTypes2;
        BuyWithIntegrationPostClickExperienceTypes buyWithIntegrationPostClickExperienceTypes3 = new BuyWithIntegrationPostClickExperienceTypes("CUSTOM_IAB_FOR_1P_BWP", 2, "CUSTOM_IAB_FOR_1P_BWP");
        A05 = buyWithIntegrationPostClickExperienceTypes3;
        BuyWithIntegrationPostClickExperienceTypes buyWithIntegrationPostClickExperienceTypes4 = new BuyWithIntegrationPostClickExperienceTypes("CUSTOM_IAB_FOR_DTC_BWP", 3, "CUSTOM_IAB_FOR_DTC_BWP");
        A06 = buyWithIntegrationPostClickExperienceTypes4;
        BuyWithIntegrationPostClickExperienceTypes buyWithIntegrationPostClickExperienceTypes5 = new BuyWithIntegrationPostClickExperienceTypes("STANDARD_IAB", 4, "STANDARD_IAB");
        A07 = buyWithIntegrationPostClickExperienceTypes5;
        BuyWithIntegrationPostClickExperienceTypes[] buyWithIntegrationPostClickExperienceTypesArr = {buyWithIntegrationPostClickExperienceTypes, buyWithIntegrationPostClickExperienceTypes2, buyWithIntegrationPostClickExperienceTypes3, buyWithIntegrationPostClickExperienceTypes4, buyWithIntegrationPostClickExperienceTypes5, new BuyWithIntegrationPostClickExperienceTypes("UNDEFINED", 5, "UNDEFINED")};
        A03 = buyWithIntegrationPostClickExperienceTypesArr;
        A02 = AbstractC12190kN.A00(buyWithIntegrationPostClickExperienceTypesArr);
        BuyWithIntegrationPostClickExperienceTypes[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (BuyWithIntegrationPostClickExperienceTypes buyWithIntegrationPostClickExperienceTypes6 : values) {
            A18.put(buyWithIntegrationPostClickExperienceTypes6.A00, buyWithIntegrationPostClickExperienceTypes6);
        }
        A01 = A18;
        CREATOR = new C63469Sl9(83);
    }

    public static BuyWithIntegrationPostClickExperienceTypes valueOf(String str) {
        return (BuyWithIntegrationPostClickExperienceTypes) Enum.valueOf(BuyWithIntegrationPostClickExperienceTypes.class, str);
    }

    public static BuyWithIntegrationPostClickExperienceTypes[] values() {
        return (BuyWithIntegrationPostClickExperienceTypes[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public BuyWithIntegrationPostClickExperienceTypes(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
