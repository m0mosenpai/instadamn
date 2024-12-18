package com.instagram.api.schemas;

import X.AbstractC12190kN;
import X.AbstractC16850sd;
import X.C14360o3;
import X.C206159Ax;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class MusicMuteAudioReason implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ MusicMuteAudioReason[] A03;
    public static final MusicMuteAudioReason A04;
    public static final MusicMuteAudioReason A05;
    public static final MusicMuteAudioReason A06;
    public static final MusicMuteAudioReason A07;
    public static final MusicMuteAudioReason A08;
    public static final MusicMuteAudioReason A09;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeInt(ordinal());
    }

    static {
        MusicMuteAudioReason musicMuteAudioReason = new MusicMuteAudioReason("UNRECOGNIZED", 0, "MusicMuteAudioReason_unspecified");
        A09 = musicMuteAudioReason;
        MusicMuteAudioReason musicMuteAudioReason2 = new MusicMuteAudioReason("LABEL_GO_DARK", 1, "label_go_dark");
        A04 = musicMuteAudioReason2;
        MusicMuteAudioReason musicMuteAudioReason3 = new MusicMuteAudioReason("MUSIC_RIGHTS_NOT_LAUNCHED_TO_COUNTRY", 2, "music_rights_not_launched_country");
        A05 = musicMuteAudioReason3;
        MusicMuteAudioReason musicMuteAudioReason4 = new MusicMuteAudioReason("ORIGINAL_AUDIO_MUTED", 3, "original_audio_muted");
        A06 = musicMuteAudioReason4;
        MusicMuteAudioReason musicMuteAudioReason5 = new MusicMuteAudioReason("OUTSIDE_TERRITORY", 4, "outside_territory");
        A07 = musicMuteAudioReason5;
        MusicMuteAudioReason musicMuteAudioReason6 = new MusicMuteAudioReason("SONG_NOT_AVAILABLE", 5, "song_not_available");
        A08 = musicMuteAudioReason6;
        MusicMuteAudioReason[] musicMuteAudioReasonArr = {musicMuteAudioReason, musicMuteAudioReason2, musicMuteAudioReason3, musicMuteAudioReason4, musicMuteAudioReason5, musicMuteAudioReason6};
        A03 = musicMuteAudioReasonArr;
        A02 = AbstractC12190kN.A00(musicMuteAudioReasonArr);
        MusicMuteAudioReason[] values = values();
        int A0L = AbstractC16850sd.A0L(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L < 16 ? 16 : A0L);
        for (MusicMuteAudioReason musicMuteAudioReason7 : values) {
            linkedHashMap.put(musicMuteAudioReason7.A00, musicMuteAudioReason7);
        }
        A01 = linkedHashMap;
        CREATOR = new C206159Ax(60);
    }

    public static MusicMuteAudioReason valueOf(String str) {
        return (MusicMuteAudioReason) Enum.valueOf(MusicMuteAudioReason.class, str);
    }

    public static MusicMuteAudioReason[] values() {
        return (MusicMuteAudioReason[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public MusicMuteAudioReason(String str, int i, String str2) {
        this.A00 = str2;
    }
}
