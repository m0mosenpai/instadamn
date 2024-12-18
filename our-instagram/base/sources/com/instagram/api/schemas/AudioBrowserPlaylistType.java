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
public final class AudioBrowserPlaylistType implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ AudioBrowserPlaylistType[] A03;
    public static final AudioBrowserPlaylistType A04;
    public static final AudioBrowserPlaylistType A05;
    public static final AudioBrowserPlaylistType A06;
    public static final AudioBrowserPlaylistType A07;
    public static final AudioBrowserPlaylistType A08;
    public static final AudioBrowserPlaylistType A09;
    public static final AudioBrowserPlaylistType A0A;
    public static final AudioBrowserPlaylistType A0B;
    public static final AudioBrowserPlaylistType A0C;
    public static final AudioBrowserPlaylistType A0D;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        AudioBrowserPlaylistType audioBrowserPlaylistType = new AudioBrowserPlaylistType("UNRECOGNIZED", 0, "AudioBrowserPlaylistType_unspecified");
        A0D = audioBrowserPlaylistType;
        AudioBrowserPlaylistType audioBrowserPlaylistType2 = new AudioBrowserPlaylistType("ARTIST_SPOTLIGHT", 1, "artist_spotlight");
        A04 = audioBrowserPlaylistType2;
        AudioBrowserPlaylistType audioBrowserPlaylistType3 = new AudioBrowserPlaylistType("CONTEXTUAL_MUSIC_RECS", 2, "contextual_music_recs");
        A05 = audioBrowserPlaylistType3;
        AudioBrowserPlaylistType audioBrowserPlaylistType4 = new AudioBrowserPlaylistType("DEFAULT", 3, "default_playlist_type");
        A06 = audioBrowserPlaylistType4;
        AudioBrowserPlaylistType audioBrowserPlaylistType5 = new AudioBrowserPlaylistType("FOR_YOU", 4, "for_you");
        A07 = audioBrowserPlaylistType5;
        AudioBrowserPlaylistType audioBrowserPlaylistType6 = new AudioBrowserPlaylistType("NUMBERED", 5, "numbered");
        A08 = audioBrowserPlaylistType6;
        AudioBrowserPlaylistType audioBrowserPlaylistType7 = new AudioBrowserPlaylistType("RECENTLY_LIKED_CLIPS", 6, "recently_liked_clips");
        A09 = audioBrowserPlaylistType7;
        AudioBrowserPlaylistType audioBrowserPlaylistType8 = new AudioBrowserPlaylistType("SOUND_EFFECTS", 7, "sound_effects");
        A0A = audioBrowserPlaylistType8;
        AudioBrowserPlaylistType audioBrowserPlaylistType9 = new AudioBrowserPlaylistType("SPOTIFY", 8, "spotify");
        A0B = audioBrowserPlaylistType9;
        AudioBrowserPlaylistType audioBrowserPlaylistType10 = new AudioBrowserPlaylistType("SPOTIFY_RECENTLY_PLAYED", 9, "spotify_recently_played");
        A0C = audioBrowserPlaylistType10;
        AudioBrowserPlaylistType[] audioBrowserPlaylistTypeArr = {audioBrowserPlaylistType, audioBrowserPlaylistType2, audioBrowserPlaylistType3, audioBrowserPlaylistType4, audioBrowserPlaylistType5, audioBrowserPlaylistType6, audioBrowserPlaylistType7, audioBrowserPlaylistType8, audioBrowserPlaylistType9, audioBrowserPlaylistType10};
        A03 = audioBrowserPlaylistTypeArr;
        A02 = AbstractC12190kN.A00(audioBrowserPlaylistTypeArr);
        AudioBrowserPlaylistType[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (AudioBrowserPlaylistType audioBrowserPlaylistType11 : values) {
            A18.put(audioBrowserPlaylistType11.A00, audioBrowserPlaylistType11);
        }
        A01 = A18;
        CREATOR = new C63469Sl9(62);
    }

    public static AudioBrowserPlaylistType valueOf(String str) {
        return (AudioBrowserPlaylistType) Enum.valueOf(AudioBrowserPlaylistType.class, str);
    }

    public static AudioBrowserPlaylistType[] values() {
        return (AudioBrowserPlaylistType[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public AudioBrowserPlaylistType(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
