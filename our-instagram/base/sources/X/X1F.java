package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import kotlin.Deprecated;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Deprecated(level = AbstractC68219VIb.HIDDEN, message = "This synthesized declaration should not be used directly")
/* loaded from: classes11.dex */
public final /* synthetic */ class X1F implements InterfaceC73823Sp {
    public static final X1F A00;
    public static final SerialDescriptor A01;

    @Override // X.C3RB
    public final /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        C14360o3.A0B(decoder, 0);
        SerialDescriptor serialDescriptor = A01;
        C3T8 ADQ = decoder.ADQ(serialDescriptor);
        String str = null;
        Long l = null;
        String str2 = null;
        Long l2 = null;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        int i = 0;
        while (true) {
            int ANz = ADQ.ANz(serialDescriptor);
            switch (ANz) {
                case -1:
                    ADQ.ASc(serialDescriptor);
                    return new UQH(l, l2, str2, str, i, z2, z3, z);
                case 0:
                    l = (Long) ADQ.AOE(l, C3RJ.A00, serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    str2 = ADQ.AOK(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    l2 = (Long) ADQ.AOE(l2, C3RJ.A00, serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    z2 = ADQ.ANs(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    z3 = ADQ.ANs(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    z = ADQ.ANs(serialDescriptor, 5);
                    i |= 32;
                    break;
                case 6:
                    str = ADQ.AOK(serialDescriptor, 6);
                    i |= 64;
                    break;
                default:
                    throw new X6K(ANz);
            }
        }
    }

    @Override // X.C3R9, X.C3RA, X.C3RB
    public final SerialDescriptor getDescriptor() {
        return A01;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [X.3Sp, X.X1F, java.lang.Object] */
    static {
        ?? obj = new Object();
        A00 = obj;
        C73833Sq c73833Sq = new C73833Sq("X.UQH", obj, 7);
        c73833Sq.A01("dwell", true);
        c73833Sq.A00(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
        c73833Sq.A01("videoDuration", true);
        c73833Sq.A01("isMultiAd", true);
        c73833Sq.A01("isCarouselAd", true);
        c73833Sq.A01("isMMC", true);
        c73833Sq.A00("clipType");
        A01 = c73833Sq;
    }

    @Override // X.InterfaceC73823Sp
    public final C3R9[] childSerializers() {
        C3RJ c3rj = C3RJ.A00;
        C3R9 A002 = AbstractC192698gB.A00(c3rj);
        C3RD c3rd = C3RD.A01;
        C3R9 A003 = AbstractC192698gB.A00(c3rj);
        C3SL c3sl = C3SL.A00;
        return new C3R9[]{A002, c3rd, A003, c3sl, c3sl, c3sl, c3rd};
    }

    @Override // X.C3RA
    public final /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        UQH uqh = (UQH) obj;
        boolean A1R = AbstractC167007dF.A1R(0, encoder, uqh);
        SerialDescriptor serialDescriptor = A01;
        C4D8 ADR = encoder.ADR(serialDescriptor);
        if (ADR.EiY(serialDescriptor, 0) || uqh.A00 != null) {
            ADR.ASG(uqh.A00, C3RJ.A00, serialDescriptor, 0);
        }
        ADR.ASL(uqh.A03, serialDescriptor, A1R ? 1 : 0);
        if (ADR.EiY(serialDescriptor, 2) || uqh.A01 != null) {
            ADR.ASG(uqh.A01, C3RJ.A00, serialDescriptor, 2);
        }
        if (ADR.EiY(serialDescriptor, 3) || uqh.A06) {
            ADR.AS2(serialDescriptor, 3, uqh.A06);
        }
        if (ADR.EiY(serialDescriptor, 4) || uqh.A04) {
            ADR.AS2(serialDescriptor, 4, uqh.A04);
        }
        if (ADR.EiY(serialDescriptor, 5) || uqh.A05) {
            ADR.AS2(serialDescriptor, 5, uqh.A05);
        }
        ADR.ASL(uqh.A02, serialDescriptor, 6);
        ADR.ASc(serialDescriptor);
    }

    @Override // X.InterfaceC73823Sp
    public final C3R9[] typeParametersSerializers() {
        return AbstractC54355O0n.A00;
    }
}
