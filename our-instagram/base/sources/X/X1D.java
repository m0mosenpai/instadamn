package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.shopify.checkout.models.errors.ErrorGroup;
import com.shopify.checkout.models.errors.ErrorGroupSerializer;
import com.shopify.checkout.models.errors.violations.DeliveryErrorCode;
import com.shopify.checkout.models.errors.violations.DeliveryErrorCodeSerializer;
import com.shopify.checkout.models.errors.violations.DeliveryErrorPayload;
import com.shopify.checkout.models.errors.violations.ViolationErrorType;
import com.shopify.checkout.models.errors.violations.ViolationErrorTypeSerializer;
import kotlin.Deprecated;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Deprecated(level = AbstractC68219VIb.HIDDEN, message = "This synthesized declaration should not be used directly")
/* loaded from: classes11.dex */
public final /* synthetic */ class X1D implements InterfaceC73823Sp {
    public static final X1D A00;
    public static final SerialDescriptor A01;

    @Override // X.C3RB
    public final /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        C14360o3.A0B(decoder, 0);
        SerialDescriptor serialDescriptor = A01;
        C3T8 ADQ = decoder.ADQ(serialDescriptor);
        String str = null;
        DeliveryErrorCode deliveryErrorCode = null;
        String str2 = null;
        ErrorGroup errorGroup = null;
        ViolationErrorType violationErrorType = null;
        int i = 0;
        while (true) {
            int ANz = ADQ.ANz(serialDescriptor);
            if (ANz != -1) {
                if (ANz != 0) {
                    if (ANz != 1) {
                        if (ANz != 2) {
                            if (ANz != 3) {
                                if (ANz == 4) {
                                    violationErrorType = (ViolationErrorType) ADQ.AOF(violationErrorType, ViolationErrorTypeSerializer.A00, serialDescriptor, 4);
                                    i |= 16;
                                } else {
                                    throw new X6K(ANz);
                                }
                            } else {
                                errorGroup = (ErrorGroup) ADQ.AOF(errorGroup, ErrorGroupSerializer.A00, serialDescriptor, 3);
                                i |= 8;
                            }
                        } else {
                            str2 = AbstractC65702TsY.A0e(str2, serialDescriptor, ADQ, 2);
                            i |= 4;
                        }
                    } else {
                        deliveryErrorCode = (DeliveryErrorCode) ADQ.AOF(deliveryErrorCode, DeliveryErrorCodeSerializer.A00, serialDescriptor, 1);
                        i |= 2;
                    }
                } else {
                    str = ADQ.AOK(serialDescriptor, 0);
                    i |= 1;
                }
            } else {
                ADQ.ASc(serialDescriptor);
                return new DeliveryErrorPayload(errorGroup, deliveryErrorCode, violationErrorType, str, str2, i);
            }
        }
    }

    @Override // X.C3R9, X.C3RA, X.C3RB
    public final SerialDescriptor getDescriptor() {
        return A01;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [X.3Sp, java.lang.Object, X.X1D] */
    static {
        ?? obj = new Object();
        A00 = obj;
        C73833Sq A1E = AbstractC65703TsZ.A1E("com.shopify.checkout.models.errors.violations.DeliveryErrorPayload", obj, 5);
        A1E.A00(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
        A01 = A1E;
    }

    @Override // X.InterfaceC73823Sp
    public final C3R9[] childSerializers() {
        C3RD c3rd = C3RD.A01;
        return new C3R9[]{c3rd, DeliveryErrorCodeSerializer.A00, AbstractC192698gB.A00(c3rd), ErrorGroupSerializer.A00, ViolationErrorTypeSerializer.A00};
    }

    @Override // X.C3RA
    public final /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        DeliveryErrorPayload deliveryErrorPayload = (DeliveryErrorPayload) obj;
        boolean A1R = AbstractC167007dF.A1R(0, encoder, deliveryErrorPayload);
        SerialDescriptor serialDescriptor = A01;
        C4D8 ADR = encoder.ADR(serialDescriptor);
        ADR.ASL(deliveryErrorPayload.A03, serialDescriptor, 0);
        ADR.ASH(deliveryErrorPayload.A01, DeliveryErrorCodeSerializer.A00, serialDescriptor, A1R ? 1 : 0);
        if (ADR.EiY(serialDescriptor, 2) || deliveryErrorPayload.A04 != null) {
            ADR.ASG(deliveryErrorPayload.A04, C3RD.A01, serialDescriptor, 2);
        }
        ADR.ASH(deliveryErrorPayload.A00, ErrorGroupSerializer.A00, serialDescriptor, 3);
        ADR.ASH(deliveryErrorPayload.A02, ViolationErrorTypeSerializer.A00, serialDescriptor, 4);
        ADR.ASc(serialDescriptor);
    }

    @Override // X.InterfaceC73823Sp
    public final C3R9[] typeParametersSerializers() {
        return AbstractC54355O0n.A00;
    }
}
