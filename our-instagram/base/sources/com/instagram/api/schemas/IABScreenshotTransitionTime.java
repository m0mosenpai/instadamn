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
public final class IABScreenshotTransitionTime implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ IABScreenshotTransitionTime[] A03;
    public static final IABScreenshotTransitionTime A04;
    public static final IABScreenshotTransitionTime A05;
    public static final IABScreenshotTransitionTime A06;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        IABScreenshotTransitionTime iABScreenshotTransitionTime = new IABScreenshotTransitionTime("UNRECOGNIZED", 0, "IABScreenshotTransitionTime_unspecified");
        A06 = iABScreenshotTransitionTime;
        IABScreenshotTransitionTime iABScreenshotTransitionTime2 = new IABScreenshotTransitionTime("NO_AUTO_TRANSITION", 1, "NO_AUTO_TRANSITION");
        A04 = iABScreenshotTransitionTime2;
        IABScreenshotTransitionTime iABScreenshotTransitionTime3 = new IABScreenshotTransitionTime("ON_PAGE_FULLY_LOADED", 2, "ON_PAGE_FULLY_LOADED");
        A05 = iABScreenshotTransitionTime3;
        IABScreenshotTransitionTime[] iABScreenshotTransitionTimeArr = {iABScreenshotTransitionTime, iABScreenshotTransitionTime2, iABScreenshotTransitionTime3, new IABScreenshotTransitionTime("ON_PAGE_INTERACTIVE", 3, "ON_PAGE_INTERACTIVE")};
        A03 = iABScreenshotTransitionTimeArr;
        A02 = AbstractC12190kN.A00(iABScreenshotTransitionTimeArr);
        IABScreenshotTransitionTime[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (IABScreenshotTransitionTime iABScreenshotTransitionTime4 : values) {
            A18.put(iABScreenshotTransitionTime4.A00, iABScreenshotTransitionTime4);
        }
        A01 = A18;
        CREATOR = C41858IgC.A00(13);
    }

    public static IABScreenshotTransitionTime valueOf(String str) {
        return (IABScreenshotTransitionTime) Enum.valueOf(IABScreenshotTransitionTime.class, str);
    }

    public static IABScreenshotTransitionTime[] values() {
        return (IABScreenshotTransitionTime[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public IABScreenshotTransitionTime(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
