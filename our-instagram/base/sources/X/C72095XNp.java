package X;

import java.nio.Buffer;
import java.nio.FloatBuffer;
import org.pytorch.Tensor;

/* renamed from: X.XNp, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C72095XNp extends Tensor {
    public final FloatBuffer A00;

    @Override // org.pytorch.Tensor
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

    public C72095XNp(FloatBuffer floatBuffer, EnumC209389Nw enumC209389Nw, long[] jArr) {
        super(jArr, enumC209389Nw);
        this.A00 = floatBuffer;
    }

    @Override // org.pytorch.Tensor
    public final XOF dtype() {
        return XOF.A01;
    }

    @Override // org.pytorch.Tensor
    public final Buffer getRawDataBuffer() {
        return this.A00;
    }
}
