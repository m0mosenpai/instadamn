package X;

import java.io.IOException;

/* loaded from: classes9.dex */
public final class PQD implements Runnable {
    public final /* synthetic */ InterfaceC58039PoP A00;
    public final /* synthetic */ IOException A01;

    public PQD(InterfaceC58039PoP interfaceC58039PoP, IOException iOException) {
        this.A00 = interfaceC58039PoP;
        this.A01 = iOException;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A00.DG2(this.A01);
    }
}
