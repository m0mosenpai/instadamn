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
public final class InspirationSignalType implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ InspirationSignalType[] A03;
    public static final InspirationSignalType A04;
    public static final InspirationSignalType A05;
    public static final InspirationSignalType A06;
    public static final InspirationSignalType A07;
    public static final InspirationSignalType A08;
    public static final InspirationSignalType A09;
    public static final InspirationSignalType A0A;
    public static final InspirationSignalType A0B;
    public static final InspirationSignalType A0C;
    public static final InspirationSignalType A0D;
    public static final InspirationSignalType A0E;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        InspirationSignalType inspirationSignalType = new InspirationSignalType("UNRECOGNIZED", 0, "InspirationSignalType_unspecified");
        A0E = inspirationSignalType;
        InspirationSignalType inspirationSignalType2 = new InspirationSignalType("AUDIO_TRENDING_SIMILAR_ACCOUNTS", 1, "audio_trending_similar_accounts");
        A04 = inspirationSignalType2;
        InspirationSignalType inspirationSignalType3 = new InspirationSignalType("DIGEST", 2, "digest");
        A05 = inspirationSignalType3;
        InspirationSignalType inspirationSignalType4 = new InspirationSignalType("REELS_MIMICRY", 3, "reels_mimicry");
        A06 = inspirationSignalType4;
        InspirationSignalType inspirationSignalType5 = new InspirationSignalType("REELS_POPULAR_SIMILAR_CONTENT", 4, "reels_popular_similar_content");
        A07 = inspirationSignalType5;
        InspirationSignalType inspirationSignalType6 = new InspirationSignalType("REELS_POPULAR_WITH_FOLLOWERS", 5, "reels_popular_with_followers");
        A08 = inspirationSignalType6;
        InspirationSignalType inspirationSignalType7 = new InspirationSignalType("REELS_RISING", 6, "reels_rising");
        A09 = inspirationSignalType7;
        InspirationSignalType inspirationSignalType8 = new InspirationSignalType("REELS_STRONG_HOOK", 7, "reels_strong_hook");
        A0A = inspirationSignalType8;
        InspirationSignalType inspirationSignalType9 = new InspirationSignalType("REELS_TEST_DEV_ONLY", 8, "reels_test_dev_only");
        A0B = inspirationSignalType9;
        InspirationSignalType inspirationSignalType10 = new InspirationSignalType("REELS_TEXT", 9, "reels_text");
        A0C = inspirationSignalType10;
        InspirationSignalType inspirationSignalType11 = new InspirationSignalType("REELS_VOICEOVER", 10, "reels_voiceover");
        A0D = inspirationSignalType11;
        InspirationSignalType[] inspirationSignalTypeArr = {inspirationSignalType, inspirationSignalType2, inspirationSignalType3, inspirationSignalType4, inspirationSignalType5, inspirationSignalType6, inspirationSignalType7, inspirationSignalType8, inspirationSignalType9, inspirationSignalType10, inspirationSignalType11, new InspirationSignalType("REELS_WITH_AUDIO_TRENDING_SIMILAR_ACCOUNTS", 11, "reels_with_audio_trending_similar_accounts")};
        A03 = inspirationSignalTypeArr;
        A02 = AbstractC12190kN.A00(inspirationSignalTypeArr);
        InspirationSignalType[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (InspirationSignalType inspirationSignalType12 : values) {
            A18.put(inspirationSignalType12.A00, inspirationSignalType12);
        }
        A01 = A18;
        CREATOR = C41858IgC.A00(56);
    }

    public static InspirationSignalType valueOf(String str) {
        return (InspirationSignalType) Enum.valueOf(InspirationSignalType.class, str);
    }

    public static InspirationSignalType[] values() {
        return (InspirationSignalType[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public InspirationSignalType(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
