package X;

import com.facebook.odin.model.Matrix;
import com.facebook.odin.prediction.litennmodelparams.DynamicNNModelParams$Layer$Companion;
import kotlinx.serialization.ContextualSerializer;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes11.dex */
public final class UQ9 extends C0T6 {
    public final Matrix A00;
    public final float[] A01;
    public final float[] A02;
    public final float[] A03;
    public static final DynamicNNModelParams$Layer$Companion Companion = new Object();
    public static final C3R9[] A04 = {null, null, new ContextualSerializer(new C0YZ(Matrix.class), new C3R9[0]), null};

    public /* synthetic */ UQ9(Matrix matrix, float[] fArr, float[] fArr2, float[] fArr3, int i) {
        if (15 != (i & 15)) {
            AbstractC68612VXn.A00(X0Z.A01, i, 15);
            throw C00O.createAndThrow();
        }
        this.A01 = fArr;
        this.A02 = fArr2;
        this.A00 = matrix;
        this.A03 = fArr3;
    }

    public UQ9(Matrix matrix, float[] fArr, float[] fArr2, float[] fArr3) {
        this.A01 = fArr;
        this.A02 = fArr2;
        this.A00 = matrix;
        this.A03 = fArr3;
    }
}
