package X;

import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.music.common.model.DownloadedTrack;
import com.instagram.music.common.model.MusicDataSource;

/* renamed from: X.AkG, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23981AkG implements BCw {
    public final /* synthetic */ C189788ax A00;
    public final /* synthetic */ AudioOverlayTrack A01;

    @Override // X.BCw
    public final void DBi(DownloadedTrack downloadedTrack) {
        C14360o3.A0B(downloadedTrack, 0);
        C189788ax c189788ax = this.A00;
        c189788ax.A0I.setLoadingStatus(MY0.A03);
        c189788ax.A0A.setVisibility(8);
        if (c189788ax.A03 == null) {
            C189788ax.A06(c189788ax);
            return;
        }
        AudioOverlayTrack audioOverlayTrack = this.A01;
        audioOverlayTrack.A06 = downloadedTrack;
        android.net.Uri A0I = AbstractC167007dF.A0I(downloadedTrack.A02);
        if (C189788ax.A0F(c189788ax)) {
            C189788ax.A0A(c189788ax, audioOverlayTrack);
            return;
        }
        C8GD c8gd = c189788ax.A03;
        if (c8gd != null) {
            MusicDataSource A00 = AbstractC23129AMi.A00(c8gd.BVf());
            A00.A00 = A0I;
            c189788ax.A0J.EZL(A00, true);
        }
        c189788ax.A0J.EZO(audioOverlayTrack.A02);
        C189788ax.A05(c189788ax);
    }

    public C23981AkG(C189788ax c189788ax, AudioOverlayTrack audioOverlayTrack) {
        this.A00 = c189788ax;
        this.A01 = audioOverlayTrack;
    }

    @Override // X.BCw
    public final void DBk() {
        C189788ax c189788ax = this.A00;
        c189788ax.A0I.setLoadingStatus(MY0.A03);
        c189788ax.A0A.setVisibility(8);
        C9GR.A0F(c189788ax.A09.getContext(), "music_track_download_failed", 2131968064);
        C189788ax.A06(c189788ax);
    }
}
