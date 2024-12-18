package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;

/* renamed from: X.Fcn, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC35076Fcn {
    public static final void A00(InterfaceC11380iw interfaceC11380iw, UserSession userSession, String str) {
        C19280xC A00 = C19280xC.A00(interfaceC11380iw, str);
        if (userSession != null) {
            AbstractC31173DnH.A1S(A00, userSession);
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    public static final void A01(InterfaceC11380iw interfaceC11380iw, UserSession userSession, String str) {
        C19280xC A00 = C19280xC.A00(interfaceC11380iw, str);
        A00.A0C(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "is_all");
        if (userSession != null) {
            AbstractC31173DnH.A1S(A00, userSession);
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    public static final void A02(InterfaceC11380iw interfaceC11380iw, UserSession userSession, String str, String str2, boolean z) {
        C19280xC A00 = C19280xC.A00(interfaceC11380iw, str);
        A00.A09("sso_enabled", Boolean.valueOf(z));
        A00.A0C(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, str2);
        A00.A0C("app_device_id", AbstractC31174DnI.A0s());
        if (userSession != null) {
            AbstractC31173DnH.A1S(A00, userSession);
            return;
        }
        throw AbstractC166997dE.A0g();
    }
}
