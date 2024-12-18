package X;

import android.app.Activity;
import java.lang.ref.WeakReference;

/* renamed from: X.2fj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC54852fj {
    public static WeakReference A00;

    public static InterfaceC53722dB A00() {
        InterfaceC53722dB interfaceC53722dB;
        WeakReference weakReference = A00;
        if (weakReference != null) {
            interfaceC53722dB = (InterfaceC53722dB) weakReference.get();
        } else {
            interfaceC53722dB = null;
        }
        if (interfaceC53722dB instanceof Activity) {
            Activity activity = (Activity) interfaceC53722dB;
            if (activity.isFinishing() || activity.isDestroyed()) {
                return null;
            }
        }
        return interfaceC53722dB;
    }
}
