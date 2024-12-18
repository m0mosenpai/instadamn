package X;

import com.instagram.direct.msys.reverb.ReverbMessage;

/* renamed from: X.MJa, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C50296MJa extends C0YY implements InterfaceC16660sJ {
    public static final C50296MJa A00 = new C50296MJa();

    public C50296MJa() {
        super(1);
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        ReverbMessage reverbMessage = (ReverbMessage) obj;
        C14360o3.A0B(reverbMessage, 0);
        String messageId = reverbMessage.getMessageId();
        if (messageId == null) {
            return "";
        }
        return messageId;
    }
}
