package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.shopify.checkout.models.Address;
import com.shopify.checkout.models.CartInfo;
import com.shopify.checkout.models.OrderDetails;
import java.util.List;
import kotlin.Deprecated;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Deprecated(level = AbstractC68219VIb.HIDDEN, message = "This synthesized declaration should not be used directly")
/* loaded from: classes11.dex */
public final /* synthetic */ class X13 implements InterfaceC73823Sp {
    public static final X13 A00;
    public static final SerialDescriptor A01;

    @Override // X.C3RB
    public final /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        C14360o3.A0B(decoder, 0);
        SerialDescriptor serialDescriptor = A01;
        C3T8 ADQ = decoder.ADQ(serialDescriptor);
        C3R9[] c3r9Arr = OrderDetails.A08;
        String str = null;
        Address address = null;
        List list = null;
        Address address2 = null;
        List list2 = null;
        String str2 = null;
        String str3 = null;
        CartInfo cartInfo = null;
        int i = 0;
        while (true) {
            int ANz = ADQ.ANz(serialDescriptor);
            switch (ANz) {
                case -1:
                    ADQ.ASc(serialDescriptor);
                    return new OrderDetails(address2, address, cartInfo, str, str2, str3, list2, list, i);
                case 0:
                    str = ADQ.AOK(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    str2 = (String) ADQ.AOE(str2, C3RD.A01, serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    str3 = (String) ADQ.AOE(str3, C3RD.A01, serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    cartInfo = (CartInfo) ADQ.AOF(cartInfo, C71750X0p.A00, serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    address2 = (Address) ADQ.AOE(address2, C71747X0m.A00, serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    list2 = (List) ADQ.AOF(list2, c3r9Arr[5], serialDescriptor, 5);
                    i |= 32;
                    break;
                case 6:
                    list = (List) ADQ.AOE(list, c3r9Arr[6], serialDescriptor, 6);
                    i |= 64;
                    break;
                case 7:
                    address = (Address) ADQ.AOE(address, C71747X0m.A00, serialDescriptor, 7);
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

    /* JADX WARN: Type inference failed for: r3v0, types: [X.3Sp, java.lang.Object, X.X13] */
    static {
        ?? obj = new Object();
        A00 = obj;
        C73833Sq c73833Sq = new C73833Sq("com.shopify.checkout.models.OrderDetails", obj, 8);
        c73833Sq.A00(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
        c73833Sq.A01("email", true);
        c73833Sq.A01("phone", true);
        c73833Sq.A00("cart");
        c73833Sq.A01("billingAddress", true);
        c73833Sq.A00("paymentMethods");
        c73833Sq.A01("deliveries", true);
        c73833Sq.A01("shippingAddress", true);
        A01 = c73833Sq;
    }

    @Override // X.InterfaceC73823Sp
    public final C3R9[] childSerializers() {
        C3R9[] c3r9Arr = OrderDetails.A08;
        C3RD c3rd = C3RD.A01;
        C3R9 A002 = AbstractC192698gB.A00(c3rd);
        C3R9 A003 = AbstractC192698gB.A00(c3rd);
        C71750X0p c71750X0p = C71750X0p.A00;
        C71747X0m c71747X0m = C71747X0m.A00;
        return new C3R9[]{c3rd, A002, A003, c71750X0p, AbstractC192698gB.A00(c71747X0m), c3r9Arr[5], AbstractC192698gB.A00(c3r9Arr[6]), AbstractC192698gB.A00(c71747X0m)};
    }

    @Override // X.C3RA
    public final /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        OrderDetails orderDetails = (OrderDetails) obj;
        boolean A1R = AbstractC167007dF.A1R(0, encoder, orderDetails);
        SerialDescriptor serialDescriptor = A01;
        C4D8 ADR = encoder.ADR(serialDescriptor);
        C3R9[] c3r9Arr = OrderDetails.A08;
        ADR.ASL(orderDetails.A04, serialDescriptor, 0);
        if (ADR.EiY(serialDescriptor, A1R ? 1 : 0) || orderDetails.A03 != null) {
            ADR.ASG(orderDetails.A03, C3RD.A01, serialDescriptor, A1R ? 1 : 0);
        }
        if (ADR.EiY(serialDescriptor, 2) || orderDetails.A05 != null) {
            ADR.ASG(orderDetails.A05, C3RD.A01, serialDescriptor, 2);
        }
        ADR.ASH(orderDetails.A02, C71750X0p.A00, serialDescriptor, 3);
        if (ADR.EiY(serialDescriptor, 4) || orderDetails.A00 != null) {
            ADR.ASG(orderDetails.A00, C71747X0m.A00, serialDescriptor, 4);
        }
        ADR.ASH(orderDetails.A07, c3r9Arr[5], serialDescriptor, 5);
        if (ADR.EiY(serialDescriptor, 6) || orderDetails.A06 != null) {
            ADR.ASG(orderDetails.A06, c3r9Arr[6], serialDescriptor, 6);
        }
        if (ADR.EiY(serialDescriptor, 7) || orderDetails.A01 != null) {
            ADR.ASG(orderDetails.A01, C71747X0m.A00, serialDescriptor, 7);
        }
        ADR.ASc(serialDescriptor);
    }

    @Override // X.InterfaceC73823Sp
    public final C3R9[] typeParametersSerializers() {
        return AbstractC54355O0n.A00;
    }
}
