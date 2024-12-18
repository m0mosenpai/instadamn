package com.instagram.api.schemas;

import X.AbstractC12190kN;
import X.AbstractC167027dH;
import X.AbstractC16850sd;
import X.AbstractC25225BEi;
import X.C41858IgC;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class IGCreatorIncentiveProgram implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ IGCreatorIncentiveProgram[] A03;
    public static final IGCreatorIncentiveProgram A04;
    public static final IGCreatorIncentiveProgram A05;
    public static final IGCreatorIncentiveProgram A06;
    public static final IGCreatorIncentiveProgram A07;
    public static final IGCreatorIncentiveProgram A08;
    public static final IGCreatorIncentiveProgram A09;
    public static final IGCreatorIncentiveProgram A0A;
    public static final IGCreatorIncentiveProgram A0B;
    public static final IGCreatorIncentiveProgram A0C;
    public static final IGCreatorIncentiveProgram A0D;
    public static final IGCreatorIncentiveProgram A0E;
    public static final IGCreatorIncentiveProgram A0F;
    public static final IGCreatorIncentiveProgram A0G;
    public static final IGCreatorIncentiveProgram A0H;
    public static final IGCreatorIncentiveProgram A0I;
    public static final IGCreatorIncentiveProgram A0J;
    public static final IGCreatorIncentiveProgram A0K;
    public static final IGCreatorIncentiveProgram A0L;
    public static final IGCreatorIncentiveProgram A0M;
    public static final IGCreatorIncentiveProgram A0N;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        IGCreatorIncentiveProgram iGCreatorIncentiveProgram = new IGCreatorIncentiveProgram("UNRECOGNIZED", 0, "IGCreatorIncentiveProgram_unspecified");
        A0N = iGCreatorIncentiveProgram;
        IGCreatorIncentiveProgram iGCreatorIncentiveProgram2 = new IGCreatorIncentiveProgram("BONUS_PERFORMANCE_JAPAN", 1, "ig_bonus_performance_japan");
        A05 = iGCreatorIncentiveProgram2;
        IGCreatorIncentiveProgram iGCreatorIncentiveProgram3 = new IGCreatorIncentiveProgram("BONUS_PERFORMANCE_US_CA", 2, "ig_bonus_performance_us_canada");
        A06 = iGCreatorIncentiveProgram3;
        IGCreatorIncentiveProgram iGCreatorIncentiveProgram4 = new IGCreatorIncentiveProgram("POSTS_REELS_BONUS_JAPAN", 3, "ig_bonus_posts_reels_japan");
        A09 = iGCreatorIncentiveProgram4;
        IGCreatorIncentiveProgram iGCreatorIncentiveProgram5 = new IGCreatorIncentiveProgram("BLENDED_POSTS_REELS_BONUS_KOREA", 4, "ig_bonus_posts_reels_korea");
        A04 = iGCreatorIncentiveProgram5;
        IGCreatorIncentiveProgram iGCreatorIncentiveProgram6 = new IGCreatorIncentiveProgram("POSTS_REELS_BONUS_US", 5, "ig_bonus_posts_reels_us");
        A0A = iGCreatorIncentiveProgram6;
        IGCreatorIncentiveProgram iGCreatorIncentiveProgram7 = new IGCreatorIncentiveProgram("PARTNERSHIP_ADS_CREATOR_PAYMENTS", 6, "ig_pa_creator_payments");
        A08 = iGCreatorIncentiveProgram7;
        IGCreatorIncentiveProgram iGCreatorIncentiveProgram8 = new IGCreatorIncentiveProgram("THREADS_BONUS", 7, "ig_threads_bonus");
        A0M = iGCreatorIncentiveProgram8;
        IGCreatorIncentiveProgram iGCreatorIncentiveProgram9 = new IGCreatorIncentiveProgram("LATINX", 8, "latinx");
        A07 = iGCreatorIncentiveProgram9;
        IGCreatorIncentiveProgram iGCreatorIncentiveProgram10 = new IGCreatorIncentiveProgram("RAP_COMEDY_CLUB", 9, "rap_comedy_club");
        A0B = iGCreatorIncentiveProgram10;
        IGCreatorIncentiveProgram iGCreatorIncentiveProgram11 = new IGCreatorIncentiveProgram("REELS_BOOST", 10, "reels_boost");
        A0C = iGCreatorIncentiveProgram11;
        IGCreatorIncentiveProgram iGCreatorIncentiveProgram12 = new IGCreatorIncentiveProgram("REELS_EOY_RECAP_BOOST", 11, "reels_eoy_recap_boost");
        A0D = iGCreatorIncentiveProgram12;
        IGCreatorIncentiveProgram iGCreatorIncentiveProgram13 = new IGCreatorIncentiveProgram("REELS_ON_THE_RISE", 12, "reels_on_the_rise");
        A0E = iGCreatorIncentiveProgram13;
        IGCreatorIncentiveProgram iGCreatorIncentiveProgram14 = new IGCreatorIncentiveProgram("REELS_PERFORMANCE_FUND", 13, "reels_performance_fund");
        A0F = iGCreatorIncentiveProgram14;
        IGCreatorIncentiveProgram iGCreatorIncentiveProgram15 = new IGCreatorIncentiveProgram("REELS_PLAY_INDIA", 14, "reels_play_india");
        A0G = iGCreatorIncentiveProgram15;
        IGCreatorIncentiveProgram iGCreatorIncentiveProgram16 = new IGCreatorIncentiveProgram("REELS_PLAY_KOREA", 15, "reels_play_korea");
        A0H = iGCreatorIncentiveProgram16;
        IGCreatorIncentiveProgram iGCreatorIncentiveProgram17 = new IGCreatorIncentiveProgram("REELS_WELCOME", 16, "reels_welcome");
        A0I = iGCreatorIncentiveProgram17;
        IGCreatorIncentiveProgram iGCreatorIncentiveProgram18 = new IGCreatorIncentiveProgram("SPARK_AR_BOREALIS_AR_FOR_REELS", 17, "spark_ar_borealis_ar_for_reels");
        A0J = iGCreatorIncentiveProgram18;
        IGCreatorIncentiveProgram iGCreatorIncentiveProgram19 = new IGCreatorIncentiveProgram("SPARK_AR_BOREALIS_GROUP_EFFECTS", 18, "spark_ar_borealis_group_effects");
        A0K = iGCreatorIncentiveProgram19;
        IGCreatorIncentiveProgram iGCreatorIncentiveProgram20 = new IGCreatorIncentiveProgram("SPEAKER_ENGAGEMENT", 19, "speaker_engagement");
        A0L = iGCreatorIncentiveProgram20;
        IGCreatorIncentiveProgram[] iGCreatorIncentiveProgramArr = {iGCreatorIncentiveProgram, iGCreatorIncentiveProgram2, iGCreatorIncentiveProgram3, iGCreatorIncentiveProgram4, iGCreatorIncentiveProgram5, iGCreatorIncentiveProgram6, iGCreatorIncentiveProgram7, iGCreatorIncentiveProgram8, iGCreatorIncentiveProgram9, iGCreatorIncentiveProgram10, iGCreatorIncentiveProgram11, iGCreatorIncentiveProgram12, iGCreatorIncentiveProgram13, iGCreatorIncentiveProgram14, iGCreatorIncentiveProgram15, iGCreatorIncentiveProgram16, iGCreatorIncentiveProgram17, iGCreatorIncentiveProgram18, iGCreatorIncentiveProgram19, iGCreatorIncentiveProgram20, new IGCreatorIncentiveProgram("WE_THE_CULTURE", 20, "we_the_culture")};
        A03 = iGCreatorIncentiveProgramArr;
        A02 = AbstractC12190kN.A00(iGCreatorIncentiveProgramArr);
        IGCreatorIncentiveProgram[] values = values();
        int A0L2 = AbstractC16850sd.A0L(values.length);
        LinkedHashMap A18 = AbstractC25225BEi.A18(A0L2 < 16 ? 16 : A0L2);
        for (IGCreatorIncentiveProgram iGCreatorIncentiveProgram21 : values) {
            A18.put(iGCreatorIncentiveProgram21.A00, iGCreatorIncentiveProgram21);
        }
        A01 = A18;
        CREATOR = new C41858IgC(32);
    }

    public static IGCreatorIncentiveProgram valueOf(String str) {
        return (IGCreatorIncentiveProgram) Enum.valueOf(IGCreatorIncentiveProgram.class, str);
    }

    public static IGCreatorIncentiveProgram[] values() {
        return (IGCreatorIncentiveProgram[]) A03.clone();
    }

    public IGCreatorIncentiveProgram(String str, int i, String str2) {
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
