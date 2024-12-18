package X;

import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: X.M7u, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class CallableC50056M7u implements Callable {
    public final /* synthetic */ C164457Xk A00;
    public final /* synthetic */ List A01;

    public CallableC50056M7u(C164457Xk c164457Xk, List list) {
        this.A00 = c164457Xk;
        this.A01 = list;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        C164457Xk c164457Xk = this.A00;
        C1YP c1yp = c164457Xk.A02;
        c1yp.beginTransaction();
        try {
            c164457Xk.A00.insert((Iterable) this.A01);
            c1yp.setTransactionSuccessful();
            return C0eB.A00;
        } finally {
            c1yp.endTransaction();
        }
    }
}
