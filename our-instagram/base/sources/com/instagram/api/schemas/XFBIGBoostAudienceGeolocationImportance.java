package com.instagram.api.schemas;

import X.AbstractC12190kN;
import X.AbstractC167017dG;
import X.AbstractC167027dH;
import X.AbstractC25225BEi;
import X.C41857IgB;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class XFBIGBoostAudienceGeolocationImportance implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ XFBIGBoostAudienceGeolocationImportance[] A03;
    public static final XFBIGBoostAudienceGeolocationImportance A04;
    public static final XFBIGBoostAudienceGeolocationImportance A05;
    public static final XFBIGBoostAudienceGeolocationImportance A06;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        XFBIGBoostAudienceGeolocationImportance xFBIGBoostAudienceGeolocationImportance = new XFBIGBoostAudienceGeolocationImportance("UNRECOGNIZED", 0, "XFBIGBoostAudienceGeolocationImportance_unspecified");
        A06 = xFBIGBoostAudienceGeolocationImportance;
        XFBIGBoostAudienceGeolocationImportance xFBIGBoostAudienceGeolocationImportance2 = new XFBIGBoostAudienceGeolocationImportance("NOT_IMPORTANT", 1, "NOT_IMPORTANT");
        A04 = xFBIGBoostAudienceGeolocationImportance2;
        XFBIGBoostAudienceGeolocationImportance xFBIGBoostAudienceGeolocationImportance3 = new XFBIGBoostAudienceGeolocationImportance("SOMEWHAT_IMPORTANT", 2, "SOMEWHAT_IMPORTANT");
        A05 = xFBIGBoostAudienceGeolocationImportance3;
        XFBIGBoostAudienceGeolocationImportance[] xFBIGBoostAudienceGeolocationImportanceArr = {xFBIGBoostAudienceGeolocationImportance, xFBIGBoostAudienceGeolocationImportance2, xFBIGBoostAudienceGeolocationImportance3, new XFBIGBoostAudienceGeolocationImportance("VERY_IMPORTANT", 3, "VERY_IMPORTANT")};
        A03 = xFBIGBoostAudienceGeolocationImportanceArr;
        A02 = AbstractC12190kN.A00(xFBIGBoostAudienceGeolocationImportanceArr);
        XFBIGBoostAudienceGeolocationImportance[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (XFBIGBoostAudienceGeolocationImportance xFBIGBoostAudienceGeolocationImportance4 : values) {
            A18.put(xFBIGBoostAudienceGeolocationImportance4.A00, xFBIGBoostAudienceGeolocationImportance4);
        }
        A01 = A18;
        CREATOR = new C41857IgB(97);
    }

    public static XFBIGBoostAudienceGeolocationImportance valueOf(String str) {
        return (XFBIGBoostAudienceGeolocationImportance) Enum.valueOf(XFBIGBoostAudienceGeolocationImportance.class, str);
    }

    public static XFBIGBoostAudienceGeolocationImportance[] values() {
        return (XFBIGBoostAudienceGeolocationImportance[]) A03.clone();
    }

    public XFBIGBoostAudienceGeolocationImportance(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
