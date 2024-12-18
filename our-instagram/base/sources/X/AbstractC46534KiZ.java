package X;

import android.os.Build;

/* renamed from: X.KiZ, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46534KiZ {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x000d. Please report as an issue. */
    @Deprecated
    public static String A00(String str) {
        if (str != null && !str.isEmpty()) {
            switch (str.hashCode()) {
                case -1367751899:
                    if (str.equals("camera")) {
                        return "android.permission.CAMERA";
                    }
                    break;
                case -196315310:
                    if (str.equals("gallery")) {
                        if (Build.VERSION.SDK_INT >= 33) {
                            return AbstractC58317Pt9.A00(17);
                        }
                        return "android.permission.WRITE_EXTERNAL_STORAGE";
                    }
                    break;
                case -94789412:
                    if (str.equals("read_contacts")) {
                        return AbstractC111324zv.A00(1915);
                    }
                    break;
            }
        }
        return null;
    }
}
