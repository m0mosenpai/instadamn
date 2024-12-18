package X;

import java.nio.Buffer;
import java.nio.DoubleBuffer;
import org.pytorch.executorch.Tensor;

/* renamed from: X.YLj, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C73575YLj extends Tensor {
    public final DoubleBuffer A00;

    public final String toString() {
        return String.format("Tensor(%s, dtype=torch.float64)", AbstractC72048XLo.A1b(this.shape));
    }

    public C73575YLj(DoubleBuffer doubleBuffer, long[] jArr) {
        super(jArr);
        this.A00 = doubleBuffer;
    }

    @Override // org.pytorch.executorch.Tensor
    public final EnumC72348Xbk dtype() {
        return EnumC72348Xbk.A01;
    }

    @Override // org.pytorch.executorch.Tensor
    public final Buffer getRawDataBuffer() {
        return this.A00;
    }
}
