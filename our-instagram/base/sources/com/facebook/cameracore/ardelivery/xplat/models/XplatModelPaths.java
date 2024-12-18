package com.facebook.cameracore.ardelivery.xplat.models;

import X.C14360o3;
import X.C1825788b;
import com.facebook.cameracore.ardelivery.model.ModelPathsHolder;
import com.facebook.cameracore.ardelivery.model.VersionedCapability;

/* loaded from: classes4.dex */
public final class XplatModelPaths {
    public final C1825788b aRModelPaths = new C1825788b();

    public final void setSparkVisionModelPath(String str, String str2) {
        C14360o3.A0B(str, 0);
        C14360o3.A0B(str2, 1);
        this.aRModelPaths.A01.put(str, str2);
    }

    public final C1825788b getARModelPaths() {
        return this.aRModelPaths;
    }

    public final void setModelPaths(int i, ModelPathsHolder modelPathsHolder) {
        VersionedCapability fromXplatValue = VersionedCapability.fromXplatValue(i);
        if (fromXplatValue != null) {
            C1825788b c1825788b = this.aRModelPaths;
            if (modelPathsHolder != null) {
                c1825788b.A00.put(fromXplatValue, modelPathsHolder);
            }
        }
    }
}
