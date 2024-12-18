package X;

import java.nio.Buffer;
import java.nio.DoubleBuffer;
import org.pytorch.Tensor;

/* renamed from: X.YLe, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C73570YLe extends Tensor {
    public final DoubleBuffer A00;

    public final String toString() {
        return String.format("Tensor(%s, dtype=torch.float64)", AbstractC72048XLo.A1b(this.shape));
    }

    public C73570YLe(DoubleBuffer doubleBuffer, EnumC209389Nw enumC209389Nw, long[] jArr) {
        super(jArr, enumC209389Nw);
        this.A00 = doubleBuffer;
    }

    @Override // org.pytorch.Tensor
    public final XOF dtype() {
        return XOF.A02;
    }

    @Override // org.pytorch.Tensor
    public final Buffer getRawDataBuffer() {
        return this.A00;
    }
}
