package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.shopify.checkout.models.errors.CheckoutErrorPayload;
import com.shopify.checkout.models.errors.CheckoutErrorType;
import com.shopify.checkout.models.errors.CheckoutErrorTypeSerializer;
import com.shopify.checkout.models.errors.ErrorGroup;
import com.shopify.checkout.models.errors.ErrorGroupSerializer;
import kotlin.Deprecated;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Deprecated(level = AbstractC68219VIb.HIDDEN, message = "This synthesized declaration should not be used directly")
/* loaded from: classes11.dex */
public final /* synthetic */ class X18 implements InterfaceC73823Sp {
    public static final X18 A00;
    public static final SerialDescriptor A01;

    @Override // X.C3RB
    public final /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        C14360o3.A0B(decoder, 0);
        SerialDescriptor serialDescriptor = A01;
        C3T8 ADQ = decoder.ADQ(serialDescriptor);
        String str = null;
        CheckoutErrorType checkoutErrorType = null;
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
                        checkoutErrorType = (CheckoutErrorType) ADQ.AOF(checkoutErrorType, CheckoutErrorTypeSerializer.A00, serialDescriptor, 1);
                        i |= 2;
                    }
                } else {
                    str = ADQ.AOK(serialDescriptor, 0);
                    i |= 1;
                }
            } else {
                ADQ.ASc(serialDescriptor);
                return new CheckoutErrorPayload(checkoutErrorType, errorGroup, str, str2, i);
            }
        }
    }

    @Override // X.C3R9, X.C3RA, X.C3RB
    public final SerialDescriptor getDescriptor() {
        return A01;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [X.X18, X.3Sp, java.lang.Object] */
    static {
        ?? obj = new Object();
        A00 = obj;
        C73833Sq c73833Sq = new C73833Sq("com.shopify.checkout.models.errors.CheckoutErrorPayload", obj, 4);
        c73833Sq.A00("flowType");
        c73833Sq.A00(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
        c73833Sq.A00("reason");
        c73833Sq.A00("group");
        A01 = c73833Sq;
    }

    @Override // X.InterfaceC73823Sp
    public final C3R9[] childSerializers() {
        C3RD c3rd = C3RD.A01;
        return new C3R9[]{c3rd, CheckoutErrorTypeSerializer.A00, AbstractC192698gB.A00(c3rd), ErrorGroupSerializer.A00};
    }

    @Override // X.C3RA
    public final /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        CheckoutErrorPayload checkoutErrorPayload = (CheckoutErrorPayload) obj;
        boolean A1R = AbstractC167007dF.A1R(0, encoder, checkoutErrorPayload);
        SerialDescriptor serialDescriptor = A01;
        C4D8 ADR = encoder.ADR(serialDescriptor);
        ADR.ASL(checkoutErrorPayload.A02, serialDescriptor, 0);
        ADR.ASH(checkoutErrorPayload.A00, CheckoutErrorTypeSerializer.A00, serialDescriptor, A1R ? 1 : 0);
        ADR.ASG(checkoutErrorPayload.A03, C3RD.A01, serialDescriptor, 2);
        ADR.ASH(checkoutErrorPayload.A01, ErrorGroupSerializer.A00, serialDescriptor, 3);
        ADR.ASc(serialDescriptor);
    }

    @Override // X.InterfaceC73823Sp
    public final C3R9[] typeParametersSerializers() {
        return AbstractC54355O0n.A00;
    }
}
