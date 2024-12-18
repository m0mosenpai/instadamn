package org.webrtc;

import X.AbstractC111324zv;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC167017dG;
import X.AbstractC72046XLm;
import X.AnonymousClass001;
import X.C0BU;
import X.C0fC;
import X.C0fF;
import X.C0fG;
import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import android.util.Range;
import android.view.Surface;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.webrtc.Camera2Session;
import org.webrtc.CameraEnumerationAndroid;
import org.webrtc.CameraSession;

/* loaded from: classes12.dex */
public class Camera2Session implements CameraSession {
    public static final String TAG = "Camera2Session";
    public final Context applicationContext;
    public final CameraSession.CreateSessionCallback callback;
    public CameraCharacteristics cameraCharacteristics;
    public CameraDevice cameraDevice;
    public final String cameraId;
    public final CameraManager cameraManager;
    public int cameraOrientation;
    public final Handler cameraThreadHandler;
    public CameraEnumerationAndroid.CaptureFormat captureFormat;
    public CameraCaptureSession captureSession;
    public final long constructionTimeNs;
    public final CameraSession.Events events;
    public boolean firstFrameReported;
    public int fpsUnitFactor;
    public final int framerate;
    public final int height;
    public boolean isCameraFrontFacing;
    public SessionState state = SessionState.RUNNING;
    public Surface surface;
    public final SurfaceTextureHelper surfaceTextureHelper;
    public final int width;
    public static final Histogram camera2StartTimeMsHistogram = Histogram.createCounts("WebRTC.Android.Camera2.StartTimeMs", 1, 10000, 50);
    public static final Histogram camera2StopTimeMsHistogram = Histogram.createCounts("WebRTC.Android.Camera2.StopTimeMs", 1, 10000, 50);
    public static final Histogram camera2ResolutionHistogram = Histogram.createEnumeration("WebRTC.Android.Camera2.Resolution", CameraEnumerationAndroid.COMMON_RESOLUTIONS.size());

    /* loaded from: classes12.dex */
    public class CameraStateCallback extends CameraDevice.StateCallback {
        private String getErrorDescription(int i) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                return AnonymousClass001.A0O("Unknown camera error: ", i);
                            }
                            return "Camera service has encountered a fatal error.";
                        }
                        return AbstractC111324zv.A00(1524);
                    }
                    return "Camera device could not be opened due to a device policy.";
                }
                return "Camera device could not be opened because there are too many other open camera devices.";
            }
            return "Camera device is in use already.";
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onClosed(CameraDevice cameraDevice) {
            Camera2Session.this.checkIsOnCameraThread();
            boolean z = Logging.loggingEnabled;
            Camera2Session camera2Session = Camera2Session.this;
            camera2Session.events.onCameraClosed(camera2Session);
        }

        /* JADX WARN: Code restructure failed: missing block: B:4:0x0010, code lost:
        
            if (r3.state == org.webrtc.Camera2Session.SessionState.STOPPED) goto L6;
         */
        @Override // android.hardware.camera2.CameraDevice.StateCallback
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void onDisconnected(android.hardware.camera2.CameraDevice r5) {
            /*
                r4 = this;
                org.webrtc.Camera2Session r0 = org.webrtc.Camera2Session.this
                org.webrtc.Camera2Session.access$000(r0)
                org.webrtc.Camera2Session r3 = org.webrtc.Camera2Session.this
                android.hardware.camera2.CameraCaptureSession r0 = r3.captureSession
                if (r0 != 0) goto L12
                org.webrtc.Camera2Session$SessionState r1 = r3.state
                org.webrtc.Camera2Session$SessionState r0 = org.webrtc.Camera2Session.SessionState.STOPPED
                r2 = 1
                if (r1 != r0) goto L13
            L12:
                r2 = 0
            L13:
                org.webrtc.Camera2Session$SessionState r0 = org.webrtc.Camera2Session.SessionState.STOPPED
                r3.state = r0
                org.webrtc.Camera2Session.access$300(r3)
                org.webrtc.Camera2Session r1 = org.webrtc.Camera2Session.this
                if (r2 == 0) goto L28
                org.webrtc.CameraSession$CreateSessionCallback r2 = r1.callback
                org.webrtc.CameraSession$FailureType r1 = org.webrtc.CameraSession.FailureType.DISCONNECTED
                java.lang.String r0 = "Camera disconnected / evicted."
                r2.onFailure(r1, r0)
                return
            L28:
                org.webrtc.CameraSession$Events r0 = r1.events
                r0.onCameraDisconnected(r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: org.webrtc.Camera2Session.CameraStateCallback.onDisconnected(android.hardware.camera2.CameraDevice):void");
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onError(CameraDevice cameraDevice, int i) {
            C0fF c0fF = C0fF.$redex_init_class;
            if (C0BU.A04()) {
                C0BU.A02(cameraDevice);
            }
            Camera2Session.this.checkIsOnCameraThread();
            Camera2Session.this.reportError(getErrorDescription(i));
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onOpened(CameraDevice cameraDevice) {
            C0fF c0fF = C0fF.$redex_init_class;
            if (C0BU.A04()) {
                C0BU.A03(cameraDevice);
            }
            Camera2Session.this.checkIsOnCameraThread();
            boolean z = Logging.loggingEnabled;
            Camera2Session camera2Session = Camera2Session.this;
            camera2Session.cameraDevice = cameraDevice;
            SurfaceTextureHelper surfaceTextureHelper = camera2Session.surfaceTextureHelper;
            CameraEnumerationAndroid.CaptureFormat captureFormat = camera2Session.captureFormat;
            surfaceTextureHelper.setTextureSize(captureFormat.width, captureFormat.height);
            Camera2Session camera2Session2 = Camera2Session.this;
            camera2Session2.surface = new Surface(camera2Session2.surfaceTextureHelper.surfaceTexture);
            try {
                cameraDevice.createCaptureSession(Arrays.asList(Camera2Session.this.surface), new CaptureSessionCallback(), Camera2Session.this.cameraThreadHandler);
            } catch (CameraAccessException e) {
                Camera2Session.this.reportError(AbstractC167017dG.A0n(e, "Failed to create capture session. ", AbstractC166987dD.A1C()));
            }
        }

        public CameraStateCallback() {
        }
    }

    /* loaded from: classes12.dex */
    public class CaptureSessionCallback extends CameraCaptureSession.StateCallback {
        private void chooseFocusMode(CaptureRequest.Builder builder) {
            Camera2Session camera2Session = Camera2Session.this;
            String str = Camera2Session.TAG;
            int[] iArr = (int[]) camera2Session.cameraCharacteristics.get(CameraCharacteristics.CONTROL_AF_AVAILABLE_MODES);
            int length = iArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                if (iArr[i] == 3) {
                    builder.set(CaptureRequest.CONTROL_AF_MODE, 3);
                    break;
                }
                i++;
            }
            boolean z = Logging.loggingEnabled;
        }

        private void chooseStabilizationMode(CaptureRequest.Builder builder) {
            CaptureRequest.Key key;
            Camera2Session camera2Session = Camera2Session.this;
            String str = Camera2Session.TAG;
            int[] iArr = (int[]) camera2Session.cameraCharacteristics.get(CameraCharacteristics.LENS_INFO_AVAILABLE_OPTICAL_STABILIZATION);
            if (iArr != null) {
                for (int i : iArr) {
                    if (i == 1) {
                        builder.set(CaptureRequest.LENS_OPTICAL_STABILIZATION_MODE, 1);
                        key = CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE;
                        break;
                    }
                }
            }
            for (int i2 : (int[]) Camera2Session.this.cameraCharacteristics.get(CameraCharacteristics.CONTROL_AVAILABLE_VIDEO_STABILIZATION_MODES)) {
                if (i2 == 1) {
                    builder.set(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, 1);
                    key = CaptureRequest.LENS_OPTICAL_STABILIZATION_MODE;
                    builder.set(key, 0);
                }
            }
            boolean z = Logging.loggingEnabled;
        }

        /* renamed from: lambda$onConfigured$0$org-webrtc-Camera2Session$CaptureSessionCallback, reason: not valid java name */
        public /* synthetic */ void m105x8bd2b057(VideoFrame videoFrame) {
            Camera2Session.this.checkIsOnCameraThread();
            Camera2Session camera2Session = Camera2Session.this;
            if (camera2Session.state != SessionState.RUNNING) {
                boolean z = Logging.loggingEnabled;
                return;
            }
            if (!camera2Session.firstFrameReported) {
                camera2Session.firstFrameReported = true;
                Camera2Session.camera2StartTimeMsHistogram.addSample((int) TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - camera2Session.constructionTimeNs));
            }
            TextureBufferImpl textureBufferImpl = (TextureBufferImpl) videoFrame.buffer;
            Camera2Session camera2Session2 = Camera2Session.this;
            VideoFrame videoFrame2 = new VideoFrame(CameraSession.CC.createTextureBufferWithModifiedTransformMatrix(textureBufferImpl, camera2Session2.isCameraFrontFacing, -camera2Session2.cameraOrientation), Camera2Session.this.getFrameOrientation(), videoFrame.timestampNs);
            Camera2Session camera2Session3 = Camera2Session.this;
            camera2Session3.events.onFrameCaptured(camera2Session3, videoFrame2);
            videoFrame2.release();
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
            Camera2Session.this.checkIsOnCameraThread();
            C0fC.A01(cameraCaptureSession);
            Camera2Session.this.reportError("Failed to configure capture session.");
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigured(CameraCaptureSession cameraCaptureSession) {
            Camera2Session.this.checkIsOnCameraThread();
            boolean z = Logging.loggingEnabled;
            Camera2Session camera2Session = Camera2Session.this;
            camera2Session.captureSession = cameraCaptureSession;
            try {
                CaptureRequest.Builder createCaptureRequest = camera2Session.cameraDevice.createCaptureRequest(3);
                CaptureRequest.Key key = CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE;
                Camera2Session camera2Session2 = Camera2Session.this;
                CameraEnumerationAndroid.CaptureFormat.FramerateRange framerateRange = camera2Session2.captureFormat.framerate;
                int i = framerateRange.min;
                int i2 = camera2Session2.fpsUnitFactor;
                createCaptureRequest.set(key, new Range(Integer.valueOf(i / i2), Integer.valueOf(framerateRange.max / i2)));
                createCaptureRequest.set(CaptureRequest.CONTROL_AE_MODE, 1);
                createCaptureRequest.set(CaptureRequest.CONTROL_AE_LOCK, AbstractC166997dE.A0a());
                chooseStabilizationMode(createCaptureRequest);
                chooseFocusMode(createCaptureRequest);
                createCaptureRequest.addTarget(Camera2Session.this.surface);
                C0fC.A00(new CameraCaptureSession.CaptureCallback(), cameraCaptureSession, createCaptureRequest.build(), Camera2Session.this.cameraThreadHandler);
                Camera2Session.this.surfaceTextureHelper.startListening(new VideoSink() { // from class: org.webrtc.Camera2Session$CaptureSessionCallback$$ExternalSyntheticLambda0
                    @Override // org.webrtc.VideoSink
                    public final void onFrame(VideoFrame videoFrame) {
                        Camera2Session.CaptureSessionCallback.this.m105x8bd2b057(videoFrame);
                    }
                });
                Camera2Session camera2Session3 = Camera2Session.this;
                camera2Session3.callback.onDone(camera2Session3);
            } catch (CameraAccessException e) {
                Camera2Session.this.reportError(AbstractC167017dG.A0n(e, "Failed to start capture request. ", AbstractC166987dD.A1C()));
            }
        }

        public CaptureSessionCallback() {
        }
    }

    /* loaded from: classes12.dex */
    public enum SessionState {
        RUNNING,
        STOPPED
    }

    public static void create(CameraSession.CreateSessionCallback createSessionCallback, CameraSession.Events events, Context context, CameraManager cameraManager, SurfaceTextureHelper surfaceTextureHelper, String str, int i, int i2, int i3) {
        new Camera2Session(createSessionCallback, events, context, cameraManager, surfaceTextureHelper, str, i, i2, i3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getFrameOrientation() {
        int deviceOrientation = CameraSession.CC.getDeviceOrientation(this.applicationContext);
        if (!this.isCameraFrontFacing) {
            deviceOrientation = 360 - deviceOrientation;
        }
        return (this.cameraOrientation + deviceOrientation) % 360;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void stopInternal() {
        boolean z = Logging.loggingEnabled;
        checkIsOnCameraThread();
        this.surfaceTextureHelper.stopListening();
        CameraCaptureSession cameraCaptureSession = this.captureSession;
        if (cameraCaptureSession != null) {
            C0fC.A01(cameraCaptureSession);
            this.captureSession = null;
        }
        Surface surface = this.surface;
        if (surface != null) {
            surface.release();
            this.surface = null;
        }
        CameraDevice cameraDevice = this.cameraDevice;
        if (cameraDevice != null) {
            C0fG.A00(cameraDevice);
            this.cameraDevice = null;
        }
    }

    @Override // org.webrtc.CameraSession
    public void stop() {
        boolean z = Logging.loggingEnabled;
        checkIsOnCameraThread();
        SessionState sessionState = this.state;
        SessionState sessionState2 = SessionState.STOPPED;
        if (sessionState != sessionState2) {
            long nanoTime = System.nanoTime();
            this.state = sessionState2;
            stopInternal();
            camera2StopTimeMsHistogram.addSample((int) TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - nanoTime));
        }
    }

    /* loaded from: classes12.dex */
    public class CameraCaptureCallback extends CameraCaptureSession.CaptureCallback {
        public /* synthetic */ CameraCaptureCallback(AnonymousClass1 anonymousClass1) {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
            boolean z = Logging.loggingEnabled;
        }

        public CameraCaptureCallback() {
        }
    }

    public Camera2Session(CameraSession.CreateSessionCallback createSessionCallback, CameraSession.Events events, Context context, CameraManager cameraManager, SurfaceTextureHelper surfaceTextureHelper, String str, int i, int i2, int i3) {
        boolean z = Logging.loggingEnabled;
        this.constructionTimeNs = System.nanoTime();
        this.cameraThreadHandler = new Handler();
        this.callback = createSessionCallback;
        this.events = events;
        this.applicationContext = context;
        this.cameraManager = cameraManager;
        this.surfaceTextureHelper = surfaceTextureHelper;
        this.cameraId = str;
        this.width = i;
        this.height = i2;
        this.framerate = i3;
        start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void checkIsOnCameraThread() {
        if (Thread.currentThread() == AbstractC72046XLm.A0b(this.cameraThreadHandler)) {
        } else {
            throw AbstractC166987dD.A14("Wrong thread");
        }
    }

    private void findCaptureFormat() {
        checkIsOnCameraThread();
        Range[] rangeArr = (Range[]) this.cameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
        int fpsUnitFactor = Camera2Enumerator.getFpsUnitFactor(rangeArr);
        this.fpsUnitFactor = fpsUnitFactor;
        List convertFramerates = Camera2Enumerator.convertFramerates(rangeArr, fpsUnitFactor);
        List supportedSizes = Camera2Enumerator.getSupportedSizes(this.cameraCharacteristics);
        boolean z = Logging.loggingEnabled;
        if (!convertFramerates.isEmpty() && !supportedSizes.isEmpty()) {
            CameraEnumerationAndroid.CaptureFormat.FramerateRange closestSupportedFramerateRange = CameraEnumerationAndroid.getClosestSupportedFramerateRange(convertFramerates, this.framerate);
            Size closestSupportedSize = CameraEnumerationAndroid.getClosestSupportedSize(supportedSizes, this.width, this.height);
            CameraEnumerationAndroid.reportCameraResolution(camera2ResolutionHistogram, closestSupportedSize);
            this.captureFormat = new CameraEnumerationAndroid.CaptureFormat(closestSupportedSize.width, closestSupportedSize.height, closestSupportedFramerateRange);
            return;
        }
        reportError("No supported capture formats.");
    }

    private void openCamera() {
        checkIsOnCameraThread();
        boolean z = Logging.loggingEnabled;
        this.events.onCameraOpening();
        try {
            this.cameraManager.openCamera(this.cameraId, new CameraStateCallback(), this.cameraThreadHandler);
        } catch (CameraAccessException e) {
            reportError(AbstractC167017dG.A0n(e, "Failed to open camera: ", AbstractC166987dD.A1C()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x000e, code lost:
    
        if (r3.state == org.webrtc.Camera2Session.SessionState.STOPPED) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void reportError(java.lang.String r4) {
        /*
            r3 = this;
            r3.checkIsOnCameraThread()
            boolean r0 = org.webrtc.Logging.loggingEnabled
            android.hardware.camera2.CameraCaptureSession r0 = r3.captureSession
            if (r0 != 0) goto L10
            org.webrtc.Camera2Session$SessionState r2 = r3.state
            org.webrtc.Camera2Session$SessionState r0 = org.webrtc.Camera2Session.SessionState.STOPPED
            r1 = 1
            if (r2 != r0) goto L11
        L10:
            r1 = 0
        L11:
            org.webrtc.Camera2Session$SessionState r0 = org.webrtc.Camera2Session.SessionState.STOPPED
            r3.state = r0
            r3.stopInternal()
            if (r1 == 0) goto L22
            org.webrtc.CameraSession$CreateSessionCallback r1 = r3.callback
            org.webrtc.CameraSession$FailureType r0 = org.webrtc.CameraSession.FailureType.ERROR
            r1.onFailure(r0, r4)
            return
        L22:
            org.webrtc.CameraSession$Events r0 = r3.events
            r0.onCameraError(r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.webrtc.Camera2Session.reportError(java.lang.String):void");
    }

    private void start() {
        checkIsOnCameraThread();
        boolean z = Logging.loggingEnabled;
        try {
            CameraCharacteristics cameraCharacteristics = this.cameraManager.getCameraCharacteristics(this.cameraId);
            this.cameraCharacteristics = cameraCharacteristics;
            this.cameraOrientation = AbstractC166987dD.A0H(cameraCharacteristics.get(CameraCharacteristics.SENSOR_ORIENTATION));
            this.isCameraFrontFacing = AbstractC167007dF.A1N(AbstractC166987dD.A0H(this.cameraCharacteristics.get(CameraCharacteristics.LENS_FACING)));
            findCaptureFormat();
            openCamera();
        } catch (CameraAccessException e) {
            reportError(AbstractC166997dE.A0y("getCameraCharacteristics(): ", e));
        }
    }
}
