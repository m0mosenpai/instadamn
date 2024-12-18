package X;

import java.util.List;

/* loaded from: classes9.dex */
public final class PQI implements Runnable {
    public final /* synthetic */ C56396P2j A00;
    public final /* synthetic */ List A01;

    public PQI(C56396P2j c56396P2j, List list) {
        this.A00 = c56396P2j;
        this.A01 = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A00.A03.DfI(this.A01);
    }
}
