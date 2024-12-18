package X;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: X.OLq, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C54831OLq {
    public boolean A00;
    public final InterfaceC16820sZ A03;
    public final InterfaceC16660sJ A04;
    public final ReentrantLock A02 = new ReentrantLock();
    public final List A01 = AbstractC166987dD.A1E();

    public final void A00(Object obj) {
        InterfaceC16820sZ interfaceC16820sZ = this.A03;
        boolean z = true;
        if (interfaceC16820sZ != null && AbstractC25231BEo.A1b(interfaceC16820sZ)) {
            A02();
        }
        if (!this.A00) {
            ReentrantLock reentrantLock = this.A02;
            reentrantLock.lock();
            try {
                if (!this.A00) {
                    this.A01.add(obj);
                    z = false;
                }
                if (!z) {
                    return;
                }
            } finally {
                reentrantLock.unlock();
            }
        }
        this.A04.invoke(obj);
    }

    public final void A01(Object obj) {
        ReentrantLock reentrantLock = this.A02;
        reentrantLock.lock();
        try {
            this.A01.remove(obj);
        } finally {
            reentrantLock.unlock();
        }
    }

    public final boolean A02() {
        boolean z = false;
        if (!this.A00) {
            ReentrantLock reentrantLock = this.A02;
            reentrantLock.lock();
            try {
                if (this.A00) {
                    return false;
                }
                z = true;
                this.A00 = true;
                List list = this.A01;
                List A0a = AbstractC001800i.A0a(list);
                list.clear();
                reentrantLock.unlock();
                InterfaceC16660sJ interfaceC16660sJ = this.A04;
                Iterator it = A0a.iterator();
                while (it.hasNext()) {
                    interfaceC16660sJ.invoke(it.next());
                }
            } finally {
                reentrantLock.unlock();
            }
        }
        return z;
    }

    public C54831OLq(InterfaceC16820sZ interfaceC16820sZ, InterfaceC16660sJ interfaceC16660sJ) {
        this.A04 = interfaceC16660sJ;
        this.A03 = interfaceC16820sZ;
    }
}
