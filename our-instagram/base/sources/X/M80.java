package X;

import java.util.concurrent.Callable;

/* loaded from: classes8.dex */
public final class M80 implements Callable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C49442Pb A01;
    public final /* synthetic */ String A02;

    public M80(C49442Pb c49442Pb, String str, int i) {
        this.A01 = c49442Pb;
        this.A00 = i;
        this.A02 = str;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        C49442Pb c49442Pb = this.A01;
        AbstractC29601bb abstractC29601bb = c49442Pb.A09;
        InterfaceC37561ot acquire = abstractC29601bb.acquire();
        acquire.ADi(1, this.A00);
        acquire.ADp(2, this.A02);
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
