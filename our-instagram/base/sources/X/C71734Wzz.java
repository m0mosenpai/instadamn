package X;

import com.facebook.flipper.plugins.uidebugger.model.InitEvent;
import java.util.List;
import kotlin.Deprecated;
import kotlin.ReplaceWith;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Deprecated(level = AbstractC68219VIb.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
/* renamed from: X.Wzz, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C71734Wzz implements InterfaceC73823Sp {
    public static final C71734Wzz A00;
    public static final /* synthetic */ C73833Sq A01;

    @Override // X.C3RB
    public final /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        C14360o3.A0B(decoder, 0);
        C73833Sq c73833Sq = A01;
        C3T8 ADQ = decoder.ADQ(c73833Sq);
        C3R9[] c3r9Arr = InitEvent.A03;
        List list = null;
        List list2 = null;
        int i = 0;
        int i2 = 0;
        while (true) {
            int ANz = ADQ.ANz(c73833Sq);
            if (ANz != -1) {
                if (ANz != 0) {
                    if (ANz != 1) {
                        if (ANz == 2) {
                            list2 = (List) ADQ.AOF(list2, c3r9Arr[2], c73833Sq, 2);
                            i2 |= 4;
                        } else {
                            throw new X6K(ANz);
                        }
                    } else {
                        list = (List) ADQ.AOF(list, c3r9Arr[1], c73833Sq, 1);
                        i2 |= 2;
                    }
                } else {
                    i = ADQ.AO9(c73833Sq, 0);
                    i2 |= 1;
                }
            } else {
                ADQ.ASc(c73833Sq);
                return new InitEvent(list, list2, i2, i);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [X.3Sp, java.lang.Object, X.Wzz] */
    static {
        ?? obj = new Object();
        A00 = obj;
        C73833Sq c73833Sq = new C73833Sq("com.facebook.flipper.plugins.uidebugger.model.InitEvent", obj, 3);
        c73833Sq.A00("rootId");
        c73833Sq.A00("frameworkEventMetadata");
        c73833Sq.A00("customActionGroups");
        A01 = c73833Sq;
    }

    @Override // X.InterfaceC73823Sp
    public final C3R9[] childSerializers() {
        C3R9[] c3r9Arr = InitEvent.A03;
        return new C3R9[]{C192398fh.A00, c3r9Arr[1], c3r9Arr[2]};
    }

    @Override // X.C3R9, X.C3RA, X.C3RB
    public final SerialDescriptor getDescriptor() {
        return A01;
    }

    @Override // X.C3RA
    public final /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        InitEvent initEvent = (InitEvent) obj;
        boolean A1R = AbstractC167007dF.A1R(0, encoder, initEvent);
        C73833Sq c73833Sq = A01;
        C4D8 ADR = encoder.ADR(c73833Sq);
        C3R9[] c3r9Arr = InitEvent.A03;
        ADR.ASC(c73833Sq, 0, initEvent.A00);
        ADR.ASH(initEvent.A02, c3r9Arr[A1R ? 1 : 0], c73833Sq, A1R ? 1 : 0);
        ADR.ASH(initEvent.A01, c3r9Arr[2], c73833Sq, 2);
        ADR.ASc(c73833Sq);
    }

    @Override // X.InterfaceC73823Sp
    public final C3R9[] typeParametersSerializers() {
        return AbstractC54355O0n.A00;
    }
}
