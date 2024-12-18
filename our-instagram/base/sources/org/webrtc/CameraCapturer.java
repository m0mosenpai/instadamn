package org.webrtc;

import X.AbstractC166987dD;
import X.AbstractC167007dF;
import X.AbstractC58317Pt9;
import X.AbstractC58318PtA;
import X.AbstractC72046XLm;
import X.AnonymousClass001;
import X.C00O;
import android.content.Context;
import android.media.MediaRecorder;
import android.os.Handler;
import java.util.Arrays;
import java.util.List;
import org.webrtc.CameraSession;
import org.webrtc.CameraVideoCapturer;

/* loaded from: classes12.dex */
public abstract class CameraCapturer implements CameraVideoCapturer {
    public static final int MAX_OPEN_CAMERA_ATTEMPTS = 3;
    public static final int OPEN_CAMERA_DELAY_MS = 500;
    public static final int OPEN_CAMERA_TIMEOUT = 10000;
    public static final String TAG = "CameraCapturer";
    public Context applicationContext;
    public final CameraEnumerator cameraEnumerator;
    public String cameraName;
    public CameraVideoCapturer.CameraStatistics cameraStatistics;
    public Handler cameraThreadHandler;
    public CapturerObserver capturerObserver;
    public CameraSession currentSession;
    public final CameraVideoCapturer.CameraEventsHandler eventsHandler;
    public boolean firstFrameObserved;
    public int framerate;
    public int height;
    public int openAttemptsRemaining;
    public String pendingCameraName;
    public boolean sessionOpening;
    public SurfaceTextureHelper surfaceHelper;
    public CameraVideoCapturer.CameraSwitchHandler switchEventsHandler;
    public final Handler uiThreadHandler;
    public int width;
    public final CameraSession.CreateSessionCallback createSessionCallback = new CameraSession.CreateSessionCallback() { // from class: org.webrtc.CameraCapturer.1
        @Override // org.webrtc.CameraSession.CreateSessionCallback
        public void onDone(CameraSession cameraSession) {
            CameraCapturer.this.checkIsOnCameraThread();
            boolean z = Logging.loggingEnabled;
            CameraCapturer cameraCapturer = CameraCapturer.this;
            cameraCapturer.uiThreadHandler.removeCallbacks(cameraCapturer.openCameraTimeoutRunnable);
            synchronized (CameraCapturer.this.stateLock) {
                CameraCapturer.this.capturerObserver.onCapturerStarted(true);
                CameraCapturer cameraCapturer2 = CameraCapturer.this;
                cameraCapturer2.sessionOpening = false;
                cameraCapturer2.currentSession = cameraSession;
                cameraCapturer2.cameraStatistics = new CameraVideoCapturer.CameraStatistics(cameraCapturer2.surfaceHelper, cameraCapturer2.eventsHandler);
                CameraCapturer cameraCapturer3 = CameraCapturer.this;
                cameraCapturer3.firstFrameObserved = false;
                cameraCapturer3.stateLock.notifyAll();
                CameraCapturer cameraCapturer4 = CameraCapturer.this;
                SwitchState switchState = cameraCapturer4.switchState;
                if (switchState == SwitchState.IN_PROGRESS) {
                    cameraCapturer4.switchState = SwitchState.IDLE;
                    CameraVideoCapturer.CameraSwitchHandler cameraSwitchHandler = cameraCapturer4.switchEventsHandler;
                    if (cameraSwitchHandler != null) {
                        cameraSwitchHandler.onCameraSwitchDone(cameraCapturer4.cameraEnumerator.isFrontFacing(cameraCapturer4.cameraName));
                        CameraCapturer.this.switchEventsHandler = null;
                    }
                } else if (switchState == SwitchState.PENDING) {
                    String str = cameraCapturer4.pendingCameraName;
                    cameraCapturer4.pendingCameraName = null;
                    cameraCapturer4.switchState = SwitchState.IDLE;
                    cameraCapturer4.m108lambda$switchCamera$3$orgwebrtcCameraCapturer(cameraCapturer4.switchEventsHandler, str);
                }
            }
        }

        @Override // org.webrtc.CameraSession.CreateSessionCallback
        public void onFailure(CameraSession.FailureType failureType, String str) {
            CameraCapturer.this.checkIsOnCameraThread();
            CameraCapturer cameraCapturer = CameraCapturer.this;
            cameraCapturer.uiThreadHandler.removeCallbacks(cameraCapturer.openCameraTimeoutRunnable);
            synchronized (CameraCapturer.this.stateLock) {
                CameraCapturer.this.capturerObserver.onCapturerStarted(false);
                CameraCapturer cameraCapturer2 = CameraCapturer.this;
                CameraCapturer.access$1710(cameraCapturer2);
                if (cameraCapturer2.openAttemptsRemaining <= 0) {
                    boolean z = Logging.loggingEnabled;
                    cameraCapturer2.sessionOpening = false;
                    cameraCapturer2.stateLock.notifyAll();
                    CameraCapturer cameraCapturer3 = CameraCapturer.this;
                    SwitchState switchState = cameraCapturer3.switchState;
                    SwitchState switchState2 = SwitchState.IDLE;
                    if (switchState != switchState2) {
                        CameraVideoCapturer.CameraSwitchHandler cameraSwitchHandler = cameraCapturer3.switchEventsHandler;
                        if (cameraSwitchHandler != null) {
                            cameraSwitchHandler.onCameraSwitchError(str);
                            cameraCapturer3 = CameraCapturer.this;
                            cameraCapturer3.switchEventsHandler = null;
                        }
                        cameraCapturer3.switchState = switchState2;
                    }
                    if (failureType == CameraSession.FailureType.DISCONNECTED) {
                        cameraCapturer3.eventsHandler.onCameraDisconnected();
                    } else {
                        cameraCapturer3.eventsHandler.onCameraError(str);
                    }
                } else {
                    boolean z2 = Logging.loggingEnabled;
                    cameraCapturer2.createSessionInternal(500);
                }
            }
        }
    };
    public final CameraSession.Events cameraSessionEventsHandler = new CameraSession.Events() { // from class: org.webrtc.CameraCapturer.2
        @Override // org.webrtc.CameraSession.Events
        public void onCameraClosed(CameraSession cameraSession) {
            CameraCapturer.this.checkIsOnCameraThread();
            synchronized (CameraCapturer.this.stateLock) {
                CameraCapturer cameraCapturer = CameraCapturer.this;
                CameraSession cameraSession2 = cameraCapturer.currentSession;
                if (cameraSession != cameraSession2 && cameraSession2 != null) {
                    boolean z = Logging.loggingEnabled;
                } else {
                    cameraCapturer.eventsHandler.onCameraClosed();
                }
            }
        }

        @Override // org.webrtc.CameraSession.Events
        public void onCameraDisconnected(CameraSession cameraSession) {
            CameraCapturer.this.checkIsOnCameraThread();
            synchronized (CameraCapturer.this.stateLock) {
                CameraCapturer cameraCapturer = CameraCapturer.this;
                if (cameraSession != cameraCapturer.currentSession) {
                    boolean z = Logging.loggingEnabled;
                } else {
                    cameraCapturer.eventsHandler.onCameraDisconnected();
                    CameraCapturer.this.stopCapture();
                }
            }
        }

        @Override // org.webrtc.CameraSession.Events
        public void onCameraError(CameraSession cameraSession, String str) {
            CameraCapturer.this.checkIsOnCameraThread();
            synchronized (CameraCapturer.this.stateLock) {
                CameraCapturer cameraCapturer = CameraCapturer.this;
                if (cameraSession != cameraCapturer.currentSession) {
                    boolean z = Logging.loggingEnabled;
                } else {
                    cameraCapturer.eventsHandler.onCameraError(str);
                    CameraCapturer.this.stopCapture();
                }
            }
        }

        @Override // org.webrtc.CameraSession.Events
        public void onCameraOpening() {
            CameraCapturer.this.checkIsOnCameraThread();
            synchronized (CameraCapturer.this.stateLock) {
                CameraCapturer cameraCapturer = CameraCapturer.this;
                if (cameraCapturer.currentSession != null) {
                    boolean z = Logging.loggingEnabled;
                } else {
                    cameraCapturer.eventsHandler.onCameraOpening(cameraCapturer.cameraName);
                }
            }
        }

        @Override // org.webrtc.CameraSession.Events
        public void onFrameCaptured(CameraSession cameraSession, VideoFrame videoFrame) {
            CameraCapturer.this.checkIsOnCameraThread();
            synchronized (CameraCapturer.this.stateLock) {
                CameraCapturer cameraCapturer = CameraCapturer.this;
                if (cameraSession != cameraCapturer.currentSession) {
                    boolean z = Logging.loggingEnabled;
                } else {
                    if (!cameraCapturer.firstFrameObserved) {
                        cameraCapturer.eventsHandler.onFirstFrameAvailable();
                        cameraCapturer = CameraCapturer.this;
                        cameraCapturer.firstFrameObserved = true;
                    }
                    cameraCapturer.cameraStatistics.addFrame();
                    CameraCapturer.this.capturerObserver.onFrameCaptured(videoFrame);
                }
            }
        }
    };
    public final Runnable openCameraTimeoutRunnable = new Runnable() { // from class: org.webrtc.CameraCapturer.3
        @Override // java.lang.Runnable
        public void run() {
            CameraCapturer.this.eventsHandler.onCameraError("Camera failed to start within timeout.");
        }
    };
    public final Object stateLock = AbstractC58318PtA.A0b();
    public SwitchState switchState = SwitchState.IDLE;

    /* loaded from: classes12.dex */
    public enum SwitchState {
        IDLE,
        PENDING,
        IN_PROGRESS
    }

    public abstract void createCameraSession(CameraSession.CreateSessionCallback createSessionCallback, CameraSession.Events events, Context context, SurfaceTextureHelper surfaceTextureHelper, String str, int i, int i2, int i3);

    @Override // org.webrtc.VideoCapturer
    public boolean isScreencast() {
        return false;
    }

    /* renamed from: lambda$createSessionInternal$0$org-webrtc-CameraCapturer, reason: not valid java name */
    public /* synthetic */ void m106lambda$createSessionInternal$0$orgwebrtcCameraCapturer() {
        createCameraSession(this.createSessionCallback, this.cameraSessionEventsHandler, this.applicationContext, this.surfaceHelper, this.cameraName, this.width, this.height, this.framerate);
    }

    @Override // org.webrtc.CameraVideoCapturer
    public /* synthetic */ void removeMediaRecorderFromCamera(CameraVideoCapturer.MediaRecorderHandler mediaRecorderHandler) {
        CameraVideoCapturer.CC.$default$removeMediaRecorderFromCamera(this, mediaRecorderHandler);
        throw C00O.createAndThrow();
    }

    public static /* synthetic */ int access$1710(CameraCapturer cameraCapturer) {
        int i = cameraCapturer.openAttemptsRemaining;
        cameraCapturer.openAttemptsRemaining = i - 1;
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void createSessionInternal(int i) {
        this.uiThreadHandler.postDelayed(this.openCameraTimeoutRunnable, i + 10000);
        this.cameraThreadHandler.postDelayed(new Runnable() { // from class: org.webrtc.CameraCapturer$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                CameraCapturer.this.m106lambda$createSessionInternal$0$orgwebrtcCameraCapturer();
            }
        }, i);
    }

    public static void reportCameraSwitchError(String str, CameraVideoCapturer.CameraSwitchHandler cameraSwitchHandler) {
        boolean z = Logging.loggingEnabled;
        if (cameraSwitchHandler != null) {
            cameraSwitchHandler.onCameraSwitchError(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: switchCameraInternal, reason: merged with bridge method [inline-methods] */
    public void m108lambda$switchCamera$3$orgwebrtcCameraCapturer(CameraVideoCapturer.CameraSwitchHandler cameraSwitchHandler, String str) {
        boolean z = Logging.loggingEnabled;
        if (!Arrays.asList(this.cameraEnumerator.getDeviceNames()).contains(str)) {
            reportCameraSwitchError(AnonymousClass001.A0R("Attempted to switch to unknown camera device ", str), cameraSwitchHandler);
            return;
        }
        synchronized (this.stateLock) {
            if (this.switchState != SwitchState.IDLE) {
                reportCameraSwitchError("Camera switch already in progress.", cameraSwitchHandler);
            } else {
                boolean z2 = this.sessionOpening;
                if (!z2 && this.currentSession == null) {
                    reportCameraSwitchError("switchCamera: camera is not running.", cameraSwitchHandler);
                } else {
                    this.switchEventsHandler = cameraSwitchHandler;
                    if (z2) {
                        this.switchState = SwitchState.PENDING;
                        this.pendingCameraName = str;
                    } else {
                        this.switchState = SwitchState.IN_PROGRESS;
                        this.cameraStatistics.release();
                        this.cameraStatistics = null;
                        final CameraSession cameraSession = this.currentSession;
                        this.cameraThreadHandler.post(new Runnable() { // from class: org.webrtc.CameraCapturer$$ExternalSyntheticLambda0
                            @Override // java.lang.Runnable
                            public final void run() {
                                CameraSession.this.stop();
                            }
                        });
                        this.currentSession = null;
                        this.cameraName = str;
                        this.sessionOpening = true;
                        this.openAttemptsRemaining = 1;
                        createSessionInternal(0);
                    }
                }
            }
        }
    }

    @Override // org.webrtc.CameraVideoCapturer
    public /* synthetic */ void addMediaRecorderToCamera(MediaRecorder mediaRecorder, CameraVideoCapturer.MediaRecorderHandler mediaRecorderHandler) {
        throw AbstractC166987dD.A1D(AbstractC58317Pt9.A00(67));
    }

    @Override // org.webrtc.VideoCapturer
    public void changeCaptureFormat(int i, int i2, int i3) {
        boolean z = Logging.loggingEnabled;
        synchronized (this.stateLock) {
            stopCapture();
            startCapture(i, i2, i3);
        }
    }

    @Override // org.webrtc.VideoCapturer
    public void dispose() {
        boolean z = Logging.loggingEnabled;
        stopCapture();
    }

    @Override // org.webrtc.VideoCapturer
    public void initialize(SurfaceTextureHelper surfaceTextureHelper, Context context, CapturerObserver capturerObserver) {
        this.applicationContext = context;
        this.capturerObserver = capturerObserver;
        this.surfaceHelper = surfaceTextureHelper;
        this.cameraThreadHandler = surfaceTextureHelper.handler;
    }

    /* renamed from: lambda$switchCamera$2$org-webrtc-CameraCapturer, reason: not valid java name */
    public /* synthetic */ void m107lambda$switchCamera$2$orgwebrtcCameraCapturer(CameraVideoCapturer.CameraSwitchHandler cameraSwitchHandler) {
        List asList = Arrays.asList(this.cameraEnumerator.getDeviceNames());
        if (asList.size() < 2) {
            reportCameraSwitchError("No camera to switch to.", cameraSwitchHandler);
        } else {
            m108lambda$switchCamera$3$orgwebrtcCameraCapturer(cameraSwitchHandler, (String) asList.get((asList.indexOf(this.cameraName) + 1) % asList.size()));
        }
    }

    public void printStackTrace() {
        Thread A0b;
        StackTraceElement[] stackTrace;
        int length;
        Handler handler = this.cameraThreadHandler;
        if (handler != null && (A0b = AbstractC72046XLm.A0b(handler)) != null && (length = (stackTrace = A0b.getStackTrace()).length) > 0) {
            boolean z = Logging.loggingEnabled;
            int i = 0;
            do {
                stackTrace[i].toString();
                i++;
            } while (i < length);
        }
    }

    @Override // org.webrtc.VideoCapturer
    public void startCapture(int i, int i2, int i3) {
        boolean z = Logging.loggingEnabled;
        if (this.applicationContext != null) {
            synchronized (this.stateLock) {
                if (!this.sessionOpening && this.currentSession == null) {
                    this.width = i;
                    this.height = i2;
                    this.framerate = i3;
                    this.sessionOpening = true;
                    this.openAttemptsRemaining = 3;
                    createSessionInternal(0);
                }
            }
            return;
        }
        throw AbstractC166987dD.A18("CameraCapturer must be initialized before calling startCapture.");
    }

    @Override // org.webrtc.VideoCapturer
    public void stopCapture() {
        boolean z = Logging.loggingEnabled;
        synchronized (this.stateLock) {
            while (this.sessionOpening) {
                try {
                    this.stateLock.wait();
                } catch (InterruptedException unused) {
                    AbstractC58318PtA.A18();
                }
            }
            if (this.currentSession != null) {
                this.cameraStatistics.release();
                this.cameraStatistics = null;
                final CameraSession cameraSession = this.currentSession;
                this.cameraThreadHandler.post(new Runnable() { // from class: org.webrtc.CameraCapturer$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() {
                        CameraSession.this.stop();
                    }
                });
                this.currentSession = null;
                this.capturerObserver.onCapturerStopped();
            }
        }
    }

    @Override // org.webrtc.CameraVideoCapturer
    public void switchCamera(final CameraVideoCapturer.CameraSwitchHandler cameraSwitchHandler, final String str) {
        boolean z = Logging.loggingEnabled;
        this.cameraThreadHandler.post(new Runnable() { // from class: org.webrtc.CameraCapturer$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                CameraCapturer.this.m108lambda$switchCamera$3$orgwebrtcCameraCapturer(cameraSwitchHandler, str);
            }
        });
    }

    public CameraCapturer(String str, CameraVideoCapturer.CameraEventsHandler cameraEventsHandler, CameraEnumerator cameraEnumerator) {
        this.eventsHandler = cameraEventsHandler == null ? new CameraVideoCapturer.CameraEventsHandler() { // from class: org.webrtc.CameraCapturer.4
            @Override // org.webrtc.CameraVideoCapturer.CameraEventsHandler
            public void onCameraClosed() {
            }

            @Override // org.webrtc.CameraVideoCapturer.CameraEventsHandler
            public void onCameraDisconnected() {
            }

            @Override // org.webrtc.CameraVideoCapturer.CameraEventsHandler
            public void onCameraError(String str2) {
            }

            @Override // org.webrtc.CameraVideoCapturer.CameraEventsHandler
            public void onCameraFreezed(String str2) {
            }

            @Override // org.webrtc.CameraVideoCapturer.CameraEventsHandler
            public void onCameraOpening(String str2) {
            }

            @Override // org.webrtc.CameraVideoCapturer.CameraEventsHandler
            public void onFirstFrameAvailable() {
            }
        } : cameraEventsHandler;
        this.cameraEnumerator = cameraEnumerator;
        this.cameraName = str;
        List asList = Arrays.asList(cameraEnumerator.getDeviceNames());
        this.uiThreadHandler = AbstractC167007dF.A0J();
        if (!asList.isEmpty()) {
            if (asList.contains(this.cameraName)) {
                return;
            } else {
                throw AbstractC166987dD.A12(AnonymousClass001.A0g("Camera name ", this.cameraName, " does not match any known camera device."));
            }
        }
        throw AbstractC166987dD.A18("No cameras attached.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void checkIsOnCameraThread() {
        if (Thread.currentThread() == AbstractC72046XLm.A0b(this.cameraThreadHandler)) {
            return;
        }
        boolean z = Logging.loggingEnabled;
        throw AbstractC166987dD.A18("Not on camera thread.");
    }

    @Override // org.webrtc.CameraVideoCapturer
    public void switchCamera(final CameraVideoCapturer.CameraSwitchHandler cameraSwitchHandler) {
        boolean z = Logging.loggingEnabled;
        this.cameraThreadHandler.post(new Runnable() { // from class: org.webrtc.CameraCapturer$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                CameraCapturer.this.m107lambda$switchCamera$2$orgwebrtcCameraCapturer(cameraSwitchHandler);
            }
        });
    }
}
