package X;

import com.shopify.checkout.models.Defaults;
import java.util.List;
import kotlin.Deprecated;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Deprecated(level = AbstractC68219VIb.HIDDEN, message = "This synthesized declaration should not be used directly")
/* renamed from: X.X0v, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final /* synthetic */ class C71756X0v implements InterfaceC73823Sp {
    public static final C71756X0v A00;
    public static final SerialDescriptor A01;

    @Override // X.C3RB
    public final /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        C14360o3.A0B(decoder, 0);
        SerialDescriptor serialDescriptor = A01;
        C3T8 ADQ = decoder.ADQ(serialDescriptor);
        C3R9[] c3r9Arr = Defaults.A04;
        String str = null;
        List list = null;
        List list2 = null;
        String str2 = null;
        int i = 0;
        while (true) {
            int ANz = ADQ.ANz(serialDescriptor);
            if (ANz != -1) {
                if (ANz != 0) {
                    if (ANz != 1) {
                        if (ANz != 2) {
                            if (ANz == 3) {
                                str2 = AbstractC65702TsY.A0e(str2, serialDescriptor, ADQ, 3);
                                i |= 8;
                            } else {
                                throw new X6K(ANz);
                            }
                        } else {
                            list2 = (List) ADQ.AOE(list2, c3r9Arr[2], serialDescriptor, 2);
                            i |= 4;
                        }
                    } else {
                        list = (List) ADQ.AOE(list, c3r9Arr[1], serialDescriptor, 1);
                        i |= 2;
                    }
                } else {
                    str = AbstractC65702TsY.A0e(str, serialDescriptor, ADQ, 0);
                    i |= 1;
                }
            } else {
                ADQ.ASc(serialDescriptor);
                return new Defaults(str, str2, list, list2, i);
            }
        }
    }

    @Override // X.C3R9, X.C3RA, X.C3RB
    public final SerialDescriptor getDescriptor() {
        return A01;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [X.X0v, X.3Sp, java.lang.Object] */
    static {
        ?? obj = new Object();
        A00 = obj;
        C73833Sq c73833Sq = new C73833Sq("com.shopify.checkout.models.Defaults", obj, 4);
        c73833Sq.A01("email", true);
        c73833Sq.A01("shippingAddresses", true);
        c73833Sq.A01("paymentMethods", true);
        c73833Sq.A01("levelOfPriorConsentGiven", true);
        A01 = c73833Sq;
    }

    @Override // X.InterfaceC73823Sp
    public final C3R9[] childSerializers() {
        C3R9[] c3r9Arr = Defaults.A04;
        C3RD c3rd = C3RD.A01;
        return new C3R9[]{AbstractC192698gB.A00(c3rd), AbstractC192698gB.A00(c3r9Arr[1]), AbstractC192698gB.A00(c3r9Arr[2]), AbstractC192698gB.A00(c3rd)};
    }

    @Override // X.C3RA
    public final /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        Defaults defaults = (Defaults) obj;
        boolean A1R = AbstractC167007dF.A1R(0, encoder, defaults);
        SerialDescriptor serialDescriptor = A01;
        C4D8 ADR = encoder.ADR(serialDescriptor);
        C3R9[] c3r9Arr = Defaults.A04;
        if (ADR.EiY(serialDescriptor, 0) || defaults.A00 != null) {
            ADR.ASG(defaults.A00, C3RD.A01, serialDescriptor, 0);
        }
        if (ADR.EiY(serialDescriptor, A1R ? 1 : 0) || defaults.A03 != null) {
            ADR.ASG(defaults.A03, c3r9Arr[A1R ? 1 : 0], serialDescriptor, A1R ? 1 : 0);
        }
        if (ADR.EiY(serialDescriptor, 2) || defaults.A02 != null) {
            ADR.ASG(defaults.A02, c3r9Arr[2], serialDescriptor, 2);
        }
        if (ADR.EiY(serialDescriptor, 3) || defaults.A01 != null) {
            ADR.ASG(defaults.A01, C3RD.A01, serialDescriptor, 3);
        }
        ADR.ASc(serialDescriptor);
    }

    @Override // X.InterfaceC73823Sp
    public final C3R9[] typeParametersSerializers() {
        return AbstractC54355O0n.A00;
    }
}
