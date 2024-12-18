package X;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.direct.stella.StellaIpcDirectMessagingServiceClient;
import com.instagram.jobscheduler.bgfetch.IgBgFetchJob;
import com.instagram.jobscheduler.bgfetch.IgBgFetchJobRun;
import com.instagram.jobscheduler.bgfetch.IgBgFetchMetadata;
import com.instagram.jobscheduler.bgfetch.IgBgFetchPendingJob;
import com.instagram.jobscheduler.bgfetch.scheduler.IgBgFetchSchedulerService;
import com.instagram.jobscheduler.bgfetch.scheduler.IgBgFetchSchedulerWorker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: X.4sT, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C107224sT implements InterfaceC12870lZ, InterfaceC13000lm {
    public C55075OaV A00;
    public boolean A01;
    public IgBgFetchMetadata A02;
    public boolean A03;
    public final UserSession A04;
    public final List A05;
    public final List A06;
    public final C19L A07;
    public final C2JV A08;

    /* JADX WARN: Code restructure failed: missing block: B:13:0x004b, code lost:
    
        if (r1 != false) goto L16;
     */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, X.2pF] */
    /* JADX WARN: Type inference failed for: r0v15, types: [X.2pI, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C107224sT(android.content.Context r13, com.instagram.common.session.UserSession r14, X.C2JV r15) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C107224sT.<init>(android.content.Context, com.instagram.common.session.UserSession, X.2JV):void");
    }

    public static final IgBgFetchMetadata A00(C107224sT c107224sT) {
        StringBuilder sb;
        String str;
        IgBgFetchMetadata igBgFetchMetadata = c107224sT.A02;
        if (igBgFetchMetadata == null) {
            String string = ((InterfaceC19630xq) ((L0I) c107224sT.A08.A08.getValue()).A01.getValue()).getString("IgBgFetchMetadataStorageKey", null);
            if (string != null) {
                C3R9[] c3r9Arr = IgBgFetchMetadata.A03;
                try {
                    igBgFetchMetadata = (IgBgFetchMetadata) C5KX.A00(C25117B9n.A00, AbstractC73763Sg.A03).A00(string, C57118PVh.A00);
                    if (igBgFetchMetadata == null) {
                    }
                } catch (IllegalStateException e) {
                    e = e;
                    sb = new StringBuilder();
                    str = "Corrupted metadata ";
                    sb.append(str);
                    sb.append(e);
                    C0w9.A03("IgBgFetchMetadata", sb.toString());
                    C3R9[] c3r9Arr2 = IgBgFetchMetadata.A03;
                    long currentTimeMillis = System.currentTimeMillis();
                    C16930sl c16930sl = C16930sl.A00;
                    igBgFetchMetadata = new IgBgFetchMetadata(c16930sl, c16930sl, currentTimeMillis);
                    c107224sT.A02 = igBgFetchMetadata;
                    return igBgFetchMetadata;
                } catch (Exception e2) {
                    e = e2;
                    sb = new StringBuilder();
                    str = "Corrupted metadat: ";
                    sb.append(str);
                    sb.append(e);
                    C0w9.A03("IgBgFetchMetadata", sb.toString());
                    C3R9[] c3r9Arr22 = IgBgFetchMetadata.A03;
                    long currentTimeMillis2 = System.currentTimeMillis();
                    C16930sl c16930sl2 = C16930sl.A00;
                    igBgFetchMetadata = new IgBgFetchMetadata(c16930sl2, c16930sl2, currentTimeMillis2);
                    c107224sT.A02 = igBgFetchMetadata;
                    return igBgFetchMetadata;
                }
                c107224sT.A02 = igBgFetchMetadata;
            }
            C3R9[] c3r9Arr222 = IgBgFetchMetadata.A03;
            long currentTimeMillis22 = System.currentTimeMillis();
            C16930sl c16930sl22 = C16930sl.A00;
            igBgFetchMetadata = new IgBgFetchMetadata(c16930sl22, c16930sl22, currentTimeMillis22);
            c107224sT.A02 = igBgFetchMetadata;
        }
        return igBgFetchMetadata;
    }

    public static final void A01(IgBgFetchMetadata igBgFetchMetadata, C107224sT c107224sT) {
        c107224sT.A02 = igBgFetchMetadata;
        L0I l0i = (L0I) c107224sT.A08.A08.getValue();
        String A02 = C5KX.A00(C25118B9o.A00, AbstractC73763Sg.A03).A02(igBgFetchMetadata, C57118PVh.A00);
        InterfaceC19610xo ARD = ((InterfaceC19630xq) l0i.A01.getValue()).ARD();
        ARD.E7K("IgBgFetchMetadataStorageKey", A02);
        ARD.apply();
    }

    public static final void A02(OAO oao, C107224sT c107224sT) {
        Object obj;
        int i = oao.A00;
        String A00 = MSV.A00(787);
        List singletonList = Collections.singletonList(Integer.valueOf(R.id.ig_bg_fetch_id));
        C14360o3.A07(singletonList);
        if (singletonList.contains(Integer.valueOf(i))) {
            c107224sT.A06.add(oao);
            if (c107224sT.A00 == null) {
                IgBgFetchMetadata A002 = A00(c107224sT);
                List list = A002.A02;
                Iterator it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (((IgBgFetchPendingJob) obj).A01.A00 == i) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                IgBgFetchPendingJob igBgFetchPendingJob = (IgBgFetchPendingJob) obj;
                if (igBgFetchPendingJob == null) {
                    C0w9.A03(A00, "Invoked job is not in the pending jobs list");
                    igBgFetchPendingJob = new IgBgFetchPendingJob(new IgBgFetchJob(i, System.currentTimeMillis()), System.currentTimeMillis() - 900000);
                }
                long j = A002.A00;
                List list2 = A002.A01;
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    if (((IgBgFetchPendingJob) obj2).A01.A00 != i) {
                        arrayList.add(obj2);
                    }
                }
                IgBgFetchMetadata igBgFetchMetadata = new IgBgFetchMetadata(list2, arrayList, j);
                A01(igBgFetchMetadata, c107224sT);
                Context context = oao.A01;
                UserSession userSession = c107224sT.A04;
                C2JV c2jv = c107224sT.A08;
                LG1 lg1 = (LG1) c2jv.A07.getValue();
                L21 l21 = (L21) c2jv.A05.getValue();
                List list3 = c107224sT.A05;
                ArrayList arrayList2 = new ArrayList(AbstractC06950Ym.A1E(list3, 10));
                Iterator it2 = list3.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(Integer.valueOf(((C107244sV) it2.next()).A00));
                }
                C19L c19l = c107224sT.A07;
                Object value = c2jv.A04.getValue();
                C14360o3.A07(value);
                C55075OaV c55075OaV = new C55075OaV(context, userSession, igBgFetchMetadata, igBgFetchPendingJob, l21, lg1, arrayList2, c19l, ((Number) value).longValue());
                c107224sT.A00 = c55075OaV;
                if (c55075OaV.A00 == null) {
                    c55075OaV.A00 = c107224sT;
                    IgBgFetchJobRun igBgFetchJobRun = c55075OaV.A08;
                    igBgFetchJobRun.A01 = System.currentTimeMillis();
                    long j2 = c55075OaV.A04;
                    if (j2 > 0) {
                        c55075OaV.A06.postDelayed(new PN3(c55075OaV), j2);
                    }
                    LG1 lg12 = c55075OaV.A0B;
                    IgBgFetchMetadata igBgFetchMetadata2 = c55075OaV.A09;
                    lg12.A01(igBgFetchMetadata2, new KYU(igBgFetchJobRun), new C57743PjW(c55075OaV, 3));
                    c55075OaV.A06.post(new RunnableC57000PQq(new O3P(igBgFetchMetadata2), c55075OaV));
                }
            }
        }
    }

    public static final void A03(C107224sT c107224sT) {
        if (c107224sT.A03) {
            List singletonList = Collections.singletonList(Integer.valueOf(R.id.ig_bg_fetch_id));
            C14360o3.A07(singletonList);
            Iterator it = singletonList.iterator();
            while (it.hasNext()) {
                int intValue = ((Number) it.next()).intValue();
                A8Q a8q = (A8Q) c107224sT.A08.A09.getValue();
                int i = a8q.A00;
                if (i != 1 && i != 2) {
                    try {
                        Object systemService = a8q.A01.getSystemService("jobscheduler");
                        if (systemService != null) {
                            ((JobScheduler) systemService).cancel(intValue);
                        } else {
                            throw new IllegalStateException("Required value was null.");
                            break;
                        }
                    } catch (Exception e) {
                        C0w9.A02(EnumC12410kj.A09, "IgBgFetchScheduler(NativeJobDelegate)", "cancelJobWithJobScheduler() failed: ", e);
                    }
                }
            }
            c107224sT.A03 = false;
        }
    }

    public static final void A04(C107224sT c107224sT, List list) {
        A8Q a8q;
        int i;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            IgBgFetchJob igBgFetchJob = (IgBgFetchJob) it.next();
            List singletonList = Collections.singletonList(Integer.valueOf(R.id.ig_bg_fetch_id));
            C14360o3.A07(singletonList);
            int i2 = igBgFetchJob.A00;
            Integer valueOf = Integer.valueOf(i2);
            if (singletonList.contains(valueOf) && (i = (a8q = (A8Q) c107224sT.A08.A09.getValue()).A00) != 1) {
                if (i != 2) {
                    try {
                        Context context = a8q.A01;
                        Object systemService = context.getSystemService("jobscheduler");
                        if (systemService != null) {
                            ((JobScheduler) systemService).schedule(new JobInfo.Builder(i2, new ComponentName(context, (Class<?>) IgBgFetchSchedulerService.class)).setRequiredNetworkType(1).setPersisted(true).setMinimumLatency(Math.max(igBgFetchJob.A01 - System.currentTimeMillis(), StellaIpcDirectMessagingServiceClient.KEEP_CONNECTION_ALIVE_MS)).build());
                        } else {
                            throw new IllegalStateException("Required value was null.");
                            break;
                        }
                    } catch (Exception e) {
                        C0w9.A02(EnumC12410kj.A09, "IgBgFetchScheduler(NativeJobDelegate)", "scheduleJobWithJobScheduler() failed: ", e);
                    }
                } else {
                    C48362Kd c48362Kd = new C48362Kd();
                    c48362Kd.A01(C05F.A01);
                    C48562Ky A00 = c48362Kd.A00();
                    C48552Kx c48552Kx = new C48552Kx();
                    c48552Kx.A00.put("job_id_key", valueOf);
                    C48532Kv A002 = c48552Kx.A00();
                    long max = Math.max(igBgFetchJob.A01 - System.currentTimeMillis(), StellaIpcDirectMessagingServiceClient.KEEP_CONNECTION_ALIVE_MS);
                    AbstractC48382Kf abstractC48382Kf = new AbstractC48382Kf(IgBgFetchSchedulerWorker.class);
                    abstractC48382Kf.A03(A00);
                    abstractC48382Kf.A00.A0C = A002;
                    abstractC48382Kf.A02(max, TimeUnit.MILLISECONDS);
                    C2L1.A00(a8q.A01).A03(Collections.singletonList(abstractC48382Kf.A00()));
                }
            }
        }
        c107224sT.A03 = true;
    }

    public static final void A05(C107224sT c107224sT, InterfaceC16820sZ interfaceC16820sZ) {
        if (c107224sT.A01) {
            interfaceC16820sZ.invoke();
            return;
        }
        c107224sT.A01 = true;
        C3R9[] c3r9Arr = IgBgFetchMetadata.A03;
        long currentTimeMillis = System.currentTimeMillis();
        C16930sl c16930sl = C16930sl.A00;
        IgBgFetchMetadata igBgFetchMetadata = new IgBgFetchMetadata(c16930sl, c16930sl, currentTimeMillis);
        ((LG1) c107224sT.A08.A07.getValue()).A01(igBgFetchMetadata, KYV.A00, new C50364MLq(49, igBgFetchMetadata, interfaceC16820sZ, c107224sT));
    }

    @Override // X.InterfaceC12870lZ
    public final void onAppBackgrounded() {
        int A03 = C0f9.A03(-1261821167);
        C19L c19l = this.A07;
        AbstractC23641Du.A05(AnonymousClass191.A00, new PZS(this, null, 15), c19l);
        C0f9.A0A(525527677, A03);
    }

    @Override // X.InterfaceC12870lZ
    public final void onAppForegrounded() {
        int A03 = C0f9.A03(1924350297);
        C19L c19l = this.A07;
        C206629Ct c206629Ct = new C206629Ct(this, null, 30);
        AbstractC23641Du.A03(C05F.A00, AnonymousClass191.A00, c206629Ct, c19l);
        C0f9.A0A(-2051085389, A03);
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        C218914p.A06(this);
        C19L c19l = this.A07;
        C206629Ct c206629Ct = new C206629Ct(this, null, 31);
        AbstractC23641Du.A03(C05F.A00, AnonymousClass191.A00, c206629Ct, c19l);
    }
}
