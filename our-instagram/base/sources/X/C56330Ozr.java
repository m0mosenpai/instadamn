package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.model.creation.MediaCaptureConfig;
import com.instagram.music.common.model.AudioOverlayTrack;
import java.util.List;

/* renamed from: X.Ozr, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56330Ozr implements MOW {
    public final /* synthetic */ NJK A00;

    public C56330Ozr(NJK njk) {
        this.A00 = njk;
    }

    @Override // X.MOW
    public final void Dun(AudioOverlayTrack audioOverlayTrack) {
        MediaCaptureConfig mediaCaptureConfig;
        C51754Mtd A00;
        NJK njk = this.A00;
        Context requireContext = njk.A0G.requireContext();
        InterfaceC189598ae interfaceC189598ae = njk.A08().A03;
        C47Z c47z = njk.A08().A00;
        UserSession userSession = njk.A0I;
        List FDe = njk.A07().FDe();
        AnonymousClass840 anonymousClass840 = njk.A00;
        if (anonymousClass840 != null) {
            AnonymousClass841 anonymousClass841 = anonymousClass840.A00;
            if (anonymousClass841 != null) {
                mediaCaptureConfig = ((MX5) anonymousClass841).A01.A09;
            } else {
                mediaCaptureConfig = null;
            }
            String str = njk.A0M;
            AbstractC50867Mdy A05 = njk.A05();
            C14360o3.A0C(A05, "null cannot be cast to non-null type com.instagram.creation.publishscreen.viewmodel.FeedPublishScreenViewModel");
            C51754Mtd A03 = NJQ.A03((NJQ) A05);
            boolean z = true;
            if (A03 == null || !AbstractC55179Odk.A04(A03)) {
                z = false;
            }
            OY2.A00(requireContext, userSession, mediaCaptureConfig, audioOverlayTrack, c47z, interfaceC189598ae, str, FDe, !z, false);
            AbstractC50867Mdy A052 = njk.A05();
            C14360o3.A0C(A052, "null cannot be cast to non-null type com.instagram.creation.publishscreen.viewmodel.FeedPublishScreenViewModel");
            C52467NJl c52467NJl = ((NJQ) A052).A06;
            A00 = C51754Mtd.A00(null, null, null, null, null, null, null, null, null, null, null, null, c52467NJl.A04(), null, null, audioOverlayTrack, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -32769, 262143, false, false, false, false, false, false, false, false, false, false, false, false, false);
            c52467NJl.A07(A00);
            return;
        }
        C14360o3.A0F("cameraSession");
        throw C00O.createAndThrow();
    }
}
