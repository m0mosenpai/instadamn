package X;

import com.facebook.memorytimeline.MemoryTimeline;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1Jr, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC24921Jr {
    public static final List A00 = new ArrayList();
    public static volatile MemoryTimeline A01;

    public static final void A00(InterfaceC24911Jq interfaceC24911Jq) {
        List list = A00;
        synchronized (list) {
            if (A01 == null) {
                list.add(interfaceC24911Jq);
                return;
            }
            MemoryTimeline memoryTimeline = A01;
            if (memoryTimeline != null) {
                interfaceC24911Jq.DSe(memoryTimeline);
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
    }
}
