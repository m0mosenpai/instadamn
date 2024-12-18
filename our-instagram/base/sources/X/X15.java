package X;

import com.shopify.checkout.models.Address;
import com.shopify.checkout.models.PaymentMethod;
import kotlin.Deprecated;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Deprecated(level = AbstractC68219VIb.HIDDEN, message = "This synthesized declaration should not be used directly")
/* loaded from: classes11.dex */
public final /* synthetic */ class X15 implements InterfaceC73823Sp {
    public static final X15 A00;
    public static final SerialDescriptor A01;

    @Override // X.C3RB
    public final /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        C14360o3.A0B(decoder, 0);
        SerialDescriptor serialDescriptor = A01;
        C3T8 ADQ = decoder.ADQ(serialDescriptor);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        Address address = null;
        int i = 0;
        while (true) {
            int ANz = ADQ.ANz(serialDescriptor);
            switch (ANz) {
                case -1:
                    ADQ.ASc(serialDescriptor);
                    return new PaymentMethod(address, str, str2, str3, str4, str5, i);
                case 0:
                    str = ADQ.AOK(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    str2 = ADQ.AOK(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    str3 = ADQ.AOK(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    str4 = ADQ.AOK(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    str5 = ADQ.AOK(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    address = (Address) ADQ.AOF(address, C71747X0m.A00, serialDescriptor, 5);
                    i |= 32;
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

    /* JADX WARN: Type inference failed for: r3v0, types: [X.3Sp, X.X15, java.lang.Object] */
    static {
        ?? obj = new Object();
        A00 = obj;
        C73833Sq c73833Sq = new C73833Sq("com.shopify.checkout.models.PaymentMethod", obj, 6);
        c73833Sq.A00("referenceId");
        c73833Sq.A00("cardType");
        c73833Sq.A00("lastFourDigits");
        c73833Sq.A00("expirationMonth");
        c73833Sq.A00("expirationYear");
        c73833Sq.A00("billingAddress");
        A01 = c73833Sq;
    }

    @Override // X.InterfaceC73823Sp
    public final C3R9[] childSerializers() {
        C3RD c3rd = C3RD.A01;
        return new C3R9[]{c3rd, c3rd, c3rd, c3rd, c3rd, C71747X0m.A00};
    }

    @Override // X.C3RA
    public final /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        PaymentMethod paymentMethod = (PaymentMethod) obj;
        boolean A1R = AbstractC167007dF.A1R(0, encoder, paymentMethod);
        SerialDescriptor serialDescriptor = A01;
        C4D8 ADR = encoder.ADR(serialDescriptor);
        ADR.ASL(paymentMethod.A05, serialDescriptor, 0);
        ADR.ASL(paymentMethod.A01, serialDescriptor, A1R ? 1 : 0);
        ADR.ASL(paymentMethod.A04, serialDescriptor, 2);
        ADR.ASL(paymentMethod.A02, serialDescriptor, 3);
        ADR.ASL(paymentMethod.A03, serialDescriptor, 4);
        ADR.ASH(paymentMethod.A00, C71747X0m.A00, serialDescriptor, 5);
        ADR.ASc(serialDescriptor);
    }

    @Override // X.InterfaceC73823Sp
    public final C3R9[] typeParametersSerializers() {
        return AbstractC54355O0n.A00;
    }
}
