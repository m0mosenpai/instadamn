package com.instagram.api.schemas;

import X.AbstractC12190kN;
import X.AbstractC167017dG;
import X.AbstractC167027dH;
import X.C41857IgB;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class XFBAdproRegionalRegulatedCategory implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ XFBAdproRegionalRegulatedCategory[] A03;
    public static final XFBAdproRegionalRegulatedCategory A04;
    public static final XFBAdproRegionalRegulatedCategory A05;
    public static final XFBAdproRegionalRegulatedCategory A06;
    public static final XFBAdproRegionalRegulatedCategory A07;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        XFBAdproRegionalRegulatedCategory xFBAdproRegionalRegulatedCategory = new XFBAdproRegionalRegulatedCategory("UNRECOGNIZED", 0, "XFBAdproRegionalRegulatedCategory_unspecified");
        A07 = xFBAdproRegionalRegulatedCategory;
        XFBAdproRegionalRegulatedCategory xFBAdproRegionalRegulatedCategory2 = new XFBAdproRegionalRegulatedCategory("AUSTRALIA_FINSERV", 1, "AUSTRALIA_FINSERV");
        A04 = xFBAdproRegionalRegulatedCategory2;
        XFBAdproRegionalRegulatedCategory xFBAdproRegionalRegulatedCategory3 = new XFBAdproRegionalRegulatedCategory(NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED, 2, NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED);
        A05 = xFBAdproRegionalRegulatedCategory3;
        XFBAdproRegionalRegulatedCategory xFBAdproRegionalRegulatedCategory4 = new XFBAdproRegionalRegulatedCategory("TAIWAN_FINSERV", 3, "TAIWAN_FINSERV");
        A06 = xFBAdproRegionalRegulatedCategory4;
        XFBAdproRegionalRegulatedCategory[] xFBAdproRegionalRegulatedCategoryArr = {xFBAdproRegionalRegulatedCategory, xFBAdproRegionalRegulatedCategory2, xFBAdproRegionalRegulatedCategory3, xFBAdproRegionalRegulatedCategory4};
        A03 = xFBAdproRegionalRegulatedCategoryArr;
        A02 = AbstractC12190kN.A00(xFBAdproRegionalRegulatedCategoryArr);
        XFBAdproRegionalRegulatedCategory[] values = values();
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC167017dG.A01(values.length));
        for (XFBAdproRegionalRegulatedCategory xFBAdproRegionalRegulatedCategory5 : values) {
            linkedHashMap.put(xFBAdproRegionalRegulatedCategory5.A00, xFBAdproRegionalRegulatedCategory5);
        }
        A01 = linkedHashMap;
        CREATOR = new C41857IgB(93);
    }

    public static XFBAdproRegionalRegulatedCategory valueOf(String str) {
        return (XFBAdproRegionalRegulatedCategory) Enum.valueOf(XFBAdproRegionalRegulatedCategory.class, str);
    }

    public static XFBAdproRegionalRegulatedCategory[] values() {
        return (XFBAdproRegionalRegulatedCategory[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public XFBAdproRegionalRegulatedCategory(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
