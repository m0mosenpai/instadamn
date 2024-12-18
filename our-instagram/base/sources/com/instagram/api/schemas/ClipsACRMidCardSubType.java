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
public final class ClipsACRMidCardSubType implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ ClipsACRMidCardSubType[] A03;
    public static final ClipsACRMidCardSubType A04;
    public static final ClipsACRMidCardSubType A05;
    public static final ClipsACRMidCardSubType A06;
    public static final ClipsACRMidCardSubType A07;
    public static final ClipsACRMidCardSubType A08;
    public static final ClipsACRMidCardSubType A09;
    public static final ClipsACRMidCardSubType A0A;
    public static final ClipsACRMidCardSubType A0B;
    public static final ClipsACRMidCardSubType A0C;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        ClipsACRMidCardSubType clipsACRMidCardSubType = new ClipsACRMidCardSubType("UNRECOGNIZED", 0, "ClipsACRMidCardSubType_unspecified");
        A0C = clipsACRMidCardSubType;
        ClipsACRMidCardSubType clipsACRMidCardSubType2 = new ClipsACRMidCardSubType("ACR_FEED_CAROUSEL_HISTORICAL", 1, "acr_feed_carousel_historical");
        A04 = clipsACRMidCardSubType2;
        ClipsACRMidCardSubType clipsACRMidCardSubType3 = new ClipsACRMidCardSubType("ACR_FEED_CAROUSEL_HISTORICAL_3D", 2, "acr_feed_carousel_historical_3d");
        A05 = clipsACRMidCardSubType3;
        ClipsACRMidCardSubType clipsACRMidCardSubType4 = new ClipsACRMidCardSubType("ACR_FEED_GENERIC", 3, "acr_feed_generic");
        A06 = clipsACRMidCardSubType4;
        ClipsACRMidCardSubType clipsACRMidCardSubType5 = new ClipsACRMidCardSubType("ACR_MEMORY_HIGHLIGHT", 4, "acr_memory_highlight");
        A07 = clipsACRMidCardSubType5;
        ClipsACRMidCardSubType clipsACRMidCardSubType6 = new ClipsACRMidCardSubType("ACR_SMART_REELS", 5, "acr_smart_reels");
        A08 = clipsACRMidCardSubType6;
        ClipsACRMidCardSubType clipsACRMidCardSubType7 = new ClipsACRMidCardSubType("ACR_SMART_REELS_3D", 6, "acr_smart_reels_3d");
        A09 = clipsACRMidCardSubType7;
        ClipsACRMidCardSubType clipsACRMidCardSubType8 = new ClipsACRMidCardSubType("ACR_SMART_REELS_STRICT_MULTI_FORMAT", 7, "acr_smart_reels_strict_multi_format");
        A0A = clipsACRMidCardSubType8;
        ClipsACRMidCardSubType clipsACRMidCardSubType9 = new ClipsACRMidCardSubType("ACR_STORY_HIGHLIGHT", 8, "acr_story_highlight");
        A0B = clipsACRMidCardSubType9;
        ClipsACRMidCardSubType[] clipsACRMidCardSubTypeArr = {clipsACRMidCardSubType, clipsACRMidCardSubType2, clipsACRMidCardSubType3, clipsACRMidCardSubType4, clipsACRMidCardSubType5, clipsACRMidCardSubType6, clipsACRMidCardSubType7, clipsACRMidCardSubType8, clipsACRMidCardSubType9, new ClipsACRMidCardSubType("ACR_STORY_HIGHLIGHT_UPDATE", 9, "acr_story_highlight_update")};
        A03 = clipsACRMidCardSubTypeArr;
        A02 = AbstractC12190kN.A00(clipsACRMidCardSubTypeArr);
        ClipsACRMidCardSubType[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (ClipsACRMidCardSubType clipsACRMidCardSubType10 : values) {
            A18.put(clipsACRMidCardSubType10.A00, clipsACRMidCardSubType10);
        }
        A01 = A18;
        CREATOR = C41854Ig8.A00(1);
    }

    public static ClipsACRMidCardSubType valueOf(String str) {
        return (ClipsACRMidCardSubType) Enum.valueOf(ClipsACRMidCardSubType.class, str);
    }

    public static ClipsACRMidCardSubType[] values() {
        return (ClipsACRMidCardSubType[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public ClipsACRMidCardSubType(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
