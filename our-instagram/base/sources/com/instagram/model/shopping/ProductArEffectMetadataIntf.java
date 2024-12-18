package com.instagram.model.shopping;

import X.IZU;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.ContainerEffectEnum;
import com.instagram.api.schemas.DynamicEffectState;
import java.util.Map;

/* loaded from: classes7.dex */
public interface ProductArEffectMetadataIntf extends Parcelable {
    public static final IZU A00 = IZU.A00;

    ContainerEffectEnum Aqh();

    DynamicEffectState B00();

    Map B0W();

    String B0X();

    EffectThumbnailImageDictIntf B0g();

    ProductArEffectMetadata F5u();

    TreeUpdaterJNI F7o();

    String getEffectId();
}
