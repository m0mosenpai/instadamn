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
public final class OverlayAdTapDestinationEnum implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ OverlayAdTapDestinationEnum[] A03;
    public static final OverlayAdTapDestinationEnum A04;
    public static final OverlayAdTapDestinationEnum A05;
    public static final OverlayAdTapDestinationEnum A06;
    public static final OverlayAdTapDestinationEnum A07;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        OverlayAdTapDestinationEnum overlayAdTapDestinationEnum = new OverlayAdTapDestinationEnum("UNRECOGNIZED", 0, "OverlayAdTapDestinationEnum_unspecified");
        A06 = overlayAdTapDestinationEnum;
        OverlayAdTapDestinationEnum overlayAdTapDestinationEnum2 = new OverlayAdTapDestinationEnum("CTA_DESTINATION", 1, "cta_destination");
        A04 = overlayAdTapDestinationEnum2;
        OverlayAdTapDestinationEnum overlayAdTapDestinationEnum3 = new OverlayAdTapDestinationEnum("ENLARGED_VIEWER", 2, "enlarged_viewer");
        A05 = overlayAdTapDestinationEnum3;
        OverlayAdTapDestinationEnum overlayAdTapDestinationEnum4 = new OverlayAdTapDestinationEnum("WATCH_AND_BROWSE", 3, "watch_and_browse");
        A07 = overlayAdTapDestinationEnum4;
        OverlayAdTapDestinationEnum[] overlayAdTapDestinationEnumArr = {overlayAdTapDestinationEnum, overlayAdTapDestinationEnum2, overlayAdTapDestinationEnum3, overlayAdTapDestinationEnum4};
        A03 = overlayAdTapDestinationEnumArr;
        A02 = AbstractC12190kN.A00(overlayAdTapDestinationEnumArr);
        OverlayAdTapDestinationEnum[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (OverlayAdTapDestinationEnum overlayAdTapDestinationEnum5 : values) {
            A18.put(overlayAdTapDestinationEnum5.A00, overlayAdTapDestinationEnum5);
        }
        A01 = A18;
        CREATOR = C41855Ig9.A00(25);
    }

    public static OverlayAdTapDestinationEnum valueOf(String str) {
        return (OverlayAdTapDestinationEnum) Enum.valueOf(OverlayAdTapDestinationEnum.class, str);
    }

    public static OverlayAdTapDestinationEnum[] values() {
        return (OverlayAdTapDestinationEnum[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public OverlayAdTapDestinationEnum(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
