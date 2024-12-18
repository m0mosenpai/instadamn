package X;

import android.content.Context;
import android.media.MediaPlayer;
import android.view.ViewGroup;
import com.instagram.creation.capture.quickcapture.sundial.bottomsheet.BottomSheetViewController;
import com.instagram.creation.capture.quickcapture.sundial.tts.intf.VoiceOption;

/* renamed from: X.P2w, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56409P2w implements InterfaceC199918sv {
    public final /* synthetic */ C190398bx A00;
    public final /* synthetic */ Object A01;

    public C56409P2w(C190398bx c190398bx, Object obj) {
        this.A00 = c190398bx;
        this.A01 = obj;
    }

    @Override // X.InterfaceC199918sv
    public final void onClick() {
        String str;
        C9C2 CBG;
        VoiceOption voiceOption;
        C8UK c8uk = (C8UK) this.A01;
        C190398bx c190398bx = this.A00;
        c190398bx.A04 = c8uk.A00;
        C55041OZn c55041OZn = (C55041OZn) c190398bx.A1h.get();
        C5RO c5ro = (C5RO) c190398bx.A04;
        c55041OZn.A02 = c5ro;
        BottomSheetViewController bottomSheetViewController = c55041OZn.A01;
        if (bottomSheetViewController == null) {
            Context requireContext = c55041OZn.A06.requireContext();
            ViewGroup viewGroup = c55041OZn.A05;
            if (viewGroup != null) {
                bottomSheetViewController = new BottomSheetViewController(requireContext, viewGroup, new C56276Oyl(c55041OZn), false);
                c55041OZn.A01 = bottomSheetViewController;
            } else {
                throw AbstractC166997dE.A0g();
            }
        }
        bottomSheetViewController.A03 = new NHS(c55041OZn.A02, c55041OZn.A08, new O7Q(c55041OZn, AbstractC166997dE.A0p(c55041OZn.A06.requireContext(), 2131956020)));
        BottomSheetViewController bottomSheetViewController2 = c55041OZn.A01;
        if (bottomSheetViewController2 == null) {
            C14360o3.A0F("bottomSheetViewController");
            throw C00O.createAndThrow();
        }
        bottomSheetViewController2.A02();
        MediaPlayer mediaPlayer = new MediaPlayer();
        c55041OZn.A00 = mediaPlayer;
        mediaPlayer.setOnCompletionListener(C55336Ogz.A00);
        c55041OZn.A0A.A00.A1X.F8v(true);
        if (c5ro != null && (CBG = c5ro.CBG()) != null && (voiceOption = (VoiceOption) CBG.A01) != null) {
            str = voiceOption.A00;
        } else {
            str = null;
        }
        C55041OZn.A01(c55041OZn, str);
        C22C.A08(EnumC50631MWs.A0I, AnonymousClass229.A01(c190398bx.A1J), "TEXT_TO_SPEECH", false);
    }
}
