package com.instagram.api.schemas;

import X.AbstractC12190kN;
import X.AbstractC167017dG;
import X.AbstractC167027dH;
import X.AbstractC25225BEi;
import X.C63469Sl9;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes9.dex */
public final class BCPDealOutputTypeEnum implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ BCPDealOutputTypeEnum[] A03;
    public static final BCPDealOutputTypeEnum A04;
    public static final BCPDealOutputTypeEnum A05;
    public static final BCPDealOutputTypeEnum A06;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        BCPDealOutputTypeEnum bCPDealOutputTypeEnum = new BCPDealOutputTypeEnum("UNRECOGNIZED", 0, "BCPDealOutputTypeEnum_unspecified");
        A06 = bCPDealOutputTypeEnum;
        BCPDealOutputTypeEnum bCPDealOutputTypeEnum2 = new BCPDealOutputTypeEnum("BOOST_UGC_TO_AD", 1, "BOOST_UGC_TO_AD");
        A04 = bCPDealOutputTypeEnum2;
        BCPDealOutputTypeEnum bCPDealOutputTypeEnum3 = new BCPDealOutputTypeEnum("CHALLENGE_MEDIA_SUBMISSION", 2, "CHALLENGE_MEDIA_SUBMISSION");
        A05 = bCPDealOutputTypeEnum3;
        BCPDealOutputTypeEnum[] bCPDealOutputTypeEnumArr = {bCPDealOutputTypeEnum, bCPDealOutputTypeEnum2, bCPDealOutputTypeEnum3, new BCPDealOutputTypeEnum("SHARE_BC_POST", 3, "SHARE_BC_POST")};
        A03 = bCPDealOutputTypeEnumArr;
        A02 = AbstractC12190kN.A00(bCPDealOutputTypeEnumArr);
        BCPDealOutputTypeEnum[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (BCPDealOutputTypeEnum bCPDealOutputTypeEnum4 : values) {
            A18.put(bCPDealOutputTypeEnum4.A00, bCPDealOutputTypeEnum4);
        }
        A01 = A18;
        CREATOR = new C63469Sl9(68);
    }

    public static BCPDealOutputTypeEnum valueOf(String str) {
        return (BCPDealOutputTypeEnum) Enum.valueOf(BCPDealOutputTypeEnum.class, str);
    }

    public static BCPDealOutputTypeEnum[] values() {
        return (BCPDealOutputTypeEnum[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public BCPDealOutputTypeEnum(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
