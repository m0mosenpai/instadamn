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
public final class IGAdsCardStickerCTATypeEnum implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ IGAdsCardStickerCTATypeEnum[] A03;
    public static final IGAdsCardStickerCTATypeEnum A04;
    public static final IGAdsCardStickerCTATypeEnum A05;
    public static final IGAdsCardStickerCTATypeEnum A06;
    public static final IGAdsCardStickerCTATypeEnum A07;
    public static final IGAdsCardStickerCTATypeEnum A08;
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
        IGAdsCardStickerCTATypeEnum iGAdsCardStickerCTATypeEnum = new IGAdsCardStickerCTATypeEnum("UNRECOGNIZED", 0, "IGAdsCardStickerCTATypeEnum_unspecified");
        A08 = iGAdsCardStickerCTATypeEnum;
        IGAdsCardStickerCTATypeEnum iGAdsCardStickerCTATypeEnum2 = new IGAdsCardStickerCTATypeEnum("BUTTON_CTA", 1, "BUTTON_CTA");
        A04 = iGAdsCardStickerCTATypeEnum2;
        IGAdsCardStickerCTATypeEnum iGAdsCardStickerCTATypeEnum3 = new IGAdsCardStickerCTATypeEnum("SMALL_BUTTON_CTA", 2, "SMALL_BUTTON_CTA");
        A05 = iGAdsCardStickerCTATypeEnum3;
        IGAdsCardStickerCTATypeEnum iGAdsCardStickerCTATypeEnum4 = new IGAdsCardStickerCTATypeEnum("STICKER_CTA", 3, "STICKER_CTA");
        A06 = iGAdsCardStickerCTATypeEnum4;
        IGAdsCardStickerCTATypeEnum iGAdsCardStickerCTATypeEnum5 = new IGAdsCardStickerCTATypeEnum("STICKER_CTA_BG_HIGHLIGHT", 4, "STICKER_CTA_BG_HIGHLIGHT");
        A07 = iGAdsCardStickerCTATypeEnum5;
        IGAdsCardStickerCTATypeEnum[] iGAdsCardStickerCTATypeEnumArr = {iGAdsCardStickerCTATypeEnum, iGAdsCardStickerCTATypeEnum2, iGAdsCardStickerCTATypeEnum3, iGAdsCardStickerCTATypeEnum4, iGAdsCardStickerCTATypeEnum5, new IGAdsCardStickerCTATypeEnum("STICKER_CTA_DELAYED_BG_HIGHLIGHT", 5, "STICKER_CTA_DELAYED_BG_HIGHLIGHT")};
        A03 = iGAdsCardStickerCTATypeEnumArr;
        A02 = AbstractC12190kN.A00(iGAdsCardStickerCTATypeEnumArr);
        IGAdsCardStickerCTATypeEnum[] values = values();
        int A0L = AbstractC16850sd.A0L(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L < 16 ? 16 : A0L);
        for (IGAdsCardStickerCTATypeEnum iGAdsCardStickerCTATypeEnum6 : values) {
            linkedHashMap.put(iGAdsCardStickerCTATypeEnum6.A00, iGAdsCardStickerCTATypeEnum6);
        }
        A01 = linkedHashMap;
        CREATOR = new C206159Ax(5);
    }

    public static IGAdsCardStickerCTATypeEnum valueOf(String str) {
        return (IGAdsCardStickerCTATypeEnum) Enum.valueOf(IGAdsCardStickerCTATypeEnum.class, str);
    }

    public static IGAdsCardStickerCTATypeEnum[] values() {
        return (IGAdsCardStickerCTATypeEnum[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public IGAdsCardStickerCTATypeEnum(String str, int i, String str2) {
        this.A00 = str2;
    }
}
