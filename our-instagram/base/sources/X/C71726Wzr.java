package X;

import com.facebook.flipper.plugins.uidebugger.model.BoxData;
import java.util.List;
import kotlin.Deprecated;
import kotlin.ReplaceWith;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Deprecated(level = AbstractC68219VIb.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
/* renamed from: X.Wzr, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C71726Wzr implements InterfaceC73823Sp {
    public static final C71726Wzr A00;
    public static final /* synthetic */ C73833Sq A01;

    @Override // X.C3RB
    public final /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        C14360o3.A0B(decoder, 0);
        C73833Sq c73833Sq = A01;
        C3T8 ADQ = decoder.ADQ(c73833Sq);
        C3R9[] c3r9Arr = BoxData.A03;
        List list = null;
        List list2 = null;
        List list3 = null;
        int i = 0;
        while (true) {
            int ANz = ADQ.ANz(c73833Sq);
            if (ANz != -1) {
                if (ANz != 0) {
                    if (ANz != 1) {
                        if (ANz == 2) {
                            list3 = (List) ADQ.AOF(list3, c3r9Arr[2], c73833Sq, 2);
                            i |= 4;
                        } else {
                            throw new X6K(ANz);
                        }
                    } else {
                        list2 = (List) ADQ.AOF(list2, c3r9Arr[1], c73833Sq, 1);
                        i |= 2;
                    }
                } else {
                    list = (List) ADQ.AOF(list, c3r9Arr[0], c73833Sq, 0);
                    i |= 1;
                }
            } else {
                ADQ.ASc(c73833Sq);
                return new BoxData(i, list, list2, list3);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [X.Wzr, X.3Sp, java.lang.Object] */
    static {
        ?? obj = new Object();
        A00 = obj;
        C73833Sq c73833Sq = new C73833Sq("com.facebook.flipper.plugins.uidebugger.model.BoxData", obj, 3);
        c73833Sq.A00("margin");
        c73833Sq.A00("border");
        c73833Sq.A00("padding");
        A01 = c73833Sq;
    }

    @Override // X.InterfaceC73823Sp
    public final C3R9[] childSerializers() {
        C3R9[] c3r9Arr = BoxData.A03;
        return new C3R9[]{c3r9Arr[0], c3r9Arr[1], c3r9Arr[2]};
    }

    @Override // X.C3R9, X.C3RA, X.C3RB
    public final SerialDescriptor getDescriptor() {
        return A01;
    }

    @Override // X.C3RA
    public final /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        BoxData boxData = (BoxData) obj;
        boolean A1R = AbstractC167007dF.A1R(0, encoder, boxData);
        C73833Sq c73833Sq = A01;
        C4D8 ADR = encoder.ADR(c73833Sq);
        C3R9[] c3r9Arr = BoxData.A03;
        ADR.ASH(boxData.A01, c3r9Arr[0], c73833Sq, 0);
        ADR.ASH(boxData.A00, c3r9Arr[A1R ? 1 : 0], c73833Sq, A1R ? 1 : 0);
        ADR.ASH(boxData.A02, c3r9Arr[2], c73833Sq, 2);
        ADR.ASc(c73833Sq);
    }

    @Override // X.InterfaceC73823Sp
    public final C3R9[] typeParametersSerializers() {
        return AbstractC54355O0n.A00;
    }
}
