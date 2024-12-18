package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import com.instagram.modal.TransparentModalActivity;

/* loaded from: classes6.dex */
public abstract class FC9 {
    public static final void A00(android.net.Uri uri, FragmentActivity fragmentActivity, UserSession userSession) {
        boolean A1b = AbstractC25233BEq.A1b(uri, fragmentActivity, userSession);
        String queryParameter = uri.getQueryParameter("thread_igid");
        if (queryParameter != null) {
            String A0X = AbstractC31175DnJ.A0X(uri, "invite_id");
            String queryParameter2 = uri.getQueryParameter("fan_club_id");
            if (queryParameter2 != null) {
                String queryParameter3 = uri.getQueryParameter("origin");
                if (A0X.length() > 0) {
                    AbstractC31181DnP.A0Z(C28531Zo.A04.A02.A09(null, null, false), fragmentActivity, userSession);
                }
                C6XJ A0L = AbstractC31171DnF.A0L(fragmentActivity, AbstractC61636Rr0.A00(AbstractC166987dD.A1L("bottom_sheet_content_fragment", AbstractC111324zv.A00(2260)), AbstractC166987dD.A1L(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, queryParameter), AbstractC166987dD.A1L("invite_id", A0X), AbstractC166987dD.A1L("fan_club_id", queryParameter2), AbstractC166987dD.A1L("origin", queryParameter3)), userSession, TransparentModalActivity.class, "bottom_sheet");
                A0L.A0G = A1b;
                A0L.A0C(fragmentActivity);
                return;
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
        throw AbstractC166987dD.A14("Required value was null.");
    }
}
