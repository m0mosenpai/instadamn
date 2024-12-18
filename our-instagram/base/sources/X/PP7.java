package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.IgImageView;
import instagram.features.clips.edit.ClipsEditMetadataController;

/* loaded from: classes9.dex */
public final class PP7 implements Runnable {
    public final /* synthetic */ ClipsEditMetadataController A00;

    public PP7(ClipsEditMetadataController clipsEditMetadataController) {
        this.A00 = clipsEditMetadataController;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ClipsEditMetadataController clipsEditMetadataController = this.A00;
        ClipsEditMetadataController.A0G(clipsEditMetadataController, false);
        IgImageView igImageView = clipsEditMetadataController.thumbnailImage;
        if (igImageView != null) {
            igImageView.setEnabled(true);
        }
        if (clipsEditMetadataController.A0S) {
            FragmentActivity requireActivity = clipsEditMetadataController.A0q.requireActivity();
            UserSession userSession = clipsEditMetadataController.A0s;
            C140966Yy A0r = AbstractC25225BEi.A0r(requireActivity, userSession);
            A0r.A0G = true;
            A0r.A08();
            String str = clipsEditMetadataController.A13;
            String valueOf = String.valueOf(clipsEditMetadataController.A0L);
            C14360o3.A0B(valueOf, 2);
            AbstractC31175DnJ.A0t(AbstractC61636Rr0.A00(AbstractC167007dF.A1b("ClipsConstants.ARG_CLIPS_SHARE_MEDIA_FILE_PATH ", valueOf, MSY.A0n(userSession), AbstractC166987dD.A1L("ClipsConstants.ARG_CLIPS_SHARE_MEDIA_ID ", str))), new NJB(), A0r);
            return;
        }
        C9GR.A0B(clipsEditMetadataController.A0n, "video_download_failed");
    }
}
