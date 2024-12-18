package X;

import android.app.Activity;
import android.os.Bundle;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import com.instagram.modal.ModalActivity;

/* renamed from: X.F4t, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34143F4t {
    public static final void A00(Activity activity, UserSession userSession, EnumC33364Eox enumC33364Eox, String str, String str2, String str3) {
        Bundle A0b = AbstractC166987dD.A0b();
        if (str != null) {
            A0b.putString("surface", "daily_prompt");
            A0b.putString("collection_id", str2);
            A0b.putString(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str);
            A0b.putString("message_id", str3);
            AbstractC43826JZo.A01(A0b, AbstractC1345466e.A05(AbstractC31171DnF.A0N(str)), "DirectStoryViewerFragment.ARGUMENTS_THREAD_KEY");
            A0b.putSerializable("prompts_entry_point", enumC33364Eox);
            C6XJ A0L = AbstractC31171DnF.A0L(activity, A0b, userSession, ModalActivity.class, "direct_card_gallery");
            A0L.A00 = 1;
            A0L.A0H = false;
            A0L.A07();
            A0L.A0C(activity);
        }
    }
}
