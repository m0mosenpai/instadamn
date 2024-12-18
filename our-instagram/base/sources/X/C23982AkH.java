package X;

import android.util.LruCache;
import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.music.common.model.DownloadedTrack;

/* renamed from: X.AkH, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23982AkH implements BCw {
    public final /* synthetic */ ABW A00;
    public final /* synthetic */ AudioOverlayTrack A01;
    public final /* synthetic */ InterfaceC24901Jp A02;

    @Override // X.BCw
    public final void DBi(DownloadedTrack downloadedTrack) {
        C14360o3.A0B(downloadedTrack, 0);
        LruCache lruCache = this.A00.A02;
        AudioOverlayTrack audioOverlayTrack = this.A01;
        lruCache.put(audioOverlayTrack, downloadedTrack);
        audioOverlayTrack.A06 = downloadedTrack;
        this.A02.resumeWith(new C3NX(audioOverlayTrack));
    }

    public C23982AkH(ABW abw, AudioOverlayTrack audioOverlayTrack, InterfaceC24901Jp interfaceC24901Jp) {
        this.A00 = abw;
        this.A01 = audioOverlayTrack;
        this.A02 = interfaceC24901Jp;
    }

    @Override // X.BCw
    public final void DBk() {
        this.A02.resumeWith(new C194848jk(C0eB.A00));
    }
}
