package com.instagram.api.schemas;

import X.AbstractC12190kN;
import X.AbstractC167017dG;
import X.AbstractC167027dH;
import X.AbstractC25225BEi;
import X.C63469Sl9;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class AudioBrowserCollectionType implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ AudioBrowserCollectionType[] A03;
    public static final AudioBrowserCollectionType A04;
    public static final AudioBrowserCollectionType A05;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        AudioBrowserCollectionType audioBrowserCollectionType = new AudioBrowserCollectionType("UNRECOGNIZED", 0, "AudioBrowserCollectionType_unspecified");
        A05 = audioBrowserCollectionType;
        AudioBrowserCollectionType audioBrowserCollectionType2 = new AudioBrowserCollectionType("SPOTIFY_RECOMMENDATIONS", 1, "spotify_recommendations");
        A04 = audioBrowserCollectionType2;
        AudioBrowserCollectionType[] audioBrowserCollectionTypeArr = {audioBrowserCollectionType, audioBrowserCollectionType2};
        A03 = audioBrowserCollectionTypeArr;
        A02 = AbstractC12190kN.A00(audioBrowserCollectionTypeArr);
        AudioBrowserCollectionType[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (AudioBrowserCollectionType audioBrowserCollectionType3 : values) {
            A18.put(audioBrowserCollectionType3.A00, audioBrowserCollectionType3);
        }
        A01 = A18;
        CREATOR = new C63469Sl9(61);
    }

    public static AudioBrowserCollectionType valueOf(String str) {
        return (AudioBrowserCollectionType) Enum.valueOf(AudioBrowserCollectionType.class, str);
    }

    public static AudioBrowserCollectionType[] values() {
        return (AudioBrowserCollectionType[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public AudioBrowserCollectionType(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
