package X;

import com.facebook.profilo.core.TraceEvents;
import com.facebook.profilo.provider.constants.ExternalProvider;
import com.facebook.profilo.provider.constants.ExternalProviders;
import com.facebook.systrace.Systrace;

/* renamed from: X.0fY, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C0fY {
    public static void A00(long j, int i) {
        ExternalProvider externalProvider = ExternalProviders.A07;
        externalProvider.A07().A00(6, 22, i, 0L, 0);
        if ((externalProvider.A01 & TraceEvents.sProviders) == 0) {
            Systrace.A02(j);
        }
    }

    public static void A01(long j, String str, int i) {
        ExternalProvider externalProvider = ExternalProviders.A07;
        if ((externalProvider.A01 & TraceEvents.sProviders) != 0) {
            externalProvider.A07().A01(1, 83, externalProvider.A07().A00(7, 21, i, 0L, 0), str);
        } else {
            Systrace.A03(j, str);
        }
    }
}
