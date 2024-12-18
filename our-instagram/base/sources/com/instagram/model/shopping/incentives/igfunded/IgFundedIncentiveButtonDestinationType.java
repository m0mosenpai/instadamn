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
public final class IgFundedIncentiveButtonDestinationType implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ IgFundedIncentiveButtonDestinationType[] A03;
    public static final IgFundedIncentiveButtonDestinationType A04;
    public static final IgFundedIncentiveButtonDestinationType A05;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        IgFundedIncentiveButtonDestinationType igFundedIncentiveButtonDestinationType = new IgFundedIncentiveButtonDestinationType("UNRECOGNIZED", 0, "IgFundedIncentiveButtonDestinationType_unspecified");
        A05 = igFundedIncentiveButtonDestinationType;
        IgFundedIncentiveButtonDestinationType igFundedIncentiveButtonDestinationType2 = new IgFundedIncentiveButtonDestinationType("CHECKOUT_HOME", 1, "checkout_home");
        A04 = igFundedIncentiveButtonDestinationType2;
        IgFundedIncentiveButtonDestinationType[] igFundedIncentiveButtonDestinationTypeArr = {igFundedIncentiveButtonDestinationType, igFundedIncentiveButtonDestinationType2, new IgFundedIncentiveButtonDestinationType("DETAILS", 2, "incentive_details")};
        A03 = igFundedIncentiveButtonDestinationTypeArr;
        A02 = AbstractC12190kN.A00(igFundedIncentiveButtonDestinationTypeArr);
        IgFundedIncentiveButtonDestinationType[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (IgFundedIncentiveButtonDestinationType igFundedIncentiveButtonDestinationType3 : values) {
            A18.put(igFundedIncentiveButtonDestinationType3.A00, igFundedIncentiveButtonDestinationType3);
        }
        A01 = A18;
        CREATOR = C41856IgA.A00(31);
    }

    public static IgFundedIncentiveButtonDestinationType valueOf(String str) {
        return (IgFundedIncentiveButtonDestinationType) Enum.valueOf(IgFundedIncentiveButtonDestinationType.class, str);
    }

    public static IgFundedIncentiveButtonDestinationType[] values() {
        return (IgFundedIncentiveButtonDestinationType[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public IgFundedIncentiveButtonDestinationType(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
