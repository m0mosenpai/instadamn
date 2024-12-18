package X;

import com.facebook.odin.model.Matrix;
import kotlin.Deprecated;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Deprecated(level = AbstractC68219VIb.HIDDEN, message = "This synthesized declaration should not be used directly")
/* loaded from: classes11.dex */
public final /* synthetic */ class X0Z implements InterfaceC73823Sp {
    public static final X0Z A00;
    public static final SerialDescriptor A01;

    @Override // X.C3RB
    public final /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        C14360o3.A0B(decoder, 0);
        SerialDescriptor serialDescriptor = A01;
        C3T8 ADQ = decoder.ADQ(serialDescriptor);
        C3R9[] c3r9Arr = UQ9.A04;
        float[] fArr = null;
        float[] fArr2 = null;
        Matrix matrix = null;
        float[] fArr3 = null;
        int i = 0;
        while (true) {
            int ANz = ADQ.ANz(serialDescriptor);
            if (ANz != -1) {
                if (ANz != 0) {
                    if (ANz != 1) {
                        if (ANz != 2) {
                            if (ANz == 3) {
                                fArr3 = (float[]) ADQ.AOF(fArr3, C3TU.A00, serialDescriptor, 3);
                                i |= 8;
                            } else {
                                throw new X6K(ANz);
                            }
                        } else {
                            matrix = (Matrix) ADQ.AOF(matrix, c3r9Arr[2], serialDescriptor, 2);
                            i |= 4;
                        }
                    } else {
                        fArr2 = (float[]) ADQ.AOF(fArr2, C3TU.A00, serialDescriptor, 1);
                        i |= 2;
                    }
                } else {
                    fArr = (float[]) ADQ.AOF(fArr, C3TU.A00, serialDescriptor, 0);
                    i |= 1;
                }
            } else {
                ADQ.ASc(serialDescriptor);
                return new UQ9(matrix, fArr, fArr2, fArr3, i);
            }
        }
    }

    @Override // X.C3R9, X.C3RA, X.C3RB
    public final SerialDescriptor getDescriptor() {
        return A01;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [X.X0Z, X.3Sp, java.lang.Object] */
    static {
        ?? obj = new Object();
        A00 = obj;
        C73833Sq c73833Sq = new C73833Sq("com.facebook.odin.prediction.litennmodelparams.DynamicNNModelParams.Layer", obj, 4);
        c73833Sq.A00("batchNormAlpha");
        c73833Sq.A00("batchNormBeta");
        c73833Sq.A00("weights");
        c73833Sq.A00("bias");
        A01 = c73833Sq;
    }

    @Override // X.InterfaceC73823Sp
    public final C3R9[] childSerializers() {
        C3R9[] c3r9Arr = UQ9.A04;
        C3TU c3tu = C3TU.A00;
        return new C3R9[]{c3tu, c3tu, c3r9Arr[2], c3tu};
    }

    @Override // X.C3RA
    public final /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        UQ9 uq9 = (UQ9) obj;
        boolean A1R = AbstractC167007dF.A1R(0, encoder, uq9);
        SerialDescriptor serialDescriptor = A01;
        C4D8 ADR = encoder.ADR(serialDescriptor);
        C3R9[] c3r9Arr = UQ9.A04;
        C3TU c3tu = C3TU.A00;
        ADR.ASH(uq9.A01, c3tu, serialDescriptor, 0);
        ADR.ASH(uq9.A02, c3tu, serialDescriptor, A1R ? 1 : 0);
        ADR.ASH(uq9.A00, c3r9Arr[2], serialDescriptor, 2);
        ADR.ASH(uq9.A03, c3tu, serialDescriptor, 3);
        ADR.ASc(serialDescriptor);
    }

    @Override // X.InterfaceC73823Sp
    public final C3R9[] typeParametersSerializers() {
        return AbstractC54355O0n.A00;
    }
}
