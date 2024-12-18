package X;

import android.os.Build;

/* renamed from: X.Rqf, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC61615Rqf {
    public static boolean A00(int i) {
        if (i != 15 && i != 255) {
            if (i != 32768) {
                if (i != 32783) {
                    if (i != 33023 && i != 0) {
                        return false;
                    }
                } else {
                    if (Build.VERSION.SDK_INT > 29) {
                        return true;
                    }
                    return false;
                }
            } else {
                if (Build.VERSION.SDK_INT >= 30) {
                    return true;
                }
                return false;
            }
        }
        return true;
    }
}
