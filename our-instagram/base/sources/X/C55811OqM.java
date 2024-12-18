package X;

import android.app.job.JobParameters;
import android.app.job.JobService;
import com.facebook.papaya.client.PapayaJNI;
import com.facebook.papaya.client.type.PapayaRestrictions;
import com.facebook.papaya.fb.instagram.papaya.PapayaExecutionJobService;
import com.google.common.util.concurrent.SettableFuture;
import java.util.HashMap;
import java.util.Locale;

/* renamed from: X.OqM, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55811OqM implements C2JL {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C55811OqM(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    @Override // X.C2JL
    public final void onFailure(Throwable th) {
        switch (this.A00) {
            case 0:
            case 1:
                JobService jobService = (JobService) this.A01;
                JobParameters jobParameters = (JobParameters) this.A02;
                if (th != null) {
                    C0K8.A07(PapayaExecutionJobService.class, "Failed to run papaya", th, new Object[0]);
                }
                jobService.jobFinished(jobParameters, false);
                return;
            default:
                return;
        }
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object, com.google.common.util.concurrent.SettableFuture] */
    @Override // X.C2JL
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        long j;
        long j2;
        JobService jobService;
        JobParameters jobParameters;
        boolean z;
        C19L c19l;
        InterfaceC16620sF c57166PZk;
        switch (this.A00) {
            case 0:
                final C54660OCm c54660OCm = (C54660OCm) obj;
                if (c54660OCm == null) {
                    jobService = (JobService) this.A01;
                    jobParameters = (JobParameters) this.A02;
                    z = false;
                    C0K8.A07(PapayaExecutionJobService.class, "Failed to run papaya", AbstractC166987dD.A14("papaya is null"), new Object[0]);
                    break;
                } else {
                    PapayaExecutionJobService papayaExecutionJobService = (PapayaExecutionJobService) this.A01;
                    JobParameters jobParameters2 = (JobParameters) this.A02;
                    synchronized (papayaExecutionJobService) {
                        int jobId = jobParameters2.getJobId();
                        if (771751936 == (jobId & 771751936)) {
                            HashMap A1G = AbstractC166987dD.A1G();
                            EnumC53241Nge enumC53241Nge = EnumC53241Nge.A03;
                            boolean z2 = true;
                            if (1 != (jobId & 1)) {
                                z2 = false;
                            }
                            long j3 = 1;
                            if (z2) {
                                j = 1;
                            } else {
                                j = 0;
                            }
                            MSX.A1N(enumC53241Nge, A1G, j);
                            EnumC53241Nge enumC53241Nge2 = EnumC53241Nge.A04;
                            if (2 == (jobId & 2)) {
                                j2 = 1;
                            } else {
                                j2 = 0;
                            }
                            MSX.A1N(enumC53241Nge2, A1G, j2);
                            EnumC53241Nge enumC53241Nge3 = EnumC53241Nge.A0B;
                            if (4 != (jobId & 4)) {
                                j3 = 0;
                            }
                            MSX.A1N(enumC53241Nge3, A1G, j3);
                            final PapayaRestrictions papayaRestrictions = new PapayaRestrictions();
                            papayaRestrictions.A00.putAll(A1G);
                            papayaExecutionJobService.A00 = c54660OCm;
                            final ?? obj2 = new Object();
                            c54660OCm.A03.execute(new Runnable() { // from class: X.PS6
                                @Override // java.lang.Runnable
                                public final void run() {
                                    C54660OCm c54660OCm2 = C54660OCm.this;
                                    PapayaRestrictions papayaRestrictions2 = papayaRestrictions;
                                    SettableFuture settableFuture = obj2;
                                    c54660OCm2.A00.A00();
                                    PapayaJNI.run(papayaRestrictions2);
                                    settableFuture.set(null);
                                }
                            });
                            C2OD.A03(new C55811OqM(1, jobParameters2, papayaExecutionJobService), obj2, C1M8.A01);
                        } else {
                            throw AbstractC166987dD.A12(String.format(Locale.ENGLISH, "0x%4x doesn't have a valid base mask!", Integer.valueOf(jobId)));
                        }
                    }
                    return;
                }
            case 1:
                jobService = (JobService) this.A01;
                jobParameters = (JobParameters) this.A02;
                z = false;
                break;
            case 2:
                C54492O5u c54492O5u = (C54492O5u) obj;
                if (c54492O5u == null) {
                    return;
                }
                OE6 oe6 = c54492O5u.A00;
                c19l = (C19L) this.A01;
                c57166PZk = new C57166PZk((InterfaceC23621Ds) null, this.A02, oe6, 42);
                AbstractC166987dD.A1Z(c57166PZk, c19l);
                return;
            default:
                C54491O5t c54491O5t = (C54491O5t) obj;
                if (c54491O5t != null) {
                    OCP ocp = c54491O5t.A00;
                    c19l = (C19L) this.A01;
                    c57166PZk = new C57158PZc(ocp, this.A02, null, 29);
                    AbstractC166987dD.A1Z(c57166PZk, c19l);
                    return;
                }
                return;
        }
        jobService.jobFinished(jobParameters, z);
    }
}
