package com.instagram.clips.model.metadata;

import X.AbstractC12190kN;
import X.AbstractC167017dG;
import X.AbstractC167027dH;
import X.AbstractC25225BEi;
import X.LNM;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class AudioPartType implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ AudioPartType[] A03;
    public static final AudioPartType A04;
    public static final AudioPartType A05;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        AudioPartType audioPartType = new AudioPartType("UNRECOGNIZED", 0, "AudioPartType_unspecified");
        A05 = audioPartType;
        AudioPartType audioPartType2 = new AudioPartType("ORIGINAL_SOUNDS", 1, "original_sounds");
        A04 = audioPartType2;
        AudioPartType[] audioPartTypeArr = {audioPartType, audioPartType2, new AudioPartType("LICENSED_MUSIC", 2, "licensed_music")};
        A03 = audioPartTypeArr;
        A02 = AbstractC12190kN.A00(audioPartTypeArr);
        AudioPartType[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (AudioPartType audioPartType3 : values) {
            A18.put(audioPartType3.A00, audioPartType3);
        }
        A01 = A18;
        CREATOR = LNM.A00(5);
    }

    public static AudioPartType valueOf(String str) {
        return (AudioPartType) Enum.valueOf(AudioPartType.class, str);
    }

    public static AudioPartType[] values() {
        return (AudioPartType[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public AudioPartType(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
