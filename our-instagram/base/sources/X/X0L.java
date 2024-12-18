package X;

import com.facebook.neko.directinstall.digitalturbine.AIDLInstallationProgress;
import com.facebook.react.modules.intent.IntentModule;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import kotlin.Deprecated;
import kotlin.ReplaceWith;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Deprecated(level = AbstractC68219VIb.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
/* loaded from: classes11.dex */
public final class X0L implements InterfaceC73823Sp {
    public static final X0L A00;
    public static final /* synthetic */ C73833Sq A01;

    @Override // X.C3RB
    public final /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        C14360o3.A0B(decoder, 0);
        C73833Sq c73833Sq = A01;
        C3T8 ADQ = decoder.ADQ(c73833Sq);
        double d = 0.0d;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int ANz = ADQ.ANz(c73833Sq);
            if (ANz != -1) {
                if (ANz != 0) {
                    if (ANz != 1) {
                        if (ANz == 2) {
                            i2 = ADQ.AO9(c73833Sq, 2);
                            i3 |= 4;
                        } else {
                            throw new X6K(ANz);
                        }
                    } else {
                        i = ADQ.AO9(c73833Sq, 1);
                        i3 |= 2;
                    }
                } else {
                    d = ADQ.ANy(c73833Sq, 0);
                    i3 |= 1;
                }
            } else {
                ADQ.ASc(c73833Sq);
                return new AIDLInstallationProgress(d, i3, i, i2);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [X.X0L, X.3Sp, java.lang.Object] */
    static {
        ?? obj = new Object();
        A00 = obj;
        C73833Sq c73833Sq = new C73833Sq("com.facebook.neko.directinstall.digitalturbine.AIDLInstallationProgress", obj, 3);
        c73833Sq.A00(IntentModule.EXTRA_MAP_KEY_FOR_VALUE);
        c73833Sq.A00("action");
        c73833Sq.A01(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS, true);
        A01 = c73833Sq;
    }

    @Override // X.InterfaceC73823Sp
    public final C3R9[] childSerializers() {
        C3RQ c3rq = C3RQ.A00;
        C192398fh c192398fh = C192398fh.A00;
        return new C3R9[]{c3rq, c192398fh, c192398fh};
    }

    @Override // X.C3R9, X.C3RA, X.C3RB
    public final SerialDescriptor getDescriptor() {
        return A01;
    }

    @Override // X.C3RA
    public final /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        AIDLInstallationProgress aIDLInstallationProgress = (AIDLInstallationProgress) obj;
        boolean A1R = AbstractC167007dF.A1R(0, encoder, aIDLInstallationProgress);
        C73833Sq c73833Sq = A01;
        C4D8 ADR = encoder.ADR(c73833Sq);
        ADR.AS6(c73833Sq, aIDLInstallationProgress.A00, 0);
        ADR.ASC(c73833Sq, A1R ? 1 : 0, aIDLInstallationProgress.A01);
        if (ADR.EiY(c73833Sq, 2) || aIDLInstallationProgress.A02 != 0) {
            ADR.ASC(c73833Sq, 2, aIDLInstallationProgress.A02);
        }
        ADR.ASc(c73833Sq);
    }

    @Override // X.InterfaceC73823Sp
    public final C3R9[] typeParametersSerializers() {
        return AbstractC54355O0n.A00;
    }
}
