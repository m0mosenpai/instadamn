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
public final class CreatorViewerInsightTypeV2 implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ CreatorViewerInsightTypeV2[] A03;
    public static final CreatorViewerInsightTypeV2 A04;
    public static final CreatorViewerInsightTypeV2 A05;
    public static final CreatorViewerInsightTypeV2 A06;
    public static final CreatorViewerInsightTypeV2 A07;
    public static final CreatorViewerInsightTypeV2 A08;
    public static final CreatorViewerInsightTypeV2 A09;
    public static final CreatorViewerInsightTypeV2 A0A;
    public static final CreatorViewerInsightTypeV2 A0B;
    public static final CreatorViewerInsightTypeV2 A0C;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        CreatorViewerInsightTypeV2 creatorViewerInsightTypeV2 = new CreatorViewerInsightTypeV2("UNRECOGNIZED", 0, "CreatorViewerInsightTypeV2_unspecified");
        A0C = creatorViewerInsightTypeV2;
        CreatorViewerInsightTypeV2 creatorViewerInsightTypeV22 = new CreatorViewerInsightTypeV2("AUDIO_ARTIST_TITLE_GLOBALLY_TRENDING", 1, "audio_artist_title_globally_trending");
        A04 = creatorViewerInsightTypeV22;
        CreatorViewerInsightTypeV2 creatorViewerInsightTypeV23 = new CreatorViewerInsightTypeV2("AUDIO_ARTIST_TITLE_TRENDING", 2, "audio_artist_title_trending");
        A05 = creatorViewerInsightTypeV23;
        CreatorViewerInsightTypeV2 creatorViewerInsightTypeV24 = new CreatorViewerInsightTypeV2("AUDIO_USED_BY_CLIPS_COUNT", 3, "audio_used_by_clips_count");
        A06 = creatorViewerInsightTypeV24;
        CreatorViewerInsightTypeV2 creatorViewerInsightTypeV25 = new CreatorViewerInsightTypeV2("CLIPS_CREATED_AFTER_VIEWING", 4, "clips_created_after_viewing");
        A07 = creatorViewerInsightTypeV25;
        CreatorViewerInsightTypeV2 creatorViewerInsightTypeV26 = new CreatorViewerInsightTypeV2("PLAY_COUNT_BY_FOLLOWERS", 5, "play_count_by_followers");
        A08 = creatorViewerInsightTypeV26;
        CreatorViewerInsightTypeV2 creatorViewerInsightTypeV27 = new CreatorViewerInsightTypeV2("PLAY_COUNT_ENTIRE_CLIPS", 6, "play_count_entire_clips");
        A09 = creatorViewerInsightTypeV27;
        CreatorViewerInsightTypeV2 creatorViewerInsightTypeV28 = new CreatorViewerInsightTypeV2("PLAY_COUNT_WITH_SOUND_OFF", 7, "play_count_with_sound_off");
        A0A = creatorViewerInsightTypeV28;
        CreatorViewerInsightTypeV2 creatorViewerInsightTypeV29 = new CreatorViewerInsightTypeV2("TEXT_STYLE", 8, "text_style");
        A0B = creatorViewerInsightTypeV29;
        CreatorViewerInsightTypeV2[] creatorViewerInsightTypeV2Arr = {creatorViewerInsightTypeV2, creatorViewerInsightTypeV22, creatorViewerInsightTypeV23, creatorViewerInsightTypeV24, creatorViewerInsightTypeV25, creatorViewerInsightTypeV26, creatorViewerInsightTypeV27, creatorViewerInsightTypeV28, creatorViewerInsightTypeV29, new CreatorViewerInsightTypeV2("TRENDING_AUDIO", 9, "trending_audio")};
        A03 = creatorViewerInsightTypeV2Arr;
        A02 = AbstractC12190kN.A00(creatorViewerInsightTypeV2Arr);
        CreatorViewerInsightTypeV2[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (CreatorViewerInsightTypeV2 creatorViewerInsightTypeV210 : values) {
            A18.put(creatorViewerInsightTypeV210.A00, creatorViewerInsightTypeV210);
        }
        A01 = A18;
        CREATOR = C41854Ig8.A00(48);
    }

    public static CreatorViewerInsightTypeV2 valueOf(String str) {
        return (CreatorViewerInsightTypeV2) Enum.valueOf(CreatorViewerInsightTypeV2.class, str);
    }

    public static CreatorViewerInsightTypeV2[] values() {
        return (CreatorViewerInsightTypeV2[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public CreatorViewerInsightTypeV2(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
