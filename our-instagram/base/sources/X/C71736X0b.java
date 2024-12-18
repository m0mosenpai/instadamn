package X;

import com.instagram.business.onelink.cache.AdAccountCacheInfo;
import kotlin.Deprecated;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Deprecated(level = AbstractC68219VIb.HIDDEN, message = "This synthesized declaration should not be used directly")
/* renamed from: X.X0b, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final /* synthetic */ class C71736X0b implements InterfaceC73823Sp {
    public static final C71736X0b A00;
    public static final SerialDescriptor A01;

    @Override // X.C3RB
    public final /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        C14360o3.A0B(decoder, 0);
        SerialDescriptor serialDescriptor = A01;
        C3T8 ADQ = decoder.ADQ(serialDescriptor);
        String str = null;
        String str2 = null;
        String str3 = null;
        int i = 0;
        while (true) {
            int ANz = ADQ.ANz(serialDescriptor);
            if (ANz != -1) {
                if (ANz != 0) {
                    if (ANz != 1) {
                        if (ANz == 2) {
                            str3 = AbstractC65702TsY.A0e(str3, serialDescriptor, ADQ, 2);
                            i |= 4;
                        } else {
                            throw new X6K(ANz);
                        }
                    } else {
                        str2 = AbstractC65702TsY.A0e(str2, serialDescriptor, ADQ, 1);
                        i |= 2;
                    }
                } else {
                    str = AbstractC65702TsY.A0e(str, serialDescriptor, ADQ, 0);
                    i |= 1;
                }
            } else {
                ADQ.ASc(serialDescriptor);
                return new AdAccountCacheInfo(str, str2, str3, i);
            }
        }
    }

    @Override // X.C3R9, X.C3RA, X.C3RB
    public final SerialDescriptor getDescriptor() {
        return A01;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [X.3Sp, java.lang.Object, X.X0b] */
    static {
        ?? obj = new Object();
        A00 = obj;
        C73833Sq c73833Sq = new C73833Sq("com.instagram.business.onelink.cache.AdAccountCacheInfo", obj, 3);
        c73833Sq.A00("accountName");
        c73833Sq.A00("accountId");
        c73833Sq.A00("legacyAccountId");
        A01 = c73833Sq;
    }

    @Override // X.InterfaceC73823Sp
    public final C3R9[] childSerializers() {
        C3RD c3rd = C3RD.A01;
        return new C3R9[]{AbstractC192698gB.A00(c3rd), AbstractC192698gB.A00(c3rd), AbstractC192698gB.A00(c3rd)};
    }

    @Override // X.C3RA
    public final /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        AdAccountCacheInfo adAccountCacheInfo = (AdAccountCacheInfo) obj;
        boolean A1R = AbstractC167007dF.A1R(0, encoder, adAccountCacheInfo);
        SerialDescriptor serialDescriptor = A01;
        C4D8 ADR = encoder.ADR(serialDescriptor);
        C3RD c3rd = C3RD.A01;
        ADR.ASG(adAccountCacheInfo.A01, c3rd, serialDescriptor, 0);
        ADR.ASG(adAccountCacheInfo.A00, c3rd, serialDescriptor, A1R ? 1 : 0);
        ADR.ASG(adAccountCacheInfo.A02, c3rd, serialDescriptor, 2);
        ADR.ASc(serialDescriptor);
    }

    @Override // X.InterfaceC73823Sp
    public final C3R9[] typeParametersSerializers() {
        return AbstractC54355O0n.A00;
    }
}
