package X;

import java.util.concurrent.Callable;

/* renamed from: X.B0z, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class CallableC24926B0z implements Callable {
    public final /* synthetic */ C174377pT A00;
    public final /* synthetic */ C142456c7 A01;

    public CallableC24926B0z(C174377pT c174377pT, C142456c7 c142456c7) {
        this.A01 = c142456c7;
        this.A00 = c174377pT;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        C142456c7 c142456c7 = this.A01;
        C1YP c1yp = c142456c7.A07;
        c1yp.beginTransaction();
        try {
            c142456c7.A05.insert(this.A00);
            c1yp.setTransactionSuccessful();
            return C0eB.A00;
        } finally {
            c1yp.endTransaction();
        }
    }
}
