package X;

import java.nio.Buffer;
import java.nio.LongBuffer;
import org.pytorch.Tensor;

/* renamed from: X.YLg, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C73572YLg extends Tensor {
    public final LongBuffer A00;

    public final String toString() {
        return String.format("Tensor(%s, dtype=torch.int64)", AbstractC72048XLo.A1b(this.shape));
    }

    public C73572YLg(LongBuffer longBuffer, EnumC209389Nw enumC209389Nw, long[] jArr) {
        super(jArr, enumC209389Nw);
        this.A00 = longBuffer;
    }

    @Override // org.pytorch.Tensor
    public final XOF dtype() {
        return XOF.A04;
    }

    @Override // org.pytorch.Tensor
    public final Buffer getRawDataBuffer() {
        return this.A00;
    }
}
