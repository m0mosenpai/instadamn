package com.meta.payments.model.configuration;

import X.AbstractC12190kN;
import X.C55344OhA;
import X.MSZ;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes9.dex */
public final class PaymentMode implements Parcelable {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ PaymentMode[] A01;
    public static final PaymentMode A02;
    public static final Parcelable.Creator CREATOR;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        PaymentMode paymentMode = new PaymentMode("LIVE", 0);
        A02 = paymentMode;
        PaymentMode[] paymentModeArr = {paymentMode, new PaymentMode("TEST", 1)};
        A01 = paymentModeArr;
        A00 = AbstractC12190kN.A00(paymentModeArr);
        CREATOR = C55344OhA.A00(67);
    }

    public static PaymentMode valueOf(String str) {
        return (PaymentMode) Enum.valueOf(PaymentMode.class, str);
    }

    public static PaymentMode[] values() {
        return (PaymentMode[]) A01.clone();
    }

    public PaymentMode(String str, int i) {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        MSZ.A12(parcel, this);
    }
}
