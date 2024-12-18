package X;

import android.os.Bundle;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import com.instagram.modal.ModalActivity;

/* renamed from: X.G2e, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36352G2e implements GXW {
    public final UserSession A00;
    public final G4N A01;

    public C36352G2e(UserSession userSession, G4N g4n) {
        C14360o3.A0B(g4n, 1);
        this.A01 = g4n;
        this.A00 = userSession;
    }

    @Override // X.GXW
    public final boolean CoA(android.net.Uri uri, C32051E6d c32051E6d) {
        C81663kb c81663kb;
        boolean A1R = AbstractC167007dF.A1R(0, uri, c32051E6d);
        if (!"direct_prompt_questions_response".equalsIgnoreCase(uri.getHost())) {
            return false;
        }
        String queryParameter = uri.getQueryParameter("collection_type");
        if (queryParameter != null) {
            AbstractC34064F1r.A00(this.A00, C7D2.A01(queryParameter));
        }
        G4N g4n = this.A01;
        String queryParameter2 = uri.getQueryParameter("collection_type");
        String queryParameter3 = uri.getQueryParameter("collection_id");
        String queryParameter4 = uri.getQueryParameter(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID);
        String queryParameter5 = uri.getQueryParameter("subtitle_text");
        String queryParameter6 = uri.getQueryParameter("seed_message_sender_id");
        String str = c32051E6d.A08;
        String str2 = c32051E6d.A07;
        String str3 = c32051E6d.A09;
        Bundle A0b = AbstractC166987dD.A0b();
        A0b.putString("surface", queryParameter2);
        A0b.putString("collection_id", queryParameter3);
        A0b.putString(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, queryParameter4);
        A0b.putString("seed_message_sender_id", queryParameter6);
        A0b.putString("message_id", str);
        A0b.putString("client_context", str2);
        A0b.putString("card_gallery_sender_id", str3);
        A0b.putString("card_gallery_collection_title", queryParameter5);
        AbstractC43826JZo.A01(A0b, (C3o9) AbstractC31172DnG.A0y(g4n.A0C), "DirectStoryViewerFragment.ARGUMENTS_THREAD_KEY");
        A0b.putString("DirectFragment.ENTRY_POINT", "XMA");
        UserSession userSession = g4n.A03;
        C2DS A00 = AbstractC28761aE.A00(userSession);
        if (queryParameter4 != null) {
            c81663kb = AbstractC31172DnG.A0h(A00, queryParameter4);
        } else {
            c81663kb = null;
        }
        if (C14360o3.A0K(queryParameter2, "questions") && c81663kb != null) {
            C7FP.A00(g4n.A02, userSession).A05(C7D2.A01(queryParameter2), c81663kb.C7I(), c81663kb.C7q(), c81663kb.C7g(), c81663kb.AdZ());
        }
        AbstractC31177DnL.A0n(g4n.A00, A0b, userSession, ModalActivity.class, AbstractC111324zv.A00(2267));
        return A1R;
    }
}
