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
/* loaded from: classes9.dex */
public final class CTABarActionType implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ CTABarActionType[] A03;
    public static final CTABarActionType A04;
    public static final CTABarActionType A05;
    public static final CTABarActionType A06;
    public static final CTABarActionType A07;
    public static final CTABarActionType A08;
    public static final CTABarActionType A09;
    public static final CTABarActionType A0A;
    public static final CTABarActionType A0B;
    public static final CTABarActionType A0C;
    public static final CTABarActionType A0D;
    public static final CTABarActionType A0E;
    public static final CTABarActionType A0F;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        CTABarActionType cTABarActionType = new CTABarActionType("UNRECOGNIZED", 0, "CTABarActionType_unspecified");
        A0F = cTABarActionType;
        CTABarActionType cTABarActionType2 = new CTABarActionType("BOOK_APPOINTMENT", 1, "book_appointment");
        A04 = cTABarActionType2;
        CTABarActionType cTABarActionType3 = new CTABarActionType("OPEN_AUDIO_PAGE", 2, "open_audio_page");
        A05 = cTABarActionType3;
        CTABarActionType cTABarActionType4 = new CTABarActionType("OPEN_BOTTOMSHEET", 3, "open_bottomsheet");
        A06 = cTABarActionType4;
        CTABarActionType cTABarActionType5 = new CTABarActionType("OPEN_COLLECTION", 4, "open_collection");
        A07 = cTABarActionType5;
        CTABarActionType cTABarActionType6 = new CTABarActionType("OPEN_DISCOUNT", 5, "open_discount");
        A08 = cTABarActionType6;
        CTABarActionType cTABarActionType7 = new CTABarActionType("OPEN_FUNDRAISER", 6, "open_fundraiser");
        A09 = cTABarActionType7;
        CTABarActionType cTABarActionType8 = new CTABarActionType("OPEN_INSTAGRAM_DIRECT", 7, "open_instagram_direct");
        A0A = cTABarActionType8;
        CTABarActionType cTABarActionType9 = new CTABarActionType("OPEN_PRODUCT_DETAILS_PAGE", 8, "open_product_details_page");
        A0B = cTABarActionType9;
        CTABarActionType cTABarActionType10 = new CTABarActionType("OPEN_STOREFRONT", 9, "open_storefront");
        A0C = cTABarActionType10;
        CTABarActionType cTABarActionType11 = new CTABarActionType("OPEN_UNIFIED_BOTTOMSHEET", 10, "open_unified_bottomsheet");
        A0D = cTABarActionType11;
        CTABarActionType cTABarActionType12 = new CTABarActionType("OPEN_WHATSAPP", 11, "open_whatsapp");
        A0E = cTABarActionType12;
        CTABarActionType[] cTABarActionTypeArr = {cTABarActionType, cTABarActionType2, cTABarActionType3, cTABarActionType4, cTABarActionType5, cTABarActionType6, cTABarActionType7, cTABarActionType8, cTABarActionType9, cTABarActionType10, cTABarActionType11, cTABarActionType12, new CTABarActionType("VIEW_EVENT_DETAILS", 12, "view_event_details")};
        A03 = cTABarActionTypeArr;
        A02 = AbstractC12190kN.A00(cTABarActionTypeArr);
        CTABarActionType[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (CTABarActionType cTABarActionType13 : values) {
            A18.put(cTABarActionType13.A00, cTABarActionType13);
        }
        A01 = A18;
        CREATOR = new C63469Sl9(86);
    }

    public static CTABarActionType valueOf(String str) {
        return (CTABarActionType) Enum.valueOf(CTABarActionType.class, str);
    }

    public static CTABarActionType[] values() {
        return (CTABarActionType[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public CTABarActionType(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
