package com.instagram.api.schemas;

import X.AbstractC12190kN;
import X.AbstractC16850sd;
import X.C14360o3;
import X.C206159Ax;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class MusicProduct implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ MusicProduct[] A03;
    public static final MusicProduct A04;
    public static final MusicProduct A05;
    public static final MusicProduct A06;
    public static final MusicProduct A07;
    public static final MusicProduct A08;
    public static final MusicProduct A09;
    public static final MusicProduct A0A;
    public static final MusicProduct A0B;
    public static final MusicProduct A0C;
    public static final MusicProduct A0D;
    public static final MusicProduct A0E;
    public static final MusicProduct A0F;
    public static final MusicProduct A0G;
    public static final MusicProduct A0H;
    public static final MusicProduct A0I;
    public static final MusicProduct A0J;
    public static final MusicProduct A0K;
    public static final MusicProduct A0L;
    public static final MusicProduct A0M;
    public static final MusicProduct A0N;
    public static final MusicProduct A0O;
    public static final MusicProduct A0P;
    public static final MusicProduct A0Q;
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
        MusicProduct musicProduct = new MusicProduct("UNRECOGNIZED", 0, "MusicProduct_unspecified");
        A0P = musicProduct;
        MusicProduct musicProduct2 = new MusicProduct("IG_AUDIO_FILTERS", 1, "audio_filters");
        A08 = musicProduct2;
        MusicProduct musicProduct3 = new MusicProduct("IG_GLOBAL_SEARCH", 2, "audio_global_search");
        A09 = musicProduct3;
        MusicProduct musicProduct4 = new MusicProduct("BOOST_AUDIO_BROWSER", 3, "boost_audio_browser");
        A04 = musicProduct4;
        MusicProduct musicProduct5 = new MusicProduct("CLIPS_CAMERA_FORMAT", 4, "clips_camera_format");
        A05 = musicProduct5;
        MusicProduct musicProduct6 = new MusicProduct("CLIPS_CAMERA_FORMAT_V2", 5, "clips_camera_format_v2");
        A06 = musicProduct6;
        MusicProduct musicProduct7 = new MusicProduct("CLIPS_EDIT_METADATA", 6, "clips_edit_metadata");
        A07 = musicProduct7;
        MusicProduct musicProduct8 = new MusicProduct("MEMORY_RESHARE", 7, "memory_reshare");
        A0A = musicProduct8;
        MusicProduct musicProduct9 = new MusicProduct("MENTION_RESHARE", 8, "mention_reshare");
        A0B = musicProduct9;
        MusicProduct musicProduct10 = new MusicProduct("MUSIC_AR_EFFECT", 9, "music_ar_effect");
        A0C = musicProduct10;
        MusicProduct musicProduct11 = new MusicProduct("MUSIC_AR_EFFECT_DEMO", 10, "music_ar_effect_demo");
        A0D = musicProduct11;
        MusicProduct musicProduct12 = new MusicProduct("MUSIC_CAMERA_FORMAT", 11, "music_camera_format");
        A0E = musicProduct12;
        MusicProduct musicProduct13 = new MusicProduct("MUSIC_FIRST", 12, "music_first");
        A0F = musicProduct13;
        MusicProduct musicProduct14 = new MusicProduct("MUSIC_IN_FEED", 13, "music_in_feed");
        A0G = musicProduct14;
        MusicProduct musicProduct15 = new MusicProduct("MUSIC_NOTES", 14, "music_notes");
        A0H = musicProduct15;
        MusicProduct musicProduct16 = new MusicProduct("MUSIC_ON_PROFILE", 15, "music_on_profile");
        A0I = musicProduct16;
        MusicProduct musicProduct17 = new MusicProduct("MUSIC_PICK", 16, "music_pick");
        A0J = musicProduct17;
        MusicProduct musicProduct18 = new MusicProduct("MUSIC_STICKER_SEND", 17, "music_sticker_send");
        A0K = musicProduct18;
        MusicProduct musicProduct19 = new MusicProduct("POST_CAPTURE_STICKER", 18, "post_capture_sticker");
        A0L = musicProduct19;
        MusicProduct musicProduct20 = new MusicProduct("QUESTION_RESPONSE", 19, "question_response");
        A0M = musicProduct20;
        MusicProduct musicProduct21 = new MusicProduct("QUESTION_RESPONSE_RESHARE", 20, "question_response_reshare");
        A0N = musicProduct21;
        MusicProduct musicProduct22 = new MusicProduct("STATUS", 21, IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS);
        A0O = musicProduct22;
        MusicProduct musicProduct23 = new MusicProduct("UNSET", 22, "unset");
        A0Q = musicProduct23;
        MusicProduct[] musicProductArr = {musicProduct, musicProduct2, musicProduct3, musicProduct4, musicProduct5, musicProduct6, musicProduct7, musicProduct8, musicProduct9, musicProduct10, musicProduct11, musicProduct12, musicProduct13, musicProduct14, musicProduct15, musicProduct16, musicProduct17, musicProduct18, musicProduct19, musicProduct20, musicProduct21, musicProduct22, musicProduct23};
        A03 = musicProductArr;
        A02 = AbstractC12190kN.A00(musicProductArr);
        MusicProduct[] values = values();
        int A0L2 = AbstractC16850sd.A0L(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L2 < 16 ? 16 : A0L2);
        for (MusicProduct musicProduct24 : values) {
            linkedHashMap.put(musicProduct24.A00, musicProduct24);
        }
        A01 = linkedHashMap;
        CREATOR = new C206159Ax(62);
    }

    public static MusicProduct valueOf(String str) {
        return (MusicProduct) Enum.valueOf(MusicProduct.class, str);
    }

    public static MusicProduct[] values() {
        return (MusicProduct[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public MusicProduct(String str, int i, String str2) {
        this.A00 = str2;
    }
}
