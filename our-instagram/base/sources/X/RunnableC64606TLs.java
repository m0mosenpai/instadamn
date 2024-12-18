package X;

import java.util.Iterator;
import java.util.Map;

/* renamed from: X.TLs, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class RunnableC64606TLs implements Runnable {
    public final /* synthetic */ C63178Sed A00;

    public RunnableC64606TLs(C63178Sed c63178Sed) {
        this.A00 = c63178Sed;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C63178Sed c63178Sed = this.A00;
        Iterator A15 = AbstractC166997dE.A15(c63178Sed.A03);
        while (A15.hasNext()) {
            Map.Entry A1K = AbstractC166987dD.A1K(A15);
            long A0N = AbstractC166987dD.A0N(A1K.getKey());
            A1K.getValue();
            if (c63178Sed.A01.now() > 300000 + A0N) {
                C63178Sed.A00(c63178Sed, A0N);
                C63178Sed.A01(c63178Sed, A0N);
            }
        }
    }
}
