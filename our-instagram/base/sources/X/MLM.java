package X;

import com.facebook.rsys.videoeffectcommunication.gen.VideoEffectCommunicationApi;

/* loaded from: classes8.dex */
public final class MLM extends C0YY implements InterfaceC16660sJ {
    public static final MLM A00 = new MLM();

    public MLM() {
        super(1);
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        N04 A0k = AbstractC43593JPy.A0k(obj);
        if (A0k.A04 != null) {
            A0k.A04 = null;
            VideoEffectCommunicationApi videoEffectCommunicationApi = A0k.A00;
            if (videoEffectCommunicationApi != null) {
                videoEffectCommunicationApi.participantModuleReset();
            }
            A0k.A02 = null;
            A0k.A07.A01 = null;
            A0k.A06.clear();
        }
        return C0eB.A00;
    }
}
