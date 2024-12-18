package org.webrtc;

import X.AbstractC166987dD;
import X.AnonymousClass001;
import X.C0BU;
import X.C0fE;
import android.hardware.Camera;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.webrtc.CameraEnumerationAndroid;
import org.webrtc.CameraVideoCapturer;

/* loaded from: classes12.dex */
public class Camera1Enumerator implements CameraEnumerator {
    public static final String TAG = "Camera1Enumerator";
    public static List cachedSupportedFormats;
    public final boolean captureToTexture;

    public static List enumerateFormats(int i) {
        int i2;
        boolean z = Logging.loggingEnabled;
        SystemClock.elapsedRealtime();
        Camera camera = null;
        try {
            try {
                C0fE c0fE = C0fE.$redex_init_class;
                Camera open = Camera.open(i);
                if (C0BU.A04()) {
                    C0BU.A03(open);
                }
                camera = open;
                Camera.Parameters parameters = open.getParameters();
                C0fE.A00(open);
                ArrayList A1E = AbstractC166987dD.A1E();
                try {
                    List<int[]> supportedPreviewFpsRange = parameters.getSupportedPreviewFpsRange();
                    int i3 = 0;
                    if (supportedPreviewFpsRange != null) {
                        int[] iArr = supportedPreviewFpsRange.get(supportedPreviewFpsRange.size() - 1);
                        i3 = iArr[0];
                        i2 = iArr[1];
                    } else {
                        i2 = 0;
                    }
                    for (Camera.Size size : parameters.getSupportedPreviewSizes()) {
                        A1E.add(new CameraEnumerationAndroid.CaptureFormat(size.width, size.height, i3, i2));
                    }
                } catch (Exception e) {
                    Logging.e(TAG, AnonymousClass001.A0O("getSupportedFormats() failed on camera index ", i), e);
                }
                SystemClock.elapsedRealtime();
                return A1E;
            } catch (RuntimeException e2) {
                Logging.e(TAG, AnonymousClass001.A0O("Open camera failed on camera index ", i), e2);
                ArrayList A1E2 = AbstractC166987dD.A1E();
                if (camera != null) {
                    C0fE.A00(camera);
                }
                return A1E2;
            }
        } catch (Throwable th) {
            if (camera != null) {
                C0fE.A00(camera);
            }
            throw th;
        }
    }

    public static int getCameraIndex(String str) {
        boolean z = Logging.loggingEnabled;
        for (int i = 0; i < Camera.getNumberOfCameras(); i++) {
            if (str.equals(getDeviceName(i))) {
                return i;
            }
        }
        throw AbstractC166987dD.A12(AnonymousClass001.A0R("No such camera: ", str));
    }

    public static Camera.CameraInfo getCameraInfo(int i) {
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        try {
            Camera.getCameraInfo(i, cameraInfo);
            return cameraInfo;
        } catch (Exception e) {
            Logging.e(TAG, AnonymousClass001.A0O("getCameraInfo failed on index ", i), e);
            return null;
        }
    }

    public static synchronized List getSupportedFormats(int i) {
        List list;
        synchronized (Camera1Enumerator.class) {
            if (cachedSupportedFormats == null) {
                cachedSupportedFormats = AbstractC166987dD.A1E();
                for (int i2 = 0; i2 < Camera.getNumberOfCameras(); i2++) {
                    cachedSupportedFormats.add(enumerateFormats(i2));
                }
            }
            list = (List) cachedSupportedFormats.get(i);
        }
        return list;
    }

    @Override // org.webrtc.CameraEnumerator
    public CameraVideoCapturer createCapturer(String str, CameraVideoCapturer.CameraEventsHandler cameraEventsHandler) {
        return new Camera1Capturer(str, cameraEventsHandler, this.captureToTexture);
    }

    public Camera1Enumerator(boolean z) {
        this.captureToTexture = z;
    }

    public static List convertFramerates(List list) {
        ArrayList A1E = AbstractC166987dD.A1E();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            int[] iArr = (int[]) it.next();
            A1E.add(new CameraEnumerationAndroid.CaptureFormat.FramerateRange(iArr[0], iArr[1]));
        }
        return A1E;
    }

    public static List convertSizes(List list) {
        ArrayList A1E = AbstractC166987dD.A1E();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Camera.Size size = (Camera.Size) it.next();
            A1E.add(new Size(size.width, size.height));
        }
        return A1E;
    }

    public static String getDeviceName(int i) {
        String str;
        Camera.CameraInfo cameraInfo = getCameraInfo(i);
        if (cameraInfo == null) {
            return null;
        }
        if (cameraInfo.facing == 1) {
            str = "front";
        } else {
            str = "back";
        }
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("Camera ");
        A1C.append(i);
        A1C.append(", Facing ");
        A1C.append(str);
        A1C.append(", Orientation ");
        A1C.append(cameraInfo.orientation);
        return A1C.toString();
    }

    @Override // org.webrtc.CameraEnumerator
    public String[] getDeviceNames() {
        ArrayList A1E = AbstractC166987dD.A1E();
        for (int i = 0; i < Camera.getNumberOfCameras(); i++) {
            String deviceName = getDeviceName(i);
            if (deviceName != null) {
                A1E.add(deviceName);
            }
            boolean z = Logging.loggingEnabled;
        }
        return (String[]) A1E.toArray(new String[A1E.size()]);
    }

    @Override // org.webrtc.CameraEnumerator
    public boolean isBackFacing(String str) {
        Camera.CameraInfo cameraInfo = getCameraInfo(getCameraIndex(str));
        if (cameraInfo != null && cameraInfo.facing == 0) {
            return true;
        }
        return false;
    }

    @Override // org.webrtc.CameraEnumerator
    public boolean isFrontFacing(String str) {
        Camera.CameraInfo cameraInfo = getCameraInfo(getCameraIndex(str));
        if (cameraInfo != null && cameraInfo.facing == 1) {
            return true;
        }
        return false;
    }

    public Camera1Enumerator() {
        this(true);
    }

    @Override // org.webrtc.CameraEnumerator
    public List getSupportedFormats(String str) {
        return getSupportedFormats(getCameraIndex(str));
    }
}
