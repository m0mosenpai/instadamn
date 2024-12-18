package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import com.instagram.modal.ModalActivity;

/* renamed from: X.G2d, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36351G2d implements GXW {
    public final UserSession A00;
    public final G4N A01;

    public C36351G2d(UserSession userSession, G4N g4n) {
        C14360o3.A0B(g4n, 1);
        this.A01 = g4n;
        this.A00 = userSession;
    }

    @Override // X.GXW
    public final boolean CoA(android.net.Uri uri, C32051E6d c32051E6d) {
        C14360o3.A0B(uri, 0);
        if (!"direct_daily_prompt_submissions".equalsIgnoreCase(uri.getHost())) {
            return false;
        }
        G4N g4n = this.A01;
        String queryParameter = uri.getQueryParameter("collection_id");
        String queryParameter2 = uri.getQueryParameter(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID);
        String queryParameter3 = uri.getQueryParameter("subtitle_text");
        Bundle A0D = AbstractC31177DnL.A0D("collection_id", queryParameter, ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, queryParameter2);
        A0D.putString("card_gallery_collection_title", queryParameter3);
        AbstractC43826JZo.A01(A0D, (C3o9) AbstractC31172DnG.A0y(g4n.A0C), "DirectStoryViewerFragment.ARGUMENTS_THREAD_KEY");
        InterfaceC08830cm interfaceC08830cm = g4n.A08;
        InterfaceC163837Ux A0X = AbstractC31176DnK.A0X(interfaceC08830cm);
        FragmentActivity fragmentActivity = g4n.A00;
        A0D.putParcelable("DirectThreadSharedMediaFragment.DIRECT_SHARED_MEDID_SHARED_TARGET", C0B1.A00(A0X.C7f(fragmentActivity)));
        C81543kP Bj4 = AbstractC31176DnK.A0X(interfaceC08830cm).Bj4();
        int A00 = AbstractC31172DnG.A00(AbstractC31176DnK.A0X(interfaceC08830cm));
        UserSession userSession = g4n.A03;
        A0D.putString("channel_user_type", C160857It.A00(Bj4, userSession.userId, A00));
        A0D.putString("card_gallery_entry_point", "channel_daily_prompt_xma");
        C6XJ A0L = AbstractC31171DnF.A0L(fragmentActivity, A0D, userSession, ModalActivity.class, AbstractC111324zv.A00(876));
        A0L.A00 = 1;
        A0L.A0H = false;
        A0L.A07();
        A0L.A0C(fragmentActivity);
        return true;
    }
}
