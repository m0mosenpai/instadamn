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
public final class IGAdsCardStickerSizeEnum implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ IGAdsCardStickerSizeEnum[] A03;
    public static final IGAdsCardStickerSizeEnum A04;
    public static final IGAdsCardStickerSizeEnum A05;
    public static final IGAdsCardStickerSizeEnum A06;
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
        IGAdsCardStickerSizeEnum iGAdsCardStickerSizeEnum = new IGAdsCardStickerSizeEnum("UNRECOGNIZED", 0, "IGAdsCardStickerSizeEnum_unspecified");
        A06 = iGAdsCardStickerSizeEnum;
        IGAdsCardStickerSizeEnum iGAdsCardStickerSizeEnum2 = new IGAdsCardStickerSizeEnum("LARGE", 1, "LARGE");
        A04 = iGAdsCardStickerSizeEnum2;
        IGAdsCardStickerSizeEnum iGAdsCardStickerSizeEnum3 = new IGAdsCardStickerSizeEnum("MEDIUM", 2, "MEDIUM");
        A05 = iGAdsCardStickerSizeEnum3;
        IGAdsCardStickerSizeEnum[] iGAdsCardStickerSizeEnumArr = {iGAdsCardStickerSizeEnum, iGAdsCardStickerSizeEnum2, iGAdsCardStickerSizeEnum3, new IGAdsCardStickerSizeEnum("SMALL", 3, "SMALL")};
        A03 = iGAdsCardStickerSizeEnumArr;
        A02 = AbstractC12190kN.A00(iGAdsCardStickerSizeEnumArr);
        IGAdsCardStickerSizeEnum[] values = values();
        int A0L = AbstractC16850sd.A0L(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L < 16 ? 16 : A0L);
        for (IGAdsCardStickerSizeEnum iGAdsCardStickerSizeEnum4 : values) {
            linkedHashMap.put(iGAdsCardStickerSizeEnum4.A00, iGAdsCardStickerSizeEnum4);
        }
        A01 = linkedHashMap;
        CREATOR = new C206159Ax(7);
    }

    public static IGAdsCardStickerSizeEnum valueOf(String str) {
        return (IGAdsCardStickerSizeEnum) Enum.valueOf(IGAdsCardStickerSizeEnum.class, str);
    }

    public static IGAdsCardStickerSizeEnum[] values() {
        return (IGAdsCardStickerSizeEnum[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public IGAdsCardStickerSizeEnum(String str, int i, String str2) {
        this.A00 = str2;
    }
}
