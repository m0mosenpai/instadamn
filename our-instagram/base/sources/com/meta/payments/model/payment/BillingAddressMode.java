package com.meta.payments.model.payment;

import X.AbstractC12190kN;
import X.C55344OhA;
import X.MSZ;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes9.dex */
public final class BillingAddressMode implements Parcelable {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ BillingAddressMode[] A01;
    public static final BillingAddressMode A02;
    public static final Parcelable.Creator CREATOR;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        BillingAddressMode billingAddressMode = new BillingAddressMode("MIN", 0);
        A02 = billingAddressMode;
        BillingAddressMode[] billingAddressModeArr = {billingAddressMode, new BillingAddressMode("FULL", 1)};
        A01 = billingAddressModeArr;
        A00 = AbstractC12190kN.A00(billingAddressModeArr);
        CREATOR = C55344OhA.A00(69);
    }

    public static BillingAddressMode valueOf(String str) {
        return (BillingAddressMode) Enum.valueOf(BillingAddressMode.class, str);
    }

    public static BillingAddressMode[] values() {
        return (BillingAddressMode[]) A01.clone();
    }

    public BillingAddressMode(String str, int i) {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        MSZ.A12(parcel, this);
    }
}
