package X;

import android.os.Handler;
import com.instagram.model.people.PeopleTag;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: X.Gg8, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC37552Gg8 implements JPb, InterfaceC31077DlK, XLO {
    public boolean A00;
    public boolean A01;
    public final List A02 = AbstractC166987dD.A1E();
    public final Handler A03 = AbstractC167007dF.A0J();
    public final InterfaceC16820sZ A04 = new J8W(this, 44);

    public abstract int A0B();

    public abstract int A0C(C120985dq c120985dq);

    public abstract int A0D(C38321qM c38321qM);

    public final C50526MSf A0E() {
        C50526MSf c50526MSf;
        C37525Gfh c37525Gfh = (C37525Gfh) this;
        if (c37525Gfh instanceof C37886Glg) {
            C37886Glg c37886Glg = (C37886Glg) c37525Gfh;
            ReentrantReadWriteLock.ReadLock A09 = A09(c37886Glg);
            try {
                return ((C37525Gfh) c37886Glg).A01;
            } finally {
                A09.unlock();
            }
        }
        if (c37525Gfh instanceof C37883Gld) {
            synchronized (c37525Gfh) {
                c50526MSf = c37525Gfh.A01;
            }
            return c50526MSf;
        }
        return c37525Gfh.A01;
    }

    public abstract C120985dq A0F(int i);

    public abstract C120985dq A0G(int i);

    @Override // X.InterfaceC57967PnD
    /* renamed from: A0H, reason: merged with bridge method [inline-methods] */
    public C5qT BAM(C120985dq c120985dq) {
        C14360o3.A0B(c120985dq, 0);
        return new C5qT(A0C(c120985dq), 0);
    }

    public abstract List A0J();

    public abstract List A0K(int i, int i2);

    public abstract List A0L(EnumC129395t1 enumC129395t1);

    public abstract void A0O();

    public abstract void A0P(int i, List list);

    public abstract void A0R(C120985dq c120985dq, int i);

    public abstract void A0S(C120985dq c120985dq, C120985dq c120985dq2);

    public abstract void A0T(C120985dq c120985dq, PeopleTag peopleTag);

    public abstract void A0U(C120985dq c120985dq, boolean z);

    public abstract void A0V(String str, int i);

    public abstract void A0W(List list);

    public abstract void A0X(List list);

    public abstract void A0Y(boolean z);

    public final boolean A0Z() {
        boolean isEmpty;
        C37525Gfh c37525Gfh = (C37525Gfh) this;
        if (c37525Gfh instanceof C37883Gld) {
            synchronized (c37525Gfh) {
                isEmpty = c37525Gfh.A03.isEmpty();
            }
            return isEmpty;
        }
        if (c37525Gfh instanceof C37886Glg) {
            C37886Glg c37886Glg = (C37886Glg) c37525Gfh;
            ReentrantReadWriteLock.ReadLock A09 = A09(c37886Glg);
            try {
                return ((C37525Gfh) c37886Glg).A03.isEmpty();
            } finally {
                A09.unlock();
            }
        }
        return c37525Gfh.A03.isEmpty();
    }

    public abstract boolean A0a();

    public abstract boolean A0b(C120985dq c120985dq);

    public abstract boolean A0c(C120985dq c120985dq, int i);

    @Override // X.XLO
    public void EWn(C07X c07x, MTQ mtq) {
        C14360o3.A0B(mtq, 0);
        this.A02.add(new C37553Gg9(mtq, this));
    }

    public static ReentrantReadWriteLock.ReadLock A09(C37886Glg c37886Glg) {
        ReentrantReadWriteLock.ReadLock readLock = c37886Glg.A00.readLock();
        readLock.lock();
        return readLock;
    }

    public final Iterator A0I() {
        Iterator A08;
        if (this instanceof C37883Gld) {
            synchronized (this) {
                A08 = A08(this);
            }
            return A08;
        }
        if (this instanceof C37886Glg) {
            C37886Glg c37886Glg = (C37886Glg) this;
            ReentrantReadWriteLock.ReadLock A09 = A09(c37886Glg);
            try {
                return A08(c37886Glg);
            } finally {
                A09.unlock();
            }
        }
        return A08(this);
    }

    public void A0M() {
        this.A02.clear();
    }

    public final void A0N() {
        if (this.A00) {
            if (!this.A01) {
                this.A01 = true;
                Handler handler = this.A03;
                final InterfaceC16820sZ interfaceC16820sZ = this.A04;
                handler.post(new Runnable(interfaceC16820sZ) { // from class: X.J3u
                    public final /* synthetic */ InterfaceC16820sZ A00;

                    {
                        C14360o3.A0B(interfaceC16820sZ, 1);
                        this.A00 = interfaceC16820sZ;
                    }

                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        this.A00.invoke();
                    }
                });
                return;
            }
            return;
        }
        this.A04.invoke();
    }

    public final void A0Q(C120985dq c120985dq, int i) {
        if (i >= 0) {
            DHO dho = new DHO(i, 26, c120985dq);
            List list = this.A02;
            int size = list.size();
            while (true) {
                size--;
                if (-1 < size) {
                    dho.invoke(list.get(size));
                } else {
                    return;
                }
            }
        }
    }

    public static Iterator A08(AbstractC37552Gg8 abstractC37552Gg8) {
        return abstractC37552Gg8.A0J().iterator();
    }

    public static ReentrantReadWriteLock.WriteLock A0A(ReentrantReadWriteLock reentrantReadWriteLock) {
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        return writeLock;
    }
}
