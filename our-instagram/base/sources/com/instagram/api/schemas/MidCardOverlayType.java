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
public final class MidCardOverlayType implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ MidCardOverlayType[] A03;
    public static final MidCardOverlayType A04;
    public static final MidCardOverlayType A05;
    public static final MidCardOverlayType A06;
    public static final MidCardOverlayType A07;
    public static final MidCardOverlayType A08;
    public static final MidCardOverlayType A09;
    public static final MidCardOverlayType A0A;
    public static final MidCardOverlayType A0B;
    public static final MidCardOverlayType A0C;
    public static final MidCardOverlayType A0D;
    public static final MidCardOverlayType A0E;
    public static final MidCardOverlayType A0F;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        MidCardOverlayType midCardOverlayType = new MidCardOverlayType("UNRECOGNIZED", 0, "MidCardOverlayType_unspecified");
        A0A = midCardOverlayType;
        MidCardOverlayType midCardOverlayType2 = new MidCardOverlayType("AUDIO_ATTRIBUTION", 1, "audio_attribution");
        A04 = midCardOverlayType2;
        MidCardOverlayType midCardOverlayType3 = new MidCardOverlayType("COLLAB_ATTRIBUTION", 2, "collab_attribution");
        A05 = midCardOverlayType3;
        MidCardOverlayType midCardOverlayType4 = new MidCardOverlayType("DRAFT_DURATION", 3, "draft_duration");
        A06 = midCardOverlayType4;
        MidCardOverlayType midCardOverlayType5 = new MidCardOverlayType("STORY_USER_NAME", 4, "story_user_name");
        A07 = midCardOverlayType5;
        MidCardOverlayType midCardOverlayType6 = new MidCardOverlayType("TEXT_OVERLAY", 5, "text_overlay");
        A08 = midCardOverlayType6;
        MidCardOverlayType midCardOverlayType7 = new MidCardOverlayType("TRACK_COVER_AND_NAME", 6, "track_cover_and_name");
        A09 = midCardOverlayType7;
        MidCardOverlayType midCardOverlayType8 = new MidCardOverlayType("USER_NAME", 7, "user_name");
        A0B = midCardOverlayType8;
        MidCardOverlayType midCardOverlayType9 = new MidCardOverlayType("USER_NAME_AND_COMMENT_COUNT", 8, "user_name_and_comment_count");
        A0C = midCardOverlayType9;
        MidCardOverlayType midCardOverlayType10 = new MidCardOverlayType("USER_NAME_AND_FOLLOWER_COUNT", 9, "user_name_and_follower_count");
        A0D = midCardOverlayType10;
        MidCardOverlayType midCardOverlayType11 = new MidCardOverlayType("USER_NAME_AND_LIKE_COUNT", 10, "user_name_and_like_count");
        A0E = midCardOverlayType11;
        MidCardOverlayType midCardOverlayType12 = new MidCardOverlayType("USER_NAME_AND_PLAY_COUNT", 11, "user_name_and_play_count");
        A0F = midCardOverlayType12;
        MidCardOverlayType[] midCardOverlayTypeArr = {midCardOverlayType, midCardOverlayType2, midCardOverlayType3, midCardOverlayType4, midCardOverlayType5, midCardOverlayType6, midCardOverlayType7, midCardOverlayType8, midCardOverlayType9, midCardOverlayType10, midCardOverlayType11, midCardOverlayType12, new MidCardOverlayType("USER_NAME_AND_RESHARE_COUNT", 12, "user_name_and_reshare_count")};
        A03 = midCardOverlayTypeArr;
        A02 = AbstractC12190kN.A00(midCardOverlayTypeArr);
        MidCardOverlayType[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (MidCardOverlayType midCardOverlayType13 : values) {
            A18.put(midCardOverlayType13.A00, midCardOverlayType13);
        }
        A01 = A18;
        CREATOR = C41858IgC.A00(97);
    }

    public static MidCardOverlayType valueOf(String str) {
        return (MidCardOverlayType) Enum.valueOf(MidCardOverlayType.class, str);
    }

    public static MidCardOverlayType[] values() {
        return (MidCardOverlayType[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public MidCardOverlayType(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
