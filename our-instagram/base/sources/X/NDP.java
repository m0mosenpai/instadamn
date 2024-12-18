package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.autocreatedclips.repository.data.SoundSyncSuggestedAudioNetworkDataSource;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel;
import com.instagram.music.common.model.AudioOverlayTrack;
import java.util.List;

/* loaded from: classes9.dex */
public final class NDP extends AbstractC61132qb {
    public final FragmentActivity A00;
    public final UserSession A01;
    public final AudioOverlayTrack A02;
    public final List A03;

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        AbstractC193598he abstractC193598he;
        FragmentActivity fragmentActivity = this.A00;
        UserSession userSession = this.A01;
        ClipsCreationViewModel clipsCreationViewModel = (ClipsCreationViewModel) AbstractC50522MSa.A0L(fragmentActivity, userSession);
        String str = clipsCreationViewModel.A0S;
        AudioOverlayTrack audioOverlayTrack = this.A02;
        if (audioOverlayTrack == null) {
            C2GT c2gt = clipsCreationViewModel.A0K.A06;
            AbstractC193598he abstractC193598he2 = (AbstractC193598he) c2gt.A02();
            if (abstractC193598he2 != null && abstractC193598he2.A00 == 3 && (abstractC193598he = (AbstractC193598he) c2gt.A02()) != null) {
                audioOverlayTrack = (AudioOverlayTrack) abstractC193598he.A00();
            } else {
                audioOverlayTrack = null;
            }
        }
        List list = this.A03;
        SoundSyncSuggestedAudioNetworkDataSource soundSyncSuggestedAudioNetworkDataSource = new SoundSyncSuggestedAudioNetworkDataSource(userSession);
        C14360o3.A0B(userSession, 0);
        return new C51035Mgj(userSession, (OGx) userSession.A01(OGx.class, new C50151MDe(soundSyncSuggestedAudioNetworkDataSource, 24)), AnonymousClass849.A00(MSX.A06(fragmentActivity), userSession).A00(str).A00, audioOverlayTrack, list);
    }

    public NDP(FragmentActivity fragmentActivity, UserSession userSession, AudioOverlayTrack audioOverlayTrack, List list) {
        AbstractC167017dG.A1Q(userSession, list);
        this.A01 = userSession;
        this.A00 = fragmentActivity;
        this.A03 = list;
        this.A02 = audioOverlayTrack;
    }
}
