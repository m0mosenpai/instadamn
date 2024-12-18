package X;

import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes4.dex */
public final class B18 implements Callable {
    public final /* synthetic */ C2043992v A00;
    public final /* synthetic */ List A01;

    public B18(C2043992v c2043992v, List list) {
        this.A00 = c2043992v;
        this.A01 = list;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        C2043992v c2043992v = this.A00;
        C1YP c1yp = c2043992v.A05;
        c1yp.beginTransaction();
        try {
            c2043992v.A00.A02(this.A01);
            c1yp.setTransactionSuccessful();
            return C0eB.A00;
        } finally {
            c1yp.endTransaction();
        }
    }
}
