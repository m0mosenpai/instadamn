package X;

import android.os.Build;
import java.util.concurrent.ExecutorService;

/* renamed from: X.1Nq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC25841Nq {
    public static final void A00(AbstractC12990ll abstractC12990ll, ExecutorService executorService) {
        C14360o3.A0B(executorService, 1);
        if (Build.VERSION.SDK_INT >= 31) {
            C06090Tz c06090Tz = C06090Tz.A05;
            if (C18U.A06(c06090Tz, abstractC12990ll, 36330308018258742L)) {
                executorService.execute(new RunnableC71322Wrq((int) C18U.A01(c06090Tz, abstractC12990ll, 36611782994893141L)));
            }
        }
    }
}
