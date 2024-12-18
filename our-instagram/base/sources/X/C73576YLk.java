package X;

import java.nio.Buffer;
import java.nio.IntBuffer;
import org.pytorch.executorch.Tensor;

/* renamed from: X.YLk, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C73576YLk extends Tensor {
    public final IntBuffer A00;

    public final String toString() {
        return String.format("Tensor(%s, dtype=torch.int32)", AbstractC72048XLo.A1b(this.shape));
    }

    public C73576YLk(IntBuffer intBuffer, long[] jArr) {
        super(jArr);
        this.A00 = intBuffer;
    }

    @Override // org.pytorch.executorch.Tensor
    public final EnumC72348Xbk dtype() {
        return EnumC72348Xbk.A03;
    }

    @Override // org.pytorch.executorch.Tensor
    public final Buffer getRawDataBuffer() {
        return this.A00;
    }
}
