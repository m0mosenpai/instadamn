package X;

import java.util.concurrent.Callable;

/* renamed from: X.JeC, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class CallableC44087JeC implements Callable {
    public final /* synthetic */ C49442Pb A00;
    public final /* synthetic */ String A01;

    public CallableC44087JeC(C49442Pb c49442Pb, String str) {
        this.A00 = c49442Pb;
        this.A01 = str;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        C49442Pb c49442Pb = this.A00;
        AbstractC29601bb abstractC29601bb = c49442Pb.A03;
        InterfaceC37561ot acquire = abstractC29601bb.acquire();
        acquire.ADp(1, this.A01);
        try {
            C1YP c1yp = c49442Pb.A02;
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
