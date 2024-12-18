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
/* loaded from: classes7.dex */
public final class AudioBrowserCategoryType implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ AudioBrowserCategoryType[] A03;
    public static final AudioBrowserCategoryType A04;
    public static final AudioBrowserCategoryType A05;
    public static final AudioBrowserCategoryType A06;
    public static final AudioBrowserCategoryType A07;
    public static final AudioBrowserCategoryType A08;
    public static final AudioBrowserCategoryType A09;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        AudioBrowserCategoryType audioBrowserCategoryType = new AudioBrowserCategoryType("UNRECOGNIZED", 0, "AudioBrowserCategoryType_unspecified");
        A09 = audioBrowserCategoryType;
        AudioBrowserCategoryType audioBrowserCategoryType2 = new AudioBrowserCategoryType("DEFAULT", 1, "default_category_type");
        A04 = audioBrowserCategoryType2;
        AudioBrowserCategoryType audioBrowserCategoryType3 = new AudioBrowserCategoryType("PILLS", 2, "pills");
        A05 = audioBrowserCategoryType3;
        AudioBrowserCategoryType audioBrowserCategoryType4 = new AudioBrowserCategoryType("SOUND_EFFECTS", 3, "sound_effects");
        A06 = audioBrowserCategoryType4;
        AudioBrowserCategoryType audioBrowserCategoryType5 = new AudioBrowserCategoryType("SPOTIFY_GENRES", 4, "spotify_genres");
        A07 = audioBrowserCategoryType5;
        AudioBrowserCategoryType audioBrowserCategoryType6 = new AudioBrowserCategoryType("SPOTIFY_MOODS", 5, "spotify_moods");
        A08 = audioBrowserCategoryType6;
        AudioBrowserCategoryType[] audioBrowserCategoryTypeArr = {audioBrowserCategoryType, audioBrowserCategoryType2, audioBrowserCategoryType3, audioBrowserCategoryType4, audioBrowserCategoryType5, audioBrowserCategoryType6, new AudioBrowserCategoryType("SPOTIFY_RECENTLY_PLAYED", 6, "spotify_recently_played")};
        A03 = audioBrowserCategoryTypeArr;
        A02 = AbstractC12190kN.A00(audioBrowserCategoryTypeArr);
        AudioBrowserCategoryType[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (AudioBrowserCategoryType audioBrowserCategoryType7 : values) {
            A18.put(audioBrowserCategoryType7.A00, audioBrowserCategoryType7);
        }
        A01 = A18;
        CREATOR = new C63469Sl9(60);
    }

    public static AudioBrowserCategoryType valueOf(String str) {
        return (AudioBrowserCategoryType) Enum.valueOf(AudioBrowserCategoryType.class, str);
    }

    public static AudioBrowserCategoryType[] values() {
        return (AudioBrowserCategoryType[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public AudioBrowserCategoryType(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
