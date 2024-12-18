package X;

import com.facebook.flipper.plugins.bloksdebugger.ScriptStatus;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import java.util.List;
import kotlin.Deprecated;
import kotlin.ReplaceWith;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Deprecated(level = AbstractC68219VIb.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
/* renamed from: X.Wzi, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C71717Wzi implements InterfaceC73823Sp {
    public static final C71717Wzi A00;
    public static final /* synthetic */ C73833Sq A01;

    @Override // X.C3RB
    public final /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        C14360o3.A0B(decoder, 0);
        C73833Sq c73833Sq = A01;
        C3T8 ADQ = decoder.ADQ(c73833Sq);
        C3R9[] c3r9Arr = C66551UMi.A09;
        String str = null;
        long j = 0;
        Object obj = null;
        List list = null;
        List list2 = null;
        ScriptStatus scriptStatus = null;
        String str2 = null;
        Object obj2 = null;
        String str3 = null;
        int i = 0;
        while (true) {
            int ANz = ADQ.ANz(c73833Sq);
            switch (ANz) {
                case -1:
                    ADQ.ASc(c73833Sq);
                    return new C66551UMi(scriptStatus, obj2, obj, str, str2, str3, list, list2, i, j);
                case 0:
                    str = ADQ.AOK(c73833Sq, 0);
                    i |= 1;
                    break;
                case 1:
                    scriptStatus = (ScriptStatus) ADQ.AOF(scriptStatus, c3r9Arr[1], c73833Sq, 1);
                    i |= 2;
                    break;
                case 2:
                    obj2 = ADQ.AOE(obj2, C71699Wz8.A00, c73833Sq, 2);
                    i |= 4;
                    break;
                case 3:
                    list = (List) ADQ.AOE(list, c3r9Arr[3], c73833Sq, 3);
                    i |= 8;
                    break;
                case 4:
                    list2 = (List) ADQ.AOF(list2, c3r9Arr[4], c73833Sq, 4);
                    i |= 16;
                    break;
                case 5:
                    str2 = (String) ADQ.AOE(str2, C3RD.A01, c73833Sq, 5);
                    i |= 32;
                    break;
                case 6:
                    obj = ADQ.AOE(obj, C71699Wz8.A00, c73833Sq, 6);
                    i |= 64;
                    break;
                case 7:
                    str3 = ADQ.AOK(c73833Sq, 7);
                    i |= 128;
                    break;
                case 8:
                    j = ADQ.AOC(c73833Sq, 8);
                    i |= 256;
                    break;
                default:
                    throw new X6K(ANz);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [X.3Sp, java.lang.Object, X.Wzi] */
    static {
        ?? obj = new Object();
        A00 = obj;
        C73833Sq c73833Sq = new C73833Sq("scriptExecuted", obj, 9);
        c73833Sq.A00("executionId");
        c73833Sq.A00(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS);
        c73833Sq.A00("result");
        c73833Sq.A00("bloksStackTrace");
        c73833Sq.A00("instructions");
        c73833Sq.A00("scriptUri");
        c73833Sq.A00("args");
        c73833Sq.A00("scriptType");
        c73833Sq.A00("durationNanos");
        A01 = c73833Sq;
    }

    @Override // X.InterfaceC73823Sp
    public final C3R9[] childSerializers() {
        C3R9[] c3r9Arr = C66551UMi.A09;
        C3RD c3rd = C3RD.A01;
        C3R9 c3r9 = c3r9Arr[1];
        C71699Wz8 c71699Wz8 = C71699Wz8.A00;
        return new C3R9[]{c3rd, c3r9, AbstractC192698gB.A00(c71699Wz8), AbstractC192698gB.A00(c3r9Arr[3]), c3r9Arr[4], AbstractC192698gB.A00(c3rd), AbstractC192698gB.A00(c71699Wz8), c3rd, C3RJ.A00};
    }

    @Override // X.C3R9, X.C3RA, X.C3RB
    public final SerialDescriptor getDescriptor() {
        return A01;
    }

    @Override // X.C3RA
    public final /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        C66551UMi c66551UMi = (C66551UMi) obj;
        boolean A1R = AbstractC167007dF.A1R(0, encoder, c66551UMi);
        C73833Sq c73833Sq = A01;
        C4D8 ADR = encoder.ADR(c73833Sq);
        C3R9[] c3r9Arr = C66551UMi.A09;
        ADR.ASL(c66551UMi.A04, c73833Sq, 0);
        ADR.ASH(c66551UMi.A01, c3r9Arr[A1R ? 1 : 0], c73833Sq, A1R ? 1 : 0);
        C71699Wz8 c71699Wz8 = C71699Wz8.A00;
        ADR.ASG(c66551UMi.A03, c71699Wz8, c73833Sq, 2);
        ADR.ASG(c66551UMi.A07, c3r9Arr[3], c73833Sq, 3);
        ADR.ASH(c66551UMi.A08, c3r9Arr[4], c73833Sq, 4);
        ADR.ASG(c66551UMi.A06, C3RD.A01, c73833Sq, 5);
        ADR.ASG(c66551UMi.A02, c71699Wz8, c73833Sq, 6);
        ADR.ASL(c66551UMi.A05, c73833Sq, 7);
        ADR.ASE(c73833Sq, 8, c66551UMi.A00);
        ADR.ASc(c73833Sq);
    }

    @Override // X.InterfaceC73823Sp
    public final C3R9[] typeParametersSerializers() {
        return AbstractC54355O0n.A00;
    }
}
