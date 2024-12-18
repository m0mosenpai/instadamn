package X;

import com.facebook.videolite.transcoder.base.composition.MediaComposition;
import instagram.features.clips.viewer.video.ClipsMidcardVirtualVideoPlayerController;

/* renamed from: X.Iq4, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42403Iq4 implements InterfaceC50452MPg {
    public final /* synthetic */ ClipsMidcardVirtualVideoPlayerController A00;

    public C42403Iq4(ClipsMidcardVirtualVideoPlayerController clipsMidcardVirtualVideoPlayerController) {
        this.A00 = clipsMidcardVirtualVideoPlayerController;
    }

    @Override // X.InterfaceC50452MPg
    public final void D8I(String str) {
        AbstractC166987dD.A1T(C18950wb.A01, AnonymousClass001.A0R("ClipsMidcardVirtualVideoPlayerController: failed to generate pending media from draft. failure message is: ", MSV.A00(92)), 817892914);
    }

    @Override // X.InterfaceC50452MPg
    public final void D8J(C47Z c47z) {
        MediaComposition mediaComposition = c47z.A0r;
        if (mediaComposition == null) {
            AbstractC166987dD.A1T(C18950wb.A01, "ClipsMidcardVirtualVideoPlayerController: generated draft mediaComposition is null", 817892914);
            return;
        }
        try {
            mediaComposition.A0A();
            ClipsMidcardVirtualVideoPlayerController clipsMidcardVirtualVideoPlayerController = this.A00;
            C41114IIf c41114IIf = clipsMidcardVirtualVideoPlayerController.midcardPlayerManager;
            if (c41114IIf == null) {
                C14360o3.A0F("midcardPlayerManager");
                throw C00O.createAndThrow();
            }
            ViewOnKeyListenerC55334Ogx viewOnKeyListenerC55334Ogx = c41114IIf.A00;
            if (viewOnKeyListenerC55334Ogx != null) {
                viewOnKeyListenerC55334Ogx.A01(mediaComposition);
            }
            clipsMidcardVirtualVideoPlayerController.A00 = true;
            AbstractC37302Gc3.A1P(clipsMidcardVirtualVideoPlayerController.A05);
        } catch (J6R e) {
            C18950wb c18950wb = C18950wb.A01;
            StringBuilder A1C = AbstractC166987dD.A1C();
            A1C.append("ClipsMidcardVirtualVideoPlayerController: draft VVP failed, error: ");
            AbstractC166987dD.A1T(c18950wb, AbstractC166997dE.A0v(e.getStackTrace(), A1C), 817892914);
        }
    }
}
