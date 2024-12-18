package X;

import com.instagram.wellbeing.livechat.LiveChatNonce;
import kotlin.Deprecated;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Deprecated(level = AbstractC68219VIb.HIDDEN, message = "This synthesized declaration should not be used directly")
/* renamed from: X.PVj, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final /* synthetic */ class C57120PVj implements InterfaceC73823Sp {
    public static final C57120PVj A00;
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
                            str3 = (String) ADQ.AOE(str3, C3RD.A01, serialDescriptor, 2);
                            i |= 4;
                        } else {
                            throw new X6K(ANz);
                        }
                    } else {
                        str2 = (String) ADQ.AOE(str2, C3RD.A01, serialDescriptor, 1);
                        i |= 2;
                    }
                } else {
                    str = ADQ.AOK(serialDescriptor, 0);
                    i |= 1;
                }
            } else {
                ADQ.ASc(serialDescriptor);
                return new LiveChatNonce(str, str2, str3, i);
            }
        }
    }

    @Override // X.C3R9, X.C3RA, X.C3RB
    public final SerialDescriptor getDescriptor() {
        return A01;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [X.PVj, X.3Sp, java.lang.Object] */
    static {
        ?? obj = new Object();
        A00 = obj;
        C73833Sq c73833Sq = new C73833Sq("com.instagram.wellbeing.livechat.LiveChatNonce", obj, 3);
        c73833Sq.A00("userId");
        c73833Sq.A00("nonce");
        c73833Sq.A00("supportUid");
        A01 = c73833Sq;
    }

    @Override // X.InterfaceC73823Sp
    public final C3R9[] childSerializers() {
        C3RD c3rd = C3RD.A01;
        return new C3R9[]{c3rd, AbstractC192698gB.A00(c3rd), AbstractC192698gB.A00(c3rd)};
    }

    @Override // X.C3RA
    public final /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        LiveChatNonce liveChatNonce = (LiveChatNonce) obj;
        boolean A1R = AbstractC167007dF.A1R(0, encoder, liveChatNonce);
        SerialDescriptor serialDescriptor = A01;
        C4D8 ADR = encoder.ADR(serialDescriptor);
        ADR.ASL(liveChatNonce.A02, serialDescriptor, 0);
        C3RD c3rd = C3RD.A01;
        ADR.ASG(liveChatNonce.A00, c3rd, serialDescriptor, A1R ? 1 : 0);
        ADR.ASG(liveChatNonce.A01, c3rd, serialDescriptor, 2);
        ADR.ASc(serialDescriptor);
    }

    @Override // X.InterfaceC73823Sp
    public final C3R9[] typeParametersSerializers() {
        return AbstractC54355O0n.A00;
    }
}
