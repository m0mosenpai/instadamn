package com.instagram.api.schemas;

import X.AbstractC12190kN;
import X.AbstractC167017dG;
import X.AbstractC167027dH;
import X.C63469Sl9;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class AdproRegulatedCategory implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ AdproRegulatedCategory[] A03;
    public static final AdproRegulatedCategory A04;
    public static final AdproRegulatedCategory A05;
    public static final AdproRegulatedCategory A06;
    public static final AdproRegulatedCategory A07;
    public static final AdproRegulatedCategory A08;
    public static final AdproRegulatedCategory A09;
    public static final AdproRegulatedCategory A0A;
    public static final AdproRegulatedCategory A0B;
    public static final AdproRegulatedCategory A0C;
    public static final AdproRegulatedCategory A0D;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        AdproRegulatedCategory adproRegulatedCategory = new AdproRegulatedCategory("UNRECOGNIZED", 0, "AdproRegulatedCategory_unspecified");
        A0D = adproRegulatedCategory;
        AdproRegulatedCategory adproRegulatedCategory2 = new AdproRegulatedCategory("CREDIT", 1, "CREDIT");
        A04 = adproRegulatedCategory2;
        AdproRegulatedCategory adproRegulatedCategory3 = new AdproRegulatedCategory("EDUCATION", 2, "EDUCATION");
        A05 = adproRegulatedCategory3;
        AdproRegulatedCategory adproRegulatedCategory4 = new AdproRegulatedCategory("ELECTIONS_POLITICS", 3, "ELECTIONS_POLITICS");
        A06 = adproRegulatedCategory4;
        AdproRegulatedCategory adproRegulatedCategory5 = new AdproRegulatedCategory("EMPLOYMENT", 4, "EMPLOYMENT");
        A07 = adproRegulatedCategory5;
        AdproRegulatedCategory adproRegulatedCategory6 = new AdproRegulatedCategory("FINANCIAL_PRODUCTS_SERVICES", 5, "FINANCIAL_PRODUCTS_SERVICES");
        A08 = adproRegulatedCategory6;
        AdproRegulatedCategory adproRegulatedCategory7 = new AdproRegulatedCategory("HOUSING", 6, "HOUSING");
        A09 = adproRegulatedCategory7;
        AdproRegulatedCategory adproRegulatedCategory8 = new AdproRegulatedCategory("ISSUES_ELECTIONS_POLITICS", 7, "ISSUES_ELECTIONS_POLITICS");
        A0A = adproRegulatedCategory8;
        AdproRegulatedCategory adproRegulatedCategory9 = new AdproRegulatedCategory(NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED, 8, NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED);
        A0B = adproRegulatedCategory9;
        AdproRegulatedCategory adproRegulatedCategory10 = new AdproRegulatedCategory("ONLINE_GAMBLING_AND_GAMING", 9, "ONLINE_GAMBLING_AND_GAMING");
        A0C = adproRegulatedCategory10;
        AdproRegulatedCategory[] adproRegulatedCategoryArr = {adproRegulatedCategory, adproRegulatedCategory2, adproRegulatedCategory3, adproRegulatedCategory4, adproRegulatedCategory5, adproRegulatedCategory6, adproRegulatedCategory7, adproRegulatedCategory8, adproRegulatedCategory9, adproRegulatedCategory10, new AdproRegulatedCategory("SOCIAL_ISSUES", 10, "SOCIAL_ISSUES")};
        A03 = adproRegulatedCategoryArr;
        A02 = AbstractC12190kN.A00(adproRegulatedCategoryArr);
        AdproRegulatedCategory[] values = values();
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC167017dG.A01(values.length));
        for (AdproRegulatedCategory adproRegulatedCategory11 : values) {
            linkedHashMap.put(adproRegulatedCategory11.A00, adproRegulatedCategory11);
        }
        A01 = linkedHashMap;
        CREATOR = new C63469Sl9(38);
    }

    public static AdproRegulatedCategory valueOf(String str) {
        return (AdproRegulatedCategory) Enum.valueOf(AdproRegulatedCategory.class, str);
    }

    public static AdproRegulatedCategory[] values() {
        return (AdproRegulatedCategory[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public AdproRegulatedCategory(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
