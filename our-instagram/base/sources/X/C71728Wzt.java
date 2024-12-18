package X;

import com.facebook.flipper.plugins.uidebugger.model.Coordinate;
import kotlin.Deprecated;
import kotlin.ReplaceWith;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Deprecated(level = AbstractC68219VIb.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
/* renamed from: X.Wzt, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C71728Wzt implements InterfaceC73823Sp {
    public static final C71728Wzt A00;
    public static final /* synthetic */ C73833Sq A01;

    @Override // X.C3RB
    public final /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        C14360o3.A0B(decoder, 0);
        C73833Sq c73833Sq = A01;
        C3T8 ADQ = decoder.ADQ(c73833Sq);
        Number number = null;
        Number number2 = null;
        int i = 0;
        while (true) {
            int ANz = ADQ.ANz(c73833Sq);
            if (ANz != -1) {
                if (ANz != 0) {
                    if (ANz == 1) {
                        number2 = (Number) ADQ.AOF(number2, C71700Wz9.A00, c73833Sq, 1);
                        i |= 2;
                    } else {
                        throw new X6K(ANz);
                    }
                } else {
                    number = (Number) ADQ.AOF(number, C71700Wz9.A00, c73833Sq, 0);
                    i |= 1;
                }
            } else {
                ADQ.ASc(c73833Sq);
                return new Coordinate(number, number2, i);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [X.Wzt, X.3Sp, java.lang.Object] */
    static {
        ?? obj = new Object();
        A00 = obj;
        C73833Sq c73833Sq = new C73833Sq("com.facebook.flipper.plugins.uidebugger.model.Coordinate", obj, 2);
        c73833Sq.A00("x");
        c73833Sq.A00("y");
        A01 = c73833Sq;
    }

    @Override // X.InterfaceC73823Sp
    public final C3R9[] childSerializers() {
        C71700Wz9 c71700Wz9 = C71700Wz9.A00;
        return new C3R9[]{c71700Wz9, c71700Wz9};
    }

    @Override // X.C3R9, X.C3RA, X.C3RB
    public final SerialDescriptor getDescriptor() {
        return A01;
    }

    @Override // X.C3RA
    public final /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        Coordinate coordinate = (Coordinate) obj;
        boolean A1R = AbstractC167007dF.A1R(0, encoder, coordinate);
        C73833Sq c73833Sq = A01;
        C4D8 ADR = encoder.ADR(c73833Sq);
        C71700Wz9 c71700Wz9 = C71700Wz9.A00;
        ADR.ASH(coordinate.A00, c71700Wz9, c73833Sq, 0);
        ADR.ASH(coordinate.A01, c71700Wz9, c73833Sq, A1R ? 1 : 0);
        ADR.ASc(c73833Sq);
    }

    @Override // X.InterfaceC73823Sp
    public final C3R9[] typeParametersSerializers() {
        return AbstractC54355O0n.A00;
    }
}
