package com.instagram.urlhandlers.directpollmessage;

import X.AbstractC111324zv;
import X.AbstractC166987dD;
import X.AbstractC25227BEk;
import X.AbstractC31171DnF;
import X.AbstractC31175DnJ;
import X.AbstractC43591JPw;
import X.C6XJ;
import android.os.Bundle;
import com.instagram.common.session.UserSession;
import com.instagram.modal.ModalActivity;
import com.instagram.modal.TransparentModalActivity;
import com.instagram.urlhandler.UserSessionUrlHandlerActivity;

/* loaded from: classes6.dex */
public final class DirectPollMessageUrlHandlerActivity extends UserSessionUrlHandlerActivity {
    @Override // com.instagram.base.activity.BaseFragmentActivity
    public final void A0j(Bundle bundle) {
    }

    public static final void A01(UserSession userSession, DirectPollMessageUrlHandlerActivity directPollMessageUrlHandlerActivity, String str, boolean z) {
        Bundle A0b = AbstractC166987dD.A0b();
        A0b.putString("bottom_sheet_content_fragment", AbstractC43591JPw.A00(146));
        A0b.putBoolean("finish_host_activity_on_dismissed", true);
        A0b.putString(AbstractC111324zv.A00(1171), AbstractC31175DnJ.A0c(AbstractC25227BEk.A0B(str).getPathSegments(), 0));
        A0b.putString(AbstractC111324zv.A00(1170), AbstractC31175DnJ.A0c(AbstractC25227BEk.A0B(str).getPathSegments(), 2));
        A0b.putBoolean(AbstractC111324zv.A00(2880), z);
        C6XJ A0L = AbstractC31171DnF.A0L(directPollMessageUrlHandlerActivity, A0b, userSession, TransparentModalActivity.class, "bottom_sheet");
        A0L.A0G = true;
        A0L.A0J = ModalActivity.A08;
        A0L.A0C(directPollMessageUrlHandlerActivity);
    }
}
