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
public final class CreditCardAssociation implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ CreditCardAssociation[] A03;
    public static final CreditCardAssociation A04;
    public static final CreditCardAssociation A05;
    public static final CreditCardAssociation A06;
    public static final CreditCardAssociation A07;
    public static final CreditCardAssociation A08;
    public static final CreditCardAssociation A09;
    public static final CreditCardAssociation A0A;
    public static final CreditCardAssociation A0B;
    public static final CreditCardAssociation A0C;
    public static final CreditCardAssociation A0D;
    public static final CreditCardAssociation A0E;
    public static final CreditCardAssociation A0F;
    public static final CreditCardAssociation A0G;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        CreditCardAssociation creditCardAssociation = new CreditCardAssociation("UNRECOGNIZED", 0, "CreditCardAssociation_unspecified");
        A0G = creditCardAssociation;
        CreditCardAssociation creditCardAssociation2 = new CreditCardAssociation("AMERICANEXPRESS", 1, "AMERICANEXPRESS");
        A04 = creditCardAssociation2;
        CreditCardAssociation creditCardAssociation3 = new CreditCardAssociation("CUP", 2, "CUP");
        A05 = creditCardAssociation3;
        CreditCardAssociation creditCardAssociation4 = new CreditCardAssociation("DINERSCLUB", 3, "DINERSCLUB");
        A06 = creditCardAssociation4;
        CreditCardAssociation creditCardAssociation5 = new CreditCardAssociation("DISCOVER", 4, "DISCOVER");
        A07 = creditCardAssociation5;
        CreditCardAssociation creditCardAssociation6 = new CreditCardAssociation("ELO", 5, "ELO");
        A08 = creditCardAssociation6;
        CreditCardAssociation creditCardAssociation7 = new CreditCardAssociation("INTERAC", 6, "INTERAC");
        A09 = creditCardAssociation7;
        CreditCardAssociation creditCardAssociation8 = new CreditCardAssociation("JCB", 7, "JCB");
        A0A = creditCardAssociation8;
        CreditCardAssociation creditCardAssociation9 = new CreditCardAssociation("MAESTRO", 8, "MAESTRO");
        A0B = creditCardAssociation9;
        CreditCardAssociation creditCardAssociation10 = new CreditCardAssociation("MASTERCARD", 9, "MASTERCARD");
        A0C = creditCardAssociation10;
        CreditCardAssociation creditCardAssociation11 = new CreditCardAssociation("PIN_ONLY", 10, "PIN_ONLY");
        A0D = creditCardAssociation11;
        CreditCardAssociation creditCardAssociation12 = new CreditCardAssociation("RUPAY", 11, "RUPAY");
        A0E = creditCardAssociation12;
        CreditCardAssociation creditCardAssociation13 = new CreditCardAssociation("UNKNOWN", 12, "UNKNOWN");
        A0F = creditCardAssociation13;
        CreditCardAssociation[] creditCardAssociationArr = {creditCardAssociation, creditCardAssociation2, creditCardAssociation3, creditCardAssociation4, creditCardAssociation5, creditCardAssociation6, creditCardAssociation7, creditCardAssociation8, creditCardAssociation9, creditCardAssociation10, creditCardAssociation11, creditCardAssociation12, creditCardAssociation13, new CreditCardAssociation("VISA", 13, "VISA")};
        A03 = creditCardAssociationArr;
        A02 = AbstractC12190kN.A00(creditCardAssociationArr);
        CreditCardAssociation[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (CreditCardAssociation creditCardAssociation14 : values) {
            A18.put(creditCardAssociation14.A00, creditCardAssociation14);
        }
        A01 = A18;
        CREATOR = C41854Ig8.A00(57);
    }

    public static CreditCardAssociation valueOf(String str) {
        return (CreditCardAssociation) Enum.valueOf(CreditCardAssociation.class, str);
    }

    public static CreditCardAssociation[] values() {
        return (CreditCardAssociation[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public CreditCardAssociation(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
