package X;

import com.instagram.business.onelink.cache.WhatsAppBusinessCacheInfo;
import kotlin.Deprecated;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Deprecated(level = AbstractC68219VIb.HIDDEN, message = "This synthesized declaration should not be used directly")
/* renamed from: X.PVe, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final /* synthetic */ class C57115PVe implements InterfaceC73823Sp {
    public static final C57115PVe A00;
    public static final SerialDescriptor A01;

    @Override // X.C3RB
    public final /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        C14360o3.A0B(decoder, 0);
        SerialDescriptor serialDescriptor = A01;
        C3T8 ADQ = decoder.ADQ(serialDescriptor);
        String str = null;
        String str2 = null;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        int i = 0;
        while (true) {
            int ANz = ADQ.ANz(serialDescriptor);
            if (ANz != -1) {
                if (ANz != 0) {
                    if (ANz != 1) {
                        if (ANz != 2) {
                            if (ANz != 3) {
                                if (ANz == 4) {
                                    z2 = ADQ.ANs(serialDescriptor, 4);
                                    i |= 16;
                                } else {
                                    throw new X6K(ANz);
                                }
                            } else {
                                z = ADQ.ANs(serialDescriptor, 3);
                                i |= 8;
                            }
                        } else {
                            z3 = ADQ.ANs(serialDescriptor, 2);
                            i |= 4;
                        }
                    } else {
                        str2 = (String) ADQ.AOE(str2, C3RD.A01, serialDescriptor, 1);
                        i |= 2;
                    }
                } else {
                    str = (String) ADQ.AOE(str, C3RD.A01, serialDescriptor, 0);
                    i |= 1;
                }
            } else {
                ADQ.ASc(serialDescriptor);
                return new WhatsAppBusinessCacheInfo(str, str2, i, z3, z, z2);
            }
        }
    }

    @Override // X.C3R9, X.C3RA, X.C3RB
    public final SerialDescriptor getDescriptor() {
        return A01;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [X.PVe, X.3Sp, java.lang.Object] */
    static {
        ?? obj = new Object();
        A00 = obj;
        C73833Sq c73833Sq = new C73833Sq("com.instagram.business.onelink.cache.WhatsAppBusinessCacheInfo", obj, 5);
        c73833Sq.A00("linkedPhoneNumber");
        c73833Sq.A00("linkedAccountType");
        c73833Sq.A00("isRiskyTierAccountForCtwa");
        c73833Sq.A00("isWhatsAppNumberBanned");
        c73833Sq.A00("isBusinessVerificationEligible");
        A01 = c73833Sq;
    }

    @Override // X.InterfaceC73823Sp
    public final C3R9[] childSerializers() {
        C3RD c3rd = C3RD.A01;
        C3R9 A002 = AbstractC192698gB.A00(c3rd);
        C3R9 A003 = AbstractC192698gB.A00(c3rd);
        C3SL c3sl = C3SL.A00;
        return new C3R9[]{A002, A003, c3sl, c3sl, c3sl};
    }

    @Override // X.C3RA
    public final /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        WhatsAppBusinessCacheInfo whatsAppBusinessCacheInfo = (WhatsAppBusinessCacheInfo) obj;
        boolean A1R = AbstractC167007dF.A1R(0, encoder, whatsAppBusinessCacheInfo);
        SerialDescriptor serialDescriptor = A01;
        C4D8 ADR = encoder.ADR(serialDescriptor);
        C3RD c3rd = C3RD.A01;
        ADR.ASG(whatsAppBusinessCacheInfo.A01, c3rd, serialDescriptor, 0);
        ADR.ASG(whatsAppBusinessCacheInfo.A00, c3rd, serialDescriptor, A1R ? 1 : 0);
        ADR.AS2(serialDescriptor, 2, whatsAppBusinessCacheInfo.A03);
        ADR.AS2(serialDescriptor, 3, whatsAppBusinessCacheInfo.A04);
        ADR.AS2(serialDescriptor, 4, whatsAppBusinessCacheInfo.A02);
        ADR.ASc(serialDescriptor);
    }

    @Override // X.InterfaceC73823Sp
    public final C3R9[] typeParametersSerializers() {
        return AbstractC54355O0n.A00;
    }
}
