package X;

import com.facebook.react.modules.intent.IntentModule;
import java.util.List;
import kotlin.Deprecated;
import kotlin.ReplaceWith;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Deprecated(level = AbstractC68219VIb.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
/* renamed from: X.Wzj, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C71718Wzj implements InterfaceC73823Sp {
    public static final C71718Wzj A00;
    public static final /* synthetic */ C73833Sq A01;

    @Override // X.C3RB
    public final /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        C14360o3.A0B(decoder, 0);
        C73833Sq c73833Sq = A01;
        C3T8 ADQ = decoder.ADQ(c73833Sq);
        C3R9[] c3r9Arr = WVP.A06;
        String str = null;
        String str2 = null;
        List list = null;
        long j = 0;
        int i = 0;
        String str3 = null;
        Object obj = null;
        while (true) {
            int ANz = ADQ.ANz(c73833Sq);
            switch (ANz) {
                case -1:
                    ADQ.ASc(c73833Sq);
                    return new WVP(obj, str, str3, str2, list, i, j);
                case 0:
                    j = ADQ.AOC(c73833Sq, 0);
                    i |= 1;
                    break;
                case 1:
                    str = (String) ADQ.AOE(str, C3RD.A01, c73833Sq, 1);
                    i |= 2;
                    break;
                case 2:
                    str3 = ADQ.AOK(c73833Sq, 2);
                    i |= 4;
                    break;
                case 3:
                    obj = ADQ.AOE(obj, C71699Wz8.A00, c73833Sq, 3);
                    i |= 8;
                    break;
                case 4:
                    str2 = ADQ.AOK(c73833Sq, 4);
                    i |= 16;
                    break;
                case 5:
                    list = (List) ADQ.AOE(list, c3r9Arr[5], c73833Sq, 5);
                    i |= 32;
                    break;
                default:
                    throw new X6K(ANz);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [X.3Sp, java.lang.Object, X.Wzj] */
    static {
        ?? obj = new Object();
        A00 = obj;
        C73833Sq c73833Sq = new C73833Sq("stateUpdate", obj, 6);
        c73833Sq.A00("ts");
        c73833Sq.A00("lispyUri");
        c73833Sq.A00("key");
        c73833Sq.A00(IntentModule.EXTRA_MAP_KEY_FOR_VALUE);
        c73833Sq.A00("framework");
        c73833Sq.A00("keyPath");
        A01 = c73833Sq;
    }

    @Override // X.InterfaceC73823Sp
    public final C3R9[] childSerializers() {
        C3R9[] c3r9Arr = WVP.A06;
        C3RJ c3rj = C3RJ.A00;
        C3RD c3rd = C3RD.A01;
        return new C3R9[]{c3rj, AbstractC192698gB.A00(c3rd), c3rd, AbstractC192698gB.A00(C71699Wz8.A00), c3rd, AbstractC192698gB.A00(c3r9Arr[5])};
    }

    @Override // X.C3R9, X.C3RA, X.C3RB
    public final SerialDescriptor getDescriptor() {
        return A01;
    }

    @Override // X.C3RA
    public final /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        WVP wvp = (WVP) obj;
        boolean A1R = AbstractC167007dF.A1R(0, encoder, wvp);
        C73833Sq c73833Sq = A01;
        C4D8 ADR = encoder.ADR(c73833Sq);
        C3R9[] c3r9Arr = WVP.A06;
        ADR.ASE(c73833Sq, 0, wvp.A00);
        ADR.ASG(wvp.A04, C3RD.A01, c73833Sq, A1R ? 1 : 0);
        ADR.ASL(wvp.A03, c73833Sq, 2);
        ADR.ASG(wvp.A01, C71699Wz8.A00, c73833Sq, 3);
        ADR.ASL(wvp.A02, c73833Sq, 4);
        ADR.ASG(wvp.A05, c3r9Arr[5], c73833Sq, 5);
        ADR.ASc(c73833Sq);
    }

    @Override // X.InterfaceC73823Sp
    public final C3R9[] typeParametersSerializers() {
        return AbstractC54355O0n.A00;
    }
}
