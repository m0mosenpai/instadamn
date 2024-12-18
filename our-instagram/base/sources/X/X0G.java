package X;

import com.facebook.flipper.plugins.uidebugger.model.PerfStatsEvent;
import kotlin.Deprecated;
import kotlin.ReplaceWith;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Deprecated(level = AbstractC68219VIb.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
/* loaded from: classes11.dex */
public final class X0G implements InterfaceC73823Sp {
    public static final X0G A00;
    public static final /* synthetic */ C73833Sq A01;

    @Override // X.C3RB
    public final /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        C14360o3.A0B(decoder, 0);
        C73833Sq c73833Sq = A01;
        C3T8 ADQ = decoder.ADQ(c73833Sq);
        int i = 0;
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        long j4 = 0;
        long j5 = 0;
        long j6 = 0;
        long j7 = 0;
        long j8 = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            int ANz = ADQ.ANz(c73833Sq);
            switch (ANz) {
                case -1:
                    ADQ.ASc(c73833Sq);
                    return new PerfStatsEvent(i, i2, i5, i4, i3, j4, j5, j6, j2, j7, j, j3, j8);
                case 0:
                    j4 = ADQ.AOC(c73833Sq, 0);
                    i |= 1;
                    break;
                case 1:
                    i2 = ADQ.AO9(c73833Sq, 1);
                    i |= 2;
                    break;
                case 2:
                    i5 = ADQ.AO9(c73833Sq, 2);
                    i |= 4;
                    break;
                case 3:
                    j5 = ADQ.AOC(c73833Sq, 3);
                    i |= 8;
                    break;
                case 4:
                    j6 = ADQ.AOC(c73833Sq, 4);
                    i |= 16;
                    break;
                case 5:
                    j2 = ADQ.AOC(c73833Sq, 5);
                    i |= 32;
                    break;
                case 6:
                    j7 = ADQ.AOC(c73833Sq, 6);
                    i |= 64;
                    break;
                case 7:
                    j = ADQ.AOC(c73833Sq, 7);
                    i |= 128;
                    break;
                case 8:
                    j3 = ADQ.AOC(c73833Sq, 8);
                    i |= 256;
                    break;
                case 9:
                    j8 = ADQ.AOC(c73833Sq, 9);
                    i |= 512;
                    break;
                case 10:
                    i4 = ADQ.AO9(c73833Sq, 10);
                    i |= 1024;
                    break;
                case 11:
                    i3 = ADQ.AO9(c73833Sq, 11);
                    i |= C3OO.FLAG_MOVED;
                    break;
                default:
                    throw new X6K(ANz);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [X.X0G, X.3Sp, java.lang.Object] */
    static {
        ?? obj = new Object();
        A00 = obj;
        C73833Sq c73833Sq = new C73833Sq("com.facebook.flipper.plugins.uidebugger.model.PerfStatsEvent", obj, 12);
        c73833Sq.A00("txId");
        c73833Sq.A00("nodesCount");
        c73833Sq.A00("frameworkEventsCount");
        c73833Sq.A00("start");
        c73833Sq.A00("traversalMS");
        c73833Sq.A00("snapshotMS");
        c73833Sq.A00("queuingMS");
        c73833Sq.A00("deferredComputationMS");
        c73833Sq.A00("serializationMS");
        c73833Sq.A00("socketMS");
        c73833Sq.A00("payloadSize");
        c73833Sq.A00("snapshotSize");
        A01 = c73833Sq;
    }

    @Override // X.InterfaceC73823Sp
    public final C3R9[] childSerializers() {
        C3RJ c3rj = C3RJ.A00;
        C192398fh c192398fh = C192398fh.A00;
        return new C3R9[]{c3rj, c192398fh, c192398fh, c3rj, c3rj, c3rj, c3rj, c3rj, c3rj, c3rj, c192398fh, c192398fh};
    }

    @Override // X.C3R9, X.C3RA, X.C3RB
    public final SerialDescriptor getDescriptor() {
        return A01;
    }

    @Override // X.C3RA
    public final /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        PerfStatsEvent perfStatsEvent = (PerfStatsEvent) obj;
        boolean A1R = AbstractC167007dF.A1R(0, encoder, perfStatsEvent);
        C73833Sq c73833Sq = A01;
        C4D8 ADR = encoder.ADR(c73833Sq);
        ADR.ASE(c73833Sq, 0, perfStatsEvent.A0B);
        ADR.ASC(c73833Sq, A1R ? 1 : 0, perfStatsEvent.A01);
        ADR.ASC(c73833Sq, 2, perfStatsEvent.A00);
        ADR.ASE(c73833Sq, 3, perfStatsEvent.A09);
        ADR.ASE(c73833Sq, 4, perfStatsEvent.A0A);
        ADR.ASE(c73833Sq, 5, perfStatsEvent.A07);
        ADR.ASE(c73833Sq, 6, perfStatsEvent.A05);
        ADR.ASE(c73833Sq, 7, perfStatsEvent.A04);
        ADR.ASE(c73833Sq, 8, perfStatsEvent.A06);
        ADR.ASE(c73833Sq, 9, perfStatsEvent.A08);
        ADR.ASC(c73833Sq, 10, perfStatsEvent.A02);
        ADR.ASC(c73833Sq, 11, perfStatsEvent.A03);
        ADR.ASc(c73833Sq);
    }

    @Override // X.InterfaceC73823Sp
    public final C3R9[] typeParametersSerializers() {
        return AbstractC54355O0n.A00;
    }
}
