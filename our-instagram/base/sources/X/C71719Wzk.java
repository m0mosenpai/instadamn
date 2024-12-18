package X;

import com.facebook.flipper.plugins.bloksdebugger.StateUpdateV2;
import com.facebook.react.modules.intent.IntentModule;
import java.util.List;
import kotlin.Deprecated;
import kotlin.ReplaceWith;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Deprecated(level = AbstractC68219VIb.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
/* renamed from: X.Wzk, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C71719Wzk implements InterfaceC73823Sp {
    public static final C71719Wzk A00;
    public static final /* synthetic */ C73833Sq A01;

    @Override // X.C3RB
    public final /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        C14360o3.A0B(decoder, 0);
        C73833Sq c73833Sq = A01;
        C3T8 ADQ = decoder.ADQ(c73833Sq);
        C3R9[] c3r9Arr = StateUpdateV2.A06;
        String str = null;
        String str2 = null;
        String str3 = null;
        Object obj = null;
        String str4 = null;
        List list = null;
        int i = 0;
        while (true) {
            int ANz = ADQ.ANz(c73833Sq);
            switch (ANz) {
                case -1:
                    ADQ.ASc(c73833Sq);
                    return new StateUpdateV2(obj, str, str2, str3, str4, list, i);
                case 0:
                    str = ADQ.AOK(c73833Sq, 0);
                    i |= 1;
                    break;
                case 1:
                    str2 = (String) ADQ.AOE(str2, C3RD.A01, c73833Sq, 1);
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
                    str4 = ADQ.AOK(c73833Sq, 4);
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

    /* JADX WARN: Type inference failed for: r3v0, types: [X.3Sp, java.lang.Object, X.Wzk] */
    static {
        ?? obj = new Object();
        A00 = obj;
        C73833Sq c73833Sq = new C73833Sq("com.facebook.flipper.plugins.bloksdebugger.StateUpdateV2", obj, 6);
        c73833Sq.A00("scriptExecutionId");
        c73833Sq.A00("lispyUri");
        c73833Sq.A00("key");
        c73833Sq.A00(IntentModule.EXTRA_MAP_KEY_FOR_VALUE);
        c73833Sq.A00("framework");
        c73833Sq.A00("keyPath");
        A01 = c73833Sq;
    }

    @Override // X.InterfaceC73823Sp
    public final C3R9[] childSerializers() {
        C3R9[] c3r9Arr = StateUpdateV2.A06;
        C3RD c3rd = C3RD.A01;
        return new C3R9[]{c3rd, AbstractC192698gB.A00(c3rd), c3rd, AbstractC192698gB.A00(C71699Wz8.A00), c3rd, AbstractC192698gB.A00(c3r9Arr[5])};
    }

    @Override // X.C3R9, X.C3RA, X.C3RB
    public final SerialDescriptor getDescriptor() {
        return A01;
    }

    @Override // X.C3RA
    public final /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        StateUpdateV2 stateUpdateV2 = (StateUpdateV2) obj;
        boolean A1R = AbstractC167007dF.A1R(0, encoder, stateUpdateV2);
        C73833Sq c73833Sq = A01;
        C4D8 ADR = encoder.ADR(c73833Sq);
        C3R9[] c3r9Arr = StateUpdateV2.A06;
        ADR.ASL(stateUpdateV2.A04, c73833Sq, 0);
        ADR.ASG(stateUpdateV2.A03, C3RD.A01, c73833Sq, A1R ? 1 : 0);
        ADR.ASL(stateUpdateV2.A02, c73833Sq, 2);
        ADR.ASG(stateUpdateV2.A00, C71699Wz8.A00, c73833Sq, 3);
        ADR.ASL(stateUpdateV2.A01, c73833Sq, 4);
        ADR.ASG(stateUpdateV2.A05, c3r9Arr[5], c73833Sq, 5);
        ADR.ASc(c73833Sq);
    }

    @Override // X.InterfaceC73823Sp
    public final C3R9[] typeParametersSerializers() {
        return AbstractC54355O0n.A00;
    }
}
