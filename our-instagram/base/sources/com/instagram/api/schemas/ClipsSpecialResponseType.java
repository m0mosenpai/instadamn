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
/* loaded from: classes3.dex */
public final class ClipsSpecialResponseType implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ ClipsSpecialResponseType[] A03;
    public static final ClipsSpecialResponseType A04;
    public static final ClipsSpecialResponseType A05;
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
        ClipsSpecialResponseType clipsSpecialResponseType = new ClipsSpecialResponseType("UNRECOGNIZED", 0, "ClipsSpecialResponseType_unspecified");
        A05 = clipsSpecialResponseType;
        ClipsSpecialResponseType clipsSpecialResponseType2 = new ClipsSpecialResponseType("FALLBACK_TO_CLIENT_CACHE", 1, "fallback_to_client_cache");
        A04 = clipsSpecialResponseType2;
        ClipsSpecialResponseType[] clipsSpecialResponseTypeArr = {clipsSpecialResponseType, clipsSpecialResponseType2};
        A03 = clipsSpecialResponseTypeArr;
        A02 = AbstractC12190kN.A00(clipsSpecialResponseTypeArr);
        ClipsSpecialResponseType[] values = values();
        int A0L = AbstractC16850sd.A0L(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L < 16 ? 16 : A0L);
        for (ClipsSpecialResponseType clipsSpecialResponseType3 : values) {
            linkedHashMap.put(clipsSpecialResponseType3.A00, clipsSpecialResponseType3);
        }
        A01 = linkedHashMap;
        CREATOR = new C206149Aw(67);
    }

    public static ClipsSpecialResponseType valueOf(String str) {
        return (ClipsSpecialResponseType) Enum.valueOf(ClipsSpecialResponseType.class, str);
    }

    public static ClipsSpecialResponseType[] values() {
        return (ClipsSpecialResponseType[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public ClipsSpecialResponseType(String str, int i, String str2) {
        this.A00 = str2;
    }
}
