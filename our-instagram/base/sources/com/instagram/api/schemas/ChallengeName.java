package com.instagram.api.schemas;

import X.AbstractC12190kN;
import X.AbstractC167017dG;
import X.AbstractC167027dH;
import X.AbstractC25225BEi;
import X.C63469Sl9;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class ChallengeName implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ ChallengeName[] A03;
    public static final ChallengeName A04;
    public static final ChallengeName A05;
    public static final ChallengeName A06;
    public static final ChallengeName A07;
    public static final ChallengeName A08;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        ChallengeName challengeName = new ChallengeName("UNRECOGNIZED", 0, "ChallengeName_unspecified");
        A08 = challengeName;
        ChallengeName challengeName2 = new ChallengeName("COMBO_CREATION_CHALLENGE", 1, "combo_creation_challenge");
        A04 = challengeName2;
        ChallengeName challengeName3 = new ChallengeName("DAILY_STORY_CHALLENGE", 2, "daily_story_challenge");
        A05 = challengeName3;
        ChallengeName challengeName4 = new ChallengeName("POSTS_CREATION_CHALLENGE", 3, "posts_creation_challenge");
        A06 = challengeName4;
        ChallengeName challengeName5 = new ChallengeName("REELS_CREATION_CHALLENGE", 4, "reels_creation_challenge");
        A07 = challengeName5;
        ChallengeName[] challengeNameArr = {challengeName, challengeName2, challengeName3, challengeName4, challengeName5, new ChallengeName("REELS_PLAYS_CHALLENGE", 5, "reels_plays_challenge")};
        A03 = challengeNameArr;
        A02 = AbstractC12190kN.A00(challengeNameArr);
        ChallengeName[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (ChallengeName challengeName6 : values) {
            A18.put(challengeName6.A00, challengeName6);
        }
        A01 = A18;
        CREATOR = new C63469Sl9(97);
    }

    public static ChallengeName valueOf(String str) {
        return (ChallengeName) Enum.valueOf(ChallengeName.class, str);
    }

    public static ChallengeName[] values() {
        return (ChallengeName[]) A03.clone();
    }

    public ChallengeName(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
