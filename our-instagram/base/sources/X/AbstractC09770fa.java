package X;

import android.os.HandlerThread;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.0fa, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC09770fa {
    public static final Map A00 = Collections.synchronizedMap(new HashMap());

    public static final void A00(HandlerThread handlerThread) {
        try {
            Map map = A00;
            C14360o3.A08(map);
            map.put(handlerThread.getName(), new WeakReference(handlerThread));
        } catch (Exception unused) {
        }
    }
}
