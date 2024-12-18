package X;

import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.music.common.model.MusicAssetModel;
import java.util.List;

/* renamed from: X.P5w, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56482P5w implements JHD {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C55005OVm A01;
    public final /* synthetic */ AudioOverlayTrack A02;
    public final /* synthetic */ C15100pQ A03;

    @Override // X.JHD
    public final void DBj(MusicAssetModel musicAssetModel) {
        C14360o3.A0B(musicAssetModel, 0);
        C55005OVm c55005OVm = this.A01;
        List list = c55005OVm.A03;
        AudioOverlayTrack audioOverlayTrack = this.A02;
        list.add(audioOverlayTrack);
        C15100pQ c15100pQ = this.A03;
        int i = c15100pQ.A00 + 1;
        c15100pQ.A00 = i;
        audioOverlayTrack.A00(musicAssetModel);
        C55005OVm.A00(c55005OVm, i, this.A00);
    }

    public C56482P5w(C55005OVm c55005OVm, AudioOverlayTrack audioOverlayTrack, C15100pQ c15100pQ, int i) {
        this.A01 = c55005OVm;
        this.A02 = audioOverlayTrack;
        this.A03 = c15100pQ;
        this.A00 = i;
    }

    @Override // X.JHD
    public final void DBk() {
        C15100pQ c15100pQ = this.A03;
        int i = c15100pQ.A00 + 1;
        c15100pQ.A00 = i;
        C55005OVm.A00(this.A01, i, this.A00);
    }
}
