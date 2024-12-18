package X;

import com.shopify.checkout.models.BuyerInfo;
import com.shopify.checkout.models.CartInfo;
import com.shopify.checkout.models.CheckoutStatePayload;
import java.util.List;
import kotlin.Deprecated;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Deprecated(level = AbstractC68219VIb.HIDDEN, message = "This synthesized declaration should not be used directly")
/* renamed from: X.X0u, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final /* synthetic */ class C71755X0u implements InterfaceC73823Sp {
    public static final C71755X0u A00;
    public static final SerialDescriptor A01;

    @Override // X.C3RB
    public final /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        C14360o3.A0B(decoder, 0);
        SerialDescriptor serialDescriptor = A01;
        C3T8 ADQ = decoder.ADQ(serialDescriptor);
        C3R9[] c3r9Arr = CheckoutStatePayload.A04;
        String str = null;
        CartInfo cartInfo = null;
        BuyerInfo buyerInfo = null;
        List list = null;
        int i = 0;
        while (true) {
            int ANz = ADQ.ANz(serialDescriptor);
            if (ANz != -1) {
                if (ANz != 0) {
                    if (ANz != 1) {
                        if (ANz != 2) {
                            if (ANz == 3) {
                                list = (List) ADQ.AOE(list, c3r9Arr[3], serialDescriptor, 3);
                                i |= 8;
                            } else {
                                throw new X6K(ANz);
                            }
                        } else {
                            buyerInfo = (BuyerInfo) ADQ.AOE(buyerInfo, C71749X0o.A00, serialDescriptor, 2);
                            i |= 4;
                        }
                    } else {
                        cartInfo = (CartInfo) ADQ.AOF(cartInfo, C71750X0p.A00, serialDescriptor, 1);
                        i |= 2;
                    }
                } else {
                    str = ADQ.AOK(serialDescriptor, 0);
                    i |= 1;
                }
            } else {
                ADQ.ASc(serialDescriptor);
                return new CheckoutStatePayload(buyerInfo, cartInfo, str, list, i);
            }
        }
    }

    @Override // X.C3R9, X.C3RA, X.C3RB
    public final SerialDescriptor getDescriptor() {
        return A01;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [X.3Sp, X.X0u, java.lang.Object] */
    static {
        ?? obj = new Object();
        A00 = obj;
        C73833Sq c73833Sq = new C73833Sq("com.shopify.checkout.models.CheckoutStatePayload", obj, 4);
        c73833Sq.A00("flowType");
        c73833Sq.A00("cart");
        c73833Sq.A01("buyer", true);
        c73833Sq.A01("deliveries", true);
        A01 = c73833Sq;
    }

    @Override // X.InterfaceC73823Sp
    public final C3R9[] childSerializers() {
        return new C3R9[]{C3RD.A01, C71750X0p.A00, AbstractC192698gB.A00(C71749X0o.A00), AbstractC192698gB.A00(CheckoutStatePayload.A04[3])};
    }

    @Override // X.C3RA
    public final /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        CheckoutStatePayload checkoutStatePayload = (CheckoutStatePayload) obj;
        boolean A1R = AbstractC167007dF.A1R(0, encoder, checkoutStatePayload);
        SerialDescriptor serialDescriptor = A01;
        C4D8 ADR = encoder.ADR(serialDescriptor);
        C3R9[] c3r9Arr = CheckoutStatePayload.A04;
        ADR.ASL(checkoutStatePayload.A02, serialDescriptor, 0);
        ADR.ASH(checkoutStatePayload.A01, C71750X0p.A00, serialDescriptor, A1R ? 1 : 0);
        if (ADR.EiY(serialDescriptor, 2) || checkoutStatePayload.A00 != null) {
            ADR.ASG(checkoutStatePayload.A00, C71749X0o.A00, serialDescriptor, 2);
        }
        if (ADR.EiY(serialDescriptor, 3) || checkoutStatePayload.A03 != null) {
            ADR.ASG(checkoutStatePayload.A03, c3r9Arr[3], serialDescriptor, 3);
        }
        ADR.ASc(serialDescriptor);
    }

    @Override // X.InterfaceC73823Sp
    public final C3R9[] typeParametersSerializers() {
        return AbstractC54355O0n.A00;
    }
}
