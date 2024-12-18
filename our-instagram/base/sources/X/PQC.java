package X;

import java.io.File;

/* loaded from: classes9.dex */
public final class PQC implements Runnable {
    public final /* synthetic */ InterfaceC58039PoP A00;
    public final /* synthetic */ File A01;

    public PQC(InterfaceC58039PoP interfaceC58039PoP, File file) {
        this.A00 = interfaceC58039PoP;
        this.A01 = file;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A00.Dq9(this.A01);
    }
}
