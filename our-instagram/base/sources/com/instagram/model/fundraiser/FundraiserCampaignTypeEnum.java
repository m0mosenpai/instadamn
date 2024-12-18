package com.instagram.model.fundraiser;

import X.AbstractC12190kN;
import X.AbstractC16850sd;
import X.C14360o3;
import X.C9Ay;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class FundraiserCampaignTypeEnum implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ FundraiserCampaignTypeEnum[] A03;
    public static final FundraiserCampaignTypeEnum A04;
    public static final FundraiserCampaignTypeEnum A05;
    public static final FundraiserCampaignTypeEnum A06;
    public static final FundraiserCampaignTypeEnum A07;
    public static final FundraiserCampaignTypeEnum A08;
    public static final FundraiserCampaignTypeEnum A09;
    public static final FundraiserCampaignTypeEnum A0A;
    public static final FundraiserCampaignTypeEnum A0B;
    public static final FundraiserCampaignTypeEnum A0C;
    public static final FundraiserCampaignTypeEnum A0D;
    public static final FundraiserCampaignTypeEnum A0E;
    public static final FundraiserCampaignTypeEnum A0F;
    public static final FundraiserCampaignTypeEnum A0G;
    public static final FundraiserCampaignTypeEnum A0H;
    public static final FundraiserCampaignTypeEnum A0I;
    public static final FundraiserCampaignTypeEnum A0J;
    public static final FundraiserCampaignTypeEnum A0K;
    public static final FundraiserCampaignTypeEnum A0L;
    public static final FundraiserCampaignTypeEnum A0M;
    public static final FundraiserCampaignTypeEnum A0N;
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
        FundraiserCampaignTypeEnum fundraiserCampaignTypeEnum = new FundraiserCampaignTypeEnum("UNRECOGNIZED", 0, "FundraiserCampaignTypeEnum_unspecified");
        A0N = fundraiserCampaignTypeEnum;
        FundraiserCampaignTypeEnum fundraiserCampaignTypeEnum2 = new FundraiserCampaignTypeEnum("CHARITY_TO_USER", 1, "CHARITY_TO_USER");
        A04 = fundraiserCampaignTypeEnum2;
        FundraiserCampaignTypeEnum fundraiserCampaignTypeEnum3 = new FundraiserCampaignTypeEnum("CRISIS_FOR_CHARITY", 2, "CRISIS_FOR_CHARITY");
        A05 = fundraiserCampaignTypeEnum3;
        FundraiserCampaignTypeEnum fundraiserCampaignTypeEnum4 = new FundraiserCampaignTypeEnum("DONATE_BUTTON_ON_ADS", 3, "DONATE_BUTTON_ON_ADS");
        A06 = fundraiserCampaignTypeEnum4;
        FundraiserCampaignTypeEnum fundraiserCampaignTypeEnum5 = new FundraiserCampaignTypeEnum("DONATE_BUTTON_ON_LIVE_VIDEO", 4, "DONATE_BUTTON_ON_LIVE_VIDEO");
        A07 = fundraiserCampaignTypeEnum5;
        FundraiserCampaignTypeEnum fundraiserCampaignTypeEnum6 = new FundraiserCampaignTypeEnum("DONATE_BUTTON_ON_PAGE", 5, "DONATE_BUTTON_ON_PAGE");
        A08 = fundraiserCampaignTypeEnum6;
        FundraiserCampaignTypeEnum fundraiserCampaignTypeEnum7 = new FundraiserCampaignTypeEnum("DONATE_BUTTON_ON_POST", 6, "DONATE_BUTTON_ON_POST");
        A09 = fundraiserCampaignTypeEnum7;
        FundraiserCampaignTypeEnum fundraiserCampaignTypeEnum8 = new FundraiserCampaignTypeEnum("EXTERNALLY_OWNED_OFFSITE_FUNDRAISER", 7, "EXTERNALLY_OWNED_OFFSITE_FUNDRAISER");
        A0A = fundraiserCampaignTypeEnum8;
        FundraiserCampaignTypeEnum fundraiserCampaignTypeEnum9 = new FundraiserCampaignTypeEnum("FACEBOOK_TO_USER", 8, "FACEBOOK_TO_USER");
        A0B = fundraiserCampaignTypeEnum9;
        FundraiserCampaignTypeEnum fundraiserCampaignTypeEnum10 = new FundraiserCampaignTypeEnum("IG_CHARITY_BUSINESS_PROFILE", 9, "IG_CHARITY_BUSINESS_PROFILE");
        A0C = fundraiserCampaignTypeEnum10;
        FundraiserCampaignTypeEnum fundraiserCampaignTypeEnum11 = new FundraiserCampaignTypeEnum("IG_LIVE_FOR_CHARITY", 10, "IG_LIVE_FOR_CHARITY");
        A0D = fundraiserCampaignTypeEnum11;
        FundraiserCampaignTypeEnum fundraiserCampaignTypeEnum12 = new FundraiserCampaignTypeEnum("IG_STANDALONE_FOR_CHARITY", 11, "IG_STANDALONE_FOR_CHARITY");
        A0E = fundraiserCampaignTypeEnum12;
        FundraiserCampaignTypeEnum fundraiserCampaignTypeEnum13 = new FundraiserCampaignTypeEnum("IG_STANDALONE_FOR_PERSON", 12, "IG_STANDALONE_FOR_PERSON");
        A0F = fundraiserCampaignTypeEnum13;
        FundraiserCampaignTypeEnum fundraiserCampaignTypeEnum14 = new FundraiserCampaignTypeEnum("IG_STICKER_FOR_CHARITY", 13, "IG_STICKER_FOR_CHARITY");
        A0G = fundraiserCampaignTypeEnum14;
        FundraiserCampaignTypeEnum fundraiserCampaignTypeEnum15 = new FundraiserCampaignTypeEnum("LIGHTWEIGHT_FUNDRAISER_FOR_STORY", 14, "LIGHTWEIGHT_FUNDRAISER_FOR_STORY");
        A0H = fundraiserCampaignTypeEnum15;
        FundraiserCampaignTypeEnum fundraiserCampaignTypeEnum16 = new FundraiserCampaignTypeEnum("PERSON_FOR_CAUSE", 15, "PERSON_FOR_CAUSE");
        A0I = fundraiserCampaignTypeEnum16;
        FundraiserCampaignTypeEnum fundraiserCampaignTypeEnum17 = new FundraiserCampaignTypeEnum("PERSON_FOR_CHARITIES_IN_CAUSE", 16, "PERSON_FOR_CHARITIES_IN_CAUSE");
        A0J = fundraiserCampaignTypeEnum17;
        FundraiserCampaignTypeEnum fundraiserCampaignTypeEnum18 = new FundraiserCampaignTypeEnum("PERSON_FOR_PERSON", 17, "PERSON_FOR_PERSON");
        A0K = fundraiserCampaignTypeEnum18;
        FundraiserCampaignTypeEnum fundraiserCampaignTypeEnum19 = new FundraiserCampaignTypeEnum("PROFILE_FOR_CHARITY", 18, "PROFILE_FOR_CHARITY");
        A0L = fundraiserCampaignTypeEnum19;
        FundraiserCampaignTypeEnum fundraiserCampaignTypeEnum20 = new FundraiserCampaignTypeEnum("TEAM_FUNDRAISER_FOR_CHARITY", 19, "TEAM_FUNDRAISER_FOR_CHARITY");
        A0M = fundraiserCampaignTypeEnum20;
        FundraiserCampaignTypeEnum[] fundraiserCampaignTypeEnumArr = {fundraiserCampaignTypeEnum, fundraiserCampaignTypeEnum2, fundraiserCampaignTypeEnum3, fundraiserCampaignTypeEnum4, fundraiserCampaignTypeEnum5, fundraiserCampaignTypeEnum6, fundraiserCampaignTypeEnum7, fundraiserCampaignTypeEnum8, fundraiserCampaignTypeEnum9, fundraiserCampaignTypeEnum10, fundraiserCampaignTypeEnum11, fundraiserCampaignTypeEnum12, fundraiserCampaignTypeEnum13, fundraiserCampaignTypeEnum14, fundraiserCampaignTypeEnum15, fundraiserCampaignTypeEnum16, fundraiserCampaignTypeEnum17, fundraiserCampaignTypeEnum18, fundraiserCampaignTypeEnum19, fundraiserCampaignTypeEnum20, new FundraiserCampaignTypeEnum("USER_TO_CHARITY", 20, "USER_TO_CHARITY")};
        A03 = fundraiserCampaignTypeEnumArr;
        A02 = AbstractC12190kN.A00(fundraiserCampaignTypeEnumArr);
        FundraiserCampaignTypeEnum[] values = values();
        int A0L2 = AbstractC16850sd.A0L(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L2 < 16 ? 16 : A0L2);
        for (FundraiserCampaignTypeEnum fundraiserCampaignTypeEnum21 : values) {
            linkedHashMap.put(fundraiserCampaignTypeEnum21.A00, fundraiserCampaignTypeEnum21);
        }
        A01 = linkedHashMap;
        CREATOR = new C9Ay(12);
    }

    public static FundraiserCampaignTypeEnum valueOf(String str) {
        return (FundraiserCampaignTypeEnum) Enum.valueOf(FundraiserCampaignTypeEnum.class, str);
    }

    public static FundraiserCampaignTypeEnum[] values() {
        return (FundraiserCampaignTypeEnum[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public FundraiserCampaignTypeEnum(String str, int i, String str2) {
        this.A00 = str2;
    }
}
