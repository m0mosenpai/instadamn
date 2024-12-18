package X;

import android.content.Context;
import com.facebook.rsys.camera.gen.Camera;
import com.facebook.rsys.camera.gen.CameraApi;
import java.util.ArrayList;
import org.webrtc.EglBase;
import org.webrtc.SurfaceTextureHelper;

/* renamed from: X.9pm, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C221239pm extends AbstractC52007Mz4 {
    public CameraApi A00;
    public SurfaceTextureHelper A02;
    public final InterfaceC174767qC A03;
    public final O6B A04;
    public final EglBase.Context A05;
    public final Context A06;
    public String A01 = Camera.FRONT_FACING_CAMERA.identifier;
    public final AbstractC184688Hj A07 = new C212659bY(this, 12);

    @Override // X.AbstractC52007Mz4
    public final boolean isSwitchCameraFacingSupported() {
        return true;
    }

    @Override // com.facebook.rsys.camera.gen.CameraProxy
    public final void setApi(CameraApi cameraApi) {
        C14360o3.A0B(cameraApi, 0);
        this.A00 = cameraApi;
    }

    @Override // com.facebook.rsys.camera.gen.CameraProxy
    public final void setCameraMode(int i) {
    }

    @Override // com.facebook.rsys.camera.gen.CameraProxy
    public final void setTargetCaptureResolution(int i, int i2) {
    }

    @Override // com.facebook.rsys.camera.gen.CameraProxy
    public final int setTargetCaptureSettings(int i, int i2, int i3) {
        return 0;
    }

    @Override // com.facebook.rsys.camera.gen.CameraProxy
    public final void setTargetFps(int i) {
    }

    @Override // com.facebook.rsys.camera.gen.CameraProxy
    public final ArrayList createAvailableCameras() {
        return C23095AGf.A00.A00(this.A06);
    }

    @Override // X.AbstractC52007Mz4
    public final CameraApi getApi() {
        CameraApi cameraApi = this.A00;
        if (cameraApi != null) {
            return cameraApi;
        }
        throw AbstractC166987dD.A14(MSV.A00(118));
    }

    @Override // X.AbstractC52007Mz4
    public final boolean isCameraCurrentlyFacingFront() {
        return C14360o3.A0K(this.A01, Camera.FRONT_FACING_CAMERA.identifier);
    }

    @Override // com.facebook.rsys.camera.gen.CameraProxy
    public final void release() {
        SurfaceTextureHelper surfaceTextureHelper = this.A02;
        if (surfaceTextureHelper != null) {
            this.A03.disconnect();
            surfaceTextureHelper.dispose();
            this.A02 = null;
        }
    }

    @Override // com.facebook.rsys.camera.gen.CameraProxy
    public final void setCamera(Camera camera) {
        if (camera != null && !C14360o3.A0K(camera.identifier, this.A01)) {
            this.A03.Epe(this.A07);
            this.A01 = camera.identifier;
        }
    }

    @Override // com.facebook.rsys.camera.gen.CameraProxy
    public final void setCameraOn(boolean z, int i) {
        if (z) {
            CameraApi cameraApi = this.A00;
            if (cameraApi != null) {
                cameraApi.setCameraState(1);
            }
            SurfaceTextureHelper surfaceTextureHelper = this.A02;
            if (surfaceTextureHelper == null) {
                surfaceTextureHelper = SurfaceTextureHelper.create("rsys_live_camera_capture", this.A05);
                C14360o3.A07(surfaceTextureHelper);
            }
            this.A02 = surfaceTextureHelper;
            surfaceTextureHelper.stopListening();
            surfaceTextureHelper.setTextureSize(405, 720);
            surfaceTextureHelper.startListening(new C57125PVw(this));
            O6B o6b = this.A04;
            C24187AoA c24187AoA = new C24187AoA(surfaceTextureHelper.surfaceTexture);
            if (PJF.A0K != null) {
                o6b.A00.A01 = c24187AoA;
                return;
            }
            AbstractC70118W4q abstractC70118W4q = PJF.A0L;
            if (abstractC70118W4q == null) {
                return;
            }
            abstractC70118W4q.A04(AbstractC166987dD.A1J(c24187AoA));
            return;
        }
        this.A03.Eod(null);
        SurfaceTextureHelper surfaceTextureHelper2 = this.A02;
        if (surfaceTextureHelper2 != null) {
            surfaceTextureHelper2.stopListening();
        }
        CameraApi cameraApi2 = this.A00;
        if (cameraApi2 == null) {
            return;
        }
        cameraApi2.setCameraState(0);
    }

    public C221239pm(Context context, InterfaceC174767qC interfaceC174767qC, O6B o6b, EglBase.Context context2) {
        this.A06 = context;
        this.A03 = interfaceC174767qC;
        this.A04 = o6b;
        this.A05 = context2;
    }
}
