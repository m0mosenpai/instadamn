package X;

import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.music.common.model.MusicAssetModel;

/* renamed from: X.P5x, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56483P5x implements JHD {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C56485P5z A01;
    public final /* synthetic */ C55005OVm A02;
    public final /* synthetic */ AudioOverlayTrack A03;
    public final /* synthetic */ C15100pQ A04;

    @Override // X.JHD
    public final void DBj(MusicAssetModel musicAssetModel) {
        C14360o3.A0B(musicAssetModel, 0);
        AudioOverlayTrack audioOverlayTrack = this.A03;
        audioOverlayTrack.A00(musicAssetModel);
        C55005OVm c55005OVm = this.A02;
        new C8KO(c55005OVm.A01, c55005OVm.A02, new C189848b3(), 0).A03(audioOverlayTrack, this, this.A01, c55005OVm.A00, false, false);
    }

    public C56483P5x(C56485P5z c56485P5z, C55005OVm c55005OVm, AudioOverlayTrack audioOverlayTrack, C15100pQ c15100pQ, int i) {
        this.A03 = audioOverlayTrack;
        this.A02 = c55005OVm;
        this.A01 = c56485P5z;
        this.A04 = c15100pQ;
        this.A00 = i;
    }

    @Override // X.JHD
    public final void DBk() {
        C15100pQ c15100pQ = this.A04;
        int i = c15100pQ.A00 + 1;
        c15100pQ.A00 = i;
        C55005OVm.A00(this.A02, i, this.A00);
    }
}
