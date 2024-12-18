package X;

import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: X.7pO, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class CallableC174327pO implements Callable {
    public final /* synthetic */ C142456c7 A00;
    public final /* synthetic */ List A01;

    public CallableC174327pO(C142456c7 c142456c7, List list) {
        this.A00 = c142456c7;
        this.A01 = list;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        C142456c7 c142456c7 = this.A00;
        C1YP c1yp = c142456c7.A07;
        c1yp.beginTransaction();
        try {
            c142456c7.A04.insert((Iterable) this.A01);
            c1yp.setTransactionSuccessful();
            return C0eB.A00;
        } finally {
            c1yp.endTransaction();
        }
    }
}
