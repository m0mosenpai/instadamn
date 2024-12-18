package X;

import com.facebook.profilo.core.TraceEvents;
import com.facebook.profilo.provider.constants.ExternalProvider;
import com.facebook.profilo.provider.constants.ExternalProviders;

/* renamed from: X.0fO, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C0fO {
    public static void A00(int i) {
        ExternalProvider externalProvider = ExternalProviders.A07;
        externalProvider.A07().A00(6, 22, i, 0L, 0);
        if ((externalProvider.A01 & TraceEvents.sProviders) == 0) {
            C0fY.A00(1L, -2116443936);
        }
    }

    public static void A01(String str, int i) {
        ExternalProvider externalProvider = ExternalProviders.A07;
        if ((externalProvider.A01 & TraceEvents.sProviders) != 0) {
            externalProvider.A07().A01(1, 83, externalProvider.A07().A00(7, 21, i, 0L, 0), str);
        } else {
            C0fY.A01(1L, str, -370761908);
        }
    }
}
