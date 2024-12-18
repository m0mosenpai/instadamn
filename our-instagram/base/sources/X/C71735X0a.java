package X;

import com.facebook.ohai.ohaiconfigprovider.base.OHAIConfig;
import kotlin.Deprecated;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Deprecated(level = AbstractC68219VIb.HIDDEN, message = "This synthesized declaration should not be used directly")
/* renamed from: X.X0a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final /* synthetic */ class C71735X0a implements InterfaceC73823Sp {
    public static final C71735X0a A00;
    public static final SerialDescriptor A01;

    @Override // X.C3RB
    public final /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        C14360o3.A0B(decoder, 0);
        SerialDescriptor serialDescriptor = A01;
        C3T8 ADQ = decoder.ADQ(serialDescriptor);
        long j = 0;
        String str = null;
        long j2 = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            int ANz = ADQ.ANz(serialDescriptor);
            switch (ANz) {
                case -1:
                    ADQ.ASc(serialDescriptor);
                    return new OHAIConfig(str, i5, i, i4, i2, i3, j2, j);
                case 0:
                    i = ADQ.AO9(serialDescriptor, 0);
                    i5 |= 1;
                    break;
                case 1:
                    str = ADQ.AOK(serialDescriptor, 1);
                    i5 |= 2;
                    break;
                case 2:
                    i4 = ADQ.AO9(serialDescriptor, 2);
                    i5 |= 4;
                    break;
                case 3:
                    i2 = ADQ.AO9(serialDescriptor, 3);
                    i5 |= 8;
                    break;
                case 4:
                    i3 = ADQ.AO9(serialDescriptor, 4);
                    i5 |= 16;
                    break;
                case 5:
                    j2 = ADQ.AOC(serialDescriptor, 5);
                    i5 |= 32;
                    break;
                case 6:
                    j = ADQ.AOC(serialDescriptor, 6);
                    i5 |= 64;
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

    /* JADX WARN: Type inference failed for: r3v0, types: [X.3Sp, java.lang.Object, X.X0a] */
    static {
        ?? obj = new Object();
        A00 = obj;
        C73833Sq c73833Sq = new C73833Sq("com.facebook.ohai.ohaiconfigprovider.base.OHAIConfig", obj, 7);
        c73833Sq.A00("keyId");
        c73833Sq.A00("publicKey");
        c73833Sq.A00("kemId");
        c73833Sq.A00("kdfId");
        c73833Sq.A00("aeadId");
        c73833Sq.A00("expirationDate");
        c73833Sq.A00("lastUpdatedTime");
        A01 = c73833Sq;
    }

    @Override // X.InterfaceC73823Sp
    public final C3R9[] childSerializers() {
        C192398fh c192398fh = C192398fh.A00;
        C3RD c3rd = C3RD.A01;
        C3RJ c3rj = C3RJ.A00;
        return new C3R9[]{c192398fh, c3rd, c192398fh, c192398fh, c192398fh, c3rj, c3rj};
    }

    @Override // X.C3RA
    public final /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        OHAIConfig oHAIConfig = (OHAIConfig) obj;
        boolean A1R = AbstractC167007dF.A1R(0, encoder, oHAIConfig);
        SerialDescriptor serialDescriptor = A01;
        C4D8 ADR = encoder.ADR(serialDescriptor);
        ADR.ASC(serialDescriptor, 0, oHAIConfig.A03);
        ADR.ASL(oHAIConfig.A06, serialDescriptor, A1R ? 1 : 0);
        ADR.ASC(serialDescriptor, 2, oHAIConfig.A02);
        ADR.ASC(serialDescriptor, 3, oHAIConfig.A01);
        ADR.ASC(serialDescriptor, 4, oHAIConfig.A00);
        ADR.ASE(serialDescriptor, 5, oHAIConfig.A04);
        ADR.ASE(serialDescriptor, 6, oHAIConfig.A05);
        ADR.ASc(serialDescriptor);
    }

    @Override // X.InterfaceC73823Sp
    public final C3R9[] typeParametersSerializers() {
        return AbstractC54355O0n.A00;
    }
}
