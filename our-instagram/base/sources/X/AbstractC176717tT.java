package X;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraManager;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.7tT, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC176717tT {
    public static final Map A00 = new HashMap();

    public static CameraCharacteristics A00(CameraManager cameraManager, String str) {
        Map map = A00;
        CameraCharacteristics cameraCharacteristics = (CameraCharacteristics) map.get(str);
        if (cameraCharacteristics == null) {
            try {
                cameraManager.getClass();
                CameraCharacteristics cameraCharacteristics2 = cameraManager.getCameraCharacteristics(str);
                map.put(str, cameraCharacteristics2);
                return cameraCharacteristics2;
            } catch (CameraAccessException e) {
                throw new RuntimeException(AnonymousClass001.A0R("Could not get Camera Characteristics for Camera ID: ", str), e);
            }
        }
        return cameraCharacteristics;
    }
}
