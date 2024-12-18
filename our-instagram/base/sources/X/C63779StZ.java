package X;

import java.io.InputStream;

/* renamed from: X.StZ, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63779StZ implements InterfaceC65473Tkq {
    public final C61005RdY A00;

    @Override // X.InterfaceC65473Tkq
    public final /* bridge */ /* synthetic */ Object EL4() {
        C61005RdY c61005RdY = this.A00;
        c61005RdY.reset();
        return c61005RdY;
    }

    @Override // X.InterfaceC65473Tkq
    public final void cleanup() {
        this.A00.A01();
    }

    public C63779StZ(C63361SiK c63361SiK, InputStream inputStream) {
        C61005RdY c61005RdY = new C61005RdY(c63361SiK, inputStream);
        this.A00 = c61005RdY;
        c61005RdY.mark(5242880);
    }
}
