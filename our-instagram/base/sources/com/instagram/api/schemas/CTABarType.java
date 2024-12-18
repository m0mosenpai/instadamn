package com.instagram.api.schemas;

import X.AbstractC12190kN;
import X.AbstractC167017dG;
import X.AbstractC167027dH;
import X.AbstractC25225BEi;
import X.C63469Sl9;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class CTABarType implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ CTABarType[] A03;
    public static final CTABarType A04;
    public static final CTABarType A05;
    public static final CTABarType A06;
    public static final CTABarType A07;
    public static final CTABarType A08;
    public static final CTABarType A09;
    public static final CTABarType A0A;
    public static final CTABarType A0B;
    public static final CTABarType A0C;
    public static final CTABarType A0D;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        CTABarType cTABarType = new CTABarType("UNRECOGNIZED", 0, "CTABarType_unspecified");
        A0D = cTABarType;
        CTABarType cTABarType2 = new CTABarType("COLLECTION_DROP_EVENT", 1, "cta_bar_collection_drop_event");
        A05 = cTABarType2;
        CTABarType cTABarType3 = new CTABarType("COLLECTIONS", 2, "cta_bar_collections");
        A04 = cTABarType3;
        CTABarType cTABarType4 = new CTABarType("DISCOUNTS", 3, "cta_bar_discounts");
        A06 = cTABarType4;
        CTABarType cTABarType5 = new CTABarType("FUNDRAISERS", 4, "cta_bar_fundraisers");
        A07 = cTABarType5;
        CTABarType cTABarType6 = new CTABarType("GENERAL_EVENT", 5, "cta_bar_general_event");
        A08 = cTABarType6;
        CTABarType cTABarType7 = new CTABarType("LIVE_EVENT", 6, "cta_bar_live_event");
        A09 = cTABarType7;
        CTABarType cTABarType8 = new CTABarType("MUSIC_EVENT", 7, "cta_bar_music_event");
        A0A = cTABarType8;
        CTABarType cTABarType9 = new CTABarType("PROFESSIONAL_ORGANIC_CTA", 8, "cta_bar_organic");
        A0C = cTABarType9;
        CTABarType cTABarType10 = new CTABarType("PRODUCT_DROP_EVENT", 9, "cta_bar_product_drop_event");
        A0B = cTABarType10;
        CTABarType[] cTABarTypeArr = {cTABarType, cTABarType2, cTABarType3, cTABarType4, cTABarType5, cTABarType6, cTABarType7, cTABarType8, cTABarType9, cTABarType10, new CTABarType("VIEW_SHOP", 10, "cta_bar_shop_now")};
        A03 = cTABarTypeArr;
        A02 = AbstractC12190kN.A00(cTABarTypeArr);
        CTABarType[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (CTABarType cTABarType11 : values) {
            A18.put(cTABarType11.A00, cTABarType11);
        }
        A01 = A18;
        CREATOR = new C63469Sl9(88);
    }

    public static CTABarType valueOf(String str) {
        return (CTABarType) Enum.valueOf(CTABarType.class, str);
    }

    public static CTABarType[] values() {
        return (CTABarType[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public CTABarType(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
