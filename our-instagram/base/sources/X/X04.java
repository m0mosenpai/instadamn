package X;

import com.facebook.flipper.plugins.uidebugger.model.Color;
import com.facebook.flipper.plugins.uidebugger.model.InspectableValue$Color$Companion;
import kotlin.Deprecated;
import kotlin.ReplaceWith;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Deprecated(level = AbstractC68219VIb.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
/* loaded from: classes11.dex */
public final class X04 implements InterfaceC73823Sp {
    public static final X04 A00;
    public static final /* synthetic */ C73833Sq A01;

    @Override // X.C3RB
    public final /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        C14360o3.A0B(decoder, 0);
        C73833Sq c73833Sq = A01;
        C3T8 ADQ = decoder.ADQ(c73833Sq);
        Color color = null;
        int i = 0;
        while (true) {
            int ANz = ADQ.ANz(c73833Sq);
            if (ANz != -1) {
                if (ANz == 0) {
                    color = (Color) ADQ.AOF(color, C71727Wzs.A00, c73833Sq, 0);
                    i |= 1;
                } else {
                    throw new X6K(ANz);
                }
            } else {
                ADQ.ASc(c73833Sq);
                return new C66556UMo(color, i);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.3Sp, X.X04, java.lang.Object] */
    static {
        ?? obj = new Object();
        A00 = obj;
        A01 = AbstractC65703TsZ.A1D("color", obj);
    }

    @Override // X.InterfaceC73823Sp
    public final C3R9[] childSerializers() {
        return new C3R9[]{C71727Wzs.A00};
    }

    @Override // X.C3R9, X.C3RA, X.C3RB
    public final SerialDescriptor getDescriptor() {
        return A01;
    }

    @Override // X.C3RA
    public final /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        C66556UMo c66556UMo = (C66556UMo) obj;
        AbstractC167017dG.A1N(encoder, c66556UMo);
        C73833Sq c73833Sq = A01;
        C4D8 ADR = encoder.ADR(c73833Sq);
        InspectableValue$Color$Companion inspectableValue$Color$Companion = C66556UMo.Companion;
        ADR.ASH(c66556UMo.A00, C71727Wzs.A00, c73833Sq, 0);
        ADR.ASc(c73833Sq);
    }

    @Override // X.InterfaceC73823Sp
    public final C3R9[] typeParametersSerializers() {
        return AbstractC54355O0n.A00;
    }
}
