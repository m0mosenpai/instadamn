package X;

import android.location.Location;

/* renamed from: X.4ly, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC103794ly {
    public static boolean A00(Location location) {
        if (location != null && location.getTime() != 0 && ((location.getLatitude() != 0.0d || location.getLongitude() != 0.0d) && location.hasAccuracy())) {
            return true;
        }
        return false;
    }
}
