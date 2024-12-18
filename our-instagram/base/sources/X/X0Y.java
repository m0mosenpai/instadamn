package X;

import com.facebook.odin.prediction.litennmodelparams.DynamicNNModelParams;
import java.util.List;
import kotlin.Deprecated;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Deprecated(level = AbstractC68219VIb.HIDDEN, message = "This synthesized declaration should not be used directly")
/* loaded from: classes11.dex */
public final /* synthetic */ class X0Y implements InterfaceC73823Sp {
    public static final X0Y A00;
    public static final SerialDescriptor A01;

    @Override // X.C3RB
    public final /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        C14360o3.A0B(decoder, 0);
        SerialDescriptor serialDescriptor = A01;
        C3T8 ADQ = decoder.ADQ(serialDescriptor);
        C3R9[] c3r9Arr = DynamicNNModelParams.A08;
        List list = null;
        List list2 = null;
        int[] iArr = null;
        List list3 = null;
        float[] fArr = null;
        float[] fArr2 = null;
        float[] fArr3 = null;
        String str = null;
        int i = 0;
        while (true) {
            int ANz = ADQ.ANz(serialDescriptor);
            switch (ANz) {
                case -1:
                    ADQ.ASc(serialDescriptor);
                    return new DynamicNNModelParams(str, list, list3, list2, fArr2, fArr3, fArr, iArr, i);
                case 0:
                    list = (List) ADQ.AOF(list, c3r9Arr[0], serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    fArr2 = (float[]) ADQ.AOF(fArr2, C3TU.A00, serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    fArr3 = (float[]) ADQ.AOF(fArr3, C3TU.A00, serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    str = ADQ.AOK(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    fArr = (float[]) ADQ.AOF(fArr, C3TU.A00, serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    list3 = (List) ADQ.AOF(list3, c3r9Arr[5], serialDescriptor, 5);
                    i |= 32;
                    break;
                case 6:
                    iArr = (int[]) ADQ.AOF(iArr, C192418fj.A00, serialDescriptor, 6);
                    i |= 64;
                    break;
                case 7:
                    list2 = (List) ADQ.AOF(list2, c3r9Arr[7], serialDescriptor, 7);
                    i |= 128;
                    break;
                default:
                    throw new X6K(ANz);
            }
        }
    }

    @Override // X.C3R9, X.C3RA, X.C3RB
    public final SerialDescriptor getDescriptor() {
        return A01;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [X.X0Y, X.3Sp, java.lang.Object] */
    static {
        ?? obj = new Object();
        A00 = obj;
        C73833Sq c73833Sq = new C73833Sq("com.facebook.odin.prediction.litennmodelparams.DynamicNNModelParams", obj, 8);
        c73833Sq.A00("featureIdList");
        c73833Sq.A00("meanVal");
        c73833Sq.A00("stdVal");
        c73833Sq.A00("normType");
        c73833Sq.A00("valRange");
        c73833Sq.A00("weights");
        c73833Sq.A00("networkArch");
        c73833Sq.A00("modelArch");
        A01 = c73833Sq;
    }

    @Override // X.InterfaceC73823Sp
    public final C3R9[] childSerializers() {
        C3R9[] c3r9Arr = DynamicNNModelParams.A08;
        C3R9 c3r9 = c3r9Arr[0];
        C3TU c3tu = C3TU.A00;
        return new C3R9[]{c3r9, c3tu, c3tu, C3RD.A01, c3tu, c3r9Arr[5], C192418fj.A00, c3r9Arr[7]};
    }

    @Override // X.C3RA
    public final /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        DynamicNNModelParams dynamicNNModelParams = (DynamicNNModelParams) obj;
        boolean A1R = AbstractC167007dF.A1R(0, encoder, dynamicNNModelParams);
        SerialDescriptor serialDescriptor = A01;
        C4D8 ADR = encoder.ADR(serialDescriptor);
        C3R9[] c3r9Arr = DynamicNNModelParams.A08;
        ADR.ASH(dynamicNNModelParams.A01, c3r9Arr[0], serialDescriptor, 0);
        C3TU c3tu = C3TU.A00;
        ADR.ASH(dynamicNNModelParams.A04, c3tu, serialDescriptor, A1R ? 1 : 0);
        ADR.ASH(dynamicNNModelParams.A05, c3tu, serialDescriptor, 2);
        ADR.ASL(dynamicNNModelParams.A00, serialDescriptor, 3);
        ADR.ASH(dynamicNNModelParams.A06, c3tu, serialDescriptor, 4);
        ADR.ASH(dynamicNNModelParams.A03, c3r9Arr[5], serialDescriptor, 5);
        ADR.ASH(dynamicNNModelParams.A07, C192418fj.A00, serialDescriptor, 6);
        ADR.ASH(dynamicNNModelParams.A02, c3r9Arr[7], serialDescriptor, 7);
        ADR.ASc(serialDescriptor);
    }

    @Override // X.InterfaceC73823Sp
    public final C3R9[] typeParametersSerializers() {
        return AbstractC54355O0n.A00;
    }
}
