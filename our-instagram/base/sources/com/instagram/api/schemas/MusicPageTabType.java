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
public final class MusicPageTabType implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ MusicPageTabType[] A03;
    public static final MusicPageTabType A04;
    public static final MusicPageTabType A05;
    public static final MusicPageTabType A06;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        MusicPageTabType musicPageTabType = new MusicPageTabType("UNRECOGNIZED", 0, "MusicPageTabType_unspecified");
        A06 = musicPageTabType;
        MusicPageTabType musicPageTabType2 = new MusicPageTabType("CLIPS", 1, "clips");
        A04 = musicPageTabType2;
        MusicPageTabType musicPageTabType3 = new MusicPageTabType("PHOTOS", 2, "photos");
        A05 = musicPageTabType3;
        MusicPageTabType[] musicPageTabTypeArr = {musicPageTabType, musicPageTabType2, musicPageTabType3, new MusicPageTabType("TEMPLATES", 3, "templates")};
        A03 = musicPageTabTypeArr;
        A02 = AbstractC12190kN.A00(musicPageTabTypeArr);
        MusicPageTabType[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (MusicPageTabType musicPageTabType4 : values) {
            A18.put(musicPageTabType4.A00, musicPageTabType4);
        }
        A01 = A18;
        CREATOR = C41855Ig9.A00(8);
    }

    public static MusicPageTabType valueOf(String str) {
        return (MusicPageTabType) Enum.valueOf(MusicPageTabType.class, str);
    }

    public static MusicPageTabType[] values() {
        return (MusicPageTabType[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public MusicPageTabType(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
