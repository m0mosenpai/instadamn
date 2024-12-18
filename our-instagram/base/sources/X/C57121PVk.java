package X;

import com.instagram.wellbeing.livechat.LiveChatNonceList;
import java.util.ArrayList;
import kotlin.Deprecated;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Deprecated(level = AbstractC68219VIb.HIDDEN, message = "This synthesized declaration should not be used directly")
/* renamed from: X.PVk, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final /* synthetic */ class C57121PVk implements InterfaceC73823Sp {
    public static final C57121PVk A00;
    public static final SerialDescriptor A01;

    @Override // X.C3RB
    public final /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        C14360o3.A0B(decoder, 0);
        SerialDescriptor serialDescriptor = A01;
        C3T8 ADQ = decoder.ADQ(serialDescriptor);
        C3R9[] c3r9Arr = LiveChatNonceList.A01;
        ArrayList arrayList = null;
        int i = 0;
        while (true) {
            int ANz = ADQ.ANz(serialDescriptor);
            if (ANz != -1) {
                if (ANz == 0) {
                    arrayList = (ArrayList) MSW.A12(arrayList, serialDescriptor, ADQ, c3r9Arr, 0);
                    i |= 1;
                } else {
                    throw new X6K(ANz);
                }
            } else {
                ADQ.ASc(serialDescriptor);
                return new LiveChatNonceList(arrayList, i);
            }
        }
    }

    @Override // X.C3R9, X.C3RA, X.C3RB
    public final SerialDescriptor getDescriptor() {
        return A01;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [X.PVk, X.3Sp, java.lang.Object] */
    static {
        ?? obj = new Object();
        A00 = obj;
        C73833Sq c73833Sq = new C73833Sq("com.instagram.wellbeing.livechat.LiveChatNonceList", obj, 1);
        c73833Sq.A00("liveChatNonceList");
        A01 = c73833Sq;
    }

    @Override // X.InterfaceC73823Sp
    public final C3R9[] childSerializers() {
        return new C3R9[]{LiveChatNonceList.A01[0]};
    }

    @Override // X.C3RA
    public final /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        LiveChatNonceList liveChatNonceList = (LiveChatNonceList) obj;
        AbstractC167017dG.A1N(encoder, liveChatNonceList);
        SerialDescriptor serialDescriptor = A01;
        C4D8 ADR = encoder.ADR(serialDescriptor);
        ADR.ASH(liveChatNonceList.A00, LiveChatNonceList.A01[0], serialDescriptor, 0);
        ADR.ASc(serialDescriptor);
    }

    @Override // X.InterfaceC73823Sp
    public final C3R9[] typeParametersSerializers() {
        return AbstractC54355O0n.A00;
    }
}
