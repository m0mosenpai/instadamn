package X;

import android.os.Bundle;
import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class N8J extends C52776NXh {
    public static final String __redex_internal_original_name = "RageshakeBottomSheetSuggestUpdateFragment";

    @Override // X.C52776NXh, X.AbstractC33235ElU, X.AbstractC60672pq, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(665948375);
        super.onCreate(bundle);
        if (getSession() instanceof UserSession) {
            AbstractC18680vv session = getSession();
            AbstractC31171DnF.A1Q(session);
            if (C1C0.A00((UserSession) session)) {
                C0f9.A09(759044167, A02);
                return;
            }
        }
        IllegalStateException A14 = AbstractC166987dD.A14("this screen should only be visible to employees after log in");
        C0f9.A09(-1708710855, A02);
        throw A14;
    }
}
