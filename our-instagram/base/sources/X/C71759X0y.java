package X;

import com.facebook.react.modules.dialog.DialogModule;
import com.facebook.react.modules.intent.IntentModule;
import com.shopify.checkout.models.Discount;
import com.shopify.checkout.models.Money;
import kotlin.Deprecated;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Deprecated(level = AbstractC68219VIb.HIDDEN, message = "This synthesized declaration should not be used directly")
/* renamed from: X.X0y, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final /* synthetic */ class C71759X0y implements InterfaceC73823Sp {
    public static final C71759X0y A00;
    public static final SerialDescriptor A01;

    @Override // X.C3RB
    public final /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        C14360o3.A0B(decoder, 0);
        SerialDescriptor serialDescriptor = A01;
        C3T8 ADQ = decoder.ADQ(serialDescriptor);
        String str = null;
        Money money = null;
        String str2 = null;
        String str3 = null;
        Float f = null;
        int i = 0;
        while (true) {
            int ANz = ADQ.ANz(serialDescriptor);
            if (ANz != -1) {
                if (ANz != 0) {
                    if (ANz != 1) {
                        if (ANz != 2) {
                            if (ANz != 3) {
                                if (ANz == 4) {
                                    f = (Float) ADQ.AOE(f, C3TW.A00, serialDescriptor, 4);
                                    i |= 16;
                                } else {
                                    throw new X6K(ANz);
                                }
                            } else {
                                str3 = AbstractC65702TsY.A0e(str3, serialDescriptor, ADQ, 3);
                                i |= 8;
                            }
                        } else {
                            str2 = ADQ.AOK(serialDescriptor, 2);
                            i |= 4;
                        }
                    } else {
                        money = (Money) ADQ.AOF(money, X11.A00, serialDescriptor, 1);
                        i |= 2;
                    }
                } else {
                    str = ADQ.AOK(serialDescriptor, 0);
                    i |= 1;
                }
            } else {
                ADQ.ASc(serialDescriptor);
                return new Discount(money, f, str, str2, str3, i);
            }
        }
    }

    @Override // X.C3R9, X.C3RA, X.C3RB
    public final SerialDescriptor getDescriptor() {
        return A01;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [X.X0y, X.3Sp, java.lang.Object] */
    static {
        ?? obj = new Object();
        A00 = obj;
        C73833Sq c73833Sq = new C73833Sq("com.shopify.checkout.models.Discount", obj, 5);
        c73833Sq.A00(DialogModule.KEY_TITLE);
        c73833Sq.A00("amount");
        c73833Sq.A00("applicationType");
        c73833Sq.A01("valueType", true);
        c73833Sq.A01(IntentModule.EXTRA_MAP_KEY_FOR_VALUE, true);
        A01 = c73833Sq;
    }

    @Override // X.InterfaceC73823Sp
    public final C3R9[] childSerializers() {
        C3RD c3rd = C3RD.A01;
        return new C3R9[]{c3rd, X11.A00, c3rd, AbstractC192698gB.A00(c3rd), AbstractC192698gB.A00(C3TW.A00)};
    }

    @Override // X.C3RA
    public final /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        Discount discount = (Discount) obj;
        boolean A1R = AbstractC167007dF.A1R(0, encoder, discount);
        SerialDescriptor serialDescriptor = A01;
        C4D8 ADR = encoder.ADR(serialDescriptor);
        ADR.ASL(discount.A03, serialDescriptor, 0);
        ADR.ASH(discount.A00, X11.A00, serialDescriptor, A1R ? 1 : 0);
        ADR.ASL(discount.A02, serialDescriptor, 2);
        if (ADR.EiY(serialDescriptor, 3) || discount.A04 != null) {
            ADR.ASG(discount.A04, C3RD.A01, serialDescriptor, 3);
        }
        if (ADR.EiY(serialDescriptor, 4) || discount.A01 != null) {
            ADR.ASG(discount.A01, C3TW.A00, serialDescriptor, 4);
        }
        ADR.ASc(serialDescriptor);
    }

    @Override // X.InterfaceC73823Sp
    public final C3R9[] typeParametersSerializers() {
        return AbstractC54355O0n.A00;
    }
}
