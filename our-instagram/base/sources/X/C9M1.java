package X;

import android.content.pm.PackageManager;
import android.hardware.Camera;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.ExecutionException;

/* renamed from: X.9M1, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9M1 {
    public static int A03 = -1;
    public static volatile boolean A04;
    public static volatile boolean A05;
    public static volatile Camera.CameraInfo[] A06;
    public static volatile boolean A07;
    public final C175227qw A00;
    public final PackageManager A01;
    public final C175237qx A02;

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0017, code lost:
    
        if (r1 == (-1)) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0020, code lost:
    
        if (r0 == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0043, code lost:
    
        if (r1 == (-1)) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int A00(X.C9M1 r7, int r8) {
        /*
            Method dump skipped, instructions count: 224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9M1.A00(X.9M1, int):int");
    }

    public static void A01() {
        if (A06 == null) {
            int numberOfCameras = Camera.getNumberOfCameras();
            Camera.CameraInfo[] cameraInfoArr = new Camera.CameraInfo[numberOfCameras];
            boolean z = false;
            boolean z2 = false;
            for (int i = 0; i < numberOfCameras; i++) {
                Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
                Camera.getCameraInfo(i, cameraInfo);
                cameraInfoArr[i] = cameraInfo;
                int i2 = cameraInfo.facing;
                if (i2 != 0) {
                    if (i2 == 1) {
                        z = true;
                    }
                } else {
                    z2 = true;
                }
            }
            A06 = cameraInfoArr;
            A05 = z;
            A04 = z2;
            A03 = 0;
            if (A04) {
                A03++;
            }
            if (A05) {
                A03++;
            }
            A07 = true;
        }
    }

    public static void A02(C9M1 c9m1) {
        if (A06 == null) {
            C175227qw c175227qw = c9m1.A00;
            if (c175227qw.A09()) {
                A01();
                return;
            }
            try {
                c175227qw.A01(new C176427t0(), "load_camera_infos", new CallableC209549Op(c9m1, 9)).get();
            } catch (InterruptedException | ExecutionException e) {
                AbstractC175037qd.A02("CameraInventory", AbstractC166997dE.A0y("failed to load camera infos: ", e));
            }
        }
    }

    public static boolean A03(C9M1 c9m1) {
        if (A07) {
            return true;
        }
        PackageManager packageManager = c9m1.A01;
        if (packageManager == null) {
            AbstractC175037qd.A02("CameraInventory", "failed to load camera feature. PackageManager is null");
            return false;
        }
        if (packageManager.hasSystemFeature("android.hardware.camera")) {
            A04 = true;
        }
        if (packageManager.hasSystemFeature("android.hardware.camera.front")) {
            A05 = true;
        }
        A03 = 0;
        if (A04) {
            A03++;
        }
        if (A05) {
            A03++;
        }
        A07 = true;
        return true;
    }

    public final int A04() {
        int i = A03;
        if (i == -1) {
            if (A03(this)) {
                return A03;
            }
            this.A00.A06("Number of cameras must be loaded on background thread.");
            int numberOfCameras = Camera.getNumberOfCameras();
            A03 = numberOfCameras;
            return numberOfCameras;
        }
        return i;
    }

    public final int A06(int i, int i2) {
        if (A06 == null) {
            if (!C176567tE.A02()) {
                AbstractC175037qd.A02("CameraInventory", "Loading camera info on the UI thread");
            }
            A02(this);
        }
        if (i2 != -1) {
            int A00 = A00(this, i);
            Camera.CameraInfo[] cameraInfoArr = A06;
            cameraInfoArr.getClass();
            if (A00 >= cameraInfoArr.length) {
                AbstractC175037qd.A02("CameraInventory", AnonymousClass001.A0O("No CameraInfo found for camera id: ", A00));
            } else {
                Camera.CameraInfo cameraInfo = A06[A00];
                int i3 = ((i2 + 45) / 90) * 90;
                int i4 = cameraInfo.facing;
                int i5 = cameraInfo.orientation;
                int i6 = i5 + i3;
                if (i4 == 1) {
                    i6 = (i5 - i3) + 360;
                }
                return i6 % 360;
            }
        }
        return 0;
    }

    public final void A07(final AbstractC184688Hj abstractC184688Hj, final int i) {
        Looper looper;
        if (A06 == null && !A03(this)) {
            this.A00.A01(abstractC184688Hj, "has_facing_camera", new CallableC208669La(this, i, 5));
            return;
        }
        C175227qw c175227qw = this.A00;
        Handler handler = c175227qw.A00;
        if (handler == null) {
            looper = Looper.getMainLooper();
        } else {
            looper = handler.getLooper();
        }
        if (looper.getThread() == Thread.currentThread()) {
            abstractC184688Hj.A02(Boolean.valueOf(A08(i)));
        } else {
            c175227qw.A05(new Runnable() { // from class: X.AxK
                @Override // java.lang.Runnable
                public final void run() {
                    abstractC184688Hj.A02(Boolean.valueOf(this.A08(i)));
                }
            }, this.A02.A03);
        }
    }

    public C9M1(PackageManager packageManager, C175237qx c175237qx, C175227qw c175227qw) {
        this.A00 = c175227qw;
        this.A02 = c175237qx;
        this.A01 = packageManager;
    }

    public final int A05(int i) {
        int A00 = A00(this, i);
        if (A00 != -1) {
            Camera.CameraInfo[] cameraInfoArr = A06;
            cameraInfoArr.getClass();
            Camera.CameraInfo cameraInfo = cameraInfoArr[A00];
            if (cameraInfo != null) {
                return cameraInfo.orientation;
            }
            return 0;
        }
        throw AbstractC166987dD.A18(AnonymousClass001.A0O("Could not load CameraInfo for CameraFacing: ", i));
    }

    public final boolean A08(int i) {
        if (A03(this)) {
            if (i != 0) {
                return A05;
            }
            return A04;
        }
        if (A00(this, i) == -1) {
            return false;
        }
        return true;
    }
}
