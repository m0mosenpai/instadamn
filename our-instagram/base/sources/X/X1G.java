package X;

import com.facebook.flipper.plugins.bloksdebugger.Envolope;
import com.facebook.flipper.plugins.bloksdebugger.Event;
import kotlin.Deprecated;
import kotlin.ReplaceWith;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Deprecated(level = AbstractC68219VIb.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
/* loaded from: classes11.dex */
public final class X1G implements InterfaceC73823Sp {
    public final /* synthetic */ C73833Sq A00;
    public final /* synthetic */ C3R9 A01;

    @Override // X.C3RB
    public final /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        C14360o3.A0B(decoder, 0);
        C73833Sq c73833Sq = this.A00;
        C3T8 ADQ = decoder.ADQ(c73833Sq);
        C3R9[] c3r9Arr = Envolope.A02;
        Event event = null;
        long j = 0;
        int i = 0;
        while (true) {
            int ANz = ADQ.ANz(c73833Sq);
            if (ANz != -1) {
                if (ANz != 0) {
                    if (ANz == 1) {
                        event = (Event) ADQ.AOF(event, c3r9Arr[1], c73833Sq, 1);
                        i |= 2;
                    } else {
                        throw new X6K(ANz);
                    }
                } else {
                    j = ADQ.AOC(c73833Sq, 0);
                    i |= 1;
                }
            } else {
                ADQ.ASc(c73833Sq);
                return new Envolope(event, i, j);
            }
        }
    }

    @Override // X.InterfaceC73823Sp
    public final C3R9[] childSerializers() {
        return new C3R9[]{C3RJ.A00, Envolope.A02[1]};
    }

    @Override // X.C3R9, X.C3RA, X.C3RB
    public final SerialDescriptor getDescriptor() {
        return this.A00;
    }

    @Override // X.C3RA
    public final /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        Envolope envolope = (Envolope) obj;
        boolean A1R = AbstractC167007dF.A1R(0, encoder, envolope);
        C73833Sq c73833Sq = this.A00;
        C4D8 ADR = encoder.ADR(c73833Sq);
        C3R9[] c3r9Arr = Envolope.A02;
        ADR.ASE(c73833Sq, 0, envolope.A00);
        ADR.ASH(envolope.A01, c3r9Arr[A1R ? 1 : 0], c73833Sq, A1R ? 1 : 0);
        ADR.ASc(c73833Sq);
    }

    @Override // X.InterfaceC73823Sp
    public final C3R9[] typeParametersSerializers() {
        return new C3R9[]{this.A01};
    }

    @Deprecated(level = AbstractC68219VIb.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ X1G(C3R9 c3r9) {
        this();
        this.A01 = c3r9;
    }

    public X1G() {
        C73833Sq c73833Sq = new C73833Sq("com.facebook.flipper.plugins.bloksdebugger.Envolope", this, 2);
        c73833Sq.A00("t");
        c73833Sq.A00("d");
        this.A00 = c73833Sq;
    }
}
