package com.instagram.api.schemas;

import X.AbstractC12190kN;
import X.AbstractC167017dG;
import X.AbstractC167027dH;
import X.AbstractC25225BEi;
import X.C41855Ig9;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class MusicDropType implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ MusicDropType[] A03;
    public static final MusicDropType A04;
    public static final MusicDropType A05;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        MusicDropType musicDropType = new MusicDropType("UNRECOGNIZED", 0, "MusicDropType_unspecified");
        A05 = musicDropType;
        MusicDropType musicDropType2 = new MusicDropType("TRACK", 1, "track");
        A04 = musicDropType2;
        MusicDropType[] musicDropTypeArr = {musicDropType, musicDropType2, new MusicDropType("ALBUM", 2, "album")};
        A03 = musicDropTypeArr;
        A02 = AbstractC12190kN.A00(musicDropTypeArr);
        MusicDropType[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (MusicDropType musicDropType3 : values) {
            A18.put(musicDropType3.A00, musicDropType3);
        }
        A01 = A18;
        CREATOR = C41855Ig9.A00(7);
    }

    public static MusicDropType valueOf(String str) {
        return (MusicDropType) Enum.valueOf(MusicDropType.class, str);
    }

    public static MusicDropType[] values() {
        return (MusicDropType[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public MusicDropType(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
