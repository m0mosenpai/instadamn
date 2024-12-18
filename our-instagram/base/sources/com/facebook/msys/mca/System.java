package com.facebook.msys.mca;

import X.C136066Dl;
import X.C137306Jk;
import com.facebook.msys.mci.NotificationCenter;
import com.facebook.simplejni.NativeHolder;

/* loaded from: classes3.dex */
public class System {
    public final NativeHolder mNativeHolder;
    public final NotificationCenter mNotificationCenter;

    public static native NativeHolder initNativeHolder(NotificationCenter notificationCenter);

    static {
        C137306Jk.A00();
    }

    public System() {
        NotificationCenter A00 = C136066Dl.A00();
        this.mNotificationCenter = A00;
        this.mNativeHolder = initNativeHolder(A00);
    }
}
