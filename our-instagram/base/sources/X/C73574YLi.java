package X;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import org.pytorch.Tensor;

/* renamed from: X.YLi, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C73574YLi extends Tensor {
    public final ByteBuffer A00;

    public final String toString() {
        return String.format("Tensor(%s, dtype=torch.uint8)", AbstractC72048XLo.A1b(this.shape));
    }

    public C73574YLi(ByteBuffer byteBuffer, EnumC209389Nw enumC209389Nw, long[] jArr) {
        super(jArr, enumC209389Nw);
        this.A00 = byteBuffer;
    }

    @Override // org.pytorch.Tensor
    public final XOF dtype() {
        return XOF.A06;
    }

    @Override // org.pytorch.Tensor
    public final Buffer getRawDataBuffer() {
        return this.A00;
    }
}
