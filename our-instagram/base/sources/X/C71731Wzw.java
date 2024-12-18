package X;

import com.facebook.flipper.plugins.uidebugger.model.FrameScanEvent;
import com.facebook.flipper.plugins.uidebugger.model.Snapshot;
import java.util.List;
import kotlin.Deprecated;
import kotlin.ReplaceWith;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Deprecated(level = AbstractC68219VIb.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
/* renamed from: X.Wzw, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C71731Wzw implements InterfaceC73823Sp {
    public static final C71731Wzw A00;
    public static final /* synthetic */ C73833Sq A01;

    @Override // X.C3RB
    public final /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        C14360o3.A0B(decoder, 0);
        C73833Sq c73833Sq = A01;
        C3T8 ADQ = decoder.ADQ(c73833Sq);
        C3R9[] c3r9Arr = FrameScanEvent.A04;
        List list = null;
        long j = 0;
        Snapshot snapshot = null;
        List list2 = null;
        int i = 0;
        while (true) {
            int ANz = ADQ.ANz(c73833Sq);
            if (ANz != -1) {
                if (ANz != 0) {
                    if (ANz != 1) {
                        if (ANz != 2) {
                            if (ANz == 3) {
                                list2 = (List) ADQ.AOE(list2, c3r9Arr[3], c73833Sq, 3);
                                i |= 8;
                            } else {
                                throw new X6K(ANz);
                            }
                        } else {
                            snapshot = (Snapshot) ADQ.AOE(snapshot, X0I.A00, c73833Sq, 2);
                            i |= 4;
                        }
                    } else {
                        list = (List) ADQ.AOF(list, c3r9Arr[1], c73833Sq, 1);
                        i |= 2;
                    }
                } else {
                    j = ADQ.AOC(c73833Sq, 0);
                    i |= 1;
                }
            } else {
                ADQ.ASc(c73833Sq);
                return new FrameScanEvent(snapshot, list, list2, i, j);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [X.Wzw, X.3Sp, java.lang.Object] */
    static {
        ?? obj = new Object();
        A00 = obj;
        C73833Sq c73833Sq = new C73833Sq("com.facebook.flipper.plugins.uidebugger.model.FrameScanEvent", obj, 4);
        c73833Sq.A00("frameTime");
        c73833Sq.A00("nodes");
        c73833Sq.A00("snapshot");
        c73833Sq.A00("frameworkEvents");
        A01 = c73833Sq;
    }

    @Override // X.InterfaceC73823Sp
    public final C3R9[] childSerializers() {
        C3R9[] c3r9Arr = FrameScanEvent.A04;
        return new C3R9[]{C3RJ.A00, c3r9Arr[1], AbstractC192698gB.A00(X0I.A00), AbstractC192698gB.A00(c3r9Arr[3])};
    }

    @Override // X.C3R9, X.C3RA, X.C3RB
    public final SerialDescriptor getDescriptor() {
        return A01;
    }

    @Override // X.C3RA
    public final /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        FrameScanEvent frameScanEvent = (FrameScanEvent) obj;
        boolean A1R = AbstractC167007dF.A1R(0, encoder, frameScanEvent);
        C73833Sq c73833Sq = A01;
        C4D8 ADR = encoder.ADR(c73833Sq);
        C3R9[] c3r9Arr = FrameScanEvent.A04;
        ADR.ASE(c73833Sq, 0, frameScanEvent.A00);
        ADR.ASH(frameScanEvent.A03, c3r9Arr[A1R ? 1 : 0], c73833Sq, A1R ? 1 : 0);
        ADR.ASG(frameScanEvent.A01, X0I.A00, c73833Sq, 2);
        ADR.ASG(frameScanEvent.A02, c3r9Arr[3], c73833Sq, 3);
        ADR.ASc(c73833Sq);
    }

    @Override // X.InterfaceC73823Sp
    public final C3R9[] typeParametersSerializers() {
        return AbstractC54355O0n.A00;
    }
}
