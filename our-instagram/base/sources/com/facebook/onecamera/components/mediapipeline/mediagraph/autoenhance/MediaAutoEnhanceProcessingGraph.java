package com.facebook.onecamera.components.mediapipeline.mediagraph.autoenhance;

import X.AbstractC167017dG;
import X.C09170dP;
import X.C39712Hji;
import X.EnumC39553HdP;
import X.EnumC53168NfP;
import com.facebook.compphoto.sdk.pipeline.graphs.common.autoenhanceinfo.AutoEnhanceInfo;
import com.facebook.jni.HybridData;

/* loaded from: classes7.dex */
public final class MediaAutoEnhanceProcessingGraph {
    public static final C39712Hji Companion = new Object();
    public static boolean didNativeLibraryLoaded;
    public static String errorMessage;
    public HybridData mHybridData;

    public static /* synthetic */ void getMHybridData$annotations() {
    }

    private final native HybridData initHybrid(int i, int i2);

    public final native void analyze(int i, int i2, int i3, AutoEnhanceInfo autoEnhanceInfo);

    public final native AutoEnhanceInfo getAutoEnhanceInfo();

    public final native void render(int i, int i2, int i3, int i4, int i5, int i6, AutoEnhanceInfo autoEnhanceInfo);

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.Hji] */
    static {
        boolean z;
        errorMessage = "";
        try {
            C09170dP.A0C("onecamera-autoenhance-native-android");
            z = true;
        } catch (Exception e) {
            errorMessage = String.valueOf(e.getMessage());
            z = false;
        }
        didNativeLibraryLoaded = z;
    }

    public MediaAutoEnhanceProcessingGraph(EnumC39553HdP enumC39553HdP, EnumC53168NfP enumC53168NfP) {
        AbstractC167017dG.A1P(enumC39553HdP, enumC53168NfP);
        if (didNativeLibraryLoaded) {
            this.mHybridData = initHybrid(enumC39553HdP.ordinal(), enumC53168NfP.ordinal());
        }
    }
}
