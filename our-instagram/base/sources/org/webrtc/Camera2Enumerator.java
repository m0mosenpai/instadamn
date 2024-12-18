package org.webrtc;

import X.AbstractC166987dD;
import X.AbstractC65702TsY;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.os.SystemClock;
import android.util.AndroidException;
import android.util.Range;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.webrtc.CameraEnumerationAndroid;
import org.webrtc.CameraVideoCapturer;

/* loaded from: classes12.dex */
public class Camera2Enumerator implements CameraEnumerator {
    public static final double NANO_SECONDS_PER_SECOND = 1.0E9d;
    public static final String TAG = "Camera2Enumerator";
    public static final Map cachedSupportedFormats = AbstractC166987dD.A1G();
    public final CameraManager cameraManager;
    public final Context context;

    public static int getFpsUnitFactor(Range[] rangeArr) {
        if (rangeArr.length == 0 || AbstractC65702TsY.A05(rangeArr[0]) < 1000) {
            return 1000;
        }
        return 1;
    }

    public static boolean isSupported(Context context) {
        CameraManager cameraManager = (CameraManager) context.getSystemService("camera");
        try {
            for (String str : cameraManager.getCameraIdList()) {
                if (AbstractC166987dD.A0H(cameraManager.getCameraCharacteristics(str).get(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL)) == 2) {
                    return false;
                }
            }
            return true;
        } catch (AndroidException unused) {
            boolean z = Logging.loggingEnabled;
            return false;
        }
    }

    private CameraCharacteristics getCameraCharacteristics(String str) {
        try {
            return this.cameraManager.getCameraCharacteristics(str);
        } catch (AndroidException unused) {
            boolean z = Logging.loggingEnabled;
            return null;
        }
    }

    public static List getSupportedFormats(CameraManager cameraManager, String str) {
        List A1E;
        long j;
        int round;
        Map map = cachedSupportedFormats;
        synchronized (map) {
            if (map.containsKey(str)) {
                A1E = (List) map.get(str);
            } else {
                boolean z = Logging.loggingEnabled;
                SystemClock.elapsedRealtime();
                try {
                    CameraCharacteristics cameraCharacteristics = cameraManager.getCameraCharacteristics(str);
                    StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) cameraCharacteristics.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
                    Range[] rangeArr = (Range[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
                    List convertFramerates = convertFramerates(rangeArr, getFpsUnitFactor(rangeArr));
                    List<Size> supportedSizes = getSupportedSizes(cameraCharacteristics);
                    Iterator it = convertFramerates.iterator();
                    int i = 0;
                    while (it.hasNext()) {
                        i = Math.max(i, ((CameraEnumerationAndroid.CaptureFormat.FramerateRange) it.next()).max);
                    }
                    ArrayList A1E2 = AbstractC166987dD.A1E();
                    for (Size size : supportedSizes) {
                        try {
                            j = streamConfigurationMap.getOutputMinFrameDuration(SurfaceTexture.class, new android.util.Size(size.width, size.height));
                        } catch (Exception unused) {
                            j = 0;
                        }
                        if (j == 0) {
                            round = i;
                        } else {
                            round = ((int) Math.round(1.0E9d / j)) * 1000;
                        }
                        A1E2.add(new CameraEnumerationAndroid.CaptureFormat(size.width, size.height, 0, round));
                    }
                    map.put(str, A1E2);
                    SystemClock.elapsedRealtime();
                    return A1E2;
                } catch (Exception unused2) {
                    A1E = AbstractC166987dD.A1E();
                }
            }
            return A1E;
        }
    }

    public static List getSupportedSizes(CameraCharacteristics cameraCharacteristics) {
        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) cameraCharacteristics.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
        cameraCharacteristics.get(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        return convertSizes(streamConfigurationMap.getOutputSizes(SurfaceTexture.class));
    }

    @Override // org.webrtc.CameraEnumerator
    public CameraVideoCapturer createCapturer(String str, CameraVideoCapturer.CameraEventsHandler cameraEventsHandler) {
        return new Camera2Capturer(this.context, str, cameraEventsHandler);
    }

    @Override // org.webrtc.CameraEnumerator
    public String[] getDeviceNames() {
        try {
            return this.cameraManager.getCameraIdList();
        } catch (AndroidException unused) {
            boolean z = Logging.loggingEnabled;
            return new String[0];
        }
    }

    public Camera2Enumerator(Context context) {
        this.context = context;
        this.cameraManager = (CameraManager) context.getSystemService("camera");
    }

    public static List convertFramerates(Range[] rangeArr, int i) {
        ArrayList A1E = AbstractC166987dD.A1E();
        for (Range range : rangeArr) {
            A1E.add(new CameraEnumerationAndroid.CaptureFormat.FramerateRange(AbstractC166987dD.A0H(range.getLower()) * i, AbstractC65702TsY.A05(range) * i));
        }
        return A1E;
    }

    public static List convertSizes(android.util.Size[] sizeArr) {
        ArrayList A1E = AbstractC166987dD.A1E();
        for (android.util.Size size : sizeArr) {
            A1E.add(new Size(size.getWidth(), size.getHeight()));
        }
        return A1E;
    }

    @Override // org.webrtc.CameraEnumerator
    public boolean isBackFacing(String str) {
        CameraCharacteristics cameraCharacteristics = getCameraCharacteristics(str);
        if (cameraCharacteristics != null && AbstractC166987dD.A0H(cameraCharacteristics.get(CameraCharacteristics.LENS_FACING)) == 1) {
            return true;
        }
        return false;
    }

    @Override // org.webrtc.CameraEnumerator
    public boolean isFrontFacing(String str) {
        CameraCharacteristics cameraCharacteristics = getCameraCharacteristics(str);
        if (cameraCharacteristics != null && AbstractC166987dD.A0H(cameraCharacteristics.get(CameraCharacteristics.LENS_FACING)) == 0) {
            return true;
        }
        return false;
    }

    @Override // org.webrtc.CameraEnumerator
    public List getSupportedFormats(String str) {
        return getSupportedFormats(this.context, str);
    }

    public static List getSupportedFormats(Context context, String str) {
        return getSupportedFormats((CameraManager) context.getSystemService("camera"), str);
    }
}
