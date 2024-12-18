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
public final class IgFundedIncentiveBannerButtonStyleType implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ IgFundedIncentiveBannerButtonStyleType[] A03;
    public static final IgFundedIncentiveBannerButtonStyleType A04;
    public static final IgFundedIncentiveBannerButtonStyleType A05;
    public static final IgFundedIncentiveBannerButtonStyleType A06;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        IgFundedIncentiveBannerButtonStyleType igFundedIncentiveBannerButtonStyleType = new IgFundedIncentiveBannerButtonStyleType("UNRECOGNIZED", 0, "IgFundedIncentiveBannerButtonStyleType_unspecified");
        A06 = igFundedIncentiveBannerButtonStyleType;
        IgFundedIncentiveBannerButtonStyleType igFundedIncentiveBannerButtonStyleType2 = new IgFundedIncentiveBannerButtonStyleType("TAPPABLE_TEXT", 1, "label_text");
        A05 = igFundedIncentiveBannerButtonStyleType2;
        IgFundedIncentiveBannerButtonStyleType igFundedIncentiveBannerButtonStyleType3 = new IgFundedIncentiveBannerButtonStyleType("PRIMARY", 2, "primary_button");
        A04 = igFundedIncentiveBannerButtonStyleType3;
        IgFundedIncentiveBannerButtonStyleType[] igFundedIncentiveBannerButtonStyleTypeArr = {igFundedIncentiveBannerButtonStyleType, igFundedIncentiveBannerButtonStyleType2, igFundedIncentiveBannerButtonStyleType3, new IgFundedIncentiveBannerButtonStyleType("SECONDARY", 3, "secondary_button")};
        A03 = igFundedIncentiveBannerButtonStyleTypeArr;
        A02 = AbstractC12190kN.A00(igFundedIncentiveBannerButtonStyleTypeArr);
        IgFundedIncentiveBannerButtonStyleType[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (IgFundedIncentiveBannerButtonStyleType igFundedIncentiveBannerButtonStyleType4 : values) {
            A18.put(igFundedIncentiveBannerButtonStyleType4.A00, igFundedIncentiveBannerButtonStyleType4);
        }
        A01 = A18;
        CREATOR = C41856IgA.A00(29);
    }

    public static IgFundedIncentiveBannerButtonStyleType valueOf(String str) {
        return (IgFundedIncentiveBannerButtonStyleType) Enum.valueOf(IgFundedIncentiveBannerButtonStyleType.class, str);
    }

    public static IgFundedIncentiveBannerButtonStyleType[] values() {
        return (IgFundedIncentiveBannerButtonStyleType[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public IgFundedIncentiveBannerButtonStyleType(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
