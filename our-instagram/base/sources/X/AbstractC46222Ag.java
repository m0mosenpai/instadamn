package X;

import android.os.Build;

/* renamed from: X.2Ag, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC46222Ag {
    public static final boolean A00() {
        if (!AbstractC46232Ah.A00.contains(Build.MODEL) && !AbstractC46232Ah.A01.contains(Build.MANUFACTURER)) {
            return false;
        }
        return true;
    }
}
