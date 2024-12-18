package X;

import java.util.concurrent.Callable;

/* renamed from: X.M7j, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class CallableC50046M7j implements Callable {
    public final /* synthetic */ C49432Pa A00;

    public CallableC50046M7j(C49432Pa c49432Pa) {
        this.A00 = c49432Pa;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        C49432Pa c49432Pa = this.A00;
        AbstractC29601bb abstractC29601bb = c49432Pa.A01;
        InterfaceC37561ot acquire = abstractC29601bb.acquire();
        try {
            C1YP c1yp = c49432Pa.A00;
            c1yp.beginTransaction();
            try {
                return AbstractC43593JPy.A14(c1yp, acquire);
            } finally {
                c1yp.endTransaction();
            }
        } finally {
            abstractC29601bb.release(acquire);
        }
    }
}
