package com.facebook.cameracore.ardelivery.modelcache.versionedmodelcache;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.C09170dP;
import com.facebook.cameracore.ardelivery.model.ModelPathsHolder;
import com.facebook.cameracore.ardelivery.model.VersionedCapability;
import com.facebook.cameracore.ardelivery.xplatcache.ARDFileCache;
import com.facebook.jni.HybridData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public class VersionedModelCache {
    public final HybridData mHybridData;

    private native boolean addModelForVersionIfInCache(int i, int i2, String str, String str2);

    private native ModelPathsHolder getModelPathsHolder(int i, int i2);

    public static native HybridData initHybrid(ARDFileCache aRDFileCache, List list);

    public native ModelPathsHolder getModelPathsHolderForLastSavedVersion(int i);

    public native void trimExceptLatestSavedVersion(int i);

    static {
        C09170dP.A0C("versioned-model-cache-native-android");
    }

    public VersionedModelCache(ARDFileCache aRDFileCache, List list) {
        ArrayList A1E = AbstractC166987dD.A1E();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC166997dE.A1W(A1E, ((VersionedCapability) it.next()).getXplatValue());
        }
        this.mHybridData = initHybrid(aRDFileCache, A1E);
    }

    public boolean addModelForVersionIfInCache(int i, String str, String str2, VersionedCapability versionedCapability) {
        versionedCapability.getClass();
        int xplatValue = versionedCapability.getXplatValue();
        Integer.valueOf(xplatValue).getClass();
        return addModelForVersionIfInCache(xplatValue, i, str, str2);
    }

    public ModelPathsHolder getModelPathsHolder(VersionedCapability versionedCapability, int i) {
        versionedCapability.getClass();
        return getModelPathsHolder(versionedCapability.getXplatValue(), i);
    }

    public ModelPathsHolder getModelPathsHolderForLastSavedVersion(VersionedCapability versionedCapability) {
        return getModelPathsHolderForLastSavedVersion(versionedCapability.getXplatValue());
    }

    public void trimExceptLatestSavedVersion(VersionedCapability versionedCapability) {
        versionedCapability.getClass();
        trimExceptLatestSavedVersion(versionedCapability.getXplatValue());
    }
}
