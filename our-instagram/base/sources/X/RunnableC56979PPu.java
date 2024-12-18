package X;

import android.graphics.Bitmap;

/* renamed from: X.PPu, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class RunnableC56979PPu implements Runnable {
    public final /* synthetic */ Bitmap A00;
    public final /* synthetic */ C52379NGa A01;

    public RunnableC56979PPu(Bitmap bitmap, C52379NGa c52379NGa) {
        this.A01 = c52379NGa;
        this.A00 = bitmap;
    }

    @Override // java.lang.Runnable
    public final void run() {
        O7H o7h = this.A01.A00;
        InterfaceC57932Pmc interfaceC57932Pmc = (InterfaceC57932Pmc) o7h.A01.get();
        if (interfaceC57932Pmc != null) {
            interfaceC57932Pmc.Czq(o7h.A00, this.A00);
        }
    }
}
