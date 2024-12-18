package X;

import java.util.concurrent.Callable;

/* loaded from: classes4.dex */
public final class B11 implements Callable {
    public final /* synthetic */ C142456c7 A00;
    public final /* synthetic */ C22866A6m A01;

    public B11(C142456c7 c142456c7, C22866A6m c22866A6m) {
        this.A00 = c142456c7;
        this.A01 = c22866A6m;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        C142456c7 c142456c7 = this.A00;
        C1YP c1yp = c142456c7.A07;
        c1yp.beginTransaction();
        try {
            int A00 = c142456c7.A03.A00(this.A01);
            c1yp.setTransactionSuccessful();
            return Integer.valueOf(A00);
        } finally {
            c1yp.endTransaction();
        }
    }
}
