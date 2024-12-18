package androidx.work.impl.workers;

import X.AbstractC167017dG;
import X.AbstractC48352Kc;
import X.AbstractC58318PtA;
import X.C14360o3;
import X.C48412Ki;
import X.C48442Kl;
import X.C49182Nr;
import X.C50a;
import X.InterfaceC49062Mz;
import X.QAG;
import android.content.Context;
import android.os.Build;
import androidx.work.WorkerParameters;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import com.google.common.util.concurrent.ListenableFuture;

/* loaded from: classes10.dex */
public final class ConstraintTrackingWorker extends AbstractC48352Kc implements InterfaceC49062Mz {
    public AbstractC48352Kc A00;
    public final WorkerParameters A01;
    public final C49182Nr A02;
    public final Object A03;
    public volatile boolean A04;

    @Override // X.InterfaceC49062Mz
    public final void D7K(C50a c50a, C48412Ki c48412Ki) {
        C14360o3.A0B(c50a, 1);
        C48442Kl.A00();
        if (c50a instanceof QAG) {
            synchronized (this.A03) {
                this.A04 = true;
            }
        }
    }

    @Override // X.AbstractC48352Kc
    public final void onStopped() {
        int i;
        AbstractC48352Kc abstractC48352Kc = this.A00;
        if (abstractC48352Kc != null && !abstractC48352Kc.isStopped()) {
            if (Build.VERSION.SDK_INT >= 31) {
                i = getStopReason();
            } else {
                i = 0;
            }
            abstractC48352Kc.stop(i);
        }
    }

    @Override // X.AbstractC48352Kc
    public final ListenableFuture startWork() {
        this.mWorkerParams.A0A.execute(new Runnable() { // from class: X.TJM
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v21, types: [java.util.concurrent.Executor, java.lang.Object] */
            @Override // java.lang.Runnable
            public final void run() {
                Object c1114250g;
                Object c1114250g2;
                final ConstraintTrackingWorker constraintTrackingWorker = ConstraintTrackingWorker.this;
                C49182Nr c49182Nr = constraintTrackingWorker.A02;
                if (!c49182Nr.isCancelled()) {
                    String A03 = constraintTrackingWorker.mWorkerParams.A02.A03("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME");
                    C14360o3.A07(C48442Kl.A00());
                    if (A03 != null && A03.length() != 0) {
                        AbstractC48352Kc A00 = constraintTrackingWorker.mWorkerParams.A05.A00(constraintTrackingWorker.mAppContext, constraintTrackingWorker.A01, A03);
                        constraintTrackingWorker.A00 = A00;
                        if (A00 != null) {
                            C2L1 A002 = C2L1.A00(constraintTrackingWorker.mAppContext);
                            C14360o3.A07(A002);
                            C48412Ki CHq = A002.A04.A05().CHq(AbstractC166987dD.A19(constraintTrackingWorker.mWorkerParams.A09));
                            if (CHq != null) {
                                C2ME c2me = A002.A09;
                                C14360o3.A07(c2me);
                                C2N8 c2n8 = new C2N8(c2me);
                                C12T c12t = ((C2LB) A002.A06).A03;
                                C14360o3.A07(c12t);
                                final AnonymousClass197 A003 = C50U.A00(constraintTrackingWorker, c2n8, CHq, c12t);
                                c49182Nr.addListener(new Runnable() { // from class: X.TJN
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        AnonymousClass195 anonymousClass195 = AnonymousClass195.this;
                                        C14360o3.A0B(anonymousClass195, 0);
                                        anonymousClass195.AGH(null);
                                    }
                                }, new Object());
                                if (c2n8.A00(CHq)) {
                                    try {
                                        AbstractC48352Kc abstractC48352Kc = constraintTrackingWorker.A00;
                                        C14360o3.A0A(abstractC48352Kc);
                                        final ListenableFuture startWork = abstractC48352Kc.startWork();
                                        C14360o3.A07(startWork);
                                        startWork.addListener(new Runnable() { // from class: X.TMl
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                ConstraintTrackingWorker constraintTrackingWorker2 = ConstraintTrackingWorker.this;
                                                ListenableFuture listenableFuture = startWork;
                                                synchronized (constraintTrackingWorker2.A03) {
                                                    if (constraintTrackingWorker2.A04) {
                                                        C49182Nr c49182Nr2 = constraintTrackingWorker2.A02;
                                                        C14360o3.A06(c49182Nr2);
                                                        c49182Nr2.A07(new Object());
                                                    } else {
                                                        constraintTrackingWorker2.A02.A06(listenableFuture);
                                                    }
                                                }
                                            }
                                        }, constraintTrackingWorker.mWorkerParams.A0A);
                                        return;
                                    } catch (Throwable unused) {
                                        synchronized (constraintTrackingWorker.A03) {
                                            if (constraintTrackingWorker.A04) {
                                                c1114250g2 = new Object();
                                            } else {
                                                c1114250g2 = new C1114250g();
                                            }
                                            c49182Nr.A07(c1114250g2);
                                            return;
                                        }
                                    }
                                }
                                c1114250g = new Object();
                                c49182Nr.A07(c1114250g);
                            }
                        }
                    } else {
                        android.util.Log.e(AbstractC62300S5v.A00, "No worker to delegate to.");
                    }
                    c1114250g = new C1114250g();
                    c49182Nr.A07(c1114250g);
                }
            }
        });
        C49182Nr c49182Nr = this.A02;
        C14360o3.A06(c49182Nr);
        return c49182Nr;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, X.2Nr] */
    public ConstraintTrackingWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        AbstractC167017dG.A1P(context, workerParameters);
        this.A01 = workerParameters;
        this.A03 = AbstractC58318PtA.A0b();
        this.A02 = new Object();
    }
}
