package X;

import com.facebook.rsys.camera.gen.CameraApi;
import com.instagram.rtc.rsys.camera.IgLiteCameraProxy;

/* renamed from: X.Omg, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55600Omg implements BDZ {
    public final /* synthetic */ IgLiteCameraProxy A00;

    @Override // X.BDZ
    public final void D1S(Exception exc) {
        C14360o3.A0B(exc, 0);
        OXE.A00.A02("IgLiteCameraProxy", "onCameraError", exc);
        EnumC53332NiC enumC53332NiC = EnumC53332NiC.A09;
        IgLiteCameraProxy igLiteCameraProxy = this.A00;
        OXh.A01(enumC53332NiC, AbstractC28057CYl.A01(igLiteCameraProxy.A0C), null, null, null);
        String message = exc.getMessage();
        if (message == null) {
            message = "onCameraError : null message";
        }
        CameraApi cameraApi = igLiteCameraProxy.A05;
        if (cameraApi != null) {
            cameraApi.handleCameraEviction(message);
        }
    }

    public C55600Omg(IgLiteCameraProxy igLiteCameraProxy) {
        this.A00 = igLiteCameraProxy;
    }

    @Override // X.BDZ
    public final void D1W() {
        Integer num;
        OXE.A00.A00("IgLiteCameraProxy", "onCameraInitialised");
        IgLiteCameraProxy igLiteCameraProxy = this.A00;
        CameraApi cameraApi = igLiteCameraProxy.A05;
        if (cameraApi != null) {
            cameraApi.setCameraState(2);
        }
        if (igLiteCameraProxy.A0H && (num = igLiteCameraProxy.A07) != null) {
            IgLiteCameraProxy.A03(igLiteCameraProxy, num.intValue());
            igLiteCameraProxy.A07 = null;
        }
    }

    @Override // X.BDZ
    public final void D1b() {
        OXE.A00.A00("IgLiteCameraProxy", "onCameraSwitched");
        IgLiteCameraProxy.A00(this.A00);
    }

    @Override // X.BDZ
    public final void D1X(String str, String str2) {
        AbstractC167017dG.A1N(str, str2);
        OXE.A00.A00("IgLiteCameraProxy", AnonymousClass001.A0u("onCameraLocallyEvicted from: ", str, " to ", str2));
        CameraApi cameraApi = this.A00.A05;
        if (cameraApi != null) {
            cameraApi.handleCameraEviction(str2);
        }
    }
}
