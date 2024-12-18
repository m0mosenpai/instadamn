package com.meta.payments.model.payment;

import X.AbstractC12190kN;
import X.C55344OhA;
import X.MSZ;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebookpay.offsite.models.message.PayButtonCTAType$Companion;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes9.dex */
public final class PaymentCtaType implements Parcelable {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ PaymentCtaType[] A01;
    public static final PaymentCtaType A02;
    public static final Parcelable.Creator CREATOR;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        PaymentCtaType paymentCtaType = new PaymentCtaType(PayButtonCTAType$Companion.PAY, 0);
        A02 = paymentCtaType;
        PaymentCtaType[] paymentCtaTypeArr = {paymentCtaType, new PaymentCtaType(PayButtonCTAType$Companion.CONTINUE, 1)};
        A01 = paymentCtaTypeArr;
        A00 = AbstractC12190kN.A00(paymentCtaTypeArr);
        CREATOR = C55344OhA.A00(78);
    }

    public static PaymentCtaType valueOf(String str) {
        return (PaymentCtaType) Enum.valueOf(PaymentCtaType.class, str);
    }

    public static PaymentCtaType[] values() {
        return (PaymentCtaType[]) A01.clone();
    }

    public PaymentCtaType(String str, int i) {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        MSZ.A12(parcel, this);
    }
}
