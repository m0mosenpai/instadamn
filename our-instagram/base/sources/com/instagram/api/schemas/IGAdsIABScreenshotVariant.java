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
public final class IGAdsIABScreenshotVariant implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ IGAdsIABScreenshotVariant[] A03;
    public static final IGAdsIABScreenshotVariant A04;
    public static final IGAdsIABScreenshotVariant A05;
    public static final IGAdsIABScreenshotVariant A06;
    public static final IGAdsIABScreenshotVariant A07;
    public static final IGAdsIABScreenshotVariant A08;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        IGAdsIABScreenshotVariant iGAdsIABScreenshotVariant = new IGAdsIABScreenshotVariant("UNRECOGNIZED", 0, "IGAdsIABScreenshotVariant_unspecified");
        A08 = iGAdsIABScreenshotVariant;
        IGAdsIABScreenshotVariant iGAdsIABScreenshotVariant2 = new IGAdsIABScreenshotVariant("NO_EFFECT", 1, "NO_EFFECT");
        A04 = iGAdsIABScreenshotVariant2;
        IGAdsIABScreenshotVariant iGAdsIABScreenshotVariant3 = new IGAdsIABScreenshotVariant("SHOW_BLUR", 2, "SHOW_BLUR");
        A05 = iGAdsIABScreenshotVariant3;
        IGAdsIABScreenshotVariant iGAdsIABScreenshotVariant4 = new IGAdsIABScreenshotVariant("SHOW_BRIGHTNESS", 3, "SHOW_BRIGHTNESS");
        A06 = iGAdsIABScreenshotVariant4;
        IGAdsIABScreenshotVariant iGAdsIABScreenshotVariant5 = new IGAdsIABScreenshotVariant("SHOW_OPACITY", 4, "SHOW_OPACITY");
        A07 = iGAdsIABScreenshotVariant5;
        IGAdsIABScreenshotVariant[] iGAdsIABScreenshotVariantArr = {iGAdsIABScreenshotVariant, iGAdsIABScreenshotVariant2, iGAdsIABScreenshotVariant3, iGAdsIABScreenshotVariant4, iGAdsIABScreenshotVariant5, new IGAdsIABScreenshotVariant("SHOW_SATURATION", 5, "SHOW_SATURATION")};
        A03 = iGAdsIABScreenshotVariantArr;
        A02 = AbstractC12190kN.A00(iGAdsIABScreenshotVariantArr);
        IGAdsIABScreenshotVariant[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (IGAdsIABScreenshotVariant iGAdsIABScreenshotVariant6 : values) {
            A18.put(iGAdsIABScreenshotVariant6.A00, iGAdsIABScreenshotVariant6);
        }
        A01 = A18;
        CREATOR = C41858IgC.A00(21);
    }

    public static IGAdsIABScreenshotVariant valueOf(String str) {
        return (IGAdsIABScreenshotVariant) Enum.valueOf(IGAdsIABScreenshotVariant.class, str);
    }

    public static IGAdsIABScreenshotVariant[] values() {
        return (IGAdsIABScreenshotVariant[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public IGAdsIABScreenshotVariant(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
