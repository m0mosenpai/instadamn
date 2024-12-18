package X;

import com.shopify.checkout.models.CartInfo;
import com.shopify.checkout.models.Price;
import java.util.List;
import kotlin.Deprecated;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Deprecated(level = AbstractC68219VIb.HIDDEN, message = "This synthesized declaration should not be used directly")
/* renamed from: X.X0p, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final /* synthetic */ class C71750X0p implements InterfaceC73823Sp {
    public static final C71750X0p A00;
    public static final SerialDescriptor A01;

    @Override // X.C3RB
    public final /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        C14360o3.A0B(decoder, 0);
        SerialDescriptor serialDescriptor = A01;
        C3T8 ADQ = decoder.ADQ(serialDescriptor);
        C3R9[] c3r9Arr = CartInfo.A03;
        String str = null;
        List list = null;
        Price price = null;
        int i = 0;
        while (true) {
            int ANz = ADQ.ANz(serialDescriptor);
            if (ANz != -1) {
                if (ANz != 0) {
                    if (ANz != 1) {
                        if (ANz == 2) {
                            price = (Price) ADQ.AOF(price, X16.A00, serialDescriptor, 2);
                            i |= 4;
                        } else {
                            throw new X6K(ANz);
                        }
                    } else {
                        list = (List) ADQ.AOF(list, c3r9Arr[1], serialDescriptor, 1);
                        i |= 2;
                    }
                } else {
                    str = ADQ.AOK(serialDescriptor, 0);
                    i |= 1;
                }
            } else {
                ADQ.ASc(serialDescriptor);
                return new CartInfo(price, str, list, i);
            }
        }
    }

    @Override // X.C3R9, X.C3RA, X.C3RB
    public final SerialDescriptor getDescriptor() {
        return A01;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [X.3Sp, java.lang.Object, X.X0p] */
    static {
        ?? obj = new Object();
        A00 = obj;
        C73833Sq c73833Sq = new C73833Sq("com.shopify.checkout.models.CartInfo", obj, 3);
        c73833Sq.A00("token");
        c73833Sq.A00("lines");
        c73833Sq.A00("price");
        A01 = c73833Sq;
    }

    @Override // X.InterfaceC73823Sp
    public final C3R9[] childSerializers() {
        return new C3R9[]{C3RD.A01, CartInfo.A03[1], X16.A00};
    }

    @Override // X.C3RA
    public final /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        CartInfo cartInfo = (CartInfo) obj;
        boolean A1R = AbstractC167007dF.A1R(0, encoder, cartInfo);
        SerialDescriptor serialDescriptor = A01;
        C4D8 ADR = encoder.ADR(serialDescriptor);
        C3R9[] c3r9Arr = CartInfo.A03;
        ADR.ASL(cartInfo.A01, serialDescriptor, 0);
        ADR.ASH(cartInfo.A02, c3r9Arr[A1R ? 1 : 0], serialDescriptor, A1R ? 1 : 0);
        ADR.ASH(cartInfo.A00, X16.A00, serialDescriptor, 2);
        ADR.ASc(serialDescriptor);
    }

    @Override // X.InterfaceC73823Sp
    public final C3R9[] typeParametersSerializers() {
        return AbstractC54355O0n.A00;
    }
}
