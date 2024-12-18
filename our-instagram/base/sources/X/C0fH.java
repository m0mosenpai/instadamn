package X;

import com.facebook.profilo.core.TraceEvents;
import com.facebook.profilo.provider.constants.ExternalProvider;
import com.facebook.profilo.provider.constants.ExternalProviders;

/* renamed from: X.0fH, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C0fH {
    public static void A00(int i) {
        ExternalProvider externalProvider = ExternalProviders.A07;
        if ((externalProvider.A01 & TraceEvents.sProviders) != 0) {
            externalProvider.A07().A00(6, 22, i, 0L, 0);
        }
    }

    public static void A01(int i, String str) {
        ExternalProvider externalProvider = ExternalProviders.A07;
        if ((externalProvider.A01 & TraceEvents.sProviders) != 0) {
            externalProvider.A07().A01(1, 83, externalProvider.A07().A00(7, 21, i, 0L, 0), str);
        }
    }

    public static boolean A02() {
        if ((ExternalProviders.A07.A01 & TraceEvents.sProviders) != 0) {
            return true;
        }
        return false;
    }
}
