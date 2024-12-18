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
public final class InstagramAudioApplySource implements Parcelable {
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ InstagramAudioApplySource[] A02;
    public static final InstagramAudioApplySource A03;
    public static final InstagramAudioApplySource A04;
    public static final InstagramAudioApplySource A05;
    public static final InstagramAudioApplySource A06;
    public static final InstagramAudioApplySource A07;
    public static final InstagramAudioApplySource A08;
    public static final Parcelable.Creator CREATOR;
    public final int A00;

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
        InstagramAudioApplySource instagramAudioApplySource = new InstagramAudioApplySource("ARTIST_SPOTLIGHT", 0, 1);
        A03 = instagramAudioApplySource;
        InstagramAudioApplySource instagramAudioApplySource2 = new InstagramAudioApplySource("PLAYLISTS", 1, 2);
        A04 = instagramAudioApplySource2;
        InstagramAudioApplySource instagramAudioApplySource3 = new InstagramAudioApplySource("SAVED", 2, 3);
        A05 = instagramAudioApplySource3;
        InstagramAudioApplySource instagramAudioApplySource4 = new InstagramAudioApplySource("SEARCH", 3, 4);
        A06 = instagramAudioApplySource4;
        InstagramAudioApplySource instagramAudioApplySource5 = new InstagramAudioApplySource("THIRD_PARTY_APP", 4, 5);
        A08 = instagramAudioApplySource5;
        InstagramAudioApplySource instagramAudioApplySource6 = new InstagramAudioApplySource("SPOTIFY_PLAYLIST", 5, 6);
        A07 = instagramAudioApplySource6;
        InstagramAudioApplySource[] instagramAudioApplySourceArr = {instagramAudioApplySource, instagramAudioApplySource2, instagramAudioApplySource3, instagramAudioApplySource4, instagramAudioApplySource5, instagramAudioApplySource6};
        A02 = instagramAudioApplySourceArr;
        A01 = AbstractC12190kN.A00(instagramAudioApplySourceArr);
        CREATOR = C41856IgA.A00(75);
    }

    public static InstagramAudioApplySource valueOf(String str) {
        return (InstagramAudioApplySource) Enum.valueOf(InstagramAudioApplySource.class, str);
    }

    public static InstagramAudioApplySource[] values() {
        return (InstagramAudioApplySource[]) A02.clone();
    }

    public InstagramAudioApplySource(String str, int i, int i2) {
        this.A00 = i2;
    }
}
