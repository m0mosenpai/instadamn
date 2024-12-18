package com.facebook.cameracore.litecamera.mediapipeline.iglu.insights;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC167017dG;
import X.AnonymousClass251;
import X.C09170dP;
import X.C14360o3;
import X.C224649vp;
import X.C22F;
import X.C22M;
import X.InterfaceC02590Ai;
import com.facebook.jni.HybridData;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;

/* loaded from: classes4.dex */
public final class GPUInsights {
    public static final C224649vp Companion = new Object();
    public AnonymousClass251 gpuEventLogger;
    public final HybridData mHybridData = initHybrid();

    public static /* synthetic */ void getMHybridData$annotations() {
    }

    public static final native HybridData initHybrid();

    public final native void clearGPUError();

    public final native int getAllocatedTextureBytes();

    public final native int getAllocatedTextureCount();

    public final native String getGPUError();

    public final void logExistingEvents(String str) {
        C14360o3.A0B(str, 0);
        String gPUError = getGPUError();
        Object obj = this.gpuEventLogger;
        if (obj != null) {
            C22F c22f = (C22F) obj;
            C14360o3.A0B(gPUError, 0);
            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c22f.A01, "ig_camera_iglu_gpu");
            if (A0f.isSampled()) {
                C22M c22m = c22f.A04;
                String str2 = c22m.A0L;
                if (str2 == null) {
                    str2 = "";
                }
                AbstractC166987dD.A1S(A0f, str2);
                A0f.A8R(c22m.A09, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
                AbstractC166997dE.A1N(A0f, "event_type", 2);
                AbstractC167017dG.A1B(A0f);
                AbstractC167007dF.A10(A0f, c22f);
                A0f.A8R(c22m.A0C, "surface");
                A0f.AAP("gpu_error", gPUError);
                A0f.AAP("gpu_style", "GLES");
                A0f.AAP("gpu_usage", str);
                A0f.A9K("count", 1L);
                A0f.Cht();
            }
        }
    }

    public final native String makeAndHoldATexture(int i, boolean z);

    public final native void triggerGPUError(int i);

    /* JADX WARN: Type inference failed for: r0v0, types: [X.9vp, java.lang.Object] */
    static {
        C09170dP.A0C("mediapipeline-iglufilter-insights");
    }

    public final void setGpuLogger(AnonymousClass251 anonymousClass251) {
        this.gpuEventLogger = anonymousClass251;
    }
}
