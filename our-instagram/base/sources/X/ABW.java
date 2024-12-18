package X;

import android.content.Context;
import android.util.LruCache;
import com.instagram.common.session.UserSession;
import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.music.common.model.DownloadedTrack;
import com.instagram.music.common.model.MusicAssetModel;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes4.dex */
public final class ABW {
    public C8KO A00;
    public final Context A01;
    public final LruCache A02;
    public final UserSession A03;

    public final Object A00(AudioOverlayTrack audioOverlayTrack, InterfaceC23621Ds interfaceC23621Ds) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = C24891Jo.A02;
        C24891Jo c24891Jo = new C24891Jo(1, C1E2.A02(interfaceC23621Ds));
        c24891Jo.A0I();
        DownloadedTrack downloadedTrack = (DownloadedTrack) this.A02.get(audioOverlayTrack);
        if (downloadedTrack != null) {
            audioOverlayTrack.A06 = downloadedTrack;
            c24891Jo.resumeWith(new C3NX(audioOverlayTrack));
        } else {
            C8KO c8ko = new C8KO(this.A01, this.A03, new C189848b3(), 0);
            MusicAssetModel musicAssetModel = audioOverlayTrack.A08;
            if (musicAssetModel != null) {
                String str = musicAssetModel.A0H;
                if (str != null) {
                    c8ko.A04(musicAssetModel, new C23982AkH(this, audioOverlayTrack, c24891Jo), str, audioOverlayTrack.A03, audioOverlayTrack.A02, false);
                    this.A00 = c8ko;
                } else {
                    throw AbstractC166987dD.A14("Required value was null.");
                }
            } else {
                throw AbstractC166987dD.A14("Required value was null.");
            }
        }
        c24891Jo.CPA(new B8U(this, 4));
        return c24891Jo.A0E();
    }

    public ABW(Context context, UserSession userSession) {
        AbstractC167017dG.A1P(context, userSession);
        this.A01 = context;
        this.A03 = userSession;
        this.A02 = new LruCache(10);
    }
}
