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
public final class IGPostClickEligibleExperienceTypes implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ IGPostClickEligibleExperienceTypes[] A03;
    public static final IGPostClickEligibleExperienceTypes A04;
    public static final IGPostClickEligibleExperienceTypes A05;
    public static final IGPostClickEligibleExperienceTypes A06;
    public static final IGPostClickEligibleExperienceTypes A07;
    public static final IGPostClickEligibleExperienceTypes A08;
    public static final IGPostClickEligibleExperienceTypes A09;
    public static final IGPostClickEligibleExperienceTypes A0A;
    public static final IGPostClickEligibleExperienceTypes A0B;
    public static final IGPostClickEligibleExperienceTypes A0C;
    public static final IGPostClickEligibleExperienceTypes A0D;
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
        IGPostClickEligibleExperienceTypes iGPostClickEligibleExperienceTypes = new IGPostClickEligibleExperienceTypes("UNRECOGNIZED", 0, "IGPostClickEligibleExperienceTypes_unspecified");
        A0D = iGPostClickEligibleExperienceTypes;
        IGPostClickEligibleExperienceTypes iGPostClickEligibleExperienceTypes2 = new IGPostClickEligibleExperienceTypes("IAB_APP_PROMOTION_WEB_TO_APP", 1, "IAB_APP_PROMOTION_WEB_TO_APP");
        A04 = iGPostClickEligibleExperienceTypes2;
        IGPostClickEligibleExperienceTypes iGPostClickEligibleExperienceTypes3 = new IGPostClickEligibleExperienceTypes("IAB_AUTOFILL_ADS_PERSONALIZATION", 2, "IAB_AUTOFILL_ADS_PERSONALIZATION");
        A05 = iGPostClickEligibleExperienceTypes3;
        IGPostClickEligibleExperienceTypes iGPostClickEligibleExperienceTypes4 = new IGPostClickEligibleExperienceTypes("IAB_BUY_WITH_INTEGRATION", 3, "IAB_BUY_WITH_INTEGRATION");
        A06 = iGPostClickEligibleExperienceTypes4;
        IGPostClickEligibleExperienceTypes iGPostClickEligibleExperienceTypes5 = new IGPostClickEligibleExperienceTypes("IAB_BUY_WITH_PRIME", 4, "IAB_BUY_WITH_PRIME");
        A07 = iGPostClickEligibleExperienceTypes5;
        IGPostClickEligibleExperienceTypes iGPostClickEligibleExperienceTypes6 = new IGPostClickEligibleExperienceTypes("IAB_META_CHECKOUT_FIRMLY", 5, "IAB_META_CHECKOUT_FIRMLY");
        A08 = iGPostClickEligibleExperienceTypes6;
        IGPostClickEligibleExperienceTypes iGPostClickEligibleExperienceTypes7 = new IGPostClickEligibleExperienceTypes("IAB_META_CHECKOUT_METAPAYMENTS_SDK", 6, "IAB_META_CHECKOUT_METAPAYMENTS_SDK");
        A09 = iGPostClickEligibleExperienceTypes7;
        IGPostClickEligibleExperienceTypes iGPostClickEligibleExperienceTypes8 = new IGPostClickEligibleExperienceTypes("IAB_META_CHECKOUT_SHOPIFY_SCA", 7, "IAB_META_CHECKOUT_SHOPIFY_SCA");
        A0A = iGPostClickEligibleExperienceTypes8;
        IGPostClickEligibleExperienceTypes iGPostClickEligibleExperienceTypes9 = new IGPostClickEligibleExperienceTypes("IAB_META_CHECKOUT_SHOPIFY_SDK", 8, "IAB_META_CHECKOUT_SHOPIFY_SDK");
        A0B = iGPostClickEligibleExperienceTypes9;
        IGPostClickEligibleExperienceTypes iGPostClickEligibleExperienceTypes10 = new IGPostClickEligibleExperienceTypes("IAB_PROMO_ADS_AUTOFILL", 9, "IAB_PROMO_ADS_AUTOFILL");
        A0C = iGPostClickEligibleExperienceTypes10;
        IGPostClickEligibleExperienceTypes[] iGPostClickEligibleExperienceTypesArr = {iGPostClickEligibleExperienceTypes, iGPostClickEligibleExperienceTypes2, iGPostClickEligibleExperienceTypes3, iGPostClickEligibleExperienceTypes4, iGPostClickEligibleExperienceTypes5, iGPostClickEligibleExperienceTypes6, iGPostClickEligibleExperienceTypes7, iGPostClickEligibleExperienceTypes8, iGPostClickEligibleExperienceTypes9, iGPostClickEligibleExperienceTypes10, new IGPostClickEligibleExperienceTypes("IAB_STICKY_UTM_PARAMS", 10, "IAB_STICKY_UTM_PARAMS")};
        A03 = iGPostClickEligibleExperienceTypesArr;
        A02 = AbstractC12190kN.A00(iGPostClickEligibleExperienceTypesArr);
        IGPostClickEligibleExperienceTypes[] values = values();
        int A0L = AbstractC16850sd.A0L(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L < 16 ? 16 : A0L);
        for (IGPostClickEligibleExperienceTypes iGPostClickEligibleExperienceTypes11 : values) {
            linkedHashMap.put(iGPostClickEligibleExperienceTypes11.A00, iGPostClickEligibleExperienceTypes11);
        }
        A01 = linkedHashMap;
        CREATOR = new C206159Ax(23);
    }

    public static IGPostClickEligibleExperienceTypes valueOf(String str) {
        return (IGPostClickEligibleExperienceTypes) Enum.valueOf(IGPostClickEligibleExperienceTypes.class, str);
    }

    public static IGPostClickEligibleExperienceTypes[] values() {
        return (IGPostClickEligibleExperienceTypes[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public IGPostClickEligibleExperienceTypes(String str, int i, String str2) {
        this.A00 = str2;
    }
}
