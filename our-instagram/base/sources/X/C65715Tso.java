package X;

import com.facebook.pushlite.model.PushInfraMetaData;
import kotlin.Deprecated;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Deprecated(level = AbstractC68219VIb.HIDDEN, message = "This synthesized declaration should not be used directly")
/* renamed from: X.Tso, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final /* synthetic */ class C65715Tso implements InterfaceC73823Sp {
    public static final C65715Tso A00;
    public static final SerialDescriptor A01;

    @Override // X.C3RB
    public final /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        C14360o3.A0B(decoder, 0);
        SerialDescriptor serialDescriptor = A01;
        C3T8 ADQ = decoder.ADQ(serialDescriptor);
        String str = null;
        Long l = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        Long l2 = null;
        String str8 = null;
        int i = 0;
        while (true) {
            int ANz = ADQ.ANz(serialDescriptor);
            switch (ANz) {
                case -1:
                    ADQ.ASc(serialDescriptor);
                    return new PushInfraMetaData(l2, l, str, str8, str6, str7, str5, str3, str4, str2, i);
                case 0:
                    str = (String) ADQ.AOE(str, C3RD.A01, serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    l2 = (Long) ADQ.AOE(l2, C3RJ.A00, serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    str8 = (String) ADQ.AOE(str8, C3RD.A01, serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    str6 = (String) ADQ.AOE(str6, C3RD.A01, serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    str7 = (String) ADQ.AOE(str7, C3RD.A01, serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    str5 = (String) ADQ.AOE(str5, C3RD.A01, serialDescriptor, 5);
                    i |= 32;
                    break;
                case 6:
                    str3 = (String) ADQ.AOE(str3, C3RD.A01, serialDescriptor, 6);
                    i |= 64;
                    break;
                case 7:
                    str4 = (String) ADQ.AOE(str4, C3RD.A01, serialDescriptor, 7);
                    i |= 128;
                    break;
                case 8:
                    str2 = (String) ADQ.AOE(str2, C3RD.A01, serialDescriptor, 8);
                    i |= 256;
                    break;
                case 9:
                    l = (Long) ADQ.AOE(l, C3RJ.A00, serialDescriptor, 9);
                    i |= 512;
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

    /* JADX WARN: Type inference failed for: r3v0, types: [X.Tso, X.3Sp, java.lang.Object] */
    static {
        ?? obj = new Object();
        A00 = obj;
        C73833Sq c73833Sq = new C73833Sq("com.facebook.pushlite.model.PushInfraMetaData", obj, 10);
        c73833Sq.A01("l", true);
        c73833Sq.A01("ui", true);
        c73833Sq.A01("pjid", true);
        c73833Sq.A01("hcs", true);
        c73833Sq.A01("hek", true);
        c73833Sq.A01("hki", true);
        c73833Sq.A01("tid", true);
        c73833Sq.A01("nid", true);
        c73833Sq.A01("ca", true);
        c73833Sq.A01("mit", true);
        A01 = c73833Sq;
    }

    @Override // X.InterfaceC73823Sp
    public final C3R9[] childSerializers() {
        C3RD c3rd = C3RD.A01;
        C3R9 A002 = AbstractC192698gB.A00(c3rd);
        C3RJ c3rj = C3RJ.A00;
        return new C3R9[]{A002, AbstractC192698gB.A00(c3rj), AbstractC192698gB.A00(c3rd), AbstractC192698gB.A00(c3rd), AbstractC192698gB.A00(c3rd), AbstractC192698gB.A00(c3rd), AbstractC192698gB.A00(c3rd), AbstractC192698gB.A00(c3rd), AbstractC192698gB.A00(c3rd), AbstractC192698gB.A00(c3rj)};
    }

    @Override // X.C3RA
    public final /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        PushInfraMetaData pushInfraMetaData = (PushInfraMetaData) obj;
        boolean A1R = AbstractC167007dF.A1R(0, encoder, pushInfraMetaData);
        SerialDescriptor serialDescriptor = A01;
        C4D8 ADR = encoder.ADR(serialDescriptor);
        AbstractC73763Sg abstractC73763Sg = PushInfraMetaData.A0A;
        if (ADR.EiY(serialDescriptor, 0) || pushInfraMetaData.A06 != null) {
            ADR.ASG(pushInfraMetaData.A06, C3RD.A01, serialDescriptor, 0);
        }
        if (ADR.EiY(serialDescriptor, A1R ? 1 : 0) || pushInfraMetaData.A01 != null) {
            ADR.ASG(pushInfraMetaData.A01, C3RJ.A00, serialDescriptor, A1R ? 1 : 0);
        }
        if (ADR.EiY(serialDescriptor, 2) || pushInfraMetaData.A08 != null) {
            ADR.ASG(pushInfraMetaData.A08, C3RD.A01, serialDescriptor, 2);
        }
        if (ADR.EiY(serialDescriptor, 3) || pushInfraMetaData.A03 != null) {
            ADR.ASG(pushInfraMetaData.A03, C3RD.A01, serialDescriptor, 3);
        }
        if (ADR.EiY(serialDescriptor, 4) || pushInfraMetaData.A04 != null) {
            ADR.ASG(pushInfraMetaData.A04, C3RD.A01, serialDescriptor, 4);
        }
        if (ADR.EiY(serialDescriptor, 5) || pushInfraMetaData.A05 != null) {
            ADR.ASG(pushInfraMetaData.A05, C3RD.A01, serialDescriptor, 5);
        }
        if (ADR.EiY(serialDescriptor, 6) || pushInfraMetaData.A09 != null) {
            ADR.ASG(pushInfraMetaData.A09, C3RD.A01, serialDescriptor, 6);
        }
        if (ADR.EiY(serialDescriptor, 7) || pushInfraMetaData.A07 != null) {
            ADR.ASG(pushInfraMetaData.A07, C3RD.A01, serialDescriptor, 7);
        }
        if (ADR.EiY(serialDescriptor, 8) || pushInfraMetaData.A02 != null) {
            ADR.ASG(pushInfraMetaData.A02, C3RD.A01, serialDescriptor, 8);
        }
        if (ADR.EiY(serialDescriptor, 9) || pushInfraMetaData.A00 != null) {
            ADR.ASG(pushInfraMetaData.A00, C3RJ.A00, serialDescriptor, 9);
        }
        ADR.ASc(serialDescriptor);
    }

    @Override // X.InterfaceC73823Sp
    public final C3R9[] typeParametersSerializers() {
        return AbstractC54355O0n.A00;
    }
}
