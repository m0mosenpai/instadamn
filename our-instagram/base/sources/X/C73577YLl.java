package X;

import java.nio.Buffer;
import java.nio.LongBuffer;
import org.pytorch.executorch.Tensor;

/* renamed from: X.YLl, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C73577YLl extends Tensor {
    public final LongBuffer A00;

    public final String toString() {
        return String.format("Tensor(%s, dtype=torch.int64)", AbstractC72048XLo.A1b(this.shape));
    }

    public C73577YLl(LongBuffer longBuffer, long[] jArr) {
        super(jArr);
        this.A00 = longBuffer;
    }

    @Override // org.pytorch.executorch.Tensor
    public final EnumC72348Xbk dtype() {
        return EnumC72348Xbk.A04;
    }

    @Override // org.pytorch.executorch.Tensor
    public final Buffer getRawDataBuffer() {
        return this.A00;
    }
}
