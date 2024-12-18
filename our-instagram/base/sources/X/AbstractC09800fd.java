package X;

import com.facebook.common.stringformat.StringFormatUtil;
import com.facebook.profilo.core.TraceEvents;
import com.facebook.profilo.provider.constants.ExternalProvider;
import com.facebook.profilo.provider.constants.ExternalProviders;
import com.facebook.systrace.Systrace;
import java.util.IllegalFormatException;

/* renamed from: X.0fd, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC09800fd {
    public static void A00(int i) {
        ExternalProvider externalProvider = ExternalProviders.A07;
        externalProvider.A07().A00(6, 22, i, 0L, 0);
        if ((externalProvider.A01 & TraceEvents.sProviders) == 0) {
            Systrace.A02(32L);
        }
    }

    public static void A01(String str, int i) {
        if ((ExternalProviders.A07.A01 & TraceEvents.sProviders) != 0) {
            A02(str, i);
            return;
        }
        C14360o3.A0B(str, 0);
        if (!Systrace.A0E(32L)) {
            return;
        }
        try {
            str = StringFormatUtil.formatStrLocaleSafe(str);
        } catch (IllegalFormatException e) {
            C0K8.A0J("Tracer", "Bad format string", e);
        }
        Systrace.A03(32L, str);
    }

    public static void A02(String str, int i) {
        ExternalProvider externalProvider = ExternalProviders.A07;
        if ((externalProvider.A01 & TraceEvents.sProviders) != 0) {
            int A00 = externalProvider.A07().A00(7, 21, i, 0L, 0);
            if (str != null) {
                externalProvider.A07().A01(1, 83, A00, str);
            }
        }
    }

    public static void A03(String str, Object obj, int i) {
        if ((ExternalProviders.A07.A01 & TraceEvents.sProviders) != 0) {
            A02(StringFormatUtil.formatStrLocaleSafe(str, obj), i);
        } else {
            if (!Systrace.A0E(32L)) {
                return;
            }
            try {
                str = StringFormatUtil.formatStrLocaleSafe(str, obj);
            } catch (IllegalFormatException e) {
                C0K8.A0J("Tracer", "Bad format string", e);
            }
            Systrace.A03(32L, str);
        }
    }
}
