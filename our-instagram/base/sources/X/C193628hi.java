package X;

import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.music.common.model.DownloadedTrack;
import com.instagram.pendingmedia.store.PendingMediaStore;
import java.io.File;

/* renamed from: X.8hi, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C193628hi {
    public final PendingMediaStore A00;

    public C193628hi(PendingMediaStore pendingMediaStore) {
        C14360o3.A0B(pendingMediaStore, 1);
        this.A00 = pendingMediaStore;
    }

    public static final Integer A00(AudioOverlayTrack audioOverlayTrack, boolean z) {
        DownloadedTrack downloadedTrack;
        if (audioOverlayTrack == null || (downloadedTrack = audioOverlayTrack.A06) == null) {
            return null;
        }
        File file = new File(downloadedTrack.A02);
        if (!file.exists()) {
            return C05F.A0C;
        }
        if (!z || file.length() > 21) {
            return null;
        }
        try {
            file.delete();
        } catch (Exception e) {
            C0K8.A0F("ClipsDraftSharingValidator", "Failed to delete invalid audio file", e);
        }
        return C05F.A0N;
    }
}
