package X;

import com.shopify.checkout.models.DeliveryDetails;
import com.shopify.checkout.models.DeliveryInfo;
import com.shopify.checkout.models.DeliveryMethod;
import com.shopify.checkout.models.DeliveryMethodSerializer;
import kotlin.Deprecated;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Deprecated(level = AbstractC68219VIb.HIDDEN, message = "This synthesized declaration should not be used directly")
/* renamed from: X.X0x, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final /* synthetic */ class C71758X0x implements InterfaceC73823Sp {
    public static final C71758X0x A00;
    public static final SerialDescriptor A01;

    @Override // X.C3RB
    public final /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        C14360o3.A0B(decoder, 0);
        SerialDescriptor serialDescriptor = A01;
        C3T8 ADQ = decoder.ADQ(serialDescriptor);
        DeliveryMethod deliveryMethod = null;
        DeliveryDetails deliveryDetails = null;
        int i = 0;
        while (true) {
            int ANz = ADQ.ANz(serialDescriptor);
            if (ANz != -1) {
                if (ANz != 0) {
                    if (ANz == 1) {
                        deliveryDetails = (DeliveryDetails) ADQ.AOF(deliveryDetails, C71757X0w.A00, serialDescriptor, 1);
                        i |= 2;
                    } else {
                        throw new X6K(ANz);
                    }
                } else {
                    deliveryMethod = (DeliveryMethod) ADQ.AOF(deliveryMethod, DeliveryMethodSerializer.A00, serialDescriptor, 0);
                    i |= 1;
                }
            } else {
                ADQ.ASc(serialDescriptor);
                return new DeliveryInfo(deliveryDetails, deliveryMethod, i);
            }
        }
    }

    @Override // X.C3R9, X.C3RA, X.C3RB
    public final SerialDescriptor getDescriptor() {
        return A01;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [X.X0x, X.3Sp, java.lang.Object] */
    static {
        ?? obj = new Object();
        A00 = obj;
        C73833Sq c73833Sq = new C73833Sq("com.shopify.checkout.models.DeliveryInfo", obj, 2);
        c73833Sq.A00("method");
        c73833Sq.A00("details");
        A01 = c73833Sq;
    }

    @Override // X.InterfaceC73823Sp
    public final C3R9[] childSerializers() {
        return new C3R9[]{DeliveryMethodSerializer.A00, C71757X0w.A00};
    }

    @Override // X.C3RA
    public final /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        DeliveryInfo deliveryInfo = (DeliveryInfo) obj;
        boolean A1R = AbstractC167007dF.A1R(0, encoder, deliveryInfo);
        SerialDescriptor serialDescriptor = A01;
        C4D8 ADR = encoder.ADR(serialDescriptor);
        ADR.ASH(deliveryInfo.A01, DeliveryMethodSerializer.A00, serialDescriptor, 0);
        ADR.ASH(deliveryInfo.A00, C71757X0w.A00, serialDescriptor, A1R ? 1 : 0);
        ADR.ASc(serialDescriptor);
    }

    @Override // X.InterfaceC73823Sp
    public final C3R9[] typeParametersSerializers() {
        return AbstractC54355O0n.A00;
    }
}
