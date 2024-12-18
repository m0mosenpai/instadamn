package X;

import com.facebook.neko.directinstall.digitalturbine.InstallationProgress;
import com.facebook.neko.directinstall.digitalturbine.InstallationProgressData;
import com.facebook.react.modules.intent.IntentModule;
import kotlin.Deprecated;
import kotlin.ReplaceWith;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Deprecated(level = AbstractC68219VIb.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
/* loaded from: classes11.dex */
public final class X0X implements InterfaceC73823Sp {
    public static final X0X A00;
    public static final /* synthetic */ C73833Sq A01;

    @Override // X.C3RB
    public final /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        C14360o3.A0B(decoder, 0);
        C73833Sq c73833Sq = A01;
        C3T8 ADQ = decoder.ADQ(c73833Sq);
        InstallationProgress installationProgress = null;
        String str = null;
        double d = 0.0d;
        int i = 0;
        int i2 = 0;
        while (true) {
            int ANz = ADQ.ANz(c73833Sq);
            if (ANz != -1) {
                if (ANz != 0) {
                    if (ANz != 1) {
                        if (ANz != 2) {
                            if (ANz == 3) {
                                i = ADQ.AO9(c73833Sq, 3);
                                i2 |= 8;
                            } else {
                                throw new X6K(ANz);
                            }
                        } else {
                            d = ADQ.ANy(c73833Sq, 2);
                            i2 |= 4;
                        }
                    } else {
                        str = ADQ.AOK(c73833Sq, 1);
                        i2 |= 2;
                    }
                } else {
                    installationProgress = (InstallationProgress) ADQ.AOF(installationProgress, X0W.A00, c73833Sq, 0);
                    i2 |= 1;
                }
            } else {
                ADQ.ASc(c73833Sq);
                return new InstallationProgressData(installationProgress, str, d, i2, i);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [X.X0X, X.3Sp, java.lang.Object] */
    static {
        ?? obj = new Object();
        A00 = obj;
        C73833Sq c73833Sq = new C73833Sq("com.facebook.neko.directinstall.digitalturbine.InstallationProgressData", obj, 4);
        c73833Sq.A00("data");
        c73833Sq.A00("taskId");
        c73833Sq.A01(IntentModule.EXTRA_MAP_KEY_FOR_VALUE, true);
        c73833Sq.A01("action", true);
        A01 = c73833Sq;
    }

    @Override // X.InterfaceC73823Sp
    public final C3R9[] childSerializers() {
        return new C3R9[]{X0W.A00, C3RD.A01, C3RQ.A00, C192398fh.A00};
    }

    @Override // X.C3R9, X.C3RA, X.C3RB
    public final SerialDescriptor getDescriptor() {
        return A01;
    }

    @Override // X.C3RA
    public final /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        InstallationProgressData installationProgressData = (InstallationProgressData) obj;
        boolean A1R = AbstractC167007dF.A1R(0, encoder, installationProgressData);
        SerialDescriptor serialDescriptor = A01;
        C4D8 ADR = encoder.ADR(serialDescriptor);
        C3RA c3ra = X0W.A00;
        InstallationProgress installationProgress = installationProgressData.A02;
        ADR.ASH(installationProgress, c3ra, serialDescriptor, 0);
        ADR.ASL(installationProgressData.A03, serialDescriptor, A1R ? 1 : 0);
        if (ADR.EiY(serialDescriptor, 2) || Double.compare(installationProgressData.A00, installationProgress.A00.A00) != 0) {
            ADR.AS6(serialDescriptor, installationProgressData.A00, 2);
        }
        if (ADR.EiY(serialDescriptor, 3) || installationProgressData.A01 != installationProgress.A00.A01) {
            ADR.ASC(serialDescriptor, 3, installationProgressData.A01);
        }
        ADR.ASc(serialDescriptor);
    }

    @Override // X.InterfaceC73823Sp
    public final C3R9[] typeParametersSerializers() {
        return AbstractC54355O0n.A00;
    }
}
