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
/* loaded from: classes3.dex */
public final class MediaType implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ MediaType[] A03;
    public static final MediaType A04;
    public static final MediaType A05;
    public static final MediaType A06;
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
        MediaType mediaType = new MediaType("UNRECOGNIZED", 0, "MediaType_unspecified");
        A06 = mediaType;
        MediaType mediaType2 = new MediaType("ANIMATION", 1, "animation");
        A04 = mediaType2;
        MediaType mediaType3 = new MediaType("IMAGE", 2, "image");
        A05 = mediaType3;
        MediaType[] mediaTypeArr = {mediaType, mediaType2, mediaType3};
        A03 = mediaTypeArr;
        A02 = AbstractC12190kN.A00(mediaTypeArr);
        MediaType[] values = values();
        int A0L = AbstractC16850sd.A0L(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L < 16 ? 16 : A0L);
        for (MediaType mediaType4 : values) {
            linkedHashMap.put(mediaType4.A00, mediaType4);
        }
        A01 = linkedHashMap;
        CREATOR = new C206159Ax(46);
    }

    public static MediaType valueOf(String str) {
        return (MediaType) Enum.valueOf(MediaType.class, str);
    }

    public static MediaType[] values() {
        return (MediaType[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public MediaType(String str, int i, String str2) {
        this.A00 = str2;
    }
}
