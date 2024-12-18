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
public final class CreatorViewerInsightCTA implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ CreatorViewerInsightCTA[] A03;
    public static final CreatorViewerInsightCTA A04;
    public static final CreatorViewerInsightCTA A05;
    public static final CreatorViewerInsightCTA A06;
    public static final CreatorViewerInsightCTA A07;
    public static final CreatorViewerInsightCTA A08;
    public static final CreatorViewerInsightCTA A09;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        CreatorViewerInsightCTA creatorViewerInsightCTA = new CreatorViewerInsightCTA("UNRECOGNIZED", 0, "CreatorViewerInsightCTA_unspecified");
        A09 = creatorViewerInsightCTA;
        CreatorViewerInsightCTA creatorViewerInsightCTA2 = new CreatorViewerInsightCTA("OPEN_AUDIO_PIVOT_PAGE", 1, "open_audio_pivot_page");
        A04 = creatorViewerInsightCTA2;
        CreatorViewerInsightCTA creatorViewerInsightCTA3 = new CreatorViewerInsightCTA("OPEN_COMMENT_SHEET", 2, "open_comment_sheet");
        A05 = creatorViewerInsightCTA3;
        CreatorViewerInsightCTA creatorViewerInsightCTA4 = new CreatorViewerInsightCTA("OPEN_FOLLOWERS_SHEET", 3, "open_followers_sheet");
        A06 = creatorViewerInsightCTA4;
        CreatorViewerInsightCTA creatorViewerInsightCTA5 = new CreatorViewerInsightCTA("OPEN_LIKERS_LIST", 4, "open_likers_list");
        A07 = creatorViewerInsightCTA5;
        CreatorViewerInsightCTA creatorViewerInsightCTA6 = new CreatorViewerInsightCTA("OPEN_POPULAR_REEL_INSIGHT_SHEET", 5, "open_popular_reel_insight_sheet");
        A08 = creatorViewerInsightCTA6;
        CreatorViewerInsightCTA[] creatorViewerInsightCTAArr = {creatorViewerInsightCTA, creatorViewerInsightCTA2, creatorViewerInsightCTA3, creatorViewerInsightCTA4, creatorViewerInsightCTA5, creatorViewerInsightCTA6, new CreatorViewerInsightCTA("OPEN_TRENDING_AUDIO_USED_BY_SIMILAR_ACCOUNTS_INSIGHT_SHEET", 6, "open_trending_audio_used_by_similar_accounts_insight_sheet")};
        A03 = creatorViewerInsightCTAArr;
        A02 = AbstractC12190kN.A00(creatorViewerInsightCTAArr);
        CreatorViewerInsightCTA[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (CreatorViewerInsightCTA creatorViewerInsightCTA7 : values) {
            A18.put(creatorViewerInsightCTA7.A00, creatorViewerInsightCTA7);
        }
        A01 = A18;
        CREATOR = C41854Ig8.A00(45);
    }

    public static CreatorViewerInsightCTA valueOf(String str) {
        return (CreatorViewerInsightCTA) Enum.valueOf(CreatorViewerInsightCTA.class, str);
    }

    public static CreatorViewerInsightCTA[] values() {
        return (CreatorViewerInsightCTA[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public CreatorViewerInsightCTA(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
