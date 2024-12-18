package com.instagram.api.schemas;

import X.AbstractC12190kN;
import X.AbstractC16850sd;
import X.C14360o3;
import X.C41857IgB;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class StickerTraySurface implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ StickerTraySurface[] A03;
    public static final StickerTraySurface A04;
    public static final StickerTraySurface A05;
    public static final StickerTraySurface A06;
    public static final StickerTraySurface A07;
    public static final StickerTraySurface A08;
    public static final StickerTraySurface A09;
    public static final StickerTraySurface A0A;
    public static final StickerTraySurface A0B;
    public static final StickerTraySurface A0C;
    public static final StickerTraySurface A0D;
    public static final StickerTraySurface A0E;
    public static final StickerTraySurface A0F;
    public static final StickerTraySurface A0G;
    public static final StickerTraySurface A0H;
    public static final StickerTraySurface A0I;
    public static final StickerTraySurface A0J;
    public static final StickerTraySurface A0K;
    public static final StickerTraySurface A0L;
    public static final StickerTraySurface A0M;
    public static final StickerTraySurface A0N;
    public static final StickerTraySurface A0O;
    public static final StickerTraySurface A0P;
    public static final StickerTraySurface A0Q;
    public static final StickerTraySurface A0R;
    public static final StickerTraySurface A0S;
    public static final StickerTraySurface A0T;
    public static final StickerTraySurface A0U;
    public static final StickerTraySurface A0V;
    public static final StickerTraySurface A0W;
    public static final StickerTraySurface A0X;
    public static final StickerTraySurface A0Y;
    public static final StickerTraySurface A0Z;
    public static final StickerTraySurface A0a;
    public static final StickerTraySurface A0b;
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
        StickerTraySurface stickerTraySurface = new StickerTraySurface("UNRECOGNIZED", 0, "StickerTraySurface_unspecified");
        A0b = stickerTraySurface;
        StickerTraySurface stickerTraySurface2 = new StickerTraySurface("AQR", 1, "AQR");
        A04 = stickerTraySurface2;
        StickerTraySurface stickerTraySurface3 = new StickerTraySurface("AVATAR_INFO", 2, "AVATAR_INFO");
        A05 = stickerTraySurface3;
        StickerTraySurface stickerTraySurface4 = new StickerTraySurface("CLIPS", 3, "CLIPS");
        A06 = stickerTraySurface4;
        StickerTraySurface stickerTraySurface5 = new StickerTraySurface("CLIPS_AVATAR_STICKER_TRAY", 4, "CLIPS_AVATAR_STICKER_TRAY");
        A07 = stickerTraySurface5;
        StickerTraySurface stickerTraySurface6 = new StickerTraySurface("CLIPS_MUSIC_AVATAR_STICKER_TRAY", 5, "CLIPS_MUSIC_AVATAR_STICKER_TRAY");
        A08 = stickerTraySurface6;
        StickerTraySurface stickerTraySurface7 = new StickerTraySurface("CLIPS_STICKER_TRAY", 6, "CLIPS_STICKER_TRAY");
        A09 = stickerTraySurface7;
        StickerTraySurface stickerTraySurface8 = new StickerTraySurface("COIN_FLIP", 7, "COIN_FLIP");
        A0A = stickerTraySurface8;
        StickerTraySurface stickerTraySurface9 = new StickerTraySurface("COMMENTS", 8, "COMMENTS");
        A0B = stickerTraySurface9;
        StickerTraySurface stickerTraySurface10 = new StickerTraySurface("COMMENTS_CONTEXTUAL_RECOMMENDATION", 9, "COMMENTS_CONTEXTUAL_RECOMMENDATION");
        A0C = stickerTraySurface10;
        StickerTraySurface stickerTraySurface11 = new StickerTraySurface("CREATION", 10, "CREATION");
        A0D = stickerTraySurface11;
        StickerTraySurface stickerTraySurface12 = new StickerTraySurface("DIRECT", 11, "DIRECT");
        A0E = stickerTraySurface12;
        StickerTraySurface stickerTraySurface13 = new StickerTraySurface("DIRECT_RESHARE", 12, "DIRECT_RESHARE");
        A0F = stickerTraySurface13;
        StickerTraySurface stickerTraySurface14 = new StickerTraySurface("DYI", 13, "DYI");
        A0G = stickerTraySurface14;
        StickerTraySurface stickerTraySurface15 = new StickerTraySurface("FEED", 14, "FEED");
        A0H = stickerTraySurface15;
        StickerTraySurface stickerTraySurface16 = new StickerTraySurface("GROUP_STORIES", 15, "GROUP_STORIES");
        A0I = stickerTraySurface16;
        StickerTraySurface stickerTraySurface17 = new StickerTraySurface("IOS_SHARE_EXTENSION", 16, "IOS_SHARE_EXTENSION");
        A0J = stickerTraySurface17;
        StickerTraySurface stickerTraySurface18 = new StickerTraySurface("LIVE_REACTION", 17, "LIVE_REACTION");
        A0K = stickerTraySurface18;
        StickerTraySurface stickerTraySurface19 = new StickerTraySurface("MEME_IT", 18, "MEME_IT");
        A0L = stickerTraySurface19;
        StickerTraySurface stickerTraySurface20 = new StickerTraySurface("NOTES", 19, "NOTES");
        A0M = stickerTraySurface20;
        StickerTraySurface stickerTraySurface21 = new StickerTraySurface("NOTE_REPLY", 20, "NOTE_REPLY");
        A0N = stickerTraySurface21;
        StickerTraySurface stickerTraySurface22 = new StickerTraySurface("POKES", 21, "POKES");
        A0O = stickerTraySurface22;
        StickerTraySurface stickerTraySurface23 = new StickerTraySurface("POST_AVATAR_CREATION", 22, "POST_AVATAR_CREATION");
        A0P = stickerTraySurface23;
        StickerTraySurface stickerTraySurface24 = new StickerTraySurface("PROFILE", 23, "PROFILE");
        A0Q = stickerTraySurface24;
        StickerTraySurface stickerTraySurface25 = new StickerTraySurface("STICKER_TRAY", 24, "STICKER_TRAY");
        A0R = stickerTraySurface25;
        StickerTraySurface stickerTraySurface26 = new StickerTraySurface("STORIES", 25, "STORIES");
        A0S = stickerTraySurface26;
        StickerTraySurface stickerTraySurface27 = new StickerTraySurface("STORIES_AVATAR_SOCIAL_STICKER_TRAY", 26, "STORIES_AVATAR_SOCIAL_STICKER_TRAY");
        A0T = stickerTraySurface27;
        StickerTraySurface stickerTraySurface28 = new StickerTraySurface("STORIES_AVATAR_SOCIAL_STICKER_TRAY_POG", 27, "STORIES_AVATAR_SOCIAL_STICKER_TRAY_POG");
        A0U = stickerTraySurface28;
        StickerTraySurface stickerTraySurface29 = new StickerTraySurface("STORIES_AVATAR_SOCIAL_STICKER_TRAY_SEARCH", 28, "STORIES_AVATAR_SOCIAL_STICKER_TRAY_SEARCH");
        A0V = stickerTraySurface29;
        StickerTraySurface stickerTraySurface30 = new StickerTraySurface("STORIES_AVATAR_STICKER_TRAY", 29, "STORIES_AVATAR_STICKER_TRAY");
        A0W = stickerTraySurface30;
        StickerTraySurface stickerTraySurface31 = new StickerTraySurface("STORIES_GLOBAL_SEARCH_STICKER_TRAY", 30, "STORIES_GLOBAL_SEARCH_STICKER_TRAY");
        A0X = stickerTraySurface31;
        StickerTraySurface stickerTraySurface32 = new StickerTraySurface("STORIES_MUSIC_AVATAR_STICKER_TRAY", 31, "STORIES_MUSIC_AVATAR_STICKER_TRAY");
        A0Y = stickerTraySurface32;
        StickerTraySurface stickerTraySurface33 = new StickerTraySurface("STORIES_QUICK_REACTION_AVATAR_STICKER_GRID", 32, "STORIES_QUICK_REACTION_AVATAR_STICKER_GRID");
        A0Z = stickerTraySurface33;
        StickerTraySurface stickerTraySurface34 = new StickerTraySurface("STORIES_RESHARE_AVATAR_STICKER_TRAY", 33, "STORIES_RESHARE_AVATAR_STICKER_TRAY");
        A0a = stickerTraySurface34;
        StickerTraySurface stickerTraySurface35 = new StickerTraySurface("STORY_QUESTION_RESPONSE", 34, "STORY_QUESTION_RESPONSE");
        StickerTraySurface[] stickerTraySurfaceArr = new StickerTraySurface[35];
        System.arraycopy(new StickerTraySurface[]{stickerTraySurface, stickerTraySurface2, stickerTraySurface3, stickerTraySurface4, stickerTraySurface5, stickerTraySurface6, stickerTraySurface7, stickerTraySurface8, stickerTraySurface9, stickerTraySurface10, stickerTraySurface11, stickerTraySurface12, stickerTraySurface13, stickerTraySurface14, stickerTraySurface15, stickerTraySurface16, stickerTraySurface17, stickerTraySurface18, stickerTraySurface19, stickerTraySurface20, stickerTraySurface21, stickerTraySurface22, stickerTraySurface23, stickerTraySurface24, stickerTraySurface25, stickerTraySurface26, stickerTraySurface27}, 0, stickerTraySurfaceArr, 0, 27);
        System.arraycopy(new StickerTraySurface[]{stickerTraySurface28, stickerTraySurface29, stickerTraySurface30, stickerTraySurface31, stickerTraySurface32, stickerTraySurface33, stickerTraySurface34, stickerTraySurface35}, 0, stickerTraySurfaceArr, 27, 8);
        A03 = stickerTraySurfaceArr;
        A02 = AbstractC12190kN.A00(stickerTraySurfaceArr);
        StickerTraySurface[] values = values();
        int A0L2 = AbstractC16850sd.A0L(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L2 < 16 ? 16 : A0L2);
        for (StickerTraySurface stickerTraySurface36 : values) {
            linkedHashMap.put(stickerTraySurface36.A00, stickerTraySurface36);
        }
        A01 = linkedHashMap;
        CREATOR = new C41857IgB(12);
    }

    public static StickerTraySurface valueOf(String str) {
        return (StickerTraySurface) Enum.valueOf(StickerTraySurface.class, str);
    }

    public static StickerTraySurface[] values() {
        return (StickerTraySurface[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public StickerTraySurface(String str, int i, String str2) {
        this.A00 = str2;
    }
}
