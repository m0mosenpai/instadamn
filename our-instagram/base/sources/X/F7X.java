package X;

import com.instagram.common.session.UserSession;
import java.util.Locale;

/* loaded from: classes6.dex */
public abstract class F7X {
    public static final void A00(UserSession userSession) {
        Locale A02 = C1Q2.A02();
        "bio_translation_button_tapped".getClass();
        C19280xC A01 = C19280xC.A01("bio_translation_button_tapped", null);
        A01.A0C("locale", A02.getDisplayName());
        AbstractC31173DnH.A1S(A01, userSession);
    }
}
