package com.facebook.cameracore.ardelivery.effectmetadatamanager.models;

import X.C00O;
import java.util.List;

/* loaded from: classes12.dex */
public abstract class EffectMetadataCompletionCallback {
    public abstract void onFail(String str);

    public abstract void onSuccess(List list);

    public EffectMetadataCompletionCallback() {
        throw C00O.createAndThrow();
    }
}
