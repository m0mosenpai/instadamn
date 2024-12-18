package com.facebook.cameracore.camerasdk.optic.arcore;

import X.C177047u0;
import X.C73402YBo;
import X.InterfaceC176367st;
import X.InterfaceC177197uF;
import X.InterfaceC73604YNj;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.view.Surface;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes4.dex */
public class PreviewSetupDelegateImpl implements InterfaceC176367st {
    public int A00;
    public final Context A01;
    public final boolean A02;
    public volatile InterfaceC176367st A03;
    public volatile HashMap A04;
    public volatile boolean A05;

    public PreviewSetupDelegateImpl(Context context) {
        this(context, false, false);
    }

    @Override // X.InterfaceC176367st
    public final synchronized boolean CPI() {
        boolean z;
        z = false;
        if (this.A00 == 0) {
            z = true;
        }
        return z;
    }

    @Override // X.InterfaceC176367st
    public synchronized void closeSession() {
        InterfaceC176367st interfaceC176367st = this.A03;
        if (interfaceC176367st != null) {
            interfaceC176367st.closeSession();
            this.A03 = null;
        }
    }

    @Override // X.InterfaceC176367st
    public synchronized void createSession(CameraDevice cameraDevice, int i) {
        this.A00 = i;
        A00().createSession(cameraDevice, i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x000a, code lost:
    
        if (CPI() == false) goto L7;
     */
    @Override // X.InterfaceC176367st
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized boolean isARCoreEnabled() {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.A05     // Catch: java.lang.Throwable -> Lf
            if (r0 == 0) goto Lc
            boolean r1 = r2.CPI()     // Catch: java.lang.Throwable -> Lf
            r0 = 1
            if (r1 != 0) goto Ld
        Lc:
            r0 = 0
        Ld:
            monitor-exit(r2)
            return r0
        Lf:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.cameracore.camerasdk.optic.arcore.PreviewSetupDelegateImpl.isARCoreEnabled():boolean");
    }

    @Override // X.InterfaceC176367st
    public boolean isARCoreSupported() {
        return true;
    }

    @Override // X.InterfaceC176367st
    public synchronized void setUseArCoreIfSupported(boolean z) {
        this.A05 = z;
    }

    private InterfaceC176367st A00() {
        InterfaceC176367st interfaceC176367st;
        InterfaceC176367st interfaceC176367st2 = this.A03;
        if (interfaceC176367st2 == null) {
            synchronized (this) {
                interfaceC176367st = this.A03;
                if (interfaceC176367st == null) {
                    if (isARCoreEnabled()) {
                        interfaceC176367st = new C73402YBo(this.A01, this.A02);
                    } else {
                        interfaceC176367st = InterfaceC176367st.A01;
                    }
                    HashMap hashMap = this.A04;
                    if (hashMap != null) {
                        interfaceC176367st.EPo(hashMap);
                    }
                    this.A03 = interfaceC176367st;
                }
            }
            return interfaceC176367st;
        }
        return interfaceC176367st2;
    }

    @Override // X.InterfaceC176367st
    public final void EPo(HashMap hashMap) {
        this.A04 = new HashMap(hashMap);
    }

    @Override // X.InterfaceC176367st
    public boolean getUseArCoreIfSupported() {
        return this.A05;
    }

    @Override // X.InterfaceC176367st
    public void onCameraClosed(CameraDevice cameraDevice) {
        if (this.A03 != null) {
            A00().onCameraClosed(cameraDevice);
        }
    }

    @Override // X.InterfaceC176367st
    public List addArSurfaces(List list) {
        return A00().addArSurfaces(list);
    }

    @Override // X.InterfaceC176367st
    public SurfaceTexture getArSurfaceTexture(int i, InterfaceC73604YNj interfaceC73604YNj) {
        return A00().getArSurfaceTexture(i, interfaceC73604YNj);
    }

    @Override // X.InterfaceC176367st
    public List getArSurfaces() {
        return A00().getArSurfaces();
    }

    @Override // X.InterfaceC176367st
    public long getFrameTimestamp() {
        return A00().getFrameTimestamp();
    }

    @Override // X.InterfaceC176367st
    public Surface getPreviewSurface(SurfaceTexture surfaceTexture) {
        return A00().getPreviewSurface(surfaceTexture);
    }

    @Override // X.InterfaceC176367st
    public int getPreviewTemplate() {
        return A00().getPreviewTemplate();
    }

    @Override // X.InterfaceC176367st
    public boolean isCameraSessionActivated() {
        return A00().isCameraSessionActivated();
    }

    @Override // X.InterfaceC176367st
    public void onCameraDisconnected(CameraDevice cameraDevice) {
        A00().onCameraDisconnected(cameraDevice);
    }

    @Override // X.InterfaceC176367st
    public void onCameraError(CameraDevice cameraDevice, int i) {
        A00().onCameraError(cameraDevice, i);
    }

    @Override // X.InterfaceC176367st
    public void setCameraSessionActivated(InterfaceC177197uF interfaceC177197uF, C177047u0 c177047u0) {
        A00().setCameraSessionActivated(interfaceC177197uF, c177047u0);
    }

    @Override // X.InterfaceC176367st
    public void update() {
        A00().update();
    }

    @Override // X.InterfaceC176367st
    public CameraCaptureSession.StateCallback wrapSessionConfigurationCallback(CameraCaptureSession.StateCallback stateCallback) {
        return A00().wrapSessionConfigurationCallback(stateCallback);
    }

    public PreviewSetupDelegateImpl(Context context, boolean z, boolean z2) {
        this.A01 = context.getApplicationContext();
        this.A05 = z;
        this.A02 = z2;
    }
}
