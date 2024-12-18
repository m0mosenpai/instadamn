package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.archive.fragment.ArchiveReelFragment;
import com.instagram.archive.fragment.InlineAddHighlightFragment;
import com.instagram.archive.intf.ArchivePendingUpload;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.creation.capture.quickcapture.postcreation.IngestSessionShim;

/* renamed from: X.Odj, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC55178Odj {
    public static final C55122Obj A01(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        C55122Obj c55122Obj = (C55122Obj) userSession.A01(C55122Obj.class, new C57089PUc(userSession, 1));
        C14360o3.A07(c55122Obj);
        return c55122Obj;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [androidx.fragment.app.Fragment, com.instagram.archive.fragment.InlineAddHighlightFragment, X.3Mt] */
    public static final InlineAddHighlightFragment A02(ArchivePendingUpload archivePendingUpload, IngestSessionShim ingestSessionShim, String str) {
        AbstractC25230BEn.A15(1, str, archivePendingUpload);
        ?? abstractC72463Mt = new AbstractC72463Mt();
        AbstractC25227BEk.A1C(abstractC72463Mt, new C09530e4[]{AbstractC166987dD.A1L("IgSessionManager.SESSION_TOKEN_KEY", str), AbstractC166987dD.A1L("InlineAddHighlightFragment.ARG_CAPTURED_MEDIA_FILE_PATH", archivePendingUpload.A03), AbstractC166987dD.A1L("InlineAddHighlightFragment.ARG_CAPTURED_MEDIA_IS_VIDEO", Boolean.valueOf(archivePendingUpload.A05)), AbstractC166987dD.A1L("initial_selected_media_width", Integer.valueOf(archivePendingUpload.A02)), AbstractC166987dD.A1L("initial_selected_media_height", Integer.valueOf(archivePendingUpload.A00)), AbstractC166987dD.A1L("InlineAddHighlightsFragment.ARG_MEDIA_ROTATION_DEGREES", Integer.valueOf(archivePendingUpload.A01)), AbstractC166987dD.A1L("InlineAddHighlightsFragment.ARG_IS_MEDIA_MIRRORED", Boolean.valueOf(archivePendingUpload.A04)), AbstractC166987dD.A1L("is_in_story_creation_flow_tray", true), AbstractC166987dD.A1L("InlineAddHighlightsFragment.ARG_INGEST_SESSION", ingestSessionShim), AbstractC166987dD.A1L("should_request_highlight_tray", true), AbstractC166987dD.A1L("default_new_highlight_title", null)});
        return abstractC72463Mt;
    }

    public static final C26822Bsk A04(String str) {
        C14360o3.A0B(str, 0);
        C26822Bsk c26822Bsk = new C26822Bsk();
        AbstractC25233BEq.A15(c26822Bsk, "IgSessionManager.SESSION_TOKEN_KEY", str);
        return c26822Bsk;
    }

    public static final void A05(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        C35126FeT A00 = C35126FeT.A00(userSession);
        synchronized (A00) {
            A00.A01 = null;
            A00.A02.clear();
            A00.A03.clear();
            A00.A04.clear();
            A00.A05.clear();
        }
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [androidx.fragment.app.Fragment, com.instagram.archive.fragment.InlineAddHighlightFragment, X.3Mt] */
    public static final InlineAddHighlightFragment A03(ImageUrl imageUrl, C3G2 c3g2, String str, String str2) {
        ?? abstractC72463Mt = new AbstractC72463Mt();
        abstractC72463Mt.setArguments(AbstractC167027dH.A09("reel_viewer_source", c3g2, AbstractC166987dD.A1L("IgSessionManager.SESSION_TOKEN_KEY", str), AbstractC166987dD.A1L("current_reel_item_media_id", str2), AbstractC166987dD.A1L("initial_selected_media_url", imageUrl)));
        return abstractC72463Mt;
    }

    public static final Fragment A00(Bundle bundle, UserSession userSession) {
        Fragment archiveReelFragment;
        if (C18U.A06(AbstractC166997dE.A0U(userSession), userSession, 36316851885707975L)) {
            archiveReelFragment = new N6I();
        } else {
            archiveReelFragment = new ArchiveReelFragment();
        }
        Fragment fragment = archiveReelFragment;
        fragment.setArguments(bundle);
        return fragment;
    }
}
