package X;

import java.io.IOException;

/* loaded from: classes11.dex */
public final class WcD implements InterfaceC96934Xd {
    public final /* synthetic */ C4XU A00;

    public WcD(C4XU c4xu) {
        this.A00 = c4xu;
    }

    @Override // X.InterfaceC96934Xd
    public final void Coy() {
        C4XU c4xu = this.A00;
        C4XU c4xu2 = C4XU.$redex_init_class;
        c4xu.A0E.Coy();
        IOException iOException = c4xu.A0F;
        if (iOException == null) {
        } else {
            throw iOException;
        }
    }
}
