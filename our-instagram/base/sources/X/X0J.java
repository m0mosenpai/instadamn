package X;

import com.facebook.flipper.plugins.uidebugger.model.SpaceBox;
import kotlin.Deprecated;
import kotlin.ReplaceWith;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Deprecated(level = AbstractC68219VIb.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
/* loaded from: classes11.dex */
public final class X0J implements InterfaceC73823Sp {
    public static final X0J A00;
    public static final /* synthetic */ C73833Sq A01;

    @Override // X.C3RB
    public final /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        C14360o3.A0B(decoder, 0);
        C73833Sq c73833Sq = A01;
        C3T8 ADQ = decoder.ADQ(c73833Sq);
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            int ANz = ADQ.ANz(c73833Sq);
            if (ANz != -1) {
                if (ANz != 0) {
                    if (ANz != 1) {
                        if (ANz != 2) {
                            if (ANz == 3) {
                                i2 = ADQ.AO9(c73833Sq, 3);
                                i5 |= 8;
                            } else {
                                throw new X6K(ANz);
                            }
                        } else {
                            i3 = ADQ.AO9(c73833Sq, 2);
                            i5 |= 4;
                        }
                    } else {
                        i4 = ADQ.AO9(c73833Sq, 1);
                        i5 |= 2;
                    }
                } else {
                    i = ADQ.AO9(c73833Sq, 0);
                    i5 |= 1;
                }
            } else {
                ADQ.ASc(c73833Sq);
                return new SpaceBox(i5, i, i4, i3, i2);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [X.X0J, X.3Sp, java.lang.Object] */
    static {
        ?? obj = new Object();
        A00 = obj;
        C73833Sq c73833Sq = new C73833Sq("com.facebook.flipper.plugins.uidebugger.model.SpaceBox", obj, 4);
        c73833Sq.A00("top");
        c73833Sq.A00("right");
        c73833Sq.A00("bottom");
        c73833Sq.A00("left");
        A01 = c73833Sq;
    }

    @Override // X.InterfaceC73823Sp
    public final C3R9[] childSerializers() {
        C192398fh c192398fh = C192398fh.A00;
        return new C3R9[]{c192398fh, c192398fh, c192398fh, c192398fh};
    }

    @Override // X.C3R9, X.C3RA, X.C3RB
    public final SerialDescriptor getDescriptor() {
        return A01;
    }

    @Override // X.C3RA
    public final /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        SpaceBox spaceBox = (SpaceBox) obj;
        boolean A1R = AbstractC167007dF.A1R(0, encoder, spaceBox);
        C73833Sq c73833Sq = A01;
        C4D8 ADR = encoder.ADR(c73833Sq);
        ADR.ASC(c73833Sq, 0, spaceBox.A03);
        ADR.ASC(c73833Sq, A1R ? 1 : 0, spaceBox.A02);
        ADR.ASC(c73833Sq, 2, spaceBox.A00);
        ADR.ASC(c73833Sq, 3, spaceBox.A01);
        ADR.ASc(c73833Sq);
    }

    @Override // X.InterfaceC73823Sp
    public final C3R9[] typeParametersSerializers() {
        return AbstractC54355O0n.A00;
    }
}
