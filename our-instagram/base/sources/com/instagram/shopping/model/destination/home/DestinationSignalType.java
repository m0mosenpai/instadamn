package com.instagram.shopping.model.destination.home;

import X.AbstractC12190kN;
import X.AbstractC167017dG;
import X.AbstractC167027dH;
import X.AbstractC25225BEi;
import X.C37324GcR;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class DestinationSignalType implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ DestinationSignalType[] A03;
    public static final DestinationSignalType A04;
    public static final DestinationSignalType A05;
    public static final DestinationSignalType A06;
    public static final DestinationSignalType A07;
    public static final DestinationSignalType A08;
    public static final DestinationSignalType A09;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        DestinationSignalType destinationSignalType = new DestinationSignalType("UNRECOGNIZED", 0, "DestinationSignalType_unspecified");
        A09 = destinationSignalType;
        DestinationSignalType destinationSignalType2 = new DestinationSignalType("ADD_TO_CART", 1, "add_to_cart");
        A04 = destinationSignalType2;
        DestinationSignalType destinationSignalType3 = new DestinationSignalType("CLICKED", 2, "clicked");
        A05 = destinationSignalType3;
        DestinationSignalType destinationSignalType4 = new DestinationSignalType("LIKED", 3, "liked");
        A06 = destinationSignalType4;
        DestinationSignalType destinationSignalType5 = new DestinationSignalType("OTHER", 4, "other");
        A07 = destinationSignalType5;
        DestinationSignalType destinationSignalType6 = new DestinationSignalType("SAVED", 5, "saved");
        A08 = destinationSignalType6;
        DestinationSignalType[] destinationSignalTypeArr = {destinationSignalType, destinationSignalType2, destinationSignalType3, destinationSignalType4, destinationSignalType5, destinationSignalType6, new DestinationSignalType("VIEWED", 6, "viewed")};
        A03 = destinationSignalTypeArr;
        A02 = AbstractC12190kN.A00(destinationSignalTypeArr);
        DestinationSignalType[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (DestinationSignalType destinationSignalType7 : values) {
            A18.put(destinationSignalType7.A00, destinationSignalType7);
        }
        A01 = A18;
        CREATOR = C37324GcR.A00(81);
    }

    public static DestinationSignalType valueOf(String str) {
        return (DestinationSignalType) Enum.valueOf(DestinationSignalType.class, str);
    }

    public static DestinationSignalType[] values() {
        return (DestinationSignalType[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public DestinationSignalType(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
