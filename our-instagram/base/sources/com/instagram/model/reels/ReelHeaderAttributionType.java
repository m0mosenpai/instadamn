package com.instagram.model.reels;

import X.AbstractC12190kN;
import X.C14360o3;
import X.C9Ay;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class ReelHeaderAttributionType implements Parcelable {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ ReelHeaderAttributionType[] A01;
    public static final ReelHeaderAttributionType A02;
    public static final ReelHeaderAttributionType A03;
    public static final ReelHeaderAttributionType A04;
    public static final ReelHeaderAttributionType A05;
    public static final ReelHeaderAttributionType A06;
    public static final ReelHeaderAttributionType A07;
    public static final ReelHeaderAttributionType A08;
    public static final ReelHeaderAttributionType A09;
    public static final ReelHeaderAttributionType A0A;
    public static final ReelHeaderAttributionType A0B;
    public static final ReelHeaderAttributionType A0C;
    public static final ReelHeaderAttributionType A0D;
    public static final ReelHeaderAttributionType A0E;
    public static final ReelHeaderAttributionType A0F;
    public static final ReelHeaderAttributionType A0G;
    public static final ReelHeaderAttributionType A0H;
    public static final ReelHeaderAttributionType A0I;
    public static final ReelHeaderAttributionType A0J;
    public static final ReelHeaderAttributionType A0K;
    public static final ReelHeaderAttributionType A0L;
    public static final ReelHeaderAttributionType A0M;
    public static final ReelHeaderAttributionType A0N;
    public static final ReelHeaderAttributionType A0O;
    public static final ReelHeaderAttributionType A0P;
    public static final ReelHeaderAttributionType A0Q;
    public static final ReelHeaderAttributionType A0R;
    public static final ReelHeaderAttributionType A0S;
    public static final ReelHeaderAttributionType A0T;
    public static final ReelHeaderAttributionType A0U;
    public static final ReelHeaderAttributionType A0V;
    public static final ReelHeaderAttributionType A0W;
    public static final ReelHeaderAttributionType A0X;
    public static final ReelHeaderAttributionType A0Y;
    public static final ReelHeaderAttributionType A0Z;
    public static final ReelHeaderAttributionType A0a;
    public static final ReelHeaderAttributionType A0b;
    public static final ReelHeaderAttributionType A0c;
    public static final ReelHeaderAttributionType A0d;
    public static final ReelHeaderAttributionType A0e;
    public static final ReelHeaderAttributionType A0f;
    public static final ReelHeaderAttributionType A0g;
    public static final ReelHeaderAttributionType A0h;
    public static final ReelHeaderAttributionType A0i;
    public static final ReelHeaderAttributionType A0j;
    public static final ReelHeaderAttributionType A0k;
    public static final ReelHeaderAttributionType A0l;
    public static final ReelHeaderAttributionType A0m;
    public static final ReelHeaderAttributionType A0n;
    public static final ReelHeaderAttributionType A0o;
    public static final ReelHeaderAttributionType A0p;
    public static final ReelHeaderAttributionType A0q;
    public static final ReelHeaderAttributionType A0r;
    public static final ReelHeaderAttributionType A0s;
    public static final ReelHeaderAttributionType A0t;
    public static final ReelHeaderAttributionType A0u;
    public static final ReelHeaderAttributionType A0v;
    public static final ReelHeaderAttributionType A0w;
    public static final Parcelable.Creator CREATOR;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(name());
    }

    static {
        ReelHeaderAttributionType reelHeaderAttributionType = new ReelHeaderAttributionType("APP_ATTRIBUTION", 0);
        A02 = reelHeaderAttributionType;
        ReelHeaderAttributionType reelHeaderAttributionType2 = new ReelHeaderAttributionType("AREFFECT_PREVIEW_ATTRIBUTION", 1);
        A03 = reelHeaderAttributionType2;
        ReelHeaderAttributionType reelHeaderAttributionType3 = new ReelHeaderAttributionType("AVATAR_STICKER_ATTRIBUTION", 2);
        A05 = reelHeaderAttributionType3;
        ReelHeaderAttributionType reelHeaderAttributionType4 = new ReelHeaderAttributionType("AUDIENCE_LISTS_ATTRIBUTION", 3);
        A04 = reelHeaderAttributionType4;
        ReelHeaderAttributionType reelHeaderAttributionType5 = new ReelHeaderAttributionType("BLOKS_ATTRIBUTION", 4);
        A07 = reelHeaderAttributionType5;
        ReelHeaderAttributionType reelHeaderAttributionType6 = new ReelHeaderAttributionType("CAMERA_FORMAT_ATTRIBUTION", 5);
        A08 = reelHeaderAttributionType6;
        ReelHeaderAttributionType reelHeaderAttributionType7 = new ReelHeaderAttributionType("CAMPFIRE_ATTRIBUTION", 6);
        A09 = reelHeaderAttributionType7;
        ReelHeaderAttributionType reelHeaderAttributionType8 = new ReelHeaderAttributionType("CAMPFIRE_SELF_VIEW_ATTRIBUTION", 7);
        A0A = reelHeaderAttributionType8;
        ReelHeaderAttributionType reelHeaderAttributionType9 = new ReelHeaderAttributionType("CANVAS_ATTRIBUTION", 8);
        A0B = reelHeaderAttributionType9;
        ReelHeaderAttributionType reelHeaderAttributionType10 = new ReelHeaderAttributionType("CLIPS_ATTRIBUTION", 9);
        A0D = reelHeaderAttributionType10;
        ReelHeaderAttributionType reelHeaderAttributionType11 = new ReelHeaderAttributionType("CLIPS_FULL_SCREEN_RESHARE_ATTRIBUTION", 10);
        A0E = reelHeaderAttributionType11;
        ReelHeaderAttributionType reelHeaderAttributionType12 = new ReelHeaderAttributionType("CLIPS_RESHARE_ATTRIBUTION", 11);
        A0F = reelHeaderAttributionType12;
        ReelHeaderAttributionType reelHeaderAttributionType13 = new ReelHeaderAttributionType("CLOSE_FRIENDS_ATTRIBUTION", 12);
        A0G = reelHeaderAttributionType13;
        ReelHeaderAttributionType reelHeaderAttributionType14 = new ReelHeaderAttributionType("CHANNEL_CHALLENGE_ATTRIBUTION", 13);
        A0C = reelHeaderAttributionType14;
        ReelHeaderAttributionType reelHeaderAttributionType15 = new ReelHeaderAttributionType("CUTOUT_ANYTHING_ATTRIBUTION", 14);
        A0H = reelHeaderAttributionType15;
        ReelHeaderAttributionType reelHeaderAttributionType16 = new ReelHeaderAttributionType("EFFECT_ATTRIBUTION", 15);
        A0I = reelHeaderAttributionType16;
        ReelHeaderAttributionType reelHeaderAttributionType17 = new ReelHeaderAttributionType("GALLERY_GRID_FORMAT_ATTRIBUTION", 16);
        A0K = reelHeaderAttributionType17;
        ReelHeaderAttributionType reelHeaderAttributionType18 = new ReelHeaderAttributionType("GEN_AI_DETECTION_ATTRIBUTION", 17);
        A0L = reelHeaderAttributionType18;
        ReelHeaderAttributionType reelHeaderAttributionType19 = new ReelHeaderAttributionType("GEN_AI_STICKER_ATTRIBUTION", 18);
        A0M = reelHeaderAttributionType19;
        ReelHeaderAttributionType reelHeaderAttributionType20 = new ReelHeaderAttributionType("GROUP_PROFILE_ATTRIBUTION", 19);
        A0N = reelHeaderAttributionType20;
        ReelHeaderAttributionType reelHeaderAttributionType21 = new ReelHeaderAttributionType("GROUP_REEL_ATTRIBUTION", 20);
        A0O = reelHeaderAttributionType21;
        ReelHeaderAttributionType reelHeaderAttributionType22 = new ReelHeaderAttributionType("HIGHLIGHTS_ATTRIBUTION", 21);
        A0P = reelHeaderAttributionType22;
        ReelHeaderAttributionType reelHeaderAttributionType23 = new ReelHeaderAttributionType("INTERNAL_ATTRIBUTION", 22);
        A0T = reelHeaderAttributionType23;
        ReelHeaderAttributionType reelHeaderAttributionType24 = new ReelHeaderAttributionType("SHARE_TO_FRIENDS_STORY_ATTRIBUTION", 23);
        A0l = reelHeaderAttributionType24;
        ReelHeaderAttributionType reelHeaderAttributionType25 = new ReelHeaderAttributionType("MAGIC_MOD_ATTRIBUTION", 24);
        A0U = reelHeaderAttributionType25;
        ReelHeaderAttributionType reelHeaderAttributionType26 = new ReelHeaderAttributionType("MEMORIES_ATTRIBUTION", 25);
        A0V = reelHeaderAttributionType26;
        ReelHeaderAttributionType reelHeaderAttributionType27 = new ReelHeaderAttributionType("MESSAGE_SHARE_ATTRIBUTION", 26);
        A0W = reelHeaderAttributionType27;
        ReelHeaderAttributionType reelHeaderAttributionType28 = new ReelHeaderAttributionType("META_AI_ATTRIBUTION", 27);
        A0X = reelHeaderAttributionType28;
        ReelHeaderAttributionType reelHeaderAttributionType29 = new ReelHeaderAttributionType("MULTIPLE_LISTS_ATTRIBUTION", 28);
        A0Z = reelHeaderAttributionType29;
        ReelHeaderAttributionType reelHeaderAttributionType30 = new ReelHeaderAttributionType("MUSIC_ATTRIBUTION", 29);
        A0a = reelHeaderAttributionType30;
        ReelHeaderAttributionType reelHeaderAttributionType31 = new ReelHeaderAttributionType("PERSISTED_REEL_ATTRIBUTION", 30);
        A0b = reelHeaderAttributionType31;
        ReelHeaderAttributionType reelHeaderAttributionType32 = new ReelHeaderAttributionType("POLAROID_STICKER_ATTRIBUTION", 31);
        A0c = reelHeaderAttributionType32;
        ReelHeaderAttributionType reelHeaderAttributionType33 = new ReelHeaderAttributionType("SECRET_STICKER_ATTRIBUTION", 32);
        A0k = reelHeaderAttributionType33;
        ReelHeaderAttributionType reelHeaderAttributionType34 = new ReelHeaderAttributionType("RESHARED_REEL_ATTRIBUTION", 33);
        A0g = reelHeaderAttributionType34;
        ReelHeaderAttributionType reelHeaderAttributionType35 = new ReelHeaderAttributionType("RESHARE_ATTRIBUTION", 34);
        A0h = reelHeaderAttributionType35;
        ReelHeaderAttributionType reelHeaderAttributionType36 = new ReelHeaderAttributionType("ROLL_CALL_FIRST_TAKE", 35);
        A0i = reelHeaderAttributionType36;
        ReelHeaderAttributionType reelHeaderAttributionType37 = new ReelHeaderAttributionType("ROLL_CALL_TIMEBOX", 36);
        A0j = reelHeaderAttributionType37;
        ReelHeaderAttributionType reelHeaderAttributionType38 = new ReelHeaderAttributionType("SPONSORED_TAG_ATTRIBUTION", 37);
        A0m = reelHeaderAttributionType38;
        ReelHeaderAttributionType reelHeaderAttributionType39 = new ReelHeaderAttributionType("STATE_SPONSORED_MEDIA_LABEL_ATTRIBUTION", 38);
        A0n = reelHeaderAttributionType39;
        ReelHeaderAttributionType reelHeaderAttributionType40 = new ReelHeaderAttributionType("STORY_TEMPLATE_ATTRIBUTION", 39);
        A0q = reelHeaderAttributionType40;
        ReelHeaderAttributionType reelHeaderAttributionType41 = new ReelHeaderAttributionType("IMAGINE_TEMPLATE_ATTRIBUTION", 40);
        A0S = reelHeaderAttributionType41;
        ReelHeaderAttributionType reelHeaderAttributionType42 = new ReelHeaderAttributionType("SUGGESTED_REEL_ATTRIBUTION", 41);
        A0r = reelHeaderAttributionType42;
        ReelHeaderAttributionType reelHeaderAttributionType43 = new ReelHeaderAttributionType("TRANSLATION_ATTRIBUTION", 42);
        A0t = reelHeaderAttributionType43;
        ReelHeaderAttributionType reelHeaderAttributionType44 = new ReelHeaderAttributionType("UNLOCKABLE_STICKER", 43);
        A0u = reelHeaderAttributionType44;
        ReelHeaderAttributionType reelHeaderAttributionType45 = new ReelHeaderAttributionType("VIDEO_CALL_ATTRIBUTION", 44);
        A0v = reelHeaderAttributionType45;
        ReelHeaderAttributionType reelHeaderAttributionType46 = new ReelHeaderAttributionType("WEARABLE_ATTRIBUTION", 45);
        A0w = reelHeaderAttributionType46;
        ReelHeaderAttributionType reelHeaderAttributionType47 = new ReelHeaderAttributionType("HORIZON_WORLDS_ATTRIBUTION", 46);
        A0Q = reelHeaderAttributionType47;
        ReelHeaderAttributionType reelHeaderAttributionType48 = new ReelHeaderAttributionType("META_QUEST_ATTRIBUTION", 47);
        A0Y = reelHeaderAttributionType48;
        ReelHeaderAttributionType reelHeaderAttributionType49 = new ReelHeaderAttributionType("SUPERLATIVE", 48);
        A0s = reelHeaderAttributionType49;
        ReelHeaderAttributionType reelHeaderAttributionType50 = new ReelHeaderAttributionType("PUBLISHED_SUPERLATIVE", 49);
        A0e = reelHeaderAttributionType50;
        ReelHeaderAttributionType reelHeaderAttributionType51 = new ReelHeaderAttributionType("STORIES_TEASER", 50);
        A0o = reelHeaderAttributionType51;
        ReelHeaderAttributionType reelHeaderAttributionType52 = new ReelHeaderAttributionType("EXPLORE_SHAREABLE_GRID", 51);
        A0J = reelHeaderAttributionType52;
        ReelHeaderAttributionType reelHeaderAttributionType53 = new ReelHeaderAttributionType("STORY_SNAPSHOT", 52);
        A0p = reelHeaderAttributionType53;
        ReelHeaderAttributionType reelHeaderAttributionType54 = new ReelHeaderAttributionType("PUBLIC_COLLECTION", 53);
        A0d = reelHeaderAttributionType54;
        ReelHeaderAttributionType reelHeaderAttributionType55 = new ReelHeaderAttributionType("ICONIC_ENTRYPOINTS", 54);
        A0R = reelHeaderAttributionType55;
        ReelHeaderAttributionType reelHeaderAttributionType56 = new ReelHeaderAttributionType("BARCELONA_SHARE", 55);
        A06 = reelHeaderAttributionType56;
        ReelHeaderAttributionType reelHeaderAttributionType57 = new ReelHeaderAttributionType("QUICKSNAP_RECAP", 56);
        A0f = reelHeaderAttributionType57;
        ReelHeaderAttributionType[] reelHeaderAttributionTypeArr = new ReelHeaderAttributionType[57];
        System.arraycopy(new ReelHeaderAttributionType[]{reelHeaderAttributionType, reelHeaderAttributionType2, reelHeaderAttributionType3, reelHeaderAttributionType4, reelHeaderAttributionType5, reelHeaderAttributionType6, reelHeaderAttributionType7, reelHeaderAttributionType8, reelHeaderAttributionType9, reelHeaderAttributionType10, reelHeaderAttributionType11, reelHeaderAttributionType12, reelHeaderAttributionType13, reelHeaderAttributionType14, reelHeaderAttributionType15, reelHeaderAttributionType16, reelHeaderAttributionType17, reelHeaderAttributionType18, reelHeaderAttributionType19, reelHeaderAttributionType20, reelHeaderAttributionType21, reelHeaderAttributionType22, reelHeaderAttributionType23, reelHeaderAttributionType24, reelHeaderAttributionType25, reelHeaderAttributionType26, reelHeaderAttributionType27}, 0, reelHeaderAttributionTypeArr, 0, 27);
        System.arraycopy(new ReelHeaderAttributionType[]{reelHeaderAttributionType28, reelHeaderAttributionType29, reelHeaderAttributionType30, reelHeaderAttributionType31, reelHeaderAttributionType32, reelHeaderAttributionType33, reelHeaderAttributionType34, reelHeaderAttributionType35, reelHeaderAttributionType36, reelHeaderAttributionType37, reelHeaderAttributionType38, reelHeaderAttributionType39, reelHeaderAttributionType40, reelHeaderAttributionType41, reelHeaderAttributionType42, reelHeaderAttributionType43, reelHeaderAttributionType44, reelHeaderAttributionType45, reelHeaderAttributionType46, reelHeaderAttributionType47, reelHeaderAttributionType48, reelHeaderAttributionType49, reelHeaderAttributionType50, reelHeaderAttributionType51, reelHeaderAttributionType52, reelHeaderAttributionType53, reelHeaderAttributionType54}, 0, reelHeaderAttributionTypeArr, 27, 27);
        System.arraycopy(new ReelHeaderAttributionType[]{reelHeaderAttributionType55, reelHeaderAttributionType56, reelHeaderAttributionType57}, 0, reelHeaderAttributionTypeArr, 54, 3);
        A01 = reelHeaderAttributionTypeArr;
        A00 = AbstractC12190kN.A00(reelHeaderAttributionTypeArr);
        CREATOR = new C9Ay(26);
    }

    public static ReelHeaderAttributionType valueOf(String str) {
        return (ReelHeaderAttributionType) Enum.valueOf(ReelHeaderAttributionType.class, str);
    }

    public static ReelHeaderAttributionType[] values() {
        return (ReelHeaderAttributionType[]) A01.clone();
    }

    public ReelHeaderAttributionType(String str, int i) {
    }
}
