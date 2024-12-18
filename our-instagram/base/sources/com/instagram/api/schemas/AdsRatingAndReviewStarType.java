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
public final class AdsRatingAndReviewStarType implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ AdsRatingAndReviewStarType[] A03;
    public static final AdsRatingAndReviewStarType A04;
    public static final AdsRatingAndReviewStarType A05;
    public static final AdsRatingAndReviewStarType A06;
    public static final AdsRatingAndReviewStarType A07;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        AdsRatingAndReviewStarType adsRatingAndReviewStarType = new AdsRatingAndReviewStarType("UNRECOGNIZED", 0, "AdsRatingAndReviewStarType_unspecified");
        A07 = adsRatingAndReviewStarType;
        AdsRatingAndReviewStarType adsRatingAndReviewStarType2 = new AdsRatingAndReviewStarType("EMPTY", 1, "EMPTY");
        A04 = adsRatingAndReviewStarType2;
        AdsRatingAndReviewStarType adsRatingAndReviewStarType3 = new AdsRatingAndReviewStarType("FULL", 2, "FULL");
        A05 = adsRatingAndReviewStarType3;
        AdsRatingAndReviewStarType adsRatingAndReviewStarType4 = new AdsRatingAndReviewStarType("HALF", 3, "HALF");
        A06 = adsRatingAndReviewStarType4;
        AdsRatingAndReviewStarType[] adsRatingAndReviewStarTypeArr = {adsRatingAndReviewStarType, adsRatingAndReviewStarType2, adsRatingAndReviewStarType3, adsRatingAndReviewStarType4};
        A03 = adsRatingAndReviewStarTypeArr;
        A02 = AbstractC12190kN.A00(adsRatingAndReviewStarTypeArr);
        AdsRatingAndReviewStarType[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (AdsRatingAndReviewStarType adsRatingAndReviewStarType5 : values) {
            A18.put(adsRatingAndReviewStarType5.A00, adsRatingAndReviewStarType5);
        }
        A01 = A18;
        CREATOR = new C63469Sl9(42);
    }

    public static AdsRatingAndReviewStarType valueOf(String str) {
        return (AdsRatingAndReviewStarType) Enum.valueOf(AdsRatingAndReviewStarType.class, str);
    }

    public static AdsRatingAndReviewStarType[] values() {
        return (AdsRatingAndReviewStarType[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public AdsRatingAndReviewStarType(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
