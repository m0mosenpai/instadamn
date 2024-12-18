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
public final class CreatorViewerInsightType implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ CreatorViewerInsightType[] A03;
    public static final CreatorViewerInsightType A04;
    public static final CreatorViewerInsightType A05;
    public static final CreatorViewerInsightType A06;
    public static final CreatorViewerInsightType A07;
    public static final CreatorViewerInsightType A08;
    public static final CreatorViewerInsightType A09;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        CreatorViewerInsightType creatorViewerInsightType = new CreatorViewerInsightType("UNRECOGNIZED", 0, "CreatorViewerInsightType_unspecified");
        A09 = creatorViewerInsightType;
        CreatorViewerInsightType creatorViewerInsightType2 = new CreatorViewerInsightType("COMMENTED_BY_FOLLOWERS", 1, "commented_by_followers");
        A04 = creatorViewerInsightType2;
        CreatorViewerInsightType creatorViewerInsightType3 = new CreatorViewerInsightType("LIKED_BY_FOLLOWERS", 2, "liked_by_followers");
        A05 = creatorViewerInsightType3;
        CreatorViewerInsightType creatorViewerInsightType4 = new CreatorViewerInsightType("MEDIA_OWNER_FOLLOWED_BY_FOLLOWERS", 3, "media_owner_followed_by_followers");
        A06 = creatorViewerInsightType4;
        CreatorViewerInsightType creatorViewerInsightType5 = new CreatorViewerInsightType("POPULAR_AUDIO_AMONG_FOLLOWERS", 4, "popular_audio_among_followers");
        A07 = creatorViewerInsightType5;
        CreatorViewerInsightType creatorViewerInsightType6 = new CreatorViewerInsightType("POPULAR_REEL_WITH_FOLLOWERS", 5, "popular_reel_with_followers");
        A08 = creatorViewerInsightType6;
        CreatorViewerInsightType[] creatorViewerInsightTypeArr = {creatorViewerInsightType, creatorViewerInsightType2, creatorViewerInsightType3, creatorViewerInsightType4, creatorViewerInsightType5, creatorViewerInsightType6, new CreatorViewerInsightType("TRENDING_AUDIO_USED_BY_SIMILAR_FOLLOWERS", 6, "trending_audio_used_by_similar_accounts")};
        A03 = creatorViewerInsightTypeArr;
        A02 = AbstractC12190kN.A00(creatorViewerInsightTypeArr);
        CreatorViewerInsightType[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (CreatorViewerInsightType creatorViewerInsightType7 : values) {
            A18.put(creatorViewerInsightType7.A00, creatorViewerInsightType7);
        }
        A01 = A18;
        CREATOR = C41854Ig8.A00(47);
    }

    public static CreatorViewerInsightType valueOf(String str) {
        return (CreatorViewerInsightType) Enum.valueOf(CreatorViewerInsightType.class, str);
    }

    public static CreatorViewerInsightType[] values() {
        return (CreatorViewerInsightType[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public CreatorViewerInsightType(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
