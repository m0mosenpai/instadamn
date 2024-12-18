package com.instagram.model.shopping.incentives.igfunded;

import X.AbstractC12190kN;
import X.AbstractC167017dG;
import X.AbstractC167027dH;
import X.AbstractC25225BEi;
import X.C41856IgA;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class IgFundedIncentiveBannerIconType implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ IgFundedIncentiveBannerIconType[] A03;
    public static final IgFundedIncentiveBannerIconType A04;
    public static final IgFundedIncentiveBannerIconType A05;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        IgFundedIncentiveBannerIconType igFundedIncentiveBannerIconType = new IgFundedIncentiveBannerIconType("UNRECOGNIZED", 0, "IgFundedIncentiveBannerIconType_unspecified");
        A05 = igFundedIncentiveBannerIconType;
        IgFundedIncentiveBannerIconType igFundedIncentiveBannerIconType2 = new IgFundedIncentiveBannerIconType("GIFT_CARD", 1, "gift_card");
        A04 = igFundedIncentiveBannerIconType2;
        IgFundedIncentiveBannerIconType[] igFundedIncentiveBannerIconTypeArr = {igFundedIncentiveBannerIconType, igFundedIncentiveBannerIconType2, new IgFundedIncentiveBannerIconType("GIFT_CARD_PANO_GRADIENT", 2, "gift_card_pano_gradient")};
        A03 = igFundedIncentiveBannerIconTypeArr;
        A02 = AbstractC12190kN.A00(igFundedIncentiveBannerIconTypeArr);
        IgFundedIncentiveBannerIconType[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (IgFundedIncentiveBannerIconType igFundedIncentiveBannerIconType3 : values) {
            A18.put(igFundedIncentiveBannerIconType3.A00, igFundedIncentiveBannerIconType3);
        }
        A01 = A18;
        CREATOR = C41856IgA.A00(30);
    }

    public static IgFundedIncentiveBannerIconType valueOf(String str) {
        return (IgFundedIncentiveBannerIconType) Enum.valueOf(IgFundedIncentiveBannerIconType.class, str);
    }

    public static IgFundedIncentiveBannerIconType[] values() {
        return (IgFundedIncentiveBannerIconType[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public IgFundedIncentiveBannerIconType(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
