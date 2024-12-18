package X;

import java.util.concurrent.Callable;

/* renamed from: X.B0y, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class CallableC24925B0y implements Callable {
    public final /* synthetic */ C173007nE A00;
    public final /* synthetic */ C142456c7 A01;

    public CallableC24925B0y(C173007nE c173007nE, C142456c7 c142456c7) {
        this.A01 = c142456c7;
        this.A00 = c173007nE;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        C142456c7 c142456c7 = this.A01;
        C1YP c1yp = c142456c7.A07;
        c1yp.beginTransaction();
        try {
            c142456c7.A04.insert(this.A00);
            c1yp.setTransactionSuccessful();
            return C0eB.A00;
        } finally {
            c1yp.endTransaction();
        }
    }
}
