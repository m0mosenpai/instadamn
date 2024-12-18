package com.instagram.api.schemas;

import X.AbstractC12190kN;
import X.AbstractC167027dH;
import X.AbstractC37302Gc3;
import X.C41858IgC;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class InstagramMediaProductType implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ InstagramMediaProductType[] A03;
    public static final InstagramMediaProductType A04;
    public static final InstagramMediaProductType A05;
    public static final InstagramMediaProductType A06;
    public static final InstagramMediaProductType A07;
    public static final InstagramMediaProductType A08;
    public static final InstagramMediaProductType A09;
    public static final InstagramMediaProductType A0A;
    public static final InstagramMediaProductType A0B;
    public static final InstagramMediaProductType A0C;
    public static final InstagramMediaProductType A0D;
    public static final InstagramMediaProductType A0E;
    public static final InstagramMediaProductType A0F;
    public static final InstagramMediaProductType A0G;
    public static final InstagramMediaProductType A0H;
    public static final InstagramMediaProductType A0I;
    public static final InstagramMediaProductType A0J;
    public static final InstagramMediaProductType A0K;
    public static final InstagramMediaProductType A0L;
    public static final InstagramMediaProductType A0M;
    public static final InstagramMediaProductType A0N;
    public static final InstagramMediaProductType A0O;
    public static final InstagramMediaProductType A0P;
    public static final InstagramMediaProductType A0Q;
    public static final InstagramMediaProductType A0R;
    public static final InstagramMediaProductType A0S;
    public static final InstagramMediaProductType A0T;
    public static final InstagramMediaProductType A0U;
    public static final InstagramMediaProductType A0V;
    public static final InstagramMediaProductType A0W;
    public static final InstagramMediaProductType A0X;
    public static final InstagramMediaProductType A0Y;
    public static final InstagramMediaProductType A0Z;
    public static final InstagramMediaProductType A0a;
    public static final InstagramMediaProductType A0b;
    public static final InstagramMediaProductType A0c;
    public static final InstagramMediaProductType A0d;
    public static final InstagramMediaProductType A0e;
    public static final InstagramMediaProductType A0f;
    public static final InstagramMediaProductType A0g;
    public static final InstagramMediaProductType A0h;
    public static final InstagramMediaProductType A0i;
    public static final InstagramMediaProductType A0j;
    public static final InstagramMediaProductType A0k;
    public static final InstagramMediaProductType A0l;
    public static final InstagramMediaProductType A0m;
    public static final InstagramMediaProductType A0n;
    public static final InstagramMediaProductType A0o;
    public static final InstagramMediaProductType A0p;
    public static final InstagramMediaProductType A0q;
    public static final InstagramMediaProductType A0r;
    public static final InstagramMediaProductType A0s;
    public static final InstagramMediaProductType A0t;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        InstagramMediaProductType instagramMediaProductType = new InstagramMediaProductType("UNRECOGNIZED", 0, "InstagramMediaProductType_unspecified");
        A0r = instagramMediaProductType;
        InstagramMediaProductType instagramMediaProductType2 = new InstagramMediaProductType("AD", 1, "AD");
        A04 = instagramMediaProductType2;
        InstagramMediaProductType instagramMediaProductType3 = new InstagramMediaProductType("AR_EFFECT_PREVIEW", 2, "AR_EFFECT_PREVIEW");
        A05 = instagramMediaProductType3;
        InstagramMediaProductType instagramMediaProductType4 = new InstagramMediaProductType("BIO_LINK", 3, "BIO_LINK");
        A06 = instagramMediaProductType4;
        InstagramMediaProductType instagramMediaProductType5 = new InstagramMediaProductType("CAROUSEL_CONTAINER", 4, "CAROUSEL_CONTAINER");
        A07 = instagramMediaProductType5;
        InstagramMediaProductType instagramMediaProductType6 = new InstagramMediaProductType("CAROUSEL_CONTRIBUTED_ITEM", 5, "CAROUSEL_CONTRIBUTED_ITEM");
        A08 = instagramMediaProductType6;
        InstagramMediaProductType instagramMediaProductType7 = new InstagramMediaProductType("CAROUSEL_ITEM", 6, "CAROUSEL_ITEM");
        A09 = instagramMediaProductType7;
        InstagramMediaProductType instagramMediaProductType8 = new InstagramMediaProductType("CLIPS", 7, "CLIPS");
        A0A = instagramMediaProductType8;
        InstagramMediaProductType instagramMediaProductType9 = new InstagramMediaProductType("CLIPS_PREVIEW", 8, "CLIPS_PREVIEW");
        A0B = instagramMediaProductType9;
        InstagramMediaProductType instagramMediaProductType10 = new InstagramMediaProductType("CLIPS_SPIN", 9, "CLIPS_SPIN");
        A0C = instagramMediaProductType10;
        InstagramMediaProductType instagramMediaProductType11 = new InstagramMediaProductType("CONTAINER", 10, "CONTAINER");
        A0D = instagramMediaProductType11;
        InstagramMediaProductType instagramMediaProductType12 = new InstagramMediaProductType("CONTAINER_ITEM", 11, "CONTAINER_ITEM");
        A0E = instagramMediaProductType12;
        InstagramMediaProductType instagramMediaProductType13 = new InstagramMediaProductType("COWATCH_LOCAL", 12, "COWATCH_LOCAL");
        A0F = instagramMediaProductType13;
        InstagramMediaProductType instagramMediaProductType14 = new InstagramMediaProductType("CUSTOM_STICKER", 13, "CUSTOM_STICKER");
        A0G = instagramMediaProductType14;
        InstagramMediaProductType instagramMediaProductType15 = new InstagramMediaProductType("DEFAULT_DO_NOT_USE", 14, "DEFAULT_DO_NOT_USE");
        A0H = instagramMediaProductType15;
        InstagramMediaProductType instagramMediaProductType16 = new InstagramMediaProductType("DIRECT", 15, "DIRECT");
        A0I = instagramMediaProductType16;
        InstagramMediaProductType instagramMediaProductType17 = new InstagramMediaProductType("DIRECT_AUDIO", 16, "DIRECT_AUDIO");
        A0J = instagramMediaProductType17;
        InstagramMediaProductType instagramMediaProductType18 = new InstagramMediaProductType("DIRECT_AVATAR_STICKER", 17, "DIRECT_AVATAR_STICKER");
        A0K = instagramMediaProductType18;
        InstagramMediaProductType instagramMediaProductType19 = new InstagramMediaProductType("DIRECT_HEADMOJI", 18, "DIRECT_HEADMOJI");
        A0L = instagramMediaProductType19;
        InstagramMediaProductType instagramMediaProductType20 = new InstagramMediaProductType("DIRECT_MESSAGE_COMMENT_FACADE", 19, "DIRECT_MESSAGE_COMMENT_FACADE");
        A0M = instagramMediaProductType20;
        InstagramMediaProductType instagramMediaProductType21 = new InstagramMediaProductType("DIRECT_PERMANENT", 20, "DIRECT_PERMANENT");
        A0N = instagramMediaProductType21;
        InstagramMediaProductType instagramMediaProductType22 = new InstagramMediaProductType("DIRECT_THREAD", 21, "DIRECT_THREAD");
        A0O = instagramMediaProductType22;
        InstagramMediaProductType instagramMediaProductType23 = new InstagramMediaProductType("FEED", 22, "FEED");
        A0P = instagramMediaProductType23;
        InstagramMediaProductType instagramMediaProductType24 = new InstagramMediaProductType("FUNDRAISER_COVER", 23, "FUNDRAISER_COVER");
        A0Q = instagramMediaProductType24;
        InstagramMediaProductType instagramMediaProductType25 = new InstagramMediaProductType("GUIDE_MEDIA_FACADE", 24, "GUIDE_MEDIA_FACADE");
        A0R = instagramMediaProductType25;
        InstagramMediaProductType instagramMediaProductType26 = new InstagramMediaProductType("HIGHLIGHT_POST_FACADE", 25, "HIGHLIGHT_POST_FACADE");
        A0S = instagramMediaProductType26;
        InstagramMediaProductType instagramMediaProductType27 = new InstagramMediaProductType("IGTV", 26, "IGTV");
        A0T = instagramMediaProductType27;
        InstagramMediaProductType instagramMediaProductType28 = new InstagramMediaProductType("LIVE", 27, "LIVE");
        A0U = instagramMediaProductType28;
        InstagramMediaProductType instagramMediaProductType29 = new InstagramMediaProductType("LIVE_ARCHIVE", 28, "LIVE_ARCHIVE");
        A0V = instagramMediaProductType29;
        InstagramMediaProductType instagramMediaProductType30 = new InstagramMediaProductType("MEDIA_KIT", 29, "MEDIA_KIT");
        A0W = instagramMediaProductType30;
        InstagramMediaProductType instagramMediaProductType31 = new InstagramMediaProductType("MESSAGING_PAYMENTS", 30, "MESSAGING_PAYMENTS");
        A0X = instagramMediaProductType31;
        InstagramMediaProductType instagramMediaProductType32 = new InstagramMediaProductType("NAMETAG", 31, "NAMETAG");
        A0Y = instagramMediaProductType32;
        InstagramMediaProductType instagramMediaProductType33 = new InstagramMediaProductType("NOTE_AUDIO", 32, "NOTE_AUDIO");
        A0Z = instagramMediaProductType33;
        InstagramMediaProductType instagramMediaProductType34 = new InstagramMediaProductType("NOTE_POG_VIDEO", 33, "NOTE_POG_VIDEO");
        A0a = instagramMediaProductType34;
        InstagramMediaProductType instagramMediaProductType35 = new InstagramMediaProductType("PENDING_CAROUSEL_ITEM", 34, "PENDING_CAROUSEL_ITEM");
        A0b = instagramMediaProductType35;
        InstagramMediaProductType instagramMediaProductType36 = new InstagramMediaProductType("PROFILE_PIC", 35, "PROFILE_PIC");
        A0c = instagramMediaProductType36;
        InstagramMediaProductType instagramMediaProductType37 = new InstagramMediaProductType("QUICK_SNAP", 36, "QUICK_SNAP");
        A0d = instagramMediaProductType37;
        InstagramMediaProductType instagramMediaProductType38 = new InstagramMediaProductType("RATINGS_AND_REVIEWS", 37, "RATINGS_AND_REVIEWS");
        A0e = instagramMediaProductType38;
        InstagramMediaProductType instagramMediaProductType39 = new InstagramMediaProductType("REPOST_MEDIA_FACADE", 38, "REPOST_MEDIA_FACADE");
        A0f = instagramMediaProductType39;
        InstagramMediaProductType instagramMediaProductType40 = new InstagramMediaProductType("REUSABLE_TEMPLATE_ASSETS", 39, "REUSABLE_TEMPLATE_ASSETS");
        A0g = instagramMediaProductType40;
        InstagramMediaProductType instagramMediaProductType41 = new InstagramMediaProductType("ROLLS", 40, "ROLLS");
        A0h = instagramMediaProductType41;
        InstagramMediaProductType instagramMediaProductType42 = new InstagramMediaProductType("SCHEDULED_LIVE", 41, "SCHEDULED_LIVE");
        A0i = instagramMediaProductType42;
        InstagramMediaProductType instagramMediaProductType43 = new InstagramMediaProductType("SELFIE_STICKER", 42, "SELFIE_STICKER");
        A0j = instagramMediaProductType43;
        InstagramMediaProductType instagramMediaProductType44 = new InstagramMediaProductType("STORY", 43, "STORY");
        A0k = instagramMediaProductType44;
        InstagramMediaProductType instagramMediaProductType45 = new InstagramMediaProductType("STORY_INTERACTION_RESPONSE", 44, "STORY_INTERACTION_RESPONSE");
        A0l = instagramMediaProductType45;
        InstagramMediaProductType instagramMediaProductType46 = new InstagramMediaProductType("STORY_TEMPLATE_ASSET", 45, "STORY_TEMPLATE_ASSET");
        A0m = instagramMediaProductType46;
        InstagramMediaProductType instagramMediaProductType47 = new InstagramMediaProductType("SUPERLATIVES", 46, "SUPERLATIVES");
        A0n = instagramMediaProductType47;
        InstagramMediaProductType instagramMediaProductType48 = new InstagramMediaProductType("TEXT_POST", 47, "TEXT_POST");
        A0o = instagramMediaProductType48;
        InstagramMediaProductType instagramMediaProductType49 = new InstagramMediaProductType("UNDERLYING_SPINNABLE_CLIP_VIDEO", 48, "UNDERLYING_SPINNABLE_CLIP_VIDEO");
        A0p = instagramMediaProductType49;
        InstagramMediaProductType instagramMediaProductType50 = new InstagramMediaProductType("UNDERLYING_STORY_AD", 49, "UNDERLYING_STORY_AD");
        A0q = instagramMediaProductType50;
        InstagramMediaProductType instagramMediaProductType51 = new InstagramMediaProductType("VIDEO_REACTION", 50, "VIDEO_REACTION");
        A0s = instagramMediaProductType51;
        InstagramMediaProductType instagramMediaProductType52 = new InstagramMediaProductType("WALL_MEDIA", 51, "WALL_MEDIA");
        A0t = instagramMediaProductType52;
        InstagramMediaProductType[] instagramMediaProductTypeArr = new InstagramMediaProductType[52];
        System.arraycopy(new InstagramMediaProductType[]{instagramMediaProductType, instagramMediaProductType2, instagramMediaProductType3, instagramMediaProductType4, instagramMediaProductType5, instagramMediaProductType6, instagramMediaProductType7, instagramMediaProductType8, instagramMediaProductType9, instagramMediaProductType10, instagramMediaProductType11, instagramMediaProductType12, instagramMediaProductType13, instagramMediaProductType14, instagramMediaProductType15, instagramMediaProductType16, instagramMediaProductType17, instagramMediaProductType18, instagramMediaProductType19, instagramMediaProductType20, instagramMediaProductType21, instagramMediaProductType22, instagramMediaProductType23, instagramMediaProductType24, instagramMediaProductType25, instagramMediaProductType26, instagramMediaProductType27}, 0, instagramMediaProductTypeArr, 0, 27);
        System.arraycopy(new InstagramMediaProductType[]{instagramMediaProductType28, instagramMediaProductType29, instagramMediaProductType30, instagramMediaProductType31, instagramMediaProductType32, instagramMediaProductType33, instagramMediaProductType34, instagramMediaProductType35, instagramMediaProductType36, instagramMediaProductType37, instagramMediaProductType38, instagramMediaProductType39, instagramMediaProductType40, instagramMediaProductType41, instagramMediaProductType42, instagramMediaProductType43, instagramMediaProductType44, instagramMediaProductType45, instagramMediaProductType46, instagramMediaProductType47, instagramMediaProductType48, instagramMediaProductType49, instagramMediaProductType50, instagramMediaProductType51, instagramMediaProductType52}, 0, instagramMediaProductTypeArr, 27, 25);
        A03 = instagramMediaProductTypeArr;
        A02 = AbstractC12190kN.A00(instagramMediaProductTypeArr);
        InstagramMediaProductType[] values = values();
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC37302Gc3.A01(values.length));
        for (InstagramMediaProductType instagramMediaProductType53 : values) {
            linkedHashMap.put(instagramMediaProductType53.A00, instagramMediaProductType53);
        }
        A01 = linkedHashMap;
        CREATOR = new C41858IgC(57);
    }

    public static InstagramMediaProductType valueOf(String str) {
        return (InstagramMediaProductType) Enum.valueOf(InstagramMediaProductType.class, str);
    }

    public static InstagramMediaProductType[] values() {
        return (InstagramMediaProductType[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public InstagramMediaProductType(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
