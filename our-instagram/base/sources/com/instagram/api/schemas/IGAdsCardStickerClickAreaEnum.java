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
public final class IGAdsCardStickerClickAreaEnum implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ IGAdsCardStickerClickAreaEnum[] A03;
    public static final IGAdsCardStickerClickAreaEnum A04;
    public static final IGAdsCardStickerClickAreaEnum A05;
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
        IGAdsCardStickerClickAreaEnum iGAdsCardStickerClickAreaEnum = new IGAdsCardStickerClickAreaEnum("UNRECOGNIZED", 0, "IGAdsCardStickerClickAreaEnum_unspecified");
        A05 = iGAdsCardStickerClickAreaEnum;
        IGAdsCardStickerClickAreaEnum iGAdsCardStickerClickAreaEnum2 = new IGAdsCardStickerClickAreaEnum("CTA_ONLY", 1, "CTA_ONLY");
        A04 = iGAdsCardStickerClickAreaEnum2;
        IGAdsCardStickerClickAreaEnum[] iGAdsCardStickerClickAreaEnumArr = {iGAdsCardStickerClickAreaEnum, iGAdsCardStickerClickAreaEnum2, new IGAdsCardStickerClickAreaEnum("STICKER", 2, "STICKER")};
        A03 = iGAdsCardStickerClickAreaEnumArr;
        A02 = AbstractC12190kN.A00(iGAdsCardStickerClickAreaEnumArr);
        IGAdsCardStickerClickAreaEnum[] values = values();
        int A0L = AbstractC16850sd.A0L(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L < 16 ? 16 : A0L);
        for (IGAdsCardStickerClickAreaEnum iGAdsCardStickerClickAreaEnum3 : values) {
            linkedHashMap.put(iGAdsCardStickerClickAreaEnum3.A00, iGAdsCardStickerClickAreaEnum3);
        }
        A01 = linkedHashMap;
        CREATOR = new C206159Ax(6);
    }

    public static IGAdsCardStickerClickAreaEnum valueOf(String str) {
        return (IGAdsCardStickerClickAreaEnum) Enum.valueOf(IGAdsCardStickerClickAreaEnum.class, str);
    }

    public static IGAdsCardStickerClickAreaEnum[] values() {
        return (IGAdsCardStickerClickAreaEnum[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public IGAdsCardStickerClickAreaEnum(String str, int i, String str2) {
        this.A00 = str2;
    }
}
