package X;

import android.hardware.Camera;
import java.util.List;
import java.util.concurrent.locks.ReadWriteLock;

/* renamed from: X.0fE, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C0fE {
    public static final C0fE $redex_init_class = null;

    static {
        C0BU.A03 = true;
    }

    public static void A00(Camera camera) {
        camera.release();
        if (C0BU.A04()) {
            C0BU.A01(camera);
        }
    }

    public static void A01(Camera camera) {
        camera.startPreview();
        if (C0BU.A04()) {
            try {
                ReadWriteLock readWriteLock = C0BU.A02;
                readWriteLock.readLock().lock();
                List list = C0BU.A01;
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    ((C0BT) list.get(i)).Do6(camera);
                }
                readWriteLock.readLock().unlock();
            } catch (Throwable th) {
                C0BU.A02.readLock().unlock();
                throw th;
            }
        }
    }

    public static void A02(Camera camera) {
        camera.stopPreview();
        if (C0BU.A04()) {
            try {
                ReadWriteLock readWriteLock = C0BU.A02;
                readWriteLock.readLock().lock();
                List list = C0BU.A01;
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    ((C0BT) list.get(i)).Dox(camera);
                }
                readWriteLock.readLock().unlock();
            } catch (Throwable th) {
                C0BU.A02.readLock().unlock();
                throw th;
            }
        }
    }
}
