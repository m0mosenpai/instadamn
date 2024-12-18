package X;

import java.io.EOFException;

/* loaded from: classes11.dex */
public final class WS4 implements XG2 {
    public final byte[] A00 = new byte[4096];

    @Override // X.XG2
    public final void AWZ(C70130W5r c70130W5r) {
    }

    @Override // X.XG2
    public final /* synthetic */ int ELK(InterfaceC71873X8g interfaceC71873X8g, int i, boolean z) {
        return ELQ(interfaceC71873X8g, i, 0, z);
    }

    @Override // X.XG2
    public final void ELS(C69702Vtx c69702Vtx, int i, int i2, int i3, long j) {
    }

    @Override // X.XG2
    public final int ELQ(InterfaceC71873X8g interfaceC71873X8g, int i, int i2, boolean z) {
        int read = interfaceC71873X8g.read(this.A00, 0, Math.min(4096, i));
        if (read == -1) {
            if (z) {
                return -1;
            }
            throw new EOFException();
        }
        return read;
    }

    @Override // X.XG2
    public final /* synthetic */ void ELL(WFa wFa, int i) {
        wFa.A0P(i);
    }

    @Override // X.XG2
    public final void ELM(WFa wFa, int i, int i2) {
        wFa.A0P(i);
    }
}
