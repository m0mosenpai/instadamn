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
/* loaded from: classes7.dex */
public final class IGAdsTrustInfoTypeEnum implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ IGAdsTrustInfoTypeEnum[] A03;
    public static final IGAdsTrustInfoTypeEnum A04;
    public static final IGAdsTrustInfoTypeEnum A05;
    public static final IGAdsTrustInfoTypeEnum A06;
    public static final IGAdsTrustInfoTypeEnum A07;
    public static final IGAdsTrustInfoTypeEnum A08;
    public static final IGAdsTrustInfoTypeEnum A09;
    public static final IGAdsTrustInfoTypeEnum A0A;
    public static final IGAdsTrustInfoTypeEnum A0B;
    public static final IGAdsTrustInfoTypeEnum A0C;
    public static final IGAdsTrustInfoTypeEnum A0D;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        IGAdsTrustInfoTypeEnum iGAdsTrustInfoTypeEnum = new IGAdsTrustInfoTypeEnum("UNRECOGNIZED", 0, "IGAdsTrustInfoTypeEnum_unspecified");
        A0D = iGAdsTrustInfoTypeEnum;
        IGAdsTrustInfoTypeEnum iGAdsTrustInfoTypeEnum2 = new IGAdsTrustInfoTypeEnum("ACCOUNT_FOLLOWER", 1, "ACCOUNT_FOLLOWER");
        A04 = iGAdsTrustInfoTypeEnum2;
        IGAdsTrustInfoTypeEnum iGAdsTrustInfoTypeEnum3 = new IGAdsTrustInfoTypeEnum("BC_OPTIONS", 2, "BC_OPTIONS");
        A05 = iGAdsTrustInfoTypeEnum3;
        IGAdsTrustInfoTypeEnum iGAdsTrustInfoTypeEnum4 = new IGAdsTrustInfoTypeEnum("DESTINATION_URL", 3, "DESTINATION_URL");
        A06 = iGAdsTrustInfoTypeEnum4;
        IGAdsTrustInfoTypeEnum iGAdsTrustInfoTypeEnum5 = new IGAdsTrustInfoTypeEnum("HEADLINE", 4, "HEADLINE");
        A07 = iGAdsTrustInfoTypeEnum5;
        IGAdsTrustInfoTypeEnum iGAdsTrustInfoTypeEnum6 = new IGAdsTrustInfoTypeEnum("LOCATION", 5, "LOCATION");
        A08 = iGAdsTrustInfoTypeEnum6;
        IGAdsTrustInfoTypeEnum iGAdsTrustInfoTypeEnum7 = new IGAdsTrustInfoTypeEnum("PAYMENT_OPTIONS", 6, "PAYMENT_OPTIONS");
        A09 = iGAdsTrustInfoTypeEnum7;
        IGAdsTrustInfoTypeEnum iGAdsTrustInfoTypeEnum8 = new IGAdsTrustInfoTypeEnum("RATINGS_REVIEW", 7, "RATINGS_REVIEW");
        A0A = iGAdsTrustInfoTypeEnum8;
        IGAdsTrustInfoTypeEnum iGAdsTrustInfoTypeEnum9 = new IGAdsTrustInfoTypeEnum("RESPONSE_TIME", 8, "RESPONSE_TIME");
        A0B = iGAdsTrustInfoTypeEnum9;
        IGAdsTrustInfoTypeEnum iGAdsTrustInfoTypeEnum10 = new IGAdsTrustInfoTypeEnum("RETURN_POLICY", 9, "RETURN_POLICY");
        A0C = iGAdsTrustInfoTypeEnum10;
        IGAdsTrustInfoTypeEnum[] iGAdsTrustInfoTypeEnumArr = {iGAdsTrustInfoTypeEnum, iGAdsTrustInfoTypeEnum2, iGAdsTrustInfoTypeEnum3, iGAdsTrustInfoTypeEnum4, iGAdsTrustInfoTypeEnum5, iGAdsTrustInfoTypeEnum6, iGAdsTrustInfoTypeEnum7, iGAdsTrustInfoTypeEnum8, iGAdsTrustInfoTypeEnum9, iGAdsTrustInfoTypeEnum10, new IGAdsTrustInfoTypeEnum("SHIPPING_POLICY", 10, "SHIPPING_POLICY")};
        A03 = iGAdsTrustInfoTypeEnumArr;
        A02 = AbstractC12190kN.A00(iGAdsTrustInfoTypeEnumArr);
        IGAdsTrustInfoTypeEnum[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (IGAdsTrustInfoTypeEnum iGAdsTrustInfoTypeEnum11 : values) {
            A18.put(iGAdsTrustInfoTypeEnum11.A00, iGAdsTrustInfoTypeEnum11);
        }
        A01 = A18;
        CREATOR = C41858IgC.A00(23);
    }

    public static IGAdsTrustInfoTypeEnum valueOf(String str) {
        return (IGAdsTrustInfoTypeEnum) Enum.valueOf(IGAdsTrustInfoTypeEnum.class, str);
    }

    public static IGAdsTrustInfoTypeEnum[] values() {
        return (IGAdsTrustInfoTypeEnum[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public IGAdsTrustInfoTypeEnum(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
