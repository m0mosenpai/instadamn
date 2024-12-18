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
public final class PartnerId implements Parcelable {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ PartnerId[] A01;
    public static final PartnerId A02;
    public static final PartnerId A03;
    public static final Parcelable.Creator CREATOR;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        PartnerId partnerId = new PartnerId("SHOPIFY_LIVE", 0);
        A02 = partnerId;
        PartnerId partnerId2 = new PartnerId("STRIPE_LIVE", 1);
        A03 = partnerId2;
        PartnerId[] partnerIdArr = {partnerId, partnerId2, new PartnerId("META_IAP", 2)};
        A01 = partnerIdArr;
        A00 = AbstractC12190kN.A00(partnerIdArr);
        CREATOR = C55344OhA.A00(65);
    }

    public static PartnerId valueOf(String str) {
        return (PartnerId) Enum.valueOf(PartnerId.class, str);
    }

    public static PartnerId[] values() {
        return (PartnerId[]) A01.clone();
    }

    public PartnerId(String str, int i) {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        MSZ.A12(parcel, this);
    }
}
