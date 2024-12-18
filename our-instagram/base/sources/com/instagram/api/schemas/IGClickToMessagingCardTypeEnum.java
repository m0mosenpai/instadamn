package com.instagram.api.schemas;

import X.AbstractC12190kN;
import X.AbstractC167017dG;
import X.AbstractC167027dH;
import X.AbstractC25225BEi;
import X.C41858IgC;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class IGClickToMessagingCardTypeEnum implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ IGClickToMessagingCardTypeEnum[] A03;
    public static final IGClickToMessagingCardTypeEnum A04;
    public static final IGClickToMessagingCardTypeEnum A05;
    public static final IGClickToMessagingCardTypeEnum A06;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        IGClickToMessagingCardTypeEnum iGClickToMessagingCardTypeEnum = new IGClickToMessagingCardTypeEnum("UNRECOGNIZED", 0, "IGClickToMessagingCardTypeEnum_unspecified");
        A06 = iGClickToMessagingCardTypeEnum;
        IGClickToMessagingCardTypeEnum iGClickToMessagingCardTypeEnum2 = new IGClickToMessagingCardTypeEnum("FAQS_STICKER_CARD", 1, "FAQS_STICKER_CARD");
        A04 = iGClickToMessagingCardTypeEnum2;
        IGClickToMessagingCardTypeEnum iGClickToMessagingCardTypeEnum3 = new IGClickToMessagingCardTypeEnum("FAQ_AND_COMPOSER_STICKER_CARD", 2, "FAQ_AND_COMPOSER_STICKER_CARD");
        A05 = iGClickToMessagingCardTypeEnum3;
        IGClickToMessagingCardTypeEnum[] iGClickToMessagingCardTypeEnumArr = {iGClickToMessagingCardTypeEnum, iGClickToMessagingCardTypeEnum2, iGClickToMessagingCardTypeEnum3, new IGClickToMessagingCardTypeEnum("WHATSAPP_STICKER_CARD", 3, "WHATSAPP_STICKER_CARD")};
        A03 = iGClickToMessagingCardTypeEnumArr;
        A02 = AbstractC12190kN.A00(iGClickToMessagingCardTypeEnumArr);
        IGClickToMessagingCardTypeEnum[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (IGClickToMessagingCardTypeEnum iGClickToMessagingCardTypeEnum4 : values) {
            A18.put(iGClickToMessagingCardTypeEnum4.A00, iGClickToMessagingCardTypeEnum4);
        }
        A01 = A18;
        CREATOR = new C41858IgC(29);
    }

    public static IGClickToMessagingCardTypeEnum valueOf(String str) {
        return (IGClickToMessagingCardTypeEnum) Enum.valueOf(IGClickToMessagingCardTypeEnum.class, str);
    }

    public static IGClickToMessagingCardTypeEnum[] values() {
        return (IGClickToMessagingCardTypeEnum[]) A03.clone();
    }

    public IGClickToMessagingCardTypeEnum(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
