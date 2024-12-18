package X;

import com.facebook.react.modules.dialog.DialogModule;
import com.shopify.checkout.models.CartLine;
import com.shopify.checkout.models.CartLineImage;
import com.shopify.checkout.models.Money;
import java.util.List;
import kotlin.Deprecated;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Deprecated(level = AbstractC68219VIb.HIDDEN, message = "This synthesized declaration should not be used directly")
/* renamed from: X.X0q, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final /* synthetic */ class C71751X0q implements InterfaceC73823Sp {
    public static final C71751X0q A00;
    public static final SerialDescriptor A01;

    @Override // X.C3RB
    public final /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        C14360o3.A0B(decoder, 0);
        SerialDescriptor serialDescriptor = A01;
        C3T8 ADQ = decoder.ADQ(serialDescriptor);
        C3R9[] c3r9Arr = CartLine.A07;
        List list = null;
        Money money = null;
        String str = null;
        String str2 = null;
        CartLineImage cartLineImage = null;
        String str3 = null;
        int i = 0;
        int i2 = 0;
        while (true) {
            int ANz = ADQ.ANz(serialDescriptor);
            switch (ANz) {
                case -1:
                    ADQ.ASc(serialDescriptor);
                    return new CartLine(cartLineImage, money, str, str2, str3, list, i2, i);
                case 0:
                    str = (String) ADQ.AOE(str, C3RD.A01, serialDescriptor, 0);
                    i2 |= 1;
                    break;
                case 1:
                    str2 = (String) ADQ.AOE(str2, C3RD.A01, serialDescriptor, 1);
                    i2 |= 2;
                    break;
                case 2:
                    cartLineImage = (CartLineImage) ADQ.AOE(cartLineImage, C71752X0r.A00, serialDescriptor, 2);
                    i2 |= 4;
                    break;
                case 3:
                    i = ADQ.AO9(serialDescriptor, 3);
                    i2 |= 8;
                    break;
                case 4:
                    str3 = ADQ.AOK(serialDescriptor, 4);
                    i2 |= 16;
                    break;
                case 5:
                    money = (Money) ADQ.AOF(money, X11.A00, serialDescriptor, 5);
                    i2 |= 32;
                    break;
                case 6:
                    list = (List) ADQ.AOE(list, c3r9Arr[6], serialDescriptor, 6);
                    i2 |= 64;
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

    /* JADX WARN: Type inference failed for: r3v0, types: [X.3Sp, java.lang.Object, X.X0q] */
    static {
        ?? obj = new Object();
        A00 = obj;
        C73833Sq c73833Sq = new C73833Sq("com.shopify.checkout.models.CartLine", obj, 7);
        c73833Sq.A01("merchandiseId", true);
        c73833Sq.A01("productId", true);
        c73833Sq.A01("image", true);
        c73833Sq.A00("quantity");
        c73833Sq.A00(DialogModule.KEY_TITLE);
        c73833Sq.A00("price");
        c73833Sq.A01("discounts", true);
        A01 = c73833Sq;
    }

    @Override // X.InterfaceC73823Sp
    public final C3R9[] childSerializers() {
        C3R9[] c3r9Arr = CartLine.A07;
        C3RD c3rd = C3RD.A01;
        return new C3R9[]{AbstractC192698gB.A00(c3rd), AbstractC192698gB.A00(c3rd), AbstractC192698gB.A00(C71752X0r.A00), C192398fh.A00, c3rd, X11.A00, AbstractC192698gB.A00(c3r9Arr[6])};
    }

    @Override // X.C3RA
    public final /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        CartLine cartLine = (CartLine) obj;
        boolean A1R = AbstractC167007dF.A1R(0, encoder, cartLine);
        SerialDescriptor serialDescriptor = A01;
        C4D8 ADR = encoder.ADR(serialDescriptor);
        C3R9[] c3r9Arr = CartLine.A07;
        if (ADR.EiY(serialDescriptor, 0) || cartLine.A03 != null) {
            ADR.ASG(cartLine.A03, C3RD.A01, serialDescriptor, 0);
        }
        if (ADR.EiY(serialDescriptor, A1R ? 1 : 0) || cartLine.A04 != null) {
            ADR.ASG(cartLine.A04, C3RD.A01, serialDescriptor, A1R ? 1 : 0);
        }
        if (ADR.EiY(serialDescriptor, 2) || cartLine.A01 != null) {
            ADR.ASG(cartLine.A01, C71752X0r.A00, serialDescriptor, 2);
        }
        ADR.ASC(serialDescriptor, 3, cartLine.A00);
        ADR.ASL(cartLine.A05, serialDescriptor, 4);
        ADR.ASH(cartLine.A02, X11.A00, serialDescriptor, 5);
        if (ADR.EiY(serialDescriptor, 6) || cartLine.A06 != null) {
            ADR.ASG(cartLine.A06, c3r9Arr[6], serialDescriptor, 6);
        }
        ADR.ASc(serialDescriptor);
    }

    @Override // X.InterfaceC73823Sp
    public final C3R9[] typeParametersSerializers() {
        return AbstractC54355O0n.A00;
    }
}
