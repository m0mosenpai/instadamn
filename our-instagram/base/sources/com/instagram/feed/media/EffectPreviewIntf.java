package com.instagram.feed.media;

import X.C73183Xxj;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.AttributionUser;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.shopping.EffectThumbnailImageDictIntf;

/* loaded from: classes2.dex */
public interface EffectPreviewIntf extends Parcelable {
    public static final C73183Xxj A00 = C73183Xxj.A00;

    AttributionUser AdP();

    String AxJ();

    EffectActionSheetIntf B0O();

    ImageUrl BEx();

    EffectThumbnailImageDictIntf C84();

    Boolean CPi();

    EffectPreview F4a();

    TreeUpdaterJNI F7o();

    String getEffectId();

    String getFailureCode();

    String getFailureReason();

    String getFormattedClipsMediaCount();

    String getId();

    String getName();

    String getSaveStatus();

    String getTitle();
}
