package X;

import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.music.common.model.DownloadedTrack;

/* renamed from: X.P5z, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56485P5z implements BCw {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C55005OVm A01;
    public final /* synthetic */ AudioOverlayTrack A02;
    public final /* synthetic */ C15100pQ A03;

    @Override // X.BCw
    public final void DBi(DownloadedTrack downloadedTrack) {
        C14360o3.A0B(downloadedTrack, 0);
        AudioOverlayTrack audioOverlayTrack = this.A02;
        audioOverlayTrack.A06 = downloadedTrack;
        C55005OVm c55005OVm = this.A01;
        c55005OVm.A03.add(audioOverlayTrack);
        C15100pQ c15100pQ = this.A03;
        int i = c15100pQ.A00 + 1;
        c15100pQ.A00 = i;
        C55005OVm.A00(c55005OVm, i, this.A00);
    }

    public C56485P5z(C55005OVm c55005OVm, AudioOverlayTrack audioOverlayTrack, C15100pQ c15100pQ, int i) {
        this.A02 = audioOverlayTrack;
        this.A01 = c55005OVm;
        this.A03 = c15100pQ;
        this.A00 = i;
    }

    @Override // X.BCw
    public final void DBk() {
        C15100pQ c15100pQ = this.A03;
        int i = c15100pQ.A00 + 1;
        c15100pQ.A00 = i;
        C55005OVm.A00(this.A01, i, this.A00);
    }
}
