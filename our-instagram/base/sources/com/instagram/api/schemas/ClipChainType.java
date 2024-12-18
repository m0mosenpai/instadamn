package com.instagram.api.schemas;

import X.AbstractC12190kN;
import X.AbstractC16850sd;
import X.C14360o3;
import X.C41854Ig8;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class ClipChainType implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ ClipChainType[] A03;
    public static final ClipChainType A04;
    public static final ClipChainType A05;
    public static final ClipChainType A06;
    public static final ClipChainType A07;
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
        ClipChainType clipChainType = new ClipChainType("UNRECOGNIZED", 0, "ClipChainType_unspecified");
        A07 = clipChainType;
        ClipChainType clipChainType2 = new ClipChainType("ARTIST_PICKS", 1, "artist_picks");
        A04 = clipChainType2;
        ClipChainType clipChainType3 = new ClipChainType("FROM_AUDIO_OWNER", 2, "from_audio_owner");
        A05 = clipChainType3;
        ClipChainType clipChainType4 = new ClipChainType("TEMPLATES", 3, "templates");
        A06 = clipChainType4;
        ClipChainType[] clipChainTypeArr = {clipChainType, clipChainType2, clipChainType3, clipChainType4, new ClipChainType("UNKNOWN", 4, "unknown")};
        A03 = clipChainTypeArr;
        A02 = AbstractC12190kN.A00(clipChainTypeArr);
        ClipChainType[] values = values();
        int A0L = AbstractC16850sd.A0L(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L < 16 ? 16 : A0L);
        for (ClipChainType clipChainType5 : values) {
            linkedHashMap.put(clipChainType5.A00, clipChainType5);
        }
        A01 = linkedHashMap;
        CREATOR = new C41854Ig8(0);
    }

    public static ClipChainType valueOf(String str) {
        return (ClipChainType) Enum.valueOf(ClipChainType.class, str);
    }

    public static ClipChainType[] values() {
        return (ClipChainType[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public ClipChainType(String str, int i, String str2) {
        this.A00 = str2;
    }
}
