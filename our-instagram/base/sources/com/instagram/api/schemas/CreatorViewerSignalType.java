package com.instagram.api.schemas;

import X.AbstractC12190kN;
import X.AbstractC167017dG;
import X.AbstractC167027dH;
import X.AbstractC25225BEi;
import X.C41854Ig8;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class CreatorViewerSignalType implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ CreatorViewerSignalType[] A03;
    public static final CreatorViewerSignalType A04;
    public static final CreatorViewerSignalType A05;
    public static final CreatorViewerSignalType A06;
    public static final CreatorViewerSignalType A07;
    public static final CreatorViewerSignalType A08;
    public static final CreatorViewerSignalType A09;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        CreatorViewerSignalType creatorViewerSignalType = new CreatorViewerSignalType("UNRECOGNIZED", 0, "CreatorViewerSignalType_unspecified");
        A09 = creatorViewerSignalType;
        CreatorViewerSignalType creatorViewerSignalType2 = new CreatorViewerSignalType("TRENDING_AUDIO_INCREASE_REACH", 1, "TRENDING_AUDIO_INCREASE_REACH");
        A07 = creatorViewerSignalType2;
        CreatorViewerSignalType creatorViewerSignalType3 = new CreatorViewerSignalType("CAPTION_STICKER_ENABLED_SOUND_OFF_VIEWING", 2, "caption_sticker_enabled_sound_off_viewing");
        A04 = creatorViewerSignalType3;
        CreatorViewerSignalType creatorViewerSignalType4 = new CreatorViewerSignalType("POPULAR_REEL_WITH_FOLLOWERS", 3, "popular_reel_with_followers");
        A05 = creatorViewerSignalType4;
        CreatorViewerSignalType creatorViewerSignalType5 = new CreatorViewerSignalType("TEXT", 4, "text");
        A06 = creatorViewerSignalType5;
        CreatorViewerSignalType creatorViewerSignalType6 = new CreatorViewerSignalType("TRENDING_WITH_SIMILAR_ACCOUNTS_AUDIO", 5, "trending_with_similar_accounts_audio");
        A08 = creatorViewerSignalType6;
        CreatorViewerSignalType[] creatorViewerSignalTypeArr = {creatorViewerSignalType, creatorViewerSignalType2, creatorViewerSignalType3, creatorViewerSignalType4, creatorViewerSignalType5, creatorViewerSignalType6, new CreatorViewerSignalType("VOICE_OVER", 6, "voice_over")};
        A03 = creatorViewerSignalTypeArr;
        A02 = AbstractC12190kN.A00(creatorViewerSignalTypeArr);
        CreatorViewerSignalType[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (CreatorViewerSignalType creatorViewerSignalType7 : values) {
            A18.put(creatorViewerSignalType7.A00, creatorViewerSignalType7);
        }
        A01 = A18;
        CREATOR = C41854Ig8.A00(55);
    }

    public static CreatorViewerSignalType valueOf(String str) {
        return (CreatorViewerSignalType) Enum.valueOf(CreatorViewerSignalType.class, str);
    }

    public static CreatorViewerSignalType[] values() {
        return (CreatorViewerSignalType[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public CreatorViewerSignalType(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
