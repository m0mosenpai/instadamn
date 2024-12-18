package X;

import com.shopify.checkout.models.errors.ErrorGroup;
import com.shopify.checkout.models.errors.ErrorGroupSerializer;
import com.shopify.checkout.models.errors.VaultedPaymentErrorPayload;
import kotlin.Deprecated;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Deprecated(level = AbstractC68219VIb.HIDDEN, message = "This synthesized declaration should not be used directly")
/* loaded from: classes11.dex */
public final /* synthetic */ class X1C implements InterfaceC73823Sp {
    public static final X1C A00;
    public static final SerialDescriptor A01;

    @Override // X.C3RB
    public final /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        C14360o3.A0B(decoder, 0);
        SerialDescriptor serialDescriptor = A01;
        C3T8 ADQ = decoder.ADQ(serialDescriptor);
        String str = null;
        EnumC68139VDb enumC68139VDb = null;
        String str2 = null;
        ErrorGroup errorGroup = null;
        int i = 0;
        while (true) {
            int ANz = ADQ.ANz(serialDescriptor);
            if (ANz != -1) {
                if (ANz != 0) {
                    if (ANz != 1) {
                        if (ANz != 2) {
                            if (ANz == 3) {
                                errorGroup = (ErrorGroup) ADQ.AOF(errorGroup, ErrorGroupSerializer.A00, serialDescriptor, 3);
                                i |= 8;
                            } else {
                                throw new X6K(ANz);
                            }
                        } else {
                            str2 = AbstractC65702TsY.A0e(str2, serialDescriptor, ADQ, 2);
                            i |= 4;
                        }
                    } else {
                        enumC68139VDb = (EnumC68139VDb) ADQ.AOF(enumC68139VDb, C71703WzK.A00, serialDescriptor, 1);
                        i |= 2;
                    }
                } else {
                    str = ADQ.AOK(serialDescriptor, 0);
                    i |= 1;
                }
            } else {
                ADQ.ASc(serialDescriptor);
                return new VaultedPaymentErrorPayload(errorGroup, enumC68139VDb, str, str2, i);
            }
        }
    }

    @Override // X.C3R9, X.C3RA, X.C3RB
    public final SerialDescriptor getDescriptor() {
        return A01;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [X.3Sp, java.lang.Object, X.X1C] */
    static {
        ?? obj = new Object();
        A00 = obj;
        A01 = AbstractC65703TsZ.A1E("com.shopify.checkout.models.errors.VaultedPaymentErrorPayload", obj, 4);
    }

    @Override // X.InterfaceC73823Sp
    public final C3R9[] childSerializers() {
        C3RD c3rd = C3RD.A01;
        return new C3R9[]{c3rd, C71703WzK.A00, AbstractC192698gB.A00(c3rd), ErrorGroupSerializer.A00};
    }

    @Override // X.C3RA
    public final /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        VaultedPaymentErrorPayload vaultedPaymentErrorPayload = (VaultedPaymentErrorPayload) obj;
        boolean A1R = AbstractC167007dF.A1R(0, encoder, vaultedPaymentErrorPayload);
        SerialDescriptor serialDescriptor = A01;
        C4D8 ADR = encoder.ADR(serialDescriptor);
        ADR.ASL(vaultedPaymentErrorPayload.A02, serialDescriptor, 0);
        ADR.ASH(vaultedPaymentErrorPayload.A01, C71703WzK.A00, serialDescriptor, A1R ? 1 : 0);
        if (ADR.EiY(serialDescriptor, 2) || vaultedPaymentErrorPayload.A03 != null) {
            ADR.ASG(vaultedPaymentErrorPayload.A03, C3RD.A01, serialDescriptor, 2);
        }
        ADR.ASH(vaultedPaymentErrorPayload.A00, ErrorGroupSerializer.A00, serialDescriptor, 3);
        ADR.ASc(serialDescriptor);
    }

    @Override // X.InterfaceC73823Sp
    public final C3R9[] typeParametersSerializers() {
        return AbstractC54355O0n.A00;
    }
}
