package X;

import com.shopify.checkout.models.Address;
import com.shopify.checkout.models.BuyerInfo;
import com.shopify.checkout.models.PaymentMethod;
import kotlin.Deprecated;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Deprecated(level = AbstractC68219VIb.HIDDEN, message = "This synthesized declaration should not be used directly")
/* renamed from: X.X0o, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final /* synthetic */ class C71749X0o implements InterfaceC73823Sp {
    public static final C71749X0o A00;
    public static final SerialDescriptor A01;

    @Override // X.C3RB
    public final /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        C14360o3.A0B(decoder, 0);
        SerialDescriptor serialDescriptor = A01;
        C3T8 ADQ = decoder.ADQ(serialDescriptor);
        String str = null;
        PaymentMethod paymentMethod = null;
        Address address = null;
        int i = 0;
        boolean z = false;
        while (true) {
            int ANz = ADQ.ANz(serialDescriptor);
            if (ANz != -1) {
                if (ANz != 0) {
                    if (ANz != 1) {
                        if (ANz != 2) {
                            if (ANz == 3) {
                                address = (Address) ADQ.AOE(address, C71747X0m.A00, serialDescriptor, 3);
                                i |= 8;
                            } else {
                                throw new X6K(ANz);
                            }
                        } else {
                            paymentMethod = (PaymentMethod) ADQ.AOE(paymentMethod, X15.A00, serialDescriptor, 2);
                            i |= 4;
                        }
                    } else {
                        z = ADQ.ANs(serialDescriptor, 1);
                        i |= 2;
                    }
                } else {
                    str = AbstractC65702TsY.A0e(str, serialDescriptor, ADQ, 0);
                    i |= 1;
                }
            } else {
                ADQ.ASc(serialDescriptor);
                return new BuyerInfo(address, paymentMethod, str, i, z);
            }
        }
    }

    @Override // X.C3R9, X.C3RA, X.C3RB
    public final SerialDescriptor getDescriptor() {
        return A01;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [X.3Sp, java.lang.Object, X.X0o] */
    static {
        ?? obj = new Object();
        A00 = obj;
        C73833Sq c73833Sq = new C73833Sq("com.shopify.checkout.models.BuyerInfo", obj, 4);
        c73833Sq.A01("email", true);
        c73833Sq.A01("acceptsMarketing", true);
        c73833Sq.A01("selectedPaymentMethod", true);
        c73833Sq.A01("selectedShippingAddress", true);
        A01 = c73833Sq;
    }

    @Override // X.InterfaceC73823Sp
    public final C3R9[] childSerializers() {
        return new C3R9[]{AbstractC192698gB.A00(C3RD.A01), C3SL.A00, AbstractC192698gB.A00(X15.A00), AbstractC192698gB.A00(C71747X0m.A00)};
    }

    @Override // X.C3RA
    public final /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        BuyerInfo buyerInfo = (BuyerInfo) obj;
        boolean A1R = AbstractC167007dF.A1R(0, encoder, buyerInfo);
        SerialDescriptor serialDescriptor = A01;
        C4D8 ADR = encoder.ADR(serialDescriptor);
        if (ADR.EiY(serialDescriptor, 0) || buyerInfo.A02 != null) {
            ADR.ASG(buyerInfo.A02, C3RD.A01, serialDescriptor, 0);
        }
        if (ADR.EiY(serialDescriptor, A1R ? 1 : 0) || buyerInfo.A03) {
            ADR.AS2(serialDescriptor, A1R ? 1 : 0, buyerInfo.A03);
        }
        if (ADR.EiY(serialDescriptor, 2) || buyerInfo.A01 != null) {
            ADR.ASG(buyerInfo.A01, X15.A00, serialDescriptor, 2);
        }
        if (ADR.EiY(serialDescriptor, 3) || buyerInfo.A00 != null) {
            ADR.ASG(buyerInfo.A00, C71747X0m.A00, serialDescriptor, 3);
        }
        ADR.ASc(serialDescriptor);
    }

    @Override // X.InterfaceC73823Sp
    public final C3R9[] typeParametersSerializers() {
        return AbstractC54355O0n.A00;
    }
}
