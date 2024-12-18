package com.instagram.user.model;

import X.C1DY;
import X.C41564IaD;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.ScheduledLiveAffiliateInfo;
import com.instagram.api.schemas.ScheduledLiveDiscountInfo;
import java.util.List;

/* loaded from: classes7.dex */
public interface ScheduledLiveProductsMetadataIntf extends Parcelable {
    public static final C41564IaD A00 = C41564IaD.A00;

    ScheduledLiveAffiliateInfo AaO();

    ProductCollection Ap9();

    ScheduledLiveDiscountInfo AyI();

    User BSW();

    List BhR();

    ScheduledLiveProductsMetadataIntf ECG(C1DY c1dy);

    ScheduledLiveProductsMetadata F7X(C1DY c1dy);

    TreeUpdaterJNI F7o();
}
