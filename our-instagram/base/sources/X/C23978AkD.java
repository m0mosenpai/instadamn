package X;

import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.music.common.model.MusicAssetModel;

/* renamed from: X.AkD, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23978AkD implements JHD {
    public final /* synthetic */ C189788ax A00;
    public final /* synthetic */ AudioOverlayTrack A01;

    @Override // X.JHD
    public final void DBj(MusicAssetModel musicAssetModel) {
        C14360o3.A0B(musicAssetModel, 0);
        AudioOverlayTrack audioOverlayTrack = this.A01;
        audioOverlayTrack.A00(musicAssetModel);
        C189788ax.A09(this.A00, audioOverlayTrack);
    }

    public C23978AkD(C189788ax c189788ax, AudioOverlayTrack audioOverlayTrack) {
        this.A01 = audioOverlayTrack;
        this.A00 = c189788ax;
    }

    @Override // X.JHD
    public final void DBk() {
        C189788ax c189788ax = this.A00;
        C9GR.A0F(c189788ax.A09.getContext(), "music_track_not_available", 2131968067);
        C189788ax.A06(c189788ax);
    }
}
