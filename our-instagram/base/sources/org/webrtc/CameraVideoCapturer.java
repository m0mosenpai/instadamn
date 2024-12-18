package org.webrtc;

import X.AbstractC166987dD;
import X.AbstractC58317Pt9;
import X.AbstractC72046XLm;
import android.media.MediaRecorder;

/* loaded from: classes12.dex */
public interface CameraVideoCapturer extends VideoCapturer {

    /* renamed from: org.webrtc.CameraVideoCapturer$-CC, reason: invalid class name */
    /* loaded from: classes12.dex */
    public abstract /* synthetic */ class CC {
        @Deprecated
        public static void $default$addMediaRecorderToCamera(CameraVideoCapturer cameraVideoCapturer, MediaRecorder mediaRecorder, MediaRecorderHandler mediaRecorderHandler) {
            throw AbstractC166987dD.A1D(AbstractC58317Pt9.A00(67));
        }

        @Deprecated
        public static void $default$removeMediaRecorderFromCamera(CameraVideoCapturer cameraVideoCapturer, MediaRecorderHandler mediaRecorderHandler) {
            throw AbstractC166987dD.A1D(AbstractC58317Pt9.A00(67));
        }
    }

    /* loaded from: classes12.dex */
    public interface CameraEventsHandler {
        void onCameraClosed();

        void onCameraDisconnected();

        void onCameraError(String str);

        void onCameraFreezed(String str);

        void onCameraOpening(String str);

        void onFirstFrameAvailable();
    }

    /* loaded from: classes12.dex */
    public class CameraStatistics {
        public static final int CAMERA_FREEZE_REPORT_TIMOUT_MS = 4000;
        public static final int CAMERA_OBSERVER_PERIOD_MS = 2000;
        public static final String TAG = "CameraStatistics";
        public final Runnable cameraObserver;
        public final CameraEventsHandler eventsHandler;
        public int frameCount;
        public int freezePeriodCount;
        public final SurfaceTextureHelper surfaceTextureHelper;

        public static /* synthetic */ int access$104(CameraStatistics cameraStatistics) {
            int i = cameraStatistics.freezePeriodCount + 1;
            cameraStatistics.freezePeriodCount = i;
            return i;
        }

        public void release() {
            this.surfaceTextureHelper.handler.removeCallbacks(this.cameraObserver);
        }

        public CameraStatistics(SurfaceTextureHelper surfaceTextureHelper, CameraEventsHandler cameraEventsHandler) {
            Runnable runnable = new Runnable() { // from class: org.webrtc.CameraVideoCapturer.CameraStatistics.1
                @Override // java.lang.Runnable
                public void run() {
                    String str;
                    CameraStatistics cameraStatistics = CameraStatistics.this;
                    int i = cameraStatistics.frameCount;
                    boolean z = Logging.loggingEnabled;
                    if (i == 0) {
                        CameraStatistics.access$104(cameraStatistics);
                        if (cameraStatistics.freezePeriodCount * CameraStatistics.CAMERA_OBSERVER_PERIOD_MS >= 4000 && cameraStatistics.eventsHandler != null) {
                            boolean z2 = cameraStatistics.surfaceTextureHelper.isTextureInUse;
                            CameraEventsHandler cameraEventsHandler2 = CameraStatistics.this.eventsHandler;
                            if (z2) {
                                str = "Camera failure. Client must return video buffers.";
                            } else {
                                str = "Camera failure.";
                            }
                            cameraEventsHandler2.onCameraFreezed(str);
                            return;
                        }
                    } else {
                        cameraStatistics.freezePeriodCount = 0;
                    }
                    cameraStatistics.frameCount = 0;
                    cameraStatistics.surfaceTextureHelper.handler.postDelayed(this, 2000L);
                }
            };
            this.cameraObserver = runnable;
            if (surfaceTextureHelper != null) {
                this.surfaceTextureHelper = surfaceTextureHelper;
                this.eventsHandler = cameraEventsHandler;
                this.frameCount = 0;
                this.freezePeriodCount = 0;
                surfaceTextureHelper.handler.postDelayed(runnable, 2000L);
                return;
            }
            throw AbstractC166987dD.A12("SurfaceTextureHelper is null");
        }

        private void checkThread() {
            if (Thread.currentThread() == AbstractC72046XLm.A0b(this.surfaceTextureHelper.handler)) {
            } else {
                throw AbstractC166987dD.A14("Wrong thread");
            }
        }

        public void addFrame() {
            checkThread();
            this.frameCount++;
        }
    }

    /* loaded from: classes12.dex */
    public interface CameraSwitchHandler {
        void onCameraSwitchDone(boolean z);

        void onCameraSwitchError(String str);
    }

    @Deprecated
    /* loaded from: classes12.dex */
    public interface MediaRecorderHandler {
        void onMediaRecorderError(String str);

        void onMediaRecorderSuccess();
    }

    @Deprecated
    void addMediaRecorderToCamera(MediaRecorder mediaRecorder, MediaRecorderHandler mediaRecorderHandler);

    @Deprecated
    void removeMediaRecorderFromCamera(MediaRecorderHandler mediaRecorderHandler);

    void switchCamera(CameraSwitchHandler cameraSwitchHandler);

    void switchCamera(CameraSwitchHandler cameraSwitchHandler, String str);
}
