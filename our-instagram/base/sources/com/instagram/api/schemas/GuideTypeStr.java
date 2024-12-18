package com.instagram.api.schemas;

import X.AbstractC12190kN;
import X.AbstractC167017dG;
import X.AbstractC167027dH;
import X.AbstractC25225BEi;
import X.C41858IgC;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.react.uimanager.BaseViewManager;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class GuideTypeStr implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ GuideTypeStr[] A03;
    public static final GuideTypeStr A04;
    public static final GuideTypeStr A05;
    public static final GuideTypeStr A06;
    public static final GuideTypeStr A07;
    public static final GuideTypeStr A08;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        GuideTypeStr guideTypeStr = new GuideTypeStr("UNRECOGNIZED", 0, "GuideTypeStr_unspecified");
        A08 = guideTypeStr;
        GuideTypeStr guideTypeStr2 = new GuideTypeStr("ACCOUNTS", 1, "accounts");
        A04 = guideTypeStr2;
        GuideTypeStr guideTypeStr3 = new GuideTypeStr("LOCATIONS", 2, "locations");
        A05 = guideTypeStr3;
        GuideTypeStr guideTypeStr4 = new GuideTypeStr("MIXED", 3, BaseViewManager.STATE_MIXED);
        A06 = guideTypeStr4;
        GuideTypeStr guideTypeStr5 = new GuideTypeStr("POSTS", 4, "posts");
        A07 = guideTypeStr5;
        GuideTypeStr[] guideTypeStrArr = {guideTypeStr, guideTypeStr2, guideTypeStr3, guideTypeStr4, guideTypeStr5, new GuideTypeStr("PRODUCTS", 5, "products")};
        A03 = guideTypeStrArr;
        A02 = AbstractC12190kN.A00(guideTypeStrArr);
        GuideTypeStr[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (GuideTypeStr guideTypeStr6 : values) {
            A18.put(guideTypeStr6.A00, guideTypeStr6);
        }
        A01 = A18;
        CREATOR = C41858IgC.A00(8);
    }

    public static GuideTypeStr valueOf(String str) {
        return (GuideTypeStr) Enum.valueOf(GuideTypeStr.class, str);
    }

    public static GuideTypeStr[] values() {
        return (GuideTypeStr[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public GuideTypeStr(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
