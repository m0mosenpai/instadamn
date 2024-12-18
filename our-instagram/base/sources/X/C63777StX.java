package X;

import java.io.InputStream;

/* renamed from: X.StX, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63777StX implements InterfaceC65472Tkp {
    public final C63361SiK A00;

    @Override // X.InterfaceC65472Tkp
    public final /* bridge */ /* synthetic */ InterfaceC65473Tkq AEP(Object obj) {
        return new C63779StZ(this.A00, (InputStream) obj);
    }

    @Override // X.InterfaceC65472Tkp
    public final Class Avg() {
        return InputStream.class;
    }

    public C63777StX(C63361SiK c63361SiK) {
        this.A00 = c63361SiK;
    }
}
