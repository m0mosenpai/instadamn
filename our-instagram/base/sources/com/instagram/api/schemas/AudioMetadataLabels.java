package com.instagram.api.schemas;

import X.AbstractC12190kN;
import X.AbstractC16850sd;
import X.C14360o3;
import X.C206149Aw;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class AudioMetadataLabels implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ AudioMetadataLabels[] A03;
    public static final AudioMetadataLabels A04;
    public static final AudioMetadataLabels A05;
    public static final AudioMetadataLabels A06;
    public static final AudioMetadataLabels A07;
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
        AudioMetadataLabels audioMetadataLabels = new AudioMetadataLabels("UNRECOGNIZED", 0, "AudioMetadataLabels_unspecified");
        A07 = audioMetadataLabels;
        AudioMetadataLabels audioMetadataLabels2 = new AudioMetadataLabels("NEW_RELEASE", 1, "new_release");
        A04 = audioMetadataLabels2;
        AudioMetadataLabels audioMetadataLabels3 = new AudioMetadataLabels("PRE_RELEASE", 2, "pre_release");
        A05 = audioMetadataLabels3;
        AudioMetadataLabels audioMetadataLabels4 = new AudioMetadataLabels("SPOTIFY_PLAYLIST_AS_SPOTLIGHT_BANNER_SONG", 3, "spotify_playlist_as_spotlight_banner_song");
        A06 = audioMetadataLabels4;
        AudioMetadataLabels[] audioMetadataLabelsArr = {audioMetadataLabels, audioMetadataLabels2, audioMetadataLabels3, audioMetadataLabels4};
        A03 = audioMetadataLabelsArr;
        A02 = AbstractC12190kN.A00(audioMetadataLabelsArr);
        AudioMetadataLabels[] values = values();
        int A0L = AbstractC16850sd.A0L(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L < 16 ? 16 : A0L);
        for (AudioMetadataLabels audioMetadataLabels5 : values) {
            linkedHashMap.put(audioMetadataLabels5.A00, audioMetadataLabels5);
        }
        A01 = linkedHashMap;
        CREATOR = new C206149Aw(48);
    }

    public static AudioMetadataLabels valueOf(String str) {
        return (AudioMetadataLabels) Enum.valueOf(AudioMetadataLabels.class, str);
    }

    public static AudioMetadataLabels[] values() {
        return (AudioMetadataLabels[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public AudioMetadataLabels(String str, int i, String str2) {
        this.A00 = str2;
    }
}