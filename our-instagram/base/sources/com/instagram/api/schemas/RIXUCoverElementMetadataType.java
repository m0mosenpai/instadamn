package com.instagram.api.schemas;

import X.AbstractC12190kN;
import X.AbstractC167017dG;
import X.AbstractC167027dH;
import X.AbstractC25225BEi;
import X.C41855Ig9;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class RIXUCoverElementMetadataType implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ RIXUCoverElementMetadataType[] A03;
    public static final RIXUCoverElementMetadataType A04;
    public static final RIXUCoverElementMetadataType A05;
    public static final RIXUCoverElementMetadataType A06;
    public static final RIXUCoverElementMetadataType A07;
    public static final RIXUCoverElementMetadataType A08;
    public static final RIXUCoverElementMetadataType A09;
    public static final RIXUCoverElementMetadataType A0A;
    public static final RIXUCoverElementMetadataType A0B;
    public static final RIXUCoverElementMetadataType A0C;
    public static final RIXUCoverElementMetadataType A0D;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        RIXUCoverElementMetadataType rIXUCoverElementMetadataType = new RIXUCoverElementMetadataType("UNRECOGNIZED", 0, "RIXUCoverElementMetadataType_unspecified");
        A0D = rIXUCoverElementMetadataType;
        RIXUCoverElementMetadataType rIXUCoverElementMetadataType2 = new RIXUCoverElementMetadataType("AUTHOR_USERNAME", 1, "author_username");
        A04 = rIXUCoverElementMetadataType2;
        RIXUCoverElementMetadataType rIXUCoverElementMetadataType3 = new RIXUCoverElementMetadataType("AUTHOR_USERNAME_WITH_PROFILE_PIC", 2, "author_username_with_profile_pic");
        A05 = rIXUCoverElementMetadataType3;
        RIXUCoverElementMetadataType rIXUCoverElementMetadataType4 = new RIXUCoverElementMetadataType("CONTENT_NOTE", 3, "content_note");
        A06 = rIXUCoverElementMetadataType4;
        RIXUCoverElementMetadataType rIXUCoverElementMetadataType5 = new RIXUCoverElementMetadataType("FACEPILE_OR_LIKE_COUNT_WITH_HEART", 4, "facepile_or_like_count_with_heart");
        A07 = rIXUCoverElementMetadataType5;
        RIXUCoverElementMetadataType rIXUCoverElementMetadataType6 = new RIXUCoverElementMetadataType("LIKE_COUNT_TEXT_WTIH_ICON", 5, "like_count_text_with_icon");
        A0A = rIXUCoverElementMetadataType6;
        RIXUCoverElementMetadataType rIXUCoverElementMetadataType7 = new RIXUCoverElementMetadataType("LIKE_COUNT_WITH_HEART", 6, "like_count_with_heart");
        A0B = rIXUCoverElementMetadataType7;
        RIXUCoverElementMetadataType rIXUCoverElementMetadataType8 = new RIXUCoverElementMetadataType("LIKED_BY_FACEPILE", 7, "liked_by_facepile");
        A08 = rIXUCoverElementMetadataType8;
        RIXUCoverElementMetadataType rIXUCoverElementMetadataType9 = new RIXUCoverElementMetadataType("LIKED_BY_FACEPILE_WITH_HEART", 8, "liked_by_facepile_with_heart");
        A09 = rIXUCoverElementMetadataType9;
        RIXUCoverElementMetadataType rIXUCoverElementMetadataType10 = new RIXUCoverElementMetadataType("PLAY_COUNT_TEXT_WITH_ICON", 9, "play_count_text_with_icon");
        A0C = rIXUCoverElementMetadataType10;
        RIXUCoverElementMetadataType[] rIXUCoverElementMetadataTypeArr = {rIXUCoverElementMetadataType, rIXUCoverElementMetadataType2, rIXUCoverElementMetadataType3, rIXUCoverElementMetadataType4, rIXUCoverElementMetadataType5, rIXUCoverElementMetadataType6, rIXUCoverElementMetadataType7, rIXUCoverElementMetadataType8, rIXUCoverElementMetadataType9, rIXUCoverElementMetadataType10, new RIXUCoverElementMetadataType("TEMPLATE_SOCIAL_GRAPH_FACEPILE", 10, "template_social_graph_facepile")};
        A03 = rIXUCoverElementMetadataTypeArr;
        A02 = AbstractC12190kN.A00(rIXUCoverElementMetadataTypeArr);
        RIXUCoverElementMetadataType[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (RIXUCoverElementMetadataType rIXUCoverElementMetadataType11 : values) {
            A18.put(rIXUCoverElementMetadataType11.A00, rIXUCoverElementMetadataType11);
        }
        A01 = A18;
        CREATOR = C41855Ig9.A00(81);
    }

    public static RIXUCoverElementMetadataType valueOf(String str) {
        return (RIXUCoverElementMetadataType) Enum.valueOf(RIXUCoverElementMetadataType.class, str);
    }

    public static RIXUCoverElementMetadataType[] values() {
        return (RIXUCoverElementMetadataType[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public RIXUCoverElementMetadataType(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
