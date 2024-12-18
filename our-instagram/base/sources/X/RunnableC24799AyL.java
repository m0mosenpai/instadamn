package X;

import com.instagram.music.common.model.DownloadedTrack;
import java.util.Iterator;

/* renamed from: X.AyL, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24799AyL implements Runnable {
    public final /* synthetic */ DownloadedTrack A00;
    public final /* synthetic */ BCw A01;
    public final /* synthetic */ C8KO A02;

    public RunnableC24799AyL(DownloadedTrack downloadedTrack, BCw bCw, C8KO c8ko) {
        this.A02 = c8ko;
        this.A00 = downloadedTrack;
        this.A01 = bCw;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C8KO c8ko = this.A02;
        if (c8ko.A00) {
            AbstractC1808580n.A00();
            c8ko.A00 = false;
            DownloadedTrack downloadedTrack = this.A00;
            BCw bCw = this.A01;
            if (downloadedTrack != null) {
                bCw.DBi(downloadedTrack);
                Iterator it = c8ko.A03.iterator();
                while (it.hasNext()) {
                    ((BCw) it.next()).DBi(downloadedTrack);
                }
                return;
            }
            bCw.DBk();
            Iterator it2 = c8ko.A03.iterator();
            while (it2.hasNext()) {
                ((BCw) it2.next()).DBk();
            }
        }
    }
}
