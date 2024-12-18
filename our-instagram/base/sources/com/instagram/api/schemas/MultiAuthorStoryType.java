package com.instagram.api.schemas;

import X.AbstractC12190kN;
import X.AbstractC167027dH;
import X.AbstractC25225BEi;
import X.AbstractC37300Gc1;
import X.AbstractC37302Gc3;
import X.C41855Ig9;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class MultiAuthorStoryType implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ MultiAuthorStoryType[] A03;
    public static final MultiAuthorStoryType A04;
    public static final MultiAuthorStoryType A05;
    public static final MultiAuthorStoryType A06;
    public static final MultiAuthorStoryType A07;
    public static final MultiAuthorStoryType A08;
    public static final MultiAuthorStoryType A09;
    public static final MultiAuthorStoryType A0A;
    public static final MultiAuthorStoryType A0B;
    public static final MultiAuthorStoryType A0C;
    public static final MultiAuthorStoryType A0D;
    public static final MultiAuthorStoryType A0E;
    public static final MultiAuthorStoryType A0F;
    public static final MultiAuthorStoryType A0G;
    public static final MultiAuthorStoryType A0H;
    public static final MultiAuthorStoryType A0I;
    public static final MultiAuthorStoryType A0J;
    public static final MultiAuthorStoryType A0K;
    public static final MultiAuthorStoryType A0L;
    public static final MultiAuthorStoryType A0M;
    public static final MultiAuthorStoryType A0N;
    public static final MultiAuthorStoryType A0O;
    public static final MultiAuthorStoryType A0P;
    public static final MultiAuthorStoryType A0Q;
    public static final MultiAuthorStoryType A0R;
    public static final MultiAuthorStoryType A0S;
    public static final MultiAuthorStoryType A0T;
    public static final MultiAuthorStoryType A0U;
    public static final MultiAuthorStoryType A0V;
    public static final MultiAuthorStoryType A0W;
    public static final MultiAuthorStoryType A0X;
    public static final MultiAuthorStoryType A0Y;
    public static final MultiAuthorStoryType A0Z;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        MultiAuthorStoryType A072 = AbstractC37300Gc1.A07("UNRECOGNIZED", "MultiAuthorStoryType_unspecified", 0);
        A0Y = A072;
        MultiAuthorStoryType A073 = AbstractC37300Gc1.A07("AYT", "ayt", 1);
        A04 = A073;
        MultiAuthorStoryType A074 = AbstractC37300Gc1.A07("BEST_OF", "bestof", 2);
        A05 = A074;
        MultiAuthorStoryType A075 = AbstractC37300Gc1.A07("BFF", "bff", 3);
        A06 = A075;
        MultiAuthorStoryType A076 = AbstractC37300Gc1.A07("CREATIVITY", "creativity", 4);
        A07 = A076;
        MultiAuthorStoryType A077 = AbstractC37300Gc1.A07("EFFECTS", "effects", 5);
        A08 = A077;
        MultiAuthorStoryType A078 = AbstractC37300Gc1.A07("ELECTION", "election", 6);
        A09 = A078;
        MultiAuthorStoryType A079 = AbstractC37300Gc1.A07("EVENT", "event", 7);
        A0A = A079;
        MultiAuthorStoryType A0710 = AbstractC37300Gc1.A07("HALLPASS", "hallpass", 8);
        A0B = A0710;
        MultiAuthorStoryType A0711 = AbstractC37300Gc1.A07("HAPPENING_NOW", "happeningnow", 9);
        A0C = A0711;
        MultiAuthorStoryType A0712 = AbstractC37300Gc1.A07("HOT_STORIES", "hotstories", 10);
        A0E = A0712;
        MultiAuthorStoryType A0713 = AbstractC37300Gc1.A07("LAST_CHANCE", "lastchance", 11);
        A0F = A0713;
        MultiAuthorStoryType A0714 = AbstractC37300Gc1.A07("LAST_CHANCE_V2", "lastchancev2", 12);
        A0G = A0714;
        MultiAuthorStoryType A0715 = AbstractC37300Gc1.A07("LOCATION", "location", 13);
        A0H = A0715;
        MultiAuthorStoryType A0716 = AbstractC37300Gc1.A07("MEMORY_REEL", "memory_reel", 14);
        A0I = A0716;
        MultiAuthorStoryType A0717 = AbstractC37300Gc1.A07("MENTIONS", "mentions", 15);
        A0J = A0717;
        MultiAuthorStoryType A0718 = AbstractC37300Gc1.A07("MENTIONS_V2", "mentionsv2", 16);
        A0K = A0718;
        MultiAuthorStoryType A0719 = AbstractC37300Gc1.A07("MULTI_AD", "multi_ad", 17);
        A0L = A0719;
        MultiAuthorStoryType A0720 = AbstractC37300Gc1.A07("MULTI_LOCATION", "multi_location", 18);
        A0M = A0720;
        MultiAuthorStoryType A0721 = AbstractC37300Gc1.A07("MUSIC", "music", 19);
        A0N = A0721;
        MultiAuthorStoryType A0722 = AbstractC37300Gc1.A07("NOW_V2", "nowv2", 20);
        A0O = A0722;
        MultiAuthorStoryType A0723 = AbstractC37300Gc1.A07("ORIGINAL_SOUND_CLIPS", "original_sound_clips", 21);
        A0P = A0723;
        MultiAuthorStoryType A0724 = AbstractC37300Gc1.A07("PRODUCT", "product", 22);
        A0Q = A0724;
        MultiAuthorStoryType A0725 = AbstractC37300Gc1.A07("PRODUCT_STORY", "productstory", 23);
        A0R = A0725;
        MultiAuthorStoryType A0726 = AbstractC37300Gc1.A07("SINGLE_SONG_CLIPS", "single_song_clips", 24);
        A0S = A0726;
        MultiAuthorStoryType A0727 = AbstractC37300Gc1.A07("STICKER", "sticker", 25);
        A0T = A0727;
        MultiAuthorStoryType A0728 = AbstractC37300Gc1.A07("STORY_EVENT", "story_event", 26);
        A0U = A0728;
        MultiAuthorStoryType A0729 = AbstractC37300Gc1.A07("HASHTAG", "tag", 27);
        A0D = A0729;
        MultiAuthorStoryType A0730 = AbstractC37300Gc1.A07("TOP_CLIPS", "top_clips", 28);
        A0W = A0730;
        MultiAuthorStoryType A0731 = AbstractC37300Gc1.A07("TOPIC", "topic", 29);
        A0V = A0731;
        MultiAuthorStoryType A0732 = AbstractC37300Gc1.A07("UNKNOWN", "unknown", 30);
        A0X = A0732;
        MultiAuthorStoryType A0733 = AbstractC37300Gc1.A07("UPCOMING_EVENT", "upcomingevent", 31);
        A0Z = A0733;
        MultiAuthorStoryType A0734 = AbstractC37300Gc1.A07("WORLD_PAGES", "worldpages", 32);
        MultiAuthorStoryType[] multiAuthorStoryTypeArr = new MultiAuthorStoryType[33];
        System.arraycopy(new MultiAuthorStoryType[]{A072, A073, A074, A075, A076, A077, A078, A079, A0710, A0711, A0712, A0713, A0714, A0715, A0716, A0717, A0718, A0719, A0720, A0721, A0722, A0723, A0724, A0725, A0726, A0727, A0728}, 0, multiAuthorStoryTypeArr, 0, 27);
        System.arraycopy(new MultiAuthorStoryType[]{A0729, A0730, A0731, A0732, A0733, A0734}, 0, multiAuthorStoryTypeArr, 27, 6);
        A03 = multiAuthorStoryTypeArr;
        A02 = AbstractC12190kN.A00(multiAuthorStoryTypeArr);
        MultiAuthorStoryType[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC37302Gc3.A01(values.length));
        for (MultiAuthorStoryType multiAuthorStoryType : values) {
            A18.put(multiAuthorStoryType.A00, multiAuthorStoryType);
        }
        A01 = A18;
        CREATOR = C41855Ig9.A00(3);
    }

    public static MultiAuthorStoryType valueOf(String str) {
        return (MultiAuthorStoryType) Enum.valueOf(MultiAuthorStoryType.class, str);
    }

    public static MultiAuthorStoryType[] values() {
        return (MultiAuthorStoryType[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public MultiAuthorStoryType(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
