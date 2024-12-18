package com.facebook.odin.model;

import X.AbstractC167017dG;
import X.AbstractC54355O0n;
import X.AbstractC68219VIb;
import X.C14360o3;
import X.C3R9;
import X.C3T8;
import X.C4D8;
import X.C73833Sq;
import X.InterfaceC73823Sp;
import X.X6K;
import kotlin.Deprecated;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Deprecated(level = AbstractC68219VIb.HIDDEN, message = "This synthesized declaration should not be used directly")
/* loaded from: classes11.dex */
public final /* synthetic */ class Matrix$$serializer implements InterfaceC73823Sp {
    public static final Matrix$$serializer INSTANCE;
    public static final SerialDescriptor descriptor;

    @Override // X.C3RB
    public final Matrix deserialize(Decoder decoder) {
        C14360o3.A0B(decoder, 0);
        SerialDescriptor serialDescriptor = descriptor;
        C3T8 ADQ = decoder.ADQ(serialDescriptor);
        C3R9[] c3r9Arr = Matrix.A01;
        float[][] fArr = null;
        int i = 0;
        while (true) {
            int ANz = ADQ.ANz(serialDescriptor);
            if (ANz != -1) {
                if (ANz == 0) {
                    fArr = (float[][]) ADQ.AOF(fArr, c3r9Arr[0], serialDescriptor, 0);
                    i |= 1;
                } else {
                    throw new X6K(ANz);
                }
            } else {
                ADQ.ASc(serialDescriptor);
                return new Matrix(fArr, i);
            }
        }
    }

    @Override // X.C3R9, X.C3RA, X.C3RB
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [X.3Sp, java.lang.Object, com.facebook.odin.model.Matrix$$serializer] */
    static {
        ?? obj = new Object();
        INSTANCE = obj;
        C73833Sq c73833Sq = new C73833Sq("com.facebook.odin.model.Matrix", obj, 1);
        c73833Sq.A00("matrixInternal");
        descriptor = c73833Sq;
    }

    @Override // X.InterfaceC73823Sp
    public final C3R9[] childSerializers() {
        return new C3R9[]{Matrix.A01[0]};
    }

    @Override // X.InterfaceC73823Sp
    public C3R9[] typeParametersSerializers() {
        return AbstractC54355O0n.A00;
    }

    @Override // X.C3RA
    public final void serialize(Encoder encoder, Matrix matrix) {
        AbstractC167017dG.A1N(encoder, matrix);
        SerialDescriptor serialDescriptor = descriptor;
        C4D8 ADR = encoder.ADR(serialDescriptor);
        ADR.ASH(matrix.A00, Matrix.A01[0], serialDescriptor, 0);
        ADR.ASc(serialDescriptor);
    }
}
