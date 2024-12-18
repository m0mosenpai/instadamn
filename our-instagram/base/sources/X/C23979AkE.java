package X;

import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.music.common.model.MusicAssetModel;

/* renamed from: X.AkE, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23979AkE implements JHD {
    public final /* synthetic */ C8JT A00;
    public final /* synthetic */ AudioOverlayTrack A01;

    @Override // X.JHD
    public final void DBj(MusicAssetModel musicAssetModel) {
        C14360o3.A0B(musicAssetModel, 0);
        AudioOverlayTrack audioOverlayTrack = this.A01;
        audioOverlayTrack.A00(musicAssetModel);
        C8JT c8jt = this.A00;
        c8jt.A1n.A0b(new C8ZT(audioOverlayTrack), false);
        C8JT.A0X(c8jt);
    }

    public C23979AkE(C8JT c8jt, AudioOverlayTrack audioOverlayTrack) {
        this.A01 = audioOverlayTrack;
        this.A00 = c8jt;
    }

    @Override // X.JHD
    public final void DBk() {
        C8JT c8jt = this.A00;
        if (c8jt.A0l) {
            C9GR.A0F(c8jt.A11, "music_track_not_available", 2131968067);
            C8JT.A0b(c8jt);
            c8jt.A1h.A04();
        }
    }
}
