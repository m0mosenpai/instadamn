package X;

import java.io.Writer;

/* renamed from: X.SKk, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C62651SKk {
    public final /* synthetic */ C64434TDs A00;

    public C62651SKk(C64434TDs c64434TDs) {
        this.A00 = c64434TDs;
    }

    public final void A00(Writer writer, Object obj) {
        C64434TDs c64434TDs = this.A00;
        InterfaceC65669Tqz interfaceC65669Tqz = C64434TDs.A05;
        C64420TDe c64420TDe = new C64420TDe(c64434TDs.A00, writer, c64434TDs.A02, c64434TDs.A03, c64434TDs.A01);
        c64420TDe.A00(obj);
        c64420TDe.A00.flush();
    }
}
