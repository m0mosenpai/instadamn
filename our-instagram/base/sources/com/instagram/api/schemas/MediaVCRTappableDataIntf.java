package com.instagram.api.schemas;

import X.AF6;
import X.C1DV;
import X.C1DY;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.user.model.User;

/* loaded from: classes4.dex */
public interface MediaVCRTappableDataIntf extends Parcelable {
    public static final AF6 A00 = AF6.A00;

    Float B29();

    User BZm();

    String BZs();

    Float Bzq();

    MediaVCRTappableDataIntf E9F(C1DY c1dy);

    MediaVCRTappableData EwX(C1DY c1dy);

    MediaVCRTappableData EwY(C1DV c1dv);

    TreeUpdaterJNI F7o();

    boolean getCanViewerLinkBackToOriginalMediaFromVcr();

    String getEndBackgroundColor();

    String getOriginalCommentId();

    String getOriginalCommentText();

    String getOriginalMediaId();

    String getStartBackgroundColor();

    String getTextColor();
}
