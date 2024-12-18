package X;

import android.content.Context;
import com.facebook.cameracore.mediapipeline.arengineservices.igsandboxeffectservicehost.IgSandboxEffectServiceHost;

/* renamed from: X.AAe, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C22960AAe {
    public final synchronized void A00(Context context) {
        if (!IgSandboxEffectServiceHost.isLibraryLoaded) {
            if (!AbstractC14490oL.A0C(context)) {
                try {
                    C09170dP.A0D("caffe2_ig_ops", 16);
                } catch (UnsatisfiedLinkError e) {
                    C0K8.A0F("IgSandboxEffectServiceHost", "caffe2 ops lib soloader load error: ", e);
                }
            }
            C09170dP.A0C("graphicsengine-arengineservices-igsandboxeffectservicehost-native");
            IgSandboxEffectServiceHost.isLibraryLoaded = true;
        }
    }
}
