package com.instagram.api.schemas;

import X.AbstractC12190kN;
import X.AbstractC16850sd;
import X.C14360o3;
import X.C206149Aw;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class CarouselRenderingType implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ CarouselRenderingType[] A03;
    public static final CarouselRenderingType A04;
    public static final CarouselRenderingType A05;
    public static final CarouselRenderingType A06;
    public static final CarouselRenderingType A07;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeInt(ordinal());
    }

    static {
        CarouselRenderingType carouselRenderingType = new CarouselRenderingType("UNRECOGNIZED", 0, "CarouselRenderingType_unspecified");
        A07 = carouselRenderingType;
        CarouselRenderingType carouselRenderingType2 = new CarouselRenderingType("DPA", 1, "dpa");
        A04 = carouselRenderingType2;
        CarouselRenderingType carouselRenderingType3 = new CarouselRenderingType("MPS", 2, "mps");
        A05 = carouselRenderingType3;
        CarouselRenderingType carouselRenderingType4 = new CarouselRenderingType("OPT_IN", 3, "opt_in");
        A06 = carouselRenderingType4;
        CarouselRenderingType[] carouselRenderingTypeArr = {carouselRenderingType, carouselRenderingType2, carouselRenderingType3, carouselRenderingType4};
        A03 = carouselRenderingTypeArr;
        A02 = AbstractC12190kN.A00(carouselRenderingTypeArr);
        CarouselRenderingType[] values = values();
        int A0L = AbstractC16850sd.A0L(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L < 16 ? 16 : A0L);
        for (CarouselRenderingType carouselRenderingType5 : values) {
            linkedHashMap.put(carouselRenderingType5.A00, carouselRenderingType5);
        }
        A01 = linkedHashMap;
        CREATOR = new C206149Aw(59);
    }

    public static CarouselRenderingType valueOf(String str) {
        return (CarouselRenderingType) Enum.valueOf(CarouselRenderingType.class, str);
    }

    public static CarouselRenderingType[] values() {
        return (CarouselRenderingType[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public CarouselRenderingType(String str, int i, String str2) {
        this.A00 = str2;
    }
}
