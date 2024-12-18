package com.instagram.model.payments;

import X.AbstractC166987dD;
import X.AbstractC37300Gc1;
import X.AbstractC37301Gc2;
import X.C0T6;
import X.C14360o3;
import X.C55343Oh9;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;

/* loaded from: classes7.dex */
public final class DeliveryWindowInfoImpl extends C0T6 implements Parcelable, DeliveryWindowInfo {
    public static final Parcelable.Creator CREATOR = new C55343Oh9(90);
    public final long A00;
    public final long A01;

    @Override // com.instagram.model.payments.DeliveryWindowInfo
    public final DeliveryWindowInfoImpl F5G() {
        return this;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof DeliveryWindowInfoImpl) {
                DeliveryWindowInfoImpl deliveryWindowInfoImpl = (DeliveryWindowInfoImpl) obj;
                if (this.A00 != deliveryWindowInfoImpl.A00 || this.A01 != deliveryWindowInfoImpl.A01) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeLong(this.A00);
        parcel.writeLong(this.A01);
    }

    @Override // com.instagram.model.payments.DeliveryWindowInfo
    public final long BQE() {
        return this.A00;
    }

    @Override // com.instagram.model.payments.DeliveryWindowInfo
    public final long BU8() {
        return this.A01;
    }

    @Override // com.instagram.model.payments.DeliveryWindowInfo
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        BQE();
        A1I.put("maximum_date", Long.valueOf(BQE()));
        BU8();
        return AbstractC37300Gc1.A05("XDTDeliveryWindowDict", AbstractC37301Gc2.A0r("minimum_date", Long.valueOf(BU8()), A1I));
    }

    public final int hashCode() {
        long j = this.A00;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        long j2 = this.A01;
        return i + ((int) (j2 ^ (j2 >>> 32)));
    }

    public DeliveryWindowInfoImpl(long j, long j2) {
        this.A00 = j;
        this.A01 = j2;
    }
}
