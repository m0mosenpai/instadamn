package X;

import com.facebook.neko.directinstall.digitalturbine.DTApplication;
import com.facebook.neko.directinstall.digitalturbine.DTTaskInfo;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import kotlin.Deprecated;
import kotlin.ReplaceWith;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Deprecated(level = AbstractC68219VIb.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
/* loaded from: classes11.dex */
public final class X0V implements InterfaceC73823Sp {
    public static final X0V A00;
    public static final /* synthetic */ C73833Sq A01;

    @Override // X.C3RB
    public final /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        C14360o3.A0B(decoder, 0);
        C73833Sq c73833Sq = A01;
        C3T8 ADQ = decoder.ADQ(c73833Sq);
        String str = null;
        DTApplication dTApplication = null;
        Double d = null;
        String str2 = null;
        int i = 0;
        int i2 = 0;
        while (true) {
            int ANz = ADQ.ANz(c73833Sq);
            if (ANz != -1) {
                if (ANz != 0) {
                    if (ANz != 1) {
                        if (ANz != 2) {
                            if (ANz != 3) {
                                if (ANz == 4) {
                                    str2 = AbstractC65702TsY.A0e(str2, c73833Sq, ADQ, 4);
                                    i |= 16;
                                } else {
                                    throw new X6K(ANz);
                                }
                            } else {
                                d = (Double) ADQ.AOE(d, C3RQ.A00, c73833Sq, 3);
                                i |= 8;
                            }
                        } else {
                            dTApplication = (DTApplication) ADQ.AOE(dTApplication, X0M.A00, c73833Sq, 2);
                            i |= 4;
                        }
                    } else {
                        i2 = ADQ.AO9(c73833Sq, 1);
                        i |= 2;
                    }
                } else {
                    str = ADQ.AOK(c73833Sq, 0);
                    i |= 1;
                }
            } else {
                ADQ.ASc(c73833Sq);
                return new DTTaskInfo(dTApplication, d, str, str2, i, i2);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [X.X0V, X.3Sp, java.lang.Object] */
    static {
        ?? obj = new Object();
        A00 = obj;
        C73833Sq c73833Sq = new C73833Sq("com.facebook.neko.directinstall.digitalturbine.DTTaskInfo", obj, 5);
        c73833Sq.A00("taskId");
        c73833Sq.A00(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS);
        c73833Sq.A01("application", true);
        c73833Sq.A01("progressValue", true);
        c73833Sq.A01("partnerMetadata", true);
        A01 = c73833Sq;
    }

    @Override // X.InterfaceC73823Sp
    public final C3R9[] childSerializers() {
        C3RD c3rd = C3RD.A01;
        return new C3R9[]{c3rd, C192398fh.A00, AbstractC192698gB.A00(X0M.A00), AbstractC192698gB.A00(C3RQ.A00), AbstractC192698gB.A00(c3rd)};
    }

    @Override // X.C3R9, X.C3RA, X.C3RB
    public final SerialDescriptor getDescriptor() {
        return A01;
    }

    @Override // X.C3RA
    public final /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        DTTaskInfo dTTaskInfo = (DTTaskInfo) obj;
        boolean A1R = AbstractC167007dF.A1R(0, encoder, dTTaskInfo);
        C73833Sq c73833Sq = A01;
        C4D8 ADR = encoder.ADR(c73833Sq);
        ADR.ASL(dTTaskInfo.A04, c73833Sq, 0);
        ADR.ASC(c73833Sq, A1R ? 1 : 0, dTTaskInfo.A00);
        if (ADR.EiY(c73833Sq, 2) || dTTaskInfo.A01 != null) {
            ADR.ASG(dTTaskInfo.A01, X0M.A00, c73833Sq, 2);
        }
        if (ADR.EiY(c73833Sq, 3) || dTTaskInfo.A02 != null) {
            ADR.ASG(dTTaskInfo.A02, C3RQ.A00, c73833Sq, 3);
        }
        if (ADR.EiY(c73833Sq, 4) || dTTaskInfo.A03 != null) {
            ADR.ASG(dTTaskInfo.A03, C3RD.A01, c73833Sq, 4);
        }
        ADR.ASc(c73833Sq);
    }

    @Override // X.InterfaceC73823Sp
    public final C3R9[] typeParametersSerializers() {
        return AbstractC54355O0n.A00;
    }
}
