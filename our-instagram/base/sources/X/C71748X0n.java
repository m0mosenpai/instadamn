package X;

import com.shopify.checkout.models.Authentication;
import com.shopify.checkout.models.AuthenticationVersion;
import com.shopify.checkout.models.AuthenticationVersionSerializer;
import kotlin.Deprecated;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Deprecated(level = AbstractC68219VIb.HIDDEN, message = "This synthesized declaration should not be used directly")
/* renamed from: X.X0n, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final /* synthetic */ class C71748X0n implements InterfaceC73823Sp {
    public static final C71748X0n A00;
    public static final SerialDescriptor A01;

    @Override // X.C3RB
    public final /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        C14360o3.A0B(decoder, 0);
        SerialDescriptor serialDescriptor = A01;
        C3T8 ADQ = decoder.ADQ(serialDescriptor);
        AuthenticationVersion authenticationVersion = null;
        String str = null;
        int i = 0;
        while (true) {
            int ANz = ADQ.ANz(serialDescriptor);
            if (ANz != -1) {
                if (ANz != 0) {
                    if (ANz == 1) {
                        str = ADQ.AOK(serialDescriptor, 1);
                        i |= 2;
                    } else {
                        throw new X6K(ANz);
                    }
                } else {
                    authenticationVersion = (AuthenticationVersion) ADQ.AOF(authenticationVersion, AuthenticationVersionSerializer.A00, serialDescriptor, 0);
                    i |= 1;
                }
            } else {
                ADQ.ASc(serialDescriptor);
                return new Authentication(authenticationVersion, str, i);
            }
        }
    }

    @Override // X.C3R9, X.C3RA, X.C3RB
    public final SerialDescriptor getDescriptor() {
        return A01;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [X.3Sp, java.lang.Object, X.X0n] */
    static {
        ?? obj = new Object();
        A00 = obj;
        C73833Sq c73833Sq = new C73833Sq("com.shopify.checkout.models.Authentication", obj, 2);
        c73833Sq.A00("version");
        c73833Sq.A00("payload");
        A01 = c73833Sq;
    }

    @Override // X.InterfaceC73823Sp
    public final C3R9[] childSerializers() {
        return new C3R9[]{AuthenticationVersionSerializer.A00, C3RD.A01};
    }

    @Override // X.C3RA
    public final /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        Authentication authentication = (Authentication) obj;
        boolean A1R = AbstractC167007dF.A1R(0, encoder, authentication);
        SerialDescriptor serialDescriptor = A01;
        C4D8 ADR = encoder.ADR(serialDescriptor);
        ADR.ASH(authentication.A00, AuthenticationVersionSerializer.A00, serialDescriptor, 0);
        ADR.ASL(authentication.A01, serialDescriptor, A1R ? 1 : 0);
        ADR.ASc(serialDescriptor);
    }

    @Override // X.InterfaceC73823Sp
    public final C3R9[] typeParametersSerializers() {
        return AbstractC54355O0n.A00;
    }
}
