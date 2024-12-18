package X;

import android.app.job.JobService;
import android.content.Context;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.util.offline.BackgroundPrefetchJobService;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.PQq, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class RunnableC57000PQq implements Runnable {
    public final /* synthetic */ O3P A00;
    public final /* synthetic */ C55075OaV A01;

    public RunnableC57000PQq(O3P o3p, C55075OaV c55075OaV) {
        this.A01 = c55075OaV;
        this.A00 = o3p;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v5, types: [com.instagram.util.offline.BackgroundPrefetchJobService] */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, X.OIT] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, X.OIT] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object, X.OIT] */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.Object, X.OIT] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.Object, X.OIT] */
    @Override // java.lang.Runnable
    public final void run() {
        OIT oit;
        Integer valueOf;
        InterfaceC111304zt interfaceC111304zt;
        OIT oit2;
        ?? r1;
        ArrayList A1E = AbstractC166987dD.A1E();
        C55075OaV c55075OaV = this.A01;
        Iterator it = c55075OaV.A0D.iterator();
        while (it.hasNext()) {
            int A0B = AbstractC167007dF.A0B(it);
            String A0O = AnonymousClass001.A0O("IgBgFetchServiceStatic-", A0B);
            O3P o3p = this.A00;
            AbstractC09800fd.A01(A0O, 783382999);
            try {
                Context context = c55075OaV.A05;
                UserSession userSession = c55075OaV.A07;
                if (A0B != 0) {
                    if (A0B != 1) {
                        if (A0B != 2) {
                            if (A0B != 3) {
                                if (A0B == 4) {
                                    valueOf = Integer.valueOf(R.id.story_background_prefetch_job_scheduler_id);
                                    JobService jobService = new JobService();
                                    final ?? obj = new Object();
                                    interfaceC111304zt = new InterfaceC111304zt() { // from class: X.PIc
                                        @Override // X.InterfaceC111304zt
                                        public final void DHJ(Integer num, boolean z) {
                                            OIT.this.A00();
                                        }
                                    };
                                    r1 = jobService;
                                    oit2 = obj;
                                } else {
                                    throw AbstractC166987dD.A12(String.format(AbstractC111324zv.A00(55), Integer.valueOf(A0B)));
                                }
                            } else {
                                valueOf = Integer.valueOf(R.id.feed_background_prefetch_job_scheduler_id);
                                JobService jobService2 = new JobService();
                                final ?? obj2 = new Object();
                                interfaceC111304zt = new InterfaceC111304zt() { // from class: X.PIc
                                    @Override // X.InterfaceC111304zt
                                    public final void DHJ(Integer num, boolean z) {
                                        OIT.this.A00();
                                    }
                                };
                                r1 = jobService2;
                                oit2 = obj2;
                            }
                        } else {
                            valueOf = Integer.valueOf(R.id.background_prefetch_job_scheduler_id);
                            JobService jobService3 = new JobService();
                            final ?? obj3 = new Object();
                            interfaceC111304zt = new InterfaceC111304zt() { // from class: X.PIc
                                @Override // X.InterfaceC111304zt
                                public final void DHJ(Integer num, boolean z) {
                                    OIT.this.A00();
                                }
                            };
                            r1 = jobService3;
                            oit2 = obj3;
                        }
                        BackgroundPrefetchJobService.A00(context, userSession, interfaceC111304zt, r1, valueOf);
                        oit = oit2;
                    } else {
                        C106044qJ c106044qJ = AbstractC107234sU.A00;
                        if (!AbstractC166987dD.A1b(o3p.A00.A01)) {
                            ?? obj4 = new Object();
                            AbstractC107234sU.A00.A00(new C56398P2l(obj4));
                            obj4.A01 = C57367PdR.A00;
                            oit = obj4;
                        }
                    }
                    oit.A00 = c55075OaV;
                    A1E.add(oit);
                    AbstractC09800fd.A00(-1681129606);
                } else if (!AbstractC166987dD.A1b(o3p.A00.A01)) {
                    System.currentTimeMillis();
                    AbstractC166987dD.A0x(userSession).getLong("last_ccu_timestamp_with_jobscheduler", 0L);
                }
                ?? obj5 = new Object();
                obj5.A00();
                oit = obj5;
                oit.A00 = c55075OaV;
                A1E.add(oit);
                AbstractC09800fd.A00(-1681129606);
            } catch (Throwable th) {
                AbstractC09800fd.A00(-843407931);
                throw th;
            }
        }
        AbstractC166987dD.A1Z(new PZH(A1E, c55075OaV, null, 11), c55075OaV.A0E);
    }
}
