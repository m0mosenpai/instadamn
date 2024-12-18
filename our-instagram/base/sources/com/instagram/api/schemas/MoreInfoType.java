package com.instagram.api.schemas;

import X.AbstractC12190kN;
import X.AbstractC16850sd;
import X.C14360o3;
import X.C206159Ax;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class MoreInfoType implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ MoreInfoType[] A03;
    public static final MoreInfoType A04;
    public static final MoreInfoType A05;
    public static final MoreInfoType A06;
    public static final MoreInfoType A07;
    public static final MoreInfoType A08;
    public static final MoreInfoType A09;
    public static final MoreInfoType A0A;
    public static final MoreInfoType A0B;
    public static final MoreInfoType A0C;
    public static final MoreInfoType A0D;
    public static final MoreInfoType A0E;
    public static final MoreInfoType A0F;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeInt(ordinal());
    }

    static {
        MoreInfoType moreInfoType = new MoreInfoType("UNRECOGNIZED", 0, "MoreInfoType_unspecified");
        A0F = moreInfoType;
        MoreInfoType moreInfoType2 = new MoreInfoType("ADS_VIEW", 1, "ads_view");
        A04 = moreInfoType2;
        MoreInfoType moreInfoType3 = new MoreInfoType("ADS_VISIT", 2, "ads_visit");
        A05 = moreInfoType3;
        MoreInfoType moreInfoType4 = new MoreInfoType("BUSINESS_CATEGORY", 3, "business_category");
        A06 = moreInfoType4;
        MoreInfoType moreInfoType5 = new MoreInfoType("FOLLOWED_BY", 4, "followed_by");
        A07 = moreInfoType5;
        MoreInfoType moreInfoType6 = new MoreInfoType("FOLLOWER_COUNT", 5, "follower_count");
        A08 = moreInfoType6;
        MoreInfoType moreInfoType7 = new MoreInfoType("HEADLINE", 6, "headline");
        A09 = moreInfoType7;
        MoreInfoType moreInfoType8 = new MoreInfoType("LIKED_BY", 7, "liked_by");
        A0A = moreInfoType8;
        MoreInfoType moreInfoType9 = new MoreInfoType("PRODUCT_TAG", 8, "product_tag");
        A0B = moreInfoType9;
        MoreInfoType moreInfoType10 = new MoreInfoType("PROFILE_PAGE_VISIT_COUNT", 9, "profile_page_visit_count");
        A0C = moreInfoType10;
        MoreInfoType moreInfoType11 = new MoreInfoType("PROMOTION", 10, "promotion");
        A0D = moreInfoType11;
        MoreInfoType moreInfoType12 = new MoreInfoType("RATINGS_AND_REVIEWS", 11, "ratings_and_reviews");
        A0E = moreInfoType12;
        MoreInfoType[] moreInfoTypeArr = {moreInfoType, moreInfoType2, moreInfoType3, moreInfoType4, moreInfoType5, moreInfoType6, moreInfoType7, moreInfoType8, moreInfoType9, moreInfoType10, moreInfoType11, moreInfoType12, new MoreInfoType("UPCOMING_EVENT_COUNTDOWN", 12, "upcoming_event_countdown")};
        A03 = moreInfoTypeArr;
        A02 = AbstractC12190kN.A00(moreInfoTypeArr);
        MoreInfoType[] values = values();
        int A0L = AbstractC16850sd.A0L(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L < 16 ? 16 : A0L);
        for (MoreInfoType moreInfoType13 : values) {
            linkedHashMap.put(moreInfoType13.A00, moreInfoType13);
        }
        A01 = linkedHashMap;
        CREATOR = new C206159Ax(57);
    }

    public static MoreInfoType valueOf(String str) {
        return (MoreInfoType) Enum.valueOf(MoreInfoType.class, str);
    }

    public static MoreInfoType[] values() {
        return (MoreInfoType[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public MoreInfoType(String str, int i, String str2) {
        this.A00 = str2;
    }
}
