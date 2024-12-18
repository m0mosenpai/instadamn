package X;

import android.os.Process;
import com.facebook.systrace.Systrace;
import java.util.concurrent.CountDownLatch;

/* renamed from: X.2sV, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C62302sV implements C11R {
    public final C11Q A00;
    public final InterfaceC24551Hy A01;
    public final CountDownLatch A02 = new CountDownLatch(1);
    public final int A03;
    public final boolean A04;

    public C62302sV(C11Q c11q, InterfaceC24551Hy interfaceC24551Hy, int i, boolean z) {
        this.A00 = c11q;
        this.A01 = interfaceC24551Hy;
        this.A04 = z;
        this.A03 = i;
        c11q.A04(new InterfaceC24551Hy() { // from class: X.2sW
            @Override // X.InterfaceC24551Hy
            public final void D6Z(InterfaceC26451Qa interfaceC26451Qa, C3JX c3jx) {
            }

            @Override // X.InterfaceC24551Hy
            public final void DFq(AbstractC115105If abstractC115105If, InterfaceC26451Qa interfaceC26451Qa) {
            }

            @Override // X.InterfaceC24551Hy
            public final void DVQ(InterfaceC40801un interfaceC40801un, InterfaceC26451Qa interfaceC26451Qa, C3JX c3jx) {
            }

            @Override // X.InterfaceC24551Hy
            public final /* synthetic */ void DVR() {
            }

            @Override // X.InterfaceC24551Hy
            public final /* synthetic */ void Dg4() {
            }

            @Override // X.InterfaceC24551Hy
            public final /* synthetic */ void DgK() {
            }

            @Override // X.InterfaceC24551Hy
            public final /* synthetic */ void Dgo(InterfaceC26451Qa interfaceC26451Qa, C3JX c3jx) {
            }

            @Override // X.InterfaceC24551Hy
            public final void DFs(AbstractC115105If abstractC115105If, InterfaceC26451Qa interfaceC26451Qa) {
                C62302sV c62302sV = C62302sV.this;
                c62302sV.A00.getName();
                c62302sV.A02.countDown();
            }

            @Override // X.InterfaceC24551Hy
            public final void DVS(InterfaceC40801un interfaceC40801un, InterfaceC26451Qa interfaceC26451Qa, C3JX c3jx) {
                C62302sV c62302sV = C62302sV.this;
                c62302sV.A00.getName();
                c62302sV.A02.countDown();
            }
        }, c11q.getName());
    }

    @Override // X.C11R
    public final void onCancel() {
    }

    @Override // X.C11R
    public final void onStart() {
    }

    @Override // X.C11R
    public final String getName() {
        return this.A00.getName();
    }

    @Override // X.C11R
    public final int getRunnableId() {
        return this.A00.A00.A03;
    }

    @Override // X.C11R
    public final void onFinish() {
        if (this.A02.getCount() > 0) {
            C0w9.A03("StreamingHttpRequestConnectTask", "onFinish could not be called before the task is finished");
        }
    }

    @Override // X.C11R
    public final void run() {
        C11T.A05("This operation can't be run on UI thread.");
        if (this.A04) {
            int i = this.A03;
            Integer valueOf = Integer.valueOf(i);
            int threadPriority = Process.getThreadPriority(Process.myTid());
            if (i < threadPriority) {
                if (Systrace.A0E(1L)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("ScopedBoost priority=");
                    sb.append(valueOf);
                    C0fO.A01(sb.toString(), -1292234652);
                }
                Process.setThreadPriority(i);
                try {
                    try {
                        this.A02.await();
                    } catch (InterruptedException unused) {
                    }
                    C11Q c11q = this.A00;
                    c11q.getName();
                    c11q.A04(this.A01, c11q.getName());
                    Process.setThreadPriority(threadPriority);
                    if (Systrace.A0E(1L)) {
                        C0fO.A00(1169411848);
                        return;
                    }
                    return;
                } catch (Throwable th) {
                    Process.setThreadPriority(threadPriority);
                    if (Systrace.A0E(1L)) {
                        C0fO.A00(-868066012);
                    }
                    throw th;
                }
            }
        }
        try {
            this.A02.await();
        } catch (InterruptedException unused2) {
        }
        C11Q c11q2 = this.A00;
        c11q2.getName();
        c11q2.A04(this.A01, c11q2.getName());
    }
}
