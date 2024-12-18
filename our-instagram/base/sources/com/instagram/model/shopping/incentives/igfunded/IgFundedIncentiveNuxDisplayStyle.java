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
public final class IgFundedIncentiveNuxDisplayStyle implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ IgFundedIncentiveNuxDisplayStyle[] A03;
    public static final IgFundedIncentiveNuxDisplayStyle A04;
    public static final IgFundedIncentiveNuxDisplayStyle A05;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        IgFundedIncentiveNuxDisplayStyle igFundedIncentiveNuxDisplayStyle = new IgFundedIncentiveNuxDisplayStyle("UNRECOGNIZED", 0, "IgFundedIncentiveNuxDisplayStyle_unspecified");
        A05 = igFundedIncentiveNuxDisplayStyle;
        IgFundedIncentiveNuxDisplayStyle igFundedIncentiveNuxDisplayStyle2 = new IgFundedIncentiveNuxDisplayStyle("BANNER_OPTIMIZATION_DISPLAY_STYLE", 1, "layout_position_display_style");
        A04 = igFundedIncentiveNuxDisplayStyle2;
        IgFundedIncentiveNuxDisplayStyle[] igFundedIncentiveNuxDisplayStyleArr = {igFundedIncentiveNuxDisplayStyle, igFundedIncentiveNuxDisplayStyle2, new IgFundedIncentiveNuxDisplayStyle("PDP_NUX_DISPLAY_STYLE", 2, "variant_3")};
        A03 = igFundedIncentiveNuxDisplayStyleArr;
        A02 = AbstractC12190kN.A00(igFundedIncentiveNuxDisplayStyleArr);
        IgFundedIncentiveNuxDisplayStyle[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (IgFundedIncentiveNuxDisplayStyle igFundedIncentiveNuxDisplayStyle3 : values) {
            A18.put(igFundedIncentiveNuxDisplayStyle3.A00, igFundedIncentiveNuxDisplayStyle3);
        }
        A01 = A18;
        CREATOR = C41856IgA.A00(33);
    }

    public static IgFundedIncentiveNuxDisplayStyle valueOf(String str) {
        return (IgFundedIncentiveNuxDisplayStyle) Enum.valueOf(IgFundedIncentiveNuxDisplayStyle.class, str);
    }

    public static IgFundedIncentiveNuxDisplayStyle[] values() {
        return (IgFundedIncentiveNuxDisplayStyle[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public IgFundedIncentiveNuxDisplayStyle(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
