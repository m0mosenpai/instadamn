package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;
import com.instagram.direct.prompts.DirectEditAddYoursParams;
import com.instagram.direct.prompts.DirectPromptTypes;
import com.instagram.model.direct.DirectThreadKey;

/* loaded from: classes6.dex */
public abstract class F3D {
    public static final void A00(Activity activity, UserSession userSession, DirectThreadKey directThreadKey, String str) {
        AbstractC167017dG.A1R(directThreadKey, str);
        android.net.Uri A0B = AbstractC25227BEk.A0B(str);
        DirectEditAddYoursParams directEditAddYoursParams = new DirectEditAddYoursParams(A0B.getQueryParameter("prompt_text"), A0B.getQueryParameter("collection_id"));
        FRk fRk = new FRk(AbstractC31171DnF.A0D("DirectEditAddYoursUriHandler"), userSession);
        String str2 = directEditAddYoursParams.A01;
        String str3 = directThreadKey.A00;
        C25531Mh A03 = C25531Mh.A03(fRk.A00);
        if (AbstractC25226BEj.A1Z(A03)) {
            A03.A0M(EnumC33511Erk.EDIT_TAPPED, "action");
            AbstractC31179DnN.A13(EnumC33506Erf.ADMIN_TEXT, A03, str2, str3);
        }
        C28531Zo.A04.A02(activity, userSession, directEditAddYoursParams, DirectPromptTypes.A0A, directThreadKey, 0, 0);
    }
}
