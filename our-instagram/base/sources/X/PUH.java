package X;

import java.util.concurrent.Callable;

/* loaded from: classes9.dex */
public final class PUH implements Callable {
    public final /* synthetic */ C49442Pb A00;
    public final /* synthetic */ C54744OFv A01;

    public PUH(C49442Pb c49442Pb, C54744OFv c54744OFv) {
        this.A00 = c49442Pb;
        this.A01 = c54744OFv;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        C49442Pb c49442Pb = this.A00;
        C1YP c1yp = c49442Pb.A02;
        c1yp.beginTransaction();
        try {
            Long valueOf = Long.valueOf(c49442Pb.A01.insertAndReturnId(this.A01));
            c1yp.setTransactionSuccessful();
            return valueOf;
        } finally {
            c1yp.endTransaction();
        }
    }
}
