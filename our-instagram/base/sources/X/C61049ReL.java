package X;

import java.io.OutputStream;

/* renamed from: X.ReL, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C61049ReL extends OutputStream {
    public final AbstractC50522Tx A00;

    @Override // java.io.OutputStream
    public final void write(byte[] bytes) {
        AbstractC50512Tw abstractC50512Tw = (AbstractC50512Tw) this.A00;
        bytes.getClass();
        abstractC50512Tw.A01(bytes);
    }

    public C61049ReL(AbstractC50522Tx sink) {
        this.A00 = sink;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("Funnels.asOutputStream(");
        return AbstractC58323PtF.A0q(this.A00, A1C);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bytes, int off, int len) {
        AbstractC50512Tw abstractC50512Tw = (AbstractC50512Tw) this.A00;
        C18C.A03(off, off + len, bytes.length);
        abstractC50512Tw.A02(bytes, off, len);
    }

    @Override // java.io.OutputStream
    public final void write(int b) {
        ((AbstractC50512Tw) this.A00).A00((byte) b);
    }
}
