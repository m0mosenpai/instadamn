package X;

import com.instagram.igsignals.core.IgSignalsExampleData;
import java.util.List;
import kotlin.Deprecated;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Deprecated(level = AbstractC68219VIb.HIDDEN, message = "This synthesized declaration should not be used directly")
/* renamed from: X.X0e, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final /* synthetic */ class C71739X0e implements InterfaceC73823Sp {
    public static final C71739X0e A00;
    public static final SerialDescriptor A01;

    @Override // X.C3RB
    public final /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        C14360o3.A0B(decoder, 0);
        SerialDescriptor serialDescriptor = A01;
        C3T8 ADQ = decoder.ADQ(serialDescriptor);
        C3R9[] c3r9Arr = IgSignalsExampleData.A06;
        String str = null;
        long j = 0;
        int i = 0;
        List list = null;
        double d = 0.0d;
        List list2 = null;
        List list3 = null;
        while (true) {
            int ANz = ADQ.ANz(serialDescriptor);
            switch (ANz) {
                case -1:
                    ADQ.ASc(serialDescriptor);
                    return new IgSignalsExampleData(str, list2, list3, list, d, i, j);
                case 0:
                    str = ADQ.AOK(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    d = ADQ.ANy(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    list2 = (List) ADQ.AOF(list2, c3r9Arr[2], serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    j = ADQ.AOC(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    list3 = (List) ADQ.AOE(list3, c3r9Arr[4], serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    list = (List) ADQ.AOF(list, c3r9Arr[5], serialDescriptor, 5);
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

    /* JADX WARN: Type inference failed for: r3v0, types: [X.3Sp, X.X0e, java.lang.Object] */
    static {
        ?? obj = new Object();
        A00 = obj;
        C73833Sq c73833Sq = new C73833Sq("com.instagram.igsignals.core.IgSignalsExampleData", obj, 6);
        c73833Sq.A00("identifier");
        c73833Sq.A00("version");
        c73833Sq.A00("features");
        c73833Sq.A00("timestamp");
        c73833Sq.A00("labels");
        c73833Sq.A00("predictions");
        A01 = c73833Sq;
    }

    @Override // X.InterfaceC73823Sp
    public final C3R9[] childSerializers() {
        C3R9[] c3r9Arr = IgSignalsExampleData.A06;
        return new C3R9[]{C3RD.A01, C3RQ.A00, c3r9Arr[2], C3RJ.A00, AbstractC192698gB.A00(c3r9Arr[4]), c3r9Arr[5]};
    }

    @Override // X.C3RA
    public final /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        IgSignalsExampleData igSignalsExampleData = (IgSignalsExampleData) obj;
        boolean A1R = AbstractC167007dF.A1R(0, encoder, igSignalsExampleData);
        SerialDescriptor serialDescriptor = A01;
        C4D8 ADR = encoder.ADR(serialDescriptor);
        C3R9[] c3r9Arr = IgSignalsExampleData.A06;
        ADR.ASL(igSignalsExampleData.A02, serialDescriptor, 0);
        ADR.AS6(serialDescriptor, igSignalsExampleData.A00, A1R ? 1 : 0);
        ADR.ASH(igSignalsExampleData.A03, c3r9Arr[2], serialDescriptor, 2);
        ADR.ASE(serialDescriptor, 3, igSignalsExampleData.A01);
        ADR.ASG(igSignalsExampleData.A04, c3r9Arr[4], serialDescriptor, 4);
        ADR.ASH(igSignalsExampleData.A05, c3r9Arr[5], serialDescriptor, 5);
        ADR.ASc(serialDescriptor);
    }

    @Override // X.InterfaceC73823Sp
    public final C3R9[] typeParametersSerializers() {
        return AbstractC54355O0n.A00;
    }
}
