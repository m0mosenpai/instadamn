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
/* loaded from: classes2.dex */
public final class CanUseCreatorMonetizationProduct implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ CanUseCreatorMonetizationProduct[] A03;
    public static final CanUseCreatorMonetizationProduct A04;
    public static final CanUseCreatorMonetizationProduct A05;
    public static final CanUseCreatorMonetizationProduct A06;
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
        CanUseCreatorMonetizationProduct canUseCreatorMonetizationProduct = new CanUseCreatorMonetizationProduct("UNRECOGNIZED", 0, "CanUseCreatorMonetizationProduct_unspecified");
        A06 = canUseCreatorMonetizationProduct;
        CanUseCreatorMonetizationProduct canUseCreatorMonetizationProduct2 = new CanUseCreatorMonetizationProduct("CAN_NOT_USE_PRODUCT", 1, "can_not_use_product");
        A04 = canUseCreatorMonetizationProduct2;
        CanUseCreatorMonetizationProduct canUseCreatorMonetizationProduct3 = new CanUseCreatorMonetizationProduct("CAN_USE_PRODUCT", 2, "can_use_product");
        A05 = canUseCreatorMonetizationProduct3;
        CanUseCreatorMonetizationProduct[] canUseCreatorMonetizationProductArr = {canUseCreatorMonetizationProduct, canUseCreatorMonetizationProduct2, canUseCreatorMonetizationProduct3};
        A03 = canUseCreatorMonetizationProductArr;
        A02 = AbstractC12190kN.A00(canUseCreatorMonetizationProductArr);
        CanUseCreatorMonetizationProduct[] values = values();
        int A0L = AbstractC16850sd.A0L(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L < 16 ? 16 : A0L);
        for (CanUseCreatorMonetizationProduct canUseCreatorMonetizationProduct4 : values) {
            linkedHashMap.put(canUseCreatorMonetizationProduct4.A00, canUseCreatorMonetizationProduct4);
        }
        A01 = linkedHashMap;
        CREATOR = new C206149Aw(58);
    }

    public static CanUseCreatorMonetizationProduct valueOf(String str) {
        return (CanUseCreatorMonetizationProduct) Enum.valueOf(CanUseCreatorMonetizationProduct.class, str);
    }

    public static CanUseCreatorMonetizationProduct[] values() {
        return (CanUseCreatorMonetizationProduct[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public CanUseCreatorMonetizationProduct(String str, int i, String str2) {
        this.A00 = str2;
    }
}
