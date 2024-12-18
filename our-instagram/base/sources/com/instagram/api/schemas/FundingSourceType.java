package com.instagram.api.schemas;

import X.AbstractC12190kN;
import X.AbstractC167017dG;
import X.AbstractC167027dH;
import X.AbstractC25225BEi;
import X.C41854Ig8;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes12.dex */
public final class FundingSourceType implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ FundingSourceType[] A03;
    public static final FundingSourceType A04;
    public static final FundingSourceType A05;
    public static final FundingSourceType A06;
    public static final FundingSourceType A07;
    public static final FundingSourceType A08;
    public static final FundingSourceType A09;
    public static final FundingSourceType A0A;
    public static final FundingSourceType A0B;
    public static final FundingSourceType A0C;
    public static final FundingSourceType A0D;
    public static final FundingSourceType A0E;
    public static final FundingSourceType A0F;
    public static final FundingSourceType A0G;
    public static final FundingSourceType A0H;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        FundingSourceType fundingSourceType = new FundingSourceType("UNRECOGNIZED", 0, "FundingSourceType_unspecified");
        A0H = fundingSourceType;
        FundingSourceType fundingSourceType2 = new FundingSourceType("ALTPAY", 1, "ALTPAY");
        A04 = fundingSourceType2;
        FundingSourceType fundingSourceType3 = new FundingSourceType("APPLE_IAP", 2, "APPLE_IAP");
        A05 = fundingSourceType3;
        FundingSourceType fundingSourceType4 = new FundingSourceType("CREDIT_CARD", 3, "CREDIT_CARD");
        A06 = fundingSourceType4;
        FundingSourceType fundingSourceType5 = new FundingSourceType("DIRECT_DEBIT", 4, "DIRECT_DEBIT");
        A07 = fundingSourceType5;
        FundingSourceType fundingSourceType6 = new FundingSourceType("DUMMY", 5, "DUMMY");
        A08 = fundingSourceType6;
        FundingSourceType fundingSourceType7 = new FundingSourceType("EARNINGS_PAYOUT", 6, "EARNINGS_PAYOUT");
        A09 = fundingSourceType7;
        FundingSourceType fundingSourceType8 = new FundingSourceType("FACEBOOK_EXTENDED_CREDIT", 7, "FACEBOOK_EXTENDED_CREDIT");
        A0A = fundingSourceType8;
        FundingSourceType fundingSourceType9 = new FundingSourceType("FACEBOOK_TOKEN", 8, "FACEBOOK_TOKEN");
        A0B = fundingSourceType9;
        FundingSourceType fundingSourceType10 = new FundingSourceType("INVOICE", 9, "INVOICE");
        A0C = fundingSourceType10;
        FundingSourceType fundingSourceType11 = new FundingSourceType("ORDER", 10, "ORDER");
        A0D = fundingSourceType11;
        FundingSourceType fundingSourceType12 = new FundingSourceType("PAYPAL_BILLING_AGREEMENT", 11, "PAYPAL_BILLING_AGREEMENT");
        A0E = fundingSourceType12;
        FundingSourceType fundingSourceType13 = new FundingSourceType("PAYPAL_TOKEN", 12, "PAYPAL_TOKEN");
        A0F = fundingSourceType13;
        FundingSourceType fundingSourceType14 = new FundingSourceType("STORED_BALANCE", 13, "STORED_BALANCE");
        A0G = fundingSourceType14;
        FundingSourceType[] fundingSourceTypeArr = {fundingSourceType, fundingSourceType2, fundingSourceType3, fundingSourceType4, fundingSourceType5, fundingSourceType6, fundingSourceType7, fundingSourceType8, fundingSourceType9, fundingSourceType10, fundingSourceType11, fundingSourceType12, fundingSourceType13, fundingSourceType14, new FundingSourceType("UNSET", 14, "UNSET")};
        A03 = fundingSourceTypeArr;
        A02 = AbstractC12190kN.A00(fundingSourceTypeArr);
        FundingSourceType[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (FundingSourceType fundingSourceType15 : values) {
            A18.put(fundingSourceType15.A00, fundingSourceType15);
        }
        A01 = A18;
        CREATOR = new C41854Ig8(86);
    }

    public static FundingSourceType valueOf(String str) {
        return (FundingSourceType) Enum.valueOf(FundingSourceType.class, str);
    }

    public static FundingSourceType[] values() {
        return (FundingSourceType[]) A03.clone();
    }

    public FundingSourceType(String str, int i, String str2) {
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
