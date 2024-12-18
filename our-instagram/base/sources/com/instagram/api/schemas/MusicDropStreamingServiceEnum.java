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
public final class MusicDropStreamingServiceEnum implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ MusicDropStreamingServiceEnum[] A03;
    public static final MusicDropStreamingServiceEnum A04;
    public static final MusicDropStreamingServiceEnum A05;
    public static final MusicDropStreamingServiceEnum A06;
    public static final MusicDropStreamingServiceEnum A07;
    public static final MusicDropStreamingServiceEnum A08;
    public static final MusicDropStreamingServiceEnum A09;
    public static final MusicDropStreamingServiceEnum A0A;
    public static final MusicDropStreamingServiceEnum A0B;
    public static final MusicDropStreamingServiceEnum A0C;
    public static final MusicDropStreamingServiceEnum A0D;
    public static final MusicDropStreamingServiceEnum A0E;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        MusicDropStreamingServiceEnum musicDropStreamingServiceEnum = new MusicDropStreamingServiceEnum("UNRECOGNIZED", 0, "MusicDropStreamingServiceEnum_unspecified");
        A0D = musicDropStreamingServiceEnum;
        MusicDropStreamingServiceEnum musicDropStreamingServiceEnum2 = new MusicDropStreamingServiceEnum("SMART_LINK", 1, "smart_link");
        A09 = musicDropStreamingServiceEnum2;
        MusicDropStreamingServiceEnum musicDropStreamingServiceEnum3 = new MusicDropStreamingServiceEnum("SPOTIFY", 2, "spotify");
        A0B = musicDropStreamingServiceEnum3;
        MusicDropStreamingServiceEnum musicDropStreamingServiceEnum4 = new MusicDropStreamingServiceEnum("APPLE_MUSIC", 3, "apple_music");
        A05 = musicDropStreamingServiceEnum4;
        MusicDropStreamingServiceEnum musicDropStreamingServiceEnum5 = new MusicDropStreamingServiceEnum("YOUTUBE_MUSIC", 4, "youtube_music");
        A0E = musicDropStreamingServiceEnum5;
        MusicDropStreamingServiceEnum musicDropStreamingServiceEnum6 = new MusicDropStreamingServiceEnum("MIXCLOUD", 5, "mixcloud");
        A08 = musicDropStreamingServiceEnum6;
        MusicDropStreamingServiceEnum musicDropStreamingServiceEnum7 = new MusicDropStreamingServiceEnum("AMAZON_MUSIC", 6, "amazon_music");
        A04 = musicDropStreamingServiceEnum7;
        MusicDropStreamingServiceEnum musicDropStreamingServiceEnum8 = new MusicDropStreamingServiceEnum("SOUNDCLOUD", 7, "soundcloud");
        A0A = musicDropStreamingServiceEnum8;
        MusicDropStreamingServiceEnum musicDropStreamingServiceEnum9 = new MusicDropStreamingServiceEnum("TIDAL", 8, "tidal");
        A0C = musicDropStreamingServiceEnum9;
        MusicDropStreamingServiceEnum musicDropStreamingServiceEnum10 = new MusicDropStreamingServiceEnum("DEEZER", 9, "deezer");
        A07 = musicDropStreamingServiceEnum10;
        MusicDropStreamingServiceEnum musicDropStreamingServiceEnum11 = new MusicDropStreamingServiceEnum("BEATPORT", 10, "beatport");
        A06 = musicDropStreamingServiceEnum11;
        MusicDropStreamingServiceEnum[] musicDropStreamingServiceEnumArr = {musicDropStreamingServiceEnum, musicDropStreamingServiceEnum2, musicDropStreamingServiceEnum3, musicDropStreamingServiceEnum4, musicDropStreamingServiceEnum5, musicDropStreamingServiceEnum6, musicDropStreamingServiceEnum7, musicDropStreamingServiceEnum8, musicDropStreamingServiceEnum9, musicDropStreamingServiceEnum10, musicDropStreamingServiceEnum11, new MusicDropStreamingServiceEnum("PANDORA", 11, "pandora")};
        A03 = musicDropStreamingServiceEnumArr;
        A02 = AbstractC12190kN.A00(musicDropStreamingServiceEnumArr);
        MusicDropStreamingServiceEnum[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (MusicDropStreamingServiceEnum musicDropStreamingServiceEnum12 : values) {
            A18.put(musicDropStreamingServiceEnum12.A00, musicDropStreamingServiceEnum12);
        }
        A01 = A18;
        CREATOR = C41855Ig9.A00(6);
    }

    public static MusicDropStreamingServiceEnum valueOf(String str) {
        return (MusicDropStreamingServiceEnum) Enum.valueOf(MusicDropStreamingServiceEnum.class, str);
    }

    public static MusicDropStreamingServiceEnum[] values() {
        return (MusicDropStreamingServiceEnum[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public MusicDropStreamingServiceEnum(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
