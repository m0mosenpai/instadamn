package com.facebook.cameracore.mediapipeline.engine.provider.ig4a;

import X.C09170dP;
import X.C224819w6;
import android.content.Context;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.PluginConfigProvider;
import com.facebook.jni.HybridData;

/* loaded from: classes4.dex */
public final class IgPluginConfigProvider extends PluginConfigProvider {
    public static final C224819w6 Companion = new Object();

    public static final native HybridData initHybrid(Context context);

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.9w6] */
    static {
        C09170dP.A0C("graphicsengine-ig4a-native");
    }
}
