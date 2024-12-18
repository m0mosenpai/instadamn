package X;

import androidx.fragment.app.FragmentActivity;
import com.facebook.quicklog.reliability.UserFlowLogger;
import com.instagram.bugreporter.BugReportComposerFragment;
import com.instagram.bugreporter.model.BugReport;
import com.instagram.common.session.UserSession;
import com.meta.flytrap.attachment.model.BugReportAttachment;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes9.dex */
public final class NAS extends U7H {
    public final /* synthetic */ BugReportComposerFragment A00;
    public final /* synthetic */ List A01;
    public final /* synthetic */ List A02;

    public NAS(BugReportComposerFragment bugReportComposerFragment, List list, List list2) {
        this.A00 = bugReportComposerFragment;
        this.A01 = list;
        this.A02 = list2;
    }

    @Override // X.U7H
    public final /* bridge */ /* synthetic */ Object A03(Object[] objArr) {
        String str;
        List list;
        List list2;
        InterfaceC58266PsA interfaceC58266PsA;
        List list3;
        BugReportComposerFragment bugReportComposerFragment = this.A00;
        bugReportComposerFragment.A0A = true;
        try {
            list = this.A01;
            list2 = this.A02;
            interfaceC58266PsA = bugReportComposerFragment.A07;
        } catch (Exception e) {
            UserFlowLogger userFlowLogger = bugReportComposerFragment.A03;
            if (userFlowLogger == null) {
                str = "userFlowLogger";
            } else {
                userFlowLogger.flowEndFail(bugReportComposerFragment.A00, "process logs exception", e.getMessage());
                InterfaceC58266PsA interfaceC58266PsA2 = bugReportComposerFragment.A07;
                if (interfaceC58266PsA2 == null) {
                    str = "userFlowLoggerV2";
                } else {
                    interfaceC58266PsA2.AWB("processing_logs_failure", new C50259MHo(e, 27));
                }
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
        if (interfaceC58266PsA != null) {
            interfaceC58266PsA.AW9("processing_logs_start");
            UserFlowLogger userFlowLogger2 = bugReportComposerFragment.A03;
            if (userFlowLogger2 != null) {
                bugReportComposerFragment.A00 = userFlowLogger2.flowStartForMarker(396366653, "collect_attachments", true);
                FragmentActivity requireActivity = bugReportComposerFragment.requireActivity();
                AbstractC18680vv session = bugReportComposerFragment.getSession();
                if (session instanceof UserSession) {
                    UserSession userSession = (UserSession) session;
                    BugReport bugReport = bugReportComposerFragment.A08;
                    if (bugReport != null) {
                        UserFlowLogger userFlowLogger3 = bugReportComposerFragment.A03;
                        if (userFlowLogger3 != null) {
                            long j = bugReportComposerFragment.A00;
                            String str2 = bugReport.A0G;
                            AbstractC25229BEm.A1I(userSession, 1, str2);
                            ExecutorService newCachedThreadPool = Executors.newCachedThreadPool();
                            try {
                                C14360o3.A0A(newCachedThreadPool);
                                C11T.A05("This operation can't be run on UI thread.");
                                ArrayList A1E = AbstractC166987dD.A1E();
                                OLW olw = new OLW(userSession);
                                C25S A00 = C25O.A00(userSession);
                                C54762OHr c54762OHr = new C54762OHr(bugReport, userSession);
                                Iterator A0i = AbstractC31177DnL.A0i(A00.A02);
                                while (A0i.hasNext()) {
                                    CompletableFuture supplyAsync = CompletableFuture.supplyAsync(new PUX(requireActivity, userFlowLogger3, (InterfaceC449925e) A0i.next(), olw, c54762OHr, userSession, newCachedThreadPool, str2, 0, j), newCachedThreadPool);
                                    C14360o3.A07(supplyAsync);
                                    A1E.add(supplyAsync);
                                }
                                Iterator A0i2 = AbstractC31177DnL.A0i(A00.A01);
                                while (A0i2.hasNext()) {
                                    CompletableFuture supplyAsync2 = CompletableFuture.supplyAsync(new PUW(userFlowLogger3, (AnonymousClass266) A0i2.next(), olw, c54762OHr, userSession, newCachedThreadPool, str2, 0, j), newCachedThreadPool);
                                    C14360o3.A07(supplyAsync2);
                                    A1E.add(supplyAsync2);
                                }
                                Iterator A0i3 = AbstractC31177DnL.A0i(A00.A03);
                                while (A0i3.hasNext()) {
                                    CompletableFuture supplyAsync3 = CompletableFuture.supplyAsync(new PUW(userFlowLogger3, userSession, olw, bugReport, (C27Y) A0i3.next(), newCachedThreadPool, str2, 1, j), newCachedThreadPool);
                                    C14360o3.A07(supplyAsync3);
                                    A1E.add(supplyAsync3);
                                }
                                ArrayList A1E2 = AbstractC166987dD.A1E();
                                OKS oks = new OKS();
                                C54762OHr c54762OHr2 = new C54762OHr(bugReport, userSession);
                                Iterator A0i4 = AbstractC31177DnL.A0i(A00.A00);
                                while (A0i4.hasNext()) {
                                    CompletableFuture supplyAsync4 = CompletableFuture.supplyAsync(new PUX(oks, userFlowLogger3, (C26H) A0i4.next(), bugReport, c54762OHr2, userSession, newCachedThreadPool, str2, 1, j), newCachedThreadPool);
                                    C14360o3.A07(supplyAsync4);
                                    A1E2.add(supplyAsync4);
                                }
                                A1E.addAll(A1E2);
                                CompletableFuture[] completableFutureArr = (CompletableFuture[]) A1E.toArray(new CompletableFuture[0]);
                                CompletableFuture.allOf((CompletableFuture[]) Arrays.copyOf(completableFutureArr, completableFutureArr.length)).join();
                                ArrayList A0q = AbstractC167017dG.A0q(A1E);
                                Iterator it = A1E.iterator();
                                while (it.hasNext()) {
                                    A0q.add((List) ((CompletableFuture) it.next()).get());
                                }
                                list3 = AbstractC06950Ym.A1F(A0q);
                                newCachedThreadPool.shutdown();
                            } catch (Throwable th) {
                                newCachedThreadPool.shutdown();
                                throw th;
                            }
                        }
                    }
                    C14360o3.A0F("bugReport");
                    throw C00O.createAndThrow();
                }
                list3 = list;
                ArrayList A1E3 = AbstractC166987dD.A1E();
                ArrayList A1E4 = AbstractC166987dD.A1E();
                for (Object obj : list3) {
                    if (((BugReportAttachment) obj).A04) {
                        A1E3.add(obj);
                    } else {
                        A1E4.add(obj);
                    }
                }
                UserFlowLogger userFlowLogger4 = bugReportComposerFragment.A03;
                if (userFlowLogger4 != null) {
                    userFlowLogger4.flowMarkPoint(bugReportComposerFragment.A00, "ALL_ATTACHMENTS_ATTACHED");
                    BugReport bugReport2 = bugReportComposerFragment.A08;
                    if (bugReport2 != null) {
                        bugReportComposerFragment.A08 = BugReportComposerFragment.A00(bugReportComposerFragment, bugReport2, AbstractC001800i.A0S(A1E3, list), AbstractC001800i.A0S(A1E4, list2));
                        UserFlowLogger userFlowLogger5 = bugReportComposerFragment.A03;
                        if (userFlowLogger5 != null) {
                            userFlowLogger5.flowMarkPoint(bugReportComposerFragment.A00, "BUG_REPORT_BUILT");
                            UserFlowLogger userFlowLogger6 = bugReportComposerFragment.A03;
                            if (userFlowLogger6 != null) {
                                userFlowLogger6.flowEndSuccess(bugReportComposerFragment.A00);
                                bugReportComposerFragment.A0A = false;
                                InterfaceC58266PsA interfaceC58266PsA3 = bugReportComposerFragment.A07;
                                if (interfaceC58266PsA3 != null) {
                                    interfaceC58266PsA3.AW9("processing_logs_success");
                                    bugReportComposerFragment.A0A = false;
                                    return null;
                                }
                            }
                        }
                    }
                    C14360o3.A0F("bugReport");
                    throw C00O.createAndThrow();
                }
            }
            C14360o3.A0F("userFlowLogger");
            throw C00O.createAndThrow();
        }
        C14360o3.A0F("userFlowLoggerV2");
        throw C00O.createAndThrow();
    }
}
