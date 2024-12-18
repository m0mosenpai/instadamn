package X;

import com.facebook.memorytimeline.MemoryTimeline;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.0Tc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C05920Tc {
    public static MemoryTimeline A00;
    public static final List A01 = new ArrayList();

    public static synchronized MemoryTimeline A00(InterfaceC05910Tb interfaceC05910Tb) {
        MemoryTimeline memoryTimeline;
        synchronized (C05920Tc.class) {
            if (A00 == null && interfaceC05910Tb != null) {
                A01.add(new WeakReference(interfaceC05910Tb));
            }
            memoryTimeline = A00;
        }
        return memoryTimeline;
    }
}
