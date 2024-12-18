package X;

import com.shopify.checkout.models.CartInfo;
import com.shopify.checkout.models.CheckoutCompletedPayload;
import com.shopify.checkout.models.OrderDetails;
import kotlin.Deprecated;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Deprecated(level = AbstractC68219VIb.HIDDEN, message = "This synthesized declaration should not be used directly")
/* renamed from: X.X0s, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final /* synthetic */ class C71753X0s implements InterfaceC73823Sp {
    public static final C71753X0s A00;
    public static final SerialDescriptor A01;

    @Override // X.C3RB
    public final /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        C14360o3.A0B(decoder, 0);
        SerialDescriptor serialDescriptor = A01;
        C3T8 ADQ = decoder.ADQ(serialDescriptor);
        String str = null;
        OrderDetails orderDetails = null;
        String str2 = null;
        String str3 = null;
        CartInfo cartInfo = null;
        String str4 = null;
        int i = 0;
        while (true) {
            int ANz = ADQ.ANz(serialDescriptor);
            switch (ANz) {
                case -1:
                    ADQ.ASc(serialDescriptor);
                    return new CheckoutCompletedPayload(cartInfo, orderDetails, str, str2, str3, str4, i);
                case 0:
                    str = ADQ.AOK(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    orderDetails = (OrderDetails) ADQ.AOF(orderDetails, X13.A00, serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    str2 = ADQ.AOK(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    str3 = ADQ.AOK(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    cartInfo = (CartInfo) ADQ.AOF(cartInfo, C71750X0p.A00, serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    str4 = ADQ.AOK(serialDescriptor, 5);
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

    /* JADX WARN: Type inference failed for: r3v0, types: [X.3Sp, java.lang.Object, X.X0s] */
    static {
        ?? obj = new Object();
        A00 = obj;
        C73833Sq c73833Sq = new C73833Sq("com.shopify.checkout.models.CheckoutCompletedPayload", obj, 6);
        c73833Sq.A00("flowType");
        c73833Sq.A00("orderDetails");
        c73833Sq.A00("confirmationURL");
        c73833Sq.A00("orderId");
        c73833Sq.A00("cart");
        c73833Sq.A00("thankYouPageUrl");
        A01 = c73833Sq;
    }

    @Override // X.InterfaceC73823Sp
    public final C3R9[] childSerializers() {
        C3RD c3rd = C3RD.A01;
        return new C3R9[]{c3rd, X13.A00, c3rd, c3rd, C71750X0p.A00, c3rd};
    }

    @Override // X.C3RA
    public final /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        CheckoutCompletedPayload checkoutCompletedPayload = (CheckoutCompletedPayload) obj;
        boolean A1R = AbstractC167007dF.A1R(0, encoder, checkoutCompletedPayload);
        SerialDescriptor serialDescriptor = A01;
        C4D8 ADR = encoder.ADR(serialDescriptor);
        ADR.ASL(checkoutCompletedPayload.A03, serialDescriptor, 0);
        ADR.ASH(checkoutCompletedPayload.A01, X13.A00, serialDescriptor, A1R ? 1 : 0);
        ADR.ASL(checkoutCompletedPayload.A02, serialDescriptor, 2);
        ADR.ASL(checkoutCompletedPayload.A04, serialDescriptor, 3);
        ADR.ASH(checkoutCompletedPayload.A00, C71750X0p.A00, serialDescriptor, 4);
        ADR.ASL(checkoutCompletedPayload.A05, serialDescriptor, 5);
        ADR.ASc(serialDescriptor);
    }

    @Override // X.InterfaceC73823Sp
    public final C3R9[] typeParametersSerializers() {
        return AbstractC54355O0n.A00;
    }
}
