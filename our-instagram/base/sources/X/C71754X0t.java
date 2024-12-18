package X;

import com.shopify.checkout.models.Authentication;
import com.shopify.checkout.models.CheckoutOptions;
import com.shopify.checkout.models.Defaults;
import com.shopify.checkout.models.ThemeOptions;
import kotlin.Deprecated;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Deprecated(level = AbstractC68219VIb.HIDDEN, message = "This synthesized declaration should not be used directly")
/* renamed from: X.X0t, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final /* synthetic */ class C71754X0t implements InterfaceC73823Sp {
    public static final C71754X0t A00;
    public static final SerialDescriptor A01;

    @Override // X.C3RB
    public final /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        C14360o3.A0B(decoder, 0);
        SerialDescriptor serialDescriptor = A01;
        C3T8 ADQ = decoder.ADQ(serialDescriptor);
        C3R9[] c3r9Arr = CheckoutOptions.A04;
        Defaults defaults = null;
        Authentication authentication = null;
        ThemeOptions themeOptions = null;
        int i = 0;
        boolean z = false;
        while (true) {
            int ANz = ADQ.ANz(serialDescriptor);
            if (ANz != -1) {
                if (ANz != 0) {
                    if (ANz != 1) {
                        if (ANz != 2) {
                            if (ANz == 3) {
                                themeOptions = (ThemeOptions) ADQ.AOF(themeOptions, c3r9Arr[3], serialDescriptor, 3);
                                i |= 8;
                            } else {
                                throw new X6K(ANz);
                            }
                        } else {
                            z = ADQ.ANs(serialDescriptor, 2);
                            i |= 4;
                        }
                    } else {
                        authentication = (Authentication) ADQ.AOF(authentication, C71748X0n.A00, serialDescriptor, 1);
                        i |= 2;
                    }
                } else {
                    defaults = (Defaults) ADQ.AOE(defaults, C71756X0v.A00, serialDescriptor, 0);
                    i |= 1;
                }
            } else {
                ADQ.ASc(serialDescriptor);
                return new CheckoutOptions(authentication, defaults, themeOptions, i, z);
            }
        }
    }

    @Override // X.C3R9, X.C3RA, X.C3RB
    public final SerialDescriptor getDescriptor() {
        return A01;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [X.3Sp, X.X0t, java.lang.Object] */
    static {
        ?? obj = new Object();
        A00 = obj;
        C73833Sq c73833Sq = new C73833Sq("com.shopify.checkout.models.CheckoutOptions", obj, 4);
        c73833Sq.A01("defaults", true);
        c73833Sq.A00("auth");
        c73833Sq.A01("shouldInjectJS", true);
        c73833Sq.A01("theme", true);
        A01 = c73833Sq;
    }

    @Override // X.InterfaceC73823Sp
    public final C3R9[] childSerializers() {
        return new C3R9[]{AbstractC192698gB.A00(C71756X0v.A00), C71748X0n.A00, C3SL.A00, CheckoutOptions.A04[3]};
    }

    @Override // X.C3RA
    public final /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        CheckoutOptions checkoutOptions = (CheckoutOptions) obj;
        boolean A1R = AbstractC167007dF.A1R(0, encoder, checkoutOptions);
        SerialDescriptor serialDescriptor = A01;
        C4D8 ADR = encoder.ADR(serialDescriptor);
        C3R9[] c3r9Arr = CheckoutOptions.A04;
        if (ADR.EiY(serialDescriptor, 0) || checkoutOptions.A01 != null) {
            ADR.ASG(checkoutOptions.A01, C71756X0v.A00, serialDescriptor, 0);
        }
        ADR.ASH(checkoutOptions.A00, C71748X0n.A00, serialDescriptor, A1R ? 1 : 0);
        if (ADR.EiY(serialDescriptor, 2) || checkoutOptions.A03) {
            ADR.AS2(serialDescriptor, 2, checkoutOptions.A03);
        }
        if (ADR.EiY(serialDescriptor, 3) || checkoutOptions.A02 != ThemeOptions.A03) {
            ADR.ASH(checkoutOptions.A02, c3r9Arr[3], serialDescriptor, 3);
        }
        ADR.ASc(serialDescriptor);
    }

    @Override // X.InterfaceC73823Sp
    public final C3R9[] typeParametersSerializers() {
        return AbstractC54355O0n.A00;
    }
}
