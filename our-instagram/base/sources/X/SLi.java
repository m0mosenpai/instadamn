package X;

import java.util.concurrent.ExecutorService;

/* loaded from: classes10.dex */
public abstract class SLi {
    public final C62763SPw A00;
    public final ExecutorService A01;
    public final S16 A02;

    public final synchronized void A00(C63015Saf c63015Saf) {
        C62763SPw c62763SPw = this.A00;
        C63015Saf A00 = c62763SPw.A00(c63015Saf);
        if (A00 != null) {
            c62763SPw.A04(A00, new C63015Saf(A00.A02, A00.A00(), A00.A01 - 10, A00.A00 + 1));
            c62763SPw.A02();
        }
    }

    public SLi(C4N8 c4n8, S16 s16, ExecutorService executorService) {
        this.A01 = executorService;
        this.A02 = s16;
        this.A00 = new C62763SPw(c4n8);
    }
}
