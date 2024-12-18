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
public final class IGMusicArtistPinningErrorType implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ IGMusicArtistPinningErrorType[] A03;
    public static final IGMusicArtistPinningErrorType A04;
    public static final IGMusicArtistPinningErrorType A05;
    public static final IGMusicArtistPinningErrorType A06;
    public static final IGMusicArtistPinningErrorType A07;
    public static final IGMusicArtistPinningErrorType A08;
    public static final IGMusicArtistPinningErrorType A09;
    public static final IGMusicArtistPinningErrorType A0A;
    public static final IGMusicArtistPinningErrorType A0B;
    public static final IGMusicArtistPinningErrorType A0C;
    public static final IGMusicArtistPinningErrorType A0D;
    public static final IGMusicArtistPinningErrorType A0E;
    public static final IGMusicArtistPinningErrorType A0F;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        IGMusicArtistPinningErrorType iGMusicArtistPinningErrorType = new IGMusicArtistPinningErrorType("UNRECOGNIZED", 0, "IGMusicArtistPinningErrorType_unspecified");
        A0C = iGMusicArtistPinningErrorType;
        IGMusicArtistPinningErrorType iGMusicArtistPinningErrorType2 = new IGMusicArtistPinningErrorType("CLIP_MARKED_SENSITIVE", 1, "clip_marked_sensitive");
        A04 = iGMusicArtistPinningErrorType2;
        IGMusicArtistPinningErrorType iGMusicArtistPinningErrorType3 = new IGMusicArtistPinningErrorType("HAS_MAX_PINNED", 2, "has_max_pinned");
        A05 = iGMusicArtistPinningErrorType3;
        IGMusicArtistPinningErrorType iGMusicArtistPinningErrorType4 = new IGMusicArtistPinningErrorType("INVALID_AUDIO", 3, "invalid_audio");
        A06 = iGMusicArtistPinningErrorType4;
        IGMusicArtistPinningErrorType iGMusicArtistPinningErrorType5 = new IGMusicArtistPinningErrorType("MEDIA_ALREADY_PINNED", 4, "media_already_pinned");
        A07 = iGMusicArtistPinningErrorType5;
        IGMusicArtistPinningErrorType iGMusicArtistPinningErrorType6 = new IGMusicArtistPinningErrorType("MEDIA_NON_RECOMMENDABLE", 5, "media_non_recommendable");
        A08 = iGMusicArtistPinningErrorType6;
        IGMusicArtistPinningErrorType iGMusicArtistPinningErrorType7 = new IGMusicArtistPinningErrorType("MEDIA_NOT_PINNED", 6, "media_not_pinned");
        A09 = iGMusicArtistPinningErrorType7;
        IGMusicArtistPinningErrorType iGMusicArtistPinningErrorType8 = new IGMusicArtistPinningErrorType("NOT_MEDIA_OWNER", 7, "not_media_owner");
        A0A = iGMusicArtistPinningErrorType8;
        IGMusicArtistPinningErrorType iGMusicArtistPinningErrorType9 = new IGMusicArtistPinningErrorType("UNKNOWN", 8, "unknown");
        A0B = iGMusicArtistPinningErrorType9;
        IGMusicArtistPinningErrorType iGMusicArtistPinningErrorType10 = new IGMusicArtistPinningErrorType("USER_NOT_PASSING_INTEGRITY", 9, "user_not_passing_integrity");
        A0D = iGMusicArtistPinningErrorType10;
        IGMusicArtistPinningErrorType iGMusicArtistPinningErrorType11 = new IGMusicArtistPinningErrorType("VIEWER_NOT_OWNER", 10, "viewer_not_owner");
        A0E = iGMusicArtistPinningErrorType11;
        IGMusicArtistPinningErrorType iGMusicArtistPinningErrorType12 = new IGMusicArtistPinningErrorType("VIEWER_OWNS_REEL", 11, "viewer_owns_reel");
        A0F = iGMusicArtistPinningErrorType12;
        IGMusicArtistPinningErrorType[] iGMusicArtistPinningErrorTypeArr = {iGMusicArtistPinningErrorType, iGMusicArtistPinningErrorType2, iGMusicArtistPinningErrorType3, iGMusicArtistPinningErrorType4, iGMusicArtistPinningErrorType5, iGMusicArtistPinningErrorType6, iGMusicArtistPinningErrorType7, iGMusicArtistPinningErrorType8, iGMusicArtistPinningErrorType9, iGMusicArtistPinningErrorType10, iGMusicArtistPinningErrorType11, iGMusicArtistPinningErrorType12};
        A03 = iGMusicArtistPinningErrorTypeArr;
        A02 = AbstractC12190kN.A00(iGMusicArtistPinningErrorTypeArr);
        IGMusicArtistPinningErrorType[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (IGMusicArtistPinningErrorType iGMusicArtistPinningErrorType13 : values) {
            A18.put(iGMusicArtistPinningErrorType13.A00, iGMusicArtistPinningErrorType13);
        }
        A01 = A18;
        CREATOR = C41858IgC.A00(39);
    }

    public static IGMusicArtistPinningErrorType valueOf(String str) {
        return (IGMusicArtistPinningErrorType) Enum.valueOf(IGMusicArtistPinningErrorType.class, str);
    }

    public static IGMusicArtistPinningErrorType[] values() {
        return (IGMusicArtistPinningErrorType[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public IGMusicArtistPinningErrorType(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
