package X;

import com.shopify.checkout.models.NetworkRequestPayload;
import java.util.Map;
import kotlin.Deprecated;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Deprecated(level = AbstractC68219VIb.HIDDEN, message = "This synthesized declaration should not be used directly")
/* loaded from: classes11.dex */
public final /* synthetic */ class X12 implements InterfaceC73823Sp {
    public static final X12 A00;
    public static final SerialDescriptor A01;

    @Override // X.C3RB
    public final /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        C14360o3.A0B(decoder, 0);
        SerialDescriptor serialDescriptor = A01;
        C3T8 ADQ = decoder.ADQ(serialDescriptor);
        C3R9[] c3r9Arr = NetworkRequestPayload.A06;
        String str = null;
        String str2 = null;
        String str3 = null;
        Map map = null;
        String str4 = null;
        String str5 = null;
        int i = 0;
        while (true) {
            int ANz = ADQ.ANz(serialDescriptor);
            switch (ANz) {
                case -1:
                    ADQ.ASc(serialDescriptor);
                    return new NetworkRequestPayload(str, str2, str3, str4, str5, map, i);
                case 0:
                    str = (String) ADQ.AOE(str, C3RD.A01, serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    str2 = (String) ADQ.AOE(str2, C3RD.A01, serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    str3 = (String) ADQ.AOE(str3, C3RD.A01, serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    map = (Map) ADQ.AOE(map, c3r9Arr[3], serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    str4 = (String) ADQ.AOE(str4, C3RD.A01, serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    str5 = (String) ADQ.AOE(str5, C3RD.A01, serialDescriptor, 5);
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

    /* JADX WARN: Type inference failed for: r3v0, types: [X.3Sp, java.lang.Object, X.X12] */
    static {
        ?? obj = new Object();
        A00 = obj;
        C73833Sq c73833Sq = new C73833Sq("com.shopify.checkout.models.NetworkRequestPayload", obj, 6);
        c73833Sq.A00("url");
        c73833Sq.A00("method");
        c73833Sq.A00("body");
        c73833Sq.A00("headers");
        c73833Sq.A00("initiatorType");
        c73833Sq.A00("startTime");
        A01 = c73833Sq;
    }

    @Override // X.InterfaceC73823Sp
    public final C3R9[] childSerializers() {
        C3R9[] c3r9Arr = NetworkRequestPayload.A06;
        C3RD c3rd = C3RD.A01;
        return new C3R9[]{AbstractC192698gB.A00(c3rd), AbstractC192698gB.A00(c3rd), AbstractC192698gB.A00(c3rd), AbstractC192698gB.A00(c3r9Arr[3]), AbstractC192698gB.A00(c3rd), AbstractC192698gB.A00(c3rd)};
    }

    @Override // X.C3RA
    public final /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        NetworkRequestPayload networkRequestPayload = (NetworkRequestPayload) obj;
        boolean A1R = AbstractC167007dF.A1R(0, encoder, networkRequestPayload);
        SerialDescriptor serialDescriptor = A01;
        C4D8 ADR = encoder.ADR(serialDescriptor);
        C3R9[] c3r9Arr = NetworkRequestPayload.A06;
        C3RD c3rd = C3RD.A01;
        ADR.ASG(networkRequestPayload.A04, c3rd, serialDescriptor, 0);
        ADR.ASG(networkRequestPayload.A02, c3rd, serialDescriptor, A1R ? 1 : 0);
        ADR.ASG(networkRequestPayload.A00, c3rd, serialDescriptor, 2);
        ADR.ASG(networkRequestPayload.A05, c3r9Arr[3], serialDescriptor, 3);
        ADR.ASG(networkRequestPayload.A01, c3rd, serialDescriptor, 4);
        ADR.ASG(networkRequestPayload.A03, c3rd, serialDescriptor, 5);
        ADR.ASc(serialDescriptor);
    }

    @Override // X.InterfaceC73823Sp
    public final C3R9[] typeParametersSerializers() {
        return AbstractC54355O0n.A00;
    }
}