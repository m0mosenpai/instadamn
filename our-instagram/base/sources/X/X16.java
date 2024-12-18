package X;

import com.shopify.checkout.models.Money;
import com.shopify.checkout.models.Price;
import java.util.List;
import kotlin.Deprecated;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Deprecated(level = AbstractC68219VIb.HIDDEN, message = "This synthesized declaration should not be used directly")
/* loaded from: classes11.dex */
public final /* synthetic */ class X16 implements InterfaceC73823Sp {
    public static final X16 A00;
    public static final SerialDescriptor A01;

    @Override // X.C3RB
    public final /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        C14360o3.A0B(decoder, 0);
        SerialDescriptor serialDescriptor = A01;
        C3T8 ADQ = decoder.ADQ(serialDescriptor);
        C3R9[] c3r9Arr = Price.A06;
        Money money = null;
        Money money2 = null;
        Money money3 = null;
        Boolean bool = null;
        Money money4 = null;
        List list = null;
        int i = 0;
        while (true) {
            int ANz = ADQ.ANz(serialDescriptor);
            switch (ANz) {
                case -1:
                    ADQ.ASc(serialDescriptor);
                    return new Price(money, money2, money3, money4, bool, list, i);
                case 0:
                    money = (Money) ADQ.AOE(money, X11.A00, serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    money2 = (Money) ADQ.AOE(money2, X11.A00, serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    money3 = (Money) ADQ.AOE(money3, X11.A00, serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    bool = (Boolean) ADQ.AOE(bool, C3SL.A00, serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    money4 = (Money) ADQ.AOE(money4, X11.A00, serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    list = (List) ADQ.AOE(list, c3r9Arr[5], serialDescriptor, 5);
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

    /* JADX WARN: Type inference failed for: r3v0, types: [X.3Sp, X.X16, java.lang.Object] */
    static {
        ?? obj = new Object();
        A00 = obj;
        C73833Sq c73833Sq = new C73833Sq("com.shopify.checkout.models.Price", obj, 6);
        c73833Sq.A01("total", true);
        c73833Sq.A01("subtotal", true);
        c73833Sq.A01("taxes", true);
        c73833Sq.A01("taxesIncluded", true);
        c73833Sq.A01("shipping", true);
        c73833Sq.A01("discounts", true);
        A01 = c73833Sq;
    }

    @Override // X.InterfaceC73823Sp
    public final C3R9[] childSerializers() {
        C3R9[] c3r9Arr = Price.A06;
        X11 x11 = X11.A00;
        return new C3R9[]{AbstractC192698gB.A00(x11), AbstractC192698gB.A00(x11), AbstractC192698gB.A00(x11), AbstractC192698gB.A00(C3SL.A00), AbstractC192698gB.A00(x11), AbstractC192698gB.A00(c3r9Arr[5])};
    }

    @Override // X.C3RA
    public final /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        Price price = (Price) obj;
        boolean A1R = AbstractC167007dF.A1R(0, encoder, price);
        SerialDescriptor serialDescriptor = A01;
        C4D8 ADR = encoder.ADR(serialDescriptor);
        C3R9[] c3r9Arr = Price.A06;
        if (ADR.EiY(serialDescriptor, 0) || price.A03 != null) {
            ADR.ASG(price.A03, X11.A00, serialDescriptor, 0);
        }
        if (ADR.EiY(serialDescriptor, A1R ? 1 : 0) || price.A01 != null) {
            ADR.ASG(price.A01, X11.A00, serialDescriptor, A1R ? 1 : 0);
        }
        if (ADR.EiY(serialDescriptor, 2) || price.A02 != null) {
            ADR.ASG(price.A02, X11.A00, serialDescriptor, 2);
        }
        if (ADR.EiY(serialDescriptor, 3) || price.A04 != null) {
            ADR.ASG(price.A04, C3SL.A00, serialDescriptor, 3);
        }
        if (ADR.EiY(serialDescriptor, 4) || price.A00 != null) {
            ADR.ASG(price.A00, X11.A00, serialDescriptor, 4);
        }
        if (ADR.EiY(serialDescriptor, 5) || price.A05 != null) {
            ADR.ASG(price.A05, c3r9Arr[5], serialDescriptor, 5);
        }
        ADR.ASc(serialDescriptor);
    }

    @Override // X.InterfaceC73823Sp
    public final C3R9[] typeParametersSerializers() {
        return AbstractC54355O0n.A00;
    }
}
