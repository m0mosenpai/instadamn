package X;

import java.util.List;

/* loaded from: classes9.dex */
public final class PQJ implements Runnable {
    public final /* synthetic */ OZr A00;
    public final /* synthetic */ List A01;

    public PQJ(OZr oZr, List list) {
        this.A00 = oZr;
        this.A01 = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A00.A0C.DfI(this.A01);
    }
}
