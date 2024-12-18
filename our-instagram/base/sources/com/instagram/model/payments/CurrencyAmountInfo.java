package com.instagram.model.payments;

import X.IZI;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes7.dex */
public interface CurrencyAmountInfo extends Parcelable {
    public static final IZI A00 = IZI.A00;

    Integer BYa();

    CurrencyAmountInfoImpl F5F();

    TreeUpdaterJNI F7o();

    String getAmount();

    String getAmountWithOffset();

    String getCurrency();
}
