package com.instagram.model.shopping.productcheckoutproperties;

import X.AbstractC136426Fv;
import X.AbstractC25234BEr;
import X.AbstractC25235BEs;
import X.AbstractC40726I3g;
import X.C17T;
import X.C39305HXw;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.model.payments.CurrencyAmountInfo;
import com.instagram.model.payments.CurrencyAmountInfoImpl;
import com.instagram.model.payments.DeliveryWindowInfo;
import com.instagram.model.payments.DeliveryWindowInfoImpl;
import com.instagram.model.payments.ImmutablePandoCurrencyAmountInfo;
import com.instagram.model.payments.ImmutablePandoDeliveryWindowInfo;

/* loaded from: classes7.dex */
public final class ImmutablePandoShippingAndReturnsMetadata extends C17T implements ShippingAndReturnsMetadataIntf {
    public static final AbstractC136426Fv CREATOR = C39305HXw.A00(60);

    @Override // com.instagram.model.shopping.productcheckoutproperties.ShippingAndReturnsMetadataIntf
    public final DeliveryWindowInfo B2c() {
        return (DeliveryWindowInfo) A05(-790167400, ImmutablePandoDeliveryWindowInfo.class);
    }

    @Override // com.instagram.model.shopping.productcheckoutproperties.ShippingAndReturnsMetadataIntf
    public final CurrencyAmountInfo Bp1() {
        return (CurrencyAmountInfo) A05(-1486755460, ImmutablePandoCurrencyAmountInfo.class);
    }

    @Override // com.instagram.model.shopping.productcheckoutproperties.ShippingAndReturnsMetadataIntf
    public final CurrencyAmountInfo Buc() {
        return (CurrencyAmountInfo) A05(542894014, ImmutablePandoCurrencyAmountInfo.class);
    }

    @Override // com.instagram.model.shopping.productcheckoutproperties.ShippingAndReturnsMetadataIntf
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC40726I3g.A00(this));
    }

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.model.shopping.productcheckoutproperties.ShippingAndReturnsMetadataIntf
    public final Integer Bp3() {
        return getOptionalIntValueByHashCode(275589419);
    }

    @Override // com.instagram.model.shopping.productcheckoutproperties.ShippingAndReturnsMetadataIntf
    public final Boolean CUn() {
        return getOptionalBooleanValueByHashCode(444038053);
    }

    @Override // com.instagram.model.shopping.productcheckoutproperties.ShippingAndReturnsMetadataIntf
    public final ShippingAndReturnsMetadata F6A() {
        DeliveryWindowInfoImpl deliveryWindowInfoImpl;
        CurrencyAmountInfoImpl currencyAmountInfoImpl;
        DeliveryWindowInfo B2c = B2c();
        CurrencyAmountInfoImpl currencyAmountInfoImpl2 = null;
        if (B2c != null) {
            deliveryWindowInfoImpl = B2c.F5G();
        } else {
            deliveryWindowInfoImpl = null;
        }
        Boolean optionalBooleanValueByHashCode = getOptionalBooleanValueByHashCode(444038053);
        CurrencyAmountInfo Bp1 = Bp1();
        if (Bp1 != null) {
            currencyAmountInfoImpl = Bp1.F5F();
        } else {
            currencyAmountInfoImpl = null;
        }
        Integer optionalIntValueByHashCode = getOptionalIntValueByHashCode(275589419);
        CurrencyAmountInfo Buc = Buc();
        if (Buc != null) {
            currencyAmountInfoImpl2 = Buc.F5F();
        }
        return new ShippingAndReturnsMetadata(currencyAmountInfoImpl, currencyAmountInfoImpl2, deliveryWindowInfoImpl, optionalBooleanValueByHashCode, optionalIntValueByHashCode, A0i(436065880));
    }

    @Override // com.instagram.model.shopping.productcheckoutproperties.ShippingAndReturnsMetadataIntf
    public final String getShippingCostStripped() {
        return A0i(436065880);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC25235BEs.A1E(parcel, this);
    }
}
