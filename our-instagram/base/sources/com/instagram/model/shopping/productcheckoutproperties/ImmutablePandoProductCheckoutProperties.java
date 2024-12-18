package com.instagram.model.shopping.productcheckoutproperties;

import X.AbstractC136426Fv;
import X.AbstractC25234BEr;
import X.AbstractC25235BEs;
import X.AbstractC40725I3f;
import X.C17T;
import X.C39305HXw;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.model.payments.CurrencyAmountInfo;
import com.instagram.model.payments.CurrencyAmountInfoImpl;
import com.instagram.model.payments.ImmutablePandoCurrencyAmountInfo;

/* loaded from: classes7.dex */
public final class ImmutablePandoProductCheckoutProperties extends C17T implements ProductCheckoutPropertiesIntf {
    public static final AbstractC136426Fv CREATOR = C39305HXw.A00(59);

    @Override // com.instagram.model.shopping.productcheckoutproperties.ProductCheckoutPropertiesIntf
    public final CurrencyAmountInfo Au6() {
        return (CurrencyAmountInfo) A05(277108806, ImmutablePandoCurrencyAmountInfo.class);
    }

    @Override // com.instagram.model.shopping.productcheckoutproperties.ProductCheckoutPropertiesIntf
    public final ShippingAndReturnsMetadataIntf Bub() {
        return (ShippingAndReturnsMetadataIntf) A05(282398665, ImmutablePandoShippingAndReturnsMetadata.class);
    }

    @Override // com.instagram.model.shopping.productcheckoutproperties.ProductCheckoutPropertiesIntf
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC40725I3f.A00(this));
    }

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.model.shopping.productcheckoutproperties.ProductCheckoutPropertiesIntf
    public final Boolean AkE() {
        return getOptionalBooleanValueByHashCode(-1009937039);
    }

    @Override // com.instagram.model.shopping.productcheckoutproperties.ProductCheckoutPropertiesIntf
    public final Boolean AkQ() {
        return getOptionalBooleanValueByHashCode(1352463419);
    }

    @Override // com.instagram.model.shopping.productcheckoutproperties.ProductCheckoutPropertiesIntf
    public final Boolean Al0() {
        return getOptionalBooleanValueByHashCode(1209557281);
    }

    @Override // com.instagram.model.shopping.productcheckoutproperties.ProductCheckoutPropertiesIntf
    public final Integer B8u() {
        return getOptionalIntValueByHashCode(261613502);
    }

    @Override // com.instagram.model.shopping.productcheckoutproperties.ProductCheckoutPropertiesIntf
    public final Boolean BBk() {
        return getOptionalBooleanValueByHashCode(-414564036);
    }

    @Override // com.instagram.model.shopping.productcheckoutproperties.ProductCheckoutPropertiesIntf
    public final Boolean BBl() {
        return getOptionalBooleanValueByHashCode(1916113810);
    }

    @Override // com.instagram.model.shopping.productcheckoutproperties.ProductCheckoutPropertiesIntf
    public final Integer BJM() {
        return getOptionalIntValueByHashCode(-1448197106);
    }

    @Override // com.instagram.model.shopping.productcheckoutproperties.ProductCheckoutPropertiesIntf
    public final Long BfH() {
        return A0L(-1226045449);
    }

    @Override // com.instagram.model.shopping.productcheckoutproperties.ProductCheckoutPropertiesIntf
    public final Boolean Bh1() {
        return getOptionalBooleanValueByHashCode(-1664796441);
    }

    @Override // com.instagram.model.shopping.productcheckoutproperties.ProductCheckoutPropertiesIntf
    public final Integer CBH() {
        return getOptionalIntValueByHashCode(883331850);
    }

    @Override // com.instagram.model.shopping.productcheckoutproperties.ProductCheckoutPropertiesIntf
    public final Integer CGE() {
        return getOptionalIntValueByHashCode(1674036426);
    }

    @Override // com.instagram.model.shopping.productcheckoutproperties.ProductCheckoutPropertiesIntf
    public final Boolean CX5() {
        return getOptionalBooleanValueByHashCode(-168393277);
    }

    @Override // com.instagram.model.shopping.productcheckoutproperties.ProductCheckoutPropertiesIntf
    public final Boolean CbM() {
        return getOptionalBooleanValueByHashCode(1924211493);
    }

    @Override // com.instagram.model.shopping.productcheckoutproperties.ProductCheckoutPropertiesIntf
    public final Boolean Cd7() {
        return getOptionalBooleanValueByHashCode(-1902860266);
    }

    @Override // com.instagram.model.shopping.productcheckoutproperties.ProductCheckoutPropertiesIntf
    public final ProductCheckoutProperties F69() {
        CurrencyAmountInfoImpl currencyAmountInfoImpl;
        Boolean optionalBooleanValueByHashCode = getOptionalBooleanValueByHashCode(-1009937039);
        Boolean optionalBooleanValueByHashCode2 = getOptionalBooleanValueByHashCode(1352463419);
        Boolean optionalBooleanValueByHashCode3 = getOptionalBooleanValueByHashCode(1209557281);
        CurrencyAmountInfo Au6 = Au6();
        ShippingAndReturnsMetadata shippingAndReturnsMetadata = null;
        if (Au6 != null) {
            currencyAmountInfoImpl = Au6.F5F();
        } else {
            currencyAmountInfoImpl = null;
        }
        Integer optionalIntValueByHashCode = getOptionalIntValueByHashCode(261613502);
        Boolean optionalBooleanValueByHashCode4 = getOptionalBooleanValueByHashCode(-414564036);
        Boolean optionalBooleanValueByHashCode5 = getOptionalBooleanValueByHashCode(1916113810);
        String A0j = A0j(1618568598);
        Integer optionalIntValueByHashCode2 = getOptionalIntValueByHashCode(-1448197106);
        Boolean optionalBooleanValueByHashCode6 = getOptionalBooleanValueByHashCode(-168393277);
        Boolean optionalBooleanValueByHashCode7 = getOptionalBooleanValueByHashCode(1924211493);
        Boolean optionalBooleanValueByHashCode8 = getOptionalBooleanValueByHashCode(-1902860266);
        Long A0L = A0L(-1226045449);
        Boolean optionalBooleanValueByHashCode9 = getOptionalBooleanValueByHashCode(-1664796441);
        String A0j2 = A0j(-2102555285);
        ShippingAndReturnsMetadataIntf Bub = Bub();
        if (Bub != null) {
            shippingAndReturnsMetadata = Bub.F6A();
        }
        return new ProductCheckoutProperties(currencyAmountInfoImpl, shippingAndReturnsMetadata, optionalBooleanValueByHashCode, optionalBooleanValueByHashCode2, optionalBooleanValueByHashCode3, optionalBooleanValueByHashCode4, optionalBooleanValueByHashCode5, optionalBooleanValueByHashCode6, optionalBooleanValueByHashCode7, optionalBooleanValueByHashCode8, optionalBooleanValueByHashCode9, optionalIntValueByHashCode, optionalIntValueByHashCode2, getOptionalIntValueByHashCode(883331850), getOptionalIntValueByHashCode(1674036426), A0L, A0j, A0j2);
    }

    @Override // com.instagram.model.shopping.productcheckoutproperties.ProductCheckoutPropertiesIntf
    public final String getIgReferrerFbid() {
        return A0j(1618568598);
    }

    @Override // com.instagram.model.shopping.productcheckoutproperties.ProductCheckoutPropertiesIntf
    public final String getReceiverId() {
        return A0j(-2102555285);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC25235BEs.A1E(parcel, this);
    }
}
