package X;

import java.io.ByteArrayOutputStream;
import java.io.Writer;

/* loaded from: classes12.dex */
public final class XRZ extends AbstractC89023y4 {
    public final ByteArrayOutputStream A00;

    @Override // X.AbstractC89023y4
    public final void A02() {
    }

    @Override // X.AbstractC89023y4
    public final int A00() {
        return this.A00.size();
    }

    @Override // X.AbstractC89023y4
    public final void A03() {
        this.A00.reset();
    }

    @Override // X.AbstractC89023y4
    public final void A05(Writer writer) {
        writer.write(this.A00.toString());
    }

    public XRZ(C88753xb c88753xb, ByteArrayOutputStream byteArrayOutputStream) {
        super(c88753xb, byteArrayOutputStream);
        this.A00 = byteArrayOutputStream;
    }

    @Override // X.AbstractC89023y4
    public final AbstractC40721uf A01() {
        return C40021tT.A01().A02(this.A00);
    }
}
