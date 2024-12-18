package com.instagram.api.schemas;

import X.AbstractC12190kN;
import X.AbstractC167027dH;
import X.AbstractC25225BEi;
import X.AbstractC37302Gc3;
import X.C41857IgB;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebookpay.offsite.models.message.PriceTableAnnotation$Companion;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class StoryAdKeywordTypeEnum implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ StoryAdKeywordTypeEnum[] A03;
    public static final StoryAdKeywordTypeEnum A04;
    public static final StoryAdKeywordTypeEnum A05;
    public static final StoryAdKeywordTypeEnum A06;
    public static final StoryAdKeywordTypeEnum A07;
    public static final StoryAdKeywordTypeEnum A08;
    public static final StoryAdKeywordTypeEnum A09;
    public static final StoryAdKeywordTypeEnum A0A;
    public static final StoryAdKeywordTypeEnum A0B;
    public static final StoryAdKeywordTypeEnum A0C;
    public static final StoryAdKeywordTypeEnum A0D;
    public static final StoryAdKeywordTypeEnum A0E;
    public static final StoryAdKeywordTypeEnum A0F;
    public static final StoryAdKeywordTypeEnum A0G;
    public static final StoryAdKeywordTypeEnum A0H;
    public static final StoryAdKeywordTypeEnum A0I;
    public static final StoryAdKeywordTypeEnum A0J;
    public static final StoryAdKeywordTypeEnum A0K;
    public static final StoryAdKeywordTypeEnum A0L;
    public static final StoryAdKeywordTypeEnum A0M;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        StoryAdKeywordTypeEnum storyAdKeywordTypeEnum = new StoryAdKeywordTypeEnum("UNRECOGNIZED", 0, "StoryAdKeywordTypeEnum_unspecified");
        A0M = storyAdKeywordTypeEnum;
        StoryAdKeywordTypeEnum storyAdKeywordTypeEnum2 = new StoryAdKeywordTypeEnum("EVENT", 1, "EVENT");
        A04 = storyAdKeywordTypeEnum2;
        StoryAdKeywordTypeEnum storyAdKeywordTypeEnum3 = new StoryAdKeywordTypeEnum("ITEM", 2, "ITEM");
        A05 = storyAdKeywordTypeEnum3;
        StoryAdKeywordTypeEnum storyAdKeywordTypeEnum4 = new StoryAdKeywordTypeEnum("MAIN_FUNCTION", 3, "MAIN_FUNCTION");
        A06 = storyAdKeywordTypeEnum4;
        StoryAdKeywordTypeEnum storyAdKeywordTypeEnum5 = new StoryAdKeywordTypeEnum(PriceTableAnnotation$Companion.OFFER, 4, PriceTableAnnotation$Companion.OFFER);
        A07 = storyAdKeywordTypeEnum5;
        StoryAdKeywordTypeEnum storyAdKeywordTypeEnum6 = new StoryAdKeywordTypeEnum("OTHER_OFFERS", 5, "OTHER_OFFERS");
        A08 = storyAdKeywordTypeEnum6;
        StoryAdKeywordTypeEnum storyAdKeywordTypeEnum7 = new StoryAdKeywordTypeEnum("PRICE_OFFERS", 6, "PRICE_OFFERS");
        A09 = storyAdKeywordTypeEnum7;
        StoryAdKeywordTypeEnum storyAdKeywordTypeEnum8 = new StoryAdKeywordTypeEnum("SELLING_POINT", 7, "SELLING_POINT");
        A0A = storyAdKeywordTypeEnum8;
        StoryAdKeywordTypeEnum storyAdKeywordTypeEnum9 = new StoryAdKeywordTypeEnum("SEM_EX_BRAND_NAME", 8, "SEM_EX_BRAND_NAME");
        A0B = storyAdKeywordTypeEnum9;
        StoryAdKeywordTypeEnum storyAdKeywordTypeEnum10 = new StoryAdKeywordTypeEnum("SEM_EX_CONTACT_INFO", 9, "SEM_EX_CONTACT_INFO");
        A0C = storyAdKeywordTypeEnum10;
        StoryAdKeywordTypeEnum storyAdKeywordTypeEnum11 = new StoryAdKeywordTypeEnum("SEM_EX_CTA", 10, "SEM_EX_CTA");
        A0D = storyAdKeywordTypeEnum11;
        StoryAdKeywordTypeEnum storyAdKeywordTypeEnum12 = new StoryAdKeywordTypeEnum("SEM_EX_LOCATION", 11, "SEM_EX_LOCATION");
        A0E = storyAdKeywordTypeEnum12;
        StoryAdKeywordTypeEnum storyAdKeywordTypeEnum13 = new StoryAdKeywordTypeEnum("SEM_EX_MISC", 12, "SEM_EX_MISC");
        A0F = storyAdKeywordTypeEnum13;
        StoryAdKeywordTypeEnum storyAdKeywordTypeEnum14 = new StoryAdKeywordTypeEnum("SEM_EX_PRODUCT_SERVICE_EVENT_NAME", 13, "SEM_EX_PRODUCT_SERVICE_EVENT_NAME");
        A0G = storyAdKeywordTypeEnum14;
        StoryAdKeywordTypeEnum storyAdKeywordTypeEnum15 = new StoryAdKeywordTypeEnum("SEM_EX_PROMO_CODE", 14, "SEM_EX_PROMO_CODE");
        A0H = storyAdKeywordTypeEnum15;
        StoryAdKeywordTypeEnum storyAdKeywordTypeEnum16 = new StoryAdKeywordTypeEnum("SEM_EX_SALES_OFFER", 15, "SEM_EX_SALES_OFFER");
        A0I = storyAdKeywordTypeEnum16;
        StoryAdKeywordTypeEnum storyAdKeywordTypeEnum17 = new StoryAdKeywordTypeEnum("SEM_EX_SELLING_POINT", 16, "SEM_EX_SELLING_POINT");
        A0J = storyAdKeywordTypeEnum17;
        StoryAdKeywordTypeEnum storyAdKeywordTypeEnum18 = new StoryAdKeywordTypeEnum("SEM_EX_TIMING_SEASONALITY_OCCASION", 17, "SEM_EX_TIMING_SEASONALITY_OCCASION");
        A0K = storyAdKeywordTypeEnum18;
        StoryAdKeywordTypeEnum storyAdKeywordTypeEnum19 = new StoryAdKeywordTypeEnum("SEM_EX_USER_COHORT", 18, "SEM_EX_USER_COHORT");
        A0L = storyAdKeywordTypeEnum19;
        StoryAdKeywordTypeEnum[] storyAdKeywordTypeEnumArr = {storyAdKeywordTypeEnum, storyAdKeywordTypeEnum2, storyAdKeywordTypeEnum3, storyAdKeywordTypeEnum4, storyAdKeywordTypeEnum5, storyAdKeywordTypeEnum6, storyAdKeywordTypeEnum7, storyAdKeywordTypeEnum8, storyAdKeywordTypeEnum9, storyAdKeywordTypeEnum10, storyAdKeywordTypeEnum11, storyAdKeywordTypeEnum12, storyAdKeywordTypeEnum13, storyAdKeywordTypeEnum14, storyAdKeywordTypeEnum15, storyAdKeywordTypeEnum16, storyAdKeywordTypeEnum17, storyAdKeywordTypeEnum18, storyAdKeywordTypeEnum19, new StoryAdKeywordTypeEnum("TOPIC", 19, "TOPIC")};
        A03 = storyAdKeywordTypeEnumArr;
        A02 = AbstractC12190kN.A00(storyAdKeywordTypeEnumArr);
        StoryAdKeywordTypeEnum[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC37302Gc3.A01(values.length));
        for (StoryAdKeywordTypeEnum storyAdKeywordTypeEnum20 : values) {
            A18.put(storyAdKeywordTypeEnum20.A00, storyAdKeywordTypeEnum20);
        }
        A01 = A18;
        CREATOR = C41857IgB.A00(14);
    }

    public static StoryAdKeywordTypeEnum valueOf(String str) {
        return (StoryAdKeywordTypeEnum) Enum.valueOf(StoryAdKeywordTypeEnum.class, str);
    }

    public static StoryAdKeywordTypeEnum[] values() {
        return (StoryAdKeywordTypeEnum[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public StoryAdKeywordTypeEnum(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
