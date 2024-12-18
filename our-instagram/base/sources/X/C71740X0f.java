package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.react.modules.intent.IntentModule;
import com.instagram.igsignals.core.IgSignalsFeature;
import kotlin.Deprecated;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Deprecated(level = AbstractC68219VIb.HIDDEN, message = "This synthesized declaration should not be used directly")
/* renamed from: X.X0f, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final /* synthetic */ class C71740X0f implements InterfaceC73823Sp {
    public static final C71740X0f A00;
    public static final SerialDescriptor A01;

    @Override // X.C3RB
    public final /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        C14360o3.A0B(decoder, 0);
        SerialDescriptor serialDescriptor = A01;
        C3T8 ADQ = decoder.ADQ(serialDescriptor);
        String str = null;
        double d = 0.0d;
        int i = 0;
        int i2 = 0;
        while (true) {
            int ANz = ADQ.ANz(serialDescriptor);
            if (ANz != -1) {
                if (ANz != 0) {
                    if (ANz != 1) {
                        if (ANz == 2) {
                            d = ADQ.ANy(serialDescriptor, 2);
                            i |= 4;
                        } else {
                            throw new X6K(ANz);
                        }
                    } else {
                        i2 = ADQ.AO9(serialDescriptor, 1);
                        i |= 2;
                    }
                } else {
                    str = ADQ.AOK(serialDescriptor, 0);
                    i |= 1;
                }
            } else {
                ADQ.ASc(serialDescriptor);
                return new IgSignalsFeature(i, i2, str, d);
            }
        }
    }

    @Override // X.C3R9, X.C3RA, X.C3RB
    public final SerialDescriptor getDescriptor() {
        return A01;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [X.X0f, X.3Sp, java.lang.Object] */
    static {
        ?? obj = new Object();
        A00 = obj;
        C73833Sq c73833Sq = new C73833Sq("com.instagram.igsignals.core.IgSignalsFeature", obj, 3);
        c73833Sq.A00(PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
        c73833Sq.A00("identifier");
        c73833Sq.A00(IntentModule.EXTRA_MAP_KEY_FOR_VALUE);
        A01 = c73833Sq;
    }

    @Override // X.InterfaceC73823Sp
    public final C3R9[] childSerializers() {
        return new C3R9[]{C3RD.A01, C192398fh.A00, C3RQ.A00};
    }

    @Override // X.C3RA
    public final /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        IgSignalsFeature igSignalsFeature = (IgSignalsFeature) obj;
        boolean A1R = AbstractC167007dF.A1R(0, encoder, igSignalsFeature);
        SerialDescriptor serialDescriptor = A01;
        C4D8 ADR = encoder.ADR(serialDescriptor);
        ADR.ASL(igSignalsFeature.A02, serialDescriptor, 0);
        ADR.ASC(serialDescriptor, A1R ? 1 : 0, igSignalsFeature.A01);
        ADR.AS6(serialDescriptor, igSignalsFeature.A00, 2);
        ADR.ASc(serialDescriptor);
    }

    @Override // X.InterfaceC73823Sp
    public final C3R9[] typeParametersSerializers() {
        return AbstractC54355O0n.A00;
    }
}
