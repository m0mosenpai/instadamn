package X;

import com.facebook.rsys.videoeffectcommunication.gen.VideoEffectCommunicationApi;

/* loaded from: classes8.dex */
public final class MLN extends C0YY implements InterfaceC16660sJ {
    public static final MLN A00 = new MLN();

    public MLN() {
        super(1);
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        N04 A0k = AbstractC43593JPy.A0k(obj);
        if (A0k.A03 != null) {
            A0k.A03 = null;
            VideoEffectCommunicationApi videoEffectCommunicationApi = A0k.A00;
            if (videoEffectCommunicationApi != null) {
                videoEffectCommunicationApi.multipeerStopListening();
            }
            LS4 ls4 = A0k.A01;
            if (ls4 != null) {
                ls4.A01.clear();
                ls4.A00.clear();
            }
            A0k.A01 = null;
            A0k.A07.A00 = null;
        }
        return C0eB.A00;
    }
}
