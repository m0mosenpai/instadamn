package X;

import java.nio.Buffer;
import java.nio.IntBuffer;
import org.pytorch.Tensor;

/* renamed from: X.YLf, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C73571YLf extends Tensor {
    public final IntBuffer A00;

    public final String toString() {
        return String.format("Tensor(%s, dtype=torch.int32)", AbstractC72048XLo.A1b(this.shape));
    }

    public C73571YLf(IntBuffer intBuffer, EnumC209389Nw enumC209389Nw, long[] jArr) {
        super(jArr, enumC209389Nw);
        this.A00 = intBuffer;
    }

    @Override // org.pytorch.Tensor
    public final XOF dtype() {
        return XOF.A03;
    }

    @Override // org.pytorch.Tensor
    public final Buffer getRawDataBuffer() {
        return this.A00;
    }
}
