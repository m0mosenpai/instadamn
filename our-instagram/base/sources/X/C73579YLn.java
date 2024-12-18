package X;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import org.pytorch.executorch.Tensor;

/* renamed from: X.YLn, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C73579YLn extends Tensor {
    public final ByteBuffer A00;

    public final String toString() {
        return String.format("Tensor(%s, dtype=torch.uint8)", AbstractC72048XLo.A1b(this.shape));
    }

    public C73579YLn(ByteBuffer byteBuffer, long[] jArr) {
        super(jArr);
        this.A00 = byteBuffer;
    }

    @Override // org.pytorch.executorch.Tensor
    public final EnumC72348Xbk dtype() {
        return EnumC72348Xbk.A06;
    }

    @Override // org.pytorch.executorch.Tensor
    public final Buffer getRawDataBuffer() {
        return this.A00;
    }
}
