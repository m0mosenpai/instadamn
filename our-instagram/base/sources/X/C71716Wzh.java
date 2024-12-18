package X;

import kotlin.Deprecated;
import kotlin.ReplaceWith;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Deprecated(level = AbstractC68219VIb.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
/* renamed from: X.Wzh, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C71716Wzh implements InterfaceC73823Sp {
    public static final C71716Wzh A00;
    public static final /* synthetic */ C73833Sq A01;

    @Override // X.C3RB
    public final /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        C14360o3.A0B(decoder, 0);
        C73833Sq c73833Sq = A01;
        C3T8 ADQ = decoder.ADQ(c73833Sq);
        String str = null;
        long j = 0;
        Object obj = null;
        int i = 0;
        while (true) {
            int ANz = ADQ.ANz(c73833Sq);
            if (ANz != -1) {
                if (ANz != 0) {
                    if (ANz != 1) {
                        if (ANz == 2) {
                            j = ADQ.AOC(c73833Sq, 2);
                            i |= 4;
                        } else {
                            throw new X6K(ANz);
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
                return new WVN(obj, str, i, j);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [X.Wzh, X.3Sp, java.lang.Object] */
    static {
        ?? obj = new Object();
        A00 = obj;
        C73833Sq c73833Sq = new C73833Sq("slog", obj, 3);
        c73833Sq.A00("lispyUri");
        c73833Sq.A00("payload");
        c73833Sq.A00("ts");
        A01 = c73833Sq;
    }

    @Override // X.InterfaceC73823Sp
    public final C3R9[] childSerializers() {
        return new C3R9[]{AbstractC192698gB.A00(C3RD.A01), AbstractC192698gB.A00(C71699Wz8.A00), C3RJ.A00};
    }

    @Override // X.C3R9, X.C3RA, X.C3RB
    public final SerialDescriptor getDescriptor() {
        return A01;
    }

    @Override // X.C3RA
    public final /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        WVN wvn = (WVN) obj;
        boolean A1R = AbstractC167007dF.A1R(0, encoder, wvn);
        C73833Sq c73833Sq = A01;
        C4D8 ADR = encoder.ADR(c73833Sq);
        ADR.ASG(wvn.A02, C3RD.A01, c73833Sq, 0);
        ADR.ASG(wvn.A01, C71699Wz8.A00, c73833Sq, A1R ? 1 : 0);
        ADR.ASE(c73833Sq, 2, wvn.A00);
        ADR.ASc(c73833Sq);
    }

    @Override // X.InterfaceC73823Sp
    public final C3R9[] typeParametersSerializers() {
        return AbstractC54355O0n.A00;
    }
}
