package X;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Handler;
import android.view.Display;
import android.view.Surface;
import android.view.WindowManager;
import com.facebook.cameracore.mediapipeline.dataproviders.worldtracker.interfaces.ARTrackableDelegate;
import com.facebook.onecamera.components.arcore.alwayson.recording.interfaces.PlatformAlgorithmAlwaysOnDataSource;
import com.google.ar.core.Camera;
import com.google.ar.core.CameraConfig;
import com.google.ar.core.CameraConfigFilter;
import com.google.ar.core.Config;
import com.google.ar.core.Frame;
import com.google.ar.core.Session;
import com.google.ar.core.SharedCamera;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.YBo, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C73402YBo implements InterfaceC176367st {
    public SurfaceTexture A00;
    public Handler A01;
    public InterfaceC73604YNj A02;
    public SharedCamera A03;
    public CameraDevice.StateCallback A04;
    public CameraDevice A05;
    public YOi A06;
    public final Context A07;
    public final C72747XmO A08;
    public final Runnable A09;
    public final Handler A0A;
    public final A4W A0B;
    public final InterfaceC175107qk A0E;
    public final InterfaceC175127qm A0F;
    public volatile EnumC72369Xc5 A0G;
    public volatile Session A0H;
    public volatile Integer A0I;
    public volatile Integer A0J;
    public volatile boolean A0K;
    public volatile int A0L;
    public final C175727rm A0C = AbstractC175717rl.A00;
    public final ARTrackableDelegate A0D = new ARTrackableDelegate();
    public volatile Frame A0M = null;

    @Override // X.InterfaceC176367st
    public final boolean CPI() {
        return true;
    }

    @Override // X.InterfaceC176367st
    public final synchronized List addArSurfaces(List list) {
        ArrayList A1F;
        this.A03.getClass();
        this.A05.getClass();
        this.A03.A0D(this.A05.getId(), list);
        A1F = AbstractC166987dD.A1F(list);
        Iterator it = this.A03.A0B().iterator();
        while (it.hasNext()) {
            Surface surface = (Surface) it.next();
            if (!A1F.contains(surface)) {
                A1F.add(surface);
            }
        }
        return A1F;
    }

    @Override // X.InterfaceC176367st
    public final synchronized void closeSession() {
        InterfaceC175687ri interfaceC175687ri;
        CameraDevice cameraDevice;
        if (this.A0H != null) {
            this.A0K = false;
            CameraDevice.StateCallback stateCallback = this.A04;
            if (stateCallback != null && (cameraDevice = this.A05) != null) {
                stateCallback.onClosed(cameraDevice);
            }
            C72670Xkl c72670Xkl = new C72670Xkl();
            c72670Xkl.A00.put(XkQ.A00, true);
            PlatformAlgorithmAlwaysOnDataSource AbV = this.A06.AbV();
            if (AbV != null) {
                AbV.closeSession();
            }
            WeakReference weakReference = this.A0C.A00;
            if (weakReference != null && (interfaceC175687ri = (InterfaceC175687ri) weakReference.get()) != null) {
                interfaceC175687ri.DIH(c72670Xkl);
            }
            this.A0H.close();
            this.A0H = null;
            this.A03 = null;
            this.A05 = null;
            this.A04 = null;
        }
    }

    @Override // X.InterfaceC176367st
    public final synchronized void createSession(CameraDevice cameraDevice, int i) {
        Session session;
        if (this.A05 != cameraDevice) {
            closeSession();
            this.A05 = cameraDevice;
            try {
                if (i != 1) {
                    session = new Session(this.A07, EnumSet.of(EnumC72368Xc4.SHARED_CAMERA));
                } else {
                    session = new Session(this.A07, EnumSet.of(EnumC72368Xc4.SHARED_CAMERA, EnumC72368Xc4.FRONT_CAMERA));
                }
                this.A0H = session;
                Config config = this.A0H.getConfig();
                config.A03();
                config.A02();
                config.A01();
                config.A05(this.A0I);
                config.A06(this.A0J);
                config.A00();
                Session session2 = this.A0H;
                if (session2.nativeIsDepthModeSupported(session2.nativeWrapperHandle, 1)) {
                    config.A04(this.A0G);
                } else {
                    config.A04(EnumC72369Xc5.DISABLED);
                }
                CameraConfigFilter cameraConfigFilter = new CameraConfigFilter(this.A0H);
                cameraConfigFilter.A00(EnumSet.of(EnumC72366Xc2.TARGET_FPS_30));
                this.A0H.setCameraConfig((CameraConfig) this.A0H.getSupportedCameraConfigs(cameraConfigFilter).get(0));
                this.A0H.configure(config);
                SharedCamera sharedCamera = this.A0H.sharedCamera;
                if (sharedCamera != null) {
                    this.A03 = sharedCamera;
                    XPV xpv = new XPV(new C176737tV(this.A0E, this.A0F), this.A0A, sharedCamera);
                    this.A04 = xpv;
                    xpv.onOpened(cameraDevice);
                } else {
                    throw AbstractC166987dD.A14("Shared camera is not in use, please create session using new Session(context, EnumSet.of(Session.Feature.SHARED_CAMERA)).");
                }
            } catch (RPU | RPV | RPW | RPX e) {
                throw new RuntimeException("Creating ar session failed", e);
            }
        }
    }

    @Override // X.InterfaceC176367st
    public final synchronized SurfaceTexture getArSurfaceTexture(int i, InterfaceC73604YNj interfaceC73604YNj) {
        SurfaceTexture surfaceTexture;
        Session session = this.A0H;
        SharedCamera sharedCamera = this.A03;
        if (session != null && sharedCamera != null) {
            this.A02 = interfaceC73604YNj;
            this.A01 = new Handler();
            session.setCameraTextureName(i);
            surfaceTexture = sharedCamera.A02.A00;
            this.A00 = surfaceTexture;
        } else {
            surfaceTexture = null;
        }
        return surfaceTexture;
    }

    @Override // X.InterfaceC176367st
    public final synchronized List getArSurfaces() {
        ArrayList A1E;
        this.A03.getClass();
        A1E = AbstractC166987dD.A1E();
        Iterator it = this.A03.A0B().iterator();
        while (it.hasNext()) {
            A1E.add((Surface) it.next());
        }
        return A1E;
    }

    @Override // X.InterfaceC176367st
    public final synchronized Surface getPreviewSurface(SurfaceTexture surfaceTexture) {
        this.A03.getClass();
        return (Surface) this.A03.A0B().get(0);
    }

    @Override // X.InterfaceC176367st
    public final int getPreviewTemplate() {
        return 3;
    }

    @Override // X.InterfaceC176367st
    public final boolean getUseArCoreIfSupported() {
        return true;
    }

    @Override // X.InterfaceC176367st
    public final boolean isARCoreEnabled() {
        return true;
    }

    @Override // X.InterfaceC176367st
    public final boolean isARCoreSupported() {
        return true;
    }

    @Override // X.InterfaceC176367st
    public final synchronized boolean isCameraSessionActivated() {
        return this.A0K;
    }

    @Override // X.InterfaceC176367st
    public final synchronized void onCameraClosed(CameraDevice cameraDevice) {
        CameraDevice.StateCallback stateCallback = this.A04;
        if (stateCallback != null) {
            stateCallback.onClosed(cameraDevice);
        }
    }

    @Override // X.InterfaceC176367st
    public final synchronized void onCameraDisconnected(CameraDevice cameraDevice) {
        CameraDevice.StateCallback stateCallback = this.A04;
        if (stateCallback != null) {
            stateCallback.onDisconnected(cameraDevice);
        }
    }

    @Override // X.InterfaceC176367st
    public final synchronized void onCameraError(CameraDevice cameraDevice, int i) {
        CameraDevice.StateCallback stateCallback = this.A04;
        if (stateCallback != null) {
            try {
                stateCallback.onError(cameraDevice, i);
            } catch (RuntimeException unused) {
            }
        }
    }

    @Override // X.InterfaceC176367st
    public final synchronized void setCameraSessionActivated(final InterfaceC177197uF interfaceC177197uF, final C177047u0 c177047u0) {
        if (this.A03 != null && this.A0H != null && !this.A0K) {
            try {
                c177047u0.A00 = this.A0B;
                this.A0H.resume();
                this.A0K = true;
                this.A03.A0C(new CameraCaptureSession.CaptureCallback() { // from class: X.9Sy
                    public final C177427uc A01 = new Object();
                    public final C177437ud A00 = new C177437ud();

                    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
                    public final void onCaptureStarted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j, long j2) {
                        super.onCaptureStarted(cameraCaptureSession, captureRequest, j, j2);
                        c177047u0.D2T(captureRequest, interfaceC177197uF, j, j2);
                    }

                    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
                    public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
                        super.onCaptureCompleted(cameraCaptureSession, captureRequest, totalCaptureResult);
                        C177427uc c177427uc = this.A01;
                        c177427uc.A00 = totalCaptureResult;
                        c177047u0.D2H(interfaceC177197uF, c177427uc);
                    }

                    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
                    public final void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
                        super.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
                        C177437ud c177437ud = this.A00;
                        c177437ud.A00 = captureFailure.getReason();
                        c177047u0.D2L(interfaceC177197uF, c177437ud);
                    }
                }, this.A0A);
            } catch (C61258Rjw e) {
                throw new RuntimeException("Unable to activate ar core, camera closed.", e);
            }
        }
    }

    @Override // X.InterfaceC176367st
    public final void setUseArCoreIfSupported(boolean z) {
    }

    @Override // X.InterfaceC176367st
    public final void update() {
        int[] iArr;
        InterfaceC175687ri interfaceC175687ri;
        WindowManager windowManager;
        Display defaultDisplay;
        try {
            synchronized (this) {
                try {
                    if (this.A0K && this.A0H != null) {
                        Frame update = this.A0H.update();
                        C175727rm c175727rm = this.A0C;
                        WeakReference weakReference = c175727rm.A00;
                        if (weakReference != null && weakReference.get() != null) {
                            long A00 = update.A00();
                            new Camera(update, update.A02);
                            if (A00 != 0) {
                                ARTrackableDelegate aRTrackableDelegate = this.A0D;
                                synchronized (aRTrackableDelegate) {
                                    try {
                                        iArr = aRTrackableDelegate.A00;
                                    } catch (Throwable th) {
                                        throw th;
                                    }
                                }
                                if (iArr != null && (windowManager = (WindowManager) this.A07.getSystemService("window")) != null && (defaultDisplay = windowManager.getDefaultDisplay()) != null && this.A0L != defaultDisplay.getRotation()) {
                                    if (iArr[1] < iArr[0]) {
                                        this.A0H.setDisplayGeometry(defaultDisplay.getRotation(), iArr[1], iArr[0]);
                                    } else {
                                        this.A0H.setDisplayGeometry(defaultDisplay.getRotation(), iArr[0], iArr[1]);
                                    }
                                    this.A0L = defaultDisplay.getRotation();
                                }
                                C72670Xkl c72670Xkl = new C72670Xkl();
                                c72670Xkl.A00.put(XkQ.A01, aRTrackableDelegate);
                                this.A06.run(this.A0H, update, c72670Xkl, this.A08);
                                WeakReference weakReference2 = c175727rm.A00;
                                if (weakReference2 != null && (interfaceC175687ri = (InterfaceC175687ri) weakReference2.get()) != null) {
                                    interfaceC175687ri.DIH(c72670Xkl);
                                }
                                this.A0M = update;
                            }
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } catch (C61258Rjw | C61263RkY | C64856TXh e) {
            C0K8.A0F("ar-session", "failed to update ArCore frames", e);
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [android.hardware.camera2.CameraCaptureSession$StateCallback, X.XPS] */
    @Override // X.InterfaceC176367st
    public final synchronized CameraCaptureSession.StateCallback wrapSessionConfigurationCallback(CameraCaptureSession.StateCallback stateCallback) {
        ?? stateCallback2;
        this.A03.getClass();
        XPT xpt = new XPT(stateCallback, this.A0A, this.A03);
        stateCallback2 = new CameraCaptureSession.StateCallback();
        stateCallback2.A00 = xpt;
        return stateCallback2;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0079  */
    @Override // X.InterfaceC176367st
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void EPo(java.util.HashMap r4) {
        /*
            r3 = this;
            r0 = 910(0x38e, float:1.275E-42)
            java.lang.String r0 = X.AbstractC111324zv.A00(r0)
            java.lang.Object r0 = r4.get(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            if (r0 != 0) goto L12
            java.lang.Boolean r0 = X.AbstractC166997dE.A0a()
        L12:
            boolean r1 = r0.booleanValue()
            r0 = 912(0x390, float:1.278E-42)
            java.lang.String r0 = X.AbstractC111324zv.A00(r0)
            java.lang.Object r0 = r4.get(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            if (r0 != 0) goto L28
            java.lang.Boolean r0 = X.AbstractC166997dE.A0a()
        L28:
            boolean r0 = r0.booleanValue()
            r2 = 1
            if (r1 == 0) goto L7f
            if (r0 == 0) goto L7c
            java.lang.Integer r0 = X.C05F.A0N
        L33:
            r3.A0J = r0
            X.XmO r1 = r3.A08
            r1.A02 = r2
        L39:
            r0 = 911(0x38f, float:1.277E-42)
            java.lang.String r0 = X.AbstractC111324zv.A00(r0)
            java.lang.Object r0 = r4.get(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            if (r0 != 0) goto L4b
            java.lang.Boolean r0 = X.AbstractC166997dE.A0a()
        L4b:
            boolean r0 = r0.booleanValue()
            r1.A01 = r0
            if (r0 == 0) goto L79
            java.lang.Integer r0 = X.C05F.A0C
        L55:
            r3.A0I = r0
            r0 = 909(0x38d, float:1.274E-42)
            java.lang.String r0 = X.AbstractC111324zv.A00(r0)
            java.lang.Object r0 = r4.get(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            if (r0 != 0) goto L69
            java.lang.Boolean r0 = X.AbstractC166997dE.A0a()
        L69:
            boolean r0 = r0.booleanValue()
            r1.A00 = r0
            if (r0 == 0) goto L76
            X.Xc5 r0 = X.EnumC72369Xc5.AUTOMATIC
        L73:
            r3.A0G = r0
            return
        L76:
            X.Xc5 r0 = X.EnumC72369Xc5.DISABLED
            goto L73
        L79:
            java.lang.Integer r0 = X.C05F.A00
            goto L55
        L7c:
            java.lang.Integer r0 = X.C05F.A01
            goto L33
        L7f:
            if (r0 == 0) goto L84
            java.lang.Integer r0 = X.C05F.A0C
            goto L33
        L84:
            java.lang.Integer r0 = X.C05F.A00
            r3.A0J = r0
            X.XmO r1 = r3.A08
            r0 = 0
            r1.A02 = r0
            goto L39
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C73402YBo.EPo(java.util.HashMap):void");
    }

    @Override // X.InterfaceC176367st
    public final long getFrameTimestamp() {
        Frame frame = this.A0M;
        if (frame != null) {
            return frame.A00();
        }
        return 0L;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, X.XmO] */
    public C73402YBo(Context context, boolean z) {
        YOi yOi;
        Integer num = C05F.A00;
        this.A0I = num;
        this.A0J = num;
        this.A0G = EnumC72369Xc5.DISABLED;
        this.A0L = -1;
        this.A08 = new Object();
        this.A09 = new YGA(this);
        this.A0E = new InterfaceC175107qk() { // from class: X.YBm
            @Override // X.InterfaceC175107qk
            public final void onCameraClosed(CameraDevice cameraDevice) {
            }
        };
        this.A0F = new C73401YBn(this);
        this.A0B = new A4W(this);
        this.A07 = context.getApplicationContext();
        this.A0A = new Handler(AbstractC65702TsY.A0G("ARCoreCallback"));
        Y9W y9w = Y9W.A00;
        try {
            yOi = (YOi) Class.forName("com.facebook.cameracore.camerasdk.optic.arcore.extensions.ArCoreNativeExtensionImpl").getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z));
        } catch (Exception unused) {
            yOi = y9w;
        }
        this.A06 = yOi;
    }
}
