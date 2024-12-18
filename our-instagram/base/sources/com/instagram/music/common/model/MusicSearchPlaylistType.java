package com.instagram.music.common.model;

import X.AbstractC12190kN;
import X.AbstractC166997dE;
import X.C14360o3;
import X.C41856IgA;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class MusicSearchPlaylistType implements Parcelable {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ MusicSearchPlaylistType[] A01;
    public static final MusicSearchPlaylistType A02;
    public static final MusicSearchPlaylistType A03;
    public static final MusicSearchPlaylistType A04;
    public static final MusicSearchPlaylistType A05;
    public static final MusicSearchPlaylistType A06;
    public static final MusicSearchPlaylistType A07;
    public static final Parcelable.Creator CREATOR;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        AbstractC166997dE.A1I(parcel, this);
    }

    static {
        MusicSearchPlaylistType musicSearchPlaylistType = new MusicSearchPlaylistType("ARTIST_SPOTLIGHT", 0);
        A02 = musicSearchPlaylistType;
        MusicSearchPlaylistType musicSearchPlaylistType2 = new MusicSearchPlaylistType("FOR_YOU", 1);
        A04 = musicSearchPlaylistType2;
        MusicSearchPlaylistType musicSearchPlaylistType3 = new MusicSearchPlaylistType("NUMBERED", 2);
        A05 = musicSearchPlaylistType3;
        MusicSearchPlaylistType musicSearchPlaylistType4 = new MusicSearchPlaylistType("SPOTIFY", 3);
        A06 = musicSearchPlaylistType4;
        MusicSearchPlaylistType musicSearchPlaylistType5 = new MusicSearchPlaylistType("SPOTIFY_RECENTLY_PLAYED", 4);
        A07 = musicSearchPlaylistType5;
        MusicSearchPlaylistType musicSearchPlaylistType6 = new MusicSearchPlaylistType("DEFAULT", 5);
        A03 = musicSearchPlaylistType6;
        MusicSearchPlaylistType[] musicSearchPlaylistTypeArr = {musicSearchPlaylistType, musicSearchPlaylistType2, musicSearchPlaylistType3, musicSearchPlaylistType4, musicSearchPlaylistType5, musicSearchPlaylistType6};
        A01 = musicSearchPlaylistTypeArr;
        A00 = AbstractC12190kN.A00(musicSearchPlaylistTypeArr);
        CREATOR = C41856IgA.A00(83);
    }

    public static MusicSearchPlaylistType valueOf(String str) {
        return (MusicSearchPlaylistType) Enum.valueOf(MusicSearchPlaylistType.class, str);
    }

    public static MusicSearchPlaylistType[] values() {
        return (MusicSearchPlaylistType[]) A01.clone();
    }

    public MusicSearchPlaylistType(String str, int i) {
    }
}
