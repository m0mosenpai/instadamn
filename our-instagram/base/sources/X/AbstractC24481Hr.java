package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: X.1Hr, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC24481Hr extends AbstractRunnableC14200nk {
    public static final C24491Hs A06 = new Object();
    public C1OL A00;
    public Exception A01;
    public Object A02;
    public List A03;
    public boolean A04;
    public final Object A05;

    public AbstractC24481Hr(int i) {
        super(i, 3, true, true);
        this.A05 = new Object();
        this.A03 = new ArrayList();
    }

    public final C908342w A01(InterfaceC25601Mq interfaceC25601Mq, int i, int i2) {
        return A02(interfaceC25601Mq, i, i2, false, false);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.42w] */
    public final C908342w A02(final InterfaceC25601Mq interfaceC25601Mq, final int i, final int i2, final boolean z, final boolean z2) {
        C14360o3.A0B(interfaceC25601Mq, 0);
        return new AbstractC24481Hr(i, i2, z, z2) { // from class: X.42w
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC24481Hr abstractC24481Hr = this;
                abstractC24481Hr.run();
                if (!abstractC24481Hr.A0D()) {
                    try {
                        InterfaceC25601Mq interfaceC25601Mq2 = interfaceC25601Mq;
                        Object A07 = abstractC24481Hr.A07();
                        C14360o3.A0A(A07);
                        A0A(interfaceC25601Mq2.then(A07));
                        return;
                    } catch (Exception e) {
                        e = e;
                        if (e instanceof RuntimeException) {
                            throw e;
                        }
                    }
                } else {
                    e = abstractC24481Hr.A06();
                }
                A09(e);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder();
                sb.append("HttpEngine");
                sb.append(this);
                return sb.toString();
            }
        };
    }

    public final AbstractC24481Hr A04(InterfaceC25601Mq interfaceC25601Mq, Executor executor) {
        C14360o3.A0B(executor, 1);
        return A05(interfaceC25601Mq, executor);
    }

    public final void A08(C1OL c1ol) {
        C14360o3.A0B(c1ol, 0);
        synchronized (this.A05) {
            if (c1ol.A00) {
                if (!A0C()) {
                    this.A04 = true;
                    this.A00 = c1ol;
                    A00();
                } else {
                    throw new IllegalStateException(AnonymousClass001.A0c("Task is already finished (runnable ", ") ", this.runnableId));
                }
            }
        }
    }

    private final void A00() {
        synchronized (this.A05) {
            List list = this.A03;
            C14360o3.A0A(list);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
            this.A03 = null;
        }
    }

    public final AbstractC24481Hr A03(InterfaceC25601Mq interfaceC25601Mq) {
        return A05(interfaceC25601Mq, ExecutorC24929B1d.A00);
    }

    public final AbstractC24481Hr A05(InterfaceC25601Mq interfaceC25601Mq, Executor executor) {
        boolean A0C;
        C47282Kut c47282Kut = new C47282Kut();
        M53 m53 = new M53(interfaceC25601Mq, this, c47282Kut);
        synchronized (this.A05) {
            A0C = A0C();
            if (!A0C) {
                List list = this.A03;
                C14360o3.A0A(list);
                list.add(new RunnableC24587Aui(m53, executor));
            }
        }
        if (A0C) {
            executor.execute(m53);
        }
        return c47282Kut.A00;
    }

    public final Exception A06() {
        Exception exc;
        synchronized (this.A05) {
            exc = this.A01;
        }
        return exc;
    }

    public final Object A07() {
        Object obj;
        synchronized (this.A05) {
            if (A0C()) {
                obj = this.A02;
            } else {
                throw new IllegalStateException(AnonymousClass001.A0I("Task has not finished (runnable ", ')', this.runnableId));
            }
        }
        return obj;
    }

    public final void A09(Exception exc) {
        synchronized (this.A05) {
            if (!A0C()) {
                this.A04 = true;
                this.A01 = exc;
                A00();
            } else {
                throw new IllegalStateException(AnonymousClass001.A0c("Task is already finished (runnable ", ") ", this.runnableId));
            }
        }
    }

    public final void A0A(Object obj) {
        synchronized (this.A05) {
            if (!A0C()) {
                this.A04 = true;
                this.A02 = obj;
                A00();
            } else {
                throw new IllegalStateException(AnonymousClass001.A0c("Task is already finished (runnable ", ") ", this.runnableId));
            }
        }
    }

    public final boolean A0B() {
        boolean z;
        synchronized (this.A05) {
            C1OL c1ol = this.A00;
            z = true;
            if (c1ol != null) {
                if (c1ol.A00) {
                }
            }
            z = false;
        }
        return z;
    }

    public final boolean A0C() {
        boolean z;
        synchronized (this.A05) {
            z = this.A04;
        }
        return z;
    }

    public final boolean A0D() {
        boolean z;
        synchronized (this.A05) {
            z = false;
            if (this.A01 != null) {
                z = true;
            }
        }
        return z;
    }

    public AbstractC24481Hr(int i, int i2, boolean z, boolean z2) {
        super(i, i2, z, z2);
        this.A05 = new Object();
        this.A03 = new ArrayList();
    }
}
