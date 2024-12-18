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
public final class DestinationContentType implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ DestinationContentType[] A03;
    public static final DestinationContentType A04;
    public static final DestinationContentType A05;
    public static final DestinationContentType A06;
    public static final DestinationContentType A07;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        DestinationContentType destinationContentType = new DestinationContentType("UNRECOGNIZED", 0, "DestinationContentType_unspecified");
        A07 = destinationContentType;
        DestinationContentType destinationContentType2 = new DestinationContentType("AD", 1, "ad");
        A04 = destinationContentType2;
        DestinationContentType destinationContentType3 = new DestinationContentType("MEDIA", 2, "media");
        A05 = destinationContentType3;
        DestinationContentType destinationContentType4 = new DestinationContentType("PRODUCT", 3, "product");
        A06 = destinationContentType4;
        DestinationContentType[] destinationContentTypeArr = {destinationContentType, destinationContentType2, destinationContentType3, destinationContentType4, new DestinationContentType("STOREFRONT", 4, "storefront")};
        A03 = destinationContentTypeArr;
        A02 = AbstractC12190kN.A00(destinationContentTypeArr);
        DestinationContentType[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (DestinationContentType destinationContentType5 : values) {
            A18.put(destinationContentType5.A00, destinationContentType5);
        }
        A01 = A18;
        CREATOR = C37324GcR.A00(79);
    }

    public static DestinationContentType valueOf(String str) {
        return (DestinationContentType) Enum.valueOf(DestinationContentType.class, str);
    }

    public static DestinationContentType[] values() {
        return (DestinationContentType[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public DestinationContentType(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
