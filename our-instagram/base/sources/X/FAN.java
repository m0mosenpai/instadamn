package X;

import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.editphonenumber.EditPhoneNumberView;

/* loaded from: classes6.dex */
public abstract class FAN {
    public static final C34515FJb A00(UserSession userSession, EditPhoneNumberView editPhoneNumberView) {
        C34515FJb c34515FJb = null;
        if (editPhoneNumberView.getTag() != null && !(editPhoneNumberView.getTag() instanceof C34515FJb)) {
            AbstractC31546DtW.A00(userSession, C05F.A0j, AnonymousClass001.A0R("EditPhoneNumberView tag used unexpectedly: ", editPhoneNumberView.getTag().getClass().getName()), null);
        } else {
            Object tag = editPhoneNumberView.getTag();
            if (!(tag instanceof C34515FJb) || (c34515FJb = (C34515FJb) tag) == null) {
                C34515FJb c34515FJb2 = new C34515FJb();
                editPhoneNumberView.setTag(c34515FJb2);
                return c34515FJb2;
            }
        }
        return c34515FJb;
    }
}
