package com.instagram.model.shopping.productcheckoutproperties;

import X.C41528IZd;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.model.payments.CurrencyAmountInfo;
import com.instagram.model.payments.DeliveryWindowInfo;

/* loaded from: classes7.dex */
public interface ShippingAndReturnsMetadataIntf extends Parcelable {
    public static final C41528IZd A00 = C41528IZd.A00;

    DeliveryWindowInfo B2c();

    CurrencyAmountInfo Bp1();

    Integer Bp3();

    CurrencyAmountInfo Buc();

    Boolean CUn();

    ShippingAndReturnsMetadata F6A();

    TreeUpdaterJNI F7o();

    String getShippingCostStripped();
}
