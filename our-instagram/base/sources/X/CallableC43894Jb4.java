package X;

import java.util.concurrent.Callable;

/* renamed from: X.Jb4, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class CallableC43894Jb4 implements Callable {
    public final /* synthetic */ C29461bN A00;

    public CallableC43894Jb4(C29461bN c29461bN) {
        this.A00 = c29461bN;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        C29461bN c29461bN = this.A00;
        AbstractC29601bb abstractC29601bb = c29461bN.A02;
        InterfaceC37561ot acquire = abstractC29601bb.acquire();
        try {
            C1YP c1yp = c29461bN.A01;
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
