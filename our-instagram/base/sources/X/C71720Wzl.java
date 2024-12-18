package X;

import com.facebook.react.modules.dialog.DialogModule;
import com.facebook.react.modules.intent.IntentModule;
import kotlin.Deprecated;
import kotlin.ReplaceWith;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Deprecated(level = AbstractC68219VIb.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
/* renamed from: X.Wzl, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C71720Wzl implements InterfaceC73823Sp {
    public static final C71720Wzl A00;
    public static final /* synthetic */ C73833Sq A01;

    @Override // X.C3RB
    public final /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        C14360o3.A0B(decoder, 0);
        C73833Sq c73833Sq = A01;
        C3T8 ADQ = decoder.ADQ(c73833Sq);
        String str = null;
        boolean z = false;
        int i = 0;
        while (true) {
            int ANz = ADQ.ANz(c73833Sq);
            if (ANz != -1) {
                if (ANz != 0) {
                    if (ANz == 1) {
                        z = ADQ.ANs(c73833Sq, 1);
                        i |= 2;
                    } else {
                        throw new X6K(ANz);
                    }
                } else {
                    str = ADQ.AOK(c73833Sq, 0);
                    i |= 1;
                }
            } else {
                ADQ.ASc(c73833Sq);
                return new WVQ(str, i, z);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [X.3Sp, java.lang.Object, X.Wzl] */
    static {
        ?? obj = new Object();
        A00 = obj;
        C73833Sq c73833Sq = new C73833Sq("BooleanAction", obj, 2);
        c73833Sq.A00(DialogModule.KEY_TITLE);
        c73833Sq.A00(IntentModule.EXTRA_MAP_KEY_FOR_VALUE);
        A01 = c73833Sq;
    }

    @Override // X.InterfaceC73823Sp
    public final C3R9[] childSerializers() {
        return new C3R9[]{C3RD.A01, C3SL.A00};
    }

    @Override // X.C3R9, X.C3RA, X.C3RB
    public final SerialDescriptor getDescriptor() {
        return A01;
    }

    @Override // X.C3RA
    public final /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        WVQ wvq = (WVQ) obj;
        boolean A1R = AbstractC167007dF.A1R(0, encoder, wvq);
        C73833Sq c73833Sq = A01;
        C4D8 ADR = encoder.ADR(c73833Sq);
        ADR.ASL(wvq.A00, c73833Sq, 0);
        ADR.AS2(c73833Sq, A1R ? 1 : 0, wvq.A01);
        ADR.ASc(c73833Sq);
    }

    @Override // X.InterfaceC73823Sp
    public final C3R9[] typeParametersSerializers() {
        return AbstractC54355O0n.A00;
    }
}
