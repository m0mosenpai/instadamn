package com.instagram.api.schemas;

import X.AbstractC12190kN;
import X.AbstractC167027dH;
import X.AbstractC16850sd;
import X.C41854Ig8;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class ClipsTemplatesStickerType implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ ClipsTemplatesStickerType[] A03;
    public static final ClipsTemplatesStickerType A04;
    public static final ClipsTemplatesStickerType A05;
    public static final ClipsTemplatesStickerType A06;
    public static final ClipsTemplatesStickerType A07;
    public static final ClipsTemplatesStickerType A08;
    public static final ClipsTemplatesStickerType A09;
    public static final ClipsTemplatesStickerType A0A;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        ClipsTemplatesStickerType clipsTemplatesStickerType = new ClipsTemplatesStickerType("UNRECOGNIZED", 0, "ClipsTemplatesStickerType_unspecified");
        A0A = clipsTemplatesStickerType;
        ClipsTemplatesStickerType clipsTemplatesStickerType2 = new ClipsTemplatesStickerType("CUTOUT", 1, "cutout");
        A04 = clipsTemplatesStickerType2;
        ClipsTemplatesStickerType clipsTemplatesStickerType3 = new ClipsTemplatesStickerType("CUTOUT_PHOTO", 2, "cutout_photo");
        A05 = clipsTemplatesStickerType3;
        ClipsTemplatesStickerType clipsTemplatesStickerType4 = new ClipsTemplatesStickerType("CUTOUT_VIDEO", 3, "cutout_video");
        A06 = clipsTemplatesStickerType4;
        ClipsTemplatesStickerType clipsTemplatesStickerType5 = new ClipsTemplatesStickerType("GIF", 4, "gif");
        A07 = clipsTemplatesStickerType5;
        ClipsTemplatesStickerType clipsTemplatesStickerType6 = new ClipsTemplatesStickerType("INTERNAL", 5, "internal");
        A08 = clipsTemplatesStickerType6;
        ClipsTemplatesStickerType clipsTemplatesStickerType7 = new ClipsTemplatesStickerType("LYRICS", 6, "lyrics");
        A09 = clipsTemplatesStickerType7;
        ClipsTemplatesStickerType[] clipsTemplatesStickerTypeArr = {clipsTemplatesStickerType, clipsTemplatesStickerType2, clipsTemplatesStickerType3, clipsTemplatesStickerType4, clipsTemplatesStickerType5, clipsTemplatesStickerType6, clipsTemplatesStickerType7, new ClipsTemplatesStickerType("STATIC", 7, "static")};
        A03 = clipsTemplatesStickerTypeArr;
        A02 = AbstractC12190kN.A00(clipsTemplatesStickerTypeArr);
        ClipsTemplatesStickerType[] values = values();
        int A0L = AbstractC16850sd.A0L(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L < 16 ? 16 : A0L);
        for (ClipsTemplatesStickerType clipsTemplatesStickerType8 : values) {
            linkedHashMap.put(clipsTemplatesStickerType8.A00, clipsTemplatesStickerType8);
        }
        A01 = linkedHashMap;
        CREATOR = new C41854Ig8(16);
    }

    public static ClipsTemplatesStickerType valueOf(String str) {
        return (ClipsTemplatesStickerType) Enum.valueOf(ClipsTemplatesStickerType.class, str);
    }

    public static ClipsTemplatesStickerType[] values() {
        return (ClipsTemplatesStickerType[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public ClipsTemplatesStickerType(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
