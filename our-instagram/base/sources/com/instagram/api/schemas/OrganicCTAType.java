package com.instagram.api.schemas;

import X.AbstractC12190kN;
import X.AbstractC167017dG;
import X.AbstractC167027dH;
import X.AbstractC25225BEi;
import X.C41855Ig9;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class OrganicCTAType implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ OrganicCTAType[] A03;
    public static final OrganicCTAType A04;
    public static final OrganicCTAType A05;
    public static final OrganicCTAType A06;
    public static final OrganicCTAType A07;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        OrganicCTAType organicCTAType = new OrganicCTAType("UNRECOGNIZED", 0, "OrganicCTAType_unspecified");
        A07 = organicCTAType;
        OrganicCTAType organicCTAType2 = new OrganicCTAType("BOOK_APPOINTMENT", 1, "book_appointment");
        A04 = organicCTAType2;
        OrganicCTAType organicCTAType3 = new OrganicCTAType("CLICK_TO_DIRECT", 2, "click_to_direct");
        A05 = organicCTAType3;
        OrganicCTAType organicCTAType4 = new OrganicCTAType("CLICK_TO_WHATSAPP", 3, "click_to_whatsapp");
        A06 = organicCTAType4;
        OrganicCTAType[] organicCTATypeArr = {organicCTAType, organicCTAType2, organicCTAType3, organicCTAType4};
        A03 = organicCTATypeArr;
        A02 = AbstractC12190kN.A00(organicCTATypeArr);
        OrganicCTAType[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (OrganicCTAType organicCTAType5 : values) {
            A18.put(organicCTAType5.A00, organicCTAType5);
        }
        A01 = A18;
        CREATOR = C41855Ig9.A00(24);
    }

    public static OrganicCTAType valueOf(String str) {
        return (OrganicCTAType) Enum.valueOf(OrganicCTAType.class, str);
    }

    public static OrganicCTAType[] values() {
        return (OrganicCTAType[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public OrganicCTAType(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
