package X;

import com.facebook.rsys.camera.gen.Camera;
import com.facebook.rsys.camera.gen.CameraApi;
import com.facebook.rsys.camera.gen.CameraProxy;
import java.util.ArrayList;

/* loaded from: classes9.dex */
public final class NU7 extends AbstractC52007Mz4 {
    public CameraApi A00;
    public final CameraProxy A01;

    @Override // X.AbstractC52007Mz4
    public final boolean isCameraCurrentlyFacingFront() {
        return false;
    }

    @Override // X.AbstractC52007Mz4
    public final boolean isSwitchCameraFacingSupported() {
        return false;
    }

    @Override // com.facebook.rsys.camera.gen.CameraProxy
    public final void setApi(CameraApi cameraApi) {
        C14360o3.A0B(cameraApi, 0);
        this.A00 = cameraApi;
        this.A01.setApi(cameraApi);
    }

    @Override // com.facebook.rsys.camera.gen.CameraProxy
    public final ArrayList createAvailableCameras() {
        ArrayList createAvailableCameras = this.A01.createAvailableCameras();
        C14360o3.A07(createAvailableCameras);
        return createAvailableCameras;
    }

    @Override // X.AbstractC52007Mz4
    public final CameraApi getApi() {
        CameraApi cameraApi = this.A00;
        if (cameraApi != null) {
            return cameraApi;
        }
        throw AbstractC166987dD.A14("setApi must be called");
    }

    @Override // com.facebook.rsys.camera.gen.CameraProxy
    public final void release() {
        this.A01.release();
    }

    @Override // com.facebook.rsys.camera.gen.CameraProxy
    public final void setCamera(Camera camera) {
        this.A01.setCamera(camera);
    }

    @Override // com.facebook.rsys.camera.gen.CameraProxy
    public final void setCameraMode(int i) {
        this.A01.setCameraMode(i);
    }

    @Override // com.facebook.rsys.camera.gen.CameraProxy
    public final void setCameraOn(boolean z, int i) {
        this.A01.setCameraOn(z, i);
    }

    @Override // com.facebook.rsys.camera.gen.CameraProxy
    public final void setTargetCaptureResolution(int i, int i2) {
        this.A01.setTargetCaptureResolution(i, i2);
    }

    @Override // com.facebook.rsys.camera.gen.CameraProxy
    public final int setTargetCaptureSettings(int i, int i2, int i3) {
        return this.A01.setTargetCaptureSettings(i, i2, i3);
    }

    @Override // com.facebook.rsys.camera.gen.CameraProxy
    public final void setTargetFps(int i) {
        this.A01.setTargetFps(i);
    }

    public NU7(CameraProxy cameraProxy) {
        this.A01 = cameraProxy;
    }
}
