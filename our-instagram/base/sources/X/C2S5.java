package X;

import android.app.job.JobScheduler;
import android.content.Context;

/* renamed from: X.2S5, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2S5 {
    public C2SL A00;
    public final JobScheduler A01;
    public final Context A02;
    public final Context A03;

    public static Class A00(C2S5 c2s5, int i) {
        C2SL c2sl;
        C2SL c2sl2;
        try {
            synchronized (c2s5) {
                c2sl = c2s5.A00;
                if (c2sl == null) {
                    c2sl = C2SL.A00(c2s5.A02, 0);
                    c2s5.A00 = c2sl;
                }
            }
            Class cls = (Class) c2sl.A02.get(i);
            if (cls != null) {
                return cls;
            }
            synchronized (c2s5) {
                c2sl2 = c2s5.A00;
                if (c2sl2 == null) {
                    c2sl2 = C2SL.A00(c2s5.A02, 0);
                    c2s5.A00 = c2sl2;
                }
            }
            throw new RuntimeException(AnonymousClass001.A0d("jobId: ", " was not found. buildOutOfSync: ", i, c2sl2.A00));
        } catch (RuntimeException e) {
            C0K8.A0F("JobSchedulerCompat", "getServiceInfoParser Runtime Exception", e);
            return null;
        }
    }

    public C2S5(Context context) {
        this.A02 = context;
        this.A03 = context;
        this.A01 = (JobScheduler) context.getSystemService("jobscheduler");
    }
}
