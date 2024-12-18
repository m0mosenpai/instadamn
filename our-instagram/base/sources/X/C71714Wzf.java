package X;

import com.facebook.flipper.plugins.bloksdebugger.InitialState$Companion;
import com.facebook.react.modules.intent.IntentModule;
import kotlin.Deprecated;
import kotlin.ReplaceWith;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Deprecated(level = AbstractC68219VIb.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
/* renamed from: X.Wzf, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C71714Wzf implements InterfaceC73823Sp {
    public static final C71714Wzf A00;
    public static final /* synthetic */ C73833Sq A01;

    @Override // X.C3RB
    public final /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        C14360o3.A0B(decoder, 0);
        C73833Sq c73833Sq = A01;
        C3T8 ADQ = decoder.ADQ(c73833Sq);
        String str = null;
        Object obj = null;
        String str2 = null;
        String str3 = null;
        int i = 0;
        while (true) {
            int ANz = ADQ.ANz(c73833Sq);
            if (ANz != -1) {
                if (ANz != 0) {
                    if (ANz != 1) {
                        if (ANz != 2) {
                            if (ANz == 3) {
                                str3 = ADQ.AOK(c73833Sq, 3);
                                i |= 8;
                            } else {
                                throw new X6K(ANz);
                            }
                        } else {
                            str2 = ADQ.AOK(c73833Sq, 2);
                            i |= 4;
                        }
                    } else {
                        obj = ADQ.AOE(obj, C71699Wz8.A00, c73833Sq, 1);
                        i |= 2;
                    }
                } else {
                    str = ADQ.AOK(c73833Sq, 0);
                    i |= 1;
                }
            } else {
                ADQ.ASc(c73833Sq);
                return new C66549UMf(obj, str, str2, str3, i);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [X.Wzf, X.3Sp, java.lang.Object] */
    static {
        ?? obj = new Object();
        A00 = obj;
        C73833Sq c73833Sq = new C73833Sq("stateInit", obj, 4);
        c73833Sq.A00("key");
        c73833Sq.A00(IntentModule.EXTRA_MAP_KEY_FOR_VALUE);
        c73833Sq.A00("framework");
        c73833Sq.A00("bindMode");
        A01 = c73833Sq;
    }

    @Override // X.InterfaceC73823Sp
    public final C3R9[] childSerializers() {
        C3RD c3rd = C3RD.A01;
        return new C3R9[]{c3rd, AbstractC192698gB.A00(C71699Wz8.A00), c3rd, c3rd};
    }

    @Override // X.C3R9, X.C3RA, X.C3RB
    public final SerialDescriptor getDescriptor() {
        return A01;
    }

    @Override // X.C3RA
    public final /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        C66549UMf c66549UMf = (C66549UMf) obj;
        boolean A1R = AbstractC167007dF.A1R(0, encoder, c66549UMf);
        C73833Sq c73833Sq = A01;
        C4D8 ADR = encoder.ADR(c73833Sq);
        InitialState$Companion initialState$Companion = C66549UMf.Companion;
        ADR.ASL(c66549UMf.A03, c73833Sq, 0);
        ADR.ASG(c66549UMf.A00, C71699Wz8.A00, c73833Sq, A1R ? 1 : 0);
        ADR.ASL(c66549UMf.A02, c73833Sq, 2);
        ADR.ASL(c66549UMf.A01, c73833Sq, 3);
        ADR.ASc(c73833Sq);
    }

    @Override // X.InterfaceC73823Sp
    public final C3R9[] typeParametersSerializers() {
        return AbstractC54355O0n.A00;
    }
}
