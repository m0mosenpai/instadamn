package com.instagram.api.schemas;

import X.AbstractC12190kN;
import X.AbstractC167027dH;
import X.AbstractC16850sd;
import X.AbstractC25225BEi;
import X.C41854Ig8;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class FanClubNextStepsRecommendationsType implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ FanClubNextStepsRecommendationsType[] A03;
    public static final FanClubNextStepsRecommendationsType A04;
    public static final FanClubNextStepsRecommendationsType A05;
    public static final FanClubNextStepsRecommendationsType A06;
    public static final FanClubNextStepsRecommendationsType A07;
    public static final FanClubNextStepsRecommendationsType A08;
    public static final FanClubNextStepsRecommendationsType A09;
    public static final FanClubNextStepsRecommendationsType A0A;
    public static final FanClubNextStepsRecommendationsType A0B;
    public static final FanClubNextStepsRecommendationsType A0C;
    public static final FanClubNextStepsRecommendationsType A0D;
    public static final FanClubNextStepsRecommendationsType A0E;
    public static final FanClubNextStepsRecommendationsType A0F;
    public static final FanClubNextStepsRecommendationsType A0G;
    public static final FanClubNextStepsRecommendationsType A0H;
    public static final FanClubNextStepsRecommendationsType A0I;
    public static final FanClubNextStepsRecommendationsType A0J;
    public static final FanClubNextStepsRecommendationsType A0K;
    public static final FanClubNextStepsRecommendationsType A0L;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        FanClubNextStepsRecommendationsType fanClubNextStepsRecommendationsType = new FanClubNextStepsRecommendationsType("UNRECOGNIZED", 0, "FanClubNextStepsRecommendationsType_unspecified");
        A0J = fanClubNextStepsRecommendationsType;
        FanClubNextStepsRecommendationsType fanClubNextStepsRecommendationsType2 = new FanClubNextStepsRecommendationsType("ACTIVE_OFFERS", 1, "active_offers");
        A04 = fanClubNextStepsRecommendationsType2;
        FanClubNextStepsRecommendationsType fanClubNextStepsRecommendationsType3 = new FanClubNextStepsRecommendationsType("BROADCAST_CHAT", 2, "broadcast_chat");
        A05 = fanClubNextStepsRecommendationsType3;
        FanClubNextStepsRecommendationsType fanClubNextStepsRecommendationsType4 = new FanClubNextStepsRecommendationsType("CONTENT_PREVIEW", 3, "content_preview");
        A06 = fanClubNextStepsRecommendationsType4;
        FanClubNextStepsRecommendationsType fanClubNextStepsRecommendationsType5 = new FanClubNextStepsRecommendationsType("CREATE_SUBSCRIBER_CHANNEL", 4, "create_subscriber_channel");
        A07 = fanClubNextStepsRecommendationsType5;
        FanClubNextStepsRecommendationsType fanClubNextStepsRecommendationsType6 = new FanClubNextStepsRecommendationsType("CUSTOMIZE_BENEFITS", 5, "customize_benefits");
        A08 = fanClubNextStepsRecommendationsType6;
        FanClubNextStepsRecommendationsType fanClubNextStepsRecommendationsType7 = new FanClubNextStepsRecommendationsType("POST_OR_REEL", 6, "post_or_reel");
        A09 = fanClubNextStepsRecommendationsType7;
        FanClubNextStepsRecommendationsType fanClubNextStepsRecommendationsType8 = new FanClubNextStepsRecommendationsType("PROMO_VIDEO", 7, "promo_video");
        A0A = fanClubNextStepsRecommendationsType8;
        FanClubNextStepsRecommendationsType fanClubNextStepsRecommendationsType9 = new FanClubNextStepsRecommendationsType("SCHEDULE_LIVE", 8, "schedule_live");
        A0B = fanClubNextStepsRecommendationsType9;
        FanClubNextStepsRecommendationsType fanClubNextStepsRecommendationsType10 = new FanClubNextStepsRecommendationsType("SUBSCRIBER_CHAT", 9, "subscriber_chat");
        A0C = fanClubNextStepsRecommendationsType10;
        FanClubNextStepsRecommendationsType fanClubNextStepsRecommendationsType11 = new FanClubNextStepsRecommendationsType("SUBSCRIBER_CHAT_STORY_STICKER", 10, "subscriber_chat_story_sticker");
        A0D = fanClubNextStepsRecommendationsType11;
        FanClubNextStepsRecommendationsType fanClubNextStepsRecommendationsType12 = new FanClubNextStepsRecommendationsType("SUBSCRIPTION_SHOUTOUT_STORY_STICKER", 11, "subscriber_shoutout_story_sticker");
        A0H = fanClubNextStepsRecommendationsType12;
        FanClubNextStepsRecommendationsType fanClubNextStepsRecommendationsType13 = new FanClubNextStepsRecommendationsType("SUBSCRIBER_SOCIAL_CHANNEL", 12, "subscriber_social_channel");
        A0E = fanClubNextStepsRecommendationsType13;
        FanClubNextStepsRecommendationsType fanClubNextStepsRecommendationsType14 = new FanClubNextStepsRecommendationsType("SUBSCRIBER_STORY", 13, "subscriber_story");
        A0F = fanClubNextStepsRecommendationsType14;
        FanClubNextStepsRecommendationsType fanClubNextStepsRecommendationsType15 = new FanClubNextStepsRecommendationsType("SUBSCRIPTION_PROMO_STICKER", 14, "subscription_promo_sticker");
        A0G = fanClubNextStepsRecommendationsType15;
        FanClubNextStepsRecommendationsType fanClubNextStepsRecommendationsType16 = new FanClubNextStepsRecommendationsType("SUBSCRIPTION_STORY_STICKER", 15, "subscription_story_sticker");
        A0I = fanClubNextStepsRecommendationsType16;
        FanClubNextStepsRecommendationsType fanClubNextStepsRecommendationsType17 = new FanClubNextStepsRecommendationsType("WELCOME_EXPERIENCE", 16, "welcome_experience");
        A0K = fanClubNextStepsRecommendationsType17;
        FanClubNextStepsRecommendationsType fanClubNextStepsRecommendationsType18 = new FanClubNextStepsRecommendationsType("WELCOME_VIDEO", 17, "welcome_video");
        A0L = fanClubNextStepsRecommendationsType18;
        FanClubNextStepsRecommendationsType[] fanClubNextStepsRecommendationsTypeArr = {fanClubNextStepsRecommendationsType, fanClubNextStepsRecommendationsType2, fanClubNextStepsRecommendationsType3, fanClubNextStepsRecommendationsType4, fanClubNextStepsRecommendationsType5, fanClubNextStepsRecommendationsType6, fanClubNextStepsRecommendationsType7, fanClubNextStepsRecommendationsType8, fanClubNextStepsRecommendationsType9, fanClubNextStepsRecommendationsType10, fanClubNextStepsRecommendationsType11, fanClubNextStepsRecommendationsType12, fanClubNextStepsRecommendationsType13, fanClubNextStepsRecommendationsType14, fanClubNextStepsRecommendationsType15, fanClubNextStepsRecommendationsType16, fanClubNextStepsRecommendationsType17, fanClubNextStepsRecommendationsType18};
        A03 = fanClubNextStepsRecommendationsTypeArr;
        A02 = AbstractC12190kN.A00(fanClubNextStepsRecommendationsTypeArr);
        FanClubNextStepsRecommendationsType[] values = values();
        int A0L2 = AbstractC16850sd.A0L(values.length);
        LinkedHashMap A18 = AbstractC25225BEi.A18(A0L2 < 16 ? 16 : A0L2);
        for (FanClubNextStepsRecommendationsType fanClubNextStepsRecommendationsType19 : values) {
            A18.put(fanClubNextStepsRecommendationsType19.A00, fanClubNextStepsRecommendationsType19);
        }
        A01 = A18;
        CREATOR = new C41854Ig8(81);
    }

    public static FanClubNextStepsRecommendationsType valueOf(String str) {
        return (FanClubNextStepsRecommendationsType) Enum.valueOf(FanClubNextStepsRecommendationsType.class, str);
    }

    public static FanClubNextStepsRecommendationsType[] values() {
        return (FanClubNextStepsRecommendationsType[]) A03.clone();
    }

    public FanClubNextStepsRecommendationsType(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
