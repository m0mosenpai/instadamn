package X;

import java.util.concurrent.Callable;

/* renamed from: X.M7y, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class CallableC50060M7y implements Callable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ LJY A01;

    public CallableC50060M7y(LJY ljy, long j) {
        this.A01 = ljy;
        this.A00 = j;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        LJY ljy = this.A01;
        AbstractC29601bb abstractC29601bb = ljy.A02;
        InterfaceC37561ot acquire = abstractC29601bb.acquire();
        acquire.ADi(1, this.A00);
        try {
            C1YP c1yp = ljy.A01;
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
