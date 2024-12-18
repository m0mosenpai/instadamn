package X;

import java.util.HashSet;
import java.util.Iterator;

/* renamed from: X.4cH, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C98974cH implements C11R {
    public AbstractC115105If A00;
    public AbstractC115105If A01;
    public InterfaceC40801un A02;
    public InterfaceC40801un A03;
    public boolean A04;
    public boolean A05;
    public final C1P1 A06;
    public final C1ON A07;
    public final InterfaceC14020nS A08;
    public final java.util.Set A09;
    public final C1P1 A0A;

    public C98974cH(C1P1 c1p1, C1ON c1on, InterfaceC14020nS interfaceC14020nS) {
        C14360o3.A0B(c1on, 1);
        this.A07 = c1on;
        this.A08 = interfaceC14020nS;
        this.A06 = c1p1;
        this.A09 = new HashSet();
        C1P1 c1p12 = new C1P1() { // from class: X.4cI
            @Override // X.C1P1
            public final synchronized void onFail(AbstractC115105If abstractC115105If) {
                int A03 = C0f9.A03(-1006331159);
                C14360o3.A0B(abstractC115105If, 0);
                C98974cH c98974cH = C98974cH.this;
                c98974cH.A00 = abstractC115105If;
                C1P1 c1p13 = c98974cH.A06;
                if (c1p13 != null) {
                    c1p13.onFail(abstractC115105If);
                }
                Iterator it = c98974cH.A09.iterator();
                while (it.hasNext()) {
                    ((C1P1) it.next()).onFail(abstractC115105If);
                }
                C0f9.A0A(-369024525, A03);
            }

            @Override // X.C1P1
            public final synchronized void onFailInBackground(AbstractC115105If abstractC115105If) {
                int A03 = C0f9.A03(57307722);
                C14360o3.A0B(abstractC115105If, 0);
                C98974cH c98974cH = C98974cH.this;
                c98974cH.A01 = abstractC115105If;
                C1P1 c1p13 = c98974cH.A06;
                if (c1p13 != null) {
                    c1p13.onFailInBackground(abstractC115105If);
                }
                Iterator it = c98974cH.A09.iterator();
                while (it.hasNext()) {
                    ((C1P1) it.next()).onFailInBackground(abstractC115105If);
                }
                C0f9.A0A(1067117705, A03);
            }

            @Override // X.C1P1
            public final synchronized void onFinish() {
                int A03 = C0f9.A03(2089946364);
                C98974cH c98974cH = C98974cH.this;
                c98974cH.A04 = true;
                C1P1 c1p13 = c98974cH.A06;
                if (c1p13 != null) {
                    c1p13.onFinish();
                }
                Iterator it = c98974cH.A09.iterator();
                while (it.hasNext()) {
                    ((C1P1) it.next()).onFinish();
                }
                C0f9.A0A(1227261742, A03);
            }

            @Override // X.C1P1
            public final synchronized void onStart() {
                int A03 = C0f9.A03(1535617924);
                C98974cH c98974cH = C98974cH.this;
                c98974cH.A05 = true;
                C1P1 c1p13 = c98974cH.A06;
                if (c1p13 != null) {
                    c1p13.onStart();
                }
                Iterator it = c98974cH.A09.iterator();
                while (it.hasNext()) {
                    ((C1P1) it.next()).onStart();
                }
                C0f9.A0A(880642472, A03);
            }

            @Override // X.C1P1
            public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
                int A03 = C0f9.A03(57372988);
                InterfaceC40801un interfaceC40801un = (InterfaceC40801un) obj;
                synchronized (this) {
                    int A032 = C0f9.A03(2141000644);
                    C14360o3.A0B(interfaceC40801un, 0);
                    C98974cH c98974cH = C98974cH.this;
                    c98974cH.A02 = interfaceC40801un;
                    C1P1 c1p13 = c98974cH.A06;
                    if (c1p13 != null) {
                        c1p13.onSuccess(interfaceC40801un);
                    }
                    Iterator it = c98974cH.A09.iterator();
                    while (it.hasNext()) {
                        ((C1P1) it.next()).onSuccess(interfaceC40801un);
                    }
                    C0f9.A0A(1606911864, A032);
                }
                C0f9.A0A(551546893, A03);
            }

            @Override // X.C1P1
            public final /* bridge */ /* synthetic */ void onSuccessInBackground(Object obj) {
                int A03 = C0f9.A03(1813318779);
                InterfaceC40801un interfaceC40801un = (InterfaceC40801un) obj;
                synchronized (this) {
                    int A032 = C0f9.A03(-363529930);
                    C14360o3.A0B(interfaceC40801un, 0);
                    C98974cH c98974cH = C98974cH.this;
                    c98974cH.A03 = interfaceC40801un;
                    C1P1 c1p13 = c98974cH.A06;
                    if (c1p13 != null) {
                        c1p13.onSuccessInBackground(interfaceC40801un);
                    }
                    Iterator it = c98974cH.A09.iterator();
                    while (it.hasNext()) {
                        ((C1P1) it.next()).onSuccessInBackground(interfaceC40801un);
                    }
                    C0f9.A0A(-1628175278, A032);
                }
                C0f9.A0A(-1796546934, A03);
            }
        };
        this.A0A = c1p12;
        c1on.A00 = c1p12;
    }

    @Override // X.C11R
    public final void onCancel() {
    }

    public final String toString() {
        return "HttpEngine";
    }

    public final void A00(final C1P1 c1p1) {
        synchronized (this.A0A) {
            if (this.A05) {
                c1p1.onStart();
            }
            if (this.A03 != null) {
                InterfaceC14020nS interfaceC14020nS = this.A08;
                final int i = this.A07.A04.runnableId;
                interfaceC14020nS.ATO(new AbstractRunnableC14200nk(i) { // from class: X.5Iw
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC40801un interfaceC40801un = this.A03;
                        if (interfaceC40801un != null) {
                            c1p1.onSuccessInBackground(interfaceC40801un);
                            return;
                        }
                        throw new IllegalStateException("Required value was null.");
                    }
                });
            }
            if (this.A01 != null) {
                this.A08.ATO(new HJN(c1p1, this, this.A07.A04.runnableId));
            }
            if (this.A04) {
                int A00 = C2UD.A00(c1p1.getClass(), this.A07.A05, "ReplayableHttpRequestTask.onFinish");
                c1p1.onFinish();
                C2UD.A00.ASS(A00);
            }
            if (this.A02 != null) {
                int A002 = C2UD.A00(c1p1.getClass(), this.A07.A05, "ReplayableHttpRequestTask.onSuccess");
                InterfaceC40801un interfaceC40801un = this.A02;
                C14360o3.A0A(interfaceC40801un);
                c1p1.onSuccess(interfaceC40801un);
                C2UD.A00.ASS(A002);
            }
            if (this.A00 != null) {
                int A003 = C2UD.A00(c1p1.getClass(), this.A07.A05, "ReplayableHttpRequestTask.onFail");
                AbstractC115105If abstractC115105If = this.A00;
                C14360o3.A0A(abstractC115105If);
                c1p1.onFail(abstractC115105If);
                C2UD.A00.ASS(A003);
            }
            this.A09.add(c1p1);
        }
    }

    @Override // X.C11R
    public final String getName() {
        return AnonymousClass001.A0R("replayable ", this.A07.A05);
    }

    @Override // X.C11R
    public final int getRunnableId() {
        return this.A07.A04.runnableId;
    }

    @Override // X.C11R
    public final void onFinish() {
        this.A07.onFinish();
    }

    @Override // X.C11R
    public final void onStart() {
        this.A07.onStart();
    }

    @Override // X.C11R
    public final void run() {
        this.A07.run();
    }
}
