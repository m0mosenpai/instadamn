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
/* loaded from: classes7.dex */
public final class BeneficiaryType implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ BeneficiaryType[] A03;
    public static final BeneficiaryType A04;
    public static final BeneficiaryType A05;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        BeneficiaryType beneficiaryType = new BeneficiaryType("UNRECOGNIZED", 0, "BeneficiaryType_unspecified");
        A05 = beneficiaryType;
        BeneficiaryType beneficiaryType2 = new BeneficiaryType("DAF", 1, "DAF");
        A04 = beneficiaryType2;
        BeneficiaryType[] beneficiaryTypeArr = {beneficiaryType, beneficiaryType2, new BeneficiaryType("ONBOARDED", 2, "ONBOARDED")};
        A03 = beneficiaryTypeArr;
        A02 = AbstractC12190kN.A00(beneficiaryTypeArr);
        BeneficiaryType[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (BeneficiaryType beneficiaryType3 : values) {
            A18.put(beneficiaryType3.A00, beneficiaryType3);
        }
        A01 = A18;
        CREATOR = new C63469Sl9(69);
    }

    public static BeneficiaryType valueOf(String str) {
        return (BeneficiaryType) Enum.valueOf(BeneficiaryType.class, str);
    }

    public static BeneficiaryType[] values() {
        return (BeneficiaryType[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public BeneficiaryType(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
