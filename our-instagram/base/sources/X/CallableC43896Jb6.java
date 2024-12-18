package X;

import java.util.Collection;
import java.util.concurrent.Callable;

/* renamed from: X.Jb6, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class CallableC43896Jb6 implements Callable {
    public final /* synthetic */ C29461bN A00;
    public final /* synthetic */ Collection A01;

    public CallableC43896Jb6(C29461bN c29461bN, Collection collection) {
        this.A00 = c29461bN;
        this.A01 = collection;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        C29461bN c29461bN = this.A00;
        C1YP c1yp = c29461bN.A01;
        c1yp.beginTransaction();
        try {
            c29461bN.A00.insert((Iterable) this.A01);
            c1yp.setTransactionSuccessful();
            return C0eB.A00;
        } finally {
            c1yp.endTransaction();
        }
    }
}
