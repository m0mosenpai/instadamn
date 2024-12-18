package X;

import com.facebook.neko.directinstall.digitalturbine.DTInstallationError;
import com.facebook.neko.directinstall.digitalturbine.DTInstallationErrorResponse;
import kotlin.Deprecated;
import kotlin.ReplaceWith;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Deprecated(level = AbstractC68219VIb.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
/* loaded from: classes11.dex */
public final class X0S implements InterfaceC73823Sp {
    public static final X0S A00;
    public static final /* synthetic */ C73833Sq A01;

    @Override // X.C3RB
    public final /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        C14360o3.A0B(decoder, 0);
        C73833Sq c73833Sq = A01;
        C3T8 ADQ = decoder.ADQ(c73833Sq);
        DTInstallationError dTInstallationError = null;
        String str = null;
        int i = 0;
        while (true) {
            int ANz = ADQ.ANz(c73833Sq);
            if (ANz != -1) {
                if (ANz != 0) {
                    if (ANz == 1) {
                        str = AbstractC65702TsY.A0e(str, c73833Sq, ADQ, 1);
                        i |= 2;
                    } else {
                        throw new X6K(ANz);
                    }
                } else {
                    dTInstallationError = (DTInstallationError) ADQ.AOF(dTInstallationError, X0R.A00, c73833Sq, 0);
                    i |= 1;
                }
            } else {
                ADQ.ASc(c73833Sq);
                return new DTInstallationErrorResponse(dTInstallationError, str, i);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [X.3Sp, java.lang.Object, X.X0S] */
    static {
        ?? obj = new Object();
        A00 = obj;
        C73833Sq c73833Sq = new C73833Sq("com.facebook.neko.directinstall.digitalturbine.DTInstallationErrorResponse", obj, 2);
        c73833Sq.A00("data");
        c73833Sq.A01("taskId", true);
        A01 = c73833Sq;
    }

    @Override // X.InterfaceC73823Sp
    public final C3R9[] childSerializers() {
        return new C3R9[]{X0R.A00, AbstractC192698gB.A00(C3RD.A01)};
    }

    @Override // X.C3R9, X.C3RA, X.C3RB
    public final SerialDescriptor getDescriptor() {
        return A01;
    }

    @Override // X.C3RA
    public final /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        DTInstallationErrorResponse dTInstallationErrorResponse = (DTInstallationErrorResponse) obj;
        boolean A1R = AbstractC167007dF.A1R(0, encoder, dTInstallationErrorResponse);
        C73833Sq c73833Sq = A01;
        C4D8 ADR = encoder.ADR(c73833Sq);
        ADR.ASH(dTInstallationErrorResponse.A00, X0R.A00, c73833Sq, 0);
        if (ADR.EiY(c73833Sq, A1R ? 1 : 0) || dTInstallationErrorResponse.A01 != null) {
            ADR.ASG(dTInstallationErrorResponse.A01, C3RD.A01, c73833Sq, A1R ? 1 : 0);
        }
        ADR.ASc(c73833Sq);
    }

    @Override // X.InterfaceC73823Sp
    public final C3R9[] typeParametersSerializers() {
        return AbstractC54355O0n.A00;
    }
}
