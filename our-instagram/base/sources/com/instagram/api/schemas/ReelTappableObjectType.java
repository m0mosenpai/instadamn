package com.instagram.api.schemas;

import X.AbstractC12190kN;
import X.AbstractC167027dH;
import X.AbstractC37302Gc3;
import X.C41855Ig9;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class ReelTappableObjectType implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ ReelTappableObjectType[] A03;
    public static final ReelTappableObjectType A04;
    public static final ReelTappableObjectType A05;
    public static final ReelTappableObjectType A06;
    public static final ReelTappableObjectType A07;
    public static final ReelTappableObjectType A08;
    public static final ReelTappableObjectType A09;
    public static final ReelTappableObjectType A0A;
    public static final ReelTappableObjectType A0B;
    public static final ReelTappableObjectType A0C;
    public static final ReelTappableObjectType A0D;
    public static final ReelTappableObjectType A0E;
    public static final ReelTappableObjectType A0F;
    public static final ReelTappableObjectType A0G;
    public static final ReelTappableObjectType A0H;
    public static final ReelTappableObjectType A0I;
    public static final ReelTappableObjectType A0J;
    public static final ReelTappableObjectType A0K;
    public static final ReelTappableObjectType A0L;
    public static final ReelTappableObjectType A0M;
    public static final ReelTappableObjectType A0N;
    public static final ReelTappableObjectType A0O;
    public static final ReelTappableObjectType A0P;
    public static final ReelTappableObjectType A0Q;
    public static final ReelTappableObjectType A0R;
    public static final ReelTappableObjectType A0S;
    public static final ReelTappableObjectType A0T;
    public static final ReelTappableObjectType A0U;
    public static final ReelTappableObjectType A0V;
    public static final ReelTappableObjectType A0W;
    public static final ReelTappableObjectType A0X;
    public static final ReelTappableObjectType A0Y;
    public static final ReelTappableObjectType A0Z;
    public static final ReelTappableObjectType A0a;
    public static final ReelTappableObjectType A0b;
    public static final ReelTappableObjectType A0c;
    public static final ReelTappableObjectType A0d;
    public static final ReelTappableObjectType A0e;
    public static final ReelTappableObjectType A0f;
    public static final ReelTappableObjectType A0g;
    public static final ReelTappableObjectType A0h;
    public static final ReelTappableObjectType A0i;
    public static final ReelTappableObjectType A0j;
    public static final ReelTappableObjectType A0k;
    public static final ReelTappableObjectType A0l;
    public static final ReelTappableObjectType A0m;
    public static final ReelTappableObjectType A0n;
    public static final ReelTappableObjectType A0o;
    public static final ReelTappableObjectType A0p;
    public static final ReelTappableObjectType A0q;
    public static final ReelTappableObjectType A0r;
    public static final ReelTappableObjectType A0s;
    public static final ReelTappableObjectType A0t;
    public static final ReelTappableObjectType A0u;
    public static final ReelTappableObjectType A0v;
    public static final ReelTappableObjectType A0w;
    public static final ReelTappableObjectType A0x;
    public static final ReelTappableObjectType A0y;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        ReelTappableObjectType reelTappableObjectType = new ReelTappableObjectType("UNRECOGNIZED", 0, "ReelTappableObjectType_unspecified");
        A0u = reelTappableObjectType;
        ReelTappableObjectType reelTappableObjectType2 = new ReelTappableObjectType("LOCATION", 1, "location");
        A0U = reelTappableObjectType2;
        ReelTappableObjectType reelTappableObjectType3 = new ReelTappableObjectType("HASHTAG", 2, "hashtag");
        A0Q = reelTappableObjectType3;
        ReelTappableObjectType reelTappableObjectType4 = new ReelTappableObjectType("HIGHLIGHT", 3, "highlight");
        A0R = reelTappableObjectType4;
        ReelTappableObjectType reelTappableObjectType5 = new ReelTappableObjectType("MENTION", 4, "mention");
        A0X = reelTappableObjectType5;
        ReelTappableObjectType reelTappableObjectType6 = new ReelTappableObjectType("EVENT", 5, "event");
        A0G = reelTappableObjectType6;
        ReelTappableObjectType reelTappableObjectType7 = new ReelTappableObjectType("POLL", 6, "poll");
        A0a = reelTappableObjectType7;
        ReelTappableObjectType reelTappableObjectType8 = new ReelTappableObjectType("GROUP_POLL", 7, "group_poll");
        A0O = reelTappableObjectType8;
        ReelTappableObjectType reelTappableObjectType9 = new ReelTappableObjectType("FEED_MEDIA", 8, "feed_media");
        A0K = reelTappableObjectType9;
        ReelTappableObjectType reelTappableObjectType10 = new ReelTappableObjectType("FEED_MEDIA_CTA", 9, "feed_media_cta");
        A0L = reelTappableObjectType10;
        ReelTappableObjectType reelTappableObjectType11 = new ReelTappableObjectType("SOUND_ON", 10, "sound_on");
        A0o = reelTappableObjectType11;
        ReelTappableObjectType reelTappableObjectType12 = new ReelTappableObjectType("AR_EFFECT", 11, "ar_effect");
        A06 = reelTappableObjectType12;
        ReelTappableObjectType reelTappableObjectType13 = new ReelTappableObjectType("SLIDER", 12, "slider");
        A0k = reelTappableObjectType13;
        ReelTappableObjectType reelTappableObjectType14 = new ReelTappableObjectType("PRODUCT_ITEM", 13, "product_item");
        A0b = reelTappableObjectType14;
        ReelTappableObjectType reelTappableObjectType15 = new ReelTappableObjectType("SELLER_COLLECTION", 14, "seller_collection");
        A0j = reelTappableObjectType15;
        ReelTappableObjectType reelTappableObjectType16 = new ReelTappableObjectType("STOREFRONT", 15, "storefront");
        A0p = reelTappableObjectType16;
        ReelTappableObjectType reelTappableObjectType17 = new ReelTappableObjectType("MULTI_PRODUCT_ITEM", 16, "multi_product_item");
        A0Y = reelTappableObjectType17;
        ReelTappableObjectType reelTappableObjectType18 = new ReelTappableObjectType("QUESTION", 17, "question");
        A0f = reelTappableObjectType18;
        ReelTappableObjectType reelTappableObjectType19 = new ReelTappableObjectType("FRIEND_LIST", 18, "friend_list");
        A0M = reelTappableObjectType19;
        ReelTappableObjectType reelTappableObjectType20 = new ReelTappableObjectType("MUSIC", 19, "music");
        A0Z = reelTappableObjectType20;
        ReelTappableObjectType reelTappableObjectType21 = new ReelTappableObjectType("QUIZ", 20, "quiz");
        A0g = reelTappableObjectType21;
        ReelTappableObjectType reelTappableObjectType22 = new ReelTappableObjectType("PROMPT", 21, "prompt");
        A0d = reelTappableObjectType22;
        ReelTappableObjectType reelTappableObjectType23 = new ReelTappableObjectType("PROMPT_V2", 22, "prompt_v2");
        A0e = reelTappableObjectType23;
        ReelTappableObjectType reelTappableObjectType24 = new ReelTappableObjectType("VCR_STICKER", 23, "vcr_sticker");
        A0w = reelTappableObjectType24;
        ReelTappableObjectType reelTappableObjectType25 = new ReelTappableObjectType("PRODUCT_SHARE", 24, "product_share");
        A0c = reelTappableObjectType25;
        ReelTappableObjectType reelTappableObjectType26 = new ReelTappableObjectType("COUNTDOWN", 25, "countdown");
        A0D = reelTappableObjectType26;
        ReelTappableObjectType reelTappableObjectType27 = new ReelTappableObjectType("FUNDRAISER", 26, "fundraiser");
        A0N = reelTappableObjectType27;
        ReelTappableObjectType reelTappableObjectType28 = new ReelTappableObjectType("LYRIC", 27, "lyric");
        A0W = reelTappableObjectType28;
        ReelTappableObjectType reelTappableObjectType29 = new ReelTappableObjectType("LINK", 28, "link");
        A0T = reelTappableObjectType29;
        ReelTappableObjectType reelTappableObjectType30 = new ReelTappableObjectType("ANTI_BULLY", 29, "anti_bully");
        A04 = reelTappableObjectType30;
        ReelTappableObjectType reelTappableObjectType31 = new ReelTappableObjectType("ANTI_BULLY_GLOBAL", 30, "anti_bully_global");
        A05 = reelTappableObjectType31;
        ReelTappableObjectType reelTappableObjectType32 = new ReelTappableObjectType("VOTER_REGISTRATION", 31, "voter_registration");
        A0x = reelTappableObjectType32;
        ReelTappableObjectType reelTappableObjectType33 = new ReelTappableObjectType("LOCATIONS_COLLECTION", 32, "locations_collection");
        A0V = reelTappableObjectType33;
        ReelTappableObjectType reelTappableObjectType34 = new ReelTappableObjectType("HIT_ME_UP", 33, "hit_me_up");
        A0S = reelTappableObjectType34;
        ReelTappableObjectType reelTappableObjectType35 = new ReelTappableObjectType("SMB_SUPPORT", 34, "smb_support");
        A0n = reelTappableObjectType35;
        ReelTappableObjectType reelTappableObjectType36 = new ReelTappableObjectType("ROLL_CALL", 35, "roll_call");
        A0i = reelTappableObjectType36;
        ReelTappableObjectType reelTappableObjectType37 = new ReelTappableObjectType("BLOKS_TAPPABLE", 36, "bloks_tappable");
        A0B = reelTappableObjectType37;
        ReelTappableObjectType reelTappableObjectType38 = new ReelTappableObjectType("AVATAR_STICKER", 37, "avatar_sticker");
        A08 = reelTappableObjectType38;
        ReelTappableObjectType reelTappableObjectType39 = new ReelTappableObjectType("AVATAR", 38, "avatar");
        A07 = reelTappableObjectType39;
        ReelTappableObjectType reelTappableObjectType40 = new ReelTappableObjectType("UPCOMING_EVENT", 39, "upcoming_event");
        A0v = reelTappableObjectType40;
        ReelTappableObjectType reelTappableObjectType41 = new ReelTappableObjectType("VOTING_INFO_CENTER", 40, "voting_info_center");
        A0y = reelTappableObjectType41;
        ReelTappableObjectType reelTappableObjectType42 = new ReelTappableObjectType("BLOKS_STICKER", 41, "bloks_sticker");
        A0A = reelTappableObjectType42;
        ReelTappableObjectType reelTappableObjectType43 = new ReelTappableObjectType("SUPPORT_PERSONALIZED_ADS", 42, "support_personalized_ads");
        A0t = reelTappableObjectType43;
        ReelTappableObjectType reelTappableObjectType44 = new ReelTappableObjectType("STORY_LINK", 43, "story_link");
        A0r = reelTappableObjectType44;
        ReelTappableObjectType reelTappableObjectType45 = new ReelTappableObjectType("BADGES_THANK_YOU", 44, "badges_thank_you");
        A09 = reelTappableObjectType45;
        ReelTappableObjectType reelTappableObjectType46 = new ReelTappableObjectType("SMB_DISCOUNT", 45, "smb_discount");
        A0l = reelTappableObjectType46;
        ReelTappableObjectType reelTappableObjectType47 = new ReelTappableObjectType("SMB_GET_QUOTE", 46, "smb_get_quote");
        A0m = reelTappableObjectType47;
        ReelTappableObjectType reelTappableObjectType48 = new ReelTappableObjectType("HANGOUT", 47, "hangout");
        A0P = reelTappableObjectType48;
        ReelTappableObjectType reelTappableObjectType49 = new ReelTappableObjectType("FB_FUNDRAISER", 48, "fb_fundraiser");
        A0I = reelTappableObjectType49;
        ReelTappableObjectType reelTappableObjectType50 = new ReelTappableObjectType("FB_GROUP", 49, "fb_group");
        A0J = reelTappableObjectType50;
        ReelTappableObjectType reelTappableObjectType51 = new ReelTappableObjectType("REACTION_STICKER", 50, "reaction_sticker");
        A0h = reelTappableObjectType51;
        ReelTappableObjectType reelTappableObjectType52 = new ReelTappableObjectType("SUBSCRIPTIONS", 51, "subscriptions");
        A0s = reelTappableObjectType52;
        ReelTappableObjectType reelTappableObjectType53 = new ReelTappableObjectType("CHAT", 52, "chat");
        A0C = reelTappableObjectType53;
        ReelTappableObjectType reelTappableObjectType54 = new ReelTappableObjectType("FB_COMMUNITY", 53, "fb_community");
        A0H = reelTappableObjectType54;
        ReelTappableObjectType reelTappableObjectType55 = new ReelTappableObjectType("STORY_EVENT_DEPRECATED", 54, "story_event");
        A0q = reelTappableObjectType55;
        ReelTappableObjectType reelTappableObjectType56 = new ReelTappableObjectType("DISCUSSION_DEPRECATED", 55, "discussion");
        A0E = reelTappableObjectType56;
        ReelTappableObjectType reelTappableObjectType57 = new ReelTappableObjectType("ELECTION_DEPRECATED", 56, "election");
        A0F = reelTappableObjectType57;
        ReelTappableObjectType reelTappableObjectType58 = new ReelTappableObjectType("COLLAB_DEPRECATED", 57, "collab");
        ReelTappableObjectType[] reelTappableObjectTypeArr = new ReelTappableObjectType[58];
        System.arraycopy(new ReelTappableObjectType[]{reelTappableObjectType, reelTappableObjectType2, reelTappableObjectType3, reelTappableObjectType4, reelTappableObjectType5, reelTappableObjectType6, reelTappableObjectType7, reelTappableObjectType8, reelTappableObjectType9, reelTappableObjectType10, reelTappableObjectType11, reelTappableObjectType12, reelTappableObjectType13, reelTappableObjectType14, reelTappableObjectType15, reelTappableObjectType16, reelTappableObjectType17, reelTappableObjectType18, reelTappableObjectType19, reelTappableObjectType20, reelTappableObjectType21, reelTappableObjectType22, reelTappableObjectType23, reelTappableObjectType24, reelTappableObjectType25, reelTappableObjectType26, reelTappableObjectType27}, 0, reelTappableObjectTypeArr, 0, 27);
        System.arraycopy(new ReelTappableObjectType[]{reelTappableObjectType28, reelTappableObjectType29, reelTappableObjectType30, reelTappableObjectType31, reelTappableObjectType32, reelTappableObjectType33, reelTappableObjectType34, reelTappableObjectType35, reelTappableObjectType36, reelTappableObjectType37, reelTappableObjectType38, reelTappableObjectType39, reelTappableObjectType40, reelTappableObjectType41, reelTappableObjectType42, reelTappableObjectType43, reelTappableObjectType44, reelTappableObjectType45, reelTappableObjectType46, reelTappableObjectType47, reelTappableObjectType48, reelTappableObjectType49, reelTappableObjectType50, reelTappableObjectType51, reelTappableObjectType52, reelTappableObjectType53, reelTappableObjectType54}, 0, reelTappableObjectTypeArr, 27, 27);
        System.arraycopy(new ReelTappableObjectType[]{reelTappableObjectType55, reelTappableObjectType56, reelTappableObjectType57, reelTappableObjectType58}, 0, reelTappableObjectTypeArr, 54, 4);
        A03 = reelTappableObjectTypeArr;
        A02 = AbstractC12190kN.A00(reelTappableObjectTypeArr);
        ReelTappableObjectType[] values = values();
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC37302Gc3.A01(values.length));
        for (ReelTappableObjectType reelTappableObjectType59 : values) {
            linkedHashMap.put(reelTappableObjectType59.A00, reelTappableObjectType59);
        }
        A01 = linkedHashMap;
        CREATOR = new C41855Ig9(88);
    }

    public static ReelTappableObjectType valueOf(String str) {
        return (ReelTappableObjectType) Enum.valueOf(ReelTappableObjectType.class, str);
    }

    public static ReelTappableObjectType[] values() {
        return (ReelTappableObjectType[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public ReelTappableObjectType(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
