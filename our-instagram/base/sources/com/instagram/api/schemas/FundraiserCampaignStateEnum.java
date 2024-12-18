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
/* loaded from: classes7.dex */
public final class FundraiserCampaignStateEnum implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ FundraiserCampaignStateEnum[] A03;
    public static final FundraiserCampaignStateEnum A04;
    public static final FundraiserCampaignStateEnum A05;
    public static final FundraiserCampaignStateEnum A06;
    public static final FundraiserCampaignStateEnum A07;
    public static final FundraiserCampaignStateEnum A08;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        FundraiserCampaignStateEnum fundraiserCampaignStateEnum = new FundraiserCampaignStateEnum("UNRECOGNIZED", 0, "FundraiserCampaignStateEnum_unspecified");
        A08 = fundraiserCampaignStateEnum;
        FundraiserCampaignStateEnum fundraiserCampaignStateEnum2 = new FundraiserCampaignStateEnum("PAUSED", 1, "PAUSED");
        A04 = fundraiserCampaignStateEnum2;
        FundraiserCampaignStateEnum fundraiserCampaignStateEnum3 = new FundraiserCampaignStateEnum("READY", 2, "READY");
        A05 = fundraiserCampaignStateEnum3;
        FundraiserCampaignStateEnum fundraiserCampaignStateEnum4 = new FundraiserCampaignStateEnum("REJECTED", 3, "REJECTED");
        A06 = fundraiserCampaignStateEnum4;
        FundraiserCampaignStateEnum fundraiserCampaignStateEnum5 = new FundraiserCampaignStateEnum("STOPPED", 4, "STOPPED");
        A07 = fundraiserCampaignStateEnum5;
        FundraiserCampaignStateEnum[] fundraiserCampaignStateEnumArr = {fundraiserCampaignStateEnum, fundraiserCampaignStateEnum2, fundraiserCampaignStateEnum3, fundraiserCampaignStateEnum4, fundraiserCampaignStateEnum5, new FundraiserCampaignStateEnum("UNPUBLISHED", 5, "UNPUBLISHED")};
        A03 = fundraiserCampaignStateEnumArr;
        A02 = AbstractC12190kN.A00(fundraiserCampaignStateEnumArr);
        FundraiserCampaignStateEnum[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (FundraiserCampaignStateEnum fundraiserCampaignStateEnum6 : values) {
            A18.put(fundraiserCampaignStateEnum6.A00, fundraiserCampaignStateEnum6);
        }
        A01 = A18;
        CREATOR = C41854Ig8.A00(87);
    }

    public static FundraiserCampaignStateEnum valueOf(String str) {
        return (FundraiserCampaignStateEnum) Enum.valueOf(FundraiserCampaignStateEnum.class, str);
    }

    public static FundraiserCampaignStateEnum[] values() {
        return (FundraiserCampaignStateEnum[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public FundraiserCampaignStateEnum(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
