package X;

import com.instagram.model.venue.Venue;

/* renamed from: X.Wv7, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC71502Wv7 implements Runnable {
    public final /* synthetic */ C68820Vcb A00;
    public final /* synthetic */ Venue A01;

    public RunnableC71502Wv7(C68820Vcb c68820Vcb, Venue venue) {
        this.A00 = c68820Vcb;
        this.A01 = venue;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C68820Vcb c68820Vcb = this.A00;
        if (c68820Vcb != null) {
            new C69535Vqz(c68820Vcb.A00).A00();
        }
    }
}
