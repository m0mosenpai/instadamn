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
public final class AdsRatingAndReviewDisplayFormat implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ AdsRatingAndReviewDisplayFormat[] A03;
    public static final AdsRatingAndReviewDisplayFormat A04;
    public static final AdsRatingAndReviewDisplayFormat A05;
    public static final AdsRatingAndReviewDisplayFormat A06;
    public static final AdsRatingAndReviewDisplayFormat A07;
    public static final AdsRatingAndReviewDisplayFormat A08;
    public static final AdsRatingAndReviewDisplayFormat A09;
    public static final AdsRatingAndReviewDisplayFormat A0A;
    public static final AdsRatingAndReviewDisplayFormat A0B;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        AdsRatingAndReviewDisplayFormat adsRatingAndReviewDisplayFormat = new AdsRatingAndReviewDisplayFormat("UNRECOGNIZED", 0, "AdsRatingAndReviewDisplayFormat_unspecified");
        A0B = adsRatingAndReviewDisplayFormat;
        AdsRatingAndReviewDisplayFormat adsRatingAndReviewDisplayFormat2 = new AdsRatingAndReviewDisplayFormat("ADVERTISER_FB_POA_RATING", 1, "ADVERTISER_FB_POA_RATING");
        A04 = adsRatingAndReviewDisplayFormat2;
        AdsRatingAndReviewDisplayFormat adsRatingAndReviewDisplayFormat3 = new AdsRatingAndReviewDisplayFormat("DIMENSIONAL_KEYWORD", 2, "DIMENSIONAL_KEYWORD");
        A05 = adsRatingAndReviewDisplayFormat3;
        AdsRatingAndReviewDisplayFormat adsRatingAndReviewDisplayFormat4 = new AdsRatingAndReviewDisplayFormat("STAR_RATING", 3, "STAR_RATING");
        A06 = adsRatingAndReviewDisplayFormat4;
        AdsRatingAndReviewDisplayFormat adsRatingAndReviewDisplayFormat5 = new AdsRatingAndReviewDisplayFormat("TEXT_ONLY", 4, "TEXT_ONLY");
        A07 = adsRatingAndReviewDisplayFormat5;
        AdsRatingAndReviewDisplayFormat adsRatingAndReviewDisplayFormat6 = new AdsRatingAndReviewDisplayFormat("TEXT_WITH_A_STAR", 5, "TEXT_WITH_A_STAR");
        A08 = adsRatingAndReviewDisplayFormat6;
        AdsRatingAndReviewDisplayFormat adsRatingAndReviewDisplayFormat7 = new AdsRatingAndReviewDisplayFormat("TEXT_WITH_SATISFACTION_SCORE", 6, "TEXT_WITH_SATISFACTION_SCORE");
        A09 = adsRatingAndReviewDisplayFormat7;
        AdsRatingAndReviewDisplayFormat adsRatingAndReviewDisplayFormat8 = new AdsRatingAndReviewDisplayFormat("TOPIC_EXTRACTION_KEYWORD", 7, "TOPIC_EXTRACTION_KEYWORD");
        A0A = adsRatingAndReviewDisplayFormat8;
        AdsRatingAndReviewDisplayFormat[] adsRatingAndReviewDisplayFormatArr = {adsRatingAndReviewDisplayFormat, adsRatingAndReviewDisplayFormat2, adsRatingAndReviewDisplayFormat3, adsRatingAndReviewDisplayFormat4, adsRatingAndReviewDisplayFormat5, adsRatingAndReviewDisplayFormat6, adsRatingAndReviewDisplayFormat7, adsRatingAndReviewDisplayFormat8, new AdsRatingAndReviewDisplayFormat("TOP_RATED", 8, "TOP_RATED")};
        A03 = adsRatingAndReviewDisplayFormatArr;
        A02 = AbstractC12190kN.A00(adsRatingAndReviewDisplayFormatArr);
        AdsRatingAndReviewDisplayFormat[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (AdsRatingAndReviewDisplayFormat adsRatingAndReviewDisplayFormat9 : values) {
            A18.put(adsRatingAndReviewDisplayFormat9.A00, adsRatingAndReviewDisplayFormat9);
        }
        A01 = A18;
        CREATOR = new C63469Sl9(41);
    }

    public static AdsRatingAndReviewDisplayFormat valueOf(String str) {
        return (AdsRatingAndReviewDisplayFormat) Enum.valueOf(AdsRatingAndReviewDisplayFormat.class, str);
    }

    public static AdsRatingAndReviewDisplayFormat[] values() {
        return (AdsRatingAndReviewDisplayFormat[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public AdsRatingAndReviewDisplayFormat(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
