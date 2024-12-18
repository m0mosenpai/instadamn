package X;

import android.os.Trace;
import com.facebook.profilo.core.TraceEvents;
import com.facebook.profilo.provider.constants.ExternalProvider;
import com.facebook.profilo.provider.constants.ExternalProviders;

/* renamed from: X.0fc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC09790fc {
    public static void A00(int i) {
        ExternalProvider externalProvider = ExternalProviders.A07;
        externalProvider.A07().A00(6, 22, i, 0L, 0);
        if ((externalProvider.A01 & TraceEvents.sProviders) == 0) {
            Trace.endSection();
        }
    }

    public static void A01(String str, int i) {
        ExternalProvider externalProvider = ExternalProviders.A07;
        if ((externalProvider.A01 & TraceEvents.sProviders) != 0) {
            externalProvider.A07().A01(1, 83, externalProvider.A07().A00(7, 21, i, 0L, 0), str);
        } else {
            Trace.beginSection(str);
        }
    }
}
