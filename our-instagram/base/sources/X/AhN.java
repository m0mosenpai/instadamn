package X;

import com.instagram.creation.capture.quickcapture.sundial.ClipsAudioMixingDrawerController;
import com.instagram.music.common.model.AudioOverlayTrack;

/* loaded from: classes4.dex */
public final class AhN implements InterfaceC58033PoJ {
    public final /* synthetic */ ClipsAudioMixingDrawerController A00;
    public final /* synthetic */ AudioOverlayTrack A01;
    public final /* synthetic */ boolean A02;

    @Override // X.InterfaceC58033PoJ
    public final void DUI(String str) {
        C14360o3.A0B(str, 0);
        C8BE c8be = (C8BE) this.A00.A0L.getValue();
        c8be.A05.A0e(this.A01, true);
        AbstractC183338Bg.A00(c8be.A03).A0D(str);
    }

    public AhN(ClipsAudioMixingDrawerController clipsAudioMixingDrawerController, AudioOverlayTrack audioOverlayTrack, boolean z) {
        this.A00 = clipsAudioMixingDrawerController;
        this.A01 = audioOverlayTrack;
        this.A02 = z;
    }

    @Override // X.InterfaceC58033PoJ
    public final void DUJ() {
        ClipsAudioMixingDrawerController clipsAudioMixingDrawerController = this.A00;
        C8BE c8be = (C8BE) clipsAudioMixingDrawerController.A0L.getValue();
        AudioOverlayTrack audioOverlayTrack = this.A01;
        if (this.A02) {
            c8be.A05.A0b(new C8ZT(audioOverlayTrack), false);
        } else {
            c8be.A05.A0Z(new C8ZT(audioOverlayTrack), null, false);
        }
        C8BE.A00(c8be, true);
        AbstractC183338Bg.A00(clipsAudioMixingDrawerController.A0F).A03();
    }
}
