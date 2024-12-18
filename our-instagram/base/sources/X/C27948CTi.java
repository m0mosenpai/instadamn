package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;
import com.instagram.modal.ModalActivity;

/* renamed from: X.CTi, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27948CTi {
    public final UserSession A00;
    public final String A01;

    public final void A00(Activity activity) {
        UserSession userSession = this.A00;
        C6XJ c6xj = new C6XJ(activity, AbstractC31364DqT.A03().A01.A01(userSession, AbstractC31402Dr6.A02(userSession, this.A01, "content_notes_reply_sheet", C26750BrX.__redex_internal_original_name).A03()), userSession, ModalActivity.class, "profile");
        c6xj.A0J = ModalActivity.A08;
        c6xj.A0C(activity);
    }

    public C27948CTi(UserSession userSession, String str) {
        AbstractC167017dG.A1P(userSession, str);
        this.A00 = userSession;
        this.A01 = str;
    }
}
