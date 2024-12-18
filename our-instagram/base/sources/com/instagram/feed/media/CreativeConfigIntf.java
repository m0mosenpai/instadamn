package com.instagram.feed.media;

import X.C1DV;
import X.C1DY;
import X.C73181Xxh;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.AttributionUser;
import com.instagram.model.shopping.ProductItemWithARIntf;
import java.util.List;

/* loaded from: classes2.dex */
public interface CreativeConfigIntf extends Parcelable {
    public static final C73181Xxh A00 = C73181Xxh.A00;

    AttributionUser AdP();

    List Ak7();

    List Asl();

    String AzG();

    String AzH();

    List B0S();

    EffectPreviewIntf B0a();

    ProductItemWithARIntf B0b();

    String B3R();

    String B3z();

    String B85();

    List B9a();

    String BcZ();

    CreativeConfigIntf EBM(C1DY c1dy);

    CreativeConfig F4X(C1DY c1dy);

    CreativeConfig F4Y(C1DV c1dv);

    TreeUpdaterJNI F7o();

    String getCaptureType();

    String getFailureReason();
}
