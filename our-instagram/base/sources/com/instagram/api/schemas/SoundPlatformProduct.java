package com.instagram.api.schemas;

import X.AbstractC12190kN;
import X.AbstractC167027dH;
import X.AbstractC25225BEi;
import X.AbstractC37302Gc3;
import X.C41857IgB;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class SoundPlatformProduct implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ SoundPlatformProduct[] A03;
    public static final SoundPlatformProduct A04;
    public static final SoundPlatformProduct A05;
    public static final SoundPlatformProduct A06;
    public static final SoundPlatformProduct A07;
    public static final SoundPlatformProduct A08;
    public static final SoundPlatformProduct A09;
    public static final SoundPlatformProduct A0A;
    public static final SoundPlatformProduct A0B;
    public static final SoundPlatformProduct A0C;
    public static final SoundPlatformProduct A0D;
    public static final SoundPlatformProduct A0E;
    public static final SoundPlatformProduct A0F;
    public static final SoundPlatformProduct A0G;
    public static final SoundPlatformProduct A0H;
    public static final SoundPlatformProduct A0I;
    public static final SoundPlatformProduct A0J;
    public static final SoundPlatformProduct A0K;
    public static final SoundPlatformProduct A0L;
    public static final SoundPlatformProduct A0M;
    public static final SoundPlatformProduct A0N;
    public static final SoundPlatformProduct A0O;
    public static final SoundPlatformProduct A0P;
    public static final SoundPlatformProduct A0Q;
    public static final SoundPlatformProduct A0R;
    public static final SoundPlatformProduct A0S;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        SoundPlatformProduct soundPlatformProduct = new SoundPlatformProduct("UNRECOGNIZED", 0, "SoundPlatformProduct_unspecified");
        A0S = soundPlatformProduct;
        SoundPlatformProduct soundPlatformProduct2 = new SoundPlatformProduct("IGLITE_STORY", 1, "IGLITE_STORY");
        A04 = soundPlatformProduct2;
        SoundPlatformProduct soundPlatformProduct3 = new SoundPlatformProduct("IG_AUDIO_COMMENTS", 2, "IG_AUDIO_COMMENTS");
        A05 = soundPlatformProduct3;
        SoundPlatformProduct soundPlatformProduct4 = new SoundPlatformProduct("IG_AUDIO_FILTERS", 3, "IG_AUDIO_FILTERS");
        A06 = soundPlatformProduct4;
        SoundPlatformProduct soundPlatformProduct5 = new SoundPlatformProduct("IG_BOOST_ADS", 4, "IG_BOOST_ADS");
        A08 = soundPlatformProduct5;
        SoundPlatformProduct soundPlatformProduct6 = new SoundPlatformProduct("IG_CLIPS_MUSIC_RECOMMENDATION_MIDCARD", 5, "IG_CLIPS_MUSIC_RECOMMENDATION_MIDCARD");
        A09 = soundPlatformProduct6;
        SoundPlatformProduct soundPlatformProduct7 = new SoundPlatformProduct("IG_FROM_FB_CROSSPOST_REELS", 6, "IG_FROM_FB_CROSSPOST_REELS");
        A0A = soundPlatformProduct7;
        SoundPlatformProduct soundPlatformProduct8 = new SoundPlatformProduct("IG_FROM_FB_CROSSPOST_STORY", 7, "IG_FROM_FB_CROSSPOST_STORY");
        A0B = soundPlatformProduct8;
        SoundPlatformProduct soundPlatformProduct9 = new SoundPlatformProduct("IG_AUDIO_GLOBAL_SEARCH", 8, "IG_GLOBAL_SEARCH");
        A07 = soundPlatformProduct9;
        SoundPlatformProduct soundPlatformProduct10 = new SoundPlatformProduct("IG_INTERNAL_ADMIN_TOOL_CLIPS_SEARCH_PAGE", 9, "IG_INTERNAL_ADMIN_TOOL_CLIPS_SEARCH_PAGE");
        A0C = soundPlatformProduct10;
        SoundPlatformProduct soundPlatformProduct11 = new SoundPlatformProduct("IG_MUSIC_IN_COMMENTS", 10, "IG_MUSIC_IN_COMMENTS");
        A0D = soundPlatformProduct11;
        SoundPlatformProduct soundPlatformProduct12 = new SoundPlatformProduct("IG_MUSIC_NOTES", 11, "IG_MUSIC_NOTES");
        A0E = soundPlatformProduct12;
        SoundPlatformProduct soundPlatformProduct13 = new SoundPlatformProduct("IG_MUSIC_ON_FEED", 12, "IG_MUSIC_ON_FEED");
        A0F = soundPlatformProduct13;
        SoundPlatformProduct soundPlatformProduct14 = new SoundPlatformProduct("IG_MUSIC_ON_PROFILE", 13, "IG_MUSIC_ON_PROFILE");
        A0G = soundPlatformProduct14;
        SoundPlatformProduct soundPlatformProduct15 = new SoundPlatformProduct("IG_MUSIC_OVERLAY_POST_CAPTURE", 14, "IG_MUSIC_OVERLAY_POST_CAPTURE");
        A0H = soundPlatformProduct15;
        SoundPlatformProduct soundPlatformProduct16 = new SoundPlatformProduct("IG_MUSIC_OVERLAY_PRE_CAPTURE", 15, "IG_MUSIC_OVERLAY_PRE_CAPTURE");
        A0I = soundPlatformProduct16;
        SoundPlatformProduct soundPlatformProduct17 = new SoundPlatformProduct("IG_MUSIC_STATUS", 16, "IG_MUSIC_STATUS");
        A0J = soundPlatformProduct17;
        SoundPlatformProduct soundPlatformProduct18 = new SoundPlatformProduct("IG_MUSIC_TAB_ON_PROFILE", 17, "IG_MUSIC_TAB_ON_PROFILE");
        A0K = soundPlatformProduct18;
        SoundPlatformProduct soundPlatformProduct19 = new SoundPlatformProduct("IG_PLAYLIST_PAGE", 18, "IG_PLAYLIST_PAGE");
        A0L = soundPlatformProduct19;
        SoundPlatformProduct soundPlatformProduct20 = new SoundPlatformProduct("IG_QUESTION_REPLY", 19, "IG_QUESTION_REPLY");
        A0M = soundPlatformProduct20;
        SoundPlatformProduct soundPlatformProduct21 = new SoundPlatformProduct("IG_QUESTION_RESHARE", 20, "IG_QUESTION_RESHARE");
        A0N = soundPlatformProduct21;
        SoundPlatformProduct soundPlatformProduct22 = new SoundPlatformProduct("IG_SEARCH_AUDIO_HCM", 21, "IG_SEARCH_AUDIO_HCM");
        A0O = soundPlatformProduct22;
        SoundPlatformProduct soundPlatformProduct23 = new SoundPlatformProduct("IG_STORY_CAMERA_CLIPS", 22, "IG_STORY_CAMERA_CLIPS");
        A0P = soundPlatformProduct23;
        SoundPlatformProduct soundPlatformProduct24 = new SoundPlatformProduct("IG_STORY_CAMERA_CLIPS_V2", 23, "IG_STORY_CAMERA_CLIPS_V2");
        A0Q = soundPlatformProduct24;
        SoundPlatformProduct soundPlatformProduct25 = new SoundPlatformProduct("IG_STORY_MUSIC_AR_EFFECT", 24, "IG_STORY_MUSIC_AR_EFFECT");
        A0R = soundPlatformProduct25;
        SoundPlatformProduct[] soundPlatformProductArr = {soundPlatformProduct, soundPlatformProduct2, soundPlatformProduct3, soundPlatformProduct4, soundPlatformProduct5, soundPlatformProduct6, soundPlatformProduct7, soundPlatformProduct8, soundPlatformProduct9, soundPlatformProduct10, soundPlatformProduct11, soundPlatformProduct12, soundPlatformProduct13, soundPlatformProduct14, soundPlatformProduct15, soundPlatformProduct16, soundPlatformProduct17, soundPlatformProduct18, soundPlatformProduct19, soundPlatformProduct20, soundPlatformProduct21, soundPlatformProduct22, soundPlatformProduct23, soundPlatformProduct24, soundPlatformProduct25, new SoundPlatformProduct("IG_STORY_MUSIC_AR_EFFECT_DEMO", 25, "IG_STORY_MUSIC_AR_EFFECT_DEMO")};
        A03 = soundPlatformProductArr;
        A02 = AbstractC12190kN.A00(soundPlatformProductArr);
        SoundPlatformProduct[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC37302Gc3.A01(values.length));
        for (SoundPlatformProduct soundPlatformProduct26 : values) {
            A18.put(soundPlatformProduct26.A00, soundPlatformProduct26);
        }
        A01 = A18;
        CREATOR = C41857IgB.A00(6);
    }

    public static SoundPlatformProduct valueOf(String str) {
        return (SoundPlatformProduct) Enum.valueOf(SoundPlatformProduct.class, str);
    }

    public static SoundPlatformProduct[] values() {
        return (SoundPlatformProduct[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public SoundPlatformProduct(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
