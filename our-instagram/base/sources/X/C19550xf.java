package X;

import com.facebook.profilo.core.TraceEvents;
import com.facebook.profilo.provider.constants.ExternalProvider;
import com.facebook.profilo.provider.constants.ExternalProviders;
import com.facebook.systrace.Systrace;

/* renamed from: X.0xf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C19550xf implements InterfaceC09730eq {
    @Override // X.InterfaceC09730eq
    public final void AWF(C09710eo c09710eo, String str, long j) {
        if (Systrace.A0E(j)) {
            String[] strArr = c09710eo.A01;
            int i = c09710eo.A00;
            ExternalProvider externalProvider = ExternalProviders.A07;
            if ((externalProvider.A01 & TraceEvents.sProviders) != 0) {
                int A00 = externalProvider.A07().A00(7, 21, -1591418627, 0L, 0);
                externalProvider.A07().A01(1, 83, A00, str);
                for (int i2 = 1; i2 < i; i2 += 2) {
                    String str2 = strArr[i2 - 1];
                    String str3 = strArr[i2];
                    if (str2 != null && str3 != null) {
                        externalProvider.A07().A01(1, 57, externalProvider.A07().A01(1, 56, A00, str2), str3);
                    }
                }
                return;
            }
            Systrace.A0C(str, strArr, i, j);
        }
    }
}
