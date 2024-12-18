package X;

import java.io.Closeable;

/* loaded from: classes10.dex */
public abstract class THH implements Closeable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        InterfaceC65701TsN interfaceC65701TsN;
        if (this instanceof C65139TeE) {
            interfaceC65701TsN = ((C65139TeE) this).A01;
        } else {
            interfaceC65701TsN = ((C65138TeD) this).A00;
        }
        AbstractC63404SjZ.A09(interfaceC65701TsN);
    }
}
