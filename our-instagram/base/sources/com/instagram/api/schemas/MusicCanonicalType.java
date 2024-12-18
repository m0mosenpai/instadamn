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
public final class MusicCanonicalType implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ MusicCanonicalType[] A03;
    public static final MusicCanonicalType A04;
    public static final MusicCanonicalType A05;
    public static final MusicCanonicalType A06;
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
        MusicCanonicalType musicCanonicalType = new MusicCanonicalType("UNRECOGNIZED", 0, "MusicCanonicalType_unspecified");
        A06 = musicCanonicalType;
        MusicCanonicalType musicCanonicalType2 = new MusicCanonicalType("LICENSED_MUSIC", 1, "licensed_music");
        A04 = musicCanonicalType2;
        MusicCanonicalType musicCanonicalType3 = new MusicCanonicalType("ORIGINAL_SOUNDS", 2, "original_sounds");
        A05 = musicCanonicalType3;
        MusicCanonicalType[] musicCanonicalTypeArr = {musicCanonicalType, musicCanonicalType2, musicCanonicalType3};
        A03 = musicCanonicalTypeArr;
        A02 = AbstractC12190kN.A00(musicCanonicalTypeArr);
        MusicCanonicalType[] values = values();
        int A0L = AbstractC16850sd.A0L(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L < 16 ? 16 : A0L);
        for (MusicCanonicalType musicCanonicalType4 : values) {
            linkedHashMap.put(musicCanonicalType4.A00, musicCanonicalType4);
        }
        A01 = linkedHashMap;
        CREATOR = new C206159Ax(58);
    }

    public static MusicCanonicalType valueOf(String str) {
        return (MusicCanonicalType) Enum.valueOf(MusicCanonicalType.class, str);
    }

    public static MusicCanonicalType[] values() {
        return (MusicCanonicalType[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public MusicCanonicalType(String str, int i, String str2) {
        this.A00 = str2;
    }
}
