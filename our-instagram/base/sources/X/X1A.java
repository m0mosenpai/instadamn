package X;

import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import com.shopify.checkout.models.errors.ErrorGroup;
import com.shopify.checkout.models.errors.ErrorGroupSerializer;
import com.shopify.checkout.models.errors.ParsableInternalErrorCode;
import com.shopify.checkout.models.errors.ParsableInternalErrorPayload;
import kotlin.Deprecated;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Deprecated(level = AbstractC68219VIb.HIDDEN, message = "This synthesized declaration should not be used directly")
/* loaded from: classes11.dex */
public final /* synthetic */ class X1A implements InterfaceC73823Sp {
    public static final X1A A00;
    public static final SerialDescriptor A01;

    @Override // X.C3RB
    public final /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        C14360o3.A0B(decoder, 0);
        SerialDescriptor serialDescriptor = A01;
        C3T8 ADQ = decoder.ADQ(serialDescriptor);
        C3R9[] c3r9Arr = ParsableInternalErrorPayload.A04;
        ParsableInternalErrorCode parsableInternalErrorCode = null;
        String str = null;
        String str2 = null;
        ErrorGroup errorGroup = null;
        int i = 0;
        while (true) {
            int ANz = ADQ.ANz(serialDescriptor);
            if (ANz != -1) {
                if (ANz != 0) {
                    if (ANz != 1) {
                        if (ANz != 2) {
                            if (ANz == 3) {
                                errorGroup = (ErrorGroup) ADQ.AOF(errorGroup, ErrorGroupSerializer.A00, serialDescriptor, 3);
                                i |= 8;
                            } else {
                                throw new X6K(ANz);
                            }
                        } else {
                            str2 = AbstractC65702TsY.A0e(str2, serialDescriptor, ADQ, 2);
                            i |= 4;
                        }
                    } else {
                        str = AbstractC65702TsY.A0e(str, serialDescriptor, ADQ, 1);
                        i |= 2;
                    }
                } else {
                    parsableInternalErrorCode = (ParsableInternalErrorCode) ADQ.AOF(parsableInternalErrorCode, c3r9Arr[0], serialDescriptor, 0);
                    i |= 1;
                }
            } else {
                ADQ.ASc(serialDescriptor);
                return new ParsableInternalErrorPayload(errorGroup, parsableInternalErrorCode, str, str2, i);
            }
        }
    }

    @Override // X.C3R9, X.C3RA, X.C3RB
    public final SerialDescriptor getDescriptor() {
        return A01;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [X.3Sp, java.lang.Object, X.X1A] */
    static {
        ?? obj = new Object();
        A00 = obj;
        C73833Sq c73833Sq = new C73833Sq("com.shopify.checkout.models.errors.ParsableInternalErrorPayload", obj, 4);
        c73833Sq.A00(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_CODE);
        c73833Sq.A01("underlyingError", true);
        c73833Sq.A01("reason", true);
        c73833Sq.A01("group", true);
        A01 = c73833Sq;
    }

    @Override // X.InterfaceC73823Sp
    public final C3R9[] childSerializers() {
        C3R9 c3r9 = ParsableInternalErrorPayload.A04[0];
        C3RD c3rd = C3RD.A01;
        return new C3R9[]{c3r9, AbstractC192698gB.A00(c3rd), AbstractC192698gB.A00(c3rd), ErrorGroupSerializer.A00};
    }

    @Override // X.C3RA
    public final /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        ParsableInternalErrorPayload parsableInternalErrorPayload = (ParsableInternalErrorPayload) obj;
        boolean A1R = AbstractC167007dF.A1R(0, encoder, parsableInternalErrorPayload);
        SerialDescriptor serialDescriptor = A01;
        C4D8 ADR = encoder.ADR(serialDescriptor);
        ADR.ASH(parsableInternalErrorPayload.A01, ParsableInternalErrorPayload.A04[0], serialDescriptor, 0);
        if (ADR.EiY(serialDescriptor, A1R ? 1 : 0) || parsableInternalErrorPayload.A03 != null) {
            ADR.ASG(parsableInternalErrorPayload.A03, C3RD.A01, serialDescriptor, A1R ? 1 : 0);
        }
        if (ADR.EiY(serialDescriptor, 2) || parsableInternalErrorPayload.A02 != null) {
            ADR.ASG(parsableInternalErrorPayload.A02, C3RD.A01, serialDescriptor, 2);
        }
        if (ADR.EiY(serialDescriptor, 3) || parsableInternalErrorPayload.A00 != ErrorGroup.A06) {
            ADR.ASH(parsableInternalErrorPayload.A00, ErrorGroupSerializer.A00, serialDescriptor, 3);
        }
        ADR.ASc(serialDescriptor);
    }

    @Override // X.InterfaceC73823Sp
    public final C3R9[] typeParametersSerializers() {
        return AbstractC54355O0n.A00;
    }
}
