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
public final class GiftsMonetizationStatus implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ GiftsMonetizationStatus[] A03;
    public static final GiftsMonetizationStatus A04;
    public static final GiftsMonetizationStatus A05;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        GiftsMonetizationStatus giftsMonetizationStatus = new GiftsMonetizationStatus("UNRECOGNIZED", 0, "GiftsMonetizationStatus_unspecified");
        A05 = giftsMonetizationStatus;
        GiftsMonetizationStatus giftsMonetizationStatus2 = new GiftsMonetizationStatus("MONETIZED", 1, "monetized");
        A04 = giftsMonetizationStatus2;
        GiftsMonetizationStatus[] giftsMonetizationStatusArr = {giftsMonetizationStatus, giftsMonetizationStatus2, new GiftsMonetizationStatus("NON_MONETIZED", 2, "non-monetized")};
        A03 = giftsMonetizationStatusArr;
        A02 = AbstractC12190kN.A00(giftsMonetizationStatusArr);
        GiftsMonetizationStatus[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (GiftsMonetizationStatus giftsMonetizationStatus3 : values) {
            A18.put(giftsMonetizationStatus3.A00, giftsMonetizationStatus3);
        }
        A01 = A18;
        CREATOR = C41854Ig8.A00(96);
    }

    public static GiftsMonetizationStatus valueOf(String str) {
        return (GiftsMonetizationStatus) Enum.valueOf(GiftsMonetizationStatus.class, str);
    }

    public static GiftsMonetizationStatus[] values() {
        return (GiftsMonetizationStatus[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public GiftsMonetizationStatus(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
