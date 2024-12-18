package X;

import kotlin.Deprecated;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import libraries.zero.headers.ZeroHeadersEntry;

@Deprecated(level = AbstractC68219VIb.HIDDEN, message = "This synthesized declaration should not be used directly")
/* loaded from: classes9.dex */
public final /* synthetic */ class PVm implements InterfaceC73823Sp {
    public static final SerialDescriptor A00;
    public static final PVm A01;

    @Override // X.C3RB
    public final /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        C14360o3.A0B(decoder, 0);
        SerialDescriptor serialDescriptor = A00;
        C3T8 ADQ = decoder.ADQ(serialDescriptor);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int ANz = ADQ.ANz(serialDescriptor);
            switch (ANz) {
                case -1:
                    ADQ.ASc(serialDescriptor);
                    return new ZeroHeadersEntry(str, str5, str4, str3, str2, i3, i, i2);
                case 0:
                    str = ADQ.AOK(serialDescriptor, 0);
                    i3 |= 1;
                    break;
                case 1:
                    str5 = ADQ.AOK(serialDescriptor, 1);
                    i3 |= 2;
                    break;
                case 2:
                    str4 = ADQ.AOK(serialDescriptor, 2);
                    i3 |= 4;
                    break;
                case 3:
                    i = ADQ.AO9(serialDescriptor, 3);
                    i3 |= 8;
                    break;
                case 4:
                    i2 = ADQ.AO9(serialDescriptor, 4);
                    i3 |= 16;
                    break;
                case 5:
                    str3 = ADQ.AOK(serialDescriptor, 5);
                    i3 |= 32;
                    break;
                case 6:
                    str2 = ADQ.AOK(serialDescriptor, 6);
                    i3 |= 64;
                    break;
                default:
                    throw new X6K(ANz);
            }
        }
    }

    @Override // X.C3R9, X.C3RA, X.C3RB
    public final SerialDescriptor getDescriptor() {
        return A00;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [X.3Sp, java.lang.Object, X.PVm] */
    static {
        ?? obj = new Object();
        A01 = obj;
        C73833Sq c73833Sq = new C73833Sq("libraries.zero.headers.ZeroHeadersEntry", obj, 7);
        c73833Sq.A00("encryptedMsisdn");
        c73833Sq.A00("maskedMsisdn");
        c73833Sq.A00("storageId");
        c73833Sq.A00("createdAt");
        c73833Sq.A00("expiredAt");
        c73833Sq.A01("cursor", true);
        c73833Sq.A01("internal", true);
        A00 = c73833Sq;
    }

    @Override // X.InterfaceC73823Sp
    public final C3R9[] childSerializers() {
        C3RD c3rd = C3RD.A01;
        C192398fh c192398fh = C192398fh.A00;
        return new C3R9[]{c3rd, c3rd, c3rd, c192398fh, c192398fh, c3rd, c3rd};
    }

    @Override // X.C3RA
    public final /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        ZeroHeadersEntry zeroHeadersEntry = (ZeroHeadersEntry) obj;
        boolean A1R = AbstractC167007dF.A1R(0, encoder, zeroHeadersEntry);
        SerialDescriptor serialDescriptor = A00;
        C4D8 ADR = encoder.ADR(serialDescriptor);
        ADR.ASL(zeroHeadersEntry.A03, serialDescriptor, 0);
        ADR.ASL(zeroHeadersEntry.A05, serialDescriptor, A1R ? 1 : 0);
        ADR.ASL(zeroHeadersEntry.A06, serialDescriptor, 2);
        ADR.ASC(serialDescriptor, 3, zeroHeadersEntry.A00);
        ADR.ASC(serialDescriptor, 4, zeroHeadersEntry.A01);
        if (ADR.EiY(serialDescriptor, 5) || !C14360o3.A0K(zeroHeadersEntry.A02, "")) {
            ADR.ASL(zeroHeadersEntry.A02, serialDescriptor, 5);
        }
        if (ADR.EiY(serialDescriptor, 6) || !C14360o3.A0K(zeroHeadersEntry.A04, "")) {
            ADR.ASL(zeroHeadersEntry.A04, serialDescriptor, 6);
        }
        ADR.ASc(serialDescriptor);
    }

    @Override // X.InterfaceC73823Sp
    public final C3R9[] typeParametersSerializers() {
        return AbstractC54355O0n.A00;
    }
}
