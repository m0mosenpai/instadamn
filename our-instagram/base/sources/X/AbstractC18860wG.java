package X;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import com.facebook.endtoend.EndToEnd;
import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.0wG, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC18860wG {
    public static final AtomicReference A00 = new AtomicReference();

    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, X.0LR] */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, X.0LR] */
    /* JADX WARN: Type inference failed for: r0v48, types: [java.lang.Object, X.0LR] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object, X.0LR] */
    public static final void A00() {
        C0NK c0nk = AbstractC18840wE.A00;
        if (c0nk != null && c0nk.A01 != null) {
            C0K8.A0D("lacrima", "LacrimaInitializer.init");
            final Application application = c0nk.A0J;
            C0LW A04 = c0nk.A04();
            C14360o3.A07(A04);
            if (!AbstractC22981Ad.A00 && C20150ym.A07(AbstractC20100yh.A00(36313098084157163L))) {
                if (!AbstractC02740Ay.A00) {
                    AbstractC02740Ay.A00 = true;
                    final HandlerThread handlerThread = new HandlerThread("SystemConfigReader", 10);
                    AbstractC09770fa.A00(handlerThread);
                    handlerThread.start();
                    new Handler(handlerThread.getLooper()).postDelayed(new Runnable() { // from class: X.0Ax
                        @Override // java.lang.Runnable
                        public final void run() {
                            Context context = application;
                            AbstractC02740Ay.A00(context, "anr_timeout_setting", true);
                            AbstractC02740Ay.A00(context, "lmk_minfree_setting", true);
                            File file = new File(context.getCacheDir(), "temp_service_jar_dex");
                            if (!file.exists()) {
                                file.mkdir();
                            }
                            if (file.exists()) {
                                File[] listFiles = file.listFiles();
                                if (listFiles != null) {
                                    for (File file2 : listFiles) {
                                        file2.deleteOnExit();
                                    }
                                }
                                file.deleteOnExit();
                            }
                            handlerThread.quitSafely();
                        }
                    }, 180000L);
                }
                C22991Ae.A01 = true;
            }
            if (EndToEnd.isRunningEndToEndTest()) {
                C0SM.A00(new Object(), A04, C0M6.CRITICAL_REPORT);
            }
            C22991Ae c22991Ae = new C22991Ae(application);
            C0M6 c0m6 = C0M6.LARGE_REPORT;
            C0SM.A00(c22991Ae, A04, c0m6);
            final C17410tc c17410tc = C17410tc.A00;
            C0LR c0lr = new C0LR(c17410tc) { // from class: X.082
                public final InterfaceC08830cm A00;

                {
                    C14360o3.A0B(c17410tc, 1);
                    this.A00 = c17410tc;
                }

                @Override // X.C0LR
                public final void E4h(C024209q c024209q, C0M6 c0m62) {
                    C14360o3.A0B(c024209q, 0);
                    c024209q.A03(C0LK.A3f, (String) this.A00.get());
                }

                @Override // X.C0LR
                public final Integer BW4() {
                    return C05F.A0N;
                }

                @Override // X.C0LR
                public final /* synthetic */ boolean CKv(Integer num) {
                    return false;
                }
            };
            C06M.A01(c0lr, A04, c0m6);
            C0SM.A00(c0lr, A04, c0m6);
            C0OO A05 = A04.A05(AbstractC16110rA.class);
            if (A05 == null) {
                HashMap hashMap = new HashMap();
                hashMap.put("CollectorName", C0LX.A00(C05F.A0N));
                hashMap.put("ReportCategory", c0m6.A00);
                C0PC.A00().DEh("SoftErrorDetector.addExtraCollector", new RuntimeException("Unable to add extra collector to SoftErrorDetector"), hashMap);
                C0K8.A0D("lacrima", "Cannot find registered detector");
            } else {
                A04.A07(c0lr, c0m6, A05);
            }
            C0M6 c0m62 = C0M6.CRITICAL_REPORT;
            C005801x.A02(c0lr, A04, c0m62);
            if (!C20150ym.A07(AbstractC20100yh.A00(36317504720606501L))) {
                ?? obj = new Object();
                C06M.A01(obj, A04, c0m62);
                C0SM.A00(obj, A04, c0m62);
                C005801x.A02(obj, A04, c0m62);
            }
            ?? obj2 = new Object();
            C06M.A01(obj2, A04, c0m62);
            C0SM.A00(obj2, A04, c0m62);
            C005801x.A02(obj2, A04, c0m62);
            ?? obj3 = new Object();
            C06M.A01(obj3, A04, c0m62);
            C0SM.A00(obj3, A04, c0m62);
            C005801x.A02(obj3, A04, c0m62);
            long A01 = C20150ym.A01(AbstractC20100yh.A00(36605091436172498L));
            if (A01 > 0) {
                final int i = (int) A01;
                C0LR c0lr2 = new C0LR(application, i) { // from class: X.0ta
                    public final int A00;
                    public final Context A01;

                    @Override // X.C0LR
                    public final Integer BW4() {
                        return C05F.A1E;
                    }

                    @Override // X.C0LR
                    public final /* synthetic */ boolean CKv(Integer num) {
                        return false;
                    }

                    @Override // X.C0LR
                    public final void E4h(C024209q c024209q, C0M6 c0m63) {
                        if (c024209q != null) {
                            Context context = this.A01;
                            int i2 = this.A00;
                            C51702Yt c51702Yt = C51652Yn.A03;
                            if (c51702Yt == null) {
                                c51702Yt = new C51702Yt(context);
                                C51652Yn.A03 = c51702Yt;
                            }
                            List list = c51702Yt.A07;
                            ListIterator listIterator = list.listIterator(list.size());
                            while (true) {
                                if (!listIterator.hasPrevious()) {
                                    break;
                                }
                                C2ZT c2zt = ((C2ZV) listIterator.previous()).A03;
                                if ((c2zt instanceof C2ZW) && ((C2ZW) c2zt).A00) {
                                    int nextIndex = listIterator.nextIndex();
                                    if (nextIndex > 0) {
                                        list = AbstractC001800i.A0c(list, nextIndex);
                                    }
                                }
                            }
                            List A0h = AbstractC001800i.A0h(list, i2);
                            if (!A0h.isEmpty()) {
                                C100744fd c100744fd = new C100744fd();
                                c100744fd.A01("readable", AbstractC100754fe.A05(AbstractC100734fc.A01(A0h)));
                                c100744fd.A01("json", AbstractC100734fc.A02(A0h));
                                c024209q.A03(C0LK.AA3, c100744fd.A00().toString());
                            }
                        }
                    }

                    {
                        this.A01 = application;
                        this.A00 = i;
                    }
                };
                C06M.A01(c0lr2, A04, c0m6);
                C0SM.A00(c0lr2, A04, c0m6);
                C07160Zp.A00(c0lr2, A04, c0m6);
                C0OO A052 = A04.A05(C02640An.class);
                if (A052 == null) {
                    HashMap hashMap2 = new HashMap();
                    hashMap2.put("CollectorName", C0LX.A00(C05F.A1E));
                    hashMap2.put("ReportCategory", c0m6.A00);
                    C0PC.A00().DEh("UnexplainedAppDeathDetector.addExtraCollector", new RuntimeException("Unable to add extra collector to UnexplainedAppDeathDetector"), hashMap2);
                    C0K8.A0D("lacrima", "Cannot find registered detector");
                } else {
                    A04.A07(c0lr2, c0m6, A052);
                }
            }
            if ("".equals(c0nk.A0Y.get())) {
                if (C20150ym.A07(AbstractC20100yh.A00(36324028775935825L))) {
                    C0SM.A00(new C63989SxL(), A04, c0m6);
                    C63160SeI.A02.A01(new C206359Bs(C20150ym.A03(AbstractC20100yh.A00(36886978729673463L)), C20150ym.A01(AbstractC20100yh.A00(36605503752705312L)), C20150ym.A01(AbstractC20100yh.A00(36605503752836386L)), C20150ym.A01(AbstractC20100yh.A00(36605503752901923L)), 0));
                }
                if (C20150ym.A07(AbstractC20100yh.A00(36312483905209481L))) {
                    C23001Af c23001Af = C23001Af.A00;
                    C14360o3.A07(c23001Af);
                    C06M.A01(c23001Af, A04, c0m6);
                    C0SM.A00(c23001Af, A04, c0m6);
                    C07160Zp.A00(c23001Af, A04, c0m6);
                }
                if (C20150ym.A07(AbstractC20100yh.A00(36312483905340555L))) {
                    C102044iP A002 = C102044iP.A00();
                    C14360o3.A07(A002);
                    C06M.A01(A002, A04, c0m6);
                    C0SM.A00(A002, A04, c0m6);
                    return;
                }
                return;
            }
            return;
        }
        C0K8.A0D("lacrima", "LacrimaEarlyInitializer wasn't called.");
    }
}
