package X;

import com.shopify.checkout.models.CartLineImage;
import kotlin.Deprecated;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Deprecated(level = AbstractC68219VIb.HIDDEN, message = "This synthesized declaration should not be used directly")
/* renamed from: X.X0r, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final /* synthetic */ class C71752X0r implements InterfaceC73823Sp {
    public static final C71752X0r A00;
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
        int i = 0;
        while (true) {
            int ANz = ADQ.ANz(serialDescriptor);
            if (ANz != -1) {
                if (ANz != 0) {
                    if (ANz != 1) {
                        if (ANz != 2) {
                            if (ANz == 3) {
                                str4 = AbstractC65702TsY.A0e(str4, serialDescriptor, ADQ, 3);
                                i |= 8;
                            } else {
                                throw new X6K(ANz);
                            }
                        } else {
                            str3 = ADQ.AOK(serialDescriptor, 2);
                            i |= 4;
                        }
                    } else {
                        str2 = ADQ.AOK(serialDescriptor, 1);
                        i |= 2;
                    }
                } else {
                    str = ADQ.AOK(serialDescriptor, 0);
                    i |= 1;
                }
            } else {
                ADQ.ASc(serialDescriptor);
                return new CartLineImage(str, str2, str3, str4, i);
            }
        }
    }

    @Override // X.C3R9, X.C3RA, X.C3RB
    public final SerialDescriptor getDescriptor() {
        return A01;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [X.3Sp, java.lang.Object, X.X0r] */
    static {
        ?? obj = new Object();
        A00 = obj;
        C73833Sq c73833Sq = new C73833Sq("com.shopify.checkout.models.CartLineImage", obj, 4);
        c73833Sq.A00("sm");
        c73833Sq.A00("md");
        c73833Sq.A00("lg");
        c73833Sq.A01("altText", true);
        A01 = c73833Sq;
    }

    @Override // X.InterfaceC73823Sp
    public final C3R9[] childSerializers() {
        C3RD c3rd = C3RD.A01;
        return new C3R9[]{c3rd, c3rd, c3rd, AbstractC192698gB.A00(c3rd)};
    }

    @Override // X.C3RA
    public final /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        CartLineImage cartLineImage = (CartLineImage) obj;
        boolean A1R = AbstractC167007dF.A1R(0, encoder, cartLineImage);
        SerialDescriptor serialDescriptor = A01;
        C4D8 ADR = encoder.ADR(serialDescriptor);
        ADR.ASL(cartLineImage.A03, serialDescriptor, 0);
        ADR.ASL(cartLineImage.A02, serialDescriptor, A1R ? 1 : 0);
        ADR.ASL(cartLineImage.A01, serialDescriptor, 2);
        if (ADR.EiY(serialDescriptor, 3) || cartLineImage.A00 != null) {
            ADR.ASG(cartLineImage.A00, C3RD.A01, serialDescriptor, 3);
        }
        ADR.ASc(serialDescriptor);
    }

    @Override // X.InterfaceC73823Sp
    public final C3R9[] typeParametersSerializers() {
        return AbstractC54355O0n.A00;
    }
}
