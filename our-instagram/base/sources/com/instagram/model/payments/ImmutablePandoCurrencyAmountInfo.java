package com.instagram.model.payments;

import X.AbstractC136426Fv;
import X.AbstractC25234BEr;
import X.AbstractC25235BEs;
import X.C17T;
import X.C39305HXw;
import X.I2O;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes7.dex */
public final class ImmutablePandoCurrencyAmountInfo extends C17T implements CurrencyAmountInfo {
    public static final AbstractC136426Fv CREATOR = C39305HXw.A00(46);

    @Override // com.instagram.model.payments.CurrencyAmountInfo
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, I2O.A00(this));
    }

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.model.payments.CurrencyAmountInfo
    public final Integer BYa() {
        return getOptionalIntValueByHashCode(-1019779949);
    }

    @Override // com.instagram.model.payments.CurrencyAmountInfo
    public final CurrencyAmountInfoImpl F5F() {
        return new CurrencyAmountInfoImpl(getOptionalIntValueByHashCode(-1019779949), A0i(-1413853096), A0i(-565489467), A0i(575402001));
    }

    @Override // com.instagram.model.payments.CurrencyAmountInfo
    public final String getAmount() {
        return A0i(-1413853096);
    }

    @Override // com.instagram.model.payments.CurrencyAmountInfo
    public final String getAmountWithOffset() {
        return A0i(-565489467);
    }

    @Override // com.instagram.model.payments.CurrencyAmountInfo
    public final String getCurrency() {
        return A0i(575402001);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC25235BEs.A1E(parcel, this);
    }
}
