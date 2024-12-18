package com.facebook.cameracore.mediapipeline.services.experimentconfig.interfaces;

import com.facebook.jni.HybridData;

/* loaded from: classes4.dex */
public abstract class ARExperimentConfig {
    public HybridData mHybridData;

    public abstract boolean getBool(int i, boolean z);

    public abstract boolean getBoolWithoutLogging(int i, boolean z);

    public abstract double getDouble(int i, double d);

    public abstract long getLong(int i, long j);

    public abstract String getString(int i, String str);
}
