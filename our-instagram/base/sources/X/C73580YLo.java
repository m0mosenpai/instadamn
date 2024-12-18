package X;

import java.nio.Buffer;
import java.nio.FloatBuffer;
import org.pytorch.executorch.Tensor;

/* renamed from: X.YLo, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C73580YLo extends Tensor {
    public final FloatBuffer A00;

    @Override // org.pytorch.executorch.Tensor
    public final float[] getDataAsFloatArray() {
        FloatBuffer floatBuffer = this.A00;
        floatBuffer.rewind();
        float[] fArr = new float[floatBuffer.remaining()];
        floatBuffer.get(fArr);
        return fArr;
    }

    public final String toString() {
        return String.format("Tensor(%s, dtype=torch.float32)", AbstractC72048XLo.A1b(this.shape));
    }

    public C73580YLo(FloatBuffer floatBuffer, long[] jArr) {
        super(jArr);
        this.A00 = floatBuffer;
    }

    @Override // org.pytorch.executorch.Tensor
    public final EnumC72348Xbk dtype() {
        return EnumC72348Xbk.A02;
    }

    @Override // org.pytorch.executorch.Tensor
    public final Buffer getRawDataBuffer() {
        return this.A00;
    }
}
