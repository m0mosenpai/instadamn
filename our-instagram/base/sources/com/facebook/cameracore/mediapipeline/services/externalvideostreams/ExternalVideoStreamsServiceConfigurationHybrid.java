package com.facebook.cameracore.mediapipeline.services.externalvideostreams;

import X.C9Xz;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ServiceConfiguration;
import com.facebook.cameracore.mediapipeline.services.externalvideostreamsdelegate.ExternalVideoStreamsDelegateManager;
import com.facebook.jni.HybridData;

/* loaded from: classes4.dex */
public abstract class ExternalVideoStreamsServiceConfigurationHybrid extends ServiceConfiguration {
    public final C9Xz serviceConfiguration;

    public static final native HybridData initHybrid(ExternalVideoStreamsDelegateManager externalVideoStreamsDelegateManager);
}
