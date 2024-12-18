package X;

import com.facebook.neko.directinstall.digitalturbine.DTGenericError;
import com.facebook.neko.directinstall.digitalturbine.DTGenericErrorResponse;
import kotlin.Deprecated;
import kotlin.ReplaceWith;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Deprecated(level = AbstractC68219VIb.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
/* loaded from: classes11.dex */
public final class X0Q implements InterfaceC73823Sp {
    public static final X0Q A00;
    public static final /* synthetic */ C73833Sq A01;

    @Override // X.C3RB
    public final /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        C14360o3.A0B(decoder, 0);
        C73833Sq c73833Sq = A01;
        C3T8 ADQ = decoder.ADQ(c73833Sq);
        DTGenericError dTGenericError = null;
        int i = 0;
        while (true) {
            int ANz = ADQ.ANz(c73833Sq);
            if (ANz != -1) {
                if (ANz == 0) {
                    dTGenericError = (DTGenericError) ADQ.AOF(dTGenericError, X0P.A00, c73833Sq, 0);
                    i |= 1;
                } else {
                    throw new X6K(ANz);
                }
            } else {
                ADQ.ASc(c73833Sq);
                return new DTGenericErrorResponse(dTGenericError, i);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [X.3Sp, java.lang.Object, X.X0Q] */
    static {
        ?? obj = new Object();
        A00 = obj;
        C73833Sq c73833Sq = new C73833Sq("com.facebook.neko.directinstall.digitalturbine.DTGenericErrorResponse", obj, 1);
        c73833Sq.A00("data");
        A01 = c73833Sq;
    }

    @Override // X.InterfaceC73823Sp
    public final C3R9[] childSerializers() {
        return new C3R9[]{X0P.A00};
    }

    @Override // X.C3R9, X.C3RA, X.C3RB
    public final SerialDescriptor getDescriptor() {
        return A01;
    }

    @Override // X.C3RA
    public final /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        DTGenericErrorResponse dTGenericErrorResponse = (DTGenericErrorResponse) obj;
        AbstractC167017dG.A1N(encoder, dTGenericErrorResponse);
        C73833Sq c73833Sq = A01;
        C4D8 ADR = encoder.ADR(c73833Sq);
        ADR.ASH(dTGenericErrorResponse.A00, X0P.A00, c73833Sq, 0);
        ADR.ASc(c73833Sq);
    }

    @Override // X.InterfaceC73823Sp
    public final C3R9[] typeParametersSerializers() {
        return AbstractC54355O0n.A00;
    }
}
