package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.shopify.checkout.models.Address;
import com.shopify.checkout.models.DeliveryDetails;
import kotlin.Deprecated;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Deprecated(level = AbstractC68219VIb.HIDDEN, message = "This synthesized declaration should not be used directly")
/* renamed from: X.X0w, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final /* synthetic */ class C71757X0w implements InterfaceC73823Sp {
    public static final C71757X0w A00;
    public static final SerialDescriptor A01;

    @Override // X.C3RB
    public final /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        C14360o3.A0B(decoder, 0);
        SerialDescriptor serialDescriptor = A01;
        C3T8 ADQ = decoder.ADQ(serialDescriptor);
        String str = null;
        Address address = null;
        String str2 = null;
        int i = 0;
        while (true) {
            int ANz = ADQ.ANz(serialDescriptor);
            if (ANz != -1) {
                if (ANz != 0) {
                    if (ANz != 1) {
                        if (ANz == 2) {
                            str2 = AbstractC65702TsY.A0e(str2, serialDescriptor, ADQ, 2);
                            i |= 4;
                        } else {
                            throw new X6K(ANz);
                        }
                    } else {
                        address = (Address) ADQ.AOE(address, C71747X0m.A00, serialDescriptor, 1);
                        i |= 2;
                    }
                } else {
                    str = AbstractC65702TsY.A0e(str, serialDescriptor, ADQ, 0);
                    i |= 1;
                }
            } else {
                ADQ.ASc(serialDescriptor);
                return new DeliveryDetails(address, str, str2, i);
            }
        }
    }

    @Override // X.C3R9, X.C3RA, X.C3RB
    public final SerialDescriptor getDescriptor() {
        return A01;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [X.X0w, X.3Sp, java.lang.Object] */
    static {
        ?? obj = new Object();
        A00 = obj;
        C73833Sq c73833Sq = new C73833Sq("com.shopify.checkout.models.DeliveryDetails", obj, 3);
        c73833Sq.A01(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, true);
        c73833Sq.A01("location", true);
        c73833Sq.A01("additionalInfo", true);
        A01 = c73833Sq;
    }

    @Override // X.InterfaceC73823Sp
    public final C3R9[] childSerializers() {
        C3RD c3rd = C3RD.A01;
        return new C3R9[]{AbstractC192698gB.A00(c3rd), AbstractC192698gB.A00(C71747X0m.A00), AbstractC192698gB.A00(c3rd)};
    }

    @Override // X.C3RA
    public final /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        DeliveryDetails deliveryDetails = (DeliveryDetails) obj;
        boolean A1R = AbstractC167007dF.A1R(0, encoder, deliveryDetails);
        SerialDescriptor serialDescriptor = A01;
        C4D8 ADR = encoder.ADR(serialDescriptor);
        if (ADR.EiY(serialDescriptor, 0) || deliveryDetails.A02 != null) {
            ADR.ASG(deliveryDetails.A02, C3RD.A01, serialDescriptor, 0);
        }
        if (ADR.EiY(serialDescriptor, A1R ? 1 : 0) || deliveryDetails.A00 != null) {
            ADR.ASG(deliveryDetails.A00, C71747X0m.A00, serialDescriptor, A1R ? 1 : 0);
        }
        if (ADR.EiY(serialDescriptor, 2) || deliveryDetails.A01 != null) {
            ADR.ASG(deliveryDetails.A01, C3RD.A01, serialDescriptor, 2);
        }
        ADR.ASc(serialDescriptor);
    }

    @Override // X.InterfaceC73823Sp
    public final C3R9[] typeParametersSerializers() {
        return AbstractC54355O0n.A00;
    }
}
