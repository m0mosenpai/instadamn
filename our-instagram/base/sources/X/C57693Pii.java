package X;

import com.facebook.rsys.videoeffectcommunication.gen.VideoEffectCommunicationApi;

/* renamed from: X.Pii, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C57693Pii extends C0YY implements InterfaceC16660sJ {
    public static final C57693Pii A00 = new C57693Pii();

    public C57693Pii() {
        super(1);
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        VideoEffectCommunicationApi videoEffectCommunicationApi = MSX.A0T(obj).A06.A00;
        if (videoEffectCommunicationApi != null) {
            videoEffectCommunicationApi.participantModuleReset();
        }
        return C0eB.A00;
    }
}
