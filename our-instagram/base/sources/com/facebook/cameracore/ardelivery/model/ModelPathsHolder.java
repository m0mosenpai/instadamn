package com.facebook.cameracore.ardelivery.model;

import X.C0K8;
import X.EnumC1825988f;
import com.facebook.common.stringformat.StringFormatUtil;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public class ModelPathsHolder {
    public static final String TAG = "ModelPathsHolder";
    public static final int UNKNOWN_VERSION = -1;
    public final VersionedCapability mCapability;
    public final Map mModelPaths;
    public final int mVersion;

    public static ModelPathsHolder create(int i, int i2, int[] iArr, String[] strArr) {
        HashMap hashMap = new HashMap();
        for (int i3 = 0; i3 < iArr.length; i3++) {
            hashMap.put(EnumC1825988f.values()[iArr[i3]], strArr[i3]);
        }
        return new ModelPathsHolder(VersionedCapability.fromXplatValue(i), i2, hashMap);
    }

    public VersionedCapability getCapability() {
        return this.mCapability;
    }

    public String getModelPath(EnumC1825988f enumC1825988f) {
        String str = (String) this.mModelPaths.get(enumC1825988f);
        if (str == null) {
            C0K8.A0E(TAG, StringFormatUtil.formatStrLocaleSafe("Failed to get model path for model asset type: %s, for capability: %s", enumC1825988f.name(), this.mCapability.name()));
        }
        return str;
    }

    public int getVersion() {
        return this.mVersion;
    }

    public boolean modelPathsExists(EnumC1825988f enumC1825988f) {
        return this.mModelPaths.containsKey(enumC1825988f);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ModelPathsHolder{mCapability=");
        sb.append(this.mCapability);
        sb.append(", mVersion=");
        sb.append(this.mVersion);
        sb.append(", mModelPaths=");
        sb.append(this.mModelPaths);
        sb.append('}');
        return sb.toString();
    }

    public ModelPathsHolder(VersionedCapability versionedCapability, int i, Map map) {
        this.mCapability = versionedCapability;
        this.mVersion = i;
        this.mModelPaths = map;
    }
}
