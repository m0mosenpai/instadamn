package X;

import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: X.M7k, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class CallableC50047M7k implements Callable {
    public final /* synthetic */ C49442Pb A00;
    public final /* synthetic */ List A01;

    public CallableC50047M7k(C49442Pb c49442Pb, List list) {
        this.A00 = c49442Pb;
        this.A01 = list;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        C49442Pb c49442Pb = this.A00;
        C1YP c1yp = c49442Pb.A02;
        c1yp.beginTransaction();
        try {
            c49442Pb.A00.A02(this.A01);
            c1yp.setTransactionSuccessful();
            return C0eB.A00;
        } finally {
            c1yp.endTransaction();
        }
    }
}
