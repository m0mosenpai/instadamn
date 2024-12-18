package com.meta.payments.model.configuration;

import X.AbstractC12190kN;
import X.C55344OhA;
import X.MSZ;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class PaymentContainerType implements Parcelable {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ PaymentContainerType[] A01;
    public static final PaymentContainerType A02;
    public static final PaymentContainerType A03;
    public static final PaymentContainerType A04;
    public static final Parcelable.Creator CREATOR;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        PaymentContainerType paymentContainerType = new PaymentContainerType("BASIC_CARD_V1", 0);
        A02 = paymentContainerType;
        PaymentContainerType paymentContainerType2 = new PaymentContainerType("FB_TOKEN_V1", 1);
        A04 = paymentContainerType2;
        PaymentContainerType paymentContainerType3 = new PaymentContainerType("ECOM_TOKEN_V1", 2);
        A03 = paymentContainerType3;
        PaymentContainerType[] paymentContainerTypeArr = {paymentContainerType, paymentContainerType2, paymentContainerType3, new PaymentContainerType("META_PAYMENT_V1", 3)};
        A01 = paymentContainerTypeArr;
        A00 = AbstractC12190kN.A00(paymentContainerTypeArr);
        CREATOR = new C55344OhA(66);
    }

    public static PaymentContainerType valueOf(String str) {
        return (PaymentContainerType) Enum.valueOf(PaymentContainerType.class, str);
    }

    public static PaymentContainerType[] values() {
        return (PaymentContainerType[]) A01.clone();
    }

    public PaymentContainerType(String str, int i) {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        MSZ.A12(parcel, this);
    }
}
