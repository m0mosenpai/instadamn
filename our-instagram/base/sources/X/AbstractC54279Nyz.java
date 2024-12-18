package X;

import android.graphics.Bitmap;
import android.hardware.Camera;

/* renamed from: X.Nyz, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC54279Nyz {
    /* JADX WARN: Multi-variable type inference failed */
    public static Bitmap A00(Bitmap bitmap, OEB oeb, int i, int i2) {
        int i3;
        int i4;
        Camera.CameraInfo cameraInfo;
        boolean z;
        if (i > 0 && i2 > 0) {
            i3 = Math.min(bitmap.getHeight() / i2, bitmap.getWidth() / i);
        } else {
            i3 = 0;
        }
        if (i3 == 0) {
            i3 = 1;
        }
        int i5 = oeb.A00;
        if (i5 != -1) {
            try {
                C196868nG c196868nG = AbstractC196848nE.A01;
                cameraInfo = new Camera.CameraInfo();
                Camera.getCameraInfo(i5, cameraInfo);
                i4 = cameraInfo.orientation;
            } catch (RuntimeException e) {
                e = e;
                i4 = 0;
            }
            try {
                z = cameraInfo.facing == 1 ? 1 : 0;
                r5 = i4;
            } catch (RuntimeException e2) {
                e = e2;
                C0w9.A07("getCroppedBitmap().getCameraInfo() failed", e);
                r5 = i4;
                z = 0;
                return C1NC.A09(bitmap, bitmap.getWidth() / i3, bitmap.getHeight() / i3, r5, z);
            }
            return C1NC.A09(bitmap, bitmap.getWidth() / i3, bitmap.getHeight() / i3, r5, z);
        }
        z = 0;
        return C1NC.A09(bitmap, bitmap.getWidth() / i3, bitmap.getHeight() / i3, r5, z);
    }
}
