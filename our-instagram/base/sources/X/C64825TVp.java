package X;

import java.util.concurrent.Executor;

/* renamed from: X.TVp, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64825TVp implements InterfaceC08830cm {
    public final InterfaceC08830cm A00;
    public final InterfaceC08830cm A01;
    public final InterfaceC08830cm A02;
    public final InterfaceC08830cm A03;

    @Override // X.InterfaceC08830cm
    public final /* bridge */ /* synthetic */ Object get() {
        Executor executor = (Executor) this.A00.get();
        return new C62584SHj((InterfaceC65399TjW) this.A02.get(), (InterfaceC65676Tr6) this.A03.get(), (InterfaceC65242TgY) this.A01.get(), executor);
    }

    public C64825TVp(InterfaceC08830cm interfaceC08830cm, InterfaceC08830cm interfaceC08830cm2, InterfaceC08830cm interfaceC08830cm3, InterfaceC08830cm interfaceC08830cm4) {
        this.A00 = interfaceC08830cm;
        this.A03 = interfaceC08830cm2;
        this.A02 = interfaceC08830cm3;
        this.A01 = interfaceC08830cm4;
    }
}
