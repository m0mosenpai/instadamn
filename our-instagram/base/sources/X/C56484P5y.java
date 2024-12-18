package X;

import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.music.common.model.DownloadedTrack;

/* renamed from: X.P5y, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56484P5y implements BCw {
    public final int A00;
    public final Object A01;

    public C56484P5y(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.BCw
    public final void DBi(DownloadedTrack downloadedTrack) {
        int i = this.A00;
        C14360o3.A0B(downloadedTrack, 0);
        if (i != 0) {
            OJI oji = (OJI) this.A01;
            oji.A03.A06 = downloadedTrack;
            oji.A02.DUJ();
            return;
        }
        ((AudioOverlayTrack) this.A01).A06 = downloadedTrack;
    }

    @Override // X.BCw
    public final void DBk() {
        if (this.A00 != 0) {
            ((OJI) this.A01).A02.DUI("download track failed");
        }
    }
}
