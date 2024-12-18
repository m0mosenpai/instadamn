package X;

import com.instagram.creation.capture.quickcapture.sundial.ClipsAudioMixingDrawerController;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel;
import com.instagram.music.common.model.AudioOverlayTrack;

/* renamed from: X.8BJ, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8BJ implements C8BK {
    public final String A00;
    public final /* synthetic */ ClipsAudioMixingDrawerController A01;

    @Override // X.C8BK
    public final /* synthetic */ void DUX(boolean z) {
    }

    @Override // X.C8BK
    public final void DuZ(AudioOverlayTrack audioOverlayTrack) {
        AbstractC193598he c187398Sh;
        C14360o3.A0B(audioOverlayTrack, 0);
        ClipsAudioMixingDrawerController clipsAudioMixingDrawerController = this.A01;
        ClipsCreationViewModel clipsCreationViewModel = clipsAudioMixingDrawerController.A0K;
        if (audioOverlayTrack.A01()) {
            c187398Sh = new C8ZT(audioOverlayTrack);
        } else {
            c187398Sh = new C187398Sh(audioOverlayTrack);
        }
        clipsCreationViewModel.A0Y(c187398Sh);
        new OJI(clipsAudioMixingDrawerController.A0E.requireContext(), clipsAudioMixingDrawerController.A0F, new C23868AhL(clipsAudioMixingDrawerController, audioOverlayTrack), audioOverlayTrack).A00();
    }

    @Override // X.C8BK
    public final void Duc(AudioOverlayTrack audioOverlayTrack, AudioOverlayTrack audioOverlayTrack2) {
        AbstractC193598he c187398Sh;
        C14360o3.A0B(audioOverlayTrack, 0);
        C14360o3.A0B(audioOverlayTrack2, 1);
        if (audioOverlayTrack.equals(audioOverlayTrack2)) {
            AbstractC183338Bg.A00(this.A01.A0F).A03();
            return;
        }
        ClipsAudioMixingDrawerController clipsAudioMixingDrawerController = this.A01;
        clipsAudioMixingDrawerController.A0L.getValue();
        boolean A01 = audioOverlayTrack2.A01();
        ClipsCreationViewModel clipsCreationViewModel = clipsAudioMixingDrawerController.A0K;
        if (A01) {
            c187398Sh = new C8ZT(audioOverlayTrack2);
        } else {
            c187398Sh = new C187398Sh(audioOverlayTrack2);
        }
        clipsCreationViewModel.A0Z(c187398Sh, audioOverlayTrack, true);
        new OJI(clipsAudioMixingDrawerController.A0E.requireContext(), clipsAudioMixingDrawerController.A0F, new AhN(clipsAudioMixingDrawerController, audioOverlayTrack2, false), audioOverlayTrack2).A00();
    }

    @Override // X.C8BK
    public final void Due(AudioOverlayTrack audioOverlayTrack) {
        C14360o3.A0B(audioOverlayTrack, 0);
        Dui(audioOverlayTrack, C05F.A0C);
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0026, code lost:
    
        if (r4.A0K.A0K.A02(false) == 0) goto L9;
     */
    @Override // X.C8BK
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Dui(com.instagram.music.common.model.AudioOverlayTrack r11, java.lang.Integer r12) {
        /*
            r10 = this;
            r2 = 0
            X.C14360o3.A0B(r11, r2)
            r3 = 1
            X.C14360o3.A0B(r12, r3)
            java.lang.Integer r5 = X.C05F.A00
            if (r12 != r5) goto L12
            com.instagram.creation.capture.quickcapture.sundial.ClipsAudioMixingDrawerController r1 = r10.A01
            java.lang.String r0 = r11.A0D
            r1.A05 = r0
        L12:
            com.instagram.creation.capture.quickcapture.sundial.ClipsAudioMixingDrawerController r4 = r10.A01
            X.8BF r0 = r4.A0I
            X.8BN r1 = r0.A00
            X.8BN r0 = X.C8BN.TIMELINE_TOOLBAR_AUDIO_OPTION
            r7 = 0
            if (r1 != r0) goto L28
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r0 = r4.A0K
            com.instagram.creation.capture.quickcapture.sundial.store.ClipsAudioStore r0 = r0.A0K
            int r0 = r0.A02(r2)
            r1 = 0
            if (r0 != 0) goto L29
        L28:
            r1 = 1
        L29:
            if (r12 == r5) goto L7d
            java.lang.Integer r0 = X.C05F.A01
            if (r12 == r0) goto L31
            if (r1 == 0) goto L7d
        L31:
            r5 = 1
        L32:
            X.0do r8 = r4.A0L
            java.lang.Object r9 = r8.getValue()
            X.8BE r9 = (X.C8BE) r9
            com.instagram.music.common.model.AudioOverlayTrack r0 = r9.A01()
            r1 = 0
            if (r0 == 0) goto L7b
            java.lang.String r6 = r0.A0A
        L43:
            java.lang.String r0 = r11.A0A
            boolean r0 = X.C14360o3.A0K(r6, r0)
            if (r0 == 0) goto L7f
            com.instagram.music.common.model.AudioOverlayTrack r0 = r9.A01()
            if (r0 == 0) goto L7f
            int r6 = r0.A03
            int r0 = r11.A03
            if (r6 != r0) goto L7f
            com.instagram.music.common.model.AudioOverlayTrack r0 = r9.A01()
            if (r0 == 0) goto L7f
            int r6 = r0.A02
            int r0 = r11.A02
            if (r6 != r0) goto L7f
            com.instagram.music.common.model.AudioOverlayTrack r0 = r9.A01()
            if (r0 == 0) goto L6b
            X.8Jt r1 = r0.A05
        L6b:
            X.8Jt r0 = r11.A05
            if (r1 != r0) goto L7f
            if (r5 == 0) goto L7f
            com.instagram.common.session.UserSession r0 = r4.A0F
            X.8Bh r0 = X.AbstractC183338Bg.A00(r0)
            r0.A03()
            return
        L7b:
            r6 = r7
            goto L43
        L7d:
            r5 = 0
            goto L32
        L7f:
            r8.getValue()
            boolean r0 = r11.A01()
            if (r0 == 0) goto L9c
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r1 = r4.A0K
            X.8ZT r0 = new X.8ZT
            if (r5 == 0) goto L95
            r0.<init>(r11)
            r1.A0b(r0, r2)
            return
        L95:
            r0.<init>(r11)
            r1.A0Z(r0, r7, r2)
            return
        L9c:
            if (r5 == 0) goto Lbe
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r1 = r4.A0K
            X.8Sh r0 = new X.8Sh
            r0.<init>(r11)
            r1.A0b(r0, r3)
        La8:
            X.2oe r0 = r4.A0E
            android.content.Context r3 = r0.requireContext()
            com.instagram.common.session.UserSession r2 = r4.A0F
            X.AhN r1 = new X.AhN
            r1.<init>(r4, r11, r5)
            X.OJI r0 = new X.OJI
            r0.<init>(r3, r2, r1, r11)
            r0.A00()
            return
        Lbe:
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r2 = r4.A0K
            X.8Sh r1 = new X.8Sh
            r1.<init>(r11)
            r2.A0Z(r1, r7, r3)
            goto La8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8BJ.Dui(com.instagram.music.common.model.AudioOverlayTrack, java.lang.Integer):void");
    }

    public C8BJ(ClipsAudioMixingDrawerController clipsAudioMixingDrawerController) {
        String BVY;
        this.A01 = clipsAudioMixingDrawerController;
        AnonymousClass844 anonymousClass844 = clipsAudioMixingDrawerController.musicBrowseSessionProvider;
        this.A00 = (anonymousClass844 == null || (BVY = anonymousClass844.BVY()) == null) ? "" : BVY;
    }

    public final void A00() {
        InterfaceC1810081c interfaceC1810081c;
        C188238Vo c188238Vo;
        ClipsAudioMixingDrawerController clipsAudioMixingDrawerController = this.A01;
        if (ClipsAudioMixingDrawerController.A02(clipsAudioMixingDrawerController)) {
            interfaceC1810081c = clipsAudioMixingDrawerController.quickCaptureState;
            if (interfaceC1810081c != null) {
                c188238Vo = new C188238Vo(false);
            } else {
                return;
            }
        } else if (!clipsAudioMixingDrawerController.A06 && clipsAudioMixingDrawerController.A0K.A05 != C05F.A0C) {
            interfaceC1810081c = clipsAudioMixingDrawerController.quickCaptureState;
            if (interfaceC1810081c == null) {
                return;
            } else {
                c188238Vo = new C188238Vo(false);
            }
        } else {
            InterfaceC1810081c interfaceC1810081c2 = clipsAudioMixingDrawerController.quickCaptureState;
            if (interfaceC1810081c2 != null) {
                interfaceC1810081c2.E4u(new C188238Vo(false));
            }
            clipsAudioMixingDrawerController.A06 = false;
            return;
        }
        interfaceC1810081c.E4u(c188238Vo);
    }

    @Override // X.AnonymousClass844
    public final String BVY() {
        return this.A00;
    }

    @Override // X.C8BK
    public final void Dub(AudioOverlayTrack audioOverlayTrack, boolean z) {
        ((C8BE) this.A01.A0L.getValue()).A05(audioOverlayTrack, "audio_mixing", z);
    }
}
