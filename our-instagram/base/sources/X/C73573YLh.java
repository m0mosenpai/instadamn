package X;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import org.pytorch.Tensor;

/* renamed from: X.YLh, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C73573YLh extends Tensor {
    public final ByteBuffer A00;

    public final String toString() {
        return String.format("Tensor(%s, dtype=torch.int8)", AbstractC72048XLo.A1b(this.shape));
    }

    public C73573YLh(ByteBuffer byteBuffer, EnumC209389Nw enumC209389Nw, long[] jArr) {
        super(jArr, enumC209389Nw);
        this.A00 = byteBuffer;
    }

    @Override // org.pytorch.Tensor
    public final XOF dtype() {
        return XOF.A05;
    }

    @Override // org.pytorch.Tensor
    public final Buffer getRawDataBuffer() {
        return this.A00;
    }
}
