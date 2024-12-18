package X;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* loaded from: classes12.dex */
public final class Y6Z {
    public static Y6Z A06;
    public static Y6Z A07;
    public static Y6Z A08;
    public static Y6Z A09;
    public static final Executor A0A;
    public static final Executor A0B;
    public static final ExecutorService A0C;
    public Exception A00;
    public boolean A02;
    public Object A03;
    public boolean A04;
    public final Object A05 = AbstractC58318PtA.A0b();
    public List A01 = AbstractC166987dD.A1E();

    static {
        SWR swr = SWR.A03;
        A0C = swr.A01;
        A0A = swr.A00;
        A0B = SVt.A03.A00;
        A08 = new Y6Z((Object) null);
        A09 = new Y6Z((Object) true);
        A07 = new Y6Z(AbstractC166997dE.A0a());
        A06 = new Y6Z(true);
    }

    public static Y6Z A00(Callable callable) {
        ExecutorService executorService = A0C;
        C72862XpO c72862XpO = new C72862XpO();
        try {
            executorService.execute(new YH3(c72862XpO, callable));
        } catch (Exception e) {
            c72862XpO.A01(new RuntimeException("An exception was thrown by an Executor", e));
        }
        return c72862XpO.A00;
    }

    public static void A01(Y6Z y6z) {
        synchronized (y6z.A05) {
            Iterator it = y6z.A01.iterator();
            while (it.hasNext()) {
                try {
                    ((YNN) it.next()).Eq4(y6z);
                } catch (RuntimeException e) {
                    throw e;
                } catch (Exception e2) {
                    throw new RuntimeException(e2);
                }
            }
            y6z.A01 = null;
        }
    }

    public final Y6Z A02(YNN ynn, Executor executor) {
        boolean z;
        C72862XpO c72862XpO = new C72862XpO();
        synchronized (this.A05) {
            z = this.A02;
            if (!z) {
                this.A01.add(new Y99(ynn, this, c72862XpO, executor, 0));
            }
        }
        if (z) {
            try {
                executor.execute(new RunnableC73527YHx(ynn, this, c72862XpO));
            } catch (Exception e) {
                c72862XpO.A01(new RuntimeException("An exception was thrown by an Executor", e));
            }
        }
        return c72862XpO.A00;
    }

    public final Exception A03() {
        Exception exc;
        synchronized (this.A05) {
            exc = this.A00;
        }
        return exc;
    }

    public final Object A04() {
        Object obj;
        synchronized (this.A05) {
            obj = this.A03;
        }
        return obj;
    }

    public final void A05(YNN ynn, Executor executor) {
        boolean z;
        Y98 y98 = new Y98(ynn, this);
        C72862XpO c72862XpO = new C72862XpO();
        synchronized (this.A05) {
            z = this.A02;
            if (!z) {
                this.A01.add(new Y99(y98, this, c72862XpO, executor, 1));
            }
        }
        if (z) {
            try {
                executor.execute(new RunnableC73528YHy(y98, this, c72862XpO));
            } catch (Exception e) {
                c72862XpO.A01(new RuntimeException("An exception was thrown by an Executor", e));
            }
        }
    }

    public final boolean A06() {
        boolean z;
        synchronized (this.A05) {
            z = this.A04;
        }
        return z;
    }

    public final boolean A07() {
        boolean A1W;
        synchronized (this.A05) {
            A1W = AbstractC167007dF.A1W(A03());
        }
        return A1W;
    }

    public final boolean A08() {
        boolean z;
        Object obj = this.A05;
        synchronized (obj) {
            z = false;
            if (!this.A02) {
                z = true;
                this.A02 = true;
                this.A04 = true;
                obj.notifyAll();
                A01(this);
            }
        }
        return z;
    }

    public final boolean A09(Object obj) {
        boolean z;
        Object obj2 = this.A05;
        synchronized (obj2) {
            z = false;
            if (!this.A02) {
                z = true;
                this.A02 = true;
                this.A03 = obj;
                obj2.notifyAll();
                A01(this);
            }
        }
        return z;
    }

    public Y6Z(Object obj) {
        A09(obj);
    }

    public Y6Z(boolean z) {
        A08();
    }

    public Y6Z() {
    }
}
