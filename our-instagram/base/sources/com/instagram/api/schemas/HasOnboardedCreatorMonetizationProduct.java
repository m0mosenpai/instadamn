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
public final class HasOnboardedCreatorMonetizationProduct implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ HasOnboardedCreatorMonetizationProduct[] A03;
    public static final HasOnboardedCreatorMonetizationProduct A04;
    public static final HasOnboardedCreatorMonetizationProduct A05;
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
        HasOnboardedCreatorMonetizationProduct hasOnboardedCreatorMonetizationProduct = new HasOnboardedCreatorMonetizationProduct("UNRECOGNIZED", 0, "HasOnboardedCreatorMonetizationProduct_unspecified");
        A05 = hasOnboardedCreatorMonetizationProduct;
        HasOnboardedCreatorMonetizationProduct hasOnboardedCreatorMonetizationProduct2 = new HasOnboardedCreatorMonetizationProduct("HAS_COMPLETED_ONBOARDING", 1, "has_completed_onboarding");
        A04 = hasOnboardedCreatorMonetizationProduct2;
        HasOnboardedCreatorMonetizationProduct[] hasOnboardedCreatorMonetizationProductArr = {hasOnboardedCreatorMonetizationProduct, hasOnboardedCreatorMonetizationProduct2, new HasOnboardedCreatorMonetizationProduct("HAS_NOT_COMPLETED_ONBOARDING", 2, "has_not_completed_onboarding")};
        A03 = hasOnboardedCreatorMonetizationProductArr;
        A02 = AbstractC12190kN.A00(hasOnboardedCreatorMonetizationProductArr);
        HasOnboardedCreatorMonetizationProduct[] values = values();
        int A0L = AbstractC16850sd.A0L(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L < 16 ? 16 : A0L);
        for (HasOnboardedCreatorMonetizationProduct hasOnboardedCreatorMonetizationProduct3 : values) {
            linkedHashMap.put(hasOnboardedCreatorMonetizationProduct3.A00, hasOnboardedCreatorMonetizationProduct3);
        }
        A01 = linkedHashMap;
        CREATOR = new C206149Aw(98);
    }

    public static HasOnboardedCreatorMonetizationProduct valueOf(String str) {
        return (HasOnboardedCreatorMonetizationProduct) Enum.valueOf(HasOnboardedCreatorMonetizationProduct.class, str);
    }

    public static HasOnboardedCreatorMonetizationProduct[] values() {
        return (HasOnboardedCreatorMonetizationProduct[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public HasOnboardedCreatorMonetizationProduct(String str, int i, String str2) {
        this.A00 = str2;
    }
}
