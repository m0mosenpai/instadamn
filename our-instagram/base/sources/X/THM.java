package X;

import java.io.Closeable;

/* loaded from: classes10.dex */
public final class THM implements Closeable {
    public final InterfaceC65700TsM A00;
    public final InterfaceC65701TsN A01;
    public final /* synthetic */ SO5 A02;
    public final /* synthetic */ C65158TeX A03;

    public THM(SO5 so5, C65158TeX c65158TeX, InterfaceC65700TsM interfaceC65700TsM, InterfaceC65701TsN interfaceC65701TsN) {
        this.A03 = c65158TeX;
        this.A02 = so5;
        this.A01 = interfaceC65701TsN;
        this.A00 = interfaceC65700TsM;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        SO5 so5 = this.A02;
        so5.A03.A02(null, so5, true, true);
    }
}
