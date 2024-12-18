package com.facebook.cameracore.ardelivery.effectmetadatamanager.models;

import X.C00O;

/* loaded from: classes11.dex */
public abstract class EffectAssetMetadataCompletionCallback {
    public abstract void onFail(String str);

    public abstract void onSuccess(EffectAssetMetadata effectAssetMetadata);

    public EffectAssetMetadataCompletionCallback() {
        throw C00O.createAndThrow();
    }
}
