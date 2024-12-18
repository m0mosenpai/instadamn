package com.instagram.music.common.model;

import X.AbstractC12190kN;
import X.C14360o3;
import X.C9Ay;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class AudioType implements Parcelable {
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ AudioType[] A02;
    public static final AudioType A03;
    public static final AudioType A04;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(name());
    }

    static {
        AudioType audioType = new AudioType("MUSIC", 0, "song");
        A03 = audioType;
        AudioType audioType2 = new AudioType("ORIGINAL_AUDIO", 1, "original");
        A04 = audioType2;
        AudioType[] audioTypeArr = {audioType, audioType2};
        A02 = audioTypeArr;
        A01 = AbstractC12190kN.A00(audioTypeArr);
        CREATOR = new C9Ay(47);
    }

    public static AudioType valueOf(String str) {
        return (AudioType) Enum.valueOf(AudioType.class, str);
    }

    public static AudioType[] values() {
        return (AudioType[]) A02.clone();
    }

    public AudioType(String str, int i, String str2) {
        this.A00 = str2;
    }
}
