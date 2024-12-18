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
public final class StickerPack implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ StickerPack[] A03;
    public static final StickerPack A04;
    public static final StickerPack A05;
    public static final StickerPack A06;
    public static final StickerPack A07;
    public static final StickerPack A08;
    public static final StickerPack A09;
    public static final StickerPack A0A;
    public static final StickerPack A0B;
    public static final StickerPack A0C;
    public static final StickerPack A0D;
    public static final StickerPack A0E;
    public static final StickerPack A0F;
    public static final StickerPack A0G;
    public static final StickerPack A0H;
    public static final StickerPack A0I;
    public static final StickerPack A0J;
    public static final StickerPack A0K;
    public static final StickerPack A0L;
    public static final StickerPack A0M;
    public static final StickerPack A0N;
    public static final StickerPack A0O;
    public static final StickerPack A0P;
    public static final StickerPack A0Q;
    public static final StickerPack A0R;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        StickerPack stickerPack = new StickerPack("UNRECOGNIZED", 0, "StickerPack_unspecified");
        A0R = stickerPack;
        StickerPack stickerPack2 = new StickerPack("STICKER_TRAY_DYNAMIC_AVATAR_ICON", 1, "sticker_tray_dynamic_avatar_icon");
        A0P = stickerPack2;
        StickerPack stickerPack3 = new StickerPack("QUICK_REACTIONS_AVATAR_STICKER_PACK_ID", 2, "quick_reactions_avatar_sticker_pack_id");
        A0L = stickerPack3;
        StickerPack stickerPack4 = new StickerPack("QUICK_REACTIONS_AVATAR_STICKER_PACK_ID_V2", 3, "quick_reactions_avatar_sticker_pack_id_v2");
        A0M = stickerPack4;
        StickerPack stickerPack5 = new StickerPack("QUICK_REACTIONS_ANIMATED_AVATAR_STICKER_PACK_ID", 4, "quick_reactions_animated_avatar_sticker_pack_id");
        A0K = stickerPack5;
        StickerPack stickerPack6 = new StickerPack("STATIC_AVATAR_STICKER_PACK_ID", 5, "static_avatar_sticker_pack_id");
        A0N = stickerPack6;
        StickerPack stickerPack7 = new StickerPack("MIXED_AVATAR_STICKER_PACK_ID", 6, "mixed_avatar_sticker_pack_id");
        A0D = stickerPack7;
        StickerPack stickerPack8 = new StickerPack("STICKER_TRAY_CUSTOM_AVATAR_ICON", 7, "sticker_tray_custom_avatar_icon");
        A0O = stickerPack8;
        StickerPack stickerPack9 = new StickerPack("POST_AVATAR_CREATION_NUX_STICKER_PACK_ID", 8, "post_avatar_creation_nux_sticker_pack_id");
        A0J = stickerPack9;
        StickerPack stickerPack10 = new StickerPack("DIRECT_RESHARE_AVATAR_STICKERS_ICON", 9, "direct_reshare_avatar_stickers_icon");
        A07 = stickerPack10;
        StickerPack stickerPack11 = new StickerPack("MUSIC_AVATAR_STICKERS_ICON", 10, "music_avatar_stickers_icon");
        A0G = stickerPack11;
        StickerPack stickerPack12 = new StickerPack("MUSIC_AVATAR_STICKERS_DEFAULT_STICKER", 11, "music_avatar_stickers_default_sticker");
        A0F = stickerPack12;
        StickerPack stickerPack13 = new StickerPack("MUSIC_AVATAR_STICKERS_STICKER_PACK_ID", 12, "music_avatar_stickers_sticker_pack_id");
        A0I = stickerPack13;
        StickerPack stickerPack14 = new StickerPack("MUSIC_AVATAR_STICKERS_ANIMATED_DEFAULT_STICKER", 13, "music_avatar_stickers_animated_default_sticker");
        A0E = stickerPack14;
        StickerPack stickerPack15 = new StickerPack("MUSIC_AVATAR_STICKERS_MIXED_STICKER_PACK_ID", 14, "music_avatar_stickers_mixed_sticker_pack_id");
        A0H = stickerPack15;
        StickerPack stickerPack16 = new StickerPack("DIRECT_RESHARE_STICKER_PACK_ID", 15, "direct_reshare_sticker_pack_id");
        A08 = stickerPack16;
        StickerPack stickerPack17 = new StickerPack("DIRECT_RESHARE_STICKER_PACK_ID_v2", 16, "direct_reshare_sticker_pack_id_v2");
        A09 = stickerPack17;
        StickerPack stickerPack18 = new StickerPack("STORIES_RESHARE_STICKER_PACK_ID", 17, "stories_reshare_sticker_pack_id");
        A0Q = stickerPack18;
        StickerPack stickerPack19 = new StickerPack("COIN_FLIP_ANIMATED_STICKER_PACK_ID", 18, "coin_flip_animated_sticker_pack_id");
        A05 = stickerPack19;
        StickerPack stickerPack20 = new StickerPack("COIN_FLIP_STATIC_STICKER_PACK_ID", 19, "coin_flip_static_sticker_pack_id");
        A06 = stickerPack20;
        StickerPack stickerPack21 = new StickerPack("COIN_FLIP_ANIMATED_AZ_STICKER_PACK", 20, "coin_flip_animated_az_sticker_pack");
        A04 = stickerPack21;
        StickerPack stickerPack22 = new StickerPack("LARGE_MIXED_STICKER_PACK_V1", 21, "large_mixed_sticker_pack_v1");
        A0B = stickerPack22;
        StickerPack stickerPack23 = new StickerPack("LARGE_STATIC_STICKER_PACK_V1", 22, "large_static_sticker_pack_v1");
        A0C = stickerPack23;
        StickerPack stickerPack24 = new StickerPack("JAN2023_MIXED_STICKER_PACK", 23, "jan2023_mixed_sticker_pack");
        A0A = stickerPack24;
        StickerPack[] stickerPackArr = {stickerPack, stickerPack2, stickerPack3, stickerPack4, stickerPack5, stickerPack6, stickerPack7, stickerPack8, stickerPack9, stickerPack10, stickerPack11, stickerPack12, stickerPack13, stickerPack14, stickerPack15, stickerPack16, stickerPack17, stickerPack18, stickerPack19, stickerPack20, stickerPack21, stickerPack22, stickerPack23, stickerPack24, new StickerPack("JAN2023_STATIC_STICKER_PACK", 24, "jan2023_static_sticker_pack")};
        A03 = stickerPackArr;
        A02 = AbstractC12190kN.A00(stickerPackArr);
        StickerPack[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC37302Gc3.A01(values.length));
        for (StickerPack stickerPack25 : values) {
            A18.put(stickerPack25.A00, stickerPack25);
        }
        A01 = A18;
        CREATOR = C41857IgB.A00(11);
    }

    public static StickerPack valueOf(String str) {
        return (StickerPack) Enum.valueOf(StickerPack.class, str);
    }

    public static StickerPack[] values() {
        return (StickerPack[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public StickerPack(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
