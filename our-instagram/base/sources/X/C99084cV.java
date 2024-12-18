package X;

import java.util.concurrent.CountDownLatch;

/* renamed from: X.4cV, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C99084cV implements C11R {
    public AbstractC115105If A00;
    public AbstractC115105If A01;
    public InterfaceC40801un A02;
    public InterfaceC40801un A03;
    public final C1P1 A04;
    public final C98974cH A05;
    public final CountDownLatch A06 = new CountDownLatch(1);

    public C99084cV(C1P1 c1p1, C98974cH c98974cH) {
        this.A05 = c98974cH;
        this.A04 = c1p1;
        c98974cH.A00(new C1P1() { // from class: X.4cW
            @Override // X.C1P1
            public final void onFail(AbstractC115105If abstractC115105If) {
                int A03 = C0f9.A03(1250256379);
                C14360o3.A0B(abstractC115105If, 0);
                C99084cV c99084cV = C99084cV.this;
                c99084cV.A00 = abstractC115105If;
                c99084cV.A06.countDown();
                C0f9.A0A(-857949349, A03);
            }

            @Override // X.C1P1
            public final void onFailInBackground(AbstractC115105If abstractC115105If) {
                int A03 = C0f9.A03(825999570);
                C14360o3.A0B(abstractC115105If, 0);
                C99084cV.this.A01 = abstractC115105If;
                C0f9.A0A(1291006789, A03);
            }

            @Override // X.C1P1
            public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
                int A03 = C0f9.A03(1795721634);
                InterfaceC40801un interfaceC40801un = (InterfaceC40801un) obj;
                int A032 = C0f9.A03(-64091544);
                C14360o3.A0B(interfaceC40801un, 0);
                C99084cV c99084cV = C99084cV.this;
                c99084cV.A02 = interfaceC40801un;
                if (c99084cV.A06.getCount() > 0) {
                    C0w9.A03("HttpRequestConnectTask", "count down latch is not zero");
                }
                C0f9.A0A(1825582369, A032);
                C0f9.A0A(251144294, A03);
            }

            @Override // X.C1P1
            public final /* bridge */ /* synthetic */ void onSuccessInBackground(Object obj) {
                int A03 = C0f9.A03(1338386186);
                InterfaceC40801un interfaceC40801un = (InterfaceC40801un) obj;
                int A032 = C0f9.A03(716866618);
                C14360o3.A0B(interfaceC40801un, 0);
                C99084cV c99084cV = C99084cV.this;
                c99084cV.A03 = interfaceC40801un;
                c99084cV.A02 = interfaceC40801un;
                c99084cV.A06.countDown();
                C0f9.A0A(203120137, A032);
                C0f9.A0A(-1524108568, A03);
            }
        });
    }

    @Override // X.C11R
    public final void onCancel() {
    }

    @Override // X.C11R
    public final String getName() {
        return this.A05.getName();
    }

    @Override // X.C11R
    public final int getRunnableId() {
        return this.A05.A07.A04.runnableId;
    }

    @Override // X.C11R
    public final void onFinish() {
        if (this.A06.getCount() > 0) {
            C0w9.A03("HttpRequestConnectTask", "onFinish could not be called before the task is finished");
        }
        C1P1 c1p1 = this.A04;
        c1p1.onFinish();
        InterfaceC40801un interfaceC40801un = this.A02;
        if (interfaceC40801un != null) {
            c1p1.onSuccess(interfaceC40801un);
            return;
        }
        AbstractC115105If abstractC115105If = this.A00;
        if (abstractC115105If == null) {
            return;
        }
        c1p1.onFail(abstractC115105If);
    }

    @Override // X.C11R
    public final void onStart() {
        this.A04.onStart();
    }

    @Override // X.C11R
    public final void run() {
        try {
            this.A06.await();
        } catch (InterruptedException unused) {
        }
        InterfaceC40801un interfaceC40801un = this.A03;
        if (interfaceC40801un != null) {
            this.A04.onSuccessInBackground(interfaceC40801un);
            return;
        }
        AbstractC115105If abstractC115105If = this.A01;
        if (abstractC115105If == null) {
            return;
        }
        this.A04.onFailInBackground(abstractC115105If);
    }
}
