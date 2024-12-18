package X;

import com.facebook.react.modules.intent.IntentModule;
import com.instagram.igsignals.core.IgSignalsModelPrediction;
import java.util.HashMap;
import java.util.Map;
import kotlin.Deprecated;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Deprecated(level = AbstractC68219VIb.HIDDEN, message = "This synthesized declaration should not be used directly")
/* renamed from: X.X0g, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final /* synthetic */ class C71741X0g implements InterfaceC73823Sp {
    public static final C71741X0g A00;
    public static final SerialDescriptor A01;

    @Override // X.C3RB
    public final /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        C14360o3.A0B(decoder, 0);
        SerialDescriptor serialDescriptor = A01;
        C3T8 ADQ = decoder.ADQ(serialDescriptor);
        C3R9[] c3r9Arr = IgSignalsModelPrediction.A07;
        Map map = null;
        long j = 0;
        String str = null;
        WD2 wd2 = null;
        double d = 0.0d;
        boolean z = false;
        int i = 0;
        long j2 = 0;
        while (true) {
            int ANz = ADQ.ANz(serialDescriptor);
            switch (ANz) {
                case -1:
                    ADQ.ASc(serialDescriptor);
                    return new IgSignalsModelPrediction(wd2, str, map, d, i, j2, j, z);
                case 0:
                    d = ADQ.ANy(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    map = (Map) ADQ.AOF(map, c3r9Arr[1], serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    z = ADQ.ANs(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    str = (String) ADQ.AOE(str, C3RD.A01, serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    wd2 = (WD2) ADQ.AOE(wd2, C71742X0h.A00, serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    j2 = ADQ.AOC(serialDescriptor, 5);
                    i |= 32;
                    break;
                case 6:
                    j = ADQ.AOC(serialDescriptor, 6);
                    i |= 64;
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

    /* JADX WARN: Type inference failed for: r3v0, types: [X.X0g, X.3Sp, java.lang.Object] */
    static {
        ?? obj = new Object();
        A00 = obj;
        C73833Sq c73833Sq = new C73833Sq("com.instagram.igsignals.core.IgSignalsModelPrediction", obj, 7);
        c73833Sq.A01(IntentModule.EXTRA_MAP_KEY_FOR_VALUE, true);
        c73833Sq.A01("probabilities", true);
        c73833Sq.A01("isSuccess", true);
        c73833Sq.A01("error", true);
        c73833Sq.A01("predictorMetadata", true);
        c73833Sq.A01("startTime", true);
        c73833Sq.A01("endTime", true);
        A01 = c73833Sq;
    }

    @Override // X.InterfaceC73823Sp
    public final C3R9[] childSerializers() {
        C3R9[] c3r9Arr = IgSignalsModelPrediction.A07;
        C3RQ c3rq = C3RQ.A00;
        C3R9 c3r9 = c3r9Arr[1];
        C3SL c3sl = C3SL.A00;
        C3R9 A002 = AbstractC192698gB.A00(C3RD.A01);
        C3R9 A003 = AbstractC192698gB.A00(C71742X0h.A00);
        C3RJ c3rj = C3RJ.A00;
        return new C3R9[]{c3rq, c3r9, c3sl, A002, A003, c3rj, c3rj};
    }

    @Override // X.C3RA
    public final /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        IgSignalsModelPrediction igSignalsModelPrediction = (IgSignalsModelPrediction) obj;
        boolean A1R = AbstractC167007dF.A1R(0, encoder, igSignalsModelPrediction);
        SerialDescriptor serialDescriptor = A01;
        C4D8 ADR = encoder.ADR(serialDescriptor);
        C3R9[] c3r9Arr = IgSignalsModelPrediction.A07;
        if (ADR.EiY(serialDescriptor, 0) || Double.compare(igSignalsModelPrediction.A03, -1.0d) != 0) {
            ADR.AS6(serialDescriptor, igSignalsModelPrediction.A03, 0);
        }
        if (ADR.EiY(serialDescriptor, A1R ? 1 : 0) || !C14360o3.A0K(igSignalsModelPrediction.A05, new HashMap())) {
            ADR.ASH(igSignalsModelPrediction.A05, c3r9Arr[A1R ? 1 : 0], serialDescriptor, A1R ? 1 : 0);
        }
        if (ADR.EiY(serialDescriptor, 2) || igSignalsModelPrediction.A06 != A1R) {
            ADR.AS2(serialDescriptor, 2, igSignalsModelPrediction.A06);
        }
        if (ADR.EiY(serialDescriptor, 3) || igSignalsModelPrediction.A04 != null) {
            ADR.ASG(igSignalsModelPrediction.A04, C3RD.A01, serialDescriptor, 3);
        }
        if (ADR.EiY(serialDescriptor, 4) || igSignalsModelPrediction.A02 != null) {
            ADR.ASG(igSignalsModelPrediction.A02, C71742X0h.A00, serialDescriptor, 4);
        }
        if (ADR.EiY(serialDescriptor, 5) || igSignalsModelPrediction.A01 != -1) {
            ADR.ASE(serialDescriptor, 5, igSignalsModelPrediction.A01);
        }
        if (ADR.EiY(serialDescriptor, 6) || igSignalsModelPrediction.A00 != -1) {
            ADR.ASE(serialDescriptor, 6, igSignalsModelPrediction.A00);
        }
        ADR.ASc(serialDescriptor);
    }

    @Override // X.InterfaceC73823Sp
    public final C3R9[] typeParametersSerializers() {
        return AbstractC54355O0n.A00;
    }
}
