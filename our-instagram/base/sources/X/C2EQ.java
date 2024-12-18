package X;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.2EQ, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2EQ extends AbstractC42041wu {
    public Throwable A00;
    public final AtomicReference A01 = new AtomicReference(A02);
    public static final C2ER[] A03 = new C2ER[0];
    public static final C2ER[] A02 = new C2ER[0];

    @Override // X.AbstractC42051wv
    public final void A02(InterfaceC42071wx interfaceC42071wx) {
        AtomicReference atomicReference;
        C2ER[] c2erArr;
        C2ER[] c2erArr2;
        C2ER c2er = new C2ER(interfaceC42071wx, this);
        interfaceC42071wx.Dpc(c2er);
        do {
            atomicReference = this.A01;
            c2erArr = (C2ER[]) atomicReference.get();
            if (c2erArr == A03) {
                Throwable th = this.A00;
                if (th != null) {
                    interfaceC42071wx.onError(th);
                    return;
                } else {
                    interfaceC42071wx.onComplete();
                    return;
                }
            }
            int length = c2erArr.length;
            c2erArr2 = new C2ER[length + 1];
            System.arraycopy(c2erArr, 0, c2erArr2, 0, length);
            c2erArr2[length] = c2er;
        } while (!C1EM.A00(c2erArr, c2erArr2, atomicReference));
        if (!c2er.get()) {
            return;
        }
        A03(c2er);
    }

    public final void A03(C2ER c2er) {
        AtomicReference atomicReference;
        C2ER[] c2erArr;
        C2ER[] c2erArr2;
        do {
            atomicReference = this.A01;
            c2erArr = (C2ER[]) atomicReference.get();
            if (c2erArr != A03 && c2erArr != (c2erArr2 = A02)) {
                int length = c2erArr.length;
                for (int i = 0; i < length; i++) {
                    if (c2erArr[i] == c2er) {
                        if (i >= 0) {
                            if (length != 1) {
                                c2erArr2 = new C2ER[length - 1];
                                System.arraycopy(c2erArr, 0, c2erArr2, 0, i);
                                System.arraycopy(c2erArr, i + 1, c2erArr2, i, (length - i) - 1);
                            }
                        } else {
                            return;
                        }
                    }
                }
                return;
            }
            return;
        } while (!C1EM.A00(c2erArr, c2erArr2, atomicReference));
    }

    @Override // X.InterfaceC42071wx
    public final void Dpc(InterfaceC41801wU interfaceC41801wU) {
        if (this.A01.get() == A03) {
            interfaceC41801wU.dispose();
        }
    }

    @Override // X.InterfaceC42071wx
    public final void onComplete() {
        AtomicReference atomicReference = this.A01;
        Object obj = atomicReference.get();
        Object obj2 = A03;
        if (obj != obj2) {
            C2ER[] c2erArr = (C2ER[]) atomicReference.getAndSet(obj2);
            for (C2ER c2er : c2erArr) {
                if (!c2er.get()) {
                    c2er.A00.onComplete();
                }
            }
        }
    }

    @Override // X.InterfaceC42071wx
    public final void DVo(Object obj) {
        AbstractC42141x4.A01(obj, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        for (C2ER c2er : (C2ER[]) this.A01.get()) {
            if (!c2er.get()) {
                c2er.A00.DVo(obj);
            }
        }
    }

    @Override // X.InterfaceC42071wx
    public final void onError(Throwable th) {
        AbstractC42141x4.A01(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        AtomicReference atomicReference = this.A01;
        Object obj = atomicReference.get();
        Object obj2 = A03;
        if (obj == obj2) {
            AbstractC142886co.A02(th);
            return;
        }
        this.A00 = th;
        C2ER[] c2erArr = (C2ER[]) atomicReference.getAndSet(obj2);
        for (C2ER c2er : c2erArr) {
            if (c2er.get()) {
                AbstractC142886co.A02(th);
            } else {
                c2er.A00.onError(th);
            }
        }
    }
}
