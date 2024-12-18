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
public final class CreatorViewerContextCTAType implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ CreatorViewerContextCTAType[] A03;
    public static final CreatorViewerContextCTAType A04;
    public static final CreatorViewerContextCTAType A05;
    public static final CreatorViewerContextCTAType A06;
    public static final CreatorViewerContextCTAType A07;
    public static final CreatorViewerContextCTAType A08;
    public static final CreatorViewerContextCTAType A09;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        CreatorViewerContextCTAType creatorViewerContextCTAType = new CreatorViewerContextCTAType("UNRECOGNIZED", 0, "CreatorViewerContextCTAType_unspecified");
        A09 = creatorViewerContextCTAType;
        CreatorViewerContextCTAType creatorViewerContextCTAType2 = new CreatorViewerContextCTAType("INSPIRED_OTHERS_TO_CREATE", 1, "inspired_others_to_create");
        A04 = creatorViewerContextCTAType2;
        CreatorViewerContextCTAType creatorViewerContextCTAType3 = new CreatorViewerContextCTAType("POPULAR_AUDIO_WITH_FOLLOWERS", 2, "popular_audio_with_followers");
        A05 = creatorViewerContextCTAType3;
        CreatorViewerContextCTAType creatorViewerContextCTAType4 = new CreatorViewerContextCTAType("POPULAR_REEL_WITH_FOLLOWERS", 3, "popular_reel_with_followers");
        A06 = creatorViewerContextCTAType4;
        CreatorViewerContextCTAType creatorViewerContextCTAType5 = new CreatorViewerContextCTAType("REELS_RISING", 4, "reels_rising");
        A07 = creatorViewerContextCTAType5;
        CreatorViewerContextCTAType creatorViewerContextCTAType6 = new CreatorViewerContextCTAType("STRONG_HOOK", 5, "strong_hook");
        A08 = creatorViewerContextCTAType6;
        CreatorViewerContextCTAType[] creatorViewerContextCTATypeArr = {creatorViewerContextCTAType, creatorViewerContextCTAType2, creatorViewerContextCTAType3, creatorViewerContextCTAType4, creatorViewerContextCTAType5, creatorViewerContextCTAType6, new CreatorViewerContextCTAType("TRENDING_WITH_SIMILAR_ACCOUNTS_AUDIO", 6, "trending_with_similar_accounts_audio")};
        A03 = creatorViewerContextCTATypeArr;
        A02 = AbstractC12190kN.A00(creatorViewerContextCTATypeArr);
        CreatorViewerContextCTAType[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (CreatorViewerContextCTAType creatorViewerContextCTAType7 : values) {
            A18.put(creatorViewerContextCTAType7.A00, creatorViewerContextCTAType7);
        }
        A01 = A18;
        CREATOR = C41854Ig8.A00(44);
    }

    public static CreatorViewerContextCTAType valueOf(String str) {
        return (CreatorViewerContextCTAType) Enum.valueOf(CreatorViewerContextCTAType.class, str);
    }

    public static CreatorViewerContextCTAType[] values() {
        return (CreatorViewerContextCTAType[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public CreatorViewerContextCTAType(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
