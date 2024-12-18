package com.instagram.api.schemas;

import X.AbstractC12190kN;
import X.AbstractC167027dH;
import X.AbstractC25225BEi;
import X.AbstractC37302Gc3;
import X.C41854Ig8;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes12.dex */
public final class ClipsMidCardType implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ ClipsMidCardType[] A03;
    public static final ClipsMidCardType A04;
    public static final ClipsMidCardType A05;
    public static final ClipsMidCardType A06;
    public static final ClipsMidCardType A07;
    public static final ClipsMidCardType A08;
    public static final ClipsMidCardType A09;
    public static final ClipsMidCardType A0A;
    public static final ClipsMidCardType A0B;
    public static final ClipsMidCardType A0C;
    public static final ClipsMidCardType A0D;
    public static final ClipsMidCardType A0E;
    public static final ClipsMidCardType A0F;
    public static final ClipsMidCardType A0G;
    public static final ClipsMidCardType A0H;
    public static final ClipsMidCardType A0I;
    public static final ClipsMidCardType A0J;
    public static final ClipsMidCardType A0K;
    public static final ClipsMidCardType A0L;
    public static final ClipsMidCardType A0M;
    public static final ClipsMidCardType A0N;
    public static final ClipsMidCardType A0O;
    public static final ClipsMidCardType A0P;
    public static final ClipsMidCardType A0Q;
    public static final ClipsMidCardType A0R;
    public static final ClipsMidCardType A0S;
    public static final ClipsMidCardType A0T;
    public static final ClipsMidCardType A0U;
    public static final ClipsMidCardType A0V;
    public static final ClipsMidCardType A0W;
    public static final ClipsMidCardType A0X;
    public static final ClipsMidCardType A0Y;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        ClipsMidCardType clipsMidCardType = new ClipsMidCardType("UNRECOGNIZED", 0, "ClipsMidCardType_unspecified");
        A0Y = clipsMidCardType;
        ClipsMidCardType clipsMidCardType2 = new ClipsMidCardType("CAMERA_ROLL", 1, "camera_roll");
        A04 = clipsMidCardType2;
        ClipsMidCardType clipsMidCardType3 = new ClipsMidCardType("CREATION_INSPIRATION", 2, "creation_inspiration");
        A05 = clipsMidCardType3;
        ClipsMidCardType clipsMidCardType4 = new ClipsMidCardType("CREATION_TOOL", 3, "creation_tool");
        A06 = clipsMidCardType4;
        ClipsMidCardType clipsMidCardType5 = new ClipsMidCardType("DRAFT", 4, "draft");
        A07 = clipsMidCardType5;
        ClipsMidCardType clipsMidCardType6 = new ClipsMidCardType("FEED_COLLECTION", 5, "feed_collection");
        A08 = clipsMidCardType6;
        ClipsMidCardType clipsMidCardType7 = new ClipsMidCardType("GREEN_SCREEN", 6, "green_screen");
        A09 = clipsMidCardType7;
        ClipsMidCardType clipsMidCardType8 = new ClipsMidCardType("GROWTH_BEST_PRACTICES", 7, "growth_best_practices");
        A0A = clipsMidCardType8;
        ClipsMidCardType clipsMidCardType9 = new ClipsMidCardType("INSPIRATION_HUB", 8, "inspiration_hub");
        A0B = clipsMidCardType9;
        ClipsMidCardType clipsMidCardType10 = new ClipsMidCardType("LIKED_BY_FOLLOWEE", 9, "liked_by_followee");
        A0C = clipsMidCardType10;
        ClipsMidCardType clipsMidCardType11 = new ClipsMidCardType("META_GALLERY", 10, "meta_gallery");
        A0D = clipsMidCardType11;
        ClipsMidCardType clipsMidCardType12 = new ClipsMidCardType("MULTI_PLAYLIST", 11, "multi_playlist");
        A0E = clipsMidCardType12;
        ClipsMidCardType clipsMidCardType13 = new ClipsMidCardType("MUSIC_RECOMMENDATION", 12, "music_recommendation");
        A0F = clipsMidCardType13;
        ClipsMidCardType clipsMidCardType14 = new ClipsMidCardType("NME_LINKS_IN_REELS", 13, "nme_links_in_reels");
        A0G = clipsMidCardType14;
        ClipsMidCardType clipsMidCardType15 = new ClipsMidCardType("POPULAR_AUDIO", 14, "popular_audio");
        A0H = clipsMidCardType15;
        ClipsMidCardType clipsMidCardType16 = new ClipsMidCardType("POPULAR_COLLAB_REELS", 15, "popular_collab_reels");
        A0I = clipsMidCardType16;
        ClipsMidCardType clipsMidCardType17 = new ClipsMidCardType("POPULAR_REELS", 16, "popular_reels");
        A0J = clipsMidCardType17;
        ClipsMidCardType clipsMidCardType18 = new ClipsMidCardType("PRODUCER_FEEDBACK", 17, "producer_feedback");
        A0K = clipsMidCardType18;
        ClipsMidCardType clipsMidCardType19 = new ClipsMidCardType("PROMPT", 18, "prompt");
        A0L = clipsMidCardType19;
        ClipsMidCardType clipsMidCardType20 = new ClipsMidCardType("RECENTLY_SAVED_AUDIO", 19, "recently_saved_audio");
        A0M = clipsMidCardType20;
        ClipsMidCardType clipsMidCardType21 = new ClipsMidCardType("REELS_INSIGHTS", 20, "reels_insights");
        A0N = clipsMidCardType21;
        ClipsMidCardType clipsMidCardType22 = new ClipsMidCardType("REELS_SURPRISE", 21, "reels_surprise");
        A0O = clipsMidCardType22;
        ClipsMidCardType clipsMidCardType23 = new ClipsMidCardType("SINGLE_PLAYLIST", 22, "single_playlist");
        A0P = clipsMidCardType23;
        ClipsMidCardType clipsMidCardType24 = new ClipsMidCardType("STORIES_IN_REELS", 23, "stories_in_reels");
        A0Q = clipsMidCardType24;
        ClipsMidCardType clipsMidCardType25 = new ClipsMidCardType("STORY", 24, "story");
        A0R = clipsMidCardType25;
        ClipsMidCardType clipsMidCardType26 = new ClipsMidCardType("STORY_TO_REEL", 25, "story_to_reel");
        A0S = clipsMidCardType26;
        ClipsMidCardType clipsMidCardType27 = new ClipsMidCardType("TEMPLATE", 26, "template");
        A0T = clipsMidCardType27;
        ClipsMidCardType clipsMidCardType28 = new ClipsMidCardType("TOP_IN_CREATOR_VERTICAL", 27, "top_in_creator_vertical");
        A0U = clipsMidCardType28;
        ClipsMidCardType clipsMidCardType29 = new ClipsMidCardType("TOP_RESHARED", 28, "top_reshared");
        A0V = clipsMidCardType29;
        ClipsMidCardType clipsMidCardType30 = new ClipsMidCardType("TREND", 29, "trend");
        A0W = clipsMidCardType30;
        ClipsMidCardType clipsMidCardType31 = new ClipsMidCardType("TRENDING_TRACK_WITH_SIMILAR_ACCOUNTS", 30, "trending_track_with_similar_accounts");
        A0X = clipsMidCardType31;
        ClipsMidCardType[] clipsMidCardTypeArr = new ClipsMidCardType[31];
        System.arraycopy(new ClipsMidCardType[]{clipsMidCardType, clipsMidCardType2, clipsMidCardType3, clipsMidCardType4, clipsMidCardType5, clipsMidCardType6, clipsMidCardType7, clipsMidCardType8, clipsMidCardType9, clipsMidCardType10, clipsMidCardType11, clipsMidCardType12, clipsMidCardType13, clipsMidCardType14, clipsMidCardType15, clipsMidCardType16, clipsMidCardType17, clipsMidCardType18, clipsMidCardType19, clipsMidCardType20, clipsMidCardType21, clipsMidCardType22, clipsMidCardType23, clipsMidCardType24, clipsMidCardType25, clipsMidCardType26, clipsMidCardType27}, 0, clipsMidCardTypeArr, 0, 27);
        System.arraycopy(new ClipsMidCardType[]{clipsMidCardType28, clipsMidCardType29, clipsMidCardType30, clipsMidCardType31}, 0, clipsMidCardTypeArr, 27, 4);
        A03 = clipsMidCardTypeArr;
        A02 = AbstractC12190kN.A00(clipsMidCardTypeArr);
        ClipsMidCardType[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC37302Gc3.A01(values.length));
        for (ClipsMidCardType clipsMidCardType32 : values) {
            A18.put(clipsMidCardType32.A00, clipsMidCardType32);
        }
        A01 = A18;
        CREATOR = new C41854Ig8(9);
    }

    public static ClipsMidCardType valueOf(String str) {
        return (ClipsMidCardType) Enum.valueOf(ClipsMidCardType.class, str);
    }

    public static ClipsMidCardType[] values() {
        return (ClipsMidCardType[]) A03.clone();
    }

    public ClipsMidCardType(String str, int i, String str2) {
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
