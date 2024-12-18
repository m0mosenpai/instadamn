package X;

import com.facebook.profilo.core.ProvidersRegistry;
import com.facebook.profilo.core.TraceEvents;

/* renamed from: X.0Vm, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC06440Vm {
    public static volatile boolean A00;

    public static boolean A01(int i) {
        C06360Vc c06360Vc;
        if (!A00 || (c06360Vc = C06360Vc.A0A) == null || c06360Vc.A05(i) == null) {
            return false;
        }
        return true;
    }

    public static boolean A00() {
        C06360Vc c06360Vc;
        if (!A00 || (c06360Vc = C06360Vc.A0A) == null || (c06360Vc.A04.get() & 8) == 0 || (ProvidersRegistry.A00.A01("frames") & TraceEvents.sProviders) == 0) {
            return false;
        }
        return true;
    }
}
