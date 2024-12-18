package com.meta.payments.model.shipping;

import X.AbstractC12190kN;
import X.C55344OhA;
import X.MSZ;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebookpay.offsite.models.message.OffsiteShippingType$Companion;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes9.dex */
public final class ShippingOptionType implements Parcelable {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ ShippingOptionType[] A01;
    public static final ShippingOptionType A02;
    public static final ShippingOptionType A03;
    public static final Parcelable.Creator CREATOR;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        ShippingOptionType shippingOptionType = new ShippingOptionType("SHIPPING", 0);
        A03 = shippingOptionType;
        ShippingOptionType shippingOptionType2 = new ShippingOptionType(OffsiteShippingType$Companion.DELIVERY, 1);
        A02 = shippingOptionType2;
        ShippingOptionType[] shippingOptionTypeArr = {shippingOptionType, shippingOptionType2, new ShippingOptionType("PICKUP", 2)};
        A01 = shippingOptionTypeArr;
        A00 = AbstractC12190kN.A00(shippingOptionTypeArr);
        CREATOR = C55344OhA.A00(82);
    }

    public static ShippingOptionType valueOf(String str) {
        return (ShippingOptionType) Enum.valueOf(ShippingOptionType.class, str);
    }

    public static ShippingOptionType[] values() {
        return (ShippingOptionType[]) A01.clone();
    }

    public ShippingOptionType(String str, int i) {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        MSZ.A12(parcel, this);
    }
}
