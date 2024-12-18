package X;

import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel;
import com.instagram.music.common.model.AudioOverlayTrack;

/* renamed from: X.Oye, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56269Oye implements InterfaceC58033PoJ {
    public final /* synthetic */ NIW A00;
    public final /* synthetic */ AudioOverlayTrack A01;
    public final /* synthetic */ AudioOverlayTrack A02;
    public final /* synthetic */ InterfaceC16660sJ A03;

    public C56269Oye(NIW niw, AudioOverlayTrack audioOverlayTrack, AudioOverlayTrack audioOverlayTrack2, InterfaceC16660sJ interfaceC16660sJ) {
        this.A02 = audioOverlayTrack;
        this.A00 = niw;
        this.A01 = audioOverlayTrack2;
        this.A03 = interfaceC16660sJ;
    }

    @Override // X.InterfaceC58033PoJ
    public final void DUI(String str) {
        NIW niw = this.A00;
        niw.A0D.Egh(null);
        C52434NIe c52434NIe = C52434NIe.A00;
        C141796aw A00 = AbstractC141776au.A00(niw);
        C12T c12t = C12P.A00;
        AbstractC23641Du.A05(AnonymousClass131.A00.A06(), new C57171PZp(c52434NIe, niw, (InterfaceC23621Ds) null, 12), A00);
    }

    @Override // X.InterfaceC58033PoJ
    public final void DUJ() {
        AudioOverlayTrack audioOverlayTrack = this.A02;
        NIW niw = this.A00;
        C05A c05a = niw.A0D;
        if (C14360o3.A0K(audioOverlayTrack, c05a.getValue())) {
            ClipsCreationViewModel clipsCreationViewModel = niw.A04;
            clipsCreationViewModel.A0Z(new C8ZT(audioOverlayTrack), clipsCreationViewModel.A0K.A03(this.A01.A0D), false);
            c05a.Egh(null);
            this.A03.invoke(new C8ZT(audioOverlayTrack));
        }
    }
}
