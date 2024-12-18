package com.instagram.clips.model.metadata;

import X.C73163XxO;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.ContextualHighlightType;

/* loaded from: classes2.dex */
public interface ClipsContextualHighlightInfoIntf extends Parcelable {
    public static final C73163XxO A00 = C73163XxO.A00;

    ContextualHighlightType ArX();

    ClipsContextualHighlightInfo F4F();

    TreeUpdaterJNI F7o();

    String getChainingMediaId();

    String getContextualHighlightId();

    String getContextualHighlightTitle();
}
