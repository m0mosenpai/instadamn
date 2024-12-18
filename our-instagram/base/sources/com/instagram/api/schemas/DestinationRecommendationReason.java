package com.instagram.api.schemas;

import X.AbstractC12190kN;
import X.AbstractC167027dH;
import X.AbstractC37302Gc3;
import X.C41854Ig8;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class DestinationRecommendationReason implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ DestinationRecommendationReason[] A03;
    public static final DestinationRecommendationReason A04;
    public static final DestinationRecommendationReason A05;
    public static final DestinationRecommendationReason A06;
    public static final DestinationRecommendationReason A07;
    public static final DestinationRecommendationReason A08;
    public static final DestinationRecommendationReason A09;
    public static final DestinationRecommendationReason A0A;
    public static final DestinationRecommendationReason A0B;
    public static final DestinationRecommendationReason A0C;
    public static final DestinationRecommendationReason A0D;
    public static final DestinationRecommendationReason A0E;
    public static final DestinationRecommendationReason A0F;
    public static final DestinationRecommendationReason A0G;
    public static final DestinationRecommendationReason A0H;
    public static final DestinationRecommendationReason A0I;
    public static final DestinationRecommendationReason A0J;
    public static final DestinationRecommendationReason A0K;
    public static final DestinationRecommendationReason A0L;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        DestinationRecommendationReason destinationRecommendationReason = new DestinationRecommendationReason("UNRECOGNIZED", 0, "DestinationRecommendationReason_unspecified");
        A0K = destinationRecommendationReason;
        DestinationRecommendationReason destinationRecommendationReason2 = new DestinationRecommendationReason("CTD_HIGH_SPEND_SEGMENT", 1, "ctd_high_spend_segment");
        A04 = destinationRecommendationReason2;
        DestinationRecommendationReason destinationRecommendationReason3 = new DestinationRecommendationReason("CTD_MID_SPEND_SEGMENT", 2, "ctd_mid_spend_segment");
        A05 = destinationRecommendationReason3;
        DestinationRecommendationReason destinationRecommendationReason4 = new DestinationRecommendationReason("CTWA_INTENT_IN_BIOGRAPHY_CAPTION", 3, "ctwa_intent_in_biography_caption");
        A06 = destinationRecommendationReason4;
        DestinationRecommendationReason destinationRecommendationReason5 = new DestinationRecommendationReason("CTWA_INTENT_IN_MEDIA_CAPTION", 4, "ctwa_intent_in_media_caption");
        A07 = destinationRecommendationReason5;
        DestinationRecommendationReason destinationRecommendationReason6 = new DestinationRecommendationReason("CTWA_INTENT_IN_PHOTO_OCR", 5, "ctwa_intent_in_photo_ocr");
        A08 = destinationRecommendationReason6;
        DestinationRecommendationReason destinationRecommendationReason7 = new DestinationRecommendationReason("DIRECT_INBOX_UPSELL_CLICK_THROUGH", 6, "direct_inbox_upsell_click_through");
        A09 = destinationRecommendationReason7;
        DestinationRecommendationReason destinationRecommendationReason8 = new DestinationRecommendationReason("DIRECT_INTENT_IN_PHOTO_OCR", 7, "direct_intent_in_photo_ocr");
        A0A = destinationRecommendationReason8;
        DestinationRecommendationReason destinationRecommendationReason9 = new DestinationRecommendationReason("EMPTY", 8, "empty");
        A0B = destinationRecommendationReason9;
        DestinationRecommendationReason destinationRecommendationReason10 = new DestinationRecommendationReason("EXISTING_CTX_MAA", 9, "existing_ctx_maa");
        A0C = destinationRecommendationReason10;
        DestinationRecommendationReason destinationRecommendationReason11 = new DestinationRecommendationReason("FIRST_TIME_ADVERTISERS_PV", 10, "first_time_advertisers_pv");
        A0D = destinationRecommendationReason11;
        DestinationRecommendationReason destinationRecommendationReason12 = new DestinationRecommendationReason("HIGH_VBTS", 11, "high_vbts");
        A0E = destinationRecommendationReason12;
        DestinationRecommendationReason destinationRecommendationReason13 = new DestinationRecommendationReason("INTENT_IN_BIOGRAPHY", 12, "intent_in_biography");
        A0F = destinationRecommendationReason13;
        DestinationRecommendationReason destinationRecommendationReason14 = new DestinationRecommendationReason("INTENT_IN_MEDIA_CAPTION", 13, "intent_in_media_caption");
        A0G = destinationRecommendationReason14;
        DestinationRecommendationReason destinationRecommendationReason15 = new DestinationRecommendationReason("LESS_THAN_1K_FOLLOWERS_PV", 14, "less_than_1k_followers_pv");
        A0H = destinationRecommendationReason15;
        DestinationRecommendationReason destinationRecommendationReason16 = new DestinationRecommendationReason("MESSAGING_INTENT_BY_MTML", 15, "messaging_intent_by_mtml");
        A0I = destinationRecommendationReason16;
        DestinationRecommendationReason destinationRecommendationReason17 = new DestinationRecommendationReason("MESSGAING_TOOLS_USER", 16, "messaging_tools_user");
        A0J = destinationRecommendationReason17;
        DestinationRecommendationReason destinationRecommendationReason18 = new DestinationRecommendationReason("WHATSAPP_LOGO_INTENT_IN_PHOTO_OCR", 17, "whatsapp_logo_intent_in_photo_ocr");
        A0L = destinationRecommendationReason18;
        DestinationRecommendationReason[] destinationRecommendationReasonArr = {destinationRecommendationReason, destinationRecommendationReason2, destinationRecommendationReason3, destinationRecommendationReason4, destinationRecommendationReason5, destinationRecommendationReason6, destinationRecommendationReason7, destinationRecommendationReason8, destinationRecommendationReason9, destinationRecommendationReason10, destinationRecommendationReason11, destinationRecommendationReason12, destinationRecommendationReason13, destinationRecommendationReason14, destinationRecommendationReason15, destinationRecommendationReason16, destinationRecommendationReason17, destinationRecommendationReason18};
        A03 = destinationRecommendationReasonArr;
        A02 = AbstractC12190kN.A00(destinationRecommendationReasonArr);
        DestinationRecommendationReason[] values = values();
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC37302Gc3.A01(values.length));
        for (DestinationRecommendationReason destinationRecommendationReason19 : values) {
            linkedHashMap.put(destinationRecommendationReason19.A00, destinationRecommendationReason19);
        }
        A01 = linkedHashMap;
        CREATOR = new C41854Ig8(61);
    }

    public static DestinationRecommendationReason valueOf(String str) {
        return (DestinationRecommendationReason) Enum.valueOf(DestinationRecommendationReason.class, str);
    }

    public static DestinationRecommendationReason[] values() {
        return (DestinationRecommendationReason[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public DestinationRecommendationReason(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
