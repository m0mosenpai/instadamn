package X;

import android.content.pm.PackageManager;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraManager;
import android.os.Handler;
import android.os.Looper;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

/* renamed from: X.7qy, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C175247qy {
    public static int A06;
    public static boolean A07;
    public static boolean A08;
    public static volatile boolean A09;
    public final CameraManager A01;
    public final C175227qw A02;
    public final PackageManager A03;
    public final C175237qx A04;
    public volatile C176647tM[] A05 = null;
    public Map A00 = Collections.emptyMap();

    public final int A05(int i, int i2, int i3) {
        if (i3 != -1) {
            try {
                int i4 = ((i3 + 45) / 90) * 90;
                if (A01(this, i).A01 == 0) {
                    return ((i2 - i4) + 360) % 360;
                }
                return (i2 + i4) % 360;
            } catch (CameraAccessException e) {
                AbstractC175037qd.A02("CameraInventory", AnonymousClass001.A0R("Failed to get info to calculate media rotation: ", e.getMessage()));
            }
        }
        return 0;
    }

    private int A00(int i) {
        if (this.A05 == null) {
            A02(this);
        }
        if (this.A05 != null && this.A05.length != 0) {
            for (int i2 = 0; i2 < this.A05.length; i2++) {
                if (this.A05[i2].A00 == i) {
                    return i2;
                }
            }
        }
        return -1;
    }

    public static C176647tM A01(C175247qy c175247qy, int i) {
        if (c175247qy.A05 == null) {
            A02(c175247qy);
        }
        int A00 = c175247qy.A00(i);
        if (A00 != -1) {
            C176647tM[] c176647tMArr = c175247qy.A05;
            c176647tMArr.getClass();
            return c176647tMArr[A00];
        }
        throw new IllegalArgumentException("Camera facing did not resolve to a camera info instance");
    }

    public static void A02(final C175247qy c175247qy) {
        if (c175247qy.A05 == null) {
            C175227qw c175227qw = c175247qy.A02;
            if (c175227qw.A09()) {
                A03(c175247qy);
                return;
            }
            try {
                c175227qw.A01(new C176427t0(), "load_camera_infos", new Callable() { // from class: X.B0f
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        C175247qy.A03(C175247qy.this);
                        return null;
                    }
                }).get();
            } catch (InterruptedException | ExecutionException e) {
                AbstractC175037qd.A02("CameraInventory", AnonymousClass001.A0R("failed to load camera infos: ", e.getMessage()));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.7tM[]] */
    public static void A03(C175247qy c175247qy) {
        CameraManager cameraManager = c175247qy.A01;
        cameraManager.getClass();
        String[] cameraIdList = cameraManager.getCameraIdList();
        int length = cameraIdList.length;
        HashMap hashMap = new HashMap();
        int i = 0;
        int i2 = 0;
        ?? r12 = 0;
        boolean z = false;
        while (i2 < length) {
            String str = cameraIdList[i2];
            Number number = (Number) cameraManager.getCameraCharacteristics(str).get(CameraCharacteristics.LENS_FACING);
            number.getClass();
            int intValue = number.intValue();
            int i3 = 1;
            if (intValue == 1) {
                i3 = 0;
            }
            Map map = c175247qy.A00;
            Integer valueOf = Integer.valueOf(i3);
            if (map.containsKey(valueOf) || !hashMap.containsKey(valueOf)) {
                String str2 = (String) c175247qy.A00.get(valueOf);
                if (str2 != null) {
                    str = str2;
                }
                hashMap.put(valueOf, new C176647tM(i3, str, intValue));
            }
            if (i3 != 0) {
                z = true;
                if (r12 != 0) {
                    break;
                }
                i2++;
                r12 = r12;
            } else {
                r12 = 1;
                r12 = 1;
                if (z) {
                    break;
                }
                i2++;
                r12 = r12;
            }
        }
        ?? r3 = new C176647tM[hashMap.size()];
        Iterator it = hashMap.entrySet().iterator();
        while (it.hasNext()) {
            r3[i] = ((Map.Entry) it.next()).getValue();
            i++;
        }
        A08 = z;
        A07 = r12;
        int i4 = r12;
        if (z) {
            i4 = r12 + 1;
        }
        A06 = i4;
        c175247qy.A05 = r3;
        A09 = true;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [boolean, int] */
    public static boolean A04(C175247qy c175247qy) {
        if (A09) {
            return true;
        }
        PackageManager packageManager = c175247qy.A03;
        if (packageManager == null) {
            AbstractC175037qd.A02("CameraInventory", "failed to load camera feature. PackageManager is null");
            return false;
        }
        if (packageManager.hasSystemFeature("android.hardware.camera")) {
            A07 = true;
        }
        if (packageManager.hasSystemFeature("android.hardware.camera.front")) {
            A08 = true;
        }
        ?? r1 = A07;
        int i = r1;
        if (A08) {
            i = r1 + 1;
        }
        A06 = i;
        A09 = true;
        return true;
    }

    public final int A06(String str) {
        if (this.A05 == null) {
            A02(this);
        }
        C176647tM[] c176647tMArr = this.A05;
        c176647tMArr.getClass();
        int length = c176647tMArr.length;
        for (int i = 0; i < length; i++) {
            C176647tM c176647tM = this.A05[i];
            if (c176647tM.A02.equals(str)) {
                return c176647tM.A00;
            }
        }
        AbstractC175037qd.A02("CameraInventory", AnonymousClass001.A0R("Failed to find camera facing for id: ", str));
        return 0;
    }

    public C175247qy(PackageManager packageManager, CameraManager cameraManager, C175237qx c175237qx, C175227qw c175227qw) {
        this.A01 = cameraManager;
        this.A02 = c175227qw;
        this.A04 = c175237qx;
        this.A03 = packageManager;
    }

    public final String A07(int i) {
        try {
            return A01(this, i).A02;
        } catch (CameraAccessException e) {
            throw new RuntimeException("Failed to get camera info", e);
        }
    }

    public final void A08(final AbstractC184688Hj abstractC184688Hj, final int i) {
        Looper looper;
        if (!A04(this) && this.A05 == null) {
            this.A02.A01(abstractC184688Hj, "has_facing_camera", new Callable() { // from class: X.B0v
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return Boolean.valueOf(C175247qy.this.A09(i));
                }
            });
            return;
        }
        C175227qw c175227qw = this.A02;
        Handler handler = c175227qw.A00;
        if (handler == null) {
            looper = Looper.getMainLooper();
        } else {
            looper = handler.getLooper();
        }
        if (looper.getThread() == Thread.currentThread()) {
            try {
                abstractC184688Hj.A02(Boolean.valueOf(A09(i)));
                return;
            } catch (CameraAccessException e) {
                abstractC184688Hj.A01(e);
                return;
            }
        }
        c175227qw.A05(new Runnable() { // from class: X.8zq
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    abstractC184688Hj.A02(Boolean.valueOf(this.A09(i)));
                } catch (CameraAccessException e2) {
                    abstractC184688Hj.A01(e2);
                }
            }
        }, this.A04.A03);
    }

    public final boolean A09(int i) {
        if (A04(this)) {
            if (i != 1) {
                return A08;
            }
            return A07;
        }
        if (this.A05 == null) {
            A02(this);
        }
        if (this.A05 == null) {
            AbstractC175037qd.A02("CameraInventory", "Failed to detect camera, cameraInfos was null");
            return false;
        }
        int i2 = 1;
        if (i == 1) {
            i2 = 0;
        }
        if (A00(i2) != -1) {
            return true;
        }
        return false;
    }
}
