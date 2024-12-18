package X;

import com.instagram.business.onelink.cache.BusinessAccountCacheInfo;
import kotlin.Deprecated;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Deprecated(level = AbstractC68219VIb.HIDDEN, message = "This synthesized declaration should not be used directly")
/* renamed from: X.X0c, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final /* synthetic */ class C71737X0c implements InterfaceC73823Sp {
    public static final C71737X0c A00;
    public static final SerialDescriptor A01;

    @Override // X.C3RB
    public final /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        C14360o3.A0B(decoder, 0);
        SerialDescriptor serialDescriptor = A01;
        C3T8 ADQ = decoder.ADQ(serialDescriptor);
        String str = null;
        String str2 = null;
        int i = 0;
        while (true) {
            int ANz = ADQ.ANz(serialDescriptor);
            if (ANz != -1) {
                if (ANz != 0) {
                    if (ANz == 1) {
                        str2 = AbstractC65702TsY.A0e(str2, serialDescriptor, ADQ, 1);
                        i |= 2;
                    } else {
                        throw new X6K(ANz);
                    }
                } else {
                    str = AbstractC65702TsY.A0e(str, serialDescriptor, ADQ, 0);
                    i |= 1;
                }
            } else {
                ADQ.ASc(serialDescriptor);
                return new BusinessAccountCacheInfo(str, str2, i);
            }
        }
    }

    @Override // X.C3R9, X.C3RA, X.C3RB
    public final SerialDescriptor getDescriptor() {
        return A01;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [X.3Sp, java.lang.Object, X.X0c] */
    static {
        ?? obj = new Object();
        A00 = obj;
        C73833Sq c73833Sq = new C73833Sq("com.instagram.business.onelink.cache.BusinessAccountCacheInfo", obj, 2);
        c73833Sq.A00("businessName");
        c73833Sq.A00("businessId");
        A01 = c73833Sq;
    }

    @Override // X.InterfaceC73823Sp
    public final C3R9[] childSerializers() {
        C3RD c3rd = C3RD.A01;
        return new C3R9[]{AbstractC192698gB.A00(c3rd), AbstractC192698gB.A00(c3rd)};
    }

    @Override // X.C3RA
    public final /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        BusinessAccountCacheInfo businessAccountCacheInfo = (BusinessAccountCacheInfo) obj;
        boolean A1R = AbstractC167007dF.A1R(0, encoder, businessAccountCacheInfo);
        SerialDescriptor serialDescriptor = A01;
        C4D8 ADR = encoder.ADR(serialDescriptor);
        C3RD c3rd = C3RD.A01;
        ADR.ASG(businessAccountCacheInfo.A01, c3rd, serialDescriptor, 0);
        ADR.ASG(businessAccountCacheInfo.A00, c3rd, serialDescriptor, A1R ? 1 : 0);
        ADR.ASc(serialDescriptor);
    }

    @Override // X.InterfaceC73823Sp
    public final C3R9[] typeParametersSerializers() {
        return AbstractC54355O0n.A00;
    }
}
