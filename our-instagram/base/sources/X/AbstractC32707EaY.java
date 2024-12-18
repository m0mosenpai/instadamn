package X;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import com.facebook.tigon.tigonhuc.HucClient;
import com.instagram.direct.fragment.permanentmedia.DirectAggregatedMediaViewerController;
import com.instagram.direct.fragment.permanentmedia.MediaViewerReplyBarEligibilityChecker;
import com.instagram.model.direct.DirectThreadKey;
import java.util.List;

/* renamed from: X.EaY, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC32707EaY extends EOJ implements InterfaceC60442pS {
    public static final String __redex_internal_original_name = "DirectMediaCardGalleryBaseFragment";
    public DirectAggregatedMediaViewerController A00;
    public MediaViewerReplyBarEligibilityChecker A01;
    public List A02 = AbstractC166987dD.A1E();

    @Override // X.InterfaceC60442pS
    public final boolean isOrganicEligible() {
        return true;
    }

    @Override // X.InterfaceC60442pS
    public final boolean isSponsoredEligible() {
        return false;
    }

    @Override // X.EOJ, X.AbstractC43842Ja5, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        String str;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        Bundle bundle2 = this.mArguments;
        String str2 = null;
        if (bundle2 != null) {
            str = bundle2.getString("surface");
        } else {
            str = null;
        }
        Bundle bundle3 = this.mArguments;
        if (bundle3 != null) {
            str2 = bundle3.getString("message_id");
        }
        C3o9 A00 = AbstractC43826JZo.A00(requireArguments(), "DirectStoryViewerFragment.ARGUMENTS_THREAD_KEY");
        if (A00 != null) {
            DirectThreadKey A01 = JRE.A01(A00);
            C14360o3.A0B(A01, 0);
            this.A0C = A01;
            AbstractC31174DnI.A1E(this, A0E().A03, new MI9(this, str2, str, 8), 11);
            return;
        }
        throw AbstractC31172DnG.A0t();
    }

    public final boolean A0N() {
        DirectAggregatedMediaViewerController directAggregatedMediaViewerController = this.A00;
        if (directAggregatedMediaViewerController != null) {
            return directAggregatedMediaViewerController.A0l();
        }
        C14360o3.A0F("directAggregatedMediaViewerController");
        throw C00O.createAndThrow();
    }

    @Override // X.EOJ, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        MediaViewerReplyBarEligibilityChecker mediaViewerReplyBarEligibilityChecker;
        int A02 = C0f9.A02(1801388991);
        super.onCreate(bundle);
        Parcelable parcelable = requireArguments().getParcelable("DirectThreadSharedMediaFragment.DIRECT_MEDIA_REPLY_ELIGIBILITY_CHECKER");
        if ((parcelable instanceof MediaViewerReplyBarEligibilityChecker) && (mediaViewerReplyBarEligibilityChecker = (MediaViewerReplyBarEligibilityChecker) parcelable) != null) {
            this.A01 = mediaViewerReplyBarEligibilityChecker;
            boolean z = false;
            DirectAggregatedMediaViewerController directAggregatedMediaViewerController = new DirectAggregatedMediaViewerController(requireActivity(), AbstractC166987dD.A0r(this.A0S), null, HucClient.BODY_UPLOAD_TIMEOUT_SECONDS, z, z);
            this.A00 = directAggregatedMediaViewerController;
            registerLifecycleListener(directAggregatedMediaViewerController);
            DirectAggregatedMediaViewerController directAggregatedMediaViewerController2 = this.A00;
            if (directAggregatedMediaViewerController2 != null) {
                directAggregatedMediaViewerController2.A0b = C37051GUh.A00(this, 26);
                C0f9.A09(-1984193037, A02);
                return;
            } else {
                C14360o3.A0F("directAggregatedMediaViewerController");
                throw C00O.createAndThrow();
            }
        }
        IllegalArgumentException A12 = AbstractC166987dD.A12("DIRECT_SHARED_MEDIA_REPLY_ELIGIBILITY_CHECKER arg is not specified");
        C0f9.A09(771425587, A02);
        throw A12;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public void onDestroyView() {
        int A02 = C0f9.A02(-763005889);
        super.onDestroyView();
        F2D.A00(AbstractC166987dD.A0r(this.A0S)).A0A();
        C0f9.A09(-109253875, A02);
    }
}
