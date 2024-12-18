package X;

import com.facebook.profilo.logger.api.ProfiloLogger;
import com.facebook.profilo.provider.constants.ExternalProviders;
import java.io.IOException;

/* renamed from: X.0yF, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C19850yF extends C19Q {
    @Override // X.C19Q, X.C19O
    public final void onFailed(C1QW c1qw, IOException iOException) {
        int i;
        long j = c1qw.A04;
        if (ProfiloLogger.A00) {
            i = ExternalProviders.A03.A07().A00(6, 7, 0, j, 0);
        } else {
            i = -1;
        }
        ProfiloLogger.A00(i, "error", iOException.getMessage());
    }

    @Override // X.C19Q, X.C19O
    public final void onRequestUploadAttemptStart(C1QW c1qw) {
        long j = c1qw.A04;
        if (ProfiloLogger.A00) {
            ExternalProviders.A03.A07().A00(6, 11, 0, j, 0);
        }
    }

    @Override // X.C19Q, X.C19O
    public final void onResponseStarted(C1QW c1qw, C1QY c1qy, C3JQ c3jq) {
        int i;
        long j = c1qw.A04;
        if (ProfiloLogger.A00) {
            i = ExternalProviders.A03.A07().A00(6, 9, 0, j, 0);
        } else {
            i = -1;
        }
        ProfiloLogger.A00(i, "network_response_code", String.valueOf(c3jq.A01));
    }

    @Override // X.C19Q, X.C19O
    public final void onSucceeded(C1QW c1qw) {
        long j = c1qw.A04;
        if (ProfiloLogger.A00) {
            ExternalProviders.A03.A07().A00(6, 8, 0, j, 0);
        }
    }
}
