package X;

import java.util.concurrent.Callable;

/* loaded from: classes8.dex */
public final class M81 implements Callable {
    public final /* synthetic */ C49442Pb A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;

    public M81(C49442Pb c49442Pb, String str, String str2) {
        this.A00 = c49442Pb;
        this.A02 = str;
        this.A01 = str2;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        C49442Pb c49442Pb = this.A00;
        AbstractC29601bb abstractC29601bb = c49442Pb.A06;
        InterfaceC37561ot acquire = abstractC29601bb.acquire();
        acquire.ADp(1, this.A02);
        acquire.ADp(2, this.A01);
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