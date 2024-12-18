package X;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import java.util.List;
import java.util.concurrent.locks.ReadWriteLock;

/* renamed from: X.0fC, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C0fC {
    static {
        C0BU.A03 = true;
    }

    public static int A00(CameraCaptureSession.CaptureCallback captureCallback, CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, Handler handler) {
        int repeatingRequest = cameraCaptureSession.setRepeatingRequest(captureRequest, captureCallback, handler);
        if (C0BU.A04()) {
            CameraDevice device = cameraCaptureSession.getDevice();
            try {
                ReadWriteLock readWriteLock = C0BU.A02;
                readWriteLock.readLock().lock();
                List list = C0BU.A01;
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    ((C0BT) list.get(i)).Do6(device);
                }
                readWriteLock.readLock().unlock();
            } catch (Throwable th) {
                C0BU.A02.readLock().unlock();
                throw th;
            }
        }
        return repeatingRequest;
    }

    public static void A01(CameraCaptureSession cameraCaptureSession) {
        cameraCaptureSession.close();
        if (C0BU.A04()) {
            CameraDevice device = cameraCaptureSession.getDevice();
            try {
                ReadWriteLock readWriteLock = C0BU.A02;
                readWriteLock.readLock().lock();
                List list = C0BU.A01;
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    ((C0BT) list.get(i)).Dox(device);
                }
                readWriteLock.readLock().unlock();
            } catch (Throwable th) {
                C0BU.A02.readLock().unlock();
                throw th;
            }
        }
    }
}
