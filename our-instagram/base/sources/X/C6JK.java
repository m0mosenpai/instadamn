package X;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.6JK, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6JK extends AtomicReference implements InterfaceC42071wx, InterfaceC41801wU {
    public static final C6JO[] A04 = new C6JO[0];
    public static final C6JO[] A05 = new C6JO[0];
    public boolean A00;
    public final C6JM A01;
    public final AtomicReference A03 = new AtomicReference(A04);
    public final AtomicBoolean A02 = new AtomicBoolean();

    public final void A00(C6JO c6jo) {
        AtomicReference atomicReference;
        C6JO[] c6joArr;
        C6JO[] c6joArr2;
        do {
            atomicReference = this.A03;
            c6joArr = (C6JO[]) atomicReference.get();
            int length = c6joArr.length;
            if (length != 0) {
                int i = 0;
                while (!c6joArr[i].equals(c6jo)) {
                    i++;
                    if (i >= length) {
                        return;
                    }
                }
                if (i >= 0) {
                    if (length == 1) {
                        c6joArr2 = A04;
                    } else {
                        c6joArr2 = new C6JO[length - 1];
                        System.arraycopy(c6joArr, 0, c6joArr2, 0, i);
                        System.arraycopy(c6joArr, i + 1, c6joArr2, i, (length - i) - 1);
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        } while (!C1EM.A00(c6joArr, c6joArr2, atomicReference));
    }

    @Override // X.InterfaceC42071wx
    public final void DVo(Object obj) {
        if (!this.A00) {
            C6JM c6jm = this.A01;
            C6JL c6jl = (C6JL) c6jm;
            C6JN c6jn = new C6JN(obj);
            c6jl.A01.set(c6jn);
            c6jl.A01 = c6jn;
            int i = c6jl.A00 + 1;
            c6jl.A00 = i;
            if (i > c6jl.A02) {
                c6jl.A00--;
                c6jl.set(((AtomicReference) c6jl.get()).get());
            }
            for (C6JO c6jo : (C6JO[]) this.A03.get()) {
                c6jm.EH6(c6jo);
            }
        }
    }

    @Override // X.InterfaceC41801wU
    public final void dispose() {
        this.A03.set(A05);
        C6KP.A01(this);
    }

    @Override // X.InterfaceC42071wx
    public final void onComplete() {
        if (!this.A00) {
            this.A00 = true;
            C6JM c6jm = this.A01;
            C6JL c6jl = (C6JL) c6jm;
            C6JN c6jn = new C6JN(EnumC42671xv.A01);
            c6jl.A01.set(c6jn);
            c6jl.A01 = c6jn;
            c6jl.A00++;
            C6JN c6jn2 = (C6JN) c6jl.get();
            if (c6jn2.A00 != null) {
                C6JN c6jn3 = new C6JN(null);
                c6jn3.lazySet(c6jn2.get());
                c6jl.set(c6jn3);
            }
            for (C6JO c6jo : (C6JO[]) this.A03.getAndSet(A05)) {
                c6jm.EH6(c6jo);
            }
        }
    }

    @Override // X.InterfaceC42071wx
    public final void onError(Throwable th) {
        if (!this.A00) {
            this.A00 = true;
            C6JM c6jm = this.A01;
            C6JL c6jl = (C6JL) c6jm;
            C6JN c6jn = new C6JN(new C42741y2(th));
            c6jl.A01.set(c6jn);
            c6jl.A01 = c6jn;
            c6jl.A00++;
            C6JN c6jn2 = (C6JN) c6jl.get();
            if (c6jn2.A00 != null) {
                C6JN c6jn3 = new C6JN(null);
                c6jn3.lazySet(c6jn2.get());
                c6jl.set(c6jn3);
            }
            for (C6JO c6jo : (C6JO[]) this.A03.getAndSet(A05)) {
                c6jm.EH6(c6jo);
            }
            return;
        }
        AbstractC142886co.A02(th);
    }

    public C6JK(C6JM c6jm) {
        this.A01 = c6jm;
    }

    @Override // X.InterfaceC42071wx
    public final void Dpc(InterfaceC41801wU interfaceC41801wU) {
        if (C6KP.A03(interfaceC41801wU, this)) {
            for (C6JO c6jo : (C6JO[]) this.A03.get()) {
                this.A01.EH6(c6jo);
            }
        }
    }
}
