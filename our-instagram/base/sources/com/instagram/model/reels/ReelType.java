package com.instagram.model.reels;

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
/* loaded from: classes.dex */
public final class ReelType implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ ReelType[] A03;
    public static final ReelType A04;
    public static final ReelType A05;
    public static final ReelType A06;
    public static final ReelType A07;
    public static final ReelType A08;
    public static final ReelType A09;
    public static final ReelType A0A;
    public static final ReelType A0B;
    public static final ReelType A0C;
    public static final ReelType A0D;
    public static final ReelType A0E;
    public static final ReelType A0F;
    public static final ReelType A0G;
    public static final ReelType A0H;
    public static final ReelType A0I;
    public static final ReelType A0J;
    public static final ReelType A0K;
    public static final ReelType A0L;
    public static final ReelType A0M;
    public static final ReelType A0N;
    public static final ReelType A0O;
    public static final ReelType A0P;
    public static final ReelType A0Q;
    public static final ReelType A0R;
    public static final ReelType A0S;
    public static final ReelType A0T;
    public static final ReelType A0U;
    public static final ReelType A0V;
    public static final ReelType A0W;
    public static final ReelType A0X;
    public static final ReelType A0Y;
    public static final ReelType A0Z;
    public static final ReelType A0a;
    public static final ReelType A0b;
    public static final ReelType A0c;
    public static final ReelType A0d;
    public static final ReelType A0e;
    public static final ReelType A0f;
    public static final ReelType A0g;
    public static final ReelType A0h;
    public static final ReelType A0i;
    public static final ReelType A0j;
    public static final ReelType A0k;
    public static final ReelType A0l;
    public static final ReelType A0m;
    public static final ReelType A0n;
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
        ReelType reelType = new ReelType("UNRECOGNIZED", 0, "ReelType_unspecified");
        A0m = reelType;
        ReelType reelType2 = new ReelType("ADS_REEL", 1, "ads_reel");
        A04 = reelType2;
        ReelType reelType3 = new ReelType("AR_EFFECT_PREVIEW", 2, "ar_effect_preview");
        A0B = reelType3;
        ReelType reelType4 = new ReelType("ARCHIVE_DAY_MEDIA_REEL", 3, "archive_day_media_reel");
        A05 = reelType4;
        ReelType reelType5 = new ReelType("ARCHIVE_DAY_REEL", 4, "archive_day_reel");
        A06 = reelType5;
        ReelType reelType6 = new ReelType("ARCHIVE_FRIEND_REEL", 5, "archive_friend_reel");
        A07 = reelType6;
        ReelType reelType7 = new ReelType("ARCHIVE_MAP_REEL", 6, "archive_map_reel");
        A08 = reelType7;
        ReelType reelType8 = new ReelType("ARCHIVE_SCHEDULED_FOR_DELETION_REEL", 7, "archive_scheduled_for_deletion_reel");
        A09 = reelType8;
        ReelType reelType9 = new ReelType("ARCHIVE_SHOP_REEL", 8, "archive_shop_reel");
        A0A = reelType9;
        ReelType reelType10 = new ReelType("AXE_REEL", 9, "axe_reel");
        A0C = reelType10;
        ReelType reelType11 = new ReelType("BIRTHDAY_HIGHLIGHTS", 10, "birthday_highlights");
        A0D = reelType11;
        ReelType reelType12 = new ReelType("BLOKS", 11, "bloks");
        A0E = reelType12;
        ReelType reelType13 = new ReelType("BROADCAST_REEL", 12, "broadcast_reel");
        A0F = reelType13;
        ReelType reelType14 = new ReelType("DAILY_SNAPSHOT_REEL", 13, "daily_snapshot_reel");
        A0G = reelType14;
        ReelType reelType15 = new ReelType("ELECTION_REEL", 14, "election_reel");
        A0H = reelType15;
        ReelType reelType16 = new ReelType("EMPTY_STORY_STATE_REEL", 15, "empty_story_state_reel");
        A0I = reelType16;
        ReelType reelType17 = new ReelType("END_OF_YEAR", 16, "end_of_year");
        A0J = reelType17;
        ReelType reelType18 = new ReelType("FAN_CLUB_STORY_REEL", 17, "fan_club_story");
        A0K = reelType18;
        ReelType reelType19 = new ReelType("FOLLOW_VERSARIES", 18, "follow_versaries");
        A0L = reelType19;
        ReelType reelType20 = new ReelType("GROUP_MENTION", 19, "group_mention");
        A0M = reelType20;
        ReelType reelType21 = new ReelType("GROUP_REEL", 20, "group_reel");
        A0N = reelType21;
        ReelType reelType22 = new ReelType("HALLPASS_REEL", 21, "hallpass_reel");
        A0O = reelType22;
        ReelType reelType23 = new ReelType("HIGHLIGHT_REEL", 22, "highlight_reel");
        A0P = reelType23;
        ReelType reelType24 = new ReelType("HIGHLIGHT_REWIND_REEL", 23, "highlight_rewind_reel");
        A0Q = reelType24;
        ReelType reelType25 = new ReelType("INACTIVE_HALLPASS_REEL", 24, "inactive_hallpass_reel");
        A0R = reelType25;
        ReelType reelType26 = new ReelType("MAS_REEL", 25, "mas_reel");
        A0S = reelType26;
        ReelType reelType27 = new ReelType("MEDIA_RESHARE", 26, "media_reshare");
        A0T = reelType27;
        ReelType reelType28 = new ReelType("MEMORY_REEL", 27, "memory_reel");
        A0U = reelType28;
        ReelType reelType29 = new ReelType("MY_WEEK", 28, "my_week_reel");
        A0V = reelType29;
        ReelType reelType30 = new ReelType("NETEGO_REEL", 29, "netego_reel");
        A0W = reelType30;
        ReelType reelType31 = new ReelType("NUX_REEL", 30, "nux_reel");
        A0X = reelType31;
        ReelType reelType32 = new ReelType("PRIVATE_STORY_REEL", 31, "private_story");
        A0Y = reelType32;
        ReelType reelType33 = new ReelType("PROMPT_STICKER_REEL", 32, "prompt_sticker_reel");
        A0Z = reelType33;
        ReelType reelType34 = new ReelType("RECONSIDERATION_INJECTED_STORY", 33, "reconsideration_injected_story");
        A0a = reelType34;
        ReelType reelType35 = new ReelType("SHOPPING_AUTO_HIGHLIGHT_REEL", 34, "shopping_auto_highlight_reel");
        A0b = reelType35;
        ReelType reelType36 = new ReelType("SHOPPING_PDP_REEL", 35, "shopping_pdp_reel");
        A0c = reelType36;
        ReelType reelType37 = new ReelType("SHOPPING_SMART_REEL", 36, "shopping_smart_reel");
        A0d = reelType37;
        ReelType reelType38 = new ReelType("SMART_REEL", 37, "smart_reel");
        A0e = reelType38;
        ReelType reelType39 = new ReelType("STORY_EVENT_REEL_DEPRECATED", 38, "story_event_reel");
        A0f = reelType39;
        ReelType reelType40 = new ReelType("SUBSCRIPTION_SHOUTOUT_MENTION", 39, "subscription_shoutout_mention");
        A0g = reelType40;
        ReelType reelType41 = new ReelType("SUGGESTED_USER", 40, "suggested_user");
        A0h = reelType41;
        ReelType reelType42 = new ReelType("SUGGESTED_USER_REEL", 41, "suggested_user_reel");
        A0i = reelType42;
        ReelType reelType43 = new ReelType("SUPERLATIVE_REEL", 42, "superlative_reel");
        A0j = reelType43;
        ReelType reelType44 = new ReelType("TRENDING_PROMPTS", 43, "trending_prompts");
        A0k = reelType44;
        ReelType reelType45 = new ReelType("TRENDING_TEMPLATES", 44, "trending_templates");
        A0l = reelType45;
        ReelType reelType46 = new ReelType("USER_REEL", 45, "user_reel");
        A0n = reelType46;
        ReelType[] reelTypeArr = new ReelType[46];
        System.arraycopy(new ReelType[]{reelType, reelType2, reelType3, reelType4, reelType5, reelType6, reelType7, reelType8, reelType9, reelType10, reelType11, reelType12, reelType13, reelType14, reelType15, reelType16, reelType17, reelType18, reelType19, reelType20, reelType21, reelType22, reelType23, reelType24, reelType25, reelType26, reelType27}, 0, reelTypeArr, 0, 27);
        System.arraycopy(new ReelType[]{reelType28, reelType29, reelType30, reelType31, reelType32, reelType33, reelType34, reelType35, reelType36, reelType37, reelType38, reelType39, reelType40, reelType41, reelType42, reelType43, reelType44, reelType45, reelType46}, 0, reelTypeArr, 27, 19);
        A03 = reelTypeArr;
        A02 = AbstractC12190kN.A00(reelTypeArr);
        ReelType[] values = values();
        int A0L2 = AbstractC16850sd.A0L(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L2 < 16 ? 16 : A0L2);
        for (ReelType reelType47 : values) {
            linkedHashMap.put(reelType47.A00, reelType47);
        }
        A01 = linkedHashMap;
        CREATOR = new C9Ay(27);
    }

    public static ReelType valueOf(String str) {
        return (ReelType) Enum.valueOf(ReelType.class, str);
    }

    public static ReelType[] values() {
        return (ReelType[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public ReelType(String str, int i, String str2) {
        this.A00 = str2;
    }
}
