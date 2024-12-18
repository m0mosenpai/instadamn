package X;

import com.facebook.flipper.plugins.bloksdebugger.ClientState;
import com.facebook.react.modules.dialog.DialogModule;
import kotlin.Deprecated;
import kotlin.ReplaceWith;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Deprecated(level = AbstractC68219VIb.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
/* renamed from: X.Wzg, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C71715Wzg implements InterfaceC73823Sp {
    public static final C71715Wzg A00;
    public static final /* synthetic */ C73833Sq A01;

    @Override // X.C3RB
    public final /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        C14360o3.A0B(decoder, 0);
        C73833Sq c73833Sq = A01;
        C3T8 ADQ = decoder.ADQ(c73833Sq);
        String str = null;
        long j = 0;
        int i = 0;
        Object obj = null;
        ClientState clientState = null;
        while (true) {
            int ANz = ADQ.ANz(c73833Sq);
            if (ANz != -1) {
                if (ANz != 0) {
                    if (ANz != 1) {
                        if (ANz != 2) {
                            if (ANz == 3) {
                                j = ADQ.AOC(c73833Sq, 3);
                                i |= 8;
                            } else {
                                throw new X6K(ANz);
                            }
                        } else {
                            clientState = (ClientState) ADQ.AOF(clientState, C71711Wzc.A00, c73833Sq, 2);
                            i |= 4;
                        }
                    } else {
                        obj = ADQ.AOE(obj, C71699Wz8.A00, c73833Sq, 1);
                        i |= 2;
                    }
                } else {
                    str = AbstractC65702TsY.A0e(str, c73833Sq, ADQ, 0);
                    i |= 1;
                }
            } else {
                ADQ.ASc(c73833Sq);
                return new WVO(clientState, obj, str, i, j);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [X.Wzg, X.3Sp, java.lang.Object] */
    static {
        ?? obj = new Object();
        A00 = obj;
        C73833Sq c73833Sq = new C73833Sq("log", obj, 4);
        c73833Sq.A00("lispyUri");
        c73833Sq.A00(DialogModule.KEY_MESSAGE);
        c73833Sq.A00("clientState");
        c73833Sq.A00("ts");
        A01 = c73833Sq;
    }

    @Override // X.InterfaceC73823Sp
    public final C3R9[] childSerializers() {
        return new C3R9[]{AbstractC192698gB.A00(C3RD.A01), AbstractC192698gB.A00(C71699Wz8.A00), C71711Wzc.A00, C3RJ.A00};
    }

    @Override // X.C3R9, X.C3RA, X.C3RB
    public final SerialDescriptor getDescriptor() {
        return A01;
    }

    @Override // X.C3RA
    public final /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        WVO wvo = (WVO) obj;
        boolean A1R = AbstractC167007dF.A1R(0, encoder, wvo);
        C73833Sq c73833Sq = A01;
        C4D8 ADR = encoder.ADR(c73833Sq);
        ADR.ASG(wvo.A03, C3RD.A01, c73833Sq, 0);
        ADR.ASG(wvo.A02, C71699Wz8.A00, c73833Sq, A1R ? 1 : 0);
        ADR.ASH(wvo.A01, C71711Wzc.A00, c73833Sq, 2);
        ADR.ASE(c73833Sq, 3, wvo.A00);
        ADR.ASc(c73833Sq);
    }

    @Override // X.InterfaceC73823Sp
    public final C3R9[] typeParametersSerializers() {
        return AbstractC54355O0n.A00;
    }
}
