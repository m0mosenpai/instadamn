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
/* loaded from: classes4.dex */
public final class AudioFilterType implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ AudioFilterType[] A03;
    public static final AudioFilterType A04;
    public static final AudioFilterType A05;
    public static final AudioFilterType A06;
    public static final AudioFilterType A07;
    public static final AudioFilterType A08;
    public static final AudioFilterType A09;
    public static final AudioFilterType A0A;
    public static final AudioFilterType A0B;
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
        AudioFilterType audioFilterType = new AudioFilterType("UNRECOGNIZED", 0, "AudioFilterType_unspecified");
        A0A = audioFilterType;
        AudioFilterType audioFilterType2 = new AudioFilterType("CRUNCHY", 1, "CRUNCHY");
        A04 = audioFilterType2;
        AudioFilterType audioFilterType3 = new AudioFilterType("DREAMY", 2, "DREAMY");
        A05 = audioFilterType3;
        AudioFilterType audioFilterType4 = new AudioFilterType("RADIO", 3, "RADIO");
        A06 = audioFilterType4;
        AudioFilterType audioFilterType5 = new AudioFilterType("SLOWED", 4, "SLOWED");
        A07 = audioFilterType5;
        AudioFilterType audioFilterType6 = new AudioFilterType("SPED_UP", 5, "SPED_UP");
        A08 = audioFilterType6;
        AudioFilterType audioFilterType7 = new AudioFilterType("SWIRL", 6, "SWIRL");
        A09 = audioFilterType7;
        AudioFilterType audioFilterType8 = new AudioFilterType("VINYL", 7, "VINYL");
        A0B = audioFilterType8;
        AudioFilterType[] audioFilterTypeArr = {audioFilterType, audioFilterType2, audioFilterType3, audioFilterType4, audioFilterType5, audioFilterType6, audioFilterType7, audioFilterType8};
        A03 = audioFilterTypeArr;
        A02 = AbstractC12190kN.A00(audioFilterTypeArr);
        AudioFilterType[] values = values();
        int A0L = AbstractC16850sd.A0L(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L < 16 ? 16 : A0L);
        for (AudioFilterType audioFilterType9 : values) {
            linkedHashMap.put(audioFilterType9.A00, audioFilterType9);
        }
        A01 = linkedHashMap;
        CREATOR = new C206149Aw(47);
    }

    public static AudioFilterType valueOf(String str) {
        return (AudioFilterType) Enum.valueOf(AudioFilterType.class, str);
    }

    public static AudioFilterType[] values() {
        return (AudioFilterType[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public AudioFilterType(String str, int i, String str2) {
        this.A00 = str2;
    }
}
