package X;

import android.app.Application;

/* renamed from: X.0B4, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0B4 {
    public static Application A00;

    public static final synchronized Application A00() {
        Application application;
        synchronized (C0B4.class) {
            application = A00;
            if (application == null) {
                throw new IllegalStateException("ApplicationHolder#set never called");
            }
        }
        return application;
    }
}
