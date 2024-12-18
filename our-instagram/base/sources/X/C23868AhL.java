package X;

import com.instagram.creation.capture.quickcapture.sundial.ClipsAudioMixingDrawerController;
import com.instagram.music.common.model.AudioOverlayTrack;

/* renamed from: X.AhL, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23868AhL implements InterfaceC58033PoJ {
    public final /* synthetic */ ClipsAudioMixingDrawerController A00;
    public final /* synthetic */ AudioOverlayTrack A01;

    public C23868AhL(ClipsAudioMixingDrawerController clipsAudioMixingDrawerController, AudioOverlayTrack audioOverlayTrack) {
        this.A00 = clipsAudioMixingDrawerController;
        this.A01 = audioOverlayTrack;
    }

    @Override // X.InterfaceC58033PoJ
    public final void DUI(String str) {
        ((C8BE) this.A00.A0L.getValue()).A05.A0Y(C193588hd.A00);
    }

    @Override // X.InterfaceC58033PoJ
    public final void DUJ() {
        ((C8BE) this.A00.A0L.getValue()).A05.A0Y(new C8ZT(this.A01));
    }
}
