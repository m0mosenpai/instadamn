package com.instagram.api.schemas;

import X.AbstractC12190kN;
import X.AbstractC167017dG;
import X.AbstractC167027dH;
import X.AbstractC25225BEi;
import X.C41858IgC;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class IGConsiderAndBrowseType implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ IGConsiderAndBrowseType[] A03;
    public static final IGConsiderAndBrowseType A04;
    public static final IGConsiderAndBrowseType A05;
    public static final IGConsiderAndBrowseType A06;
    public static final IGConsiderAndBrowseType A07;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        IGConsiderAndBrowseType iGConsiderAndBrowseType = new IGConsiderAndBrowseType("UNRECOGNIZED", 0, "IGConsiderAndBrowseType_unspecified");
        A07 = iGConsiderAndBrowseType;
        IGConsiderAndBrowseType iGConsiderAndBrowseType2 = new IGConsiderAndBrowseType("EXPLORE_GRID_TILE_TAP_AND_BROWSE", 1, "EXPLORE_GRID_TILE_TAP_AND_BROWSE");
        A04 = iGConsiderAndBrowseType2;
        IGConsiderAndBrowseType iGConsiderAndBrowseType3 = new IGConsiderAndBrowseType("PROFILE_AND_BROWSE", 2, "PROFILE_AND_BROWSE");
        A05 = iGConsiderAndBrowseType3;
        IGConsiderAndBrowseType iGConsiderAndBrowseType4 = new IGConsiderAndBrowseType("REELS_TAP_ON_CAPTION_AND_BROWSE", 3, "REELS_TAP_ON_CAPTION_AND_BROWSE");
        A06 = iGConsiderAndBrowseType4;
        IGConsiderAndBrowseType[] iGConsiderAndBrowseTypeArr = {iGConsiderAndBrowseType, iGConsiderAndBrowseType2, iGConsiderAndBrowseType3, iGConsiderAndBrowseType4, new IGConsiderAndBrowseType("REELS_TAP_TO_PAUSE_AND_BROWSE", 4, "REELS_TAP_TO_PAUSE_AND_BROWSE")};
        A03 = iGConsiderAndBrowseTypeArr;
        A02 = AbstractC12190kN.A00(iGConsiderAndBrowseTypeArr);
        IGConsiderAndBrowseType[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (IGConsiderAndBrowseType iGConsiderAndBrowseType5 : values) {
            A18.put(iGConsiderAndBrowseType5.A00, iGConsiderAndBrowseType5);
        }
        A01 = A18;
        CREATOR = C41858IgC.A00(31);
    }

    public static IGConsiderAndBrowseType valueOf(String str) {
        return (IGConsiderAndBrowseType) Enum.valueOf(IGConsiderAndBrowseType.class, str);
    }

    public static IGConsiderAndBrowseType[] values() {
        return (IGConsiderAndBrowseType[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public IGConsiderAndBrowseType(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
