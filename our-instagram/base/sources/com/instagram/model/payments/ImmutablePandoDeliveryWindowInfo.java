package com.instagram.model.payments;

import X.AbstractC136426Fv;
import X.AbstractC166987dD;
import X.AbstractC25234BEr;
import X.AbstractC25235BEs;
import X.AbstractC37301Gc2;
import X.C17T;
import X.C39305HXw;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;

/* loaded from: classes7.dex */
public final class ImmutablePandoDeliveryWindowInfo extends C17T implements DeliveryWindowInfo {
    public static final AbstractC136426Fv CREATOR = C39305HXw.A00(47);

    @Override // com.instagram.model.payments.DeliveryWindowInfo
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        BQE();
        A1I.put("maximum_date", Long.valueOf(BQE()));
        BU8();
        return AbstractC25234BEr.A0P(this, AbstractC37301Gc2.A0r("minimum_date", Long.valueOf(BU8()), A1I));
    }

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.model.payments.DeliveryWindowInfo
    public final long BQE() {
        return A03(726451821);
    }

    @Override // com.instagram.model.payments.DeliveryWindowInfo
    public final long BU8() {
        return A03(1200877887);
    }

    @Override // com.instagram.model.payments.DeliveryWindowInfo
    public final DeliveryWindowInfoImpl F5G() {
        return new DeliveryWindowInfoImpl(A03(726451821), A03(1200877887));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC25235BEs.A1E(parcel, this);
    }
}
