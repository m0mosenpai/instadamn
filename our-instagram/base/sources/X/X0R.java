package X;

import com.facebook.neko.directinstall.digitalturbine.DTApplication;
import com.facebook.neko.directinstall.digitalturbine.DTInstallationError;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import kotlin.Deprecated;
import kotlin.ReplaceWith;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Deprecated(level = AbstractC68219VIb.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
/* loaded from: classes11.dex */
public final class X0R implements InterfaceC73823Sp {
    public static final X0R A00;
    public static final /* synthetic */ C73833Sq A01;

    @Override // X.C3RB
    public final /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        C14360o3.A0B(decoder, 0);
        C73833Sq c73833Sq = A01;
        C3T8 ADQ = decoder.ADQ(c73833Sq);
        String str = null;
        DTApplication dTApplication = null;
        int i = 0;
        int i2 = 0;
        while (true) {
            int ANz = ADQ.ANz(c73833Sq);
            if (ANz != -1) {
                if (ANz != 0) {
                    if (ANz != 1) {
                        if (ANz == 2) {
                            dTApplication = (DTApplication) ADQ.AOE(dTApplication, X0M.A00, c73833Sq, 2);
                            i2 |= 4;
                        } else {
                            throw new X6K(ANz);
                        }
                    } else {
                        str = ADQ.AOK(c73833Sq, 1);
                        i2 |= 2;
                    }
                } else {
                    i = ADQ.AO9(c73833Sq, 0);
                    i2 |= 1;
                }
            } else {
                ADQ.ASc(c73833Sq);
                return new DTInstallationError(dTApplication, str, i2, i);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [X.3Sp, java.lang.Object, X.X0R] */
    static {
        ?? obj = new Object();
        A00 = obj;
        C73833Sq c73833Sq = new C73833Sq("com.facebook.neko.directinstall.digitalturbine.DTInstallationError", obj, 3);
        c73833Sq.A00(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_CODE);
        c73833Sq.A00(DialogModule.KEY_MESSAGE);
        c73833Sq.A01("application", true);
        A01 = c73833Sq;
    }

    @Override // X.InterfaceC73823Sp
    public final C3R9[] childSerializers() {
        return new C3R9[]{C192398fh.A00, C3RD.A01, AbstractC192698gB.A00(X0M.A00)};
    }

    @Override // X.C3R9, X.C3RA, X.C3RB
    public final SerialDescriptor getDescriptor() {
        return A01;
    }

    @Override // X.C3RA
    public final /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        DTInstallationError dTInstallationError = (DTInstallationError) obj;
        boolean A1R = AbstractC167007dF.A1R(0, encoder, dTInstallationError);
        C73833Sq c73833Sq = A01;
        C4D8 ADR = encoder.ADR(c73833Sq);
        ADR.ASC(c73833Sq, 0, dTInstallationError.A00);
        ADR.ASL(dTInstallationError.A02, c73833Sq, A1R ? 1 : 0);
        if (ADR.EiY(c73833Sq, 2) || dTInstallationError.A01 != null) {
            ADR.ASG(dTInstallationError.A01, X0M.A00, c73833Sq, 2);
        }
        ADR.ASc(c73833Sq);
    }

    @Override // X.InterfaceC73823Sp
    public final C3R9[] typeParametersSerializers() {
        return AbstractC54355O0n.A00;
    }
}
