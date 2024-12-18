package X;

import com.facebook.rsys.camera.gen.CameraApi;
import com.facebook.rsys.camera.gen.CameraProxy;

/* renamed from: X.Mz4, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC52007Mz4 extends CameraProxy {
    public abstract CameraApi getApi();

    public abstract boolean isCameraCurrentlyFacingFront();

    public abstract boolean isSwitchCameraFacingSupported();

    public void blankOutAndDisableCamera() {
        getApi().enableCamera(false);
    }
}
