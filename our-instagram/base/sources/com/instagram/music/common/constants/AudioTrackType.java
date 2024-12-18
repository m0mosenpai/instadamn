package com.instagram.music.common.constants;

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
public final class AudioTrackType implements Parcelable {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ AudioTrackType[] A01;
    public static final AudioTrackType A02;
    public static final AudioTrackType A03;
    public static final AudioTrackType A04;
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
        AudioTrackType audioTrackType = new AudioTrackType("DEFAULT", 0);
        A02 = audioTrackType;
        AudioTrackType audioTrackType2 = new AudioTrackType("REACTIVE", 1);
        A04 = audioTrackType2;
        AudioTrackType audioTrackType3 = new AudioTrackType("ORIGINAL", 2);
        A03 = audioTrackType3;
        AudioTrackType[] audioTrackTypeArr = {audioTrackType, audioTrackType2, audioTrackType3};
        A01 = audioTrackTypeArr;
        A00 = AbstractC12190kN.A00(audioTrackTypeArr);
        CREATOR = C41856IgA.A00(72);
    }

    public static AudioTrackType valueOf(String str) {
        return (AudioTrackType) Enum.valueOf(AudioTrackType.class, str);
    }

    public static AudioTrackType[] values() {
        return (AudioTrackType[]) A01.clone();
    }

    public AudioTrackType(String str, int i) {
    }
}
