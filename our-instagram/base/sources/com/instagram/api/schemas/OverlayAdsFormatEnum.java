package com.instagram.api.schemas;

import X.AbstractC12190kN;
import X.AbstractC167017dG;
import X.AbstractC167027dH;
import X.AbstractC25225BEi;
import X.C41855Ig9;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class OverlayAdsFormatEnum implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ OverlayAdsFormatEnum[] A03;
    public static final OverlayAdsFormatEnum A04;
    public static final OverlayAdsFormatEnum A05;
    public static final OverlayAdsFormatEnum A06;
    public static final OverlayAdsFormatEnum A07;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        OverlayAdsFormatEnum overlayAdsFormatEnum = new OverlayAdsFormatEnum("UNRECOGNIZED", 0, "OverlayAdsFormatEnum_unspecified");
        A07 = overlayAdsFormatEnum;
        OverlayAdsFormatEnum overlayAdsFormatEnum2 = new OverlayAdsFormatEnum("NO_INFO", 1, "no_info");
        A04 = overlayAdsFormatEnum2;
        OverlayAdsFormatEnum overlayAdsFormatEnum3 = new OverlayAdsFormatEnum("ONE_LINE_INFO", 2, "one_line_info");
        A05 = overlayAdsFormatEnum3;
        OverlayAdsFormatEnum overlayAdsFormatEnum4 = new OverlayAdsFormatEnum("THREE_LINE_INFO", 3, "three_line_info");
        A06 = overlayAdsFormatEnum4;
        OverlayAdsFormatEnum[] overlayAdsFormatEnumArr = {overlayAdsFormatEnum, overlayAdsFormatEnum2, overlayAdsFormatEnum3, overlayAdsFormatEnum4, new OverlayAdsFormatEnum("TWO_LINE_INFO", 4, "two_line_info")};
        A03 = overlayAdsFormatEnumArr;
        A02 = AbstractC12190kN.A00(overlayAdsFormatEnumArr);
        OverlayAdsFormatEnum[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (OverlayAdsFormatEnum overlayAdsFormatEnum5 : values) {
            A18.put(overlayAdsFormatEnum5.A00, overlayAdsFormatEnum5);
        }
        A01 = A18;
        CREATOR = C41855Ig9.A00(26);
    }

    public static OverlayAdsFormatEnum valueOf(String str) {
        return (OverlayAdsFormatEnum) Enum.valueOf(OverlayAdsFormatEnum.class, str);
    }

    public static OverlayAdsFormatEnum[] values() {
        return (OverlayAdsFormatEnum[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public OverlayAdsFormatEnum(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
