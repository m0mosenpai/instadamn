package com.instagram.api.schemas;

import X.AbstractC12190kN;
import X.AbstractC16850sd;
import X.C14360o3;
import X.C206139Av;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class UserMonetizationProductType implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ UserMonetizationProductType[] A03;
    public static final UserMonetizationProductType A04;
    public static final UserMonetizationProductType A05;
    public static final UserMonetizationProductType A06;
    public static final UserMonetizationProductType A07;
    public static final UserMonetizationProductType A08;
    public static final UserMonetizationProductType A09;
    public static final UserMonetizationProductType A0A;
    public static final UserMonetizationProductType A0B;
    public static final UserMonetizationProductType A0C;
    public static final UserMonetizationProductType A0D;
    public static final UserMonetizationProductType A0E;
    public static final UserMonetizationProductType A0F;
    public static final UserMonetizationProductType A0G;
    public static final UserMonetizationProductType A0H;
    public static final UserMonetizationProductType A0I;
    public static final UserMonetizationProductType A0J;
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
        UserMonetizationProductType userMonetizationProductType = new UserMonetizationProductType("UNRECOGNIZED", 0, "UserMonetizationProductType_unspecified");
        A0I = userMonetizationProductType;
        UserMonetizationProductType userMonetizationProductType2 = new UserMonetizationProductType("AFFILIATE", 1, "affiliate");
        A04 = userMonetizationProductType2;
        UserMonetizationProductType userMonetizationProductType3 = new UserMonetizationProductType("BADGES_INCENTIVES", 2, "badges_incentives");
        A05 = userMonetizationProductType3;
        UserMonetizationProductType userMonetizationProductType4 = new UserMonetizationProductType("BRANDED_CONTENT", 3, "branded_content");
        A06 = userMonetizationProductType4;
        UserMonetizationProductType userMonetizationProductType5 = new UserMonetizationProductType("BRANDED_CONTENT_DEAL_BRAND", 4, "branded_content_deal_brand");
        A07 = userMonetizationProductType5;
        UserMonetizationProductType userMonetizationProductType6 = new UserMonetizationProductType("BRANDED_CONTENT_DEAL_CREATOR", 5, "branded_content_deal_creator");
        A08 = userMonetizationProductType6;
        UserMonetizationProductType userMonetizationProductType7 = new UserMonetizationProductType("BRANDED_CONTENT_TAG_IN_LIVE", 6, "branded_content_tag_in_live");
        A09 = userMonetizationProductType7;
        UserMonetizationProductType userMonetizationProductType8 = new UserMonetizationProductType("CONTENT_APPRECIATION", 7, "content_appreciation");
        A0A = userMonetizationProductType8;
        UserMonetizationProductType userMonetizationProductType9 = new UserMonetizationProductType("DETECTED_OUTCOMES", 8, "detected_outcomes");
        A0B = userMonetizationProductType9;
        UserMonetizationProductType userMonetizationProductType10 = new UserMonetizationProductType("FAN_CLUB_CREATOR", 9, "fan_club_creator");
        A0C = userMonetizationProductType10;
        UserMonetizationProductType userMonetizationProductType11 = new UserMonetizationProductType("IGTV_REVSHARE", 10, "igtv_revshare");
        A0D = userMonetizationProductType11;
        UserMonetizationProductType userMonetizationProductType12 = new UserMonetizationProductType("INCENTIVE_PLATFORM", 11, "incentive_platform");
        A0E = userMonetizationProductType12;
        UserMonetizationProductType userMonetizationProductType13 = new UserMonetizationProductType("INCENTIVE_PLATFORM_SPEAKER_ENGAGEMENT", 12, "incentive_platform_speaker_engagement");
        A0F = userMonetizationProductType13;
        UserMonetizationProductType userMonetizationProductType14 = new UserMonetizationProductType("REELS_OVERLAY_ADS", 13, "reels_overlay_ads");
        A0G = userMonetizationProductType14;
        UserMonetizationProductType userMonetizationProductType15 = new UserMonetizationProductType("SHOPPING_FROM_CREATORS", 14, "shopping_from_creators");
        A0H = userMonetizationProductType15;
        UserMonetizationProductType userMonetizationProductType16 = new UserMonetizationProductType("USER_PAY", 15, "user_pay");
        A0J = userMonetizationProductType16;
        UserMonetizationProductType[] userMonetizationProductTypeArr = {userMonetizationProductType, userMonetizationProductType2, userMonetizationProductType3, userMonetizationProductType4, userMonetizationProductType5, userMonetizationProductType6, userMonetizationProductType7, userMonetizationProductType8, userMonetizationProductType9, userMonetizationProductType10, userMonetizationProductType11, userMonetizationProductType12, userMonetizationProductType13, userMonetizationProductType14, userMonetizationProductType15, userMonetizationProductType16};
        A03 = userMonetizationProductTypeArr;
        A02 = AbstractC12190kN.A00(userMonetizationProductTypeArr);
        UserMonetizationProductType[] values = values();
        int A0L = AbstractC16850sd.A0L(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L < 16 ? 16 : A0L);
        for (UserMonetizationProductType userMonetizationProductType17 : values) {
            linkedHashMap.put(userMonetizationProductType17.A00, userMonetizationProductType17);
        }
        A01 = linkedHashMap;
        CREATOR = new C206139Av(35);
    }

    public static UserMonetizationProductType valueOf(String str) {
        return (UserMonetizationProductType) Enum.valueOf(UserMonetizationProductType.class, str);
    }

    public static UserMonetizationProductType[] values() {
        return (UserMonetizationProductType[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public UserMonetizationProductType(String str, int i, String str2) {
        this.A00 = str2;
    }
}
