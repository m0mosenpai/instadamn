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
public final class OverlayAdsTextStyleEnum implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ OverlayAdsTextStyleEnum[] A03;
    public static final OverlayAdsTextStyleEnum A04;
    public static final OverlayAdsTextStyleEnum A05;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        OverlayAdsTextStyleEnum overlayAdsTextStyleEnum = new OverlayAdsTextStyleEnum("UNRECOGNIZED", 0, "OverlayAdsTextStyleEnum_unspecified");
        A05 = overlayAdsTextStyleEnum;
        OverlayAdsTextStyleEnum overlayAdsTextStyleEnum2 = new OverlayAdsTextStyleEnum("BOLD", 1, "bold");
        A04 = overlayAdsTextStyleEnum2;
        OverlayAdsTextStyleEnum[] overlayAdsTextStyleEnumArr = {overlayAdsTextStyleEnum, overlayAdsTextStyleEnum2, new OverlayAdsTextStyleEnum("NORMAL", 2, "normal")};
        A03 = overlayAdsTextStyleEnumArr;
        A02 = AbstractC12190kN.A00(overlayAdsTextStyleEnumArr);
        OverlayAdsTextStyleEnum[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (OverlayAdsTextStyleEnum overlayAdsTextStyleEnum3 : values) {
            A18.put(overlayAdsTextStyleEnum3.A00, overlayAdsTextStyleEnum3);
        }
        A01 = A18;
        CREATOR = C41855Ig9.A00(27);
    }

    public static OverlayAdsTextStyleEnum valueOf(String str) {
        return (OverlayAdsTextStyleEnum) Enum.valueOf(OverlayAdsTextStyleEnum.class, str);
    }

    public static OverlayAdsTextStyleEnum[] values() {
        return (OverlayAdsTextStyleEnum[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public OverlayAdsTextStyleEnum(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}