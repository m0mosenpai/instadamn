package com.instagram.api.schemas;

import X.AbstractC12190kN;
import X.AbstractC167017dG;
import X.AbstractC167027dH;
import X.AbstractC25225BEi;
import X.C41854Ig8;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class ClipsAudioMuteReasonType implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ ClipsAudioMuteReasonType[] A03;
    public static final ClipsAudioMuteReasonType A04;
    public static final ClipsAudioMuteReasonType A05;
    public static final ClipsAudioMuteReasonType A06;
    public static final ClipsAudioMuteReasonType A07;
    public static final ClipsAudioMuteReasonType A08;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        ClipsAudioMuteReasonType clipsAudioMuteReasonType = new ClipsAudioMuteReasonType("UNRECOGNIZED", 0, "ClipsAudioMuteReasonType_unspecified");
        A08 = clipsAudioMuteReasonType;
        ClipsAudioMuteReasonType clipsAudioMuteReasonType2 = new ClipsAudioMuteReasonType("ORIGINAL_AUDIO_MUTED", 1, "original_audio_muted");
        A05 = clipsAudioMuteReasonType2;
        ClipsAudioMuteReasonType clipsAudioMuteReasonType3 = new ClipsAudioMuteReasonType("OUTSIDE_TERRITORY", 2, "outside_territory");
        A06 = clipsAudioMuteReasonType3;
        ClipsAudioMuteReasonType clipsAudioMuteReasonType4 = new ClipsAudioMuteReasonType("SONG_NOT_AVAILABLE", 3, "song_not_available");
        A07 = clipsAudioMuteReasonType4;
        ClipsAudioMuteReasonType clipsAudioMuteReasonType5 = new ClipsAudioMuteReasonType("LABEL_GO_DARK", 4, "label_go_dark");
        A04 = clipsAudioMuteReasonType5;
        ClipsAudioMuteReasonType[] clipsAudioMuteReasonTypeArr = {clipsAudioMuteReasonType, clipsAudioMuteReasonType2, clipsAudioMuteReasonType3, clipsAudioMuteReasonType4, clipsAudioMuteReasonType5, new ClipsAudioMuteReasonType("MUSIC_RIGHTS_NOT_LAUNCHED_TO_COUNTRY", 5, "music_rights_not_launched_country")};
        A03 = clipsAudioMuteReasonTypeArr;
        A02 = AbstractC12190kN.A00(clipsAudioMuteReasonTypeArr);
        ClipsAudioMuteReasonType[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (ClipsAudioMuteReasonType clipsAudioMuteReasonType6 : values) {
            A18.put(clipsAudioMuteReasonType6.A00, clipsAudioMuteReasonType6);
        }
        A01 = A18;
        CREATOR = C41854Ig8.A00(3);
    }

    public static ClipsAudioMuteReasonType valueOf(String str) {
        return (ClipsAudioMuteReasonType) Enum.valueOf(ClipsAudioMuteReasonType.class, str);
    }

    public static ClipsAudioMuteReasonType[] values() {
        return (ClipsAudioMuteReasonType[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public ClipsAudioMuteReasonType(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
