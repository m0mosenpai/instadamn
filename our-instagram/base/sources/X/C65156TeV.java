package X;

/* renamed from: X.TeV, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C65156TeV extends AbstractC64839TWf {
    public boolean A00;
    public final /* synthetic */ TWR A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C65156TeV(TWR twr) {
        super(twr);
        this.A01 = twr;
    }

    @Override // X.AbstractC64839TWf, X.InterfaceC65677Tr7
    public final long E7q(TWX twx, long j) {
        if (j >= 0) {
            if (!super.A00) {
                if (!this.A00) {
                    long E7q = super.E7q(twx, j);
                    if (E7q == -1) {
                        this.A00 = true;
                        A00();
                    } else {
                        return E7q;
                    }
                }
                return -1L;
            }
            throw AbstractC58321PtD.A0k();
        }
        throw AbstractC58319PtB.A0h("byteCount < 0: ", j);
    }

    @Override // X.InterfaceC65677Tr7, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() {
        if (!super.A00) {
            if (!this.A00) {
                A00();
            }
            super.A00 = true;
        }
    }
}
