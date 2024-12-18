package com.facebook.common.errorreporting.memory.service.jobschedulercompat.igsvc;

import X.AbstractC121025du;
import X.AbstractC41291ve;
import X.C0Pe;
import X.QFb;
import com.facebook.common.jobscheduler.compat.JobServiceCompat;

/* loaded from: classes.dex */
public class DumperUploadService extends JobServiceCompat {
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, X.5du] */
    @Override // com.facebook.common.jobscheduler.compat.JobServiceCompat
    public final AbstractC121025du A00() {
        if (AbstractC41291ve.A04 != null && C0Pe.A0A != null) {
            AbstractC41291ve.A00();
            return new Object();
        }
        AbstractC41291ve.A05 = true;
        return new QFb(this);
    }
}
