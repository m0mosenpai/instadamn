package X;

import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.view.Surface;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.7st, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC176367st {
    public static final C176377su A00 = new Object();
    public static final InterfaceC176367st A01 = new InterfaceC176367st() { // from class: X.7sv
        @Override // X.InterfaceC176367st
        public final /* synthetic */ void EPo(HashMap hashMap) {
        }

        @Override // X.InterfaceC176367st
        public final /* synthetic */ List addArSurfaces(List list) {
            return list;
        }

        @Override // X.InterfaceC176367st
        public final /* synthetic */ void closeSession() {
        }

        @Override // X.InterfaceC176367st
        public final /* synthetic */ void createSession(CameraDevice cameraDevice, int i) {
        }

        @Override // X.InterfaceC176367st
        public final /* synthetic */ void onCameraClosed(CameraDevice cameraDevice) {
        }

        @Override // X.InterfaceC176367st
        public final /* synthetic */ void onCameraDisconnected(CameraDevice cameraDevice) {
        }

        @Override // X.InterfaceC176367st
        public final /* synthetic */ void onCameraError(CameraDevice cameraDevice, int i) {
        }

        @Override // X.InterfaceC176367st
        public final /* synthetic */ void setCameraSessionActivated(InterfaceC177197uF interfaceC177197uF, C177047u0 c177047u0) {
        }

        @Override // X.InterfaceC176367st
        public final /* synthetic */ void setUseArCoreIfSupported(boolean z) {
        }

        @Override // X.InterfaceC176367st
        public final /* synthetic */ void update() {
        }

        @Override // X.InterfaceC176367st
        public final /* synthetic */ CameraCaptureSession.StateCallback wrapSessionConfigurationCallback(CameraCaptureSession.StateCallback stateCallback) {
            return stateCallback;
        }

        @Override // X.InterfaceC176367st
        public final /* synthetic */ boolean CPI() {
            return false;
        }

        @Override // X.InterfaceC176367st
        public final /* synthetic */ long getFrameTimestamp() {
            return 0L;
        }

        @Override // X.InterfaceC176367st
        public final /* synthetic */ Surface getPreviewSurface(SurfaceTexture surfaceTexture) {
            return new Surface(surfaceTexture);
        }

        @Override // X.InterfaceC176367st
        public final /* synthetic */ int getPreviewTemplate() {
            return 1;
        }

        @Override // X.InterfaceC176367st
        public final /* synthetic */ boolean getUseArCoreIfSupported() {
            return false;
        }

        @Override // X.InterfaceC176367st
        public final /* synthetic */ boolean isARCoreEnabled() {
            return false;
        }

        @Override // X.InterfaceC176367st
        public final /* synthetic */ boolean isARCoreSupported() {
            return false;
        }

        @Override // X.InterfaceC176367st
        public final /* synthetic */ boolean isCameraSessionActivated() {
            return false;
        }

        @Override // X.InterfaceC176367st
        public final /* synthetic */ List getArSurfaces() {
            return Collections.emptyList();
        }

        @Override // X.InterfaceC176367st
        public final /* synthetic */ SurfaceTexture getArSurfaceTexture(int i, InterfaceC73604YNj interfaceC73604YNj) {
            return null;
        }
    };

    boolean CPI();

    void EPo(HashMap hashMap);

    List addArSurfaces(List list);

    void closeSession();

    void createSession(CameraDevice cameraDevice, int i);

    SurfaceTexture getArSurfaceTexture(int i, InterfaceC73604YNj interfaceC73604YNj);

    List getArSurfaces();

    long getFrameTimestamp();

    Surface getPreviewSurface(SurfaceTexture surfaceTexture);

    int getPreviewTemplate();

    boolean getUseArCoreIfSupported();

    boolean isARCoreEnabled();

    boolean isARCoreSupported();

    boolean isCameraSessionActivated();

    void onCameraClosed(CameraDevice cameraDevice);

    void onCameraDisconnected(CameraDevice cameraDevice);

    void onCameraError(CameraDevice cameraDevice, int i);

    void setCameraSessionActivated(InterfaceC177197uF interfaceC177197uF, C177047u0 c177047u0);

    void setUseArCoreIfSupported(boolean z);

    void update();

    CameraCaptureSession.StateCallback wrapSessionConfigurationCallback(CameraCaptureSession.StateCallback stateCallback);
}
