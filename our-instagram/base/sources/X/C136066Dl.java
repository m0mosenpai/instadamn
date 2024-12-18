package X;

import com.facebook.msys.mci.NotificationCenter;

/* renamed from: X.6Dl, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C136066Dl {
    public static NotificationCenter A00;

    public static synchronized NotificationCenter A00() {
        NotificationCenter notificationCenter;
        synchronized (C136066Dl.class) {
            notificationCenter = A00;
            if (notificationCenter == null) {
                notificationCenter = new NotificationCenter();
                A00 = notificationCenter;
            }
        }
        return notificationCenter;
    }
}
