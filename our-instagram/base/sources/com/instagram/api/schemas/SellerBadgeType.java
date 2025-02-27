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
public final class SellerBadgeType implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ SellerBadgeType[] A03;
    public static final SellerBadgeType A04;
    public static final SellerBadgeType A05;
    public static final SellerBadgeType A06;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        SellerBadgeType sellerBadgeType = new SellerBadgeType("UNRECOGNIZED", 0, "SellerBadgeType_unspecified");
        A06 = sellerBadgeType;
        SellerBadgeType sellerBadgeType2 = new SellerBadgeType("POPULAR_BADGE_2022", 1, "POPULAR_BADGE_2022");
        A04 = sellerBadgeType2;
        SellerBadgeType sellerBadgeType3 = new SellerBadgeType("PREFERRED", 2, "PREFERRED");
        A05 = sellerBadgeType3;
        SellerBadgeType[] sellerBadgeTypeArr = {sellerBadgeType, sellerBadgeType2, sellerBadgeType3, new SellerBadgeType("QUALITY_BADGE_2022", 3, "QUALITY_BADGE_2022")};
        A03 = sellerBadgeTypeArr;
        A02 = AbstractC12190kN.A00(sellerBadgeTypeArr);
        SellerBadgeType[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (SellerBadgeType sellerBadgeType4 : values) {
            A18.put(sellerBadgeType4.A00, sellerBadgeType4);
        }
        A01 = A18;
        CREATOR = C41855Ig9.A00(97);
    }

    public static SellerBadgeType valueOf(String str) {
        return (SellerBadgeType) Enum.valueOf(SellerBadgeType.class, str);
    }

    public static SellerBadgeType[] values() {
        return (SellerBadgeType[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public SellerBadgeType(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
