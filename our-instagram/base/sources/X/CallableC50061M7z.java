package X;

import java.util.concurrent.Callable;

/* renamed from: X.M7z, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class CallableC50061M7z implements Callable {
    public final /* synthetic */ C49442Pb A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;

    public CallableC50061M7z(C49442Pb c49442Pb, String str, String str2) {
        this.A00 = c49442Pb;
        this.A01 = str;
        this.A02 = str2;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        C49442Pb c49442Pb = this.A00;
        AbstractC29601bb abstractC29601bb = c49442Pb.A07;
        InterfaceC37561ot acquire = abstractC29601bb.acquire();
        acquire.ADp(1, this.A01);
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
