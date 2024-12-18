package X;

import com.instagram.common.bloks.flipper.BloksPayloadCacheStatus;
import java.util.List;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.ReplaceWith;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Deprecated(level = AbstractC68219VIb.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
/* renamed from: X.Wza, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C71709Wza implements InterfaceC73823Sp {
    public static final C71709Wza A00;
    public static final /* synthetic */ C73833Sq A01;

    @Override // X.C3RB
    public final /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        C14360o3.A0B(decoder, 0);
        C73833Sq c73833Sq = A01;
        C3T8 ADQ = decoder.ADQ(c73833Sq);
        C3R9[] c3r9Arr = C66550UMh.A08;
        String str = null;
        String str2 = null;
        List list = null;
        Map map = null;
        Object obj = null;
        BloksPayloadCacheStatus bloksPayloadCacheStatus = null;
        String str3 = null;
        String str4 = null;
        int i = 0;
        while (true) {
            int ANz = ADQ.ANz(c73833Sq);
            switch (ANz) {
                case -1:
                    ADQ.ASc(c73833Sq);
                    return new C66550UMh(bloksPayloadCacheStatus, obj, str, str3, str4, str2, list, map, i);
                case 0:
                    str = ADQ.AOK(c73833Sq, 0);
                    i |= 1;
                    break;
                case 1:
                    bloksPayloadCacheStatus = (BloksPayloadCacheStatus) ADQ.AOF(bloksPayloadCacheStatus, c3r9Arr[1], c73833Sq, 1);
                    i |= 2;
                    break;
                case 2:
                    str3 = (String) ADQ.AOE(str3, C3RD.A01, c73833Sq, 2);
                    i |= 4;
                    break;
                case 3:
                    str4 = (String) ADQ.AOE(str4, C3RD.A01, c73833Sq, 3);
                    i |= 8;
                    break;
                case 4:
                    map = (Map) ADQ.AOE(map, c3r9Arr[4], c73833Sq, 4);
                    i |= 16;
                    break;
                case 5:
                    obj = ADQ.AOE(obj, C71699Wz8.A00, c73833Sq, 5);
                    i |= 32;
                    break;
                case 6:
                    list = (List) ADQ.AOE(list, c3r9Arr[6], c73833Sq, 6);
                    i |= 64;
                    break;
                case 7:
                    str2 = AbstractC65702TsY.A0e(str2, c73833Sq, ADQ, 7);
                    i |= 128;
                    break;
                default:
                    throw new X6K(ANz);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [X.Wza, X.3Sp, java.lang.Object] */
    static {
        ?? obj = new Object();
        A00 = obj;
        C73833Sq c73833Sq = new C73833Sq("rawPayload", obj, 8);
        c73833Sq.A00("payloadType");
        c73833Sq.A00("cacheStatus");
        c73833Sq.A00("payloadRaw");
        c73833Sq.A00("cacheKey");
        c73833Sq.A00("perfMarkersMillis");
        c73833Sq.A00("annotations");
        c73833Sq.A00("siblingKeys");
        c73833Sq.A00("appId");
        A01 = c73833Sq;
    }

    @Override // X.InterfaceC73823Sp
    public final C3R9[] childSerializers() {
        C3R9[] c3r9Arr = C66550UMh.A08;
        C3RD c3rd = C3RD.A01;
        return new C3R9[]{c3rd, c3r9Arr[1], AbstractC192698gB.A00(c3rd), AbstractC192698gB.A00(c3rd), AbstractC192698gB.A00(c3r9Arr[4]), AbstractC192698gB.A00(C71699Wz8.A00), AbstractC192698gB.A00(c3r9Arr[6]), AbstractC192698gB.A00(c3rd)};
    }

    @Override // X.C3R9, X.C3RA, X.C3RB
    public final SerialDescriptor getDescriptor() {
        return A01;
    }

    @Override // X.C3RA
    public final /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        C66550UMh c66550UMh = (C66550UMh) obj;
        boolean A1R = AbstractC167007dF.A1R(0, encoder, c66550UMh);
        C73833Sq c73833Sq = A01;
        C4D8 ADR = encoder.ADR(c73833Sq);
        C3R9[] c3r9Arr = C66550UMh.A08;
        ADR.ASL(c66550UMh.A05, c73833Sq, 0);
        ADR.ASH(c66550UMh.A00, c3r9Arr[A1R ? 1 : 0], c73833Sq, A1R ? 1 : 0);
        C3RD c3rd = C3RD.A01;
        ADR.ASG(c66550UMh.A04, c3rd, c73833Sq, 2);
        ADR.ASG(c66550UMh.A03, c3rd, c73833Sq, 3);
        ADR.ASG(c66550UMh.A07, c3r9Arr[4], c73833Sq, 4);
        ADR.ASG(c66550UMh.A01, C71699Wz8.A00, c73833Sq, 5);
        ADR.ASG(c66550UMh.A06, c3r9Arr[6], c73833Sq, 6);
        ADR.ASG(c66550UMh.A02, c3rd, c73833Sq, 7);
        ADR.ASc(c73833Sq);
    }

    @Override // X.InterfaceC73823Sp
    public final C3R9[] typeParametersSerializers() {
        return AbstractC54355O0n.A00;
    }
}
